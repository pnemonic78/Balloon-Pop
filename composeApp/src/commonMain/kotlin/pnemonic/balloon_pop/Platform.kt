package pnemonic.balloon_pop

import androidx.compose.ui.text.intl.Locale
import com.russhwolf.settings.Settings
import pnemonic.balloon_pop.haptic.HapticManager
import pnemonic.balloon_pop.sound.SoundManager

interface Platform {

    val os: String
    val haptic: HapticManager

    val sound: SoundManager
    val settings: Settings
    fun formatInteger(locale: Locale, number: Long): String

    val isWallpaperSupported: Boolean
    fun applyWallpaper()
}

expect fun getPlatform(): Platform