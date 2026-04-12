package pnemonic.balloon_pop

import pnemonic.balloon_pop.model.Speed
import pnemonic.balloon_pop.model.Speed.Companion.times
import kotlin.test.Test
import kotlin.test.assertEquals

class SpeedTest {
    @Test
    fun multiply() {
        assertEquals(10, 10 * Speed.Slow)
        assertEquals(15, 10 * Speed.Fast)
        assertEquals(20, 10 * Speed.Faster)
    }
}