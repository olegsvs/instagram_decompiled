package X;

/* renamed from: X.68D */
public final class AnonymousClass68D implements AnonymousClass5Nq {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass68O f72068B;

    public AnonymousClass68D(AnonymousClass68O anonymousClass68O) {
        this.f72068B = anonymousClass68O;
    }

    public final void bBA() {
        AnonymousClass5aa anonymousClass5aa = this.f72068B.f72097M;
        long j = 0;
        long LT = this.f72068B.f72086B != null ? this.f72068B.f72086B.LT() : 0;
        if (this.f72068B.f72087C != null) {
            j = this.f72068B.f72087C.LT();
        }
        AnonymousClass5aa.m27729C(anonymousClass5aa, AnonymousClass5MJ.BROADCAST_STATS).C("rtmp_duration", LT).C("rtc_duration", j).R();
    }
}
