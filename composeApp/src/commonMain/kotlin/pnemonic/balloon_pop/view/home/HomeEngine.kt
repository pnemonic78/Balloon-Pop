package pnemonic.balloon_pop.view.home

import kotlinx.coroutines.CoroutineScope
import pnemonic.balloon_pop.engine.GameEngine

class HomeEngine(coroutineScope: CoroutineScope) : GameEngine(coroutineScope) {
//    override fun generateSwarm(board: Board): Swarm {
//        val bugs = BugFactory.allBugs
//        // Caterpillars and Worms are too slow.
//        val caterpillar = bugs.first { it is Caterpillar }
//        val worm = bugs.first { it is Worm }
//        return Swarm(bugs.remove(caterpillar).remove(worm).shuffled(rand))
//    }
//
//    override suspend fun finished() {
//        _boards.update { it.copy(lives = Int.MAX_VALUE) }
//    }
}