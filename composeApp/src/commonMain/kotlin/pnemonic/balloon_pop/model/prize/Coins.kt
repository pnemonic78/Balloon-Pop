package pnemonic.balloon_pop.model.prize

import pnemonic.balloon_pop.sound.SoundType

class Coins : Prize(sound = SoundType.Coins) {
    override val description = "💰"
}