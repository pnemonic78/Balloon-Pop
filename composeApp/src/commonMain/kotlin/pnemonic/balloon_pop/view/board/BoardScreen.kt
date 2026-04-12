package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun BoardScreen(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF4444CC)))
}