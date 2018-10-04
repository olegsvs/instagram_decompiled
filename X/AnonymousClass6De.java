package X;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: X.6De */
public final class AnonymousClass6De implements VideoSink {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5jN f73063B;

    public AnonymousClass6De(AnonymousClass5jN anonymousClass5jN) {
        this.f73063B = anonymousClass5jN;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.f73063B.mo6408E(videoFrame);
        videoFrame = this.f73063B.f68549B;
        if (videoFrame.f68430C == 0) {
            synchronized (videoFrame.f68431D) {
                for (AnonymousClass5jM onFirstFrameRendered : videoFrame.f68431D) {
                    onFirstFrameRendered.onFirstFrameRendered();
                }
            }
        }
        videoFrame.f68430C = AnonymousClass0Gd.E();
    }
}
