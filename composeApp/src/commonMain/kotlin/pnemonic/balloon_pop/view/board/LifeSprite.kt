package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.tool.ExtraLife
import pnemonic.balloon_pop.model.tool.ToolCallback
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.compose.toPx
import pnemonic.balloon_pop.drawable.LifeHas as LifeImage

@Composable
fun LifeSprite(tool: ExtraLife, onUse: ToolCallback, boardSize: Size) {
    ToolSprite(tool, LifeImage, 20f, boardSize)

    LaunchedEffect(tool) {
        tool.show()
        delay(1000)
        onUse(tool)
    }
}

@Composable
@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
private fun Preview() {
    val boardSize = Size(previewWidthDp.dp.toPx(), previewHeightDp.dp.toPx())
    val tool = ExtraLife(Bonus.Life())

    Box(modifier = Modifier.fillMaxSize()) {
        LifeSprite(tool, onUse = {}, boardSize)
    }
}