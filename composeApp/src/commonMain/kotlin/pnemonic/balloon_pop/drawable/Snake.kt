package pnemonic.balloon_pop.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Snake: ImageVector
    get() {
        if (_Snake != null) {
            return _Snake!!
        }
        _Snake = ImageVector.Builder(
            name = "Snake",
            defaultWidth = 116.42.dp,
            defaultHeight = 262.56.dp,
            viewportWidth = 116.42f,
            viewportHeight = 262.56f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF00EE21),
                        0.13f to Color(0xFF05EE22),
                        0.29f to Color(0xFF13F027),
                        0.45f to Color(0xFF2BF22D),
                        0.63f to Color(0xFF4DF637),
                        0.81f to Color(0xFF78FA43),
                        1f to Color(0xFFABFF52)
                    ),
                    start = Offset(75.33f, 237.57f),
                    end = Offset(64.91f, 198.12f)
                )
            ) {
                moveTo(82.4f, 185.83f)
                curveTo(69.79f, 177.66f, 58.65f, 191.02f, 58.65f, 191.02f)
                lineTo(44.55f, 229.61f)
                lineTo(88.34f, 225.9f)
                curveTo(88.34f, 225.9f, 92.05f, 221.45f, 94.28f, 213.29f)
                curveTo(96.51f, 205.12f, 95.02f, 193.99f, 82.4f, 185.83f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF00EE21),
                        0.13f to Color(0xFF05EE22),
                        0.29f to Color(0xFF13F027),
                        0.45f to Color(0xFF2BF22D),
                        0.63f to Color(0xFF4DF637),
                        0.81f to Color(0xFF78FA43),
                        1f to Color(0xFFABFF52)
                    ),
                    start = Offset(-0f, 229.57f),
                    end = Offset(31.7f, 229.57f)
                )
            ) {
                moveTo(0.76f, 223.68f)
                curveTo(-2.2f, 235.55f, 3.73f, 245.94f, 14.12f, 247.43f)
                curveTo(24.51f, 248.91f, 38.79f, 227.56f, 27.64f, 215.01f)
                curveTo(21.68f, 208.31f, 3.73f, 211.8f, 0.76f, 223.68f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF00EE21),
                        0.13f to Color(0xFF05EE22),
                        0.29f to Color(0xFF13F027),
                        0.45f to Color(0xFF2BF22D),
                        0.63f to Color(0xFF4DF637),
                        0.81f to Color(0xFF78FA43),
                        1f to Color(0xFFABFF52)
                    ),
                    start = Offset(80.48f, 138.05f),
                    end = Offset(48.48f, 126.88f)
                )
            ) {
                moveTo(44.55f, 26.26f)
                curveTo(32.04f, 37.45f, 46.78f, 49.26f, 54.2f, 58.17f)
                curveTo(61.62f, 67.08f, 56.43f, 107.15f, 48.26f, 127.94f)
                curveTo(40.1f, 148.72f, 27.48f, 183.6f, 24.51f, 205.86f)
                curveTo(21.54f, 228.13f, 31.94f, 231.1f, 40.84f, 232.58f)
                curveTo(49.75f, 234.07f, 55.69f, 223.68f, 59.4f, 204.38f)
                curveTo(63.11f, 185.08f, 80.92f, 139.81f, 86.86f, 115.32f)
                curveTo(92.79f, 90.83f, 94.28f, 60.4f, 83.89f, 44.07f)
                curveTo(73.5f, 27.74f, 58.65f, 13.64f, 44.55f, 26.26f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF00EE21),
                        0.13f to Color(0xFF05EE22),
                        0.29f to Color(0xFF13F027),
                        0.45f to Color(0xFF2BF22D),
                        0.63f to Color(0xFF4DF637),
                        0.81f to Color(0xFF78FA43),
                        1f to Color(0xFFABFF52)
                    ),
                    start = Offset(43.67f, 264.88f),
                    end = Offset(22.83f, 232.87f)
                )
            ) {
                moveTo(37.88f, 223.67f)
                curveTo(21.54f, 217.14f, 7.45f, 225.9f, 8.93f, 244.45f)
                curveTo(10.41f, 263.01f, 34.91f, 267.46f, 43.81f, 257.07f)
                curveTo(52.72f, 246.68f, 49.01f, 228.12f, 37.88f, 223.67f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF00EE21),
                        0.13f to Color(0xFF05EE22),
                        0.29f to Color(0xFF13F027),
                        0.45f to Color(0xFF2BF22D),
                        0.63f to Color(0xFF4DF637),
                        0.81f to Color(0xFF78FA43),
                        1f to Color(0xFFABFF52)
                    ),
                    start = Offset(82.27f, 263.66f),
                    end = Offset(78.48f, 231.06f)
                )
            ) {
                moveTo(100.07f, 223.84f)
                curveTo(87.57f, 221.62f, 60.05f, 221.95f, 49.32f, 228.86f)
                curveTo(43.63f, 232.52f, 37.36f, 250.48f, 52.2f, 256.69f)
                curveTo(67.04f, 262.9f, 105.41f, 259.87f, 113.58f, 248.08f)
                curveTo(121.74f, 236.28f, 110.79f, 225.74f, 100.07f, 223.84f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(57.41f, 230.64f)
                curveTo(56.67f, 233.61f, 103.56f, 235.1f, 103.56f, 230.64f)
                curveTo(103.56f, 225.23f, 58.33f, 226.97f, 57.41f, 230.64f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(15.73f, 232.21f)
                curveTo(15.16f, 236.5f, 30.2f, 230.39f, 26.91f, 226.96f)
                curveTo(23.63f, 223.52f, 16.02f, 230f, 15.73f, 232.21f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(7.44f, 219.97f)
                curveTo(8.19f, 223.68f, 16.35f, 221.45f, 15.61f, 218.48f)
                curveTo(14.87f, 215.51f, 6.7f, 216.25f, 7.44f, 219.97f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF00EE21),
                        0.13f to Color(0xFF05EE22),
                        0.29f to Color(0xFF13F027),
                        0.45f to Color(0xFF2BF22D),
                        0.63f to Color(0xFF4DF637),
                        0.81f to Color(0xFF78FA43),
                        1f to Color(0xFFABFF52)
                    ),
                    start = Offset(53.14f, 18.26f),
                    end = Offset(39.74f, 9.33f)
                )
            ) {
                moveTo(48.11f, 2.04f)
                curveTo(30.12f, 4.93f, 34.96f, 23.26f, 34.96f, 23.26f)
                lineTo(64.92f, 18.37f)
                curveTo(64.92f, 18.37f, 62.6f, -0.28f, 48.11f, 2.04f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF00EE21),
                        0.13f to Color(0xFF05EE22),
                        0.29f to Color(0xFF13F027),
                        0.45f to Color(0xFF2BF22D),
                        0.63f to Color(0xFF4DF637),
                        0.81f to Color(0xFF78FA43),
                        1f to Color(0xFFABFF52)
                    ),
                    start = Offset(89.26f, 23.14f),
                    end = Offset(71.39f, 8.63f)
                )
            ) {
                moveTo(78f, 0.03f)
                curveTo(62.72f, -0.83f, 62.78f, 19.16f, 62.78f, 19.16f)
                lineTo(92.8f, 20.75f)
                curveTo(92.8f, 20.75f, 93.29f, 0.88f, 78f, 0.03f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF00EE21),
                        0.13f to Color(0xFF05EE22),
                        0.29f to Color(0xFF13F027),
                        0.45f to Color(0xFF2BF22D),
                        0.63f to Color(0xFF4DF637),
                        0.81f to Color(0xFF78FA43),
                        1f to Color(0xFFABFF52)
                    ),
                    start = Offset(74.8f, 57.45f),
                    end = Offset(56.94f, 56.71f)
                )
            ) {
                moveTo(64.31f, 46.07f)
                curveTo(57.77f, 46.92f, 48.66f, 52.06f, 48.66f, 52.06f)
                curveTo(48.66f, 52.06f, 48.59f, 69.49f, 65.9f, 68.02f)
                curveTo(83.2f, 66.55f, 81.98f, 50.23f, 81.98f, 50.23f)
                curveTo(81.98f, 50.23f, 70.85f, 45.21f, 64.31f, 46.07f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.67f,
                strokeAlpha = 0.67f
            ) {
                moveTo(66.1f, 73.54f)
                curveTo(64.87f, 73.63f, 63.94f, 74.7f, 64.03f, 75.93f)
                curveTo(65.62f, 98.5f, 57.47f, 120.6f, 49.59f, 141.97f)
                curveTo(42.44f, 161.34f, 35.06f, 181.36f, 34.54f, 202.2f)
                curveTo(34.51f, 203.43f, 35.48f, 204.46f, 36.72f, 204.49f)
                curveTo(36.74f, 204.49f, 36.76f, 204.49f, 36.77f, 204.49f)
                curveTo(37.98f, 204.49f, 38.98f, 203.52f, 39.01f, 202.31f)
                curveTo(39.5f, 182.21f, 46.76f, 162.54f, 53.78f, 143.51f)
                curveTo(61.82f, 121.7f, 70.14f, 99.15f, 68.48f, 75.62f)
                curveTo(68.4f, 74.38f, 67.33f, 73.46f, 66.1f, 73.54f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.67f,
                strokeAlpha = 0.67f
            ) {
                moveTo(40.8f, 7.56f)
                curveTo(41.43f, 10.71f, 54.77f, 8.16f, 53.27f, 5.45f)
                curveTo(51.77f, 2.75f, 40.35f, 5.3f, 40.8f, 7.56f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.67f,
                strokeAlpha = 0.67f
            ) {
                moveTo(72.34f, 4.4f)
                curveTo(72f, 6.82f, 84.21f, 7.56f, 83.61f, 4.85f)
                curveTo(83.01f, 2.15f, 72.79f, 1.25f, 72.34f, 4.4f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF00EE21),
                        0.13f to Color(0xFF05EE22),
                        0.29f to Color(0xFF13F027),
                        0.45f to Color(0xFF2BF22D),
                        0.63f to Color(0xFF4DF637),
                        0.81f to Color(0xFF78FA43),
                        1f to Color(0xFFABFF52)
                    ),
                    start = Offset(67.74f, 50.18f),
                    end = Offset(66.25f, 31.57f)
                )
            ) {
                moveTo(62.44f, 17.92f)
                curveTo(40.22f, 19.35f, 10.5f, 25.22f, 19.47f, 47.96f)
                curveTo(25.94f, 64.35f, 51.26f, 50.4f, 66.28f, 51.1f)
                curveTo(81.3f, 51.8f, 111.82f, 61.48f, 115.53f, 40.28f)
                curveTo(119.55f, 17.36f, 78.51f, 16.88f, 62.44f, 17.92f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.67f,
                strokeAlpha = 0.67f
            ) {
                moveTo(103.23f, 26.01f)
                curveTo(102.54f, 25.79f, 86.09f, 20.42f, 64f, 21.47f)
                curveTo(44.82f, 22.39f, 27.26f, 30.12f, 26.53f, 30.45f)
                curveTo(25.4f, 30.95f, 24.89f, 32.27f, 25.39f, 33.4f)
                curveTo(25.76f, 34.23f, 26.58f, 34.72f, 27.44f, 34.72f)
                curveTo(27.74f, 34.72f, 28.05f, 34.66f, 28.34f, 34.53f)
                curveTo(28.52f, 34.45f, 45.86f, 26.82f, 64.22f, 25.94f)
                curveTo(85.43f, 24.92f, 101.67f, 30.2f, 101.83f, 30.25f)
                curveTo(103f, 30.64f, 104.26f, 30.01f, 104.65f, 28.84f)
                curveTo(105.04f, 27.67f, 104.4f, 26.4f, 103.23f, 26.01f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.67f,
                strokeAlpha = 0.67f
            ) {
                moveTo(68.3f, 193.67f)
                curveTo(67.2f, 194.23f, 66.77f, 195.58f, 67.33f, 196.67f)
                curveTo(70.98f, 203.78f, 67.83f, 213.58f, 60.73f, 217.23f)
                curveTo(59.63f, 217.8f, 59.2f, 219.14f, 59.76f, 220.24f)
                curveTo(60.16f, 221.01f, 60.94f, 221.45f, 61.75f, 221.45f)
                curveTo(62.09f, 221.45f, 62.44f, 221.37f, 62.77f, 221.21f)
                curveTo(67.18f, 218.94f, 70.64f, 214.71f, 72.29f, 209.61f)
                curveTo(73.93f, 204.5f, 73.57f, 199.04f, 71.3f, 194.63f)
                curveTo(70.74f, 193.54f, 69.4f, 193.1f, 68.3f, 193.67f)
                close()
            }
        }.build()

        return _Snake!!
    }

@Suppress("ObjectPropertyName")
private var _Snake: ImageVector? = null
