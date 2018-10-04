package X;

import android.content.Context;
import com.instagram.video.live.streaming.common.BroadcastType;

/* renamed from: X.68p */
public final class AnonymousClass68p implements AnonymousClass5OB {
    /* renamed from: B */
    public final AnonymousClass5aZ f72196B;
    /* renamed from: C */
    public int f72197C;
    /* renamed from: D */
    public int f72198D;
    /* renamed from: E */
    public final AnonymousClass5O9 f72199E;
    /* renamed from: F */
    public long f72200F;
    /* renamed from: G */
    public AnonymousClass3AG f72201G;
    /* renamed from: H */
    public final AnonymousClass4u4 f72202H;
    /* renamed from: I */
    public final AnonymousClass6DQ f72203I;
    /* renamed from: J */
    public final AnonymousClass66z f72204J;
    /* renamed from: K */
    public final AnonymousClass6HM f72205K;
    /* renamed from: L */
    private final AnonymousClass3oN f72206L;
    /* renamed from: M */
    private final AnonymousClass66w f72207M;
    /* renamed from: N */
    private final AnonymousClass64j f72208N;
    /* renamed from: O */
    private final AnonymousClass3AL f72209O = new AnonymousClass68n(this);

    public final boolean NX() {
        return false;
    }

    public final void Pc() {
    }

    public AnonymousClass68p(Context context, AnonymousClass4u4 anonymousClass4u4, AnonymousClass5aZ anonymousClass5aZ, AnonymousClass1ax anonymousClass1ax, AnonymousClass5PF anonymousClass5PF, AnonymousClass1XZ anonymousClass1XZ, AnonymousClass5O9 anonymousClass5O9, AnonymousClass3oO anonymousClass3oO, String str, boolean z) {
        this.f72202H = anonymousClass4u4;
        this.f72196B = (AnonymousClass5aZ) AnonymousClass0LH.E(anonymousClass5aZ);
        this.f72199E = (AnonymousClass5O9) AnonymousClass0LH.E(anonymousClass5O9);
        this.f72203I = new AnonymousClass6DQ(anonymousClass5PF, context, this.f72202H.f58323B, z);
        this.f72206L = new AnonymousClass3oN(context, anonymousClass3oO, anonymousClass1XZ);
        this.f72205K = new AnonymousClass6HM();
        this.f72207M = new AnonymousClass66w(anonymousClass1ax, this.f72202H);
        this.f72204J = new AnonymousClass66z(anonymousClass4u4.f58324C, new AnonymousClass68o(this), this.f72207M, new AnonymousClass5jI(context, this.f72203I, this.f72205K), this.f72202H.f58325D);
        this.f72204J.mo6304N(str);
        AnonymousClass68p.m29208B(this, 0);
        this.f72208N = new AnonymousClass64j(100, new AnonymousClass6GJ(this));
    }

    /* renamed from: B */
    public static void m29208B(AnonymousClass68p anonymousClass68p, int i) {
        int i2 = (i <= 0 || !anonymousClass68p.f72202H.f58325D.f58308H) ? 1 : 2;
        anonymousClass68p.f72198D = anonymousClass68p.f72202H.f58325D.f58314N;
        anonymousClass68p.f72197C = anonymousClass68p.f72202H.f58325D.f58313M / i2;
    }

    public final void DW(AnonymousClass3AG anonymousClass3AG) {
        AnonymousClass0LH.I(this.f72201G == null, "Only one init can be called simultaneously.");
        this.f72201G = anonymousClass3AG;
        this.f72204J.mo6251O();
    }

    public final BroadcastType FJ() {
        return BroadcastType.LIVESWAP_RTC;
    }

    public final long LT() {
        return this.f72200F;
    }

    public final void NJA(boolean z, AnonymousClass3AL anonymousClass3AL) {
        AnonymousClass5YA anonymousClass5YA = this.f72207M;
        anonymousClass5YA.f66024C = true;
        anonymousClass5YA.f66023B.removeCallbacksAndMessages(null);
        this.f72204J.mo6245B();
        this.f72206L.A();
        AnonymousClass3AL.C(anonymousClass3AL, new AnonymousClass5OA(null, false));
        AnonymousClass0Gb.D(this, "RtcLiveStreamingSession");
    }

    public final void UWA() {
        this.f72204J.m27424D(this.f72209O);
    }

    public final void ZUA(AnonymousClass3AL anonymousClass3AL) {
        this.f72206L.D();
        AnonymousClass5Y5 anonymousClass5Y5 = this.f72204J;
        if (anonymousClass5Y5.f66005C != null) {
            AnonymousClass5jH anonymousClass5jH = anonymousClass5Y5.f66005C;
            AnonymousClass5jH.m28344C(anonymousClass5jH, new AnonymousClass5jB(anonymousClass5jH));
            anonymousClass5jH = anonymousClass5Y5.f66005C;
            AnonymousClass5jH.m28344C(anonymousClass5jH, new AnonymousClass5jD(anonymousClass5jH));
            anonymousClass5jH = anonymousClass5Y5.f66005C;
            AnonymousClass5jH.m28344C(anonymousClass5jH, new AnonymousClass5jF(anonymousClass5jH));
        }
        AnonymousClass64j anonymousClass64j = this.f72208N;
        if (anonymousClass64j.f71535F == null) {
            anonymousClass64j.f71535F = new AnonymousClass64i(anonymousClass64j);
            AnonymousClass0OR.F(anonymousClass64j.f71532C, anonymousClass64j.f71535F, (long) anonymousClass64j.f71534E, 667927303);
        }
        this.f72205K.startCapture(this.f72198D, this.f72197C, 30);
        anonymousClass3AL.B(this.f72205K.m29902A(this.f72202H.f58325D.f58314N, this.f72202H.f58325D.f58313M));
    }

    public final void lMA(boolean z) {
        this.f72204J.m27432M(z);
    }

    public final void zUA(boolean r5, X.AnonymousClass3AG r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f72205K;	 Catch:{ InterruptedException -> 0x0005 }
        r0.stopCapture();	 Catch:{ InterruptedException -> 0x0005 }
    L_0x0005:
        r3 = r4.f72208N;
        r2 = r3.f71535F;
        if (r2 == 0) goto L_0x0016;
    L_0x000b:
        r1 = r3.f71532C;
        r0 = -2035740546; // 0xffffffff86a9107e float:-6.359497E-35 double:NaN;
        X.AnonymousClass0OR.G(r1, r2, r0);
        r0 = 0;
        r3.f71535F = r0;
    L_0x0016:
        r2 = r4.f72204J;
        r0 = r2.f66005C;
        if (r0 == 0) goto L_0x003a;
    L_0x001c:
        r1 = r2.f66005C;
        r0 = new X.5jC;
        r0.<init>(r1);
        X.AnonymousClass5jH.m28344C(r1, r0);
        r1 = r2.f66005C;
        r0 = new X.5jE;
        r0.<init>(r1);
        X.AnonymousClass5jH.m28344C(r1, r0);
        r1 = r2.f66005C;
        r0 = new X.5is;
        r0.<init>(r1);
        X.AnonymousClass5jH.m28344C(r1, r0);
    L_0x003a:
        r0 = r4.f72206L;
        r0.E();
        X.AnonymousClass3AG.C(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.68p.zUA(boolean, X.3AG):void");
    }
}
