package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat.FrameCallback;

public abstract class GuardedFrameCallback extends FrameCallback {
    private final ReactContext mReactContext;

    public abstract void doFrameGuarded(long j);

    public GuardedFrameCallback(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    public final void doFrame(long j) {
        try {
            doFrameGuarded(j);
        } catch (long j2) {
            this.mReactContext.handleException(j2);
        }
    }
}
