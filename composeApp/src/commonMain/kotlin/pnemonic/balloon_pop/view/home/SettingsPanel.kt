package pnemonic.balloon_pop.view.home

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pnemonic.BooleanCallback
import pnemonic.VoidCallback
import pnemonic.balloon_pop.getPlatform
import pnemonic.balloon_pop.view.settings.ActionPanel
import pnemonic.balloon_pop.view.settings.HelpButton
import pnemonic.balloon_pop.view.settings.MusicButton
import pnemonic.balloon_pop.view.settings.SoundButton
import pnemonic.balloon_pop.view.settings.WallpaperButton
import pnemonic.balloon_pop.view.theme.AppTheme
import pnemonic.balloon_pop.view.theme.sizeHomeButton

@Composable
fun SettingsPanel(
    modifier: Modifier = Modifier,
    isSoundEnabled: Boolean = true,
    onSoundChange: BooleanCallback,
    isMusicEnabled: Boolean = true,
    onMusicChange: BooleanCallback,
    onHelpClick: VoidCallback,
    onWallpaperClick: VoidCallback,
) {
    val platform = getPlatform()

    ActionPanel(modifier = modifier) {
        HelpButton(size = sizeHomeButton, onHelpClick)
        Spacer(modifier = Modifier.width(8.dp))
        if (platform.isWallpaperSupported) {
            WallpaperButton(size = sizeHomeButton, onWallpaperClick)
            Spacer(modifier = Modifier.width(8.dp))
        }
        SoundButton(isSoundEnabled, size = sizeHomeButton, onSoundChange)
        Spacer(modifier = Modifier.width(8.dp))
        MusicButton(isMusicEnabled, size = sizeHomeButton, onMusicChange)
    }
}

@Preview
@Composable
private fun Preview() {
    AppTheme {
        SettingsPanel(
            isSoundEnabled = true,
            onSoundChange = {},
            isMusicEnabled = false,
            onMusicChange = {},
            onHelpClick = {},
            onWallpaperClick = {},
        )
    }
}

@Preview(locale = "he")
@Composable
private fun Preview_RTL() {
    AppTheme {
        SettingsPanel(
            isSoundEnabled = true,
            onSoundChange = {},
            isMusicEnabled = false,
            onMusicChange = {},
            onHelpClick = {},
            onWallpaperClick = {},
        )
    }
}
