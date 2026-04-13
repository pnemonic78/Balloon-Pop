package pnemonic.balloon_pop.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lemon: ImageVector
    get() {
        if (_Lemon != null) {
            return _Lemon!!
        }
        _Lemon = ImageVector.Builder(
            name = "Lemon",
            defaultWidth = 2.9875.dp,
            defaultHeight = 3.9558.dp,
            viewportWidth = 2.9875f,
            viewportHeight = 3.9558f
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFEEA71),
                        1f to Color(0xFFFFD103)
                    ),
                    center = Offset(1.4707f, 2.004f),
                    radius = 1.6902f
                )
            ) {
                moveTo(1.8529f, 0.0396f)
                curveTo(1.9532f, 0.1211f, 2.0097f, 0.2488f, 2.1287f, 0.3096f)
                curveTo(2.4927f, 0.5704f, 2.7565f, 0.9774f, 2.8289f, 1.4204f)
                curveTo(2.8602f, 1.853f, 2.6863f, 2.2884f, 2.4043f, 2.6124f)
                curveTo(2.1511f, 2.9079f, 1.7459f, 3.071f, 1.3592f, 2.9986f)
                curveTo(0.9956f, 2.9357f, 0.6651f, 2.7408f, 0.3909f, 2.4999f)
                curveTo(0.1735f, 2.2825f, 0.053f, 1.9651f, 0.0744f, 1.6589f)
                curveTo(0.1889f, 1.0361f, 0.615f, 0.4701f, 1.1967f, 0.213f)
                curveTo(1.3384f, 0.153f, 1.497f, 0.1309f, 1.6165f, 0.0433f)
                curveTo(1.9526f, -0.1037f, 1.9239f, 0.3809f, 1.7704f, 0.3079f)
                curveTo(1.3254f, 0.2597f, 0.845f, 0.418f, 0.5488f, 0.7612f)
                curveTo(0.2549f, 1.1089f, 0.1149f, 1.6334f, 0.33f, 2.0554f)
                curveTo(0.4857f, 2.3705f, 0.8574f, 2.5354f, 1.1985f, 2.4836f)
                curveTo(1.8911f, 2.3923f, 2.4502f, 1.684f, 2.3507f, 0.9874f)
                curveTo(2.3121f, 0.7083f, 2.1302f, 0.4474f, 1.8628f, 0.3457f)
                curveTo(1.722f, 0.2602f, 1.8147f, 0.1971f, 1.8529f, 0.0396f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEDB41F))) {
                moveTo(1.9014f, 3.6499f)
                lineTo(1.8966f, 3.6396f)
                curveTo(2.0734f, 3.5636f, 2.3745f, 3.3618f, 2.6118f, 3.0114f)
                curveTo(2.7645f, 2.786f, 2.8917f, 2.4987f, 2.943f, 2.1431f)
                curveTo(3.0058f, 1.7097f, 2.929f, 1.3319f, 2.7774f, 1.0218f)
                curveTo(2.6255f, 0.7117f, 2.3983f, 0.4688f, 2.1591f, 0.3071f)
                curveTo(2.1369f, 0.2918f, 2.1144f, 0.2775f, 2.0919f, 0.2635f)
                curveTo(2.0895f, 0.2622f, 2.0869f, 0.2606f, 2.0847f, 0.259f)
                curveTo(2.0519f, 0.2362f, 2.026f, 0.2045f, 1.9985f, 0.1717f)
                curveTo(1.971f, 0.1389f, 1.9416f, 0.1055f, 1.9016f, 0.078f)
                curveTo(1.8662f, 0.0542f, 1.8225f, 0.0351f, 1.7641f, 0.0269f)
                curveTo(1.7149f, 0.0201f, 1.6773f, 0.0232f, 1.6461f, 0.032f)
                curveTo(1.6f, 0.0457f, 1.5691f, 0.0722f, 1.5408f, 0.0981f)
                curveTo(1.5119f, 0.1238f, 1.4857f, 0.1489f, 1.4481f, 0.1566f)
                curveTo(1.1423f, 0.2153f, 0.6811f, 0.4286f, 0.3665f, 0.8935f)
                curveTo(0.2118f, 1.121f, 0.0924f, 1.4089f, 0.0427f, 1.769f)
                curveTo(-0.0327f, 2.3161f, 0.1109f, 2.7225f, 0.2853f, 3.0059f)
                curveTo(0.3718f, 3.1474f, 0.4668f, 3.2578f, 0.5457f, 3.3393f)
                curveTo(0.5851f, 3.3803f, 0.6205f, 3.4136f, 0.6496f, 3.4403f)
                curveTo(0.6782f, 3.4668f, 0.6999f, 3.4861f, 0.7123f, 3.4996f)
                curveTo(0.751f, 3.5411f, 0.7864f, 3.6105f, 0.8317f, 3.6811f)
                curveTo(0.8759f, 3.7525f, 0.9288f, 3.825f, 0.9992f, 3.8727f)
                curveTo(1.0402f, 3.9004f, 1.087f, 3.9203f, 1.1423f, 3.9256f)
                curveTo(1.2516f, 3.938f, 1.3291f, 3.9367f, 1.3894f, 3.9251f)
                curveTo(1.4802f, 3.9084f, 1.5331f, 3.8692f, 1.6016f, 3.8179f)
                curveTo(1.6696f, 3.7666f, 1.7519f, 3.7025f, 1.8966f, 3.6406f)
                lineTo(1.9014f, 3.6499f)
                lineTo(1.9056f, 3.6599f)
                curveTo(1.7154f, 3.742f, 1.6373f, 3.824f, 1.5487f, 3.8822f)
                curveTo(1.5042f, 3.9113f, 1.4574f, 3.934f, 1.3939f, 3.9457f)
                curveTo(1.3301f, 3.9581f, 1.2505f, 3.9597f, 1.1399f, 3.9473f)
                curveTo(1.0806f, 3.9407f, 1.0304f, 3.9198f, 0.9867f, 3.8899f)
                curveTo(0.9121f, 3.8399f, 0.8579f, 3.7639f, 0.8131f, 3.6925f)
                curveTo(0.7676f, 3.6205f, 0.7317f, 3.5515f, 0.6967f, 3.5142f)
                curveTo(0.6854f, 3.502f, 0.6634f, 3.4824f, 0.6346f, 3.4557f)
                curveTo(0.5337f, 3.3623f, 0.3467f, 3.1816f, 0.202f, 2.9032f)
                curveTo(0.0572f, 2.6249f, -0.046f, 2.2489f, 0.0207f, 1.7653f)
                curveTo(0.0705f, 1.402f, 0.1914f, 1.1104f, 0.3477f, 0.8802f)
                curveTo(0.6668f, 0.4098f, 1.1328f, 0.1931f, 1.4439f, 0.1336f)
                curveTo(1.4635f, 0.1304f, 1.4804f, 0.1196f, 1.4979f, 0.105f)
                curveTo(1.5249f, 0.083f, 1.5527f, 0.0521f, 1.5939f, 0.0291f)
                curveTo(1.6355f, 0.0066f, 1.69f, -0.0072f, 1.7672f, 0.0039f)
                curveTo(1.8286f, 0.0127f, 1.876f, 0.0333f, 1.9141f, 0.059f)
                curveTo(1.9572f, 0.0881f, 1.9879f, 0.124f, 2.0159f, 0.1571f)
                curveTo(2.0435f, 0.1902f, 2.0681f, 0.2206f, 2.0974f, 0.2402f)
                curveTo(2.0996f, 0.2415f, 2.1019f, 0.2426f, 2.1041f, 0.2444f)
                curveTo(2.1265f, 0.2579f, 2.1493f, 0.2727f, 2.172f, 0.2884f)
                curveTo(2.4141f, 0.4524f, 2.6438f, 0.6977f, 2.7975f, 1.0115f)
                curveTo(2.9512f, 1.325f, 3.0285f, 1.7078f, 2.9655f, 2.146f)
                curveTo(2.9134f, 2.5048f, 2.7851f, 2.7958f, 2.6303f, 3.0236f)
                curveTo(2.3901f, 3.3782f, 2.0861f, 3.5816f, 1.9056f, 3.6594f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF6D43C),
                        1f to Color(0xFFF7BD02)
                    ),
                    center = Offset(1.6272f, 1.8783f),
                    radius = 1.7866f
                )
            ) {
                moveTo(1.4579f, 0.1759f)
                curveTo(0.9309f, 0.2732f, 0.4825f, 0.651f, 0.2517f, 1.1284f)
                curveTo(0.4881f, 0.6553f, 0.9299f, 0.2726f, 1.4579f, 0.1759f)
                lineTo(1.4907f, 0.1624f)
                close()
                moveTo(1.8344f, 0.051f)
                curveTo(1.978f, 0.1608f, 2.0948f, 0.3055f, 2.2507f, 0.4053f)
                curveTo(2.5535f, 0.6691f, 2.7743f, 1.0398f, 2.8307f, 1.4395f)
                curveTo(2.8541f, 1.8993f, 2.6576f, 2.3621f, 2.3339f, 2.6854f)
                curveTo(2.0536f, 2.9706f, 1.6202f, 3.0838f, 1.236f, 2.9729f)
                curveTo(0.9075f, 2.8816f, 0.6024f, 2.7018f, 0.3577f, 2.4655f)
                curveTo(0.1658f, 2.2568f, 0.067f, 1.9705f, 0.0689f, 1.6888f)
                curveTo(-0.0119f, 2.118f, 0.0671f, 2.6101f, 0.3836f, 2.93f)
                curveTo(0.5033f, 3.0292f, 0.5696f, 3.182f, 0.7089f, 3.2635f)
                curveTo(1.0302f, 3.483f, 1.465f, 3.5678f, 1.8336f, 3.4235f)
                curveTo(1.9754f, 3.3588f, 2.0794f, 3.241f, 2.2169f, 3.1681f)
                curveTo(2.6708f, 2.8175f, 2.9165f, 2.2355f, 2.9181f, 1.6689f)
                curveTo(2.91f, 1.0932f, 2.5453f, 0.5689f, 2.0689f, 0.2682f)
                curveTo(1.9791f, 0.2086f, 1.9375f, 0.0926f, 1.8344f, 0.051f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF6D43B),
                        1f to Color(0xFFF7BD02)
                    ),
                    center = Offset(1.472f, 2.002f),
                    radius = 1.6902f
                )
            ) {
                moveTo(0.2517f, 1.1281f)
                lineTo(0.2517f, 1.1281f)
                curveTo(0.1501f, 1.3335f, 0.0967f, 1.5316f, 0.0689f, 1.6888f)
                curveTo(0.0699f, 1.633f, 0.0887f, 1.4459f, 0.2517f, 1.1281f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEEC01F),
                        1f to Color(0xFFEFAB01)
                    ),
                    center = Offset(1.4542f, 1.9886f),
                    radius = 1.6892f
                )
            ) {
                moveTo(1.9016f, 0.0777f)
                curveTo(2.0165f, 0.2059f, 2.1511f, 0.3075f, 2.292f, 0.4063f)
                curveTo(2.7992f, 0.8154f, 3.0483f, 1.5022f, 2.943f, 2.1428f)
                curveTo(2.8581f, 2.7673f, 2.4731f, 3.3653f, 1.8966f, 3.6393f)
                curveTo(1.8162f, 3.6712f, 1.6464f, 3.7713f, 1.5523f, 3.8526f)
                curveTo(1.4034f, 3.9579f, 1.1954f, 3.9541f, 1.031f, 3.8905f)
                curveTo(0.8379f, 3.7873f, 0.7997f, 3.5428f, 0.6268f, 3.4177f)
                curveTo(0.2164f, 3.0496f, -0.0164f, 2.4935f, 0.0256f, 1.9422f)
                curveTo(0.0543f, 1.339f, 0.3462f, 0.7341f, 0.8621f, 0.4022f)
                curveTo(1.0434f, 0.2875f, 1.2445f, 0.1841f, 1.4591f, 0.1608f)
                curveTo(1.5033f, 0.1775f, 1.2923f, 0.2045f, 1.235f, 0.2354f)
                curveTo(0.6465f, 0.4332f, 0.2301f, 0.9807f, 0.0841f, 1.5699f)
                curveTo(0.0199f, 1.9044f, 0.0141f, 2.2613f, 0.1513f, 2.5797f)
                curveTo(0.2179f, 2.7407f, 0.3208f, 2.8893f, 0.4602f, 2.9956f)
                curveTo(0.6819f, 3.3585f, 1.1385f, 3.5161f, 1.5478f, 3.4903f)
                curveTo(1.7264f, 3.476f, 1.9124f, 3.4183f, 2.0355f, 3.2813f)
                curveTo(2.5775f, 2.9897f, 2.8795f, 2.3704f, 2.9162f, 1.7721f)
                curveTo(2.9536f, 1.16f, 2.5742f, 0.5852f, 2.0689f, 0.2677f)
                curveTo(2.0105f, 0.2124f, 1.8582f, 0.0557f, 1.8528f, 0.0507f)
                lineTo(1.8701f, 0.0591f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDF9408))) {
                moveTo(1.3862f, 0.1579f)
                curveTo(1.0798f, 0.2317f, 0.6539f, 0.4482f, 0.3565f, 0.8868f)
                curveTo(0.2014f, 1.1154f, 0.0813f, 1.4054f, 0.0313f, 1.7663f)
                curveTo(-0.12f, 2.8667f, 0.6089f, 3.4049f, 0.7041f, 3.5062f)
                curveTo(0.778f, 3.5851f, 0.8478f, 3.7822f, 0.9925f, 3.8806f)
                curveTo(1.0351f, 3.9092f, 1.0838f, 3.9295f, 1.141f, 3.9356f)
                curveTo(1.581f, 3.9843f, 1.5177f, 3.8145f, 1.9011f, 3.6496f)
                lineTo(1.8964f, 3.6393f)
                curveTo(1.7516f, 3.7012f, 1.6693f, 3.7652f, 1.6013f, 3.8166f)
                curveTo(1.5328f, 3.8679f, 1.4799f, 3.9071f, 1.3891f, 3.9237f)
                curveTo(1.3288f, 3.9354f, 1.2513f, 3.9367f, 1.142f, 3.9243f)
                curveTo(1.0867f, 3.9187f, 1.0399f, 3.8991f, 0.9989f, 3.8713f)
                lineTo(0.9989f, 3.8713f)
                curveTo(0.9282f, 3.8237f, 0.8756f, 3.7512f, 0.8314f, 3.6798f)
                curveTo(0.7862f, 3.6091f, 0.7507f, 3.5401f, 0.7121f, 3.4983f)
                curveTo(0.6996f, 3.4848f, 0.6779f, 3.4655f, 0.6494f, 3.439f)
                curveTo(0.6205f, 3.4123f, 0.5851f, 3.379f, 0.5454f, 3.3379f)
                curveTo(0.4663f, 3.2564f, 0.3716f, 3.1461f, 0.285f, 3.0046f)
                curveTo(0.1107f, 2.7215f, -0.033f, 2.3151f, 0.0424f, 1.7676f)
                curveTo(0.0922f, 1.4078f, 0.2115f, 1.1199f, 0.3663f, 0.8921f)
                curveTo(0.6737f, 0.4378f, 1.1211f, 0.2235f, 1.427f, 0.1595f)
                curveTo(1.4135f, 0.1595f, 1.4f, 0.159f, 1.3862f, 0.1579f)
                close()
                moveTo(1.8339f, 0.0317f)
                curveTo(1.8342f, 0.0357f, 1.8342f, 0.0391f, 1.8342f, 0.0436f)
                curveTo(1.8598f, 0.0526f, 1.8823f, 0.0648f, 1.9016f, 0.0777f)
                curveTo(1.9416f, 0.1053f, 1.9712f, 0.1386f, 1.9985f, 0.1714f)
                curveTo(2.026f, 0.2042f, 2.0519f, 0.236f, 2.0847f, 0.2587f)
                curveTo(2.0871f, 0.2603f, 2.0898f, 0.2619f, 2.0919f, 0.2632f)
                curveTo(2.1144f, 0.2772f, 2.1369f, 0.2915f, 2.1591f, 0.3069f)
                curveTo(2.3983f, 0.4685f, 2.6255f, 0.7114f, 2.7774f, 1.0215f)
                curveTo(2.929f, 1.3316f, 3.0058f, 1.7097f, 2.943f, 2.1428f)
                curveTo(2.8917f, 2.4984f, 2.7645f, 2.786f, 2.6118f, 3.0112f)
                curveTo(2.3745f, 3.3615f, 2.0734f, 3.5634f, 1.8966f, 3.6393f)
                lineTo(1.9014f, 3.6496f)
                curveTo(2.0797f, 3.5726f, 2.3824f, 3.3697f, 2.621f, 3.0173f)
                curveTo(2.7753f, 2.7905f, 2.9026f, 2.5016f, 2.9542f, 2.1444f)
                curveTo(3.0801f, 1.2726f, 2.6472f, 0.6236f, 2.1657f, 0.2971f)
                curveTo(2.1435f, 0.282f, 2.1205f, 0.2677f, 2.0982f, 0.2537f)
                curveTo(2.0956f, 0.2524f, 2.0932f, 0.2508f, 2.0913f, 0.2489f)
                curveTo(2.0601f, 0.228f, 2.0353f, 0.1971f, 2.0075f, 0.164f)
                curveTo(1.9797f, 0.1309f, 1.9498f, 0.0963f, 1.9085f, 0.0682f)
                curveTo(1.8866f, 0.0542f, 1.862f, 0.0415f, 1.8339f, 0.0317f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFEEE88),
                        1f to Color(0xFFFFDA04)
                    ),
                    center = Offset(1.5779f, 2.0035f),
                    radius = 1.8789f
                )
            ) {
                moveTo(0.3816f, 1.4848f)
                curveTo(0.4449f, 1.3602f, 0.637f, 1.4245f, 0.6152f, 1.561f)
                curveTo(0.6197f, 1.6697f, 0.4869f, 1.7811f, 0.392f, 1.6964f)
                curveTo(0.3335f, 1.6427f, 0.3408f, 1.5466f, 0.3816f, 1.4848f)
                close()
                moveTo(0.643f, 0.7077f)
                curveTo(0.7246f, 0.616f, 0.8463f, 0.5158f, 0.9773f, 0.5545f)
                curveTo(1.0918f, 0.6135f, 1.0824f, 0.7686f, 1.055f, 0.8757f)
                curveTo(1.0011f, 1.0623f, 0.8841f, 1.2447f, 0.7056f, 1.3318f)
                curveTo(0.6092f, 1.3841f, 0.4762f, 1.3259f, 0.4619f, 1.2139f)
                curveTo(0.4337f, 1.0299f, 0.5285f, 0.8461f, 0.643f, 0.7077f)
                close()
                moveTo(1.7768f, 0.3075f)
                curveTo(1.785f, 0.3706f, 1.8489f, 0.3317f, 1.7823f, 0.3237f)
                curveTo(1.7212f, 0.3424f, 1.7273f, 0.3475f, 1.7808f, 0.3548f)
                curveTo(1.8036f, 0.262f, 1.627f, 0.3006f, 1.5604f, 0.2851f)
                curveTo(1.0782f, 0.2859f, 0.6112f, 0.5707f, 0.3882f, 0.9981f)
                curveTo(0.2054f, 1.3296f, 0.1547f, 1.7619f, 0.3541f, 2.0979f)
                curveTo(0.5163f, 2.3793f, 0.8567f, 2.5259f, 1.1744f, 2.4863f)
                curveTo(1.6983f, 2.4301f, 2.1436f, 2.0188f, 2.3033f, 1.526f)
                curveTo(2.4151f, 1.1898f, 2.3805f, 0.781f, 2.1242f, 0.5177f)
                curveTo(2.0305f, 0.4156f, 1.9053f, 0.354f, 1.7768f, 0.3075f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(1.2445f, 3.2716f),
                    radius = 0.0208f
                )
            ) {
                moveTo(1.2545f, 3.2501f)
                curveTo(1.2664f, 3.2562f, 1.2711f, 3.2699f, 1.2653f, 3.2816f)
                curveTo(1.2598f, 3.2935f, 1.2457f, 3.2983f, 1.2338f, 3.293f)
                curveTo(1.2225f, 3.2874f, 1.2177f, 3.2731f, 1.2233f, 3.2612f)
                curveTo(1.2291f, 3.2496f, 1.2431f, 3.2448f, 1.2545f, 3.2501f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(1.6672f, 3.4079f),
                    radius = 0.0233f
                )
            ) {
                moveTo(1.6797f, 3.3845f)
                curveTo(1.6932f, 3.3914f, 1.6992f, 3.4075f, 1.6929f, 3.4205f)
                curveTo(1.6865f, 3.4337f, 1.6701f, 3.4387f, 1.6566f, 3.4324f)
                curveTo(1.6431f, 3.4258f, 1.6373f, 3.4094f, 1.6437f, 3.3967f)
                curveTo(1.6498f, 3.3834f, 1.6662f, 3.3776f, 1.6797f, 3.3845f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(1.9579f, 3.3157f),
                    radius = 0.0199f
                )
            ) {
                moveTo(1.9691f, 3.2935f)
                curveTo(1.9815f, 3.2993f, 1.9871f, 3.3141f, 1.981f, 3.3266f)
                curveTo(1.9749f, 3.3395f, 1.9599f, 3.344f, 1.9474f, 3.3379f)
                curveTo(1.9345f, 3.3319f, 1.9292f, 3.3168f, 1.9352f, 3.3046f)
                curveTo(1.9411f, 3.2919f, 1.9564f, 3.2871f, 1.9691f, 3.2935f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(2.0874f, 2.9267f),
                    radius = 0.0247f
                )
            ) {
                moveTo(2.1003f, 2.9006f)
                curveTo(2.1152f, 2.9072f, 2.121f, 2.9247f, 2.1141f, 2.9389f)
                curveTo(2.107f, 2.954f, 2.0898f, 2.9601f, 2.0752f, 2.9532f)
                curveTo(2.0604f, 2.9458f, 2.0543f, 2.9286f, 2.0615f, 2.9141f)
                curveTo(2.0683f, 2.8993f, 2.0855f, 2.8929f, 2.1003f, 2.9006f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(2.2164f, 3.3027f),
                    radius = 0.0315f
                )
            ) {
                moveTo(2.2308f, 3.2723f)
                curveTo(2.2467f, 3.2797f, 2.2527f, 3.299f, 2.2451f, 3.3149f)
                curveTo(2.2374f, 3.3313f, 2.2181f, 3.3379f, 2.2025f, 3.3308f)
                curveTo(2.1871f, 3.3234f, 2.1805f, 3.3033f, 2.1882f, 3.2877f)
                curveTo(2.1964f, 3.2713f, 2.2152f, 3.2647f, 2.2308f, 3.2723f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(1.8356f, 3.5244f),
                    radius = 0.0121f
                )
            ) {
                moveTo(1.8418f, 3.5112f)
                curveTo(1.8487f, 3.5149f, 1.8524f, 3.5239f, 1.8487f, 3.5306f)
                curveTo(1.8453f, 3.5377f, 1.8363f, 3.5403f, 1.8294f, 3.5366f)
                curveTo(1.822f, 3.5329f, 1.8191f, 3.5242f, 1.8223f, 3.5179f)
                curveTo(1.826f, 3.5107f, 1.8344f, 3.5078f, 1.8418f, 3.5112f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(1.634f, 3.0057f),
                    radius = 0.0136f
                )
            ) {
                moveTo(1.641f, 2.9911f)
                curveTo(1.6495f, 2.9953f, 1.6527f, 3.0048f, 1.649f, 3.0128f)
                curveTo(1.6453f, 3.0207f, 1.6352f, 3.0239f, 1.627f, 3.0196f)
                curveTo(1.6185f, 3.0157f, 1.6151f, 3.0059f, 1.6191f, 2.9982f)
                curveTo(1.6228f, 2.9903f, 1.6326f, 2.9871f, 1.641f, 2.9911f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(2.4625f, 2.8505f),
                    radius = 0.0267f
                )
            ) {
                moveTo(2.4758f, 2.8212f)
                curveTo(2.4917f, 2.8289f, 2.4985f, 2.8487f, 2.4906f, 2.8651f)
                curveTo(2.4829f, 2.8813f, 2.4631f, 2.8881f, 2.4467f, 2.8802f)
                curveTo(2.4308f, 2.8725f, 2.4239f, 2.8527f, 2.4316f, 2.8363f)
                curveTo(2.4393f, 2.8199f, 2.4591f, 2.8133f, 2.4758f, 2.8212f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(2.3025f, 2.5843f),
                    radius = 0.0233f
                )
            ) {
                moveTo(2.3139f, 2.5595f)
                curveTo(2.3276f, 2.5664f, 2.3334f, 2.5831f, 2.3271f, 2.5963f)
                curveTo(2.321f, 2.6093f, 2.3043f, 2.6146f, 2.2903f, 2.6077f)
                curveTo(2.2766f, 2.6011f, 2.2713f, 2.5847f, 2.2774f, 2.572f)
                curveTo(2.2837f, 2.559f, 2.3004f, 2.5535f, 2.3139f, 2.5595f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(2.3764f, 2.3907f),
                    radius = 0.0236f
                )
            ) {
                moveTo(2.3882f, 2.3664f)
                curveTo(2.4012f, 2.3722f, 2.4059f, 2.3878f, 2.3991f, 2.4011f)
                curveTo(2.393f, 2.4143f, 2.3776f, 2.4198f, 2.3652f, 2.414f)
                curveTo(2.3525f, 2.4079f, 2.3477f, 2.3923f, 2.3543f, 2.3791f)
                curveTo(2.3607f, 2.3659f, 2.376f, 2.3603f, 2.3882f, 2.3664f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFBDC6E),
                        1f to Color(0xFFE79B24)
                    ),
                    center = Offset(2.6398f, 2.3987f),
                    radius = 0.0247f
                )
            ) {
                moveTo(2.6528f, 2.3722f)
                curveTo(2.6673f, 2.3794f, 2.6737f, 2.3968f, 2.6668f, 2.4108f)
                curveTo(2.6599f, 2.4257f, 2.6422f, 2.4312f, 2.6277f, 2.4241f)
                curveTo(2.6134f, 2.4172f, 2.6068f, 2.4f, 2.6139f, 2.3854f)
                curveTo(2.6208f, 2.3712f, 2.6382f, 2.3648f, 2.6528f, 2.3722f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEDB41F))) {
                moveTo(2.0837f, 0.3447f)
                curveTo(2.0493f, 0.377f, 1.9953f, 0.3897f, 1.9503f, 0.3942f)
                curveTo(1.8014f, 0.4095f, 1.6564f, 0.3265f, 1.5397f, 0.2444f)
                curveTo(1.5341f, 0.2405f, 1.54f, 0.2309f, 1.5458f, 0.2352f)
                curveTo(1.6619f, 0.3169f, 1.8008f, 0.3945f, 1.9479f, 0.3836f)
                curveTo(1.9911f, 0.3804f, 2.0432f, 0.3672f, 2.0763f, 0.3365f)
                curveTo(2.0816f, 0.3312f, 2.0892f, 0.3399f, 2.0837f, 0.3447f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFADB),
                        1f to Color(0xFFFFF4B3)
                    ),
                    center = Offset(1.4707f, 2.004f),
                    radius = 1.6902f
                )
            ) {
                moveTo(0.9992f, 0.5664f)
                curveTo(1.0764f, 0.6186f, 1.0994f, 0.7651f, 1.0349f, 0.9398f)
                curveTo(0.9401f, 1.1956f, 0.6981f, 1.4229f, 0.5396f, 1.329f)
                curveTo(0.5364f, 1.3271f, 0.534f, 1.3255f, 0.5314f, 1.3239f)
                curveTo(0.3837f, 1.2237f, 0.4676f, 0.9101f, 0.643f, 0.7077f)
                curveTo(0.7676f, 0.5633f, 0.9113f, 0.5138f, 0.9933f, 0.5625f)
                curveTo(0.9954f, 0.5638f, 0.9973f, 0.5648f, 0.9992f, 0.5664f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFADB),
                        1f to Color(0xFFFFF4B3)
                    ),
                    center = Offset(1.4697f, 2.0055f),
                    radius = 1.6922f
                )
            ) {
                moveTo(0.5576f, 1.4335f)
                curveTo(0.5933f, 1.4578f, 0.6176f, 1.5049f, 0.6155f, 1.561f)
                curveTo(0.6105f, 1.6589f, 0.5287f, 1.751f, 0.4343f, 1.7203f)
                curveTo(0.4226f, 1.7166f, 0.4128f, 1.7115f, 0.4038f, 1.7055f)
                curveTo(0.338f, 1.6607f, 0.3343f, 1.5568f, 0.3819f, 1.4848f)
                curveTo(0.4202f, 1.4271f, 0.4832f, 1.4049f, 0.5319f, 1.4208f)
                curveTo(0.5409f, 1.4239f, 0.5494f, 1.4279f, 0.5576f, 1.4335f)
                close()
            }
        }.build()

        return _Lemon!!
    }

@Suppress("ObjectPropertyName")
private var _Lemon: ImageVector? = null
