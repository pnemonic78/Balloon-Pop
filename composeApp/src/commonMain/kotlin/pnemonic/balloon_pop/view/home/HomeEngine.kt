package pnemonic.balloon_pop.view.home

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.update
import pnemonic.balloon_pop.engine.BalloonFactory
import pnemonic.balloon_pop.engine.GameEngine
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.balloon.Bouquet

class HomeEngine(coroutineScope: CoroutineScope) : GameEngine(coroutineScope) {
    override fun generateBouquet(board: Board): Bouquet {
        return Bouquet(BalloonFactory.allBalloons)
    }

    override suspend fun finished() {
        _boards.update { it.copy(lives = Int.MAX_VALUE) }
    }
}