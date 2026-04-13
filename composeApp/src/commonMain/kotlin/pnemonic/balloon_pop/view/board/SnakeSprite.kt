package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.model.balloon.Snake
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.drawable.Snake as SnakeImage

@Composable
fun SnakeSprite(balloon: Snake, boardSize: Size, onSize: BalloonCallback, onTap: BalloonCallback) {
    BalloonSprite(balloon, boardSize, SnakeImage, 1f, onSize, onTap)
}

@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Composable
private fun Preview() {
    val balloon = Snake()

    Box(modifier = Modifier.fillMaxSize()) {
        SnakeSprite(balloon, Size.Zero, onSize = {}, onTap = {})
    }
}