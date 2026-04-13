package pnemonic.balloon_pop.view.board

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import pnemonic.balloon_pop.model.balloon.Balloon

@Composable
fun BalloonScore(bug: Balloon, boardSize: Size) {
    if (bug.isPopped) {
        Score(bug, boardSize)
    }
}
