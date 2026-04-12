package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

abstract class Animal(speed: Float, score: Long, hits: Int, soundPop: SoundType) :
    Balloon(speed = speed, score = score, hits = hits, soundPop = soundPop)