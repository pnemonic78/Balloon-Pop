package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

class Giraffe(size: Float = 1f) :
    Animal(size = size, speed = 1f, score = 5, hits = 1, sound = SoundType.Cow) {
    override val description = "🦒"
}