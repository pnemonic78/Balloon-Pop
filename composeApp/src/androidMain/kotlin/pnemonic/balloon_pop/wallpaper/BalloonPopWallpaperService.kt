package pnemonic.balloon_pop.wallpaper

import android.app.Presentation
import android.content.Context
import android.hardware.display.DisplayManager
import android.hardware.display.VirtualDisplay
import android.os.Build
import android.service.wallpaper.WallpaperService
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.View
import androidx.compose.ui.platform.ComposeView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.setViewTreeLifecycleOwner
import androidx.lifecycle.setViewTreeViewModelStoreOwner
import androidx.savedstate.SavedStateRegistry
import androidx.savedstate.SavedStateRegistryController
import androidx.savedstate.SavedStateRegistryOwner
import androidx.savedstate.setViewTreeSavedStateRegistryOwner
import pnemonic.balloon_pop.R

/**
 * Balloon Pop wallpaper service.
 */
class BalloonPopWallpaperService : WallpaperService(), ViewModelStoreOwner {

    override val viewModelStore: ViewModelStore = ViewModelStore()

    override fun onDestroy() {
        viewModelStore.clear()
        super.onDestroy()
    }

    override fun onCreateEngine(): Engine {
        return BalloonPopWallpaperEngine(this, this)
    }

    /**
     * Balloon Pop wallpaper engine.
     */
    inner class BalloonPopWallpaperEngine(
        private val context: Context,
        viewModelStoreOwner: ViewModelStoreOwner
    ) : Engine(), LifecycleOwner, SavedStateRegistryOwner {
        private val viewLifecycleDispatcher = EngineLifecycleDispatcher(this)
        private val savedStateRegistryController = SavedStateRegistryController.create(this)
        private var virtualDisplay: VirtualDisplay? = null
        private var presentation: Presentation? = null
        private var needsInit: Boolean = false
        private val composeView = ComposeView(context)

        override val lifecycle: Lifecycle
            get() = viewLifecycleDispatcher.lifecycle

        override val savedStateRegistry: SavedStateRegistry
            get() = savedStateRegistryController.savedStateRegistry

        init {
            savedStateRegistryController.performRestore(null)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.VANILLA_ICE_CREAM) {
                composeView.requestedFrameRate = View.REQUESTED_FRAME_RATE_CATEGORY_LOW
            }
            composeView.setViewTreeLifecycleOwner(this)
            composeView.setViewTreeSavedStateRegistryOwner(this)
            composeView.setViewTreeViewModelStoreOwner(viewModelStoreOwner)
        }

        override fun onCreate(surfaceHolder: SurfaceHolder) {
            super.onCreate(surfaceHolder)
            setTouchEventsEnabled(true)
        }

        override fun onSurfaceCreated(holder: SurfaceHolder) {
            super.onSurfaceCreated(holder)
            viewLifecycleDispatcher.notifyCreate()
            viewLifecycleDispatcher.notifyStart()
            needsInit = true
        }

        override fun onSurfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
            super.onSurfaceChanged(holder, format, width, height)
            if (width <= 0) return
            if (height <= 0) return

            if (needsInit) {
                virtualDisplay?.release()
                presentation?.dismiss()

                val engine: Engine = this
                val displayContext: Context = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    engine.displayContext!!
                } else {
                    val color = resources.getColor(R.color.sky, null)
                    holder.lockCanvas()?.also { canvas ->
                        canvas.drawColor(color)
                        holder.unlockCanvasAndPost(canvas)
                    }
                    needsInit = false
                    return
                }
                val config = displayContext.resources.configuration
                val displayManager = displayContext.getSystemService(DisplayManager::class.java)
                virtualDisplay = displayManager.createVirtualDisplay(
                    "wallpaper-display",
                    width,
                    height,
                    config.densityDpi,
                    holder.surface,
                    DisplayManager.VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY
                )?.also { vd ->
                    presentation = Presentation(displayContext, vd.display).apply {
                        setContentView(composeView)
                    }
                    needsInit = false
                }

                composeView.setContent {
                    WallpaperApp()
                }
            }
        }

        override fun onSurfaceDestroyed(holder: SurfaceHolder?) {
            viewLifecycleDispatcher.notifyStop()
            super.onSurfaceDestroyed(holder)
        }

        override fun onTouchEvent(event: MotionEvent) {
            composeView.dispatchTouchEvent(event)
        }

        override fun onVisibilityChanged(visible: Boolean) {
            super.onVisibilityChanged(visible)
            viewLifecycleDispatcher.onVisibilityChanged(visible)
            presentation?.apply {
                if (visible) {
                    show()
                } else {
                    dismiss()
                }
            }
        }

        override fun onDestroy() {
            super.onDestroy()
            viewLifecycleDispatcher.notifyDestroy()
            needsInit = false
            presentation?.dismiss()
            virtualDisplay?.release()
        }
    }
}