package org.webrtc;

public final /* synthetic */ class -$$Lambda$EglRenderer$ZLNzG80KHUk0Ad58984FOsNt9s8 implements Runnable {
    private final /* synthetic */ EglRenderer f$0;
    private final /* synthetic */ Runnable f$1;

    public /* synthetic */ -$$Lambda$EglRenderer$ZLNzG80KHUk0Ad58984FOsNt9s8(EglRenderer eglRenderer, Runnable runnable) {
        this.f$0 = eglRenderer;
        this.f$1 = runnable;
    }

    public final void run() {
        EglRenderer.lambda$releaseEglSurface$5(this.f$0, this.f$1);
    }
}
