package pnemonic.balloon_pop

import android.os.Build
import com.russhwolf.settings.Settings
import androidx.compose.ui.text.intl.Locale
import pnemonic.balloon_pop.haptic.HapticManager
import pnemonic.balloon_pop.sound.SoundManager
import java.text.NumberFormat

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
    override val haptic: HapticManager = HapticManager
    override val sound: SoundManager = SoundManager
    override val settings: Settings by lazy { Settings() }

    override fun formatInteger(locale: Locale, number: Long): String {
        val formatter = NumberFormat.getIntegerInstance(locale.platformLocale)
        return formatter.format(number)
    }
}

actual fun getPlatform(): Platform = AndroidPlatform()