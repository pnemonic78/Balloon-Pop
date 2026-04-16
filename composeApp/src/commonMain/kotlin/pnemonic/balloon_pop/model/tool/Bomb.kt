package pnemonic.balloon_pop.model.tool

import androidx.compose.ui.geometry.Size
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.balloon.Balloon
import pnemonic.balloon_pop.model.contains

class Bomb(bonus: Bonus.Bomb) : PopTool(bonus, isSingleton = true) {
    override fun isHit(balloon: Balloon, boardSize: Size): Boolean {
        // Explode ALL visible balloons.
        return boardSize.contains(balloon)
    }
}