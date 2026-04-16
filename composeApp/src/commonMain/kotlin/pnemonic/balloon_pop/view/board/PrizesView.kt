package pnemonic.balloon_pop.view.board

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.contains
import pnemonic.balloon_pop.model.prize.Prize

@Composable
fun PrizesView(board: Board) {
    PrizesView(board.prizes, board.size)
}

@Composable
fun PrizesView(
    prizes: List<Prize>,
    boardSize: Size,
) {
    for (prize in prizes) {
        if (boardSize.contains(prize)) {
            // already have size when balloon popped.
            PrizeSprite(prize, onSize = {})
        }
    }
}
