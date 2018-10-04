package X;

import android.net.Uri;

/* renamed from: X.3vh */
public final class AnonymousClass3vh implements AnonymousClass2yI {
    /* renamed from: B */
    public long f46988B;
    /* renamed from: C */
    public AnonymousClass2yE f46989C;
    /* renamed from: D */
    public long f46990D = -1;
    /* renamed from: E */
    public boolean f46991E = true;
    /* renamed from: F */
    public final AnonymousClass2vO f46992F = new AnonymousClass2vO();
    /* renamed from: G */
    public long f46993G;
    /* renamed from: H */
    public final /* synthetic */ AnonymousClass43z f46994H;
    /* renamed from: I */
    private final AnonymousClass2yC f46995I;
    /* renamed from: J */
    private final AnonymousClass2wR f46996J;
    /* renamed from: K */
    private volatile boolean f46997K;
    /* renamed from: L */
    private final AnonymousClass2yS f46998L;
    /* renamed from: M */
    private final Uri f46999M;

    public AnonymousClass3vh(AnonymousClass43z anonymousClass43z, Uri uri, AnonymousClass2yC anonymousClass2yC, AnonymousClass2wR anonymousClass2wR, AnonymousClass2yS anonymousClass2yS) {
        this.f46994H = anonymousClass43z;
        this.f46999M = (Uri) AnonymousClass2yO.m18016E(uri);
        this.f46995I = (AnonymousClass2yC) AnonymousClass2yO.m18016E(anonymousClass2yC);
        this.f46996J = (AnonymousClass2wR) AnonymousClass2yO.m18016E(anonymousClass2wR);
        this.f46998L = anonymousClass2yS;
    }

    public final void BE() {
        this.f46997K = true;
    }

    public final void LZ() {
        AnonymousClass2vK anonymousClass3vG;
        Throwable th;
        int i = 0;
        while (i == 0 && !this.f46997K) {
            try {
                long j = r4.f46992F.f35794B;
                r4.f46989C = new AnonymousClass2yE(r4.f46999M, j, -1, r4.f46994H.f49290E);
                r4.f46990D = r4.f46995I.uGA(r4.f46989C);
                if (r4.f46990D != -1) {
                    r4.f46990D += j;
                }
                anonymousClass3vG = new AnonymousClass3vG(r4.f46995I, j, r4.f46990D);
                AnonymousClass2vJ A = r4.f46996J.m17853A(anonymousClass3vG, r4.f46995I.nT());
                if (r4.f46991E) {
                    A.tLA(j, r4.f46993G);
                    r4.f46991E = false;
                }
                while (i == 0 && !r4.f46997K) {
                    AnonymousClass2yS anonymousClass2yS = r4.f46998L;
                    synchronized (anonymousClass2yS) {
                        while (true) {
                            try {
                                if (anonymousClass2yS.f36516B) {
                                    break;
                                }
                                anonymousClass2yS.wait();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    i = A.cIA(anonymousClass3vG, r4.f46992F);
                    try {
                        if (anonymousClass3vG.gP() > r4.f46994H.f49289D + j) {
                            j = anonymousClass3vG.gP();
                            r4.f46998L.m18021A();
                            AnonymousClass0OR.D(r4.f46994H.f49294I, r4.f46994H.f49298M, 382045885);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (i == 1) {
                    i = 0;
                } else {
                    r4.f46992F.f35794B = anonymousClass3vG.gP();
                    r4.f46988B = r4.f46992F.f35794B - r4.f46989C.f36490B;
                }
                AnonymousClass2yi.m18086G(r4.f46995I);
            } catch (Throwable th4) {
                th = th4;
                anonymousClass3vG = null;
            }
        }
        return;
        if (!(i == 1 || anonymousClass3vG == null)) {
            r4.f46992F.f35794B = anonymousClass3vG.gP();
            r4.f46988B = r4.f46992F.f35794B - r4.f46989C.f36490B;
        }
        AnonymousClass2yi.m18086G(r4.f46995I);
        throw th;
    }

    public final boolean sX() {
        return this.f46997K;
    }
}
