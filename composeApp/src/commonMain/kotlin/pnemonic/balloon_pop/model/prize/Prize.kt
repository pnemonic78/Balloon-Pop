package pnemonic.balloon_pop.model.prize

import androidx.compose.ui.geometry.Size
import pnemonic.balloon_pop.model.Movable
import pnemonic.balloon_pop.sound.SoundType
import kotlin.math.cos
import kotlin.math.sin

typealias PrizeCallback = (Prize) -> Unit

abstract class Prize(val score: Long, val sound: SoundType = SoundType.None) : Movable(size = 1f, speed = 1f) {
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
        return angle == rotationMovement
    }

    override fun didEscape(boardSize: Size): Boolean {
        val y1 = top
        val y3 = boardSize.height

        return (y1 + EPSILON_ESCAPE >= y3)
    }

    companion object {
        // Accelerate because of gravity.
        private const val ACCELERATION = 1.01f
    }
}