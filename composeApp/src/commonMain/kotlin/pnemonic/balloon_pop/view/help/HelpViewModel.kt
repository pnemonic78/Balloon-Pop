package pnemonic.balloon_pop.view.help

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import pnemonic.balloon_pop.Platform
import pnemonic.balloon_pop.control.LifecycleViewModel
import pnemonic.balloon_pop.engine.BalloonFactory
import pnemonic.balloon_pop.getPlatform
import pnemonic.balloon_pop.model.Bonus
import pnemonic.balloon_pop.model.balloon.Balloon

class HelpViewModel : LifecycleViewModel() {
    private val _catalog = MutableStateFlow<List<Balloon>>(emptyList())
    val catalog: StateFlow<List<Balloon>> = _catalog

    private val _bonuses = MutableStateFlow<List<Bonus>>(emptyList())
    val bonuses: StateFlow<List<Bonus>> = _bonuses

    private val platform: Platform = getPlatform()

    init {
        viewModelScope.launch {
            val bugs = BalloonFactory.allBalloons.sortedWith { b1, b2 ->
                val c = b1.hits.compareTo(b2.hits)
                if (c != 0) return@sortedWith c
                b1.score.compareTo(b2.score)
            }
            bugs.forEach { it.freeze(1L) }
            _catalog.update { bugs }
        }
        viewModelScope.launch {
            _bonuses.update {
                listOf(
                    Bonus.Flower(progress = Long.MAX_VALUE),
                    Bonus.Life(progress = Long.MAX_VALUE),
                    Bonus.Score(progress = Long.MAX_VALUE),
                )
            }
        }
    }

    fun onBalloonClick(balloon: Balloon) {
        platform.sound.play(balloon.sound)
    }

    fun onBonusClick(bonus: Bonus) {
        platform.sound.play(bonus.sound)
    }
}