package pnemonic.balloon_pop.engine

import androidx.compose.ui.geometry.Offset
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import pnemonic.add
import pnemonic.balloon_pop.Feedback
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.tool.AttractionTool
import pnemonic.balloon_pop.model.tool.BonusTool
import pnemonic.balloon_pop.model.tool.ExtraLife
import pnemonic.balloon_pop.model.tool.FreezeTool
import pnemonic.balloon_pop.model.tool.PopTool
import pnemonic.balloon_pop.model.tool.Score
import pnemonic.balloon_pop.model.tool.Tool
import pnemonic.balloon_pop.sound.SoundType
import pnemonic.half
import pnemonic.remove
import kotlin.math.max
import kotlin.math.min

class BonusEngine(
    private val callback: EngineCallback,
    private val coroutineScope: CoroutineScope
) {
    private val activated = mutableListOf<Bonus>()
    private val used = mutableListOf<Tool>()
    private var boardScore = 0L
    private var selected: Bonus? = null
    private var jobHide: Job? = null

    fun onClick(bonus: Bonus) {
        if (bonus.isActive) {
            if (activated.isEmpty()) {
                activated.add(bonus)
            }
            selected = null
        } else {
            selected = bonus
        }
    }

    suspend fun process(board: Board): Board {
        var board = processTools(board)
        board = processBonuses(board)
        return board
    }

    // Apply bonuses to the board that were clicked by player.
    private suspend fun processTools(board: Board): Board {
        val toolActive = board.tool
        if (toolActive == null) {
            val bonusTouched = activated.removeFirstOrNull()
            if (bonusTouched != null) {
                // remove the bonus from the list
                // add the bonus to the board
                return addTool(board, bonusTouched)
            }
        } else {
            val toolUsed = used.removeFirstOrNull()
            if (toolUsed === toolActive) {
                return applyTool(board, toolActive)
            }
            if (toolActive.isVisible && !toolActive.bounds.isEmpty) {
                return useTool(board, toolActive)
            }
        }
        return board
    }

    private fun processBonuses(board: Board): Board {
        // Add potential bonus.
        val scoreBefore = boardScore
        val score = board.score
        val scoreDelta = score - scoreBefore
        if (scoreDelta == 0L) return board
        boardScore = score

        var modified = false
        var bonuses = board.bonuses
        if (bonuses.isEmpty()) {
            bonuses = listOf(
                Bonus.Life(),
                Bonus.Score(),
            )
            modified = true
        }
        var bonus = selected
        if (bonus == null) {
            bonus = bonuses.firstOrNull { b -> b.progress < b.score }
            if (bonus == null) {
                bonus = Bonus.Life()
                bonuses = bonuses.add(bonus)
                modified = true
            }
            selected = bonus
        }

        if (bonus != null) {
            val progressDelta = min(scoreDelta, max(0, bonus.score - bonus.progress))
            bonus.incrementProgress(progressDelta)
            val progressNext = scoreDelta - progressDelta
            if (bonus.isActive) {
                // Start progressing the next candidate bonus.
                bonus = bonuses.firstOrNull { b -> b.progress < b.score }
                if (bonus == null) {
                    bonus = Bonus.Life()
                    bonuses = bonuses.add(bonus)
                    modified = true
                    bonus.incrementProgress(progressNext)
                }
                selected = bonus
            }
        }

        return if (modified) {
            board.copy(bonuses = bonuses)
        } else {
            board
        }
    }

    /** Add the bonus to the board as a tool. */
    private suspend fun addTool(board: Board, bonus: Bonus): Board {
        return when (bonus) {
            Bonus.None -> board
            is Bonus.Life -> add(board, bonus)
            is Bonus.Score -> add(board, bonus)
        }
    }

    private fun applyTool(board: Board, tool: Tool): Board {
        return when (tool) {
            Bonus.None -> board
            is ExtraLife -> apply(board, tool)
            is Score -> apply(board, tool)
            else -> board
        }
    }

    private suspend fun add(board: Board, bonus: Bonus.Life): Board {
        val lives = board.lives + bonus.hits.toInt()
        if (lives >= Board.MAX_LIVES) return board

        val tool = ExtraLife(bonus)
        playSound(tool.sound)
        return board.copy(tool = tool)
    }

    private suspend fun add(board: Board, bonus: Bonus.Score): Board {
        val tool = Score(bonus)
        playSound(tool.sound)
        return board.copy(tool = tool)
    }

    private fun reuse(bonuses: List<Bonus>, bonus: Bonus): List<Bonus> {
        // Re-use the same bonus.
        bonus.clear()
        // Move the bonus to the end.
        return bonuses.remove(bonus) + bonus
    }

    private fun apply(board: Board, tool: ExtraLife): Board {
        val lives = board.lives + tool.hits.toInt()
        if (lives >= Board.MAX_LIVES) return board

        val board = usedTool(board, tool)
        return board.copy(lives = lives)
    }

    private fun apply(board: Board, tool: Score): Board {
        val score = board.score + tool.hits
        // ignore points earned using bonus tool for other bonuses
        boardScore = score

        val board = usedTool(board, tool)
        return board.copy(score = score)
    }

    private fun usedTool(board: Board, tool: Tool): Board {
        var bonuses = board.bonuses
        val bonus = (tool as? BonusTool)?.bonus
        if (bonus != null) {
            bonuses = reuse(board.bonuses, tool.bonus)
        }
        return board.copy(bonuses = bonuses, tool = null)
    }

    fun onUse(tool: Tool) {
        used.add(tool)
    }

    suspend fun onTap(board: Board, offset: Offset) {
        val tool = board.tool ?: return
        // Not yet on the board?
        if (!tool.isVisible) {
            val left = offset.x - tool.width.half
            val top = offset.y - tool.height.half
            tool.moveTo(left, top, board.size)
            tool.show()
            playSound(tool.sound)
        }
    }

    private suspend fun notifyFeedback(feedback: Feedback) {
        callback.notifyFeedback(feedback)
    }

    private suspend fun playSound(sound: SoundType) {
        if (sound === SoundType.None) return
        notifyFeedback(Feedback.Sound(sound))
    }

    private suspend fun useTool(board: Board, tool: Tool): Board {
        return board
    }

    private fun attract(board: Board, tool: AttractionTool): Board {
        tool.attract(board.bouquet)
        return board
    }

    private suspend fun pop(board: Board, tool: PopTool): Board {
        val board = tool.pop(board, callback)
        // ignore points earned using bonus tool for other bonuses
        boardScore = board.score

        if (jobHide == null) {
            jobHide = coroutineScope.launch {
                delay(DURATION_POP)
                // Hide the tool to pop again.
                tool.hide()
                if (tool.hits <= 0) {
                    onUse(tool)
                }
                jobHide = null
            }
        }

        return board
    }

    // Prevent the bouquet from moving.
    private fun freeze(board: Board, tool: FreezeTool): Board {
        tool.freeze(board.bouquet)
        return board
    }

    fun clear() {
        activated.clear()
        used.clear()
        boardScore = 0L
        selected = null
    }

    companion object {
        private const val DURATION_POP = 2000L
    }
}