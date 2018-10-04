package com.facebook.react.bridge;

public final class ReactContext$1 implements Runnable {
    public final /* synthetic */ ReactContext this$0;
    public final /* synthetic */ LifecycleEventListener val$listener;

    public ReactContext$1(ReactContext reactContext, LifecycleEventListener lifecycleEventListener) {
        this.this$0 = reactContext;
        this.val$listener = lifecycleEventListener;
    }

    public final void run() {
        if (this.this$0.mLifecycleEventListeners.contains(this.val$listener)) {
            try {
                this.val$listener.onHostResume();
            } catch (Exception e) {
                this.this$0.handleException(e);
            }
        }
    }
}
