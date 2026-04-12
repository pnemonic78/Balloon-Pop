package pnemonic.balloon_pop

import androidx.compose.ui.text.intl.Locale
import com.russhwolf.settings.Settings
import java.text.NumberFormat
import pnemonic.balloon_pop.haptic.HapticManager
import pnemonic.balloon_pop.sound.SoundManager

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
    override val haptic: HapticManager = HapticManager
    override val sound: SoundManager = SoundManager
    override val settings: Settings by lazy { Settings() }

    override fun formatInteger(locale: Locale, number: Long): String {
        val formatter = NumberFormat.getIntegerInstance(locale.platformLocale)
        return formatter.format(number)
    }
}

actual fun getPlatform(): Platform = JVMPlatform()