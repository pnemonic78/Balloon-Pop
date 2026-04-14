package pnemonic.balloon_pop.model.balloon

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.IntSize
import pnemonic.RADIANS_TO_DEGREES
import pnemonic.balloon_pop.sound.SoundType
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.sin

typealias BalloonCallback = (Balloon) -> Unit

abstract class Balloon(
    val size: Float = 1f,
    val speed: Float,
    val score: Long,
    hits: Int = 1,
    val sound: SoundType = SoundType.Pop,
    val sway: Boolean = false
) {
    var hits: Int = hits
        private set(value) {
            field = value
            isPopped = (value <= 0)
            isStopped = isPopped || (delay > 0L)
        }
    var left by mutableFloatStateOf(0f)
        private set
    var top by mutableFloatStateOf(0f)
        private set
    var width: Float = 0f
        private set
    var height: Float = 0f
        private set
    val right: Float get() = left + width
    val bottom: Float get() = top + height
    internal var destinationX: Float = Float.NaN
        private set
    internal var destinationY: Float = Float.NaN
        private set
    private var destinationAngle: Float = Float.NaN
    protected var velocity: Float = speed
        private set
    var rotation by mutableFloatStateOf(0f)
        private set
    protected var rotationMovement = 0f
        private set
    var isPopped by mutableStateOf(false)
        private set
    var damage by mutableIntStateOf(0)
        private set
    var opacity by mutableFloatStateOf(1f)
        private set
    private var delay: Long = 0L
        set(value) {
            field = value
            isStopped = isPopped || (value > 0L)
        }
    var isStopped by mutableStateOf(false)
        private set
    private var angleZigZag = 0f

    abstract val description: String

    override fun toString(): String {
        return "${this::class.simpleName}@${hashCode()}($description, l:$left, t:$top, w:$width, h:$height, r:$rotation, d:$delay, h:$hits, o:$opacity)"
    }

    fun setSize(width: Float, height: Float) {
        this.width = width
        this.height = height
        this.opacity = 1f
    }

    fun setSize(size: IntSize) {
        setSize(size.width.toFloat(), size.height.toFloat())
    }

    fun setDestination(x: Float, y: Float) {
        destinationX = x
        destinationY = y
        destinationAngle = calculateHeading()
    }

    fun setTick(tick: Long) {
        velocity = speed * 0.001f * tick
    }

    fun move(): Boolean {
        if (isBadMove() || isPopped || (opacity <= 0f) || (velocity <= 0f)) return false
        return moveNext()
    }

    open fun moveNext() = if (sway) moveZigZag() else moveStraight()

    fun moveTo(left: Float, top: Float) {
        this.left = left
        this.top = top
        calculateHeading()
    }

    private fun calculateHeading(): Float {
        if (isBadMove()) {
            rotation = 0f
            rotationMovement = 0f
            return 0f
        }
        val x1 = left
        val y1 = top
        val x2 = destinationX
        val y2 = destinationY
        val dx = x2 - x1
        val dy = y2 - y1
        val theta = atan2(dy, dx)
        val angleDegrees = ((theta * RADIANS_TO_DEGREES) + 360f) % 360f
        val angleVisual = (angleDegrees + 90f) % 360f
        rotation = angleVisual
        rotationMovement = angleDegrees / RADIANS_TO_DEGREES
        return angleVisual
    }

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

    fun isBadMove(): Boolean {
        return destinationX.isNaN()
                || destinationY.isNaN()
                || (width <= 0)
                || (height <= 0)
    }

    fun isHit(offset: Offset): Boolean {
        return (left <= offset.x) && (offset.x < right) && (top <= offset.y) && (offset.y < bottom)
    }

    fun isHit(rect: Rect): Boolean {
        return rect.contains(this)
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

    fun didEscape(boardSize: Size): Boolean {
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
        private const val EPSILON_ESCAPE = 5f
        private const val ZIG_ZAG = 0.02f
    }
}

fun Rect.contains(balloon: Balloon): Boolean {
    return (left <= balloon.right) && (balloon.left <= right) && (balloon.top <= bottom) && (balloon.bottom >= top)
}

fun Size.contains(balloon: Balloon): Boolean {
    return (0 <= balloon.right) && (balloon.left <= width) && (balloon.top <= height) && (balloon.bottom >= 0)
}
