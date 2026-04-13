package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import pnemonic.balloon_pop.model.Scene

@Composable
fun SceneView(
    modifier: Modifier = Modifier,
    scene: Scene,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier = modifier.background(Color.LightGray)) {
        content()
    }
}