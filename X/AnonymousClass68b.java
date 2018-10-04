package X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.68b */
public final class AnonymousClass68b extends AnonymousClass3AG {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68i f72146B;

    public AnonymousClass68b(AnonymousClass68i anonymousClass68i) {
        this.f72146B = anonymousClass68i;
    }

    /* renamed from: A */
    public final void m29184A(Exception exception) {
        this.f72146B.m29201D(new AnonymousClass5Nj(BroadcastFailureType.InitFailure, "initWebRtcSession", exception.getMessage()));
    }

    /* renamed from: B */
    public final void m29185B() {
        AnonymousClass68i.m29194E(this.f72146B);
    }
}
