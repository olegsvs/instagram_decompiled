package org.webrtc;

public final /* synthetic */ class -$$Lambda$EglRenderer$rAPTAEHKQxRxBFU3vvHmF68TV5E implements Runnable {
    private final /* synthetic */ EglRenderer f$0;
    private final /* synthetic */ float f$1;
    private final /* synthetic */ float f$2;
    private final /* synthetic */ float f$3;
    private final /* synthetic */ float f$4;

    public /* synthetic */ -$$Lambda$EglRenderer$rAPTAEHKQxRxBFU3vvHmF68TV5E(EglRenderer eglRenderer, float f, float f2, float f3, float f4) {
        this.f$0 = eglRenderer;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = f3;
        this.f$4 = f4;
    }

    public final void run() {
        EglRenderer.clearSurfaceOnRenderThread(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
