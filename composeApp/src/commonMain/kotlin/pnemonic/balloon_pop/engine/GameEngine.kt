package pnemonic.balloon_pop.engine

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.toSize
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import pnemonic.balloon_pop.Feedback
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.Difficulty
import pnemonic.balloon_pop.model.GameState
import pnemonic.balloon_pop.model.Scene
import pnemonic.balloon_pop.model.balloon.Balloon
import pnemonic.balloon_pop.model.balloon.Bouquet
import pnemonic.balloon_pop.model.balloon.Lucky
import pnemonic.balloon_pop.model.prize.Prize
import pnemonic.balloon_pop.model.tool.Tool
import pnemonic.balloon_pop.sound.SoundType
import pnemonic.copy
import pnemonic.half
import pnemonic.removeAll
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

open class GameEngine(private val coroutineScope: CoroutineScope) : EngineCallback {
    protected val boardsFlow = MutableStateFlow(Board())
    val boards: StateFlow<Board> = boardsFlow

    private var ticker: Job? = null
    protected open val tick = TICK
    protected open val tickSpeed = TICK
    protected open val delayPerBalloon = TICK * 200
    private val _state = MutableStateFlow(GameState.NOT_STARTED)
    val state: StateFlow<GameState> = _state
    val isRunning get() = state.value.isRunning

    protected val rand = Random.Default
    private val touches = mutableListOf<Offset>()
    private val touchedBalloons = mutableListOf<Balloon>()
    private val popped = mutableListOf<Balloon>()
    private val bonusEngine: BonusEngine? = createBonusEngine()

    private val _feedback = MutableSharedFlow<Feedback>(extraBufferCapacity = 100)
    val feedback: Flow<Feedback> = _feedback

    protected open fun createBonusEngine(): BonusEngine? {
        return BonusEngine(this, coroutineScope)
    }

    fun start(difficulty: Difficulty = Difficulty.Easy) {
        ticker?.cancel()
        ticker = coroutineScope.launch(Dispatchers.Default) {
            boardsFlow.update { it.copy(difficulty = difficulty) }
            _state.update { GameState.STARTED }
            while (isActive) {
                run()
                delay(tick)
            }
        }
    }

    fun pause() {
        _state.update { GameState.PAUSED }
    }

    fun resume() {
        _state.update { GameState.RESUMED }
    }

    fun stop() {
        _state.update { GameState.STOPPED }
        ticker?.cancel()
        ticker = null
    }

    private suspend fun run() {
        if (!isRunning) return
        var board = boards.value
        if ((board.width <= 0f) || (board.height <= 0f)) {
            return
        }
        // Mo more lives -> game is done.
        val livesBefore = board.lives
        if (livesBefore <= 0) {
            finished()
            return
        }

        // No more balloons -> level is done.
        if (board.isLevelFinished()) {
            board = nextLevel(board)
        }
        board = move(board)
        board = touch(board)
        board = bonus(board)

        val livesAfter = board.lives
        if (livesAfter < livesBefore) {
            playSound(SoundType.Clang)
        }

        boardsFlow.update { board }
    }

    private fun move(board: Board): Board {
        if (board.bouquet.isEmpty()) return board
        val boardSize = board.size
        if ((boardSize.width <= 0) || (boardSize.height <= 0)) return board
        var lives = board.lives
        val balloons = board.bouquet.balloons
        val prizes = board.prizes
        val removed = mutableListOf<Balloon>()
        val removedPrizes = mutableListOf<Prize>()

        // Move balloons.
        for (balloon in balloons) {
            if (balloon.thaw(TICK)) {
                continue
            }
            if (balloon.isBadMove()) {
                if (balloon.isActive && (balloon.width < 0f || balloon.height < 0f)) {
                    // We can now attach the sprite to the screen to measure it.
                    balloon.setSize(1f, 1f)
                }
                continue
            }
            balloon.move()
            if (balloon.didEscape(boardSize)) {
                removed.add(balloon)
                if (balloon.score > 0) {
                    lives--
                }
            }
        }

        // Move prizes.
        for (prize in prizes) {
            if (prize.isBadMove()) {
                continue
            }
            prize.move()
            if (prize.didEscape(boardSize)) {
                removedPrizes.add(prize)
            }
        }

        return if (removed.isEmpty() && removedPrizes.isEmpty()) {
            board
        } else {
            val balloons = balloons.removeAll(removed)
            val prizes = prizes.removeAll(removedPrizes)
            board.copy(bouquet = Bouquet(balloons), lives = lives, prizes = prizes)
        }
    }

    fun onSize(size: IntSize) {
        onSize(size.toSize())
    }

    fun onSize(size: Size) {
        //TODO set each balloon's new destination relative to old destination
        boardsFlow.update { board ->
            board.setSize(width = size.width, height = size.height)
        }
    }

    override fun touch(balloon: Balloon) {
        if (isRunning) {
            touchedBalloons.add(balloon)
        }
    }

    fun touch(offset: Offset) {
        if (isRunning) {
            touches.add(offset)
        }
    }

    private suspend fun touch(board: Board): Board {
        if (touches.isEmpty() && touchedBalloons.isEmpty() && popped.isEmpty()) {
            return board
        }

        bonusEngine?.let {
            touchBonus(board, it)
        }

        var bouquet = board.bouquet
        var lives = board.lives
        var score = board.score

        while (touchedBalloons.isNotEmpty()) {
            val balloon = touchedBalloons.removeAt(0)

            if (balloon.isPopped || (balloon.opacity <= 0.01f)) {
                continue
            }
            balloon.hit()
            if (balloon.isPopped) {
                score += balloon.score
                if (score < 0) {
                    lives--
                }
                score = max(0, score)
                pop(balloon)
            } else {
                notifyFeedback(Feedback.Hit())
            }
        }

        if (popped.isNotEmpty()) {
            val balloons = bouquet.balloons.toMutableList()
            balloons.removeAll(popped)
            popped.clear()
            bouquet = Bouquet(balloons)
        }

        return board.copy(bouquet = bouquet, score = score, lives = lives)
    }

    // Convert balloon touches to tool touches.
    private suspend fun touchBonus(board: Board, bonusEngine: BonusEngine) {
        val tool = board.tool
        if (tool != null && !tool.isVisible && touchedBalloons.isNotEmpty()) {
            val balloons = touchedBalloons.copy()
            touchedBalloons.clear()

            for (balloon in balloons) {
                bonusEngine.onTap(
                    board,
                    Offset(balloon.left + balloon.width.half, balloon.top + balloon.height.half)
                )
            }
        }

        while (touches.isNotEmpty()) {
            val offset = touches.removeAt(0)
            bonusEngine.onTap(board, offset)
        }
    }

    fun onBalloonSize(balloon: Balloon) {
        val board = boards.value
        applyVerticalPath(balloon, board.size)
    }

    fun onPrizeSize(lucky: Lucky) {
        val board = boards.value
        if (lucky.isPopped) {
            applyDrop(lucky, board.size)
            boardsFlow.update { it.copy(prizes = it.prizes + lucky.prize) }
        }
    }

    // Vertical paths.
    // Try to keep the balloons within the screen.
    private fun applyVerticalPath(balloon: Balloon, boardSize: Size) {
        val boardWidth = boardSize.width
        val boardHeight = boardSize.height
        val balloonWidth = balloon.width
        val balloonHeight = balloon.height

        val x2 = rand.nextFloat() * boardWidth
        val x = max(0f, min(x2 - balloonWidth.half, boardWidth - balloonWidth))
        val y1 = boardHeight + (balloonHeight * 0.25f)
        val y2 = balloonHeight * -1.25f
        balloon.moveTo(x, y1)
        balloon.setDestination(x, y2)
    }

    // Prizes just drop down to earth.
    private fun applyDrop(balloon: Lucky, boardSize: Size) {
        val prize = balloon.prize
        val height = boardSize.height

        val x1 = balloon.left + (balloon.width - prize.width).half
        val y1 = balloon.top + (balloon.height - prize.height).half
        val x2 = x1
        val y2 = height
        prize.moveTo(x1, y1)
        prize.setDestination(x2, y2)
    }

    protected open fun generateBalloons(board: Board): Board {
        val bouquet = generateBouquet(board)
        var delay = 0L

        for (balloon in bouquet) {
            balloon.setTick(tickSpeed)
            balloon.freeze(delay)
            delay += delayPerBalloon
        }

        return board.copy(bouquet = bouquet)
    }

    protected open fun generateBouquet(board: Board): Bouquet {
        val level = board.level
        val difficulty = board.difficulty
        return BalloonFactory.createBouquet(level, difficulty)
    }

    private suspend fun nextLevel(board: Board): Board {
        stopSounds(board)

        val level = generateLevel(board)
        val scene = generateScene(level)
        val boardNext = generateBalloons(board.copy(level = level, scene = scene, tool = null))

        if (level > 1) {
            playSound(SoundType.Level)
        } else {
            playSound(SoundType.GameStart)
        }
        playSounds(boardNext)

        return boardNext
    }

    protected open fun generateLevel(board: Board): Int {
        return board.level + 1
    }

    protected open fun generateScene(level: Int): Scene {
        return Scene.forLevel(level)
    }

    protected open suspend fun finished() {
        println("No more lives")
        _state.update { GameState.FINISHED }
        boardsFlow.update { it.copy(bouquet = Bouquet()) }
        playSound(SoundType.GameFinish)
    }

    override suspend fun pop(balloon: Balloon) {
        notifyFeedback(Feedback.Pop(balloon.sound))
        if (balloon is Lucky) {
            notifyFeedback(Feedback.Sound(balloon.prize.sound))
        }
        coroutineScope.launch {
            delay(DELAY_DEAD_REMOVE)
            popped.add(balloon)
        }
    }

    override suspend fun notifyFeedback(feedback: Feedback) {
        _feedback.emit(feedback)
    }

    suspend fun feedbackDone() {
        notifyFeedback(Feedback.None)
    }

    private suspend fun playSounds(board: Board) {
        playMusic(board.scene)
    }

    private suspend fun playMusic(scene: Scene) {
        notifyFeedback(scene.music)
    }

    private suspend fun playSound(sound: SoundType) {
        if (sound === SoundType.None) return
        notifyFeedback(Feedback.Sound(sound))
    }

    private suspend fun stopSounds(board: Board) {
        stopMusic(board.scene)
    }

    private suspend fun stopMusic(scene: Scene) {
        notifyFeedback(Feedback.Silence(scene.music))
    }

    // Apply any bonuses
    private suspend fun bonus(board: Board): Board {
        return bonusEngine?.process(board) ?: board
    }

    fun onBonusClick(bonus: Bonus) {
        if (isRunning) {
            bonusEngine?.onClick(bonus)
        }
    }

    fun onToolUse(tool: Tool) {
        if (isRunning) {
            bonusEngine?.onUse(tool)
        }
    }

    fun clear() {
        boardsFlow.update { Board() }
        touches.clear()
        touchedBalloons.clear()
        popped.clear()
        bonusEngine?.clear()
    }

    companion object {
        private const val TICK = 5L

        // Time to show the score after balloon popped.
        private const val DELAY_DEAD_REMOVE = 1000L
    }
}