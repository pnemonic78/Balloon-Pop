package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.balloon.BalloonCallback

@Composable
fun BouquetView(board: Board, onBalloonSize: BalloonCallback, onTap: BalloonCallback) {
    Box(modifier = Modifier.fillMaxSize().background(Color.Green))
}