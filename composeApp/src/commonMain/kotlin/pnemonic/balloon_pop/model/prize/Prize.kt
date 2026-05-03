package pnemonic.balloon_pop.model.prize

import androidx.compose.ui.geometry.Size
import pnemonic.DEGREES_TO_RADIANS
import pnemonic.balloon_pop.model.Movable
import pnemonic.balloon_pop.sound.SoundType

typealias PrizeCallback = (Prize) -> Unit

abstract class Prize(val sound: SoundType = SoundType.None) : Movable(size = 1f, speed = 0.02f) {
    override fun moveNext() = moveStraight()

    override fun moveStraight(): Boolean {
        val x1 = left
        val y1 = top
        val dy = velocity * height
        val y = y1 + dy
        moveTo(x1, y)
        this.velocity *= ACCELERATION
        return true
    }

    override fun calculateHeading(): Float {
        rotation = 0f
        rotationMovement = 90f * DEGREES_TO_RADIANS // down
        return 0f
    }

    override fun didEscape(boardSize: Size): Boolean {
        val y1 = top - EPSILON_ESCAPE
        val y3 = boardSize.height

        return (y1 >= y3)
    }

    companion object {
        // Accelerate because of gravity.
        private const val ACCELERATION = 1.015f
    }
}