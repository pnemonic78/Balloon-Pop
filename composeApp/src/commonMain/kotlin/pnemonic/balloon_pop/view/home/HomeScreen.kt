package pnemonic.balloon_pop.view.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import pnemonic.balloon_pop.view.difficulty.DifficultyCallback
import pnemonic.balloon_pop.view.difficulty.DifficultyPanel
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.view.theme.paddingScreen
import pnemonic.compose.OnSizeCallback

@Composable
fun HomeScreen(navController: NavHostController) {
    val lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current
    //FIXME for JVM val viewModel = viewModel<HomeViewModel>()
    val viewModel = viewModel { HomeViewModel() }
    val board = viewModel.board.collectAsState()

    HomeScreen(
        onPlayClick = { viewModel.onPlayClick(navController) },
        isSoundEnabled = viewModel.isSoundEnabled,
        onSoundChange = viewModel::onSoundChange,
        isMusicEnabled = viewModel.isMusicEnabled,
        onMusicChange = viewModel::onMusicChange,
        onHelpClick = { viewModel.onHelpClick(navController) },
        difficulty = viewModel.difficulty,
        onDifficultyChange = viewModel::onDifficultyChange,
        board = board.value,
        onBoardSize = viewModel::onBoardSize,
        onBalloonSize = viewModel::onBalloonSize,
    )

    DisposableEffect(lifecycleOwner) {
        viewModel.observe(lifecycleOwner)

        onDispose {
            viewModel.onDispose(lifecycleOwner)
        }
    }
}

private val colorMask = Color(0xAACC00CC)

@Composable
private fun HomeScreen(
    onPlayClick: VoidCallback,
    isSoundEnabled: Boolean = true,
    onSoundChange: BooleanCallback,
    isMusicEnabled: Boolean = true,
    onMusicChange: BooleanCallback,
    onHelpClick: VoidCallback,
    difficulty: Difficulty,
    onDifficultyChange: DifficultyCallback,
    board: Board,
    onBoardSize: OnSizeCallback,
    onBalloonSize: BalloonCallback,
) {
//    SceneView(
//        modifier = Modifier.fillMaxSize()
//            .onSizeChanged { onBoardSize(it) },
//        scene = Scene.Grass,
//    ) {
//        SwarmView(board, onBalloonSize, onTap = {})
        Box(modifier = Modifier.fillMaxSize().background(color = colorMask))
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingScreen),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(0.25f))
            Title()
            Spacer(modifier = Modifier.height(24.dp).weight(0.25f))
            StartButton(
                onClick = onPlayClick
            )
            Spacer(modifier = Modifier.height(24.dp).weight(0.25f))
            DifficultyPanel(
                difficulty = difficulty,
                onDifficultyChange = onDifficultyChange
            )
            Spacer(modifier = Modifier.height(24.dp))
            SettingsPanel(
                isSoundEnabled = isSoundEnabled,
                onSoundChange = onSoundChange,
                isMusicEnabled = isMusicEnabled,
                onMusicChange = onMusicChange,
                onHelpClick = onHelpClick
            )
            Spacer(modifier = Modifier.weight(0.25f))
        }
//    }
}

@Composable
@Preview(widthDp = previewWidthDp, heightDp = previewHeightDp, locale = "ru")
private fun Preview() {
    MaterialTheme {
        HomeScreen(
            onPlayClick = {},
            onSoundChange = {},
            onMusicChange = {},
            onHelpClick = {},
            difficulty = Difficulty.Medium,
            onDifficultyChange = {},
            board = Board(),
            onBoardSize = {},
            onBalloonSize = {},
        )
    }
}

@Composable
@Preview(widthDp = previewWidthDp * 2, heightDp = previewHeightDp * 2, locale = "ru")
private fun PreviewBig() {
    MaterialTheme {
        HomeScreen(
            onPlayClick = {},
            onSoundChange = {},
            onMusicChange = {},
            onHelpClick = {},
            difficulty = Difficulty.Hard,
            onDifficultyChange = {},
            board = Board(),
            onBoardSize = {},
            onBalloonSize = {},
        )
    }
}