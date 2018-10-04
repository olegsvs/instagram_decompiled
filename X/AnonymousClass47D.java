package X;

import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.47D */
public final class AnonymousClass47D implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rh f50406B;
    /* renamed from: C */
    public final /* synthetic */ LiveStreamingError f50407C;

    public AnonymousClass47D(AnonymousClass5Rh anonymousClass5Rh, LiveStreamingError liveStreamingError) {
        this.f50406B = anonymousClass5Rh;
        this.f50407C = liveStreamingError;
    }

    public final void run() {
        if (this.f50406B.f63440V != null) {
            AnonymousClass68v anonymousClass68v = this.f50406B.f63440V;
            LiveStreamingError liveStreamingError = this.f50407C;
            AnonymousClass0Dc.G("RtmpLiveStreamingSession", "onBroadcastFailed", liveStreamingError.throwable);
            anonymousClass68v.f72221B.f72228H.A(liveStreamingError);
            if (anonymousClass68v.f72221B.f72236P != null) {
                anonymousClass68v.f72221B.f72236P.m18801A(new AnonymousClass5Nj(BroadcastFailureType.f62828D, "BroadcastFailed", liveStreamingError.descripton));
                anonymousClass68v.f72221B.f72236P = null;
                return;
            }
            anonymousClass68v.f72221B.f72225E.de(anonymousClass68v.f72221B, new AnonymousClass5Nj(BroadcastFailureType.f62828D, "BroadcastFailed", liveStreamingError.descripton));
        }
    }
}
