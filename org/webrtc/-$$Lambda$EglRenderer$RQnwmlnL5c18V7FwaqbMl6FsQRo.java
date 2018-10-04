package org.webrtc;

import org.webrtc.EglRenderer.FrameListener;
import org.webrtc.RendererCommon.GlDrawer;

public final /* synthetic */ class -$$Lambda$EglRenderer$RQnwmlnL5c18V7FwaqbMl6FsQRo implements Runnable {
    private final /* synthetic */ EglRenderer f$0;
    private final /* synthetic */ GlDrawer f$1;
    private final /* synthetic */ FrameListener f$2;
    private final /* synthetic */ float f$3;
    private final /* synthetic */ boolean f$4;

    public /* synthetic */ -$$Lambda$EglRenderer$RQnwmlnL5c18V7FwaqbMl6FsQRo(EglRenderer eglRenderer, GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        this.f$0 = eglRenderer;
        this.f$1 = glDrawer;
        this.f$2 = frameListener;
        this.f$3 = f;
        this.f$4 = z;
    }

    public final void run() {
        EglRenderer.lambda$addFrameListener$3(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
