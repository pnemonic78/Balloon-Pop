package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

abstract class Fruit(size: Float, speed: Float, score: Long, hits: Int, sway: Boolean) :
    Balloon(
        size = size,
        speed = speed,
        score = score,
        hits = hits,
        sound = SoundType.SlimeSplash,
        sway = sway
    )