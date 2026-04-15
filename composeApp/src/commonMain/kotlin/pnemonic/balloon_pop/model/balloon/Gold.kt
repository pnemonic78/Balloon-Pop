package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.model.prize.Prize

class Gold(size: Float = 1f, sway: Boolean = false, score: Long = 10, val prize: Prize) :
    Balloon(size = size, score = score, hits = 2, sway = sway) {
    override val description = "🎈"
    val hue = 40f

    override fun toString(): String {
        return "${this::class.simpleName}@${hashCode()}($description, l:$left, t:$top, w:$width, h:$height, r:$rotation, d:$delay, h:$hits, o:$opacity, p:$prize)"
    }
}