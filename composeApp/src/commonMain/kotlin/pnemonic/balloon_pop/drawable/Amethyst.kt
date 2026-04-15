package pnemonic.balloon_pop.drawable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Amethyst: ImageVector
    get() {
        if (_Amethyst != null) {
            return _Amethyst!!
        }
        _Amethyst = ImageVector.Builder(
            name = "Amethyst",
            defaultWidth = 29.768.dp,
            defaultHeight = 40.891.dp,
            viewportWidth = 29.768f,
            viewportHeight = 40.891f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFB96FDE)),
                fillAlpha = 0.8f
            ) {
                moveTo(6.713f, 34.334f)
                lineToRelative(-6.713f, 6.556f)
                lineToRelative(0f, -40.891f)
                lineToRelative(6.713f, 6.556f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9E55C2)),
                fillAlpha = 0.8f
            ) {
                moveTo(29.768f, 40.891f)
                lineToRelative(-29.768f, 0f)
                lineToRelative(6.713f, -6.556f)
                lineToRelative(16.341f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB96FDE)),
                fillAlpha = 0.8f
            ) {
                moveTo(29.768f, 40.891f)
                lineToRelative(-6.714f, -6.556f)
                lineToRelative(0f, -27.778f)
                lineToRelative(6.714f, -6.556f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD089F5)),
                fillAlpha = 0.8f
            ) {
                moveTo(23.055f, 6.556f)
                lineToRelative(-16.341f, 0f)
                lineToRelative(-6.713f, -6.556f)
                lineToRelative(29.768f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8C4AAD)),
                fillAlpha = 0.8f
            ) {
                moveTo(6.713f, 6.556f)
                lineToRelative(16.341f, 0f)
                lineToRelative(0f, 27.778f)
                lineToRelative(-16.341f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB96FDE)),
                fillAlpha = 0.8f
            ) {
                moveTo(8.405f, 7.879f)
                lineToRelative(12.958f, 0f)
                lineToRelative(0f, 25.132f)
                lineToRelative(-12.958f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.8f
            ) {
                moveTo(7.586f, 7.006f)
                lineToRelative(4.067f, 0.873f)
                lineToRelative(-4.067f, 0.873f)
                lineToRelative(-0.873f, 4.067f)
                lineToRelative(-0.873f, -4.067f)
                lineToRelative(-4.067f, -0.873f)
                lineToRelative(4.067f, -0.873f)
                lineToRelative(0.873f, -4.067f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.8f
            ) {
                moveTo(23.486f, 33.903f)
                lineToRelative(2.009f, 0.432f)
                lineToRelative(-2.009f, 0.431f)
                lineToRelative(-0.431f, 2.009f)
                lineToRelative(-0.431f, -2.009f)
                lineToRelative(-2.009f, -0.431f)
                lineToRelative(2.009f, -0.432f)
                lineToRelative(0.431f, -2.009f)
                close()
            }
        }.build()

        return _Amethyst!!
    }

@Suppress("ObjectPropertyName")
private var _Amethyst: ImageVector? = null
