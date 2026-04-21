package pnemonic.balloon_pop

import androidx.compose.ui.text.intl.Locale
import com.russhwolf.settings.Settings
import pnemonic.balloon_pop.haptic.HapticManager
import pnemonic.balloon_pop.sound.SoundManager

class WasmPlatform: Platform {
    override val os = "wasm"
    override val haptic: HapticManager = HapticManager
    override val sound: SoundManager = SoundManager
    override val settings: Settings by lazy { Settings() }

    private val formatters = mutableMapOf<String, Intl.NumberFormat>()

    @OptIn(ExperimentalWasmJsInterop::class)
    override fun formatInteger(locale: Locale, number: Long): String {
        val languageTag = locale.platformLocale.toString()
        val formatter = formatters.getOrPut(languageTag) { Intl.NumberFormat(languageTag) }
        return formatter.format(number.toJsBigInt())
    }

    override fun applyWallpaper() = Unit
}

actual fun getPlatform(): Platform = WasmPlatform()