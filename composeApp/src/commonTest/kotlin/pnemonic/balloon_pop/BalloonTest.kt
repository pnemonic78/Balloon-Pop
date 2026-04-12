package pnemonic.balloon_pop

import androidx.compose.ui.geometry.Rect
import pnemonic.balloon_pop.model.balloon.Round
import pnemonic.balloon_pop.model.balloon.contains
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BalloonTest {

    @Test
    fun `rect contains`() {
        val board = Rect(0f, 0f, 1000f, 1000f)

        val balloon = Round()
        balloon.setSize(100f, 100f)

        // top-left in board
        balloon.moveTo(0f, 0f)
        assertTrue(board.contains(balloon))

        // bottom-left out of board
        balloon.moveTo(0f, 1001f)
        assertFalse(board.contains(balloon))

        // bottom-right out of board
        balloon.moveTo(1000f, 1001f)
        assertFalse(board.contains(balloon))

        // top-left corner of board
        balloon.moveTo(-50f, -50f)
        assertTrue(board.contains(balloon))

        // top-middle side of board
        balloon.moveTo(500f, -50f)
        assertTrue(board.contains(balloon))

        // top=right corner of board
        balloon.moveTo(950f, -50f)
        assertTrue(board.contains(balloon))

        // middle-left side of board
        balloon.moveTo(-50f, 500f)
        assertTrue(board.contains(balloon))

        // middle of board
        balloon.moveTo(500f, 500f)
        assertTrue(board.contains(balloon))

        // middle-right side of board
        balloon.moveTo(950f, 500f)
        assertTrue(board.contains(balloon))

        // bottom-left corner of board
        balloon.moveTo(-50f, 950f)
        assertTrue(board.contains(balloon))

        // bottom-middle of board
        balloon.moveTo(500f, 950f)
        assertTrue(board.contains(balloon))

        // bottom-right corner of board
        balloon.moveTo(950f, 950f)
        assertTrue(board.contains(balloon))
    }
}