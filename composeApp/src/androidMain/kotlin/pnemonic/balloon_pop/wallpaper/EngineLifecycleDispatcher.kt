package pnemonic.balloon_pop.wallpaper

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

open class EngineLifecycleDispatcher(provider: LifecycleOwner) : LifecycleOwner {

    private val registry: LifecycleRegistry = LifecycleRegistry(provider)
    private val handler: Handler = Handler(Looper.getMainLooper())
    private var lastDispatchRunnable: DispatchRunnable? = null

    override val lifecycle: Lifecycle
        get() = registry

    private fun postDispatchRunnable(event: Lifecycle.Event) {
        lastDispatchRunnable?.run()
        DispatchRunnable(registry, event).also {
            lastDispatchRunnable = it
            handler.postAtFrontOfQueue(it)
        }
    }

    fun notifyCreate() {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE)
    }

    fun notifyStart() {
        postDispatchRunnable(Lifecycle.Event.ON_START)
    }

    fun notifyStop() {
        postDispatchRunnable(Lifecycle.Event.ON_STOP)
    }

    fun notifyDestroy() {
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY)
    }

    fun onVisibilityChanged(visible: Boolean) {
        if (visible) {
            postDispatchRunnable(Lifecycle.Event.ON_RESUME)
        } else {
            postDispatchRunnable(Lifecycle.Event.ON_PAUSE)
        }
    }

    internal class DispatchRunnable(
        private val registry: LifecycleRegistry,
        val event: Lifecycle.Event,
    ) : Runnable {
        private var wasExecuted = false

        override fun run() {
            if (!wasExecuted) {
                registry.handleLifecycleEvent(event)
                wasExecuted = true
            }
        }
    }
}