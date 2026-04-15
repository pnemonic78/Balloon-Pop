package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

class Dog(size: Float = 1f, sway: Boolean = false) :
    Animal(size = size, score = 5, hits = 1, sound = SoundType.Dog, sway = sway) {
    override val description = "🐕"
}