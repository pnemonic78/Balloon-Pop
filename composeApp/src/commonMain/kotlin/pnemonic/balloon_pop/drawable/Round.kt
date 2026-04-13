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

val Round: ImageVector
    get() {
        if (_Round != null) {
            return _Round!!
        }
        _Round = ImageVector.Builder(
            name = "Round",
            defaultWidth = 25.114.dp,
            defaultHeight = 33.671.dp,
            viewportWidth = 25.114f,
            viewportHeight = 33.671f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.065f to Color(0xFF72A1EC),
                        0.396f to Color(0xFF668BF0),
                        1f to Color(0xFF4A59F9)
                    ),
                    start = Offset(12.667f, 33.671f),
                    end = Offset(12.667f, 31.956f)
                )
            ) {
                moveTo(11.104f, 33.518f)
                curveTo(11.104f, 33.518f, 12.971f, 33.862f, 14.23f, 33.518f)
                curveTo(14.23f, 33.518f, 13.963f, 31.956f, 12.667f, 31.956f)
                curveTo(11.37f, 31.956f, 11.104f, 33.518f, 11.104f, 33.518f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF686AD4)),
                fillAlpha = 0.49f,
                strokeAlpha = 0.49f
            ) {
                moveTo(14.23f, 33.518f)
                curveTo(14.23f, 33.518f, 12.413f, 32.852f, 11.104f, 33.518f)
                curveTo(11.104f, 33.518f, 12.971f, 33.862f, 14.23f, 33.518f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(25.114f, 13.822f)
                    curveTo(25.114f, 26.881f, 16.316f, 32.219f, 12.557f, 32.219f)
                    curveTo(8.513f, 32.219f, 0f, 25.357f, 0f, 13.822f)
                    curveTo(0f, 6.607f, 5.841f, -0f, 12.557f, -0f)
                    curveTo(19.273f, -0f, 25.114f, 6.607f, 25.114f, 13.822f)
                    close()
                }
            ) {
                path(
                    fill = Brush.radialGradient(
                        colorStops = arrayOf(
                            0.065f to Color(0xFF72A1EC),
                            0.306f to Color(0xFF668BF0),
                            0.746f to Color(0xFF4A59F9),
                            0.79f to Color(0xFF4F5EF9),
                            0.839f to Color(0xFF5C6BF7),
                            0.89f to Color(0xFF7382F5),
                            0.943f to Color(0xFF92A1F3),
                            0.998f to Color(0xFFBAC9EF),
                            1f to Color(0xFFBCCBEF)
                        ),
                        center = Offset(10f, 12f),
                        radius = 23f
                    )
                ) {
                    moveTo(-0.67f, 16.08f)
                    arcToRelative(16.575f, 13.274f, 90f, isMoreThanHalf = true, isPositiveArc = false, 26.547f, 0f)
                    arcToRelative(16.575f, 13.274f, 90f, isMoreThanHalf = true, isPositiveArc = false, -26.547f, 0f)
                    close()
                }
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.81f,
                strokeAlpha = 0.81f
            ) {
                moveTo(6.262f, 4.668f)
                curveTo(6.989f, 3.251f, 8.415f, 3.444f, 8.918f, 3.828f)
                curveTo(8.918f, 3.828f, 5.246f, 6.652f, 6.262f, 4.668f)
                close()
            }
        }.build()

        return _Round!!
    }

@Suppress("ObjectPropertyName")
private var _Round: ImageVector? = null
