package pnemonic.balloon_pop.sound

enum class SoundType(val fileName: String, val repeat: Boolean = false, val volume: Float = 1f) {
    None("", false),
    Clang("CLANG001.WAV", false),
    GameFinish("GLASS04.WAV", false),
    GameStart("GONG16.WAV", false),
    Kiss("KISS001.WAV", false),
    Laser("LASER02.WAV", false),
    Level("BOING001.WAV", false),
    Pop("POP002.WAV", false),
    Switch("LIGHTSW.WAV", false),
}
