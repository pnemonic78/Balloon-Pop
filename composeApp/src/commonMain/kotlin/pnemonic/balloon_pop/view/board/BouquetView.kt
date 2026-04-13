package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pnemonic.balloon_pop.engine.BalloonFactory
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.balloon.Balloon
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.model.balloon.Bouquet
import pnemonic.balloon_pop.model.balloon.contains
import pnemonic.balloon_pop.view.previewColor
import pnemonic.compose.toPx

@Composable
fun BouquetView(board: Board, onSize: BalloonCallback, onTap: BalloonCallback) {
    BouquetView(board.bouquet, board.size, onSize, onTap)
}

@Composable
fun BouquetView(
    swarm: Bouquet,
    boardSize: Size,
    onSize: BalloonCallback,
    onTap: BalloonCallback
) {
    BouquetView(swarm.balloons, boardSize, onSize, onTap)
}

@Composable
fun BouquetView(
    balloons: List<Balloon>,
    boardSize: Size,
    onSize: BalloonCallback,
    onTap: BalloonCallback
) {
    for (balloon in balloons) {
        if (boardSize.contains(balloon)) {
            BalloonSprite(balloon, boardSize, onSize, onTap)
        }
    }
}

@Composable
@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = 700,
    heightDp = 900,
    locale = "he"
)
private fun Preview() {
    val balloons = BalloonFactory.allBalloons
    val dx = 20.dp.toPx()
    val dy = 40.dp.toPx()
    var x = dx
    var y = dy
    for (balloon in balloons) {
        balloon.moveTo(x, y)
        balloon.setDestination(x, 0f)
        x += dx
        y += dy
    }

    MaterialTheme {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = AbsoluteAlignment.TopLeft) {
            BouquetView(Bouquet(balloons), Size.Zero, onSize = {}, onTap = {})
        }
    }
}