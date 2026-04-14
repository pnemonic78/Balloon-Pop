package pnemonic.balloon_pop.model.balloon

class Star(size: Float = 1f, sway: Boolean = false) :
    Balloon(size = size, speed = 1f, score = 5, hits = 1, sway = sway) {
    override val description = "⭐"
}