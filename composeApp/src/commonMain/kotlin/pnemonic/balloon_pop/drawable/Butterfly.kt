package pnemonic.balloon_pop.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Butterfly: ImageVector
    get() {
        if (_Butterfly != null) {
            return _Butterfly!!
        }
        _Butterfly = ImageVector.Builder(
            name = "Butterfly",
            defaultWidth = 204.07.dp,
            defaultHeight = 169.31.dp,
            viewportWidth = 204.07f,
            viewportHeight = 169.31f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBF00FF),
                        1f to Color(0xFFD8B8FF)
                    ),
                    start = Offset(142.23f, 140.91f),
                    end = Offset(146.77f, 108.88f)
                )
            ) {
                moveTo(128.99f, 104.79f)
                curveTo(136.42f, 103.82f, 152.73f, 109.68f, 163.06f, 118f)
                curveTo(173.4f, 126.33f, 171.51f, 135.64f, 168.86f, 139.92f)
                curveTo(166.22f, 144.2f, 160.42f, 149.16f, 145.2f, 141.91f)
                curveTo(129.99f, 134.67f, 118.61f, 124.9f, 118.1f, 117.07f)
                curveTo(117.75f, 111.66f, 124.28f, 105.41f, 128.99f, 104.79f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBF00FF),
                        1f to Color(0xFFD8B8FF)
                    ),
                    start = Offset(173.04f, 82.22f),
                    end = Offset(162.78f, 71.55f)
                )
            ) {
                moveTo(201.81f, 45.76f)
                curveTo(201.81f, 45.76f, 185.42f, 67.85f, 168.47f, 83.66f)
                curveTo(151.52f, 99.48f, 139.75f, 109.85f, 132.38f, 106.31f)
                curveTo(132.38f, 106.31f, 144.26f, 83.6f, 160.28f, 67.44f)
                curveTo(176.31f, 51.28f, 201.81f, 45.76f, 201.81f, 45.76f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBF00FF),
                        1f to Color(0xFFD8B8FF)
                    ),
                    start = Offset(163.29f, 75.23f),
                    end = Offset(142.41f, 55.61f)
                )
            ) {
                moveTo(112.71f, 110.32f)
                curveTo(106.48f, 105.55f, 107.59f, 95.77f, 118.13f, 80.2f)
                curveTo(128.67f, 64.63f, 177.3f, 18.19f, 190.78f, 21.63f)
                curveTo(204.25f, 25.07f, 206.56f, 39.36f, 201.81f, 45.76f)
                curveTo(201.81f, 45.76f, 168.67f, 68.98f, 154.4f, 83.96f)
                curveTo(140.13f, 98.93f, 127.47f, 121.61f, 112.71f, 110.32f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBF00FF),
                        0.02f to Color(0xFFC10DFF),
                        0.14f to Color(0xFFC949FF),
                        0.24f to Color(0xFFCF79FF),
                        0.34f to Color(0xFFD49BFF),
                        0.41f to Color(0xFFD7B0FF),
                        0.46f to Color(0xFFD8B8FF),
                        0.53f to Color(0xFFD7B3FF),
                        0.61f to Color(0xFFD5A5FF),
                        0.7f to Color(0xFFD28DFF),
                        0.79f to Color(0xFFCE6BFF),
                        0.88f to Color(0xFFC840FF),
                        0.98f to Color(0xFFC10DFF),
                        1f to Color(0xFFBF00FF)
                    ),
                    start = Offset(124.37f, 67.39f),
                    end = Offset(94.36f, 22.98f)
                )
            ) {
                moveTo(113.88f, 95.19f)
                curveTo(104.29f, 95.05f, 102.13f, 87.13f, 101.94f, 79.16f)
                curveTo(101.75f, 71.18f, 106.23f, 63.37f, 110.31f, 63.04f)
                curveTo(110.31f, 63.04f, 107.46f, 32.48f, 108f, 26.09f)
                curveTo(108f, 26.09f, 96.55f, 22.88f, 98.57f, 9.67f)
                curveTo(100.59f, -3.54f, 114.26f, -1.34f, 117.63f, 5.18f)
                curveTo(120.99f, 11.7f, 121.13f, 21.23f, 112.56f, 25.16f)
                curveTo(112.56f, 25.16f, 113.18f, 56.74f, 114.41f, 61.94f)
                curveTo(114.41f, 61.94f, 121.82f, 62.27f, 123.97f, 74.45f)
                curveTo(125.67f, 84.04f, 122f, 95.32f, 113.88f, 95.19f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBF00FF),
                        0.02f to Color(0xFFC10DFF),
                        0.14f to Color(0xFFC949FF),
                        0.24f to Color(0xFFCF79FF),
                        0.34f to Color(0xFFD49BFF),
                        0.41f to Color(0xFFD7B0FF),
                        0.46f to Color(0xFFD8B8FF),
                        0.53f to Color(0xFFD7B3FF),
                        0.61f to Color(0xFFD5A5FF),
                        0.7f to Color(0xFFD28DFF),
                        0.79f to Color(0xFFCE6BFF),
                        0.88f to Color(0xFFC840FF),
                        0.98f to Color(0xFFC10DFF),
                        1f to Color(0xFFBF00FF)
                    ),
                    start = Offset(86.61f, 95.92f),
                    end = Offset(61.9f, 33.51f)
                )
            ) {
                moveTo(108.25f, 97.76f)
                curveTo(114.41f, 90.41f, 109.84f, 83.6f, 103.93f, 78.24f)
                curveTo(98.02f, 72.88f, 89.18f, 71.17f, 86.26f, 74.03f)
                curveTo(86.26f, 74.03f, 65f, 51.89f, 59.82f, 48.12f)
                curveTo(59.82f, 48.12f, 64.88f, 37.36f, 53.57f, 30.25f)
                curveTo(42.25f, 23.14f, 34.97f, 34.92f, 37.7f, 41.73f)
                curveTo(40.43f, 48.54f, 47.56f, 54.88f, 56.13f, 50.96f)
                curveTo(56.13f, 50.96f, 79.61f, 72.09f, 82.74f, 76.41f)
                curveTo(82.74f, 76.41f, 78.15f, 82.23f, 85.96f, 91.83f)
                curveTo(92.1f, 99.39f, 103.04f, 103.99f, 108.25f, 97.76f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBF00FF),
                        1f to Color(0xFFD8B8FF)
                    ),
                    start = Offset(124.02f, 149.62f),
                    end = Offset(96.82f, 132.12f)
                )
            ) {
                moveTo(105.35f, 115.99f)
                curveTo(99.75f, 120.98f, 93.52f, 137.14f, 93.06f, 150.4f)
                curveTo(92.6f, 163.67f, 100.88f, 168.33f, 105.85f, 169.13f)
                curveTo(110.82f, 169.92f, 118.36f, 168.78f, 122.83f, 152.53f)
                curveTo(127.3f, 136.28f, 127.35f, 121.28f, 121.76f, 115.78f)
                curveTo(117.9f, 111.97f, 108.89f, 112.83f, 105.35f, 115.99f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBF00FF),
                        1f to Color(0xFFD8B8FF)
                    ),
                    start = Offset(59.47f, 134.55f),
                    end = Offset(58.1f, 119.82f)
                )
            ) {
                moveTo(13.07f, 132.48f)
                curveTo(13.07f, 132.48f, 40.49f, 134.52f, 63.55f, 132.04f)
                curveTo(86.6f, 129.56f, 102.14f, 127.44f, 104.29f, 119.55f)
                curveTo(104.29f, 119.55f, 79.34f, 113.68f, 56.63f, 115.24f)
                curveTo(33.92f, 116.8f, 13.07f, 132.48f, 13.07f, 132.48f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBF00FF),
                        1f to Color(0xFFD8B8FF)
                    ),
                    start = Offset(60.56f, 122.61f),
                    end = Offset(59.36f, 93.98f)
                )
            ) {
                moveTo(120.18f, 107.29f)
                curveTo(120.65f, 99.45f, 112.52f, 93.9f, 93.85f, 91.69f)
                curveTo(75.18f, 89.48f, 8.24f, 95.91f, 2.03f, 108.35f)
                curveTo(-4.18f, 120.79f, 5.12f, 131.89f, 13.07f, 132.48f)
                curveTo(13.07f, 132.48f, 52.31f, 122.59f, 72.97f, 121.59f)
                curveTo(93.63f, 120.58f, 119.07f, 125.84f, 120.18f, 107.29f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(6.22f, 109.12f)
                curveTo(4.94f, 105.48f, 35.52f, 97.63f, 64.18f, 95.66f)
                curveTo(89.15f, 93.94f, 101.05f, 95.69f, 101.12f, 98.35f)
                curveTo(101.14f, 99.45f, 74.31f, 98.6f, 57.78f, 100.12f)
                curveTo(29.41f, 102.73f, 7.18f, 111.83f, 6.22f, 109.12f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(133.76f, 71.51f)
                curveTo(131.12f, 69f, 159.81f, 41.17f, 171.96f, 33.31f)
                curveTo(184.1f, 25.45f, 186.96f, 24.98f, 187.81f, 26.83f)
                curveTo(188.1f, 27.46f, 173.9f, 35.88f, 160.35f, 48.22f)
                curveTo(146.8f, 60.56f, 135.12f, 72.81f, 133.76f, 71.51f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(89.85f, 76.63f)
                curveTo(88.11f, 79.43f, 98.65f, 84.12f, 99.65f, 82.13f)
                curveTo(100.66f, 80.13f, 91.17f, 74.49f, 89.85f, 76.63f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(110.66f, 66.34f)
                curveTo(108.15f, 66.25f, 107.36f, 75.91f, 109.07f, 76.28f)
                curveTo(110.77f, 76.65f, 113.78f, 66.44f, 110.66f, 66.34f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(42.19f, 33.28f)
                curveTo(42.77f, 36.39f, 51.75f, 32.37f, 50.88f, 30.46f)
                curveTo(50.01f, 28.56f, 41.66f, 30.45f, 42.19f, 33.28f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(107.39f, 2.95f)
                curveTo(104.15f, 1.74f, 99.98f, 9.41f, 102.27f, 11.05f)
                curveTo(104.55f, 12.69f, 109.7f, 3.81f, 107.39f, 2.95f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(104.28f, 128.76f)
                curveTo(100.2f, 128.9f, 96.18f, 150.51f, 99.59f, 151.26f)
                curveTo(103.01f, 152f, 108.82f, 128.61f, 104.28f, 128.76f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                fillAlpha = 0.46f,
                strokeAlpha = 0.46f
            ) {
                moveTo(138.08f, 113.69f)
                curveTo(136.12f, 115.97f, 158.92f, 129.88f, 160.27f, 126.96f)
                curveTo(161.63f, 124.03f, 141.34f, 109.9f, 138.08f, 113.69f)
                close()
            }
        }.build()

        return _Butterfly!!
    }

@Suppress("ObjectPropertyName")
private var _Butterfly: ImageVector? = null
