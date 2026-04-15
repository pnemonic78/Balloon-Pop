package pnemonic.balloon_pop.model.balloon

class Flower(size: Float = 1f, sway: Boolean = false) :
    Balloon(size = size, score = 5, hits = 1, sway = sway) {
    override val description = "🌼"
}