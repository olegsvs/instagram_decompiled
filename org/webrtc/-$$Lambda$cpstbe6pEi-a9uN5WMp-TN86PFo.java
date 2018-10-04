package org.webrtc;

import org.webrtc.VideoFrame.I420Buffer;

public final /* synthetic */ class -$$Lambda$cpstbe6pEi-a9uN5WMp-TN86PFo implements Runnable {
    private final /* synthetic */ I420Buffer f$0;

    public /* synthetic */ -$$Lambda$cpstbe6pEi-a9uN5WMp-TN86PFo(I420Buffer i420Buffer) {
        this.f$0 = i420Buffer;
    }

    public final void run() {
        this.f$0.release();
    }
}
