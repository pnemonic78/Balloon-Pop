package pnemonic.balloon_pop.wallpaper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.view.board.BouquetView
import pnemonic.balloon_pop.view.board.SceneView
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.view.theme.AppTheme
import pnemonic.compose.OnSizeCallback

@Composable
fun WallpaperScreen() {
    val lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current
    val viewModel = viewModel<WallpaperViewModel>()
    val board = viewModel.board.collectAsState()

    WallpaperScreen(
        board = board.value,
        onBoardSize = viewModel::onBoardSize,
        onBalloonTap = viewModel::onBalloonTap,
        onBalloonSize = viewModel::onBalloonSize,
    )

    DisposableEffect(lifecycleOwner) {
        viewModel.observe(lifecycleOwner)

        onDispose {
            viewModel.onDispose(lifecycleOwner)
        }
    }
}

private val colorMask = Color(0x99000044)

@Composable
private fun WallpaperScreen(
    board: Board,
    onBoardSize: OnSizeCallback,
    onBalloonTap: BalloonCallback,
    onBalloonSize: BalloonCallback,
) {
    SceneView(
        modifier = Modifier
            .fillMaxSize()
            .onSizeChanged { onBoardSize(it) },
        scene = board.scene,
    ) {
        BouquetView(board, onBalloonSize, onTap = onBalloonTap, onPrizeSize = {})
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorMask)
        )
    }
}

@Composable
@Preview(widthDp = previewWidthDp, heightDp = previewHeightDp, locale = "ru")
private fun Preview() {
    AppTheme {
        WallpaperScreen(
            board = Board(),
            onBoardSize = {},
            onBalloonTap = {},
            onBalloonSize = {},
        )
    }
}