package pnemonic.balloon_pop.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import pnemonic.balloon_pop.sound.SoundType

typealias BonusCallback = (Bonus) -> Unit

sealed class Bonus(
    // Score required to activate the bonus.
    val score: Long,
    //How many hits does the bonus provide?
    val hits: Long,
    val description: String,
    val sound: SoundType,
    progress: Long = 0
) {
    var progress by mutableLongStateOf(progress)
        private set
    var isActive by mutableStateOf(progress >= score)
        private set

    private fun setProgressImpl(value: Long) {
        progress = value
        isActive = value >= score
    }

    fun incrementProgress(delta: Long) {
        setProgressImpl(progress + delta)
    }

    fun clear() {
        setProgressImpl(0)
    }

    object None : Bonus(score = 0, hits = 0, description = "", sound = SoundType.None)

    // Attract balloons to the flower.
    class Flower(progress: Long = 0) : Bonus(
        score = 100,
        hits = 1,
        description = "🌼",
        sound = SoundType.Pop,
        progress = progress
    )

    // Extra life.
    class Life(progress: Long = 0) : Bonus(
        score = 100,
        hits = 1,
        description = "💝",
        sound = SoundType.Kiss,
        progress = progress
    )

    // Add to main score.
    class Score(progress: Long = 0, hits: Long = 2000) : Bonus(
        score = 1000,
        hits = hits,
        description = "🏆",
        sound = SoundType.Clang,
        progress = progress
    )
}