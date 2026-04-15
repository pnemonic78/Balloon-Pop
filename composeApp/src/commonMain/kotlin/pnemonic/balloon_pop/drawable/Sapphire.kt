package pnemonic.balloon_pop.drawable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sapphire: ImageVector
    get() {
        if (_Sapphire != null) {
            return _Sapphire!!
        }
        _Sapphire = ImageVector.Builder(
            name = "Sapphire",
            defaultWidth = 39.178.dp,
            defaultHeight = 44.294.dp,
            viewportWidth = 39.178f,
            viewportHeight = 44.294f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF2B2BFF)),
                fillAlpha = 0.8f
            ) {
                moveTo(10.462f, 20.445f)
                lineToRelative(18.253f, 0f)
                lineToRelative(-9.126f, 23.849f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0505F2)),
                fillAlpha = 0.8f
            ) {
                moveTo(19.589f, 44.294f)
                lineToRelative(-9.127f, -23.849f)
                lineToRelative(-0.668f, 10.959f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2B2BFF)),
                fillAlpha = 0.8f
            ) {
                moveTo(9.795f, 31.404f)
                lineToRelative(0.668f, -10.959f)
                lineToRelative(-10.462f, -1.933f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0505F2)),
                fillAlpha = 0.8f
            ) {
                moveTo(19.589f, 44.294f)
                lineToRelative(9.127f, -23.849f)
                lineToRelative(0.668f, 10.959f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2B2BFF)),
                fillAlpha = 0.8f
            ) {
                moveTo(29.384f, 31.404f)
                lineToRelative(-0.668f, -10.959f)
                lineToRelative(10.462f, -1.933f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5252FF)),
                fillAlpha = 0.8f
            ) {
                moveTo(-0f, 18.513f)
                lineToRelative(10.462f, 1.933f)
                lineToRelative(-2.98f, -20.445f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5252FF)),
                fillAlpha = 0.8f
            ) {
                moveTo(39.178f, 18.513f)
                lineToRelative(-10.462f, 1.933f)
                lineToRelative(2.98f, -20.445f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0505F2)),
                fillAlpha = 0.8f
            ) {
                moveTo(10.462f, 20.445f)
                lineToRelative(18.253f, 0f)
                lineToRelative(-9.124f, -11.508f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2B2BFF)),
                fillAlpha = 0.8f
            ) {
                moveTo(10.462f, 20.445f)
                lineToRelative(9.129f, -11.508f)
                lineToRelative(-12.109f, -8.937f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2B2BFF)),
                fillAlpha = 0.8f
            ) {
                moveTo(28.716f, 20.445f)
                lineToRelative(-9.124f, -11.508f)
                lineToRelative(12.104f, -8.937f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5252FF)),
                fillAlpha = 0.8f
            ) {
                moveTo(19.592f, 8.937f)
                lineToRelative(12.104f, -8.937f)
                lineToRelative(-24.213f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.8f
            ) {
                moveTo(11.336f, 19.572f)
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

        return _Sapphire!!
    }

@Suppress("ObjectPropertyName")
private var _Sapphire: ImageVector? = null
