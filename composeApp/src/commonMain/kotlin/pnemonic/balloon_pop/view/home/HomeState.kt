package pnemonic.balloon_pop.view.home

import pnemonic.BooleanCallback
import pnemonic.VoidCallback
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Difficulty
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.view.difficulty.DifficultyCallback
import pnemonic.compose.OnSizeCallback

interface HomeState {
    val onPlayClick: VoidCallback
    val isSoundEnabled: Boolean
    val onSoundChange: BooleanCallback
    val isMusicEnabled: Boolean
    val onMusicChange: BooleanCallback
    val onHelpClick: VoidCallback
    val onWallpaperClick: VoidCallback
    val difficulty: Difficulty
    val onDifficultyChange: DifficultyCallback
    val board: Board
    val onBoardSize: OnSizeCallback
    val onBalloonSize: BalloonCallback
}