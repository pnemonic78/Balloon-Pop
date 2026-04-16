package pnemonic.balloon_pop.model.prize

import androidx.compose.ui.geometry.Size
import pnemonic.RADIANS_TO_DEGREES
import pnemonic.balloon_pop.model.Movable
import pnemonic.balloon_pop.sound.SoundType
import kotlin.math.cos
import kotlin.math.sin

typealias PrizeCallback = (Prize) -> Unit

abstract class Prize(val sound: SoundType = SoundType.None) : Movable(size = 1f, speed = 0.02f) {
    override fun moveNext() = moveStraight()

    protected fun moveStraight(): Boolean {
        val size = height
        val angle = rotationMovement
        val c = cos(angle)  //TODO cache this value
        val s = sin(angle)  //TODO cache this value
        val x1 = left
        val y1 = top
        val dx = velocity * size
        val dy = 0f
        val x2 = x1 + (dx * c) - (dy * s)
        val y2 = y1 + (dx * s) + (dy * c)
        moveTo(x2, y2)
        this.velocity *= ACCELERATION
        return true
    }

    override fun calculateHeading(): Float {
        if (isBadMove()) {
            rotation = 0f
            rotationMovement = 0f
            return 0f
        }
        val angleDegrees = 90f
        val angleVisual = 0f
        rotation = angleVisual
        rotationMovement = angleDegrees / RADIANS_TO_DEGREES
        return angleVisual
    }

    override fun didEscape(boardSize: Size): Boolean {
        val y1 = top
        val y3 = boardSize.height

        return (y1 + EPSILON_ESCAPE >= y3)
    }

    companion object {
        // Accelerate because of gravity.
        private const val ACCELERATION = 1.03f
    }
}