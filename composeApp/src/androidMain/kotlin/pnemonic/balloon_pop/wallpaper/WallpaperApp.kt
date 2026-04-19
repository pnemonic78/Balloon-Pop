package pnemonic.balloon_pop.wallpaper

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pnemonic.balloon_pop.view.theme.AppTheme

@Composable
fun WallpaperApp() {
    AppTheme {
        WallpaperScreen()
    }
}

@Preview
@Composable
private fun Preview() {
    WallpaperApp()
}