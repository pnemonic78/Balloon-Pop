package pnemonic.balloon_pop

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pnemonic.balloon_pop.view.MainScreen
import pnemonic.balloon_pop.view.theme.AppTheme

@Composable
fun App() {
    AppTheme {
        MainScreen()
    }
}

@Preview
@Composable
private fun Preview() {
    App()
}