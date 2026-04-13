package pnemonic.balloon_pop.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Star",
            defaultWidth = 38.571.dp,
            defaultHeight = 37.029.dp,
            viewportWidth = 38.571f,
            viewportHeight = 37.029f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC721),
                        0.573f to Color(0xFFFFCC1B),
                        0.966f to Color(0xFFFFD313)
                    ),
                    start = Offset(19.428f, 34.175f),
                    end = Offset(19.428f, 32.575f)
                )
            ) {
                moveTo(17.97f, 34.033f)
                curveTo(17.97f, 34.033f, 19.712f, 34.353f, 20.885f, 34.033f)
                curveTo(20.885f, 34.033f, 20.636f, 32.575f, 19.428f, 32.575f)
                curveTo(18.219f, 32.575f, 17.97f, 34.033f, 17.97f, 34.033f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD40613),
                        1f to Color(0xFFD40651)
                    ),
                    start = Offset(19.428f, 34.175f),
                    end = Offset(19.428f, 32.575f)
                ),
                fillAlpha = 0.28f,
                strokeAlpha = 0.28f
            ) {
                moveTo(20.885f, 34.033f)
                curveTo(20.885f, 34.033f, 19.19f, 33.411f, 17.97f, 34.033f)
                curveTo(17.97f, 34.033f, 19.712f, 34.353f, 20.885f, 34.033f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(22.451f, 1.968f)
                    lineTo(25.676f, 8.502f)
                    curveTo(26.19f, 9.544f, 27.184f, 10.266f, 28.334f, 10.433f)
                    lineTo(35.544f, 11.481f)
                    curveTo(38.44f, 11.901f, 39.596f, 15.46f, 37.501f, 17.502f)
                    lineTo(32.283f, 22.588f)
                    curveTo(31.451f, 23.399f, 31.072f, 24.568f, 31.268f, 25.713f)
                    lineTo(32.5f, 32.894f)
                    curveTo(32.994f, 35.778f, 29.967f, 37.977f, 27.377f, 36.616f)
                    lineTo(20.928f, 33.225f)
                    curveTo(19.9f, 32.684f, 18.671f, 32.684f, 17.643f, 33.225f)
                    lineTo(11.193f, 36.616f)
                    curveTo(8.603f, 37.977f, 5.577f, 35.778f, 6.071f, 32.894f)
                    lineTo(7.303f, 25.713f)
                    curveTo(7.499f, 24.568f, 7.119f, 23.399f, 6.287f, 22.588f)
                    lineTo(1.07f, 17.502f)
                    curveTo(-1.025f, 15.46f, 0.131f, 11.902f, 3.027f, 11.481f)
                    lineTo(10.237f, 10.433f)
                    curveTo(11.387f, 10.266f, 12.381f, 9.544f, 12.895f, 8.502f)
                    lineTo(16.12f, 1.968f)
                    curveTo(17.414f, -0.656f, 21.156f, -0.656f, 22.451f, 1.968f)
                    close()
                }
            ) {
                path(
                    fill = Brush.radialGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFFF86),
                            0.021f to Color(0xFFFFFC81),
                            0.22f to Color(0xFFFFE558),
                            0.399f to Color(0xFFFFD53A),
                            0.553f to Color(0xFFFFCB28),
                            0.662f to Color(0xFFFFC721),
                            0.829f to Color(0xFFFFD11B),
                            0.966f to Color(0xFFFFDD13)
                        ),
                        center = Offset(19.285f, 19.859f),
                        radius = 19.494f
                    )
                ) {
                    moveTo(-1.159f, 19.859f)
                    arcToRelative(21.203f, 20.444f, 90f, isMoreThanHalf = true, isPositiveArc = false, 40.888f, 0f)
                    arcToRelative(21.203f, 20.444f, 90f, isMoreThanHalf = true, isPositiveArc = false, -40.888f, 0f)
                    close()
                }
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.82f,
                strokeAlpha = 0.82f
            ) {
                moveTo(0.664f, 13.478f)
                curveTo(0.745f, 13.265f, 0.733f, 15.289f, 0.662f, 15.635f)
                curveTo(0.592f, 15.98f, 0.583f, 16.51f, 0.583f, 16.51f)
                curveTo(0.496f, 16.515f, 0.13f, 14.882f, 0.664f, 13.478f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.81f,
                strokeAlpha = 0.81f
            ) {
                moveTo(10.974f, 11.951f)
                curveTo(11.696f, 10.544f, 13.112f, 10.736f, 13.612f, 11.117f)
                curveTo(13.612f, 11.117f, 9.964f, 13.922f, 10.974f, 11.951f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.82f,
                strokeAlpha = 0.82f
            ) {
                moveTo(15.396f, 3.971f)
                curveTo(15.579f, 3.744f, 14.545f, 6.189f, 14.306f, 6.58f)
                curveTo(14.067f, 6.971f, 13.79f, 7.609f, 13.79f, 7.609f)
                curveTo(13.707f, 7.581f, 14.195f, 5.464f, 15.396f, 3.971f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.82f,
                strokeAlpha = 0.82f
            ) {
                moveTo(7.503f, 26.245f)
                curveTo(7.629f, 25.856f, 7.173f, 29.74f, 7.028f, 30.386f)
                curveTo(6.883f, 31.032f, 6.757f, 32.048f, 6.757f, 32.048f)
                curveTo(6.67f, 32.035f, 6.668f, 28.807f, 7.503f, 26.245f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF9751),
                        1f to Color(0xFFFF7E13)
                    ),
                    start = Offset(28.539f, 33.982f),
                    end = Offset(32.839f, 26.576f)
                ),
                fillAlpha = 0.31f,
                strokeAlpha = 0.31f
            ) {
                moveTo(31.489f, 35.694f)
                curveTo(32.509f, 33.078f, 31.768f, 28.2f, 29.889f, 24.863f)
                curveTo(29.889f, 24.863f, 30.329f, 30.707f, 30.566f, 32.568f)
                curveTo(30.803f, 34.428f, 31.489f, 35.694f, 31.489f, 35.694f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF9751),
                        1f to Color(0xFFFF7E13)
                    ),
                    start = Offset(35.085f, 14.494f),
                    end = Offset(33.433f, 22.896f)
                ),
                fillAlpha = 0.31f,
                strokeAlpha = 0.31f
            ) {
                moveTo(38.432f, 15.152f)
                curveTo(37.473f, 17.791f, 33.699f, 20.969f, 30.085f, 22.238f)
                curveTo(30.085f, 22.238f, 34.271f, 18.135f, 35.676f, 16.893f)
                curveTo(37.081f, 15.651f, 38.432f, 15.152f, 38.432f, 15.152f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.018f to Color(0xFFE85738),
                        0.153f to Color(0xFFE44D33),
                        0.383f to Color(0xFFDA3227),
                        0.679f to Color(0xFFCA0613),
                        0.68f to Color(0xFFCA0613),
                        1f to Color(0xFFD40651)
                    ),
                    center = Offset(32.887f, 23.397f),
                    radius = 2.974f
                ),
                fillAlpha = 0.28f,
                strokeAlpha = 0.28f
            ) {
                moveTo(31.482f, 26.964f)
                lineTo(31.268f, 25.713f)
                curveTo(31.072f, 24.568f, 31.451f, 23.399f, 32.283f, 22.588f)
                lineTo(35.114f, 19.829f)
                curveTo(29.651f, 24.06f, 30.276f, 23.744f, 31.482f, 26.964f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.018f to Color(0xFFE85738),
                        0.153f to Color(0xFFE44D33),
                        0.383f to Color(0xFFDA3227),
                        0.679f to Color(0xFFCA0613),
                        0.68f to Color(0xFFCA0613),
                        1f to Color(0xFFD40651)
                    ),
                    center = Offset(4.904f, 21.888f),
                    radius = 2.751f
                ),
                fillAlpha = 0.28f,
                strokeAlpha = 0.28f
            ) {
                moveTo(7.345f, 24.916f)
                curveTo(7.397f, 21.933f, 5.386f, 21.092f, 2.462f, 18.859f)
                lineTo(6.287f, 22.588f)
                curveTo(6.926f, 23.211f, 7.295f, 24.044f, 7.345f, 24.916f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.018f to Color(0xFFE85738),
                        0.153f to Color(0xFFE44D33),
                        0.383f to Color(0xFFDA3227),
                        0.679f to Color(0xFFCA0613),
                        0.68f to Color(0xFFCA0613),
                        1f to Color(0xFFD40651)
                    ),
                    center = Offset(19.715f, 34.29f),
                    radius = 8.636f
                ),
                fillAlpha = 0.28f,
                strokeAlpha = 0.28f
            ) {
                moveTo(28.257f, 36.542f)
                curveTo(26.197f, 36.308f, 20.852f, 31.553f, 19.428f, 31.553f)
                curveTo(18.01f, 31.553f, 10.224f, 38.018f, 7.813f, 36.561f)
                curveTo(8.792f, 37.118f, 10.035f, 37.225f, 11.193f, 36.616f)
                lineTo(17.642f, 33.225f)
                curveTo(18.671f, 32.684f, 19.899f, 32.684f, 20.928f, 33.225f)
                lineTo(27.377f, 36.616f)
                curveTo(28.914f, 37.424f, 30.599f, 36.973f, 31.616f, 35.874f)
                curveTo(31.025f, 36.407f, 29.899f, 36.729f, 28.257f, 36.542f)
                close()
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
