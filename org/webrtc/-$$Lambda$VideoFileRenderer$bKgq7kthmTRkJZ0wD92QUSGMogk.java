package org.webrtc;

public final /* synthetic */ class -$$Lambda$VideoFileRenderer$bKgq7kthmTRkJZ0wD92QUSGMogk implements Runnable {
    private final /* synthetic */ VideoFileRenderer f$0;
    private final /* synthetic */ VideoFrame f$1;

    public /* synthetic */ -$$Lambda$VideoFileRenderer$bKgq7kthmTRkJZ0wD92QUSGMogk(VideoFileRenderer videoFileRenderer, VideoFrame videoFrame) {
        this.f$0 = videoFileRenderer;
        this.f$1 = videoFrame;
    }

    public final void run() {
        VideoFileRenderer.renderFrameOnRenderThread(this.f$0, this.f$1);
    }
}
