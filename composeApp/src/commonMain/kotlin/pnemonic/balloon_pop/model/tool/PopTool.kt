package pnemonic.balloon_pop.model.tool

import pnemonic.balloon_pop.engine.EngineCallback
import pnemonic.balloon_pop.model.Board
import pnemonic.balloon_pop.model.Bonus
import kotlin.math.max
import kotlin.math.min

open class PopTool(bonus: Bonus, val isSingleton: Boolean = false) : BonusTool(bonus) {
    open suspend fun pop(board: Board, callback: EngineCallback): Board {
        val boardSize = board.size
        var lives = board.lives
        var score = board.score

        for (balloon in board.bouquet) {
            if ((hits > 0) && !balloon.isPopped && isHit(balloon, boardSize)) {
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

        // single-use tool.
        if (isSingleton) {
            hits = 0L
        }

        return board.copy(score = score, lives = lives)
    }
}