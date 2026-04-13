package pnemonic.balloon_pop.engine

import pnemonic.balloon_pop.model.Difficulty
import pnemonic.balloon_pop.model.Difficulty.Companion.times
import pnemonic.balloon_pop.model.balloon.Balloon
import pnemonic.balloon_pop.model.balloon.Bouquet
import pnemonic.balloon_pop.model.balloon.Butterfly
import pnemonic.balloon_pop.model.balloon.Dog
import pnemonic.balloon_pop.model.balloon.Flower
import pnemonic.balloon_pop.model.balloon.Giraffe
import pnemonic.balloon_pop.model.balloon.Heart
import pnemonic.balloon_pop.model.balloon.Lemon
import pnemonic.balloon_pop.model.balloon.Orange
import pnemonic.balloon_pop.model.balloon.Round
import pnemonic.balloon_pop.model.balloon.Snake
import pnemonic.balloon_pop.model.balloon.Star
import pnemonic.balloon_pop.model.balloon.Watermelon
import pnemonic.times
import kotlin.random.Random

typealias KlassName = String

object BalloonFactory {

    private const val BALLOONS_PER_LEVEL = 10

    private const val CLASS_BUTTERFLY = "Butterfly"
    private const val CLASS_DOG = "Dog"
    private const val CLASS_FLOWER = "Flower"
    private const val CLASS_GIRAFFE = "Giraffe"
    private const val CLASS_HEART = "Heart"
    private const val CLASS_LEMON = "Lemon"
    private const val CLASS_ORANGE = "Orange"
    private const val CLASS_ROUND = "Round"
    private const val CLASS_SNAKE = "Snake"
    private const val CLASS_STAR = "Star"
    private const val CLASS_WATERMELON = "Watermelon"

    private val level1 = listOf(CLASS_ROUND)
    private val level2 = level1 + listOf(CLASS_DOG) * 2
    private val level3 = level2 + listOf(CLASS_HEART) * 3
    private val level4 = level3 + listOf(CLASS_STAR) * 4

    private val levels = mapOf(
        1 to level1,
        2 to level2,
        3 to level3,
        4 to level4,
    )

    private val rand = Random.Default

    private fun createBug(candidates: List<KlassName>): Balloon {
        val i = rand.nextInt(candidates.size)
        // klass.createInstance() does not work in JS
        return when (val klass = candidates[i]) {
            CLASS_BUTTERFLY -> Butterfly()
            CLASS_DOG -> Dog()
            CLASS_FLOWER -> Flower()
            CLASS_GIRAFFE -> Giraffe()
            CLASS_HEART -> Heart()
            CLASS_LEMON -> Lemon()
            CLASS_ORANGE -> Orange()
            CLASS_ROUND -> Round()
            CLASS_SNAKE -> Snake()
            CLASS_STAR -> Star()
            CLASS_WATERMELON -> Watermelon()
            else -> throw IllegalArgumentException(klass)
        }
    }

    private fun createCandidates(level: Int): List<KlassName> {
        return levels[level] ?: level4
    }

    fun createBouquet(level: Int, difficulty: Difficulty): Bouquet {
        val size = BALLOONS_PER_LEVEL * level * difficulty
        val candidates = createCandidates(level)
        val balloons = mutableListOf<Balloon>()

        (1..size).forEach { _ ->
            val bug = createBug(candidates)
            balloons.add(bug)
        }

        return Bouquet(balloons)
    }

    val allBalloons: List<Balloon>
        get() = listOf(
            Butterfly(),
            Dog(),
            Flower(),
            Giraffe(),
            Heart(),
            Lemon(),
            Orange(),
            Round(),
            Snake(),
            Star(),
            Watermelon(),
        )
}