package X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.68h */
public final class AnonymousClass68h implements AnonymousClass5O9 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68i f72156B;

    public final void dh(AnonymousClass5Nu anonymousClass5Nu) {
    }

    public AnonymousClass68h(AnonymousClass68i anonymousClass68i) {
        this.f72156B = anonymousClass68i;
    }

    public final void Fk() {
        AnonymousClass68i.m29195F(this.f72156B);
    }

    public final void cn(AnonymousClass5OB anonymousClass5OB) {
        AnonymousClass68i.m29192C(this.f72156B);
    }

    public final void de(AnonymousClass5OB anonymousClass5OB, AnonymousClass5Nj anonymousClass5Nj) {
        if (anonymousClass5Nj.f62824B == BroadcastFailureType.RtcSessionUnavailable) {
            AnonymousClass0Sy.G(new AnonymousClass68g(this.f72156B, anonymousClass5Nj));
        } else {
            this.f72156B.m29201D(anonymousClass5Nj);
        }
    }

    public final void hq(AnonymousClass5OB anonymousClass5OB, String str) {
        AnonymousClass68i.m29193D(this.f72156B);
    }

    public final void nu(int i) {
        if (this.f72156B.f72170N != null) {
            i = this.f72156B.f72167K;
            i.f63078B.removeView(this.f72156B.f72170N);
        }
    }
}
