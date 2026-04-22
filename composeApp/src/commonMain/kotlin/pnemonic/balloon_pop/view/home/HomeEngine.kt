package pnemonic.balloon_pop.view.home

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.update
import pnemonic.balloon_pop.Feedback
import pnemonic.balloon_pop.engine.BalloonFactory
import pnemonic.balloon_pop.engine.BonusEngine
import pnemonic.balloon_pop.engine.GameEngine
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Scene
import pnemonic.balloon_pop.model.balloon.Bouquet

class HomeEngine(coroutineScope: CoroutineScope) : GameEngine(coroutineScope) {

    override fun createBonusEngine(): BonusEngine? {
        return null
    }

    override fun generateBouquet(board: Board): Bouquet {
        return Bouquet(BalloonFactory.allBalloons)
    }

    override fun generateScene(level: Int): Scene {
        return Scene.Sky
    }

    override suspend fun finished() {
        boardsFlow.update { it.copy(lives = Int.MAX_VALUE) }
    }

    override suspend fun notifyFeedback(feedback: Feedback) = Unit
}