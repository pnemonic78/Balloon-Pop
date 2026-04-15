package pnemonic.balloon_pop.view.board

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import pnemonic.balloon_pop.model.prize.Prize

@Composable
fun PrizeScore(prize: Prize, boardSize: Size) {
    Score(prize, boardSize)
}
