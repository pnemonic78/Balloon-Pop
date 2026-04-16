package pnemonic.balloon_pop

import androidx.annotation.FloatRange
import pnemonic.balloon_pop.sound.SoundType

sealed class Feedback {
    object None : Feedback()

    data class Vibrate(
        val duration: Long = 300,
        @field:FloatRange(from = 0.0, to = 1.0) val amplitude: Float = 1f
    ) : Feedback()

    data class Sound(val soundType: SoundType) : Feedback()

    data class Silence(val soundType: SoundType) : Feedback() {
        constructor(sound: Sound) : this(sound.soundType)
    }

    data class Pop(
        val soundType: SoundType,
        val duration: Long = VIBRATE_POP_DURATION,
        @field:FloatRange(from = 0.0, to = 1.0) val amplitude: Float = VIBRATE_POP_AMPLITUDE
    ) : Feedback()

    data class Hit(
        val duration: Long = VIBRATE_POP_DURATION,
        @field:FloatRange(from = 0.0, to = 1.0) val amplitude: Float = VIBRATE_POP_AMPLITUDE
    ) : Feedback()

    companion object {
        private const val VIBRATE_POP_DURATION = 50L
        private const val VIBRATE_POP_AMPLITUDE = 0.35f
    }
}

