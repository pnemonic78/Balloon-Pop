package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.model.balloon.Watermelon
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.drawable.Watermelon as WatermelonImage

@Composable
fun WatermelonSprite(balloon: Watermelon, boardSize: Size, onSize: BalloonCallback, onTap: BalloonCallback) {
    BalloonSprite(balloon, boardSize, WatermelonImage, 10f, onSize, onTap)
}

@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Composable
private fun Preview() {
    val balloon = Watermelon()

    Box(modifier = Modifier.fillMaxSize()) {
        WatermelonSprite(balloon, Size.Zero, onSize = {}, onTap = {})
    }
}