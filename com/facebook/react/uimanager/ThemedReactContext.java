package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

public final class ThemedReactContext extends ReactContext {
    private final ReactApplicationContext mReactApplicationContext;

    public ThemedReactContext(ReactApplicationContext reactApplicationContext, Context context) {
        super(context);
        initializeWithInstance(reactApplicationContext.getCatalystInstance());
        this.mReactApplicationContext = reactApplicationContext;
    }

    public final void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mReactApplicationContext.addLifecycleEventListener(lifecycleEventListener);
    }

    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.getCurrentActivity();
    }

    public final void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mReactApplicationContext.removeLifecycleEventListener(lifecycleEventListener);
    }
}
