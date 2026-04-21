package pnemonic.balloon_pop

import androidx.compose.ui.text.intl.Locale
import com.russhwolf.settings.Settings
import pnemonic.balloon_pop.haptic.HapticManager
import pnemonic.balloon_pop.sound.SoundManager
import pnemonic.balloon_pop.wallpaper.BalloonPopWallpaperManager
import java.text.NumberFormat


class AndroidPlatform : Platform {
    override val os: String = "android"
    override val haptic: HapticManager = HapticManager
    override val sound: SoundManager = SoundManager
    override val settings: Settings by lazy { Settings() }

    override fun formatInteger(locale: Locale, number: Long): String {
        val formatter = NumberFormat.getIntegerInstance(locale.platformLocale)
        return formatter.format(number)
    }

    override fun applyWallpaper() {
        BalloonPopWallpaperManager.apply()
    }
}

actual fun getPlatform(): Platform = AndroidPlatform()