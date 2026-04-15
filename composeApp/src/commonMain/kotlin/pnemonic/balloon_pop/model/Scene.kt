package pnemonic.balloon_pop.model

import androidx.annotation.IntRange
import balloon_pop.composeapp.generated.resources.Res
import balloon_pop.composeapp.generated.resources.bg_flowers
import balloon_pop.composeapp.generated.resources.bg_lawn
import balloon_pop.composeapp.generated.resources.bg_mountains
import balloon_pop.composeapp.generated.resources.bg_rainbow
import balloon_pop.composeapp.generated.resources.bg_sky
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
    Sky(SoundType.Beach, Res.drawable.bg_sky),
    Garden(SoundType.Garden, Res.drawable.bg_flowers),
    Park(SoundType.Garden, Res.drawable.bg_lawn),
    Forest(SoundType.Forest, Res.drawable.bg_mountains),
    Rainbow(SoundType.Midday, Res.drawable.bg_rainbow);

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