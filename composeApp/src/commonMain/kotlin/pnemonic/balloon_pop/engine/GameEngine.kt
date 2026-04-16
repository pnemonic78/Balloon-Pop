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
import kotlin.random.Random

open class GameEngine(private val coroutineScope: CoroutineScope) : EngineCallback {
    protected val _boards = MutableStateFlow(Board())
    val boards: StateFlow<Board> = _boards

    private var ticker: Job? = null
    private val _state = MutableStateFlow(GameState.NOT_STARTED)
    val state: StateFlow<GameState> = _state
    val isRunning get() = state.value.isRunning

    protected val rand = Random.Default
    private val touches = mutableListOf<Offset>()
    private val touchedBalloons = mutableListOf<Balloon>()
    private val popped = mutableListOf<Balloon>()
    private val bonusEngine = BonusEngine(this, coroutineScope)

    private val _feedback = MutableSharedFlow<Feedback>(extraBufferCapacity = 100)
    val feedback: Flow<Feedback> = _feedback

    fun start(difficulty: Difficulty = Difficulty.Easy) {
        ticker = coroutineScope.launch(Dispatchers.Default) {
            _boards.update { it.copy(difficulty = difficulty) }
            _state.update { GameState.STARTED }
            while (isActive) {
                run()
                delay(TICK)
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

        _boards.update { board }
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
            if (balloon.isBadMove()) {
                continue
            }
            if (balloon.thaw(TICK)) {
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
        _boards.update { board ->
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

        // Convert balloon touches to tool touches.
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

        var bouquet = board.bouquet
        var lives = board.lives
        var score = board.score

        while (touchedBalloons.isNotEmpty()) {
            val balloon = touchedBalloons.removeAt(0)

            if (balloon.isPopped) {
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

    fun onBalloonSize(balloon: Balloon) {
        val board = boards.value
        applyVerticalPath(balloon, board.size)
    }

    fun onPrizeSize(lucky: Lucky) {
        val board = boards.value
        if (lucky.isPopped) {
            applyDrop(lucky, board.size)
            _boards.update { it.copy(prizes = it.prizes + lucky.prize) }
        }
    }

    // Vertical paths.
    private fun applyVerticalPath(balloon: Balloon, boardSize: Size) {
        val width = boardSize.width
        val height = boardSize.height
        val widthPad = width * PADDING
        val widthPadded = width - widthPad - widthPad
        val balloonHeight = balloon.height

        val x1 = widthPad + (rand.nextFloat() * widthPadded)
        val y1 = height + (balloonHeight * 0.25f)
        val x2 = x1
        val y2 = -balloonHeight
        balloon.moveTo(x1, y1)
        balloon.setDestination(x2, y2)
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

    private fun generateBalloons(board: Board): Board {
        val bouquet = generateBouquet(board)
        var delay = 0L

        for (balloon in bouquet) {
            balloon.setTick(TICK)
            balloon.freeze(delay)
            delay += DELAY_PER_BALLOON
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

        val level = board.level + 1
        val scene = generateScene(level)
        // TODO don't generate all balloons at start of level - rather add balloons per tick
        val boardNext = generateBalloons(board.copy(level = level, scene = scene, tool = null))

        if (level > 1) {
            playSound(SoundType.Level)
        } else {
            playSound(SoundType.GameStart)
        }
        playSounds(boardNext)

        return boardNext
    }

    protected open fun generateScene(level: Int): Scene {
        return Scene.forLevel(level)
    }

    protected open suspend fun finished() {
        println("No more lives")
        _state.update { GameState.FINISHED }
        _boards.update { it.copy(bouquet = Bouquet()) }
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
        return bonusEngine.process(board)
    }

    fun onBonusClick(bonus: Bonus) {
        if (isRunning) {
            bonusEngine.onClick(bonus)
        }
    }

    fun onToolUse(tool: Tool) {
        if (isRunning) {
            bonusEngine.onUse(tool)
        }
    }

    fun clear() {
        _boards.update { Board() }
        touches.clear()
        touchedBalloons.clear()
        popped.clear()
        bonusEngine.clear()
    }

    companion object {
        private const val TICK = 5L
        private const val DELAY_PER_BALLOON = TICK * 200

        // Time to show the score after balloon popped.
        private const val DELAY_DEAD_REMOVE = 1000L

        private const val PADDING = 0.2f
    }
}