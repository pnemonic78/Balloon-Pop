package pnemonic.balloon_pop.wallpaper

import android.app.WallpaperManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import java.lang.ref.WeakReference

object BalloonPopWallpaperManager {
    private var context: WeakReference<Context>? = null

    fun initialize(context: Context): BalloonPopWallpaperManager {
        this.context = WeakReference(context.applicationContext)
        return this
    }

    fun apply() {
        val context = context?.get() ?: return
        val manager = WallpaperManager.getInstance(context)
        if (manager.isWallpaperSupported && manager.isSetWallpaperAllowed) {
            val intent = Intent(WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER)
                .putExtra(
                    WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
                    ComponentName(context, BalloonPopWallpaperService::class.java)
                )
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
    }
}