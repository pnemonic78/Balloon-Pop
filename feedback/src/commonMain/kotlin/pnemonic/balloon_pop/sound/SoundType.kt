package pnemonic.balloon_pop.sound

enum class SoundType(val fileName: String, val repeat: Boolean = false, val volume: Float = 1f) {
    None("", false),
    Beach("PLYGND01.WAV", true, 0.15f),
    Cow("COW03.WAV", false),
    Dog("DOG13.WAV", false),
    Drip("POP002.WAV", false),
    Clang("CLANG001.WAV", false),
    GameFinish("GLASS04.WAV", false),
    GameStart("GONG16.WAV", false),
    Garden("DUSK02.WAV", true, 0.15f),
    Kiss("KISS001.WAV", false),
    Laser("LASER02.WAV", false),
    Level("BOING001.WAV", false),
    Pop("POP001.WAV", false),
    SlimeSplash("Slime Splash.wav", false), // heavy
    Snake("SNAKE02.WAV", false),
    Switch("LIGHTSW.WAV", false),
}
