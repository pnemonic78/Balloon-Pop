package pnemonic.balloon_pop.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Coins: ImageVector
    get() {
        if (_Coins != null) {
            return _Coins!!
        }
        _Coins = ImageVector.Builder(
            name = "Coins",
            defaultWidth = 24.499.dp,
            defaultHeight = 24.748.dp,
            viewportWidth = 24.499f,
            viewportHeight = 24.748f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(9.359f, 14.544f),
                    end = Offset(23.447f, 14.544f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.359f, 13.555f)
                curveTo(9.359f, 15.494f, 12.513f, 17.066f, 16.403f, 17.066f)
                curveTo(20.293f, 17.066f, 23.447f, 15.494f, 23.447f, 13.555f)
                lineTo(23.446f, 12.021f)
                lineTo(9.359f, 12.021f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.418f, 12.1f)
                curveTo(9.418f, 14.068f, 12.521f, 15.663f, 16.348f, 15.663f)
                curveTo(20.176f, 15.663f, 23.279f, 14.068f, 23.279f, 12.1f)
                curveTo(23.279f, 10.132f, 20.176f, 8.537f, 16.348f, 8.537f)
                curveTo(12.521f, 8.537f, 9.418f, 10.132f, 9.418f, 12.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.024f, 11.844f)
                curveTo(9.979f, 13.581f, 12.798f, 15.064f, 16.321f, 15.157f)
                curveTo(19.843f, 15.249f, 22.736f, 13.915f, 22.782f, 12.178f)
                curveTo(22.827f, 10.441f, 20.008f, 8.958f, 16.485f, 8.866f)
                curveTo(12.962f, 8.774f, 10.07f, 10.107f, 10.024f, 11.844f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE0C0A8),
                        1f to Color(0xFF663D1F)
                    ),
                    start = Offset(9.995f, 12.1f),
                    end = Offset(22.52f, 12.1f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.995f, 12.1f)
                curveTo(9.995f, 13.831f, 12.799f, 15.234f, 16.258f, 15.234f)
                curveTo(19.716f, 15.234f, 22.52f, 13.831f, 22.52f, 12.1f)
                curveTo(22.52f, 10.37f, 19.716f, 8.967f, 16.258f, 8.967f)
                curveTo(12.799f, 8.967f, 9.995f, 10.37f, 9.995f, 12.1f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(10.069f, 10.524f),
                    end = Offset(22.737f, 10.524f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.725f, 12.207f)
                curveTo(22.523f, 10.548f, 19.77f, 9.233f, 16.403f, 9.233f)
                curveTo(13.036f, 9.233f, 10.282f, 10.548f, 10.081f, 12.207f)
                curveTo(10.073f, 12.142f, 10.069f, 12.077f, 10.069f, 12.011f)
                curveTo(10.069f, 10.261f, 12.904f, 8.842f, 16.403f, 8.842f)
                curveTo(19.901f, 8.842f, 22.737f, 10.261f, 22.737f, 12.011f)
                curveTo(22.737f, 12.077f, 22.733f, 12.142f, 22.725f, 12.207f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(10.411f, 12.881f),
                    end = Offset(24.498f, 12.881f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.411f, 11.893f)
                curveTo(10.411f, 13.832f, 13.565f, 15.404f, 17.455f, 15.404f)
                curveTo(21.345f, 15.404f, 24.499f, 13.832f, 24.499f, 11.893f)
                lineTo(24.498f, 10.359f)
                lineTo(10.411f, 10.359f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF663D1F),
                        1f to Color.White
                    ),
                    start = Offset(10.411f, 12.192f),
                    end = Offset(11.857f, 12.192f)
                ),
                fillAlpha = 0.5f,
                strokeAlpha = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.857f, 12.489f)
                lineTo(11.857f, 14.025f)
                curveTo(10.95f, 13.434f, 10.411f, 12.695f, 10.411f, 11.893f)
                lineTo(10.411f, 10.359f)
                curveTo(10.415f, 11.16f, 10.954f, 11.898f, 11.857f, 12.489f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.469f, 10.437f)
                curveTo(10.469f, 12.405f, 13.572f, 14f, 17.4f, 14f)
                curveTo(21.228f, 14f, 24.331f, 12.405f, 24.331f, 10.437f)
                curveTo(24.331f, 8.469f, 21.227f, 6.874f, 17.4f, 6.874f)
                curveTo(13.572f, 6.874f, 10.469f, 8.47f, 10.469f, 10.437f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE878),
                        1f to Color(0xFFE6A729)
                    ),
                    start = Offset(10.411f, 10.349f),
                    end = Offset(24.498f, 10.349f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.411f, 10.349f)
                curveTo(10.411f, 12.295f, 13.565f, 13.873f, 17.455f, 13.873f)
                curveTo(21.345f, 13.873f, 24.499f, 12.296f, 24.499f, 10.349f)
                curveTo(24.499f, 8.403f, 21.345f, 6.825f, 17.455f, 6.825f)
                curveTo(13.564f, 6.825f, 10.411f, 8.403f, 10.411f, 10.349f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.076f, 10.182f)
                curveTo(11.03f, 11.919f, 13.849f, 13.402f, 17.372f, 13.495f)
                curveTo(20.895f, 13.587f, 23.788f, 12.253f, 23.833f, 10.516f)
                curveTo(23.879f, 8.779f, 21.06f, 7.296f, 17.537f, 7.204f)
                curveTo(14.014f, 7.111f, 11.121f, 8.445f, 11.076f, 10.182f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE878),
                        1f to Color(0xFFED9E1F)
                    ),
                    start = Offset(11.12f, 10.349f),
                    end = Offset(23.789f, 10.349f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.12f, 10.349f)
                curveTo(11.12f, 12.099f, 13.956f, 13.518f, 17.455f, 13.518f)
                curveTo(20.953f, 13.518f, 23.789f, 12.099f, 23.789f, 10.349f)
                curveTo(23.789f, 8.599f, 20.953f, 7.18f, 17.455f, 7.18f)
                curveTo(13.956f, 7.18f, 11.12f, 8.599f, 11.12f, 10.349f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(11.12f, 8.862f),
                    end = Offset(23.789f, 8.862f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23.777f, 10.545f)
                curveTo(23.575f, 8.886f, 20.821f, 7.571f, 17.455f, 7.571f)
                curveTo(14.087f, 7.571f, 11.334f, 8.886f, 11.132f, 10.545f)
                curveTo(11.124f, 10.48f, 11.12f, 10.415f, 11.12f, 10.349f)
                curveTo(11.12f, 8.599f, 13.956f, 7.18f, 17.455f, 7.18f)
                curveTo(20.953f, 7.18f, 23.789f, 8.599f, 23.789f, 10.349f)
                curveTo(23.789f, 10.415f, 23.785f, 10.48f, 23.777f, 10.545f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(8.833f, 11.219f),
                    end = Offset(22.921f, 11.219f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.833f, 10.231f)
                curveTo(8.833f, 12.17f, 11.987f, 13.742f, 15.877f, 13.742f)
                curveTo(19.767f, 13.742f, 22.921f, 12.17f, 22.921f, 10.231f)
                lineTo(22.921f, 8.697f)
                lineTo(8.833f, 8.697f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF663D1F),
                        1f to Color.White
                    ),
                    start = Offset(8.833f, 10.53f),
                    end = Offset(10.28f, 10.53f)
                ),
                fillAlpha = 0.5f,
                strokeAlpha = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.28f, 10.826f)
                lineTo(10.28f, 12.362f)
                curveTo(9.372f, 11.771f, 8.833f, 11.032f, 8.833f, 10.231f)
                lineTo(8.833f, 8.697f)
                curveTo(8.838f, 9.497f, 9.376f, 10.236f, 10.28f, 10.826f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.892f, 8.775f)
                curveTo(8.892f, 10.743f, 11.995f, 12.338f, 15.822f, 12.338f)
                curveTo(19.65f, 12.338f, 22.753f, 10.743f, 22.753f, 8.775f)
                curveTo(22.753f, 6.807f, 19.65f, 5.212f, 15.822f, 5.212f)
                curveTo(11.995f, 5.212f, 8.892f, 6.807f, 8.892f, 8.775f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE878),
                        1f to Color(0xFFE6A729)
                    ),
                    start = Offset(8.833f, 8.687f),
                    end = Offset(22.921f, 8.687f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.833f, 8.687f)
                curveTo(8.833f, 10.633f, 11.987f, 12.211f, 15.877f, 12.211f)
                curveTo(19.767f, 12.211f, 22.921f, 10.633f, 22.921f, 8.687f)
                curveTo(22.921f, 6.74f, 19.767f, 5.163f, 15.877f, 5.163f)
                curveTo(11.987f, 5.163f, 8.833f, 6.741f, 8.833f, 8.687f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.498f, 8.52f)
                curveTo(9.453f, 10.257f, 12.272f, 11.74f, 15.795f, 11.832f)
                curveTo(19.317f, 11.925f, 22.21f, 10.591f, 22.256f, 8.854f)
                curveTo(22.301f, 7.117f, 19.482f, 5.634f, 15.959f, 5.541f)
                curveTo(12.436f, 5.449f, 9.544f, 6.783f, 9.498f, 8.52f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF0CC62),
                        1f to Color(0xFFED9E1F)
                    ),
                    start = Offset(9.543f, 8.687f),
                    end = Offset(22.211f, 8.687f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.543f, 8.687f)
                curveTo(9.543f, 10.437f, 12.379f, 11.856f, 15.877f, 11.856f)
                curveTo(19.375f, 11.856f, 22.211f, 10.437f, 22.211f, 8.687f)
                curveTo(22.211f, 6.937f, 19.375f, 5.518f, 15.877f, 5.518f)
                curveTo(12.379f, 5.518f, 9.543f, 6.937f, 9.543f, 8.687f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(9.543f, 7.2f),
                    end = Offset(22.211f, 7.2f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.199f, 8.883f)
                curveTo(21.997f, 7.223f, 19.244f, 5.909f, 15.877f, 5.909f)
                curveTo(12.51f, 5.909f, 9.757f, 7.224f, 9.555f, 8.883f)
                curveTo(9.547f, 8.818f, 9.543f, 8.753f, 9.543f, 8.687f)
                curveTo(9.543f, 6.937f, 12.379f, 5.518f, 15.877f, 5.518f)
                curveTo(19.375f, 5.518f, 22.211f, 6.937f, 22.211f, 8.687f)
                curveTo(22.211f, 8.753f, 22.207f, 8.818f, 22.199f, 8.883f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(9.885f, 9.557f),
                    end = Offset(23.972f, 9.557f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.885f, 8.569f)
                curveTo(9.885f, 10.508f, 13.039f, 12.08f, 16.929f, 12.08f)
                curveTo(20.819f, 12.08f, 23.973f, 10.508f, 23.973f, 8.569f)
                lineTo(23.972f, 7.034f)
                lineTo(9.885f, 7.034f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.943f, 7.113f)
                curveTo(9.943f, 9.081f, 13.046f, 10.676f, 16.874f, 10.676f)
                curveTo(20.701f, 10.676f, 23.804f, 9.081f, 23.804f, 7.113f)
                curveTo(23.804f, 5.145f, 20.701f, 3.55f, 16.874f, 3.55f)
                curveTo(13.046f, 3.55f, 9.943f, 5.145f, 9.943f, 7.113f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE878),
                        1f to Color(0xFFE6A729)
                    ),
                    start = Offset(9.885f, 7.025f),
                    end = Offset(23.972f, 7.025f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.885f, 7.025f)
                curveTo(9.885f, 8.971f, 13.039f, 10.549f, 16.929f, 10.549f)
                curveTo(20.819f, 10.549f, 23.973f, 8.971f, 23.973f, 7.025f)
                curveTo(23.973f, 5.078f, 20.819f, 3.5f, 16.929f, 3.5f)
                curveTo(13.039f, 3.501f, 9.885f, 5.078f, 9.885f, 7.025f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.55f, 6.858f)
                curveTo(10.504f, 8.595f, 13.323f, 10.078f, 16.846f, 10.17f)
                curveTo(20.369f, 10.263f, 23.262f, 8.929f, 23.307f, 7.192f)
                curveTo(23.353f, 5.455f, 20.534f, 3.972f, 17.011f, 3.879f)
                curveTo(13.488f, 3.787f, 10.595f, 5.12f, 10.55f, 6.858f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE878),
                        1f to Color(0xFFED9E1F)
                    ),
                    start = Offset(10.595f, 7.025f),
                    end = Offset(23.263f, 7.025f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.595f, 7.025f)
                curveTo(10.595f, 8.775f, 13.43f, 10.194f, 16.929f, 10.194f)
                curveTo(20.427f, 10.194f, 23.263f, 8.775f, 23.263f, 7.025f)
                curveTo(23.263f, 5.274f, 20.427f, 3.856f, 16.929f, 3.856f)
                curveTo(13.43f, 3.856f, 10.595f, 5.274f, 10.595f, 7.025f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(10.595f, 5.538f),
                    end = Offset(23.263f, 5.538f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23.251f, 7.22f)
                curveTo(23.049f, 5.561f, 20.296f, 4.247f, 16.929f, 4.247f)
                curveTo(13.562f, 4.247f, 10.808f, 5.562f, 10.607f, 7.22f)
                curveTo(10.599f, 7.156f, 10.595f, 7.091f, 10.595f, 7.025f)
                curveTo(10.595f, 5.274f, 13.43f, 3.856f, 16.929f, 3.856f)
                curveTo(20.427f, 3.856f, 23.263f, 5.274f, 23.263f, 7.025f)
                curveTo(23.263f, 7.091f, 23.259f, 7.156f, 23.251f, 7.22f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(8.57f, 7.895f),
                    end = Offset(22.658f, 7.895f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.57f, 6.907f)
                curveTo(8.57f, 8.846f, 11.724f, 10.417f, 15.614f, 10.417f)
                curveTo(19.504f, 10.417f, 22.658f, 8.846f, 22.658f, 6.907f)
                lineTo(22.658f, 5.372f)
                lineTo(8.57f, 5.372f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.629f, 5.451f)
                curveTo(8.629f, 7.419f, 11.732f, 9.014f, 15.56f, 9.014f)
                curveTo(19.387f, 9.014f, 22.49f, 7.419f, 22.49f, 5.451f)
                curveTo(22.49f, 3.483f, 19.387f, 1.888f, 15.56f, 1.888f)
                curveTo(11.732f, 1.888f, 8.629f, 3.483f, 8.629f, 5.451f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE878),
                        1f to Color(0xFFE6A729)
                    ),
                    start = Offset(8.57f, 5.363f),
                    end = Offset(22.658f, 5.363f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.57f, 5.363f)
                curveTo(8.57f, 7.309f, 11.724f, 8.887f, 15.614f, 8.887f)
                curveTo(19.504f, 8.887f, 22.658f, 7.309f, 22.658f, 5.363f)
                curveTo(22.658f, 3.416f, 19.504f, 1.838f, 15.614f, 1.838f)
                curveTo(11.724f, 1.839f, 8.57f, 3.416f, 8.57f, 5.363f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.235f, 5.196f)
                curveTo(9.19f, 6.933f, 12.009f, 8.416f, 15.532f, 8.508f)
                curveTo(19.054f, 8.601f, 21.947f, 7.267f, 21.993f, 5.53f)
                curveTo(22.038f, 3.793f, 19.219f, 2.31f, 15.696f, 2.217f)
                curveTo(12.174f, 2.125f, 9.281f, 3.458f, 9.235f, 5.196f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF0CC62),
                        1f to Color(0xFFED9E1F)
                    ),
                    start = Offset(9.28f, 5.363f),
                    end = Offset(21.948f, 5.363f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.28f, 5.363f)
                curveTo(9.28f, 7.113f, 12.116f, 8.532f, 15.614f, 8.532f)
                curveTo(19.112f, 8.532f, 21.948f, 7.113f, 21.948f, 5.363f)
                curveTo(21.948f, 3.612f, 19.112f, 2.193f, 15.614f, 2.193f)
                curveTo(12.116f, 2.193f, 9.28f, 3.612f, 9.28f, 5.363f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(9.28f, 3.876f),
                    end = Offset(21.948f, 3.876f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.936f, 5.558f)
                curveTo(21.734f, 3.899f, 18.981f, 2.585f, 15.614f, 2.585f)
                curveTo(12.247f, 2.585f, 9.494f, 3.899f, 9.292f, 5.558f)
                curveTo(9.284f, 5.494f, 9.28f, 5.428f, 9.28f, 5.363f)
                curveTo(9.28f, 3.612f, 12.116f, 2.193f, 15.614f, 2.193f)
                curveTo(19.112f, 2.193f, 21.948f, 3.612f, 21.948f, 5.363f)
                curveTo(21.948f, 5.428f, 21.944f, 5.494f, 21.936f, 5.558f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(9.622f, 6.057f),
                    end = Offset(23.709f, 6.057f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.622f, 5.068f)
                curveTo(9.622f, 7.007f, 12.776f, 8.579f, 16.666f, 8.579f)
                curveTo(20.556f, 8.579f, 23.71f, 7.007f, 23.71f, 5.068f)
                lineTo(23.709f, 3.534f)
                lineTo(9.622f, 3.534f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.681f, 3.613f)
                curveTo(9.681f, 5.581f, 12.784f, 7.176f, 16.611f, 7.176f)
                curveTo(20.439f, 7.176f, 23.542f, 5.581f, 23.542f, 3.613f)
                curveTo(23.542f, 1.645f, 20.439f, 0.049f, 16.611f, 0.049f)
                curveTo(12.783f, 0.049f, 9.681f, 1.645f, 9.681f, 3.613f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE878),
                        1f to Color(0xFFE6A729)
                    ),
                    start = Offset(9.622f, 3.524f),
                    end = Offset(23.709f, 3.524f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.622f, 3.524f)
                curveTo(9.622f, 5.471f, 12.776f, 7.049f, 16.666f, 7.049f)
                curveTo(20.556f, 7.049f, 23.71f, 5.471f, 23.71f, 3.524f)
                curveTo(23.71f, 1.578f, 20.556f, 0f, 16.666f, 0f)
                curveTo(12.776f, 0f, 9.622f, 1.578f, 9.622f, 3.524f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.287f, 3.357f)
                curveTo(10.241f, 5.095f, 13.06f, 6.578f, 16.583f, 6.67f)
                curveTo(20.106f, 6.762f, 22.999f, 5.429f, 23.044f, 3.691f)
                curveTo(23.09f, 1.954f, 20.271f, 0.471f, 16.748f, 0.379f)
                curveTo(13.225f, 0.287f, 10.332f, 1.62f, 10.287f, 3.357f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF0CC62),
                        1f to Color(0xFFED9E1F)
                    ),
                    start = Offset(10.332f, 3.524f),
                    end = Offset(23f, 3.524f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.332f, 3.524f)
                curveTo(10.332f, 5.274f, 13.167f, 6.693f, 16.666f, 6.693f)
                curveTo(20.164f, 6.693f, 23f, 5.274f, 23f, 3.524f)
                curveTo(23f, 1.774f, 20.164f, 0.355f, 16.666f, 0.355f)
                curveTo(13.167f, 0.355f, 10.332f, 1.774f, 10.332f, 3.524f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(10.332f, 2.038f),
                    end = Offset(23f, 2.038f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.988f, 3.72f)
                curveTo(22.786f, 2.061f, 20.033f, 0.747f, 16.666f, 0.747f)
                curveTo(13.299f, 0.747f, 10.545f, 2.061f, 10.344f, 3.72f)
                curveTo(10.336f, 3.655f, 10.332f, 3.59f, 10.332f, 3.524f)
                curveTo(10.332f, 1.774f, 13.167f, 0.355f, 16.666f, 0.355f)
                curveTo(20.164f, 0.355f, 23f, 1.774f, 23f, 3.524f)
                curveTo(23f, 3.59f, 22.996f, 3.655f, 22.988f, 3.72f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFEE76),
                        1f to Color(0xFF1D1D1B)
                    ),
                    start = Offset(10.344f, 2.716f),
                    end = Offset(22.7f, 2.716f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.666f, 0.746f)
                curveTo(13.426f, 0.746f, 10.754f, 1.964f, 10.377f, 3.534f)
                curveTo(10.362f, 3.595f, 10.351f, 3.657f, 10.343f, 3.72f)
                curveTo(10.355f, 3.816f, 10.375f, 3.911f, 10.403f, 4.004f)
                curveTo(10.475f, 4.24f, 10.599f, 4.469f, 10.77f, 4.686f)
                lineTo(10.826f, 4.677f)
                lineTo(18.683f, 3.534f)
                lineTo(22.7f, 2.95f)
                curveTo(21.884f, 1.672f, 19.491f, 0.746f, 16.666f, 0.746f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFEE76),
                        1f to Color(0xFF1D1D1B)
                    ),
                    start = Offset(9.622f, 2.51f),
                    end = Offset(23.652f, 2.51f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.287f, 3.357f)
                curveTo(10.327f, 1.811f, 12.624f, 0.584f, 15.613f, 0.399f)
                curveTo(15.956f, 0.37f, 16.307f, 0.355f, 16.666f, 0.355f)
                curveTo(19.838f, 0.355f, 22.466f, 1.522f, 22.928f, 3.045f)
                curveTo(22.945f, 3.087f, 22.959f, 3.13f, 22.973f, 3.173f)
                lineTo(23.653f, 3.074f)
                curveTo(23.211f, 1.34f, 20.251f, 0f, 16.666f, 0f)
                curveTo(12.776f, 0f, 9.622f, 1.578f, 9.622f, 3.525f)
                curveTo(9.622f, 3.528f, 9.622f, 3.531f, 9.622f, 3.534f)
                curveTo(9.625f, 4.065f, 9.863f, 4.568f, 10.285f, 5.019f)
                lineTo(10.976f, 4.919f)
                curveTo(10.902f, 4.843f, 10.833f, 4.765f, 10.771f, 4.686f)
                curveTo(10.6f, 4.469f, 10.476f, 4.24f, 10.404f, 4.004f)
                curveTo(10.344f, 3.85f, 10.306f, 3.693f, 10.293f, 3.534f)
                curveTo(10.287f, 3.476f, 10.286f, 3.417f, 10.287f, 3.357f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(9.619f, 22.225f),
                    end = Offset(23.706f, 22.225f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.619f, 21.237f)
                curveTo(9.619f, 23.176f, 12.772f, 24.748f, 16.662f, 24.748f)
                curveTo(20.553f, 24.748f, 23.706f, 23.176f, 23.706f, 21.237f)
                lineTo(23.706f, 19.703f)
                lineTo(9.619f, 19.703f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.677f, 19.781f)
                curveTo(9.677f, 21.749f, 12.78f, 23.344f, 16.608f, 23.344f)
                curveTo(20.435f, 23.344f, 23.538f, 21.749f, 23.538f, 19.781f)
                curveTo(23.538f, 17.813f, 20.435f, 16.218f, 16.608f, 16.218f)
                curveTo(12.78f, 16.218f, 9.677f, 17.814f, 9.677f, 19.781f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE878),
                        1f to Color(0xFFE6A729)
                    ),
                    start = Offset(9.619f, 19.693f),
                    end = Offset(23.706f, 19.693f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.619f, 19.693f)
                curveTo(9.619f, 21.639f, 12.772f, 23.217f, 16.662f, 23.217f)
                curveTo(20.553f, 23.217f, 23.706f, 21.64f, 23.706f, 19.693f)
                curveTo(23.706f, 17.747f, 20.553f, 16.169f, 16.662f, 16.169f)
                curveTo(12.772f, 16.169f, 9.619f, 17.747f, 9.619f, 19.693f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.284f, 19.526f)
                curveTo(10.238f, 21.263f, 13.057f, 22.746f, 16.58f, 22.839f)
                curveTo(20.103f, 22.931f, 22.996f, 21.597f, 23.041f, 19.86f)
                curveTo(23.087f, 18.123f, 20.268f, 16.64f, 16.745f, 16.548f)
                curveTo(13.222f, 16.455f, 10.329f, 17.789f, 10.284f, 19.526f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFE878),
                        1f to Color(0xFFED9E1F)
                    ),
                    start = Offset(10.328f, 19.693f),
                    end = Offset(22.997f, 19.693f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.328f, 19.693f)
                curveTo(10.328f, 21.443f, 13.164f, 22.862f, 16.662f, 22.862f)
                curveTo(20.161f, 22.862f, 22.996f, 21.443f, 22.996f, 19.693f)
                curveTo(22.996f, 17.943f, 20.161f, 16.524f, 16.662f, 16.524f)
                curveTo(13.164f, 16.524f, 10.328f, 17.943f, 10.328f, 19.693f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(10.328f, 18.206f),
                    end = Offset(22.997f, 18.206f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.985f, 19.889f)
                curveTo(22.783f, 18.23f, 20.029f, 16.915f, 16.662f, 16.915f)
                curveTo(13.296f, 16.915f, 10.542f, 18.23f, 10.34f, 19.889f)
                curveTo(10.332f, 19.824f, 10.328f, 19.759f, 10.328f, 19.693f)
                curveTo(10.328f, 17.943f, 13.164f, 16.524f, 16.662f, 16.524f)
                curveTo(20.161f, 16.524f, 22.996f, 17.943f, 22.996f, 19.693f)
                curveTo(22.996f, 19.759f, 22.993f, 19.824f, 22.985f, 19.889f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1D1D1B),
                        1f to Color(0xFFFFEE76)
                    ),
                    start = Offset(10.34f, 18.885f),
                    end = Offset(22.697f, 18.885f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.662f, 16.915f)
                curveTo(13.422f, 16.915f, 10.75f, 18.133f, 10.374f, 19.703f)
                curveTo(10.359f, 19.764f, 10.348f, 19.826f, 10.34f, 19.889f)
                curveTo(10.352f, 19.985f, 10.372f, 20.079f, 10.4f, 20.173f)
                curveTo(10.472f, 20.409f, 10.596f, 20.638f, 10.767f, 20.854f)
                lineTo(10.823f, 20.846f)
                lineTo(18.68f, 19.703f)
                lineTo(22.697f, 19.119f)
                curveTo(21.88f, 17.841f, 19.487f, 16.915f, 16.662f, 16.915f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1D1D1B),
                        1f to Color(0xFFFFEE76)
                    ),
                    start = Offset(9.619f, 18.678f),
                    end = Offset(23.649f, 18.678f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.284f, 19.526f)
                curveTo(10.324f, 17.979f, 12.621f, 16.753f, 15.61f, 16.567f)
                curveTo(15.952f, 16.539f, 16.304f, 16.524f, 16.663f, 16.524f)
                curveTo(19.835f, 16.524f, 22.463f, 17.691f, 22.925f, 19.214f)
                curveTo(22.941f, 19.256f, 22.956f, 19.299f, 22.97f, 19.342f)
                lineTo(23.649f, 19.243f)
                curveTo(23.207f, 17.509f, 20.248f, 16.169f, 16.663f, 16.169f)
                curveTo(12.773f, 16.169f, 9.619f, 17.747f, 9.619f, 19.693f)
                curveTo(9.619f, 19.696f, 9.619f, 19.7f, 9.619f, 19.703f)
                curveTo(9.622f, 20.234f, 9.859f, 20.737f, 10.282f, 21.188f)
                lineTo(10.973f, 21.087f)
                curveTo(10.898f, 21.011f, 10.83f, 20.934f, 10.767f, 20.854f)
                curveTo(10.597f, 20.637f, 10.473f, 20.409f, 10.401f, 20.172f)
                curveTo(10.341f, 20.019f, 10.303f, 19.862f, 10.289f, 19.703f)
                curveTo(10.284f, 19.644f, 10.282f, 19.585f, 10.284f, 19.526f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB38746),
                        0.389f to Color(0xFFD9973B),
                        0.75f to Color(0xFFAD6C10),
                        0.858f to Color(0xFFD3953D),
                        1f to Color(0xFFB07F35)
                    ),
                    start = Offset(3.211f, 22.893f),
                    end = Offset(13.069f, 13.034f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.726f, 11.691f)
                curveTo(13.627f, 13.592f, 12.962f, 17.341f, 10.239f, 20.063f)
                curveTo(7.517f, 22.785f, 3.768f, 23.451f, 1.867f, 21.549f)
                lineTo(1.111f, 20.793f)
                lineTo(10.97f, 10.935f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFE6A729),
                        1f to Color(0xFFFFE878)
                    ),
                    start = Offset(9.531f, 19.354f),
                    end = Offset(2.55f, 12.374f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.97f, 10.935f)
                curveTo(12.897f, 12.862f, 12.253f, 16.632f, 9.531f, 19.355f)
                curveTo(6.808f, 22.077f, 3.038f, 22.721f, 1.111f, 20.794f)
                curveTo(-0.817f, 18.866f, -0.172f, 15.097f, 2.55f, 12.374f)
                curveTo(5.273f, 9.652f, 9.042f, 9.007f, 10.97f, 10.935f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1D1D1B),
                        1f to Color(0xFFFFEE76)
                    ),
                    start = Offset(11.222f, 17.533f),
                    end = Offset(4.307f, 10.618f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.97f, 10.935f)
                curveTo(9.042f, 9.007f, 5.273f, 9.652f, 2.55f, 12.374f)
                curveTo(2.058f, 12.867f, 1.634f, 13.393f, 1.28f, 13.937f)
                curveTo(1.437f, 14.006f, 1.594f, 14.076f, 1.751f, 14.145f)
                curveTo(2.07f, 13.651f, 2.455f, 13.173f, 2.902f, 12.726f)
                curveTo(5.35f, 10.278f, 8.74f, 9.698f, 10.473f, 11.432f)
                curveTo(10.518f, 11.476f, 10.562f, 11.522f, 10.603f, 11.569f)
                curveTo(11.985f, 13.125f, 11.68f, 15.845f, 9.968f, 18.1f)
                curveTo(10.118f, 18.178f, 10.268f, 18.257f, 10.418f, 18.336f)
                curveTo(12.371f, 15.756f, 12.667f, 12.631f, 10.97f, 10.935f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEE76)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.405f, 11.265f)
                curveTo(12.178f, 12.947f, 11.661f, 16.371f, 9.251f, 18.911f)
                curveTo(6.84f, 21.451f, 3.449f, 22.146f, 1.676f, 20.463f)
                curveTo(-0.097f, 18.781f, 0.42f, 15.358f, 2.83f, 12.818f)
                curveTo(5.241f, 10.278f, 8.632f, 9.582f, 10.405f, 11.265f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFED9E1F),
                        1f to Color(0xFFFFE878)
                    ),
                    start = Offset(9.179f, 19.003f),
                    end = Offset(2.902f, 12.726f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.473f, 11.432f)
                curveTo(12.207f, 13.165f, 11.627f, 16.555f, 9.179f, 19.003f)
                curveTo(6.731f, 21.451f, 3.341f, 22.031f, 1.607f, 20.298f)
                curveTo(-0.126f, 18.564f, 0.453f, 15.174f, 2.902f, 12.726f)
                curveTo(5.35f, 10.277f, 8.74f, 9.698f, 10.473f, 11.432f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBF8F2E),
                        1f to Color(0xFFFCCD67)
                    ),
                    start = Offset(0.105f, 18.795f),
                    end = Offset(8.971f, 9.929f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.745f, 20.427f)
                curveTo(0.173f, 18.657f, 0.785f, 15.378f, 3.17f, 12.993f)
                curveTo(5.555f, 10.608f, 8.833f, 9.997f, 10.603f, 11.569f)
                curveTo(10.561f, 11.522f, 10.518f, 11.476f, 10.473f, 11.431f)
                curveTo(8.74f, 9.698f, 5.35f, 10.277f, 2.902f, 12.726f)
                curveTo(0.453f, 15.174f, -0.126f, 18.564f, 1.607f, 20.297f)
                curveTo(1.653f, 20.342f, 1.698f, 20.385f, 1.745f, 20.427f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1D1D1B),
                        1f to Color(0xFFFFEE76)
                    ),
                    start = Offset(10.686f, 17.147f),
                    end = Offset(4.943f, 11.404f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.821f, 10.995f)
                curveTo(5.477f, 11.328f, 4.235f, 12.112f, 3.262f, 13.085f)
                curveTo(2.939f, 13.409f, 2.637f, 13.761f, 2.365f, 14.137f)
                curveTo(3.599f, 14.689f, 4.83f, 15.259f, 6.057f, 15.849f)
                curveTo(7.379f, 16.484f, 8.696f, 17.142f, 10.009f, 17.825f)
                curveTo(10.544f, 17.076f, 10.958f, 16.236f, 11.178f, 15.351f)
                curveTo(11.445f, 14.273f, 11.425f, 13.068f, 10.832f, 12.096f)
                curveTo(10.738f, 11.942f, 10.631f, 11.797f, 10.511f, 11.662f)
                curveTo(10.468f, 11.623f, 10.423f, 11.586f, 10.377f, 11.55f)
                curveTo(10.373f, 11.546f, 10.369f, 11.543f, 10.365f, 11.54f)
                curveTo(10.273f, 11.468f, 10.177f, 11.402f, 10.077f, 11.341f)
                curveTo(9.105f, 10.747f, 7.899f, 10.728f, 6.821f, 10.995f)
                close()
            }
        }.build()

        return _Coins!!
    }

@Suppress("ObjectPropertyName")
private var _Coins: ImageVector? = null
