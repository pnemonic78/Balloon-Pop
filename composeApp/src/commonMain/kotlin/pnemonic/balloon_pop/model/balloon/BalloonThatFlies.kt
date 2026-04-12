package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType
import kotlin.math.cos
import kotlin.math.sin

abstract class BalloonThatFlies(
    speed: Float,
    score: Long,
    hits: Int,
    noise: SoundType = SoundType.None,
    soundPop: SoundType
) : Balloon(speed = speed, score = score, hits = hits, noise = noise, soundPop = soundPop) {
    override fun moveNext(): Boolean = moveZigZag()

    private var angleZigZag = 0f

    protected fun moveZigZag(): Boolean {
        val size = height
        val angle = rotationMovement
        val c = cos(angle)
        val s = sin(angle)
        val x1 = left
        val y1 = top
        val dx = velocity * size
        val dy = size * 0.01f * sin(angleZigZag)
        val x2 = x1 + (dx * c) - (dy * s)
        val y2 = y1 + (dx * s) + (dy * c)
        moveTo(x2, y2)
        angleZigZag += 0.02f
        return true
    }
}