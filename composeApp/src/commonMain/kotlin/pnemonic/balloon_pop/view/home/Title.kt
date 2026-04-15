package pnemonic.balloon_pop.view.home

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.material3.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import balloon_pop.composeapp.generated.resources.Res
import balloon_pop.composeapp.generated.resources.title
import org.jetbrains.compose.resources.stringResource
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.view.theme.AppTheme
import pnemonic.balloon_pop.view.theme.Gold
import pnemonic.balloon_pop.view.theme.Orange

private val sizeTitle = 70.sp

@Composable
fun Title(modifier: Modifier = Modifier) {
    val title = stringResource(Res.string.title)
    Title(modifier = modifier, title = title)
}

@Suppress("AssignedValueIsNeverRead")
@Composable
fun Title(modifier: Modifier = Modifier, title: String) {
    var heightPx by remember { mutableFloatStateOf(200f) }

    val style = LocalTextStyle.current.copy(
        lineHeight = sizeTitle * 1.2,
        brush = Brush.verticalGradient(
            colors = listOf(White, Yellow, Gold, Orange),
            endY = heightPx
        ),
        shadow = Shadow(blurRadius = 5f),
        fontFamily = FontFamily.Serif,
        fontSize = sizeTitle,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
    )

    BasicText(
        modifier = modifier,
        text = title,
        style = style,
        maxLines = 3,
        onTextLayout = { tlr: TextLayoutResult ->
            heightPx = tlr.size.height.toFloat()
        },
        autoSize = TextAutoSize.StepBased(
            minFontSize = 16.sp,
            maxFontSize = sizeTitle,
            stepSize = 1.sp
        ),
    )
}

@Composable
@Preview(showBackground = true, backgroundColor = previewColor, widthDp = previewWidthDp * 2)
private fun PreviewWide() {
    AppTheme {
        Title()
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = previewColor, widthDp = previewWidthDp)
private fun PreviewLong() {
    AppTheme {
        Title(title = "Popping Balloons 123")
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = previewColor, widthDp = previewWidthDp, locale = "af")
private fun Preview3() {
    AppTheme {
        Title()
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = previewColor, widthDp = previewWidthDp, locale = "ru")
private fun Preview4() {
    AppTheme {
        Title()
    }
}