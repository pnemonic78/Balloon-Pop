package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pnemonic.balloon_pop.model.prize.Gem
import pnemonic.balloon_pop.model.prize.Gemstone
import pnemonic.balloon_pop.model.prize.PrizeCallback
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.compose.toPx
import pnemonic.balloon_pop.drawable.Amethyst as AmethystImage
import pnemonic.balloon_pop.drawable.Diamond as DiamondImage
import pnemonic.balloon_pop.drawable.Emerald as EmeraldImage
import pnemonic.balloon_pop.drawable.Jade as JadeImage
import pnemonic.balloon_pop.drawable.Ruby as RubyImage
import pnemonic.balloon_pop.drawable.Sapphire as SapphireImage
import pnemonic.balloon_pop.drawable.Topaz as TopazImage

@Composable
fun GemstoneSprite(prize: Gemstone, boardSize: Size, onSize: PrizeCallback) {
    val image = when (prize.gem) {
        Gem.Amethyst -> AmethystImage
        Gem.Diamond -> DiamondImage
        Gem.Emerald -> EmeraldImage
        Gem.Jade -> JadeImage
        Gem.Ruby -> RubyImage
        Gem.Sapphire -> SapphireImage
        Gem.Topaz -> TopazImage
    }
    PrizeSprite(prize, boardSize, image, 1.5f, onSize)
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

    Column(modifier = Modifier.fillMaxSize()) {
        Row {
            GemstoneSprite(Gemstone(10, Gem.Amethyst), boardSize, onSize = {})
            GemstoneSprite(Gemstone(10, Gem.Diamond), boardSize, onSize = {})
            GemstoneSprite(Gemstone(10, Gem.Emerald), boardSize, onSize = {})
        }
        Row {
            GemstoneSprite(Gemstone(10, Gem.Jade), boardSize, onSize = {})
            GemstoneSprite(Gemstone(10, Gem.Ruby), boardSize, onSize = {})
            GemstoneSprite(Gemstone(10, Gem.Sapphire), boardSize, onSize = {})
        }
        Row {
            GemstoneSprite(Gemstone(10, Gem.Topaz), boardSize, onSize = {})
        }
    }
}