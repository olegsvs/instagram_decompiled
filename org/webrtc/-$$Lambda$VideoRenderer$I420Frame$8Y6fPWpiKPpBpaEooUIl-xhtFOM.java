package org.webrtc;

import org.webrtc.VideoRenderer.I420Frame;

public final /* synthetic */ class -$$Lambda$VideoRenderer$I420Frame$8Y6fPWpiKPpBpaEooUIl-xhtFOM implements Runnable {
    private final /* synthetic */ I420Frame f$0;

    public /* synthetic */ -$$Lambda$VideoRenderer$I420Frame$8Y6fPWpiKPpBpaEooUIl-xhtFOM(I420Frame i420Frame) {
        this.f$0 = i420Frame;
    }

    public final void run() {
        VideoRenderer.renderFrameDone(this.f$0);
    }
}
