package pnemonic.balloon_pop.model.balloon

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Size
import pnemonic.balloon_pop.model.Movable
import pnemonic.balloon_pop.sound.SoundType
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.sin

typealias BalloonCallback = (Balloon) -> Unit

abstract class Balloon(
    size: Float = 1f,
    speed: Float = 1f,
    val score: Long,
    hits: Int = 1,
    val sound: SoundType = SoundType.Pop,
    val sway: Boolean = false
) : Movable(size, speed) {
    var hits: Int = hits
        private set(value) {
            field = value
            isPopped = (value <= 0)
            isStopped = isPopped || (delay > 0L)
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

    override fun toString(): String {
        return "${this::class.simpleName}@${hashCode()}($description, l:$left, t:$top, w:$width, h:$height, r:$rotation, d:$delay, h:$hits, o:$opacity)"
    }

    fun setTick(tick: Long) {
        velocity = speed * 0.001f * tick
    }

    override fun move(): Boolean {
        if (isPopped) return false
        return super.move()
    }

    override fun moveNext() = if (sway) moveZigZag() else moveStraight()

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

    protected fun moveZigZag(): Boolean {
        val size = height
        val angle = rotationMovement
        val c = cos(angle)  //TODO cache this value
        val s = sin(angle)  //TODO cache this value
        val x1 = left
        val y1 = top
        val dx = velocity * size
        val dy = size * 0.01f * sin(angleZigZag)
        val x2 = x1 + (dx * c) - (dy * s)
        val y2 = y1 + (dx * s) + (dy * c)
        moveTo(x2, y2)
        this.velocity *= ACCELERATION
        this.angleZigZag += ZIG_ZAG
        return true
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
        val y2 = y1 + height

        return (y2 - EPSILON_ESCAPE < 0f)
    }

    // delay
    fun freeze(ice: Long) {
        this.delay = ice
    }

    // undelay
    fun thaw(steam: Long): Boolean {
        val delay = max(0L, delay - steam)
        this.delay = delay
        return delay > 0L
    }

    companion object {
        // Accelerate because of buoyancy.
        private const val ACCELERATION = 1.002f
        private const val ZIG_ZAG = 0.02f
    }
}
