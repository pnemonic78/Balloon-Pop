package pnemonic.balloon_pop.model.balloon

class Star(size: Float = 1f) : Balloon(size = size, speed = 1f, score = 5, hits = 1) {
    override val description = "⭐"
}