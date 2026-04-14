package pnemonic.balloon_pop.view.board

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import pnemonic.balloon_pop.model.balloon.Balloon

@Composable
fun BalloonScore(balloon: Balloon, boardSize: Size) {
    if (balloon.isPopped) {
        Score(balloon, boardSize)
    }
}
