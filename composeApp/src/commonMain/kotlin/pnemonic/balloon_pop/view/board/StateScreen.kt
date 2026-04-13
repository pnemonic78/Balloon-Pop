package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import balloon_pop.composeapp.generated.resources.Res
import balloon_pop.composeapp.generated.resources.game_state_finished
import org.jetbrains.compose.resources.stringResource
import pnemonic.VoidCallback
import pnemonic.balloon_pop.model.GameState
import pnemonic.balloon_pop.view.home.HomeButton
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.view.settings.ActionPanel
import pnemonic.balloon_pop.view.theme.paddingScreen

private val colorMask = Color.Black.copy(alpha = 0.7f)
private val colorText = Color(0xFFCC0088)
private val colorShadow = Color.Magenta
private val sizeText = 60.sp

@Composable
fun StateScreen(state: GameState, onHomeClick: VoidCallback) {
    if (state === GameState.FINISHED) {
        Box(
            modifier = Modifier.fillMaxSize()
                .background(color = colorMask)
                .padding(paddingScreen)
        ) {
            ActionPanel(modifier = Modifier.align(BiasAlignment(1f, -1f))) {
                HomeButton(onClick = onHomeClick)
            }

            GameOver(
                modifier = Modifier.align(BiasAlignment(0f, 0f))
            )
        }
    }
}

@Composable
private fun GameOver(modifier: Modifier = Modifier) {
    val text = stringResource(Res.string.game_state_finished)
    GameOver(modifier = modifier, text = text)
}

@Composable
private fun GameOver(modifier: Modifier = Modifier, text: String) {
    val style = LocalTextStyle.current.copy(
        lineHeight = sizeText,
        shadow = Shadow(color = colorShadow, blurRadius = 5f)
    )

    Text(
        modifier = modifier.padding(8.dp),
        text = text,
        fontSize = sizeText,
        fontWeight = FontWeight.Bold,
        color = colorText,
        textAlign = TextAlign.Center,
        style = style,
    )
}

@Composable
@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp
)
private fun Preview() {
    MaterialTheme {
        StateScreen(state = GameState.FINISHED, onHomeClick = {})
    }
}

@Composable
@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp * 2,
    heightDp = previewHeightDp
)
private fun PreviewWide() {
    MaterialTheme {
        StateScreen(state = GameState.FINISHED, onHomeClick = {})
    }
}

@Composable
@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp,
    locale = "ru"
)
private fun Preview_AF() {
    MaterialTheme {
        StateScreen(state = GameState.FINISHED, onHomeClick = {})
    }
}