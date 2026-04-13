package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

class Butterfly(size: Float = 1f) :
    Animal(size = size, speed = 1f, score = 5, hits = 1, sound = SoundType.SlimeSplash) {
    override val description = "🦋"
}