package pnemonic.balloon_pop.drawable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Diamond: ImageVector
    get() {
        if (_Diamond != null) {
            return _Diamond!!
        }
        _Diamond = ImageVector.Builder(
            name = "Diamond",
            defaultWidth = 39.178.dp,
            defaultHeight = 37.26.dp,
            viewportWidth = 39.178f,
            viewportHeight = 37.26f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFACE4FF)),
                fillAlpha = 0.7f
            ) {
                moveTo(8.026f, 13.734f)
                lineToRelative(23.126f, 0f)
                lineToRelative(-11.563f, 23.526f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD1F0FF)),
                fillAlpha = 0.7f
            ) {
                moveTo(19.589f, 37.26f)
                lineToRelative(-11.563f, -23.526f)
                lineToRelative(-8.026f, -2.481f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7ECCF2)),
                fillAlpha = 0.7f
            ) {
                moveTo(19.589f, 37.26f)
                lineToRelative(11.563f, -23.526f)
                lineToRelative(8.026f, -2.481f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD1F0FF)),
                fillAlpha = 0.7f
            ) {
                moveTo(12.494f, 0f)
                lineToRelative(-4.468f, 13.734f)
                lineToRelative(11.563f, 0f)
                lineToRelative(11.563f, 0f)
                lineToRelative(-4.468f, -13.734f)
                lineToRelative(-7.095f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFACE4FF)),
                fillAlpha = 0.7f
            ) {
                moveTo(31.152f, 13.734f)
                lineToRelative(8.025f, -2.481f)
                lineToRelative(-7.482f, -11.254f)
                lineToRelative(-5.011f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFACE4FF)),
                fillAlpha = 0.7f
            ) {
                moveTo(8.026f, 13.734f)
                lineToRelative(4.468f, -13.734f)
                lineToRelative(-5.011f, 0f)
                lineToRelative(-7.483f, 11.254f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.8f
            ) {
                moveTo(9.279f, 12.861f)
                lineToRelative(4.067f, 0.873f)
                lineToRelative(-4.067f, 0.873f)
                lineToRelative(-0.873f, 4.067f)
                lineToRelative(-0.873f, -4.067f)
                lineToRelative(-4.067f, -0.873f)
                lineToRelative(4.067f, -0.873f)
                lineToRelative(0.873f, -4.067f)
                close()
            }
        }.build()

        return _Diamond!!
    }

@Suppress("ObjectPropertyName")
private var _Diamond: ImageVector? = null
