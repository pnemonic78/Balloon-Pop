package pnemonic.balloon_pop.model

import androidx.annotation.IntRange
import balloon_pop.composeapp.generated.resources.Res
import balloon_pop.composeapp.generated.resources.bg_daisies
import balloon_pop.composeapp.generated.resources.bg_sand
import org.jetbrains.compose.resources.DrawableResource
import pnemonic.balloon_pop.Feedback
import pnemonic.balloon_pop.sound.SoundType
import kotlin.math.max

enum class Scene(
    val music: Feedback.Sound,
    val image: DrawableResource,
    // Stats are in top-left corner.
    val flipPortraitHorizontal: Boolean = false
) {
    Garden(SoundType.Garden, Res.drawable.bg_daisies),
    Beach(SoundType.Beach, Res.drawable.bg_sand);

    constructor(
        soundType: SoundType,
        image: DrawableResource,
        flipPortraitHorizontal: Boolean = false
    ) : this(
        Feedback.Sound(soundType),
        image,
        flipPortraitHorizontal
    )

    operator fun plus(other: Int): Scene {
        val values = entries
        val index = (ordinal + other) % values.size
        return values[index]
    }

    fun next(): Scene {
        return this + 1
    }

    companion object {
        fun forLevel(@IntRange(from = 1L) level: Int): Scene {
            val values = entries
            val index = max(0, level - 1) % values.size
            return values[index]
        }
    }
}