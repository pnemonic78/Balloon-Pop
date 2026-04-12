package pnemonic.balloon_pop.sound

expect object AudioPlayerFactory {
    fun create(soundType: SoundType): AudioPlayer?
}