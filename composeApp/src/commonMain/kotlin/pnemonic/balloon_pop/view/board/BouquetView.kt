package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
import pnemonic.balloon_pop.model.balloon.LuckyCallback
import pnemonic.balloon_pop.model.contains
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.theme.AppTheme
import pnemonic.compose.toPx

@Composable
fun BouquetView(
    board: Board,
    onSize: BalloonCallback,
    onTap: BalloonCallback,
    onPrizeSize: LuckyCallback
) {
    BouquetView(board.bouquet, board.size, onSize, onTap, onPrizeSize)
}

@Composable
fun BouquetView(
    bouquet: Bouquet,
    boardSize: Size,
    onSize: BalloonCallback,
    onTap: BalloonCallback,
    onPrizeSize: LuckyCallback,
) {
    BouquetView(bouquet.balloons, boardSize, onSize, onTap, onPrizeSize)
}

@Composable
fun BouquetView(
    balloons: List<Balloon>,
    boardSize: Size,
    onSize: BalloonCallback,
    onTap: BalloonCallback,
    onPrizeSize: LuckyCallback,
) {
    for (balloon in balloons) {
        if (boardSize.contains(balloon)) {
            BalloonSprite(balloon, boardSize, onSize, onTap, onPrizeSize)
        }
    }
}

@Composable
@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = 800,
    heightDp = 900,
    locale = "he"
)
private fun Preview() {
    val boardSize = Size(800.dp.toPx(), 900.dp.toPx())
    val balloons = BalloonFactory.allBalloons
    val dx = 50.dp.toPx()
    val dy = 50.dp.toPx()
    var x = 0f
    var y = 0f
    for (balloon in balloons) {
        balloon.moveTo(x, y)
        balloon.setDestination(x, 0f)
        x += dx
        y += dy
    }

    AppTheme {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = AbsoluteAlignment.TopLeft) {
            BouquetView(Bouquet(balloons), boardSize, onSize = {}, onTap = {}, onPrizeSize = {})
        }
    }
}