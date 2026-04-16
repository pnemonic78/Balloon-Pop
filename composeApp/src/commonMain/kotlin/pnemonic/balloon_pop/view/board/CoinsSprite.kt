package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pnemonic.balloon_pop.model.prize.Coins
import pnemonic.balloon_pop.model.prize.PrizeCallback
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.drawable.Coins as CoinsImage

@Composable
fun CoinsSprite(prize: Coins, onSize: PrizeCallback) {
    PrizeSprite(prize, CoinsImage, 3f, onSize)
}

@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Composable
private fun Preview() {
    val prize = Coins()

    Box(modifier = Modifier.fillMaxSize()) {
        CoinsSprite(prize, onSize = {})
    }
}