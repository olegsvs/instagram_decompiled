package X;

import android.graphics.PointF;

/* renamed from: X.2c4 */
public final class AnonymousClass2c4 implements AnonymousClass2Kz {
    /* renamed from: B */
    private AnonymousClass2Ku f31567B;

    public final void SOA(AnonymousClass2Kw anonymousClass2Kw) {
        this.f31567B.m15119A(anonymousClass2Kw.f29191B, anonymousClass2Kw.f29192C);
    }

    public final void UUA(AnonymousClass2Kw anonymousClass2Kw) {
        this.f31567B = new AnonymousClass2Ku(anonymousClass2Kw.f29191B, anonymousClass2Kw.f29192C);
    }

    public final AnonymousClass2c2 pR() {
        return this.f31567B.f29179B;
    }

    public final void wE(long j) {
        AnonymousClass2Ku anonymousClass2Ku = this.f31567B;
        PointF pointF = anonymousClass2Ku.f29180C;
        if (pointF != anonymousClass2Ku.f29181D) {
            anonymousClass2Ku.m15119A(pointF, j);
            anonymousClass2Ku.f29181D = anonymousClass2Ku.f29180C;
        }
    }
}
