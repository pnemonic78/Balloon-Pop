package pnemonic.balloon_pop.view.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import pnemonic.VoidCallback
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.theme.colorButton
import pnemonic.balloon_pop.view.theme.modifierButton
import pnemonic.balloon_pop.view.theme.modifierIcon
import pnemonic.balloon_pop.view.theme.sizeButton

@Composable
fun HomeButton(size: Dp = sizeButton, onClick: VoidCallback) {
    IconButton(onClick = onClick, modifier = Modifier.modifierButton(size = size)) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "🏠",
            tint = colorButton,
            modifier = Modifier.modifierIcon(size = size)
        )
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = previewColor)
private fun Preview() {
    MaterialTheme {
        HomeButton {}
    }
}