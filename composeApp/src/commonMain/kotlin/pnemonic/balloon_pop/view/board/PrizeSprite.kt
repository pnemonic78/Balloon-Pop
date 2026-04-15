package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import pnemonic.balloon_pop.model.prize.Coins
import pnemonic.balloon_pop.model.prize.Prize
import pnemonic.balloon_pop.model.prize.PrizeCallback
import pnemonic.compose.toDp
import kotlin.math.roundToInt

@Composable
fun PrizeSprite(
    prize: Prize,
    boardSize: Size,
    onSize: PrizeCallback,
) {
    when (prize) {
        is Coins -> CoinsSprite(prize, boardSize, onSize)
        //TODO is Gemstone -> GemstoneSprite(prize, boardSize, onSize)
    }
}

@Composable
fun PrizeSprite(
    prize: Prize,
    boardSize: Size,
    image: ImageVector,
    scale: Float,
    onSize: PrizeCallback,
    modifier: Modifier = Modifier
) {
    val painter = rememberVectorPainter(image)
    PrizeSprite(
        prize,
        boardSize,
        painter,
        scale,
        onSize,
        modifier
    )
}

@Composable
fun PrizeSprite(
    prize: Prize,
    boardSize: Size,
    painter: VectorPainter,
    scale: Float,
    onSize: PrizeCallback,
    modifier: Modifier = Modifier
) {
    val scale = scale * prize.size
    val width = (painter.intrinsicSize.width * scale).toDp()
    val height = (painter.intrinsicSize.height * scale).toDp()

    Box(
        modifier = modifier
            .onSizeChanged { size ->
                val oldWidth = prize.width.roundToInt()
                val oldHeight = prize.height.roundToInt()
                if ((oldWidth != size.width) || (oldHeight != size.height)) {
                    prize.setSize(size)
                    onSize(prize)
                }
            }
            .graphicsLayer {
                translationX = prize.left
                translationY = prize.top
                rotationZ = prize.rotation
            }
    ) {
        Image(
            modifier = Modifier.size(width, height),
            painter = painter,
            contentDescription = prize.description,
            contentScale = ContentScale.Fit,
        )
    }
    PrizeScore(prize, boardSize)
}
