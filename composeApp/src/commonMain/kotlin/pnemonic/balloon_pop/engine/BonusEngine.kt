package pnemonic.balloon_pop.engine

import androidx.compose.ui.geometry.Offset
import kotlinx.coroutines.CoroutineScope
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.tool.Tool

class BonusEngine(
    private val callback: EngineCallback,
    private val coroutineScope: CoroutineScope
) {
    fun clear() {
    }

    fun onTap(board: Board, offset: Offset) {
    }

    suspend fun process(board: Board): Board {
        return board
    }

    fun onClick(bonus: Bonus) {
    }

    fun onUse(tool: Tool) {
    }
}