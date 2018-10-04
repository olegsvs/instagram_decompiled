package com.facebook.react;

import com.facebook.react.bridge.ReactApplicationContext;

public final class ReactInstanceManager$6 implements Runnable {
    public final /* synthetic */ ReactInstanceManager this$0;
    public final /* synthetic */ ReactInstanceManager$ReactInstanceEventListener[] val$finalListeners;
    public final /* synthetic */ ReactApplicationContext val$reactContext;

    public ReactInstanceManager$6(ReactInstanceManager reactInstanceManager, ReactInstanceManager$ReactInstanceEventListener[] reactInstanceManager$ReactInstanceEventListenerArr, ReactApplicationContext reactApplicationContext) {
        this.this$0 = reactInstanceManager;
        this.val$finalListeners = reactInstanceManager$ReactInstanceEventListenerArr;
        this.val$reactContext = reactApplicationContext;
    }

    public final void run() {
        for (ReactInstanceManager$ReactInstanceEventListener onReactContextInitialized : this.val$finalListeners) {
            onReactContextInitialized.onReactContextInitialized(this.val$reactContext);
        }
    }
}
