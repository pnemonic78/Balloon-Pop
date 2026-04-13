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

val Orange: ImageVector
    get() {
        if (_Orange != null) {
            return _Orange!!
        }
        _Orange = ImageVector.Builder(
            name = "Orange",
            defaultWidth = 26.525.dp,
            defaultHeight = 31.109.dp,
            viewportWidth = 26.525f,
            viewportHeight = 31.109f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(54.336f, -80.332f)
                    lineToRelative(-132.292f, 0f)
                    lineToRelative(-0f, 132.292f)
                    lineToRelative(132.292f, 0f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFFFF4502))) {
                    moveTo(13.263f, 27.443f)
                    lineTo(14.606f, 29.881f)
                    curveTo(14.911f, 30.433f, 14.511f, 31.109f, 13.881f, 31.109f)
                    lineTo(13.263f, 31.109f)
                    lineTo(12.644f, 31.109f)
                    curveTo(12.014f, 31.109f, 11.614f, 30.433f, 11.919f, 29.881f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFF4502))) {
                    moveTo(26.525f, 14.193f)
                    arcToRelative(14.193f, 13.263f, 90f, isMoreThanHalf = true, isPositiveArc = true, -26.525f, 0f)
                    arcToRelative(14.193f, 13.263f, 90f, isMoreThanHalf = true, isPositiveArc = true, 26.525f, 0f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(26.525f, 14.193f)
                    arcToRelative(14.193f, 13.263f, 90f, isMoreThanHalf = true, isPositiveArc = true, -26.525f, 0f)
                    arcToRelative(14.193f, 13.263f, 90f, isMoreThanHalf = true, isPositiveArc = true, 26.525f, 0f)
                    close()
                }
            ) {
                path(
                    fill = Brush.radialGradient(
                        colorStops = arrayOf(
                            0f to Color(0xFFFFE097),
                            0.091f to Color(0xFFFFDA8B),
                            0.254f to Color(0xFFFFCB6D),
                            0.468f to Color(0xFFFFB33B),
                            0.477f to Color(0xFFFFB239),
                            0.603f to Color(0xFFFF9028),
                            0.778f to Color(0xFFFF6813),
                            0.916f to Color(0xFFFF4E07),
                            1f to Color(0xFFFF4502)
                        ),
                        center = Offset(8.693f, 9.123f),
                        radius = 19.39f
                    )
                ) {
                    moveTo(8.693f, 9.123f)
                    moveToRelative(19.39f, 0f)
                    arcToRelative(19.39f, 19.39f, 0f, isMoreThanHalf = true, isPositiveArc = false, -38.78f, 0f)
                    arcToRelative(19.39f, 19.39f, 0f, isMoreThanHalf = true, isPositiveArc = false, 38.78f, 0f)
                }
            }
        }.build()

        return _Orange!!
    }

@Suppress("ObjectPropertyName")
private var _Orange: ImageVector? = null
