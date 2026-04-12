package pnemonic.balloon_pop.model.balloon

import pnemonic.remove

data class Bouquet(
    val balloons: List<Balloon> = emptyList()
) : Iterable<Balloon> {

    val size: Int get() = balloons.size

    fun isEmpty(): Boolean = balloons.isEmpty()

    override fun iterator(): Iterator<Balloon> {
        return balloons.iterator()
    }

    fun remove(balloon: Balloon): Bouquet {
        return copy(balloons = balloons.remove(balloon))
    }
}