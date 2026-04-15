package pnemonic.balloon_pop.engine

import pnemonic.balloon_pop.model.Difficulty
import pnemonic.balloon_pop.model.Difficulty.Companion.times
import pnemonic.balloon_pop.model.balloon.Balloon
import pnemonic.balloon_pop.model.balloon.Bouquet
import pnemonic.balloon_pop.model.balloon.Butterfly
import pnemonic.balloon_pop.model.balloon.Dog
import pnemonic.balloon_pop.model.balloon.Flower
import pnemonic.balloon_pop.model.balloon.Giraffe
import pnemonic.balloon_pop.model.balloon.Gold
import pnemonic.balloon_pop.model.balloon.Heart
import pnemonic.balloon_pop.model.balloon.HotAirBalloon
import pnemonic.balloon_pop.model.balloon.Lemon
import pnemonic.balloon_pop.model.balloon.Orange
import pnemonic.balloon_pop.model.balloon.Snake
import pnemonic.balloon_pop.model.balloon.Star
import pnemonic.balloon_pop.model.balloon.Teardrop
import pnemonic.balloon_pop.model.balloon.Watermelon
import kotlin.random.Random

typealias KlassName = String

object BalloonFactory {

    private const val BALLOONS_PER_LEVEL = 10

    private const val CLASS_BUTTERFLY = "Butterfly"
    private const val CLASS_DOG = "Dog"
    private const val CLASS_FLOWER = "Flower"
    private const val CLASS_GIRAFFE = "Giraffe"
    private const val CLASS_GOLD = "Gold"
    private const val CLASS_HEART = "Heart"
    private const val CLASS_HOT_AIR = "HotAir"
    private const val CLASS_LEMON = "Lemon"
    private const val CLASS_ORANGE = "Orange"
    private const val CLASS_SNAKE = "Snake"
    private const val CLASS_STAR = "Star"
    private const val CLASS_TEARDROP = "Teardrop"
    private const val CLASS_WATERMELON = "Watermelon"

    private val level1 = listOf(CLASS_TEARDROP)
    private val level2 = level1 + CLASS_STAR
    private val level3 = level2 + CLASS_HEART
    private val level4 = level3 + CLASS_DOG
    private val level5 = level4 + CLASS_BUTTERFLY + CLASS_HOT_AIR
    private val level6 = level5 + CLASS_SNAKE
    private val level7 = level6 + CLASS_ORANGE
    private val level8 = level7 + CLASS_GIRAFFE
    private val level9 = level8 + CLASS_LEMON
    private val level10 = level9 + CLASS_WATERMELON
    private val level11 = level10 + CLASS_FLOWER

    private val levels = mapOf(
        1 to level1,
        2 to level2,
        3 to level3,
        4 to level4,
        5 to level5,
        6 to level6,
        7 to level7,
        8 to level8,
        9 to level9,
        10 to level10,
        11 to level11,
    )

    private val rand = Random.Default

    private fun createBalloon(difficulty: Difficulty, candidates: List<KlassName>): Balloon {
        val i = rand.nextInt(candidates.size)
        val size = when (difficulty) {
            Difficulty.Easy -> 1f + (rand.nextFloat() * 0.25f)
            Difficulty.Medium -> 0.75f + (rand.nextFloat() * 0.75f)
            Difficulty.Hard -> 0.5f + rand.nextFloat()
        }
        val sway = when (difficulty) {
            Difficulty.Easy -> false
            Difficulty.Medium -> rand.nextBoolean()
            Difficulty.Hard -> rand.nextBoolean()
        }
        // klass.createInstance() does not work in JS
        return when (val klass = candidates[i]) {
            CLASS_BUTTERFLY -> Butterfly(size = size, sway = sway)
            CLASS_DOG -> Dog(size = size, sway = sway)
            CLASS_FLOWER -> Flower(size = size, sway = sway)
            CLASS_GIRAFFE -> Giraffe(size = size, sway = sway)
            CLASS_GOLD -> Gold(size = size, sway = sway)
            CLASS_HEART -> Heart(size = size, sway = sway)
            CLASS_HOT_AIR -> HotAirBalloon(size = size, sway = sway)
            CLASS_LEMON -> Lemon(size = size, sway = sway)
            CLASS_ORANGE -> Orange(size = size, sway = sway)
            CLASS_SNAKE -> Snake(size = size, sway = sway)
            CLASS_STAR -> Star(size = size, sway = sway)
            CLASS_TEARDROP -> Teardrop(size = size, sway = sway, hue = rand.nextFloat() * 360)
            CLASS_WATERMELON -> Watermelon(size = size, sway = sway)
            else -> throw IllegalArgumentException(klass)
        }
    }

    private fun createCandidates(level: Int): List<KlassName> {
        return levels[level] ?: level11
    }

    fun createBouquet(level: Int, difficulty: Difficulty): Bouquet {
        val size = BALLOONS_PER_LEVEL * level * difficulty
        val candidates = createCandidates(level)
        val balloons = mutableListOf<Balloon>()

        (1..size).forEach { _ ->
            balloons.add(createBalloon(difficulty, candidates))
        }

        return Bouquet(balloons)
    }

    val allBalloons: List<Balloon>
        get() = listOf(
            Butterfly(),
            Dog(),
            Flower(),
            Giraffe(),
            Gold(),
            Heart(),
            HotAirBalloon(),
            Lemon(),
            Orange(),
            Snake(),
            Star(),
            Teardrop(),
            Watermelon(),
        )
}