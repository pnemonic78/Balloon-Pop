package pnemonic.balloon_pop.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.IntSize
import pnemonic.DEGREES_TO_RADIANS
import pnemonic.RADIANS_TO_DEGREES
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin

abstract class Movable(val size: Float = 1f, val speed: Float, val sway: Boolean = false) {
    var left by mutableFloatStateOf(0f)
        private set
    var top by mutableFloatStateOf(0f)
        private set
    var width: Float = -1f
        private set
    var height: Float = -1f
        private set
    val right: Float get() = left + width
    val bottom: Float get() = top + height
    internal var destinationX: Float = Float.NaN
        private set
    internal var destinationY: Float = Float.NaN
        private set
    private var destinationAngle: Float = Float.NaN
    protected var velocity: Float = speed
    // sprite rotation - in degrees
    var rotation by mutableFloatStateOf(0f)
        protected set
    // path rotation - in radians
    protected var rotationMovement = 0f
    var opacity by mutableFloatStateOf(1f)
        protected set
    protected var angleZigZag = 0f

    abstract val description: String

    override fun toString(): String {
        return "${this::class.simpleName}@${hashCode()}($description, l:$left, t:$top, w:$width, h:$height, r:$rotation, o:$opacity)"
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

    fun moveTo(left: Float, top: Float) {
        this.left = left
        this.top = top
        calculateHeading()
    }

    protected open fun calculateHeading(): Float {
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
        rotationMovement = angleDegrees * DEGREES_TO_RADIANS
        return angleVisual
    }

    open fun moveNext(): Boolean = if (sway) moveZigZag() else moveStraight()

    open fun move(): Boolean {
        if (isBadMove() || (opacity <= 0f) || (velocity <= 0f)) return false
        return moveNext()
    }

    protected open fun moveStraight(): Boolean {
        val size = height
        val angle = rotationMovement
        val c = cos(angle)
        val s = sin(angle)
        val x1 = left
        val y1 = top
        val dx = velocity * size
        val dy = 0f
        val x = x1 + (dx * c) - (dy * s)
        val y = y1 + (dx * s) + (dy * c)
        moveTo(x, y)
        return true
    }

    protected open fun moveZigZag(): Boolean {
        val size = height
        val angle = rotationMovement
        val c = cos(angle)
        val s = sin(angle)
        val x1 = left
        val y1 = top
        val dx = velocity * size
        val dy = size * 0.01f * sin(angleZigZag)
        val x = x1 + (dx * c) - (dy * s)
        val y = y1 + (dx * s) + (dy * c)
        moveTo(x, y)
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

    open fun didEscape(boardSize: Size): Boolean {
        val x1 = left - EPSILON_ESCAPE
        val y1 = top - EPSILON_ESCAPE
        val x2 = x1 + width + EPSILON_ESCAPE
        val y2 = y1 + height + EPSILON_ESCAPE
        val x3 = boardSize.width
        val y3 = boardSize.height
        val angle = destinationAngle

        return when {
            // heading to Top-Right
            (angle <= 90f) -> (x1 >= x3) || (y2 <= 0f)
            // heading to Bottom-Right
            (angle <= 180f) -> (x1 >= x3) || (y1 >= y3)
            // heading to Bottom-Left
            (angle <= 270f) -> (x2 <= 0f) || (y1 >= y3)
            // heading to Top-Left
            else -> (x2 <= 0f) || (y2 <= 0f)
        }
    }

    companion object {
        protected const val EPSILON_ESCAPE = 5f
        protected const val ZIG_ZAG = 0.02f
    }
}

fun Rect.contains(item: Movable): Boolean {
    return (left <= item.right) && (item.left <= right) && (item.top <= bottom) && (item.bottom >= top)
}

fun Size.contains(item: Movable): Boolean {
    return (0 <= item.right) && (item.left <= width) && (item.top <= height) && (item.bottom >= 0)
}
