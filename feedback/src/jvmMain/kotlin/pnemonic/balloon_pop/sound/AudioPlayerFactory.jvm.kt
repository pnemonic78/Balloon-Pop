package pnemonic.balloon_pop.sound

import balloon_pop.feedback.generated.resources.Res
import java.io.BufferedInputStream
import java.net.URI
import javax.sound.sampled.AudioSystem

actual object AudioPlayerFactory {
    actual fun create(soundType: SoundType): AudioPlayer? {
        val name = soundType.fileName
        if (name.isEmpty()) return null
        val path = Res.getUri("files/sounds/$name")
        val url = URI(path).toURL()
        val stream = BufferedInputStream(url.openStream())
        return try {
            val audio = AudioSystem.getAudioInputStream(stream)
            val clip = AudioSystem.getClip()
            clip.open(audio)
            AudioPlayer(soundType, clip)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}