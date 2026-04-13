package pnemonic.balloon_pop.view.board

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import pnemonic.balloon_pop.drawable.Pop
import pnemonic.balloon_pop.model.balloon.Balloon
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.model.balloon.Butterfly
import pnemonic.balloon_pop.model.balloon.Dog
import pnemonic.balloon_pop.model.balloon.Flower
import pnemonic.balloon_pop.model.balloon.Giraffe
import pnemonic.balloon_pop.model.balloon.Heart
import pnemonic.balloon_pop.model.balloon.Lemon
import pnemonic.balloon_pop.model.balloon.Orange
import pnemonic.balloon_pop.model.balloon.Round
import pnemonic.balloon_pop.model.balloon.Snake
import pnemonic.balloon_pop.model.balloon.Star
import pnemonic.balloon_pop.model.balloon.Watermelon
import kotlin.math.roundToInt

@Composable
fun BalloonSprite(
    balloon: Balloon,
    boardSize: Size,
    onSize: BalloonCallback,
    onTap: BalloonCallback
) {
    when (balloon) {
        is Butterfly -> ButterflySprite(balloon, boardSize, onSize, onTap)
        is Dog -> DogSprite(balloon, boardSize, onSize, onTap)
        is Flower -> FlowerSprite(balloon, boardSize, onSize, onTap)
        is Giraffe -> GiraffeSprite(balloon, boardSize, onSize, onTap)
        is Heart -> HeartSprite(balloon, boardSize, onSize, onTap)
        is Lemon -> LemonSprite(balloon, boardSize, onSize, onTap)
        is Orange -> OrangeSprite(balloon, boardSize, onSize, onTap)
        is Round -> RoundSprite(balloon, boardSize, onSize, onTap)
        is Snake -> SnakeSprite(balloon, boardSize, onSize, onTap)
        is Star -> StarSprite(balloon, boardSize, onSize, onTap)
        is Watermelon -> WatermelonSprite(balloon, boardSize, onSize, onTap)
    }
}

@Composable
fun BalloonSprite(
    balloon: Balloon,
    boardSize: Size,
    image: ImageVector,
    scale: Float,
    onSize: BalloonCallback,
    onTap: BalloonCallback,
    modifier: Modifier = Modifier
) {
    val isPopped = balloon.isPopped
    val width = image.defaultWidth * scale
    val height = image.defaultHeight * scale
    val sx by animateFloatAsState(targetValue = if (isPopped) 1.3f else 1f)
    val sy by animateFloatAsState(targetValue = if (isPopped) 1.15f else 1f)
    val animatedOpacity by animateFloatAsState(targetValue = balloon.opacity)

    Box(
        modifier = modifier
            .size(width, height)
            .onSizeChanged { size ->
                val oldWidth = balloon.width.roundToInt()
                val oldHeight = balloon.height.roundToInt()
                if ((oldWidth != size.width) || (oldHeight != size.height)) {
                    balloon.setSize(size)
                    onSize(balloon)
                }
            }
            .graphicsLayer {
                translationX = balloon.left
                translationY = balloon.top
                rotationZ = balloon.rotation
                scaleX = sx
                scaleY = sy
            }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                onTap(balloon)
            }
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            imageVector = image,
            contentDescription = balloon.description,
            contentScale = ContentScale.Fit,
            alpha = animatedOpacity
        )
        if (isPopped) {
            Image(
                modifier = Modifier.fillMaxSize(),
                imageVector = Pop,
                contentDescription = "💥",
                contentScale = ContentScale.FillBounds
            )
        }
    }
    BalloonScore(balloon, boardSize)
}
