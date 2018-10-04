package org.webrtc;

public final /* synthetic */ class -$$Lambda$SurfaceViewRenderer$NznHhISA8bkJ9U8moGf2KoEdee4 implements Runnable {
    private final /* synthetic */ SurfaceViewRenderer f$0;
    private final /* synthetic */ int f$1;
    private final /* synthetic */ int f$2;

    public /* synthetic */ -$$Lambda$SurfaceViewRenderer$NznHhISA8bkJ9U8moGf2KoEdee4(SurfaceViewRenderer surfaceViewRenderer, int i, int i2) {
        this.f$0 = surfaceViewRenderer;
        this.f$1 = i;
        this.f$2 = i2;
    }

    public final void run() {
        SurfaceViewRenderer.lambda$onFrameResolutionChanged$0(this.f$0, this.f$1, this.f$2);
    }
}
