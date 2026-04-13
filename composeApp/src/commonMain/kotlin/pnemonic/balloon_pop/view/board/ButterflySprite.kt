package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.model.balloon.Butterfly
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.drawable.Butterfly as ButterflyImage

@Composable
fun ButterflySprite(balloon: Butterfly, boardSize: Size, onSize: BalloonCallback, onTap: BalloonCallback) {
    BalloonSprite(balloon, boardSize, ButterflyImage, 0.75f, onSize, onTap)
}

@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Composable
private fun Preview() {
    val balloon = Butterfly()

    Box(modifier = Modifier.fillMaxSize()) {
        ButterflySprite(balloon, Size.Zero, onSize = {}, onTap = {})
    }
}