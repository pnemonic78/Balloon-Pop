package pnemonic.balloon_pop.model.balloon

import androidx.compose.ui.geometry.Rect

abstract class Balloon {
    abstract var score: Int
    abstract val isPopped: Boolean
    abstract val destinationY: Float
    abstract val destinationX: Float
    abstract var hits: Int

    abstract fun isHit(bounds: Rect): Boolean
    abstract fun freeze(value: Long)
    abstract fun setDestination(x: Float, y: Float)
    abstract fun hit()
}