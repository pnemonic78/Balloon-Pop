package pnemonic.balloon_pop.view.board

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import pnemonic.BooleanCallback
import pnemonic.VoidCallback
import pnemonic.balloon_pop.engine.BalloonFactory
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.BonusCallback
import pnemonic.balloon_pop.model.GameState
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.model.balloon.Bouquet
import pnemonic.balloon_pop.model.tool.ToolCallback
import pnemonic.balloon_pop.view.previewColor
import pnemonic.balloon_pop.view.previewHeightDp
import pnemonic.balloon_pop.view.previewWidthDp
import pnemonic.balloon_pop.view.theme.AppTheme
import pnemonic.compose.OnSizeCallback
import pnemonic.compose.OnTapCallback
import pnemonic.compose.toPx

private val spacingV = 8.dp

@Composable
fun BoardScreen(navController: NavController) {
    val lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current
    //FIXME for JVM val viewModel = viewModel<GameViewModel>()
    val viewModel = viewModel { GameViewModel() }
    val board = viewModel.board.collectAsState()
    val state = viewModel.state.collectAsState()

    BoardView(
        board = board.value,
        state = state.value,
        onSize = viewModel::onBoardSize,
        onTap = viewModel::onTap,
        onBalloonSize = viewModel::onBalloonSize,
        onBalloonTap = viewModel::onBalloonTap,
        onHomeClick = { navController.navigateUp() },
        isPaused = state.value.isPaused,
        onPauseChange = viewModel::onPauseChange,
        isSoundEnabled = viewModel.isSoundEnabled,
        onSoundChange = viewModel::onSoundChange,
        isMusicEnabled = viewModel.isMusicEnabled,
        onMusicChange = viewModel::onMusicChange,
        onBonusClick = viewModel::onBonusClick,
        onToolUse = viewModel::onToolUse,
    )

    DisposableEffect(lifecycleOwner) {
        viewModel.observe(lifecycleOwner)

        onDispose {
            viewModel.onDispose(lifecycleOwner)
        }
    }
}

@Composable
fun BoardView(
    board: Board,
    state: GameState,
    onSize: OnSizeCallback,
    onTap: OnTapCallback,
    onBalloonSize: BalloonCallback,
    onBalloonTap: BalloonCallback,
    onHomeClick: VoidCallback,
    isPaused: Boolean = false,
    onPauseChange: BooleanCallback,
    isSoundEnabled: Boolean = true,
    onSoundChange: BooleanCallback,
    isMusicEnabled: Boolean = true,
    onMusicChange: BooleanCallback,
    onBonusClick: BonusCallback,
    onToolUse: ToolCallback,
) {
    SceneView(
        modifier = Modifier
            .fillMaxSize()
            .onSizeChanged(onSize)
            .pointerInput(board) {
                detectTapGestures(onTap = onTap)
            },
        scene = board.scene
    ) {
        ToolsBelow(board, onToolUse)
        BouquetView(board, onBalloonSize, onBalloonTap)
        ToolsAbove(board, onToolUse)
        Column(
            modifier = Modifier.fillMaxWidth()
                .safeContentPadding()
                .padding(8.dp),
            horizontalAlignment = AbsoluteAlignment.Left
        ) {
            if (state !== GameState.FINISHED) {
                ActionsPanel(
                    modifier = Modifier.align(AbsoluteAlignment.Right),
                    onHomeClick = onHomeClick,
                    isPaused = isPaused,
                    onPauseChange = onPauseChange,
                    isSoundEnabled = isSoundEnabled,
                    onSoundChange = onSoundChange,
                    isMusicEnabled = isMusicEnabled,
                    onMusicChange = onMusicChange
                )
                Spacer(modifier = Modifier.height(spacingV))
            }
            LivesView(lives = board.lives)
            Spacer(modifier = Modifier.height(spacingV))
            LevelView(level = board.level, count = board.bouquet.size)
            Spacer(modifier = Modifier.height(spacingV))
            ScoreView(score = board.score)
            Spacer(modifier = Modifier.height(spacingV))
            BonusesView(bonuses = board.bonuses, onClick = onBonusClick)
        }
        StateScreen(state, onHomeClick)
    }
}

@Composable
@Preview(
    showBackground = true,
    backgroundColor = previewColor,
    widthDp = previewWidthDp,
    heightDp = previewHeightDp,
    locale = "he"
)
private fun Preview() {
    val balloons = BalloonFactory.allBalloons
    val bonuses = listOf(Bonus.None, Bonus.Flower(1), Bonus.Life(2), Bonus.Score(3))
    val dx = 20.dp.toPx()
    val dy = 40.dp.toPx()
    var x = dx
    var y = dy
    for (balloon in balloons) {
        balloon.moveTo(x, y)
        balloon.setDestination(x, 0f)
        x += dx
        y += dy
    }
    val board = Board(bouquet = Bouquet(balloons), bonuses = bonuses)

    AppTheme {
        BoardView(
            board,
            GameState.STARTED,
            onSize = {},
            onTap = {},
            onBalloonSize = {},
            onBalloonTap = {},
            onHomeClick = {},
            isPaused = false,
            onPauseChange = {},
            isSoundEnabled = true,
            onSoundChange = {},
            isMusicEnabled = true,
            onMusicChange = {},
            onBonusClick = {},
            onToolUse = {},
        )
    }
}