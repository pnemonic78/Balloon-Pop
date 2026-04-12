package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

class Snake : Animal(speed = 1f, score = 5, hits = 1, soundPop = SoundType.Laser) {
    override val description = "🐍"
}