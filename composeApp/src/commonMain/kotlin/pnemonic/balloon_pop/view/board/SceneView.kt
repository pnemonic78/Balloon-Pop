package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.IntSize
import org.jetbrains.compose.resources.vectorResource
import pnemonic.balloon_pop.model.Scene
import pnemonic.balloon_pop.view.OrientationPreviews
import pnemonic.compose.isZero

@Composable
fun SceneView(
    modifier: Modifier = Modifier,
    scene: Scene,
    content: @Composable BoxScope.() -> Unit,
) {
    var size by remember { mutableStateOf(IntSize.Zero) }

    Box(
        modifier = modifier.onSizeChanged { size = it },
        contentAlignment = AbsoluteAlignment.TopLeft
    ) {
        SceneBackground(scene = scene, size = size)
        content()
    }
}

@Composable
private fun SceneBackground(modifier: Modifier = Modifier, scene: Scene, size: IntSize) {
    if (size.isZero()) return
    val image = vectorResource(scene.image)

    Image(
        modifier = modifier.fillMaxSize(),
        imageVector = image,
        contentScale = ContentScale.Crop,
        contentDescription = scene.name
    )
}

class ScenePreviewParameterProvider : PreviewParameterProvider<Scene> {
    override val values: Sequence<Scene> = Scene.entries.asSequence()
}

@Composable
@OrientationPreviews
private fun Preview(
    @PreviewParameter(ScenePreviewParameterProvider::class) scene: Scene
) {
    SceneView(
        modifier = Modifier.fillMaxSize(),
        scene = scene
    ) {}
}
