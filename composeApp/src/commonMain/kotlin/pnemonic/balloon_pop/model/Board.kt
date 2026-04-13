package pnemonic.balloon_pop.model

import androidx.compose.ui.geometry.Size
import pnemonic.balloon_pop.model.balloon.Bouquet
import pnemonic.balloon_pop.model.tool.Tool

data class Board(
    val size: Size = Size.Zero,
    val scene: Scene = Scene.Sky,
    val level: Int = 0,
    val difficulty: Difficulty = Difficulty.Easy,
    val score: Long = 0,
    val lives: Int = LIVES,
    val bonuses: List<Bonus> = emptyList(),
    val bouquet: Bouquet = Bouquet(),
    // only 1 active tool allowed - so not a list of tools.
    val tool: Tool? = null,
) {
    val width: Float get() = size.width
    val height: Float get() = size.height

    fun setSize(width: Float, height: Float): Board {
        return copy(size = Size(width, height))
    }

    fun isLevelFinished(): Boolean = bouquet.isEmpty()

    companion object {
        const val LIVES = 5
        const val MAX_LIVES = 10
    }
}