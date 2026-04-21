package pnemonic.balloon_pop.view.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import pnemonic.BooleanCallback
import pnemonic.VoidCallback
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Difficulty
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.view.board.BouquetView
import pnemonic.balloon_pop.view.board.SceneView
import pnemonic.balloon_pop.view.difficulty.DifficultyCallback
import pnemonic.balloon_pop.view.difficulty.DifficultyPanel
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.view.theme.AppTheme
import pnemonic.balloon_pop.view.theme.paddingScreen
import pnemonic.compose.OnSizeCallback

@Composable
fun HomeScreen(navController: NavHostController) {
    val lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current
    //FIXME for JVM val viewModel = viewModel<HomeViewModel>()
    val viewModel = viewModel { HomeViewModel() }

    val state: HomeState = object : HomeState {
        override val onPlayClick = { viewModel.onPlayClick(navController) }
        override val isSoundEnabled = viewModel.isSoundEnabled
        override val onSoundChange = viewModel::onSoundChange
        override val isMusicEnabled = viewModel.isMusicEnabled
        override val onMusicChange = viewModel::onMusicChange
        override val onHelpClick = { viewModel.onHelpClick(navController) }
        override val onWallpaperClick = viewModel::onWallpaperClick
        override val difficulty = viewModel.difficulty
        override val onDifficultyChange = viewModel::onDifficultyChange
        override val board = viewModel.board.collectAsState().value
        override val onBoardSize = viewModel::onBoardSize
        override val onBalloonSize = viewModel::onBalloonSize
    }

    HomeScreen(state)

    DisposableEffect(lifecycleOwner) {
        viewModel.observe(lifecycleOwner)

        onDispose {
            viewModel.onDispose(lifecycleOwner)
        }
    }
}

private val colorMask = Color(0xCC8800CC)

@Composable
private fun HomeScreen(state: HomeState) {
    val board = state.board

    SceneView(
        modifier = Modifier.fillMaxSize()
            .onSizeChanged { state.onBoardSize(it) },
        scene = board.scene,
    ) {
        BouquetView(board, state.onBalloonSize, onTap = {}, onPrizeSize = {})
        Box(modifier = Modifier.fillMaxSize().background(color = colorMask))
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingScreen),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(0.25f))
            Title()
            Spacer(modifier = Modifier.height(24.dp).weight(0.25f))
            StartButton(
                onClick = state.onPlayClick
            )
            Spacer(modifier = Modifier.height(24.dp).weight(0.2f))
            DifficultyPanel(
                difficulty = state.difficulty,
                onDifficultyChange = state.onDifficultyChange
            )
            Spacer(modifier = Modifier.height(24.dp))
            SettingsPanel(
                isSoundEnabled = state.isSoundEnabled,
                onSoundChange = state.onSoundChange,
                isMusicEnabled = state.isMusicEnabled,
                onMusicChange = state.onMusicChange,
                onHelpClick = state.onHelpClick,
                onWallpaperClick = state.onWallpaperClick,
            )
            Spacer(modifier = Modifier.weight(0.25f))
        }
    }
}

@Composable
@Preview(widthDp = previewWidthDp, heightDp = previewHeightDp, locale = "ru")
private fun Preview() {
    val state: HomeState = object : HomeState {
        override val onPlayClick: VoidCallback = {}
        override val isSoundEnabled: Boolean = true
        override val onSoundChange: BooleanCallback = {}
        override val isMusicEnabled: Boolean = true
        override val onMusicChange: BooleanCallback = {}
        override val onHelpClick: VoidCallback = {}
        override val onWallpaperClick: VoidCallback = {}
        override val difficulty: Difficulty = Difficulty.Medium
        override val onDifficultyChange: DifficultyCallback = {}
        override val board: Board = Board()
        override val onBoardSize: OnSizeCallback = {}
        override val onBalloonSize: BalloonCallback = {}
    }

    AppTheme {
        HomeScreen(state)
    }
}

@Composable
@Preview(widthDp = previewWidthDp * 2, heightDp = previewHeightDp * 2, locale = "ru")
private fun PreviewBig() {
    val state: HomeState = object : HomeState {
        override val onPlayClick: VoidCallback = {}
        override val isSoundEnabled: Boolean = true
        override val onSoundChange: BooleanCallback = {}
        override val isMusicEnabled: Boolean = true
        override val onMusicChange: BooleanCallback = {}
        override val onHelpClick: VoidCallback = {}
        override val onWallpaperClick: VoidCallback = {}
        override val difficulty: Difficulty = Difficulty.Hard
        override val onDifficultyChange: DifficultyCallback = {}
        override val board: Board = Board()
        override val onBoardSize: OnSizeCallback = {}
        override val onBalloonSize: BalloonCallback = {}
    }

    AppTheme {
        HomeScreen(state)
    }
}