package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

abstract class Animal(
    size: Float,
    score: Long,
    hits: Int,
    sound: SoundType,
    sway: Boolean
) : Balloon(size = size, score = score, hits = hits, sound = sound, sway = sway)