package pnemonic.balloon_pop.model.tool

import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.balloon.Balloon
import pnemonic.balloon_pop.model.balloon.Bouquet
import pnemonic.half

open class AttractionTool(bonus: Bonus) : BonusTool(bonus) {
    private val trails = mutableListOf<Trail>()

    fun attract(bouquet: Bouquet) {
        if (trails.isNotEmpty()) return
        for (balloon in bouquet) {
            attract(balloon)
        }
    }

    fun attract(balloon: Balloon) {
        val x = left + width.half
        val y = top + height.half
        val trail = Trail(balloon, balloon.destinationX, balloon.destinationY)
        trails.add(trail)
        balloon.setDestination(x, y)
    }

    fun thaw() {
        for (trail in trails) {
            trail.balloon.setDestination(trail.destinationX, trail.destinationY)
        }
        trails.clear()
    }

    private data class Trail(val balloon: Balloon, val destinationX: Float, val destinationY: Float)
}