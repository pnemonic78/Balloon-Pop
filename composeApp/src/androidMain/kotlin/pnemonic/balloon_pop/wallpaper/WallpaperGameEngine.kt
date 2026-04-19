package pnemonic.balloon_pop.wallpaper

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.update
import pnemonic.balloon_pop.engine.GameEngine
import pnemonic.balloon_pop.model.Board

class WallpaperGameEngine(coroutineScope: CoroutineScope) : GameEngine(coroutineScope) {
    override fun generateLevel(board: Board): Int {
        return 11 // all types of ballons
    }

    override fun generateBalloons(board: Board): Board {
        val board = super.generateBalloons(board)
        val bouquet = board.bouquet
        var delay = 0L

        for (balloon in bouquet) {
            balloon.score = 0
            balloon.setTick(TICK)
            balloon.freeze(delay)
            delay += DELAY_PER_BALLOON
        }

        return board
    }

    override suspend fun finished() {
        _boards.update { it.copy(lives = Int.MAX_VALUE) }
    }

    companion object {
        private const val TICK = 1L
        private const val DELAY_PER_BALLOON = TICK * 1000
    }
}