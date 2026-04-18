package pnemonic.balloon_pop.drawable

import androidx.annotation.FloatRange
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import pnemonic.compose.hue

fun Teardrop(@FloatRange(0.0, 360.0) hue: Float): ImageVector {
    return ImageVector.Builder(
        name = "Teardrop",
        defaultWidth = 25.114.dp,
        defaultHeight = 33.671.dp,
        viewportWidth = 25.114f,
        viewportHeight = 33.671f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF838CF0).hue(hue),
                    0.4f to Color(0xFF737EF0).hue(hue),
                    1f to Color(0xFF4A59F9).hue(hue)
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
            fill = SolidColor(Color(0xFF656ED4).hue(hue)),
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
                curveTo(0f, 6.607f, 5.841f, 0f, 12.557f, 0f)
                curveTo(19.273f, 0f, 25.114f, 6.607f, 25.114f, 13.822f)
                close()
            }
        ) {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF949CF5).hue(hue),
                        0.306f to Color(0xFF939DF6).hue(hue),
                        0.762f to Color(0xFF4A59F9).hue(hue),
                        1f to Color(0xFF4F5EF9).hue(hue)
                    ),
                    center = Offset(10f, 10f),
                    radius = 15f
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
}
