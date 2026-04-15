package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

abstract class Fruit(size: Float, score: Long, hits: Int, sway: Boolean) :
    Balloon(
        size = size,
        score = score,
        hits = hits,
        sound = SoundType.SlimeSplash,
        sway = sway
    )