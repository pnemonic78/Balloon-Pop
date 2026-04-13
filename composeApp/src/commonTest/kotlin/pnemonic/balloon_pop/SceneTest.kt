package pnemonic.balloon_pop

import pnemonic.balloon_pop.model.Scene
import kotlin.test.Test
import kotlin.test.assertEquals

class SceneTest {

    @Test
    fun next() {
        var scene = Scene.Sky
        assertEquals(Scene.Sky, scene)
        scene = scene.next()
        assertEquals(Scene.Garden, scene)
        scene = scene.next()
        assertEquals(Scene.Park, scene)
        scene = scene.next()
        assertEquals(Scene.Forest, scene)
        scene = scene.next()
        assertEquals(Scene.Rainbow, scene)
    }
}