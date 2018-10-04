package org.webrtc;

import android.os.Looper;

public final /* synthetic */ class -$$Lambda$EglRenderer$0TOf6TQvvPy5g4d42QjmzelnDZI implements Runnable {
    private final /* synthetic */ EglRenderer f$0;
    private final /* synthetic */ Looper f$1;

    public /* synthetic */ -$$Lambda$EglRenderer$0TOf6TQvvPy5g4d42QjmzelnDZI(EglRenderer eglRenderer, Looper looper) {
        this.f$0 = eglRenderer;
        this.f$1 = looper;
    }

    public final void run() {
        EglRenderer.lambda$release$2(this.f$0, this.f$1);
    }
}
