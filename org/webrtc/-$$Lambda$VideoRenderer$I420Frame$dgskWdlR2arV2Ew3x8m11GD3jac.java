package org.webrtc;

import org.webrtc.VideoRenderer.I420Frame;

public final /* synthetic */ class -$$Lambda$VideoRenderer$I420Frame$dgskWdlR2arV2Ew3x8m11GD3jac implements Runnable {
    private final /* synthetic */ I420Frame f$0;

    public /* synthetic */ -$$Lambda$VideoRenderer$I420Frame$dgskWdlR2arV2Ew3x8m11GD3jac(I420Frame i420Frame) {
        this.f$0 = i420Frame;
    }

    public final void run() {
        VideoRenderer.renderFrameDone(this.f$0);
    }
}
