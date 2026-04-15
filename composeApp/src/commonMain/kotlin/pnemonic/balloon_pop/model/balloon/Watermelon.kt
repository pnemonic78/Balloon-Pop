package pnemonic.balloon_pop.model.balloon

class Watermelon(size: Float = 1f, sway: Boolean = false) :
    Fruit(size = size, score = 5, hits = 1, sway = sway) {
    override val description = "🍉"
}