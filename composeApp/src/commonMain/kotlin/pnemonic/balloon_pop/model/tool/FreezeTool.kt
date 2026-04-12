package pnemonic.balloon_pop.model.tool

import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.balloon.Balloon
import pnemonic.balloon_pop.model.balloon.Bouquet

open class FreezeTool(bonus: Bonus) : BonusTool(bonus) {
    private val frozen = mutableListOf<Balloon>()

    fun freeze(bouquet: Bouquet) {
        for (balloon in bouquet) {
            if (isHit(balloon)) {
                freeze(balloon)
            }
        }
    }

    fun freeze(balloon: Balloon) {
        if ((hits > 0) && !frozen.contains(balloon)) {
            balloon.freeze(Long.MAX_VALUE)
            frozen.add(balloon)
            hits -= balloon.hits
        }
    }

    fun thaw() {
        for (balloon in frozen) {
            balloon.freeze(0L)
        }
        frozen.clear()
    }
}