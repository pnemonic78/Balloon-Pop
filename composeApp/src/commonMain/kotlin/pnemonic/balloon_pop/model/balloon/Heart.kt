package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

class Heart(size: Float = 1f, sway: Boolean = false) :
    Balloon(size = size, score = 5, hits = 1, sound = SoundType.Drip, sway = sway) {
    override val description = "❤"
}