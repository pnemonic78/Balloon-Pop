package pnemonic.balloon_pop.wallpaper

import androidx.compose.ui.unit.IntSize
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import pnemonic.balloon_pop.control.LifecycleViewModel
import pnemonic.balloon_pop.engine.GameEngine
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Difficulty
import pnemonic.balloon_pop.model.balloon.Balloon

class WallpaperViewModel : LifecycleViewModel() {
    private var engine = WallpaperGameEngine(viewModelScope)
    private val _board = MutableStateFlow(engine.boards.value)
    val board: StateFlow<Board> = _board

    init {
        collectAll(engine)
    }

    private fun collectAll(engine: GameEngine) {
        viewModelScope.launch {
            engine.boards.collect {
                _board.emit(it)
            }
        }
        viewModelScope.launch {
            _board.emit(engine.boards.value)
        }
    }

    override fun onCreate() {
        super.onCreate()
        engine.clear()
    }

    override fun onStart() {
        super.onStart()
        engine.start(Difficulty.Hard)
    }

    override fun onResume() {
        super.onResume()
        engine.resume()
    }

    override fun onPause() {
        super.onPause()
        engine.pause()
    }

    override fun onStop() {
        super.onStop()
        engine.stop()
    }

    fun onBoardSize(size: IntSize) {
        engine.onSize(size)
    }

    fun onBalloonTap(balloon: Balloon) {
        engine.touch(balloon)
    }

    fun onBalloonSize(balloon: Balloon) {
        engine.onBalloonSize(balloon)
    }
}