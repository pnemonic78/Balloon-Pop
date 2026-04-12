package pnemonic.balloon_pop.model.tool

import pnemonic.balloon_pop.model.Bonus

abstract class BonusTool(val bonus: Bonus) : Tool() {
    var hits: Long = bonus.hits
    override val sound = bonus.sound
    override val description = bonus.description
}