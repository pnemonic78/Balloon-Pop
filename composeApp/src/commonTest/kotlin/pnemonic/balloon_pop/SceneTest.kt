package pnemonic.balloon_pop

import pnemonic.balloon_pop.model.Scene
import kotlin.test.Test
import kotlin.test.assertEquals

class SceneTest {

    @Test
    fun next() {
        var scene = Scene.Garden
        assertEquals(Scene.Garden, scene)
        scene = scene.next()
        assertEquals(Scene.Beach, scene)
    }
}