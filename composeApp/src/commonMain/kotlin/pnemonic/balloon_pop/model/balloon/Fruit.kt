package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

abstract class Fruit(speed: Float, score: Long, hits: Int) :
    Balloon(speed = speed, score = score, hits = hits, soundPop = SoundType.SlimeSplash)