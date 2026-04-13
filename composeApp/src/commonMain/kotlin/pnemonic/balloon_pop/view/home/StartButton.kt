package pnemonic.balloon_pop.view.home

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PushPin
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import balloon_pop.composeapp.generated.resources.Res
import balloon_pop.composeapp.generated.resources.play
import org.jetbrains.compose.resources.stringResource
import pnemonic.VoidCallback
import pnemonic.balloon_pop.view.GlossyButton
import pnemonic.balloon_pop.view.GlowBox
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.theme.Gold
import pnemonic.balloon_pop.view.theme.LargeIconSpacing
import pnemonic.compose.lighten

private val colorContainer = Gold
private val colorContent = Gold.lighten(-0.3f)
private val colorShadow = Yellow
private val sizeShadow = 25.dp
private val sizeIconSpacing = LargeIconSpacing

@Composable
fun StartButton(modifier: Modifier = Modifier, onClick: VoidCallback) {
    GlowBox(
        modifier = modifier,
        sizeGlow = sizeShadow,
        colorGlow = colorShadow
    ) {
        GlossyButton(
            color = colorContainer,
            onClick = onClick,
        ) {
            Text(text = stringResource(Res.string.play), fontSize = 40.sp, color = colorContent)
            Spacer(modifier = Modifier.width(sizeIconSpacing))
            Icon(
                imageVector = Icons.Default.PushPin,
                contentDescription = "📌",
                modifier = Modifier.size(40.dp),
                tint = colorContent.copy(alpha = 0.8f)
            )
        }
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = previewColor)
private fun Preview() {
    MaterialTheme {
        StartButton {}
    }
}