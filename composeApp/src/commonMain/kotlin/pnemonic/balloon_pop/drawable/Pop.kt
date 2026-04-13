package pnemonic.balloon_pop.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pop: ImageVector
    get() {
        if (_Pop != null) {
            return _Pop!!
        }
        _Pop = ImageVector.Builder(
            name = "Pop",
            defaultWidth = 1955.5.dp,
            defaultHeight = 1824.5.dp,
            viewportWidth = 1955.5f,
            viewportHeight = 1824.5f
        ).apply {
            val brush = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color.Transparent,
                    1f to Color.White.copy(alpha = 0.6f)
                ),
                center = Offset(977.7f, 912.3f),
                radius = 977.7f
            )

            path(
                fill = brush
            ) {
                moveTo(327.4f, 377.3f)
                curveTo(516.2f, 755.7f, 301.3f, 811.1f, 96.3f, 843.2f)
                curveTo(399.9f, 925.7f, 479.7f, 1092.5f, 210f, 1286.3f)
                curveTo(630.4f, 1104.5f, 718.1f, 1331.1f, 641.8f, 1543.8f)
                curveTo(826.9f, 1352.2f, 925.5f, 1233.6f, 1057.9f, 1591.7f)
                curveTo(1089.9f, 1347.9f, 1163.8f, 1268.4f, 1501.4f, 1407.5f)
                curveTo(1109.1f, 1056.5f, 1702.9f, 1112.4f, 1816.8f, 1134.8f)
                curveTo(1539.3f, 1013.6f, 1478.7f, 903.7f, 1816.8f, 779.1f)
                curveTo(1441f, 812.4f, 1501.4f, 657.6f, 1728.9f, 459.2f)
                curveTo(1456f, 585.6f, 1268.4f, 564.6f, 1425.7f, 252.3f)
                curveTo(1200.2f, 496.4f, 1091.6f, 525f, 1069.7f, 169.9f)
                curveTo(951.2f, 506.1f, 841.1f, 532.8f, 668.3f, 206.9f)
                curveTo(708.6f, 563.1f, 588.5f, 613.5f, 327.4f, 377.3f)
                close()
            }
            path(
                fill = brush
            ) {
                moveTo(1366.2f, 4.4f)
                lineToRelative(-130.9f, 4.4f)
                lineToRelative(-39.3f, 292.4f)
                close()
            }
            path(
                fill = brush
            ) {
                moveTo(833.7f, 1824.5f)
                lineToRelative(-117.9f, -52.4f)
                lineToRelative(157.1f, -288.1f)
                close()
            }
            path(
                fill = brush
            ) {
                moveTo(130.9f, 1798.3f)
                lineToRelative(-69.8f, -157.1f)
                lineToRelative(502f, -305.5f)
                close()
            }
            path(
                fill = brush
            ) {
                moveTo(1955.5f, 109.1f)
                lineToRelative(-493.2f, 301.2f)
                lineToRelative(318.6f, -392.8f)
                close()
            }
            path(
                fill = brush
            ) {
                moveTo(1881.3f, 1401.1f)
                lineToRelative(-344.8f, -135.3f)
                lineToRelative(222.6f, 235.7f)
                close()
            }
            path(
                fill = brush
            ) {
                moveTo(423.4f, 0f)
                lineToRelative(-104.8f, 104.8f)
                lineToRelative(205.1f, 244.4f)
                close()
            }
            path(
                fill = brush
            ) {
                moveTo(0f, 589.3f)
                lineToRelative(8.7f, -144f)
                lineToRelative(309.9f, 179f)
                close()
            }
            path(
                fill = brush
            ) {
                moveTo(1545.2f, 1693.6f)
                lineToRelative(-183.3f, 48f)
                lineToRelative(-91.7f, -318.6f)
                close()
            }
        }.build()

        return _Pop!!
    }

@Suppress("ObjectPropertyName")
private var _Pop: ImageVector? = null
