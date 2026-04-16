package pnemonic.balloon_pop.model.balloon

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Size
import pnemonic.DEGREES_TO_RADIANS
import pnemonic.balloon_pop.model.Movable
import pnemonic.balloon_pop.sound.SoundType
import kotlin.math.max

typealias BalloonCallback = (Balloon) -> Unit

abstract class Balloon(
    size: Float = 1f,
    speed: Float = 1f,
    val score: Long,
    hits: Int = 1,
    val sound: SoundType = SoundType.Pop,
    sway: Boolean = false
) : Movable(size, speed, sway) {
    var hits: Int = hits
        private set(value) {
            field = value
            isPopped = (value <= 0)
            isStopped = isPopped || (delay != 0L)
        }
    var isPopped by mutableStateOf(false)
        private set
    var damage by mutableIntStateOf(0)
        private set
    protected var delay: Long = 0L
        private set(value) {
            field = value
            isStopped = isPopped || (value > 0L)
        }
    var isStopped by mutableStateOf(false)
        private set

    // Used to activate each ballon and attach it to the screen not-all-at-once.
    val isActive: Boolean get() = opacity > 0f

    override fun toString(): String {
        return "${this::class.simpleName}@${hashCode()}($description, l:$left, t:$top, w:$width, h:$height, r:$rotation, d:$delay, h:$hits, o:$opacity)"
    }

    fun setTick(tick: Long) {
        velocity = speed * 0.001f * tick
        opacity = 0f
    }

    override fun move(): Boolean {
        if (isPopped) return false
        return super.move()
    }

    override fun moveStraight(): Boolean {
        val x1 = left
        val y1 = top
        val dy = velocity * height
        val y = y1 - dy
        moveTo(x1, y)
        this.velocity *= ACCELERATION
        return true
    }

    override fun moveZigZag(): Boolean {
        this.velocity *= ACCELERATION
        return super.moveZigZag()
    }

    override fun calculateHeading(): Float {
        rotation = 0f
        if (isBadMove()) {
            rotationMovement = 0f
            return 0f
        }
        if (sway) {
            return super.calculateHeading()
        }
        rotationMovement = 270f * DEGREES_TO_RADIANS // up
        return 0f
    }

    fun hit() {
        damage++
        var hits = this.hits
        hits = max(0, hits - 1)
        this.hits = hits

        opacity = if (hits == 0) {
            0.75f
        } else {
            max(1f - (damage * 0.1f), 0.2f)
        }
    }

    override fun didEscape(boardSize: Size): Boolean {
        val y1 = top
        val y2 = y1 + height + EPSILON_ESCAPE

        return (y2 < 0f)
    }

    // delay
    fun freeze(ice: Long) {
        this.delay = ice
    }

    // undelay
    fun thaw(steam: Long): Boolean {
        val delay = max(0L, delay - steam)
        this.delay = delay
        if (delay == 0L) {
            if (opacity == 0f) {
                opacity = 0.001f
            }
            return false
        }
        return true
    }

    companion object {
        // Accelerate because of buoyancy.
        private const val ACCELERATION = 1.002f
    }
}
