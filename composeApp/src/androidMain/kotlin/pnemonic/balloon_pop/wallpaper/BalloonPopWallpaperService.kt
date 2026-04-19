package pnemonic.balloon_pop.wallpaper

import android.app.Presentation
import android.content.Context
import android.hardware.display.DisplayManager
import android.hardware.display.VirtualDisplay
import android.os.Build
import android.service.wallpaper.WallpaperService
import android.util.DisplayMetrics
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

            if (needsInit) {
                virtualDisplay?.release()
                presentation?.dismiss()

                composeView.setContent {
                    WallpaperApp()
                }

                val displayManager = context.getSystemService(DISPLAY_SERVICE) as DisplayManager
                virtualDisplay = displayManager.createVirtualDisplay(
                    "ComposeDisplay",
                    width,
                    height,
                    DisplayMetrics.DENSITY_DEFAULT,
                    holder.surface,
                    DisplayManager.VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY
                )?.also { vd ->
                    presentation = Presentation(context, vd.display).apply {
                        setContentView(composeView)
                        show()
                    }
                }

                needsInit = false
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
            val presentation = presentation ?: return
            if (visible) {
                presentation.show()
            } else {
                presentation.dismiss()
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