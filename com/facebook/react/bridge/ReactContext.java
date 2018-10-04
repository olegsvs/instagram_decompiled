package com.facebook.react.bridge;

import X.AnonymousClass0LR;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.LayoutInflater;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ReactContext extends ContextWrapper {
    private final CopyOnWriteArraySet mActivityEventListeners = new CopyOnWriteArraySet();
    private CatalystInstance mCatalystInstance;
    private WeakReference mCurrentActivity;
    private LayoutInflater mInflater;
    private MessageQueueThread mJSMessageQueueThread;
    public final CopyOnWriteArraySet mLifecycleEventListeners = new CopyOnWriteArraySet();
    private LifecycleState mLifecycleState = LifecycleState.BEFORE_CREATE;
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private MessageQueueThread mNativeModulesMessageQueueThread;
    private MessageQueueThread mUiMessageQueueThread;

    public ReactContext(Context context) {
        super(context);
    }

    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if (hasActiveCatalystInstance()) {
            switch (this.mLifecycleState.ordinal()) {
                case 0:
                case 1:
                    return;
                case 2:
                    runOnUiQueueThread(new ReactContext$1(this, lifecycleEventListener));
                    return;
                default:
                    throw new RuntimeException("Unhandled lifecycle state.");
            }
        }
    }

    public final void assertOnNativeModulesQueueThread() {
        ((MessageQueueThread) AnonymousClass0LR.m2961D(this.mNativeModulesMessageQueueThread)).assertIsOnThread();
    }

    public final void assertOnNativeModulesQueueThread(String str) {
        ((MessageQueueThread) AnonymousClass0LR.m2961D(this.mNativeModulesMessageQueueThread)).assertIsOnThread(str);
    }

    public final void assertOnUiQueueThread() {
        ((MessageQueueThread) AnonymousClass0LR.m2961D(this.mUiMessageQueueThread)).assertIsOnThread();
    }

    public final void destroy() {
        UiThreadUtil.assertOnUiThread();
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.destroy();
        }
    }

    public final CatalystInstance getCatalystInstance() {
        return (CatalystInstance) AnonymousClass0LR.m2961D(this.mCatalystInstance);
    }

    public Activity getCurrentActivity() {
        WeakReference weakReference = this.mCurrentActivity;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final JavaScriptModule getJSModule(Class cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJSModule(cls);
        }
        throw new RuntimeException("Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.");
    }

    public final NativeModule getNativeModule(Class cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getNativeModule(cls);
        }
        throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    public final void handleException(Exception exception) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (!(catalystInstance == null || catalystInstance.isDestroyed())) {
            NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler;
            if (nativeModuleCallExceptionHandler != null) {
                nativeModuleCallExceptionHandler.handleException(exception);
                return;
            }
        }
        throw new RuntimeException(exception);
    }

    public final boolean hasActiveCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        return (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
    }

    public final void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException("CatalystInstance cannot be null.");
        } else if (this.mCatalystInstance == null) {
            this.mCatalystInstance = catalystInstance;
            ReactQueueConfiguration reactQueueConfiguration = catalystInstance.getReactQueueConfiguration();
            this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
            this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
            this.mJSMessageQueueThread = reactQueueConfiguration.getJSQueueThread();
        } else {
            throw new IllegalStateException("ReactContext has been already initialized");
        }
    }

    public final boolean isOnUiQueueThread() {
        return ((MessageQueueThread) AnonymousClass0LR.m2961D(this.mUiMessageQueueThread)).isOnThread();
    }

    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Iterator it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((ActivityEventListener) it.next()).onActivityResult(activity, i, i2, intent);
            } catch (Exception e) {
                handleException(e);
            }
        }
    }

    public final void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((LifecycleEventListener) it.next()).onHostDestroy();
            } catch (Exception e) {
                handleException(e);
            }
        }
        this.mCurrentActivity = null;
    }

    public final void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((LifecycleEventListener) it.next()).onHostPause();
            } catch (Exception e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    public final void onHostResume(Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                ((LifecycleEventListener) it.next()).onHostResume();
            } catch (Exception e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public final void runOnJSQueueThread(Runnable runnable) {
        ((MessageQueueThread) AnonymousClass0LR.m2961D(this.mJSMessageQueueThread)).runOnQueue(runnable);
    }

    public final void runOnNativeModulesQueueThread(Runnable runnable) {
        ((MessageQueueThread) AnonymousClass0LR.m2961D(this.mNativeModulesMessageQueueThread)).runOnQueue(runnable);
    }

    public final void runOnUiQueueThread(Runnable runnable) {
        ((MessageQueueThread) AnonymousClass0LR.m2961D(this.mUiMessageQueueThread)).runOnQueue(runnable);
    }

    public final void setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
    }
}
