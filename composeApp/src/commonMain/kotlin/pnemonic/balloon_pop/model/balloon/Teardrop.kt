package pnemonic.balloon_pop.model.balloon

import androidx.annotation.FloatRange

class Teardrop(
    size: Float = 1f,
    sway: Boolean = false,
    @FloatRange(0.0, 360.0) val hue: Float = 0f
) : Balloon(size = size, speed = 1f, score = 5, hits = 1, sway = sway) {
    override val description = "🎈"
}