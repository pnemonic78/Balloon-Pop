package pnemonic.balloon_pop

import pnemonic.balloon_pop.model.Difficulty
import pnemonic.balloon_pop.model.Difficulty.Companion.times
import kotlin.test.Test
import kotlin.test.assertEquals

class DifficultyTest {
    @Test
    fun multiply() {
        assertEquals(10, 10 * Difficulty.Easy)
        assertEquals(15, 10 * Difficulty.Medium)
        assertEquals(20, 10 * Difficulty.Hard)
    }
}