package pnemonic.balloon_pop.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.IntSize
import pnemonic.RADIANS_TO_DEGREES
import kotlin.math.atan2

abstract class Movable(val size: Float = 1f, val speed: Float) {
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
    var rotation by mutableFloatStateOf(0f)
        protected set
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
        rotationMovement = angleDegrees / RADIANS_TO_DEGREES
        return angleVisual
    }

    abstract fun moveNext(): Boolean

    open fun move(): Boolean {
        if (isBadMove() || (opacity <= 0f) || (velocity <= 0f)) return false
        return moveNext()
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

    abstract fun didEscape(boardSize: Size): Boolean

    companion object {
        protected const val EPSILON_ESCAPE = 5f
    }
}

fun Rect.contains(item: Movable): Boolean {
    return (left <= item.right) && (item.left <= right) && (item.top <= bottom) && (item.bottom >= top)
}

fun Size.contains(item: Movable): Boolean {
    return (0 <= item.right) && (item.left <= width) && (item.top <= height) && (item.bottom >= 0)
}
