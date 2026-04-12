package pnemonic.balloon_pop.model.balloon

import pnemonic.balloon_pop.sound.SoundType

abstract class Animal(size: Float, speed: Float, score: Long, hits: Int, sound: SoundType) :
    Balloon(size = size, speed = speed, score = score, hits = hits, sound = sound)