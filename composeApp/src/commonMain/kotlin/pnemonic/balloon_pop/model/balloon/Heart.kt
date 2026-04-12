package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

class Heart(size: Float = 1f) :
    Balloon(size = size, speed = 1f, score = 5, hits = 1, sound = SoundType.Drip) {
    override val description = "❤"
}