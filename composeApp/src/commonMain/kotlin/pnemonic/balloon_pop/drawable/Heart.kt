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

val Heart: ImageVector
    get() {
        if (_Heart != null) {
            return _Heart!!
        }
        _Heart = ImageVector.Builder(
            name = "Heart",
            defaultWidth = 35.398.dp,
            defaultHeight = 30.516.dp,
            viewportWidth = 35.398f,
            viewportHeight = 30.516f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(20.965f, 28.149f)
                    curveTo(19.144f, 29.454f, 16.701f, 29.479f, 14.827f, 28.25f)
                    curveTo(10.782f, 25.597f, 3.92f, 20.146f, 0.898f, 12.169f)
                    curveTo(-3.733f, -0.052f, 10.76f, -3.745f, 16.793f, 5.275f)
                    curveTo(17.282f, 6.006f, 17.564f, 6.094f, 18.11f, 5.404f)
                    curveTo(20.13f, 2.853f, 25.281f, -1.992f, 31.176f, 0.883f)
                    curveTo(40.077f, 5.224f, 34.068f, 18.76f, 20.965f, 28.149f)
                    close()
                }
            ) {
                path(
                    fill = Brush.radialGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFF88B3),
                            0.178f to Color(0xFFFF6B96),
                            0.485f to Color(0xFFFF3F6A),
                            0.641f to Color(0xFFFF2E59),
                            0.739f to Color(0xFFFF355E),
                            0.879f to Color(0xFFFF486A),
                            1f to Color(0xFFFF5E79)
                        ),
                        center = Offset(22f, 10f),
                        radius = 18.55f
                    )
                ) {
                    moveTo(-1.152f, 11.889f)
                    arcToRelative(18.15f, 18.851f, 90f, isMoreThanHalf = true, isPositiveArc = false, 37.702f, 0f)
                    arcToRelative(18.15f, 18.851f, 90f, isMoreThanHalf = true, isPositiveArc = false, -37.702f, 0f)
                    close()
                }
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF4554),
                        0.323f to Color(0xFFFF4A5B),
                        0.79f to Color(0xFFFF576E),
                        1f to Color(0xFFFF5E79)
                    ),
                    start = Offset(17.899f, 30.516f),
                    end = Offset(17.899f, 28.945f)
                )
            ) {
                moveTo(16.468f, 30.377f)
                curveTo(16.468f, 30.377f, 18.179f, 30.691f, 19.331f, 30.377f)
                curveTo(19.331f, 30.377f, 19.086f, 28.945f, 17.899f, 28.945f)
                curveTo(16.712f, 28.945f, 16.468f, 30.377f, 16.468f, 30.377f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFA40613),
                        1f to Color(0xFFD40651)
                    ),
                    start = Offset(17.899f, 30.516f),
                    end = Offset(17.899f, 28.945f)
                ),
                fillAlpha = 0.49f,
                strokeAlpha = 0.49f
            ) {
                moveTo(19.331f, 30.377f)
                curveTo(19.331f, 30.377f, 17.667f, 29.766f, 16.468f, 30.377f)
                curveTo(16.468f, 30.377f, 18.179f, 30.691f, 19.331f, 30.377f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD40651),
                        1f to Color(0xFFD40613)
                    ),
                    start = Offset(22.625f, 21.442f),
                    end = Offset(28.34f, 24.019f)
                )
            ) {
                moveTo(19.902f, 27.482f)
                curveTo(22.098f, 27.553f, 27.133f, 23.238f, 31.064f, 17.978f)
                curveTo(31.064f, 17.978f, 25.191f, 22.394f, 23.288f, 23.963f)
                curveTo(21.385f, 25.532f, 19.902f, 27.482f, 19.902f, 27.482f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD40651),
                        1f to Color(0xFFD40613)
                    ),
                    start = Offset(14.455f, 7.359f),
                    end = Offset(13.961f, 1.109f)
                )
            ) {
                moveTo(16.896f, 7.166f)
                curveTo(16.427f, 5.165f, 13.994f, 2.533f, 11.521f, 1.302f)
                curveTo(11.521f, 1.302f, 14.171f, 4.642f, 15.072f, 5.665f)
                curveTo(15.973f, 6.687f, 16.896f, 7.166f, 16.896f, 7.166f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD40651),
                        1f to Color(0xFFD40613)
                    ),
                    start = Offset(31.236f, 12.344f),
                    end = Offset(36.081f, 8.365f)
                )
            ) {
                moveTo(32.79f, 14.236f)
                curveTo(34.163f, 12.708f, 34.932f, 9.206f, 34.527f, 6.474f)
                curveTo(34.527f, 6.474f, 33.303f, 10.558f, 32.979f, 11.882f)
                curveTo(32.655f, 13.206f, 32.79f, 14.236f, 32.79f, 14.236f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.82f,
                strokeAlpha = 0.82f
            ) {
                moveTo(0.583f, 9.487f)
                curveTo(0.546f, 9.082f, 1.798f, 12.509f, 1.931f, 13.132f)
                curveTo(2.064f, 13.754f, 2.384f, 14.655f, 2.384f, 14.655f)
                curveTo(2.284f, 14.71f, 0.827f, 12.151f, 0.583f, 9.487f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.81f,
                strokeAlpha = 0.81f
            ) {
                moveTo(3.508f, 4.638f)
                curveTo(4.083f, 3.516f, 5.212f, 3.669f, 5.611f, 3.973f)
                curveTo(5.611f, 3.972f, 2.703f, 6.208f, 3.508f, 4.638f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.81f,
                strokeAlpha = 0.81f
            ) {
                moveTo(23.649f, 4.075f)
                curveTo(24.224f, 2.953f, 25.353f, 3.106f, 25.751f, 3.41f)
                curveTo(25.751f, 3.41f, 22.844f, 5.645f, 23.649f, 4.075f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.81f,
                strokeAlpha = 0.81f
            ) {
                moveTo(25.451f, 2.496f)
                curveTo(26.012f, 2.376f, 26.268f, 2.803f, 26.268f, 3.024f)
                curveTo(26.269f, 3.023f, 24.665f, 2.664f, 25.451f, 2.496f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.82f,
                strokeAlpha = 0.82f
            ) {
                moveTo(21.886f, 2.095f)
                curveTo(22.123f, 1.997f, 20.351f, 3.737f, 20.006f, 3.961f)
                curveTo(19.661f, 4.185f, 19.193f, 4.634f, 19.193f, 4.634f)
                curveTo(19.135f, 4.545f, 20.33f, 2.74f, 21.886f, 2.095f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFA40613),
                        1f to Color(0xFFD40651)
                    ),
                    start = Offset(6.903f, 25.372f),
                    end = Offset(23.928f, 25.372f)
                ),
                fillAlpha = 0.49f,
                strokeAlpha = 0.49f
            ) {
                moveTo(14.827f, 28.25f)
                curveTo(16.701f, 29.479f, 19.144f, 29.454f, 20.965f, 28.149f)
                curveTo(21.998f, 27.409f, 22.987f, 26.643f, 23.928f, 25.857f)
                curveTo(17.63f, 30.502f, 11.679f, 26.555f, 6.903f, 21.594f)
                curveTo(9.669f, 24.591f, 12.654f, 26.825f, 14.827f, 28.25f)
                close()
            }
        }.build()

        return _Heart!!
    }

@Suppress("ObjectPropertyName")
private var _Heart: ImageVector? = null
