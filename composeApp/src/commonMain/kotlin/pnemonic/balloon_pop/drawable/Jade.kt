package pnemonic.balloon_pop.drawable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Jade: ImageVector
    get() {
        if (_Jade != null) {
            return _Jade!!
        }
        _Jade = ImageVector.Builder(
            name = "Jade",
            defaultWidth = 38.15.dp,
            defaultHeight = 41.225.dp,
            viewportWidth = 38.15f,
            viewportHeight = 41.225f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF00DEBA)),
                fillAlpha = 0.8f
            ) {
                moveTo(31.495f, 21.312f)
                lineToRelative(-4.744f, -15.503f)
                lineToRelative(-15.351f, 0f)
                lineToRelative(-4.743f, 15.503f)
                lineToRelative(12.419f, 11.337f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00D1AF)),
                fillAlpha = 0.8f
            ) {
                moveTo(28.946f, 20.484f)
                lineToRelative(-3.771f, -12.322f)
                lineToRelative(-12.202f, 0f)
                lineToRelative(-3.77f, 12.322f)
                lineToRelative(9.871f, 9.011f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BD9F)),
                fillAlpha = 0.8f
            ) {
                moveTo(19.075f, 41.225f)
                lineToRelative(0f, -8.576f)
                lineToRelative(-12.419f, -11.337f)
                lineToRelative(-6.656f, 2.499f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00A686)),
                fillAlpha = 0.8f
            ) {
                moveTo(19.075f, 41.225f)
                lineToRelative(0f, -8.576f)
                lineToRelative(12.42f, -11.337f)
                lineToRelative(6.656f, 2.499f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BD9F)),
                fillAlpha = 0.8f
            ) {
                moveTo(31.495f, 21.312f)
                lineToRelative(-4.744f, -15.503f)
                lineToRelative(4.113f, -5.809f)
                lineToRelative(7.286f, 23.811f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00D6B3)),
                fillAlpha = 0.8f
            ) {
                moveTo(6.656f, 21.312f)
                lineToRelative(4.743f, -15.503f)
                lineToRelative(-4.113f, -5.809f)
                lineToRelative(-7.286f, 23.811f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00EDC7)),
                fillAlpha = 0.8f
            ) {
                moveTo(7.286f, -0f)
                lineToRelative(23.578f, 0f)
                lineToRelative(-4.113f, 5.809f)
                lineToRelative(-15.351f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.8f
            ) {
                moveTo(12.272f, 5.467f)
                lineToRelative(4.067f, 0.873f)
                lineToRelative(-4.067f, 0.873f)
                lineToRelative(-0.873f, 4.067f)
                lineToRelative(-0.873f, -4.067f)
                lineToRelative(-4.067f, -0.873f)
                lineToRelative(4.067f, -0.873f)
                lineToRelative(0.872f, -4.067f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.8f
            ) {
                moveTo(31.926f, 21.753f)
                lineToRelative(2.008f, 0.432f)
                lineToRelative(-2.008f, 0.432f)
                lineToRelative(-0.431f, 2.008f)
                lineToRelative(-0.431f, -2.008f)
                lineToRelative(-2.009f, -0.432f)
                lineToRelative(2.009f, -0.432f)
                lineToRelative(0.431f, -2.008f)
                close()
            }
        }.build()

        return _Jade!!
    }

@Suppress("ObjectPropertyName")
private var _Jade: ImageVector? = null
