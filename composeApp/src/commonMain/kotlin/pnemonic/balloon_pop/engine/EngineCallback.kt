package pnemonic.balloon_pop.engine

import pnemonic.balloon_pop.Feedback
import pnemonic.balloon_pop.model.balloon.Balloon

interface EngineCallback {
    fun touch(balloon: Balloon)
    suspend fun pop(balloon: Balloon)
    suspend fun notifyFeedback(feedback: Feedback)
}