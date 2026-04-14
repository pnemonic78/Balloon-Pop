package pnemonic.balloon_pop.model.balloon

class Orange(size: Float = 1f, sway: Boolean = false) :
    Fruit(size = size, speed = 1f, score = 5, hits = 1, sway = sway) {
    override val description = "🍊"
}