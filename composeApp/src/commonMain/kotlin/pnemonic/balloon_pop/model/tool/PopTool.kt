package pnemonic.balloon_pop.model.tool

import pnemonic.balloon_pop.engine.EngineCallback
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Bonus
import kotlin.math.max
import kotlin.math.min

open class PopTool(bonus: Bonus) : BonusTool(bonus) {
    suspend fun pop(board: Board, callback: EngineCallback): Board {
        var lives = board.lives
        var score = board.score

        for (balloon in board.bouquet) {
            if ((hits > 0) && !balloon.isPopped && isHit(balloon)) {
                val balloonHits = min(balloon.hits.toLong(), hits)
                (1..balloonHits).forEach { _ ->
                    balloon.hit()
                }
                if (balloon.isPopped) {
                    score += balloon.score
                    if (score < 0) {
                        lives--
                    }
                    score = max(0, score)
                    callback.pop(balloon)
                }

                hits -= balloonHits
            }
        }

        return board.copy(score = score, lives = lives)
    }
}