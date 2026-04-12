package pnemonic.balloon_pop.engine

import kotlinx.coroutines.CoroutineScope
import pnemonic.balloon_pop.Feedback
import pnemonic.balloon_pop.model.balloon.Balloon

open class GameEngine(private val coroutineScope: CoroutineScope) : EngineCallback {
    override fun touch(balloon: Balloon) {
        TODO("Not yet implemented")
    }

    override suspend fun pop(balloon: Balloon) {
        TODO("Not yet implemented")
    }

    override suspend fun notifyFeedback(feedback: Feedback) {
        TODO("Not yet implemented")
    }
}