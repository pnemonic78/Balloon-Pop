package pnemonic.balloon_pop.wallpaper

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.update
import pnemonic.balloon_pop.Feedback
import pnemonic.balloon_pop.engine.BonusEngine
import pnemonic.balloon_pop.engine.GameEngine
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Scene

class WallpaperGameEngine(coroutineScope: CoroutineScope) : GameEngine(coroutineScope) {

    override val tick = TICK
    override val tickSpeed = TICK_SPEED
    override val delayPerBalloon = TICK * 150

    override fun createBonusEngine(): BonusEngine? {
        return null
    }

    override fun generateLevel(board: Board): Int {
        // all types of ballons for a random scene.
        return 100 + rand.nextInt(0, Scene.entries.size)
    }

    override suspend fun finished() {
        boardsFlow.update { it.copy(lives = Int.MAX_VALUE) }
    }

    override suspend fun notifyFeedback(feedback: Feedback) = Unit

    companion object {
        private const val TICK = 15L
        private const val TICK_SPEED = 1L
    }
}