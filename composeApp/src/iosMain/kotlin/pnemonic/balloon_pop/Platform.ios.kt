package pnemonic.balloon_pop

import androidx.compose.ui.text.intl.Locale
import com.russhwolf.settings.Settings
import platform.Foundation.NSNumber
import platform.Foundation.NSNumberFormatter
import platform.Foundation.NSNumberFormatterOrdinalStyle
import pnemonic.balloon_pop.haptic.HapticManager
import pnemonic.balloon_pop.sound.SoundManager

class IOSPlatform : Platform {
    override val os = "ios"
    override val haptic: HapticManager = HapticManager
    override val sound: SoundManager = SoundManager
    override val settings: Settings by lazy { Settings() }

    override fun formatInteger(locale: Locale, number: Long): String {
        val formatter = NSNumberFormatter().apply {
            this.locale = locale.platformLocale
            numberStyle = NSNumberFormatterOrdinalStyle
        }
        return formatter.stringFromNumber(NSNumber(long = number))!!
    }

    override fun applyWallpaper() = Unit
}

actual fun getPlatform(): Platform = IOSPlatform()