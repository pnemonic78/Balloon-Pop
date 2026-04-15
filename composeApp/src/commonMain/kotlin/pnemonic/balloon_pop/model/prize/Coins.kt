package pnemonic.balloon_pop.model.prize

import pnemonic.balloon_pop.sound.SoundType

class Coins(score: Long) : Prize(score = score, sound = SoundType.Coins) {
    override val description = "💰"
}