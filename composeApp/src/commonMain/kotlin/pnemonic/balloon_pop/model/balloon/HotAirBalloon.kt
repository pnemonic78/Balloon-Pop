package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

class HotAirBalloon(size: Float = 1f, sway: Boolean = false) :
    Balloon(size = size, speed = 0.5f, score = -15, hits = 1, sound = SoundType.Laser, sway = sway) {
    override val description = "🪂"
}