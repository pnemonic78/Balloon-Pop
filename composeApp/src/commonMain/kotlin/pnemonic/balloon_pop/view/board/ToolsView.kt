package pnemonic.balloon_pop.view.board

import androidx.compose.runtime.Composable
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.tool.ToolCallback

@Composable
fun ToolsAbove(board: Board, onToolUse: ToolCallback) {
    // Only use 1 tool.
    val tool = board.tool ?: return
    ToolAbove(tool, onToolUse, board.size)
}
