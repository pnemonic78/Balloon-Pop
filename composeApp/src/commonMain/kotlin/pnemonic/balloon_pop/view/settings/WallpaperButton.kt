package pnemonic.balloon_pop.view.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Wallpaper
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import pnemonic.VoidCallback
import pnemonic.balloon_pop.view.theme.AppTheme
import pnemonic.balloon_pop.view.theme.colorButton
import pnemonic.balloon_pop.view.theme.modifierButton
import pnemonic.balloon_pop.view.theme.modifierIcon
import pnemonic.balloon_pop.view.theme.sizeButton
import pnemonic.compose.click

@Composable
@Suppress("DEPRECATION")
fun WallpaperButton(size: Dp = sizeButton, onClick: VoidCallback) {
    val haptic = LocalHapticFeedback.current

    IconButton(
        onClick = {
            haptic.click()
            onClick()
        },
        modifier = Modifier.modifierButton(size = size)
    ) {
        Icon(
            imageVector = Icons.Filled.Wallpaper,
            contentDescription = "📔",
            tint = colorButton,
            modifier = Modifier.modifierIcon(size = size)
        )
    }
}

@Composable
@Preview
private fun Preview() {
    AppTheme {
        Column {
            WallpaperButton {}
        }
    }
}

@Composable
@Preview(locale = "he")
private fun Preview_RTL() {
    AppTheme {
        Column {
            WallpaperButton {}
        }
    }
}