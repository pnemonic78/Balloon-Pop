package pnemonic.balloon_pop.view.board

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.Difficulty
import pnemonic.balloon_pop.model.tool.ExtraLife
import pnemonic.balloon_pop.model.tool.Flower
import pnemonic.balloon_pop.model.tool.Score
import pnemonic.balloon_pop.model.tool.Tool
import pnemonic.balloon_pop.model.tool.ToolCallback
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.view.theme.AppTheme
import pnemonic.compose.toPx
import kotlin.math.roundToInt

@Composable
fun ToolAbove(
    tool: Tool,
    onToolUse: ToolCallback,
    boardSize: Size
) {
    when (tool) {
        is ExtraLife -> LifeSprite(tool, onToolUse, boardSize)
        is Score -> ScoreSprite(tool, onToolUse, boardSize)
    }
}

@Composable
fun ToolBelow(
    tool: Tool,
    onToolUse: ToolCallback,
    boardSize: Size,
    difficulty: Difficulty
) {
    when (tool) {
        is Flower -> FlowerSprite(tool, onToolUse, boardSize, difficulty)
    }
}

@Composable
fun ToolSprite(
    tool: Tool,
    image: ImageVector,
    scale: Float,
    opacity: Float = 1f,
    tint: Color? = null,
    boardSize: Size,
    modifier: Modifier = Modifier,
    overlay: @Composable BoxScope.() -> Unit = {}
) {
    val width = image.defaultWidth * scale
    val height = image.defaultHeight * scale
    val animatedOpacity by animateFloatAsState(targetValue = tool.opacity)

    Box(
        modifier = modifier
            .size(width, height)
            .onSizeChanged { size ->
                val oldWidth = tool.width.roundToInt()
                val oldHeight = tool.height.roundToInt()
                if ((oldWidth != size.width) || (oldHeight != size.height)) {
                    tool.setSize(size.toSize(), boardSize)
                }
            }
            .graphicsLayer {
                translationX = tool.left
                translationY = tool.top
                alpha = animatedOpacity
            },
        contentAlignment = Alignment.Center,
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            imageVector = image,
            contentDescription = tool.description,
            contentScale = ContentScale.Fit,
            colorFilter = if (tint == null) null else ColorFilter.tint(tint),
            alpha = opacity,
        )
        overlay()
    }
}

@Composable
fun ToolSprite(
    tool: Tool,
    image: ImageVector,
    scale: Float,
    boardSize: Size,
    modifier: Modifier = Modifier,
    overlay: @Composable BoxScope.() -> Unit = {}
) = ToolSprite(
    tool = tool,
    image = image,
    scale = scale,
    opacity = 1f,
    tint = null,
    boardSize = boardSize,
    modifier = modifier,
    overlay = overlay
)

@Composable
@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
private fun Preview() {
    val boardSize = Size(previewWidthDp.dp.toPx(), previewHeightDp.dp.toPx())
    val toolBelow = Flower(Bonus.Flower())
    val toolAbove = ExtraLife(Bonus.Life())

    toolBelow.show()
    toolAbove.show()

    AppTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            ToolBelow(toolBelow, onToolUse = {}, boardSize, Difficulty.Easy)
            ToolAbove(toolAbove, onToolUse = {}, boardSize)
        }
    }
}
