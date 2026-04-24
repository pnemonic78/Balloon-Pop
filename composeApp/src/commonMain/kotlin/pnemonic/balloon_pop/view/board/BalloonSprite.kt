package pnemonic.balloon_pop.view.board

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.dp
import pnemonic.balloon_pop.drawable.Cord
import pnemonic.balloon_pop.drawable.Pop
import pnemonic.balloon_pop.model.balloon.Balloon
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.model.balloon.Butterfly
import pnemonic.balloon_pop.model.balloon.Dog
import pnemonic.balloon_pop.model.balloon.Flower
import pnemonic.balloon_pop.model.balloon.Giraffe
import pnemonic.balloon_pop.model.balloon.Heart
import pnemonic.balloon_pop.model.balloon.HotAirBalloon
import pnemonic.balloon_pop.model.balloon.Lemon
import pnemonic.balloon_pop.model.balloon.Lucky
import pnemonic.balloon_pop.model.balloon.LuckyCallback
import pnemonic.balloon_pop.model.balloon.Orange
import pnemonic.balloon_pop.model.balloon.Snake
import pnemonic.balloon_pop.model.balloon.Star
import pnemonic.balloon_pop.model.balloon.Teardrop
import pnemonic.balloon_pop.model.balloon.Watermelon
import pnemonic.balloon_pop.model.prize.PrizeCallback
import pnemonic.compose.toDp
import kotlin.math.roundToInt

@Composable
fun BalloonSprite(
    balloon: Balloon,
    boardSize: Size,
    onSize: BalloonCallback,
    onTap: BalloonCallback,
    onPrizeSize: LuckyCallback,
) {
    when (balloon) {
        is Butterfly -> ButterflySprite(balloon, boardSize, onSize, onTap)
        is Dog -> DogSprite(balloon, boardSize, onSize, onTap)
        is Flower -> FlowerSprite(balloon, boardSize, onSize, onTap)
        is Giraffe -> GiraffeSprite(balloon, boardSize, onSize, onTap)
        is Lucky -> LuckySprite(balloon, boardSize, onSize, onTap, onPrizeSize)
        is Heart -> HeartSprite(balloon, boardSize, onSize, onTap)
        is HotAirBalloon -> HotAirBalloonSprite(balloon, boardSize, onSize, onTap)
        is Lemon -> LemonSprite(balloon, boardSize, onSize, onTap)
        is Orange -> OrangeSprite(balloon, boardSize, onSize, onTap)
        is Snake -> SnakeSprite(balloon, boardSize, onSize, onTap)
        is Star -> StarSprite(balloon, boardSize, onSize, onTap)
        is Teardrop -> TeardropSprite(balloon, boardSize, onSize, onTap)
        is Watermelon -> WatermelonSprite(balloon, boardSize, onSize, onTap)
    }
}

@Composable
fun BalloonSprite(
    balloon: Balloon,
    boardSize: Size,
    image: ImageVector,
    scale: Float,
    cord: Boolean = false,
    onSize: BalloonCallback,
    onTap: BalloonCallback,
    onPrizeSize: LuckyCallback = {},
    modifier: Modifier = Modifier
) {
    val painter = rememberVectorPainter(image)
    BalloonSprite(
        balloon,
        boardSize,
        painter,
        scale,
        cord,
        onSize,
        onTap,
        onPrizeSize,
        modifier
    )
}

@Composable
fun BalloonSprite(
    balloon: Balloon,
    boardSize: Size,
    painter: VectorPainter,
    scale: Float,
    cord: Boolean = false,
    onSize: BalloonCallback,
    onTap: BalloonCallback,
    onPrizeSize: LuckyCallback,
    modifier: Modifier = Modifier
) {
    val scale = scale * balloon.size
    val isPopped = balloon.isPopped
    val width = (painter.intrinsicSize.width * scale).toDp()
    val height = (painter.intrinsicSize.height * scale).toDp()
    val sx by animateFloatAsState(targetValue = if (isPopped) 1.3f else 1f)
    val sy by animateFloatAsState(targetValue = if (isPopped) 1.25f else 1f)
    val animatedOpacity by animateFloatAsState(targetValue = balloon.opacity)

    Box(
        modifier = modifier
            .graphicsLayer {
                translationX = balloon.left
                translationY = balloon.top
                rotationZ = balloon.rotation
                scaleX = sx
                scaleY = sy
            }
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            var modifier = Modifier
                .size(width, height)
                .onSizeChanged { size ->
                    val oldWidth = balloon.width.roundToInt()
                    val oldHeight = balloon.height.roundToInt()
                    if ((oldWidth != size.width) || (oldHeight != size.height)) {
                        balloon.setSize(size)
                        onSize(balloon)
                    }
                }
            if (!isPopped) {
                modifier = modifier
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) { onTap(balloon) }
            }

            Image(
                modifier = modifier,
                painter = painter,
                contentDescription = balloon.description,
                contentScale = ContentScale.Fit,
                alpha = animatedOpacity
            )
            if (cord) {
                Image(
                    modifier = Modifier.size(width, 100.dp),
                    imageVector = Cord,
                    contentDescription = "~",
                    contentScale = ContentScale.Fit
                )
            }
        }
        if (isPopped) {
            Image(
                modifier = Modifier.size(width, height),
                imageVector = Pop,
                contentDescription = "💥",
                contentScale = ContentScale.FillBounds
            )
        }
    }
    if (isPopped && (balloon is Lucky)) {
        val prize = balloon.prize
        if ((prize.width <= 0) || (prize.height <= 0)) {
            val onSize: PrizeCallback = { onPrizeSize(balloon) }
            PrizeSprite(prize, onSize)
        }
    }
    BalloonScore(balloon, boardSize)
}
