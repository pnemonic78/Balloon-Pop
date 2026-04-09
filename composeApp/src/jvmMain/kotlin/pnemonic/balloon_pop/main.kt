package pnemonic.balloon_pop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "BalloonPop",
    ) {
        App()
    }
}