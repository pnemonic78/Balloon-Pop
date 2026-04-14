package pnemonic.balloon_pop.view

import androidx.compose.ui.tooling.preview.Preview

internal const val previewWidthDp = 300
internal const val previewHeightDp = 500
internal const val previewColor = 0xFF00BFFF

@Preview(
    name = "portrait",
    group = "orientation",
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
@Preview(
    name = "landscape",
    group = "orientation",
    widthDp = previewHeightDp,
    heightDp = previewWidthDp
)
annotation class OrientationPreviews