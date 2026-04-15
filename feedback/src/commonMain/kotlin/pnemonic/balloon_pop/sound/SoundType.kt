package pnemonic.balloon_pop.sound

enum class SoundType(val fileName: String, val repeat: Boolean = false, val volume: Float = 1f) {
    None(""),
    Beach("PLYGND01.WAV", true, 0.15f),
    Clang("CLANG001.WAV"),
    Clink("CLINK005.WAV"),
    Coins("Cha_Ching_Register.wav"),
    Cow("COW03.WAV"),
    Dog("DOG13.WAV"),
    Drip("POP002.WAV"),
    Forest("CALLWILD.WAV", true, 0.15f),
    GameFinish("GLASS04.WAV"),
    GameStart("GONG16.WAV"),
    Garden("DUSK02.WAV", true, 0.15f),
    Kiss("KISS001.WAV"),
    Laser("LASER02.WAV"),
    Level("BOING001.WAV"),
    Midday("MIDDAY04.WAV", true, 0.15f),
    Pop("POP001.WAV"),
    SlimeSplash("Slime Splash.wav"), // heavy
    Snake("SNAKE02.WAV"),
    Switch("LIGHTSW.WAV"),
}
