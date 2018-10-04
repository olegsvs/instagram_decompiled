package com.facebook.react.modules.core;

import X.AnonymousClass0Df;
import X.AnonymousClass0LR;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.ChoreographerCompat.FrameCallback;
import java.util.ArrayDeque;

public final class ReactChoreographer {
    private static ReactChoreographer sInstance;
    public final ArrayDeque[] mCallbackQueues = new ArrayDeque[CallbackType.values().length];
    private final ChoreographerCompat mChoreographer = ChoreographerCompat.getInstance();
    private boolean mHasPostedCallback = false;
    private final ReactChoreographerDispatcher mReactChoreographerDispatcher = new ReactChoreographerDispatcher();
    private int mTotalCallbacks = 0;

    public enum CallbackType {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        private final int mOrder;

        private CallbackType(int i) {
            this.mOrder = i;
        }

        public final int getOrder() {
            return this.mOrder;
        }
    }

    public final class ReactChoreographerDispatcher extends FrameCallback {
        public final void doFrame(long j) {
            synchronized (ReactChoreographer.this) {
                ReactChoreographer.this.mHasPostedCallback = false;
                for (int i = 0; i < ReactChoreographer.this.mCallbackQueues.length; i++) {
                    int size = ReactChoreographer.this.mCallbackQueues[i].size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((FrameCallback) ReactChoreographer.this.mCallbackQueues[i].removeFirst()).doFrame(j);
                        ReactChoreographer.this.mTotalCallbacks = ReactChoreographer.this.mTotalCallbacks - 1;
                    }
                }
                ReactChoreographer.maybeRemoveFrameCallback(ReactChoreographer.this);
            }
        }
    }

    private ReactChoreographer() {
        int i = 0;
        while (true) {
            ArrayDeque[] arrayDequeArr = this.mCallbackQueues;
            if (i < arrayDequeArr.length) {
                arrayDequeArr[i] = new ArrayDeque();
                i++;
            } else {
                return;
            }
        }
    }

    public static ReactChoreographer getInstance() {
        AnonymousClass0LR.E(sInstance, "ReactChoreographer needs to be initialized.");
        return sInstance;
    }

    public static void initialize() {
        if (sInstance == null) {
            UiThreadUtil.assertOnUiThread();
            sInstance = new ReactChoreographer();
        }
    }

    public static void maybeRemoveFrameCallback(ReactChoreographer reactChoreographer) {
        AnonymousClass0LR.B(reactChoreographer.mTotalCallbacks >= 0);
        if (reactChoreographer.mTotalCallbacks == 0 && reactChoreographer.mHasPostedCallback) {
            reactChoreographer.mChoreographer.removeFrameCallback(reactChoreographer.mReactChoreographerDispatcher);
            reactChoreographer.mHasPostedCallback = false;
        }
    }

    public final synchronized void postFrameCallback(CallbackType callbackType, FrameCallback frameCallback) {
        this.mCallbackQueues[callbackType.getOrder()].addLast(frameCallback);
        this.mTotalCallbacks++;
        AnonymousClass0LR.B(this.mTotalCallbacks > 0);
        if (!this.mHasPostedCallback) {
            this.mChoreographer.postFrameCallback(this.mReactChoreographerDispatcher);
            this.mHasPostedCallback = true;
        }
    }

    public final synchronized void removeFrameCallback(CallbackType callbackType, FrameCallback frameCallback) {
        if (this.mCallbackQueues[callbackType.getOrder()].removeFirstOccurrence(frameCallback)) {
            this.mTotalCallbacks--;
            maybeRemoveFrameCallback(this);
        } else {
            AnonymousClass0Df.C("ReactNative", "Tried to remove non-existent frame callback");
        }
    }
}
