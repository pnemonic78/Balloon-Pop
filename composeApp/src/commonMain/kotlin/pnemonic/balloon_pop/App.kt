package pnemonic.balloon_pop

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import pnemonic.balloon_pop.view.MainScreen

@Composable
fun App() {
    MaterialTheme {
        MainScreen()
    }
}

@Preview
@Composable
private fun Preview() {
    App()
}