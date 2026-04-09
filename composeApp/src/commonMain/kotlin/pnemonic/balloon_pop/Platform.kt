package pnemonic.balloon_pop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform