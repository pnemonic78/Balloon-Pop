package pnemonic.balloon_pop.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bomb: ImageVector
    get() {
        if (_Bomb != null) {
            return _Bomb!!
        }
        _Bomb = ImageVector.Builder(
            name = "Bomb",
            defaultWidth = 31.087.dp,
            defaultHeight = 36.746.dp,
            viewportWidth = 31.087f,
            viewportHeight = 36.746f
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color.White,
                        1f to Color.Black
                    ),
                    center = Offset(12.603f, 18.778f),
                    radius = 10f
                )
            ) {
                moveTo(17.177f, 22.836f)
                moveToRelative(13.91f, 0f)
                arcToRelative(13.91f, 13.91f, 0f, isMoreThanHalf = true, isPositiveArc = false, -27.82f, 0f)
                arcToRelative(13.91f, 13.91f, 0f, isMoreThanHalf = true, isPositiveArc = false, 27.82f, 0f)
            }
            path(fill = SolidColor(Color(0xFF282828))) {
                moveTo(21.518f, 7.288f)
                arcToRelative(0.741f, 4.341f, 90f, isMoreThanHalf = true, isPositiveArc = true, -8.682f, 0f)
                arcToRelative(0.741f, 4.341f, 90f, isMoreThanHalf = true, isPositiveArc = true, 8.682f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color.Black,
                        0.484f to Color(0xFF3F3F3F),
                        1f to Color.White
                    ),
                    start = Offset(21.518f, 9.185f),
                    end = Offset(12.836f, 9.185f)
                )
            ) {
                moveTo(17.177f, 8.029f)
                curveTo(19.574f, 8.029f, 21.518f, 7.697f, 21.518f, 7.288f)
                lineTo(21.518f, 10.34f)
                curveTo(21.518f, 10.749f, 19.574f, 11.082f, 17.177f, 11.082f)
                curveTo(14.779f, 11.082f, 12.836f, 10.75f, 12.836f, 10.34f)
                lineTo(12.836f, 7.288f)
                curveTo(12.836f, 7.697f, 14.779f, 8.029f, 17.177f, 8.029f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.005f to Color(0xFFEB3E00),
                        0.124f to Color(0xFFEC4700),
                        0.316f to Color(0xFFED5F00),
                        0.559f to Color(0xFFF08600),
                        0.839f to Color(0xFFF3BC00),
                        0.995f to Color(0xFFF5DD00)
                    ),
                    start = Offset(7.25f, 9.923f),
                    end = Offset(5.531f, 0.133f)
                )
            ) {
                moveTo(4.226f, -0f)
                curveTo(4.226f, -0f, 7.083f, 3.079f, 10.785f, 1.502f)
                curveTo(10.785f, 1.502f, 8.376f, 5.507f, 12.958f, 8.413f)
                curveTo(12.958f, 8.413f, 6.791f, 6.966f, 6.414f, 11.935f)
                curveTo(6.414f, 11.935f, 6.107f, 6.508f, 0.941f, 8.008f)
                curveTo(0.941f, 8.008f, 2.716f, 3.811f, -0f, 2.283f)
                curveTo(-0f, 2.283f, 3.547f, 3.622f, 4.226f, -0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEB3E00)),
                fillAlpha = 0.5f,
                strokeAlpha = 0.5f
            ) {
                moveTo(5.018f, 2.099f)
                curveTo(5.018f, 2.099f, 6.871f, 4.095f, 9.271f, 3.073f)
                curveTo(9.271f, 3.073f, 7.709f, 5.669f, 10.68f, 7.553f)
                curveTo(10.68f, 7.553f, 6.682f, 6.615f, 6.437f, 9.836f)
                curveTo(6.437f, 9.836f, 6.238f, 6.318f, 2.889f, 7.29f)
                curveTo(2.889f, 7.29f, 4.039f, 4.569f, 2.279f, 3.578f)
                curveTo(2.279f, 3.578f, 4.578f, 4.447f, 5.018f, 2.099f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF9ED95))) {
                moveTo(17.178f, 7.623f)
                curveTo(17.875f, 7.623f, 18.458f, 7.078f, 18.498f, 6.373f)
                curveTo(18.513f, 6.1f, 18.603f, 3.66f, 17.147f, 2.121f)
                curveTo(16.418f, 1.35f, 15.428f, 0.943f, 14.282f, 0.943f)
                curveTo(12.354f, 0.943f, 11.387f, 1.913f, 10.611f, 2.693f)
                curveTo(9.787f, 3.521f, 9.075f, 4.235f, 6.852f, 4.235f)
                curveTo(6.121f, 4.235f, 5.529f, 4.828f, 5.529f, 5.558f)
                curveTo(5.529f, 6.289f, 6.121f, 6.881f, 6.852f, 6.881f)
                curveTo(10.175f, 6.881f, 11.51f, 5.54f, 12.486f, 4.56f)
                curveTo(13.174f, 3.869f, 13.485f, 3.589f, 14.282f, 3.589f)
                curveTo(14.824f, 3.589f, 15.071f, 3.776f, 15.225f, 3.939f)
                curveTo(15.819f, 4.566f, 15.873f, 5.903f, 15.856f, 6.226f)
                curveTo(15.815f, 6.956f, 16.374f, 7.58f, 17.103f, 7.621f)
                curveTo(17.128f, 7.622f, 17.153f, 7.623f, 17.178f, 7.623f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(18.363f, 4.67f)
                curveTo(18.381f, 4.759f, 18.395f, 4.846f, 18.409f, 4.932f)
                curveTo(17.534f, 4.968f, 16.607f, 5.04f, 15.8f, 5.375f)
                curveTo(15.787f, 5.29f, 15.771f, 5.203f, 15.753f, 5.116f)
                curveTo(16.567f, 4.792f, 17.482f, 4.71f, 18.363f, 4.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(16.1f, 3.478f)
                curveTo(16.559f, 3.135f, 17.064f, 2.882f, 17.6f, 2.699f)
                curveTo(17.65f, 2.776f, 17.695f, 2.855f, 17.74f, 2.934f)
                curveTo(17.151f, 3.128f, 16.597f, 3.41f, 16.11f, 3.803f)
                curveTo(15.9f, 3.974f, 15.684f, 4.161f, 15.514f, 4.373f)
                curveTo(15.473f, 4.287f, 15.426f, 4.207f, 15.375f, 4.131f)
                curveTo(15.595f, 3.891f, 15.84f, 3.673f, 16.1f, 3.478f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(14.985f, 3.748f)
                curveTo(14.92f, 3.711f, 14.845f, 3.677f, 14.756f, 3.651f)
                curveTo(14.843f, 3.201f, 14.982f, 2.759f, 15.132f, 2.323f)
                curveTo(15.275f, 1.907f, 15.449f, 1.519f, 15.709f, 1.186f)
                curveTo(15.796f, 1.217f, 15.883f, 1.251f, 15.967f, 1.288f)
                curveTo(15.437f, 1.915f, 15.111f, 2.874f, 14.985f, 3.748f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(13.854f, 2.765f)
                curveTo(13.872f, 3.046f, 13.892f, 3.334f, 13.951f, 3.611f)
                curveTo(13.858f, 3.623f, 13.773f, 3.642f, 13.691f, 3.666f)
                curveTo(13.689f, 3.655f, 13.685f, 3.644f, 13.683f, 3.632f)
                curveTo(13.626f, 3.308f, 13.598f, 2.974f, 13.582f, 2.645f)
                curveTo(13.556f, 2.087f, 13.587f, 1.532f, 13.66f, 0.981f)
                curveTo(13.749f, 0.97f, 13.838f, 0.96f, 13.932f, 0.954f)
                curveTo(13.849f, 1.554f, 13.817f, 2.157f, 13.854f, 2.765f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(12.878f, 4.179f)
                curveTo(12.625f, 3.824f, 12.42f, 3.409f, 12.216f, 3.089f)
                curveTo(11.937f, 2.65f, 11.748f, 2.237f, 11.625f, 1.783f)
                curveTo(11.7f, 1.729f, 11.777f, 1.676f, 11.857f, 1.625f)
                curveTo(11.974f, 2.093f, 12.163f, 2.514f, 12.444f, 2.956f)
                curveTo(12.634f, 3.253f, 12.835f, 3.662f, 13.078f, 4.006f)
                curveTo(13.014f, 4.058f, 12.947f, 4.116f, 12.878f, 4.179f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(10.327f, 2.975f)
                curveTo(10.564f, 3.303f, 10.814f, 3.62f, 11.072f, 3.935f)
                curveTo(11.361f, 4.288f, 11.682f, 4.73f, 12.105f, 4.936f)
                curveTo(12.041f, 4.998f, 11.974f, 5.06f, 11.905f, 5.123f)
                curveTo(11.605f, 4.95f, 11.352f, 4.683f, 11.123f, 4.412f)
                curveTo(10.778f, 4.004f, 10.444f, 3.59f, 10.132f, 3.158f)
                curveTo(10.198f, 3.098f, 10.263f, 3.037f, 10.327f, 2.975f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(9.186f, 3.808f)
                curveTo(9.486f, 4.644f, 9.991f, 5.448f, 10.68f, 6.015f)
                curveTo(10.597f, 6.061f, 10.512f, 6.106f, 10.424f, 6.149f)
                curveTo(9.746f, 5.562f, 9.246f, 4.752f, 8.942f, 3.912f)
                curveTo(9.027f, 3.879f, 9.108f, 3.845f, 9.186f, 3.808f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(8.805f, 6.695f)
                curveTo(8.711f, 6.714f, 8.618f, 6.735f, 8.519f, 6.752f)
                curveTo(7.993f, 6.001f, 7.692f, 5.13f, 7.638f, 4.201f)
                curveTo(7.729f, 4.192f, 7.816f, 4.182f, 7.902f, 4.17f)
                curveTo(7.952f, 5.098f, 8.261f, 5.959f, 8.805f, 6.695f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(6.971f, 4.233f)
                curveTo(6.707f, 5.105f, 6.673f, 6.01f, 6.869f, 6.881f)
                curveTo(6.864f, 6.881f, 6.858f, 6.882f, 6.852f, 6.882f)
                curveTo(6.764f, 6.882f, 6.678f, 6.872f, 6.595f, 6.856f)
                curveTo(6.415f, 5.998f, 6.443f, 5.11f, 6.689f, 4.252f)
                curveTo(6.743f, 4.246f, 6.796f, 4.236f, 6.852f, 4.236f)
                curveTo(6.894f, 4.236f, 6.931f, 4.234f, 6.971f, 4.233f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBFB26A))) {
                moveTo(17.159f, 7.061f)
                curveTo(17.706f, 7.061f, 18.191f, 6.796f, 18.495f, 6.389f)
                curveTo(18.448f, 7.086f, 17.87f, 7.623f, 17.178f, 7.623f)
                curveTo(17.153f, 7.623f, 17.128f, 7.622f, 17.103f, 7.621f)
                curveTo(16.449f, 7.585f, 15.936f, 7.077f, 15.866f, 6.447f)
                curveTo(16.172f, 6.821f, 16.637f, 7.061f, 17.159f, 7.061f)
                close()
            }
        }.build()

        return _Bomb!!
    }

@Suppress("ObjectPropertyName")
private var _Bomb: ImageVector? = null
