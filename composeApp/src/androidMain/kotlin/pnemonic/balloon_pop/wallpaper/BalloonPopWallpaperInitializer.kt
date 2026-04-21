package pnemonic.balloon_pop.wallpaper

import android.content.Context
import androidx.startup.Initializer

class BalloonPopWallpaperInitializer: Initializer<BalloonPopWallpaperManager> {
    override fun create(context: Context): BalloonPopWallpaperManager {
        return BalloonPopWallpaperManager.initialize(context)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}