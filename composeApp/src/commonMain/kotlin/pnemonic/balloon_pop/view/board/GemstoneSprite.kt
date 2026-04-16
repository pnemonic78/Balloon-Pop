package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pnemonic.balloon_pop.model.prize.Gem
import pnemonic.balloon_pop.model.prize.Gemstone
import pnemonic.balloon_pop.model.prize.PrizeCallback
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.drawable.Amethyst as AmethystImage
import pnemonic.balloon_pop.drawable.Diamond as DiamondImage
import pnemonic.balloon_pop.drawable.Emerald as EmeraldImage
import pnemonic.balloon_pop.drawable.Jade as JadeImage
import pnemonic.balloon_pop.drawable.Ruby as RubyImage
import pnemonic.balloon_pop.drawable.Sapphire as SapphireImage
import pnemonic.balloon_pop.drawable.Topaz as TopazImage

@Composable
fun GemstoneSprite(prize: Gemstone, onSize: PrizeCallback) {
    val image = when (prize.gem) {
        Gem.Amethyst -> AmethystImage
        Gem.Diamond -> DiamondImage
        Gem.Emerald -> EmeraldImage
        Gem.Jade -> JadeImage
        Gem.Ruby -> RubyImage
        Gem.Sapphire -> SapphireImage
        Gem.Topaz -> TopazImage
    }
    PrizeSprite(prize, image, 2f, onSize)
}

@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Composable
private fun Preview() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row {
            GemstoneSprite(Gemstone(Gem.Amethyst), onSize = {})
            GemstoneSprite(Gemstone(Gem.Diamond), onSize = {})
            GemstoneSprite(Gemstone(Gem.Emerald), onSize = {})
            GemstoneSprite(Gemstone(Gem.Jade), onSize = {})
        }
        Row {
            GemstoneSprite(Gemstone(Gem.Ruby), onSize = {})
            GemstoneSprite(Gemstone(Gem.Sapphire), onSize = {})
            GemstoneSprite(Gemstone(Gem.Topaz), onSize = {})
        }
    }
}