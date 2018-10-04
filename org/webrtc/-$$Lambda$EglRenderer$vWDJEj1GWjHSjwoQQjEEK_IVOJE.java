package org.webrtc;

public final /* synthetic */ class -$$Lambda$EglRenderer$vWDJEj1GWjHSjwoQQjEEK_IVOJE implements Runnable {
    private final /* synthetic */ EglRenderer f$0;

    public /* synthetic */ -$$Lambda$EglRenderer$vWDJEj1GWjHSjwoQQjEEK_IVOJE(EglRenderer eglRenderer) {
        this.f$0 = eglRenderer;
    }

    public final void run() {
        EglRenderer.renderFrameOnRenderThread(this.f$0);
    }
}
