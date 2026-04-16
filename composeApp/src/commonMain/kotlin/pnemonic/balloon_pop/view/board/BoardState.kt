package pnemonic.balloon_pop.view.board

import pnemonic.BooleanCallback
import pnemonic.VoidCallback
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.BonusCallback
import pnemonic.balloon_pop.model.GameState
import pnemonic.balloon_pop.model.balloon.BalloonCallback
import pnemonic.balloon_pop.model.balloon.LuckyCallback
import pnemonic.balloon_pop.model.tool.ToolCallback
import pnemonic.compose.OnSizeCallback
import pnemonic.compose.OnTapCallback

interface BoardState {
    val board: Board
    val gameState: GameState
    val onSize: OnSizeCallback
    val onTap: OnTapCallback
    val onBalloonSize: BalloonCallback
    val onBalloonTap: BalloonCallback
    val onPrizeSize: LuckyCallback
    val onHomeClick: VoidCallback
    val isPaused: Boolean
    val onPauseChange: BooleanCallback
    val isSoundEnabled: Boolean
    val onSoundChange: BooleanCallback
    val isMusicEnabled: Boolean
    val onMusicChange: BooleanCallback
    val onBonusClick: BonusCallback
    val onToolUse: ToolCallback
}