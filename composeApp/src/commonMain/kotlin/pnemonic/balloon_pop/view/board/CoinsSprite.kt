package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pnemonic.balloon_pop.model.prize.Coins
import pnemonic.balloon_pop.model.prize.PrizeCallback
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.compose.toPx
import pnemonic.balloon_pop.drawable.Coins as CoinsImage

@Composable
fun CoinsSprite(prize: Coins, boardSize: Size, onSize: PrizeCallback) {
    PrizeSprite(prize, boardSize, CoinsImage, 1.5f, onSize)
}

@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Composable
private fun Preview() {
    val boardSize = Size(previewWidthDp.dp.toPx(), previewHeightDp.dp.toPx())
    val prize = Coins(10)

    Box(modifier = Modifier.fillMaxSize()) {
        CoinsSprite(prize, boardSize, onSize = {})
    }
}