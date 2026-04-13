package pnemonic.balloon_pop.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Watermelon: ImageVector
    get() {
        if (_Watermelon != null) {
            return _Watermelon!!
        }
        _Watermelon = ImageVector.Builder(
            name = "Watermelon",
            defaultWidth = 15.381.dp,
            defaultHeight = 17.849.dp,
            viewportWidth = 15.381f,
            viewportHeight = 17.849f
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB3DB00),
                        0.155f to Color(0xFFAED600),
                        0.346f to Color(0xFF9EC700),
                        0.557f to Color(0xFF85AE00),
                        0.781f to Color(0xFF628C00),
                        0.995f to Color(0xFF3A6400)
                    ),
                    center = Offset(7.691f, 8.925f),
                    radius = 8.29f
                )
            ) {
                moveTo(15.273f, 8.925f)
                curveTo(15.273f, 13.794f, 12.104f, 17.741f, 7.751f, 17.741f)
                curveTo(3.397f, 17.741f, 0.108f, 13.794f, 0.108f, 8.925f)
                curveTo(0.108f, 4.056f, 3.397f, 0.109f, 7.751f, 0.109f)
                curveTo(12.105f, 0.109f, 15.273f, 4.056f, 15.273f, 8.925f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB3DB00),
                        0.155f to Color(0xFFAED600),
                        0.346f to Color(0xFF9EC700),
                        0.557f to Color(0xFF85AE00),
                        0.781f to Color(0xFF628C00),
                        0.995f to Color(0xFF3A6400)
                    ),
                    center = Offset(4.411f, 6.126f),
                    radius = 10.222f
                )
            ) {
                moveTo(15.381f, 8.925f)
                curveTo(15.381f, 11.331f, 14.616f, 13.57f, 13.228f, 15.228f)
                curveTo(12.58f, 16.002f, 11.82f, 16.617f, 10.984f, 17.056f)
                curveTo(10.662f, 17.225f, 10.327f, 17.369f, 9.983f, 17.485f)
                curveTo(9.518f, 17.642f, 9.034f, 17.75f, 8.539f, 17.805f)
                curveTo(8.279f, 17.834f, 8.016f, 17.849f, 7.751f, 17.849f)
                curveTo(7.516f, 17.849f, 7.285f, 17.838f, 7.056f, 17.814f)
                curveTo(6.303f, 17.741f, 5.585f, 17.549f, 4.914f, 17.253f)
                curveTo(4.487f, 17.066f, 4.081f, 16.837f, 3.696f, 16.57f)
                lineTo(3.695f, 16.57f)
                curveTo(1.463f, 15.02f, 0f, 12.205f, 0f, 8.925f)
                curveTo(0f, 5.21f, 1.876f, 2.094f, 4.619f, 0.733f)
                lineTo(4.62f, 0.733f)
                curveTo(5.057f, 0.516f, 5.517f, 0.344f, 5.994f, 0.221f)
                curveTo(6.247f, 0.156f, 6.505f, 0.105f, 6.767f, 0.068f)
                curveTo(7.088f, 0.023f, 7.417f, -0f, 7.751f, -0f)
                curveTo(7.862f, -0f, 7.973f, 0.003f, 8.083f, 0.008f)
                curveTo(8.366f, 0.021f, 8.645f, 0.051f, 8.921f, 0.097f)
                lineTo(8.921f, 0.097f)
                curveTo(9.299f, 0.161f, 9.668f, 0.255f, 10.027f, 0.379f)
                curveTo(11.243f, 0.8f, 12.34f, 1.561f, 13.227f, 2.621f)
                curveTo(14.616f, 4.28f, 15.381f, 6.518f, 15.381f, 8.925f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0E3300))) {
                moveTo(8.539f, 17.805f)
                curveTo(8.279f, 17.834f, 8.016f, 17.849f, 7.751f, 17.849f)
                curveTo(7.516f, 17.849f, 7.285f, 17.838f, 7.056f, 17.814f)
                curveTo(3.901f, 9.938f, 5.658f, 3.072f, 6.767f, 0.069f)
                curveTo(7.089f, 0.023f, 7.417f, 0f, 7.751f, 0f)
                curveTo(7.862f, 0f, 7.973f, 0.003f, 8.083f, 0.008f)
                curveTo(9.243f, 3.194f, 11.36f, 10.755f, 8.539f, 17.805f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0E3300))) {
                moveTo(4.914f, 17.253f)
                curveTo(4.146f, 15.494f, 3.04f, 12.415f, 2.993f, 9.197f)
                curveTo(2.944f, 5.921f, 4.822f, 2.213f, 5.995f, 0.221f)
                curveTo(5.517f, 0.344f, 5.057f, 0.516f, 4.62f, 0.734f)
                lineTo(4.619f, 0.734f)
                curveTo(3.129f, 2.332f, 1.428f, 4.901f, 1.234f, 8.424f)
                curveTo(1.038f, 11.987f, 2.426f, 14.788f, 3.696f, 16.571f)
                lineTo(3.696f, 16.571f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0E3300))) {
                moveTo(10.984f, 17.056f)
                curveTo(10.662f, 17.226f, 10.327f, 17.369f, 9.983f, 17.485f)
                curveTo(10.719f, 15.707f, 11.857f, 12.471f, 12.007f, 9.187f)
                curveTo(12.152f, 6.036f, 10.126f, 2.125f, 8.922f, 0.098f)
                curveTo(9.299f, 0.162f, 9.669f, 0.256f, 10.027f, 0.38f)
                curveTo(11.589f, 1.96f, 13.545f, 4.663f, 13.751f, 8.42f)
                curveTo(13.962f, 12.248f, 12.32f, 15.264f, 10.984f, 17.056f)
                close()
            }
        }.build()

        return _Watermelon!!
    }

@Suppress("ObjectPropertyName")
private var _Watermelon: ImageVector? = null
