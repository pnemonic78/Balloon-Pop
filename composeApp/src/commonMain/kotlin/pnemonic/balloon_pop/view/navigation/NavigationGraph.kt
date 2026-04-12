package pnemonic.balloon_pop.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pnemonic.balloon_pop.view.home.HomeScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            HomeScreen(navController)
        }
        composable(Routes.Board.route) {
//            BoardScreen(navController)
        }
        composable(Routes.Help.route) {
//            HelpScreen(navController)
        }
    }
}