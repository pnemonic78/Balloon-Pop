package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.model.balloon.Lucky
import pnemonic.balloon_pop.model.balloon.LuckyCallback
import pnemonic.balloon_pop.model.prize.Coins
import pnemonic.balloon_pop.model.prize.Gem
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.compose.toPx
import pnemonic.half
import pnemonic.balloon_pop.drawable.Lucky as LuckyImage

@Composable
fun LuckySprite(
    balloon: Lucky,
    boardSize: Size,
    onSize: BalloonCallback,
    onTap: BalloonCallback,
    onPrizeSize: LuckyCallback,
) {
    BalloonSprite(balloon, boardSize, LuckyImage, 5f, true, onSize, onTap, onPrizeSize)
}

@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Composable
private fun Preview() {
    val width = previewWidthDp.dp.toPx()
    val height = previewHeightDp.dp.toPx()
    val boardSize = Size(width, height)
    val balloon = Lucky(prize = Coins())

    Row(modifier = Modifier.fillMaxSize()) {
        LuckySprite(balloon, boardSize, onSize = {}, onTap = {}, onPrizeSize = {})
    }
}

@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Composable
private fun PreviewCoins() {
    val width = previewWidthDp.dp.toPx()
    val height = previewHeightDp.dp.toPx()
    val boardSize = Size(width, height)
    val balloon = Lucky(prize = Coins())
    balloon.hit()
    balloon.hit()

    Row(modifier = Modifier.fillMaxSize()) {
        LuckySprite(balloon, boardSize, onSize = {}, onTap = {}, onPrizeSize = { prize ->
            prize.moveTo(
                balloon.left + (balloon.width - prize.width).half,
                balloon.top + (balloon.height - prize.height).half
            )
        })
    }
}

@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Composable
private fun PreviewGem() {
    val width = previewWidthDp.dp.toPx()
    val height = previewHeightDp.dp.toPx()
    val boardSize = Size(width, height)
    val balloon = Lucky(gem = Gem.Ruby)
    balloon.hit()
    balloon.hit()

    Row(modifier = Modifier.fillMaxSize()) {
        LuckySprite(balloon, boardSize, onSize = {}, onTap = {}, onPrizeSize = { prize ->
            prize.moveTo(
                balloon.left + (balloon.width - prize.width).half,
                balloon.top + (balloon.height - prize.height).half
            )
        })
    }
}