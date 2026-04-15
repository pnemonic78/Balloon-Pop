package pnemonic.balloon_pop.model.balloon

class Gold(size: Float = 1f, sway: Boolean = false, score: Long = 10) :
    Balloon(size = size, speed = 1f, score = score, hits = 2, sway = sway) {
    override val description = "🎈"
    val hue = 40f
}