package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.model.prize.Gem
import pnemonic.balloon_pop.model.prize.Gemstone
import pnemonic.balloon_pop.model.prize.Prize

typealias LuckyCallback = (Lucky) -> Unit

class Lucky(size: Float = 1f, sway: Boolean = false, score: Long = 10, val prize: Prize) :
    Balloon(size = size, score = score, hits = 2, sway = sway) {
    override val description = "🎈"
    val hue = 40f

    constructor(size: Float = 1f, sway: Boolean = false, score: Long = 10, gem: Gem) :
            this(size = size, sway = sway, score = score, prize = Gemstone(gem))

    override fun toString(): String {
        return "${this::class.simpleName}@${hashCode()}($description, l:$left, t:$top, w:$width, h:$height, r:$rotation, d:$delay, h:$hits, o:$opacity, p:$prize)"
    }
}