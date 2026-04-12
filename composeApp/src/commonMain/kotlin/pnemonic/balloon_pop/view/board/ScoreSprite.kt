package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.tool.Score
import pnemonic.balloon_pop.model.tool.ToolCallback
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.compose.toPx
import pnemonic.balloon_pop.drawable.Trophy as ScoreImage
import pnemonic.balloon_pop.view.board.Score as ScoreView

private val sizeScore = 50.sp

@Composable
fun ScoreSprite(tool: Score, onUse: ToolCallback, boardSize: Size) {
    ToolSprite(tool, ScoreImage, 1f, 0.85f, null, boardSize) {
        ScoreView(score = tool.bonus.hits, boardSize, 0f, 0f, sizeScore)
    }

    LaunchedEffect(tool) {
        tool.show()
        delay(1500)
        onUse(tool)
    }
}

@Composable
@Preview(
    showBackground = true,
    backgroundColor = 0xFF008800,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
private fun Preview() {
    val boardSize = Size(previewWidthDp.dp.toPx(), previewHeightDp.dp.toPx())
    val tool = Score(Bonus.Score(hits = 5000))

    Box(modifier = Modifier.fillMaxSize()) {
        ScoreSprite(tool, onUse = {}, boardSize)
    }
}