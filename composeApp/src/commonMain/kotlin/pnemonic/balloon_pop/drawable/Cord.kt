package pnemonic.balloon_pop.drawable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cord: ImageVector
    get() {
        if (_Cord != null) {
            return _Cord!!
        }
        _Cord = ImageVector.Builder(
            name = "Cord",
            defaultWidth = 2.193.dp,
            defaultHeight = 52.184.dp,
            viewportWidth = 2.193f,
            viewportHeight = 52.184f
        ).apply {
            path(fill = SolidColor(Color(0xFF7A707B))) {
                moveTo(-0f, 52.184f)
                curveTo(-0f, 52.184f, 0.002f, 43.841f, -0f, 39.489f)
                curveTo(-0.002f, 35.138f, 2.524f, 21.499f, 1.665f, 14.564f)
                curveTo(0.807f, 7.629f, 0.675f, -0f, 0.675f, -0f)
                lineTo(1.134f, 0.308f)
                curveTo(1.134f, 0.308f, 0.942f, 5.201f, 1.366f, 9.632f)
                curveTo(1.789f, 14.063f, 2.688f, 17.02f, 1.843f, 23.207f)
                curveTo(0.998f, 29.395f, 0.133f, 37.18f, 0.248f, 44.539f)
                curveTo(0.364f, 51.897f, 0.364f, 51.897f, 0.364f, 51.897f)
                close()
            }
        }.build()

        return _Cord!!
    }

@Suppress("ObjectPropertyName")
private var _Cord: ImageVector? = null
