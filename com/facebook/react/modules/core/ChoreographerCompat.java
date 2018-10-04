package com.facebook.react.modules.core;

import X.AnonymousClass0OR;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

public final class ChoreographerCompat {
    private static final ChoreographerCompat INSTANCE = new ChoreographerCompat();
    private static final boolean IS_JELLYBEAN_OR_HIGHER = (VERSION.SDK_INT >= 16);
    private Choreographer mChoreographer;
    private Handler mHandler;

    public abstract class FrameCallback {
        private android.view.Choreographer.FrameCallback mFrameCallback;
        private Runnable mRunnable;

        /* renamed from: com.facebook.react.modules.core.ChoreographerCompat$FrameCallback$1 */
        public final class C00961 implements android.view.Choreographer.FrameCallback {
            public final void doFrame(long j) {
                FrameCallback.this.doFrame(j);
            }
        }

        /* renamed from: com.facebook.react.modules.core.ChoreographerCompat$FrameCallback$2 */
        public final class C00972 implements Runnable {
            public final void run() {
                FrameCallback.this.doFrame(System.nanoTime());
            }
        }

        public abstract void doFrame(long j);

        public final android.view.Choreographer.FrameCallback getFrameCallback() {
            if (this.mFrameCallback == null) {
                this.mFrameCallback = new C00961();
            }
            return this.mFrameCallback;
        }

        public final Runnable getRunnable() {
            if (this.mRunnable == null) {
                this.mRunnable = new C00972();
            }
            return this.mRunnable;
        }
    }

    private ChoreographerCompat() {
        if (IS_JELLYBEAN_OR_HIGHER) {
            this.mChoreographer = getChoreographer();
        } else {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
    }

    private void choreographerPostFrameCallback(android.view.Choreographer.FrameCallback frameCallback) {
        this.mChoreographer.postFrameCallback(frameCallback);
    }

    private void choreographerRemoveFrameCallback(android.view.Choreographer.FrameCallback frameCallback) {
        this.mChoreographer.removeFrameCallback(frameCallback);
    }

    private static Choreographer getChoreographer() {
        return Choreographer.getInstance();
    }

    public static ChoreographerCompat getInstance() {
        return INSTANCE;
    }

    public final void postFrameCallback(FrameCallback frameCallback) {
        if (IS_JELLYBEAN_OR_HIGHER) {
            choreographerPostFrameCallback(frameCallback.getFrameCallback());
        } else {
            AnonymousClass0OR.F(this.mHandler, frameCallback.getRunnable(), 0, -334514564);
        }
    }

    public final void removeFrameCallback(FrameCallback frameCallback) {
        if (IS_JELLYBEAN_OR_HIGHER) {
            choreographerRemoveFrameCallback(frameCallback.getFrameCallback());
        } else {
            AnonymousClass0OR.G(this.mHandler, frameCallback.getRunnable(), -413243655);
        }
    }
}
