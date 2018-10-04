package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.2pS */
public final class AnonymousClass2pS {
    /* renamed from: G */
    private static final int[] f34501G;
    /* renamed from: B */
    public final AnonymousClass1ha[] f34502B;
    /* renamed from: C */
    public boolean f34503C;
    /* renamed from: D */
    public long f34504D;
    /* renamed from: E */
    public final long f34505E;
    /* renamed from: F */
    public final AnonymousClass3ti f34506F;

    static {
        r3 = new int[9];
        f34501G = r3;
        r3[0] = 8000;
        r3[1] = 8000;
        r3[2] = 3;
        r3[3] = 0;
        r3[4] = 0;
        r3[5] = StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS;
        r3[6] = 2000;
        r3[7] = StartupQEsConfig.DEFAULT_IDLE_MAX_INTERVAL_MS;
        r3[8] = 2000;
    }

    public AnonymousClass2pS() {
        this(null, null);
    }

    public AnonymousClass2pS(AnonymousClass1Gy anonymousClass1Gy, AnonymousClass3ti anonymousClass3ti) {
        this.f34502B = new AnonymousClass1ha[9];
        int i = 0;
        this.f34503C = false;
        if (anonymousClass1Gy != null && anonymousClass1Gy.TC) {
            this.f34502B[0] = AnonymousClass2pS.m17348C(anonymousClass1Gy.f16618w);
            this.f34502B[1] = AnonymousClass2pS.m17348C(anonymousClass1Gy.f16619x);
            this.f34502B[2] = AnonymousClass2pS.m17348C(anonymousClass1Gy.aB);
            this.f34502B[3] = AnonymousClass2pS.m17348C(anonymousClass1Gy.f16586Q);
            this.f34502B[4] = AnonymousClass2pS.m17348C(anonymousClass1Gy.f16585P);
            this.f34502B[5] = AnonymousClass2pS.m17348C(anonymousClass1Gy.YB);
            this.f34502B[6] = AnonymousClass2pS.m17348C(anonymousClass1Gy.bB);
            this.f34502B[7] = AnonymousClass2pS.m17348C(anonymousClass1Gy.NB);
            this.f34502B[8] = AnonymousClass2pS.m17348C(anonymousClass1Gy.OB);
            while (i < 9) {
                if (this.f34502B[i] != null) {
                    this.f34503C = true;
                    break;
                }
                i++;
            }
        }
        this.f34506F = anonymousClass3ti;
        this.f34505E = anonymousClass1Gy != null ? anonymousClass1Gy.ZB : 0;
    }

    /* renamed from: A */
    public final int m17349A() {
        return AnonymousClass2pS.m17347B(this, 2);
    }

    /* renamed from: B */
    public static int m17347B(AnonymousClass2pS anonymousClass2pS, int i) {
        if (anonymousClass2pS.f34502B[i] == null) {
            return f34501G[i];
        }
        if (anonymousClass2pS.f34503C && anonymousClass2pS.f34506F != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - anonymousClass2pS.f34504D > anonymousClass2pS.f34505E) {
                AnonymousClass1xU B = AnonymousClass2pl.m17400B(-1);
                Integer valueOf = Integer.valueOf(2);
                for (int i2 = 0; i2 < 9; i2++) {
                    AnonymousClass1ha[] anonymousClass1haArr = anonymousClass2pS.f34502B;
                    if (anonymousClass1haArr[i2] != null) {
                        AnonymousClass1ha anonymousClass1ha = anonymousClass1haArr[i2];
                        int i3 = anonymousClass1ha.f21530C;
                        if (!anonymousClass1ha.f21529B.f16640K || !anonymousClass1ha.f21529B.f16642M) {
                            anonymousClass1ha.A(B);
                            anonymousClass1ha.B(valueOf);
                        } else if ((!anonymousClass1ha.f21529B.f16641L || AnonymousClass1GY.D(valueOf.intValue(), 6)) && B != AnonymousClass1xU.UNKNOWN) {
                            anonymousClass1ha.A(B);
                        } else {
                            anonymousClass1ha.B(valueOf);
                        }
                        int i4 = anonymousClass1ha.f21530C;
                    }
                }
                anonymousClass2pS.f34504D = elapsedRealtime;
            }
        }
        return anonymousClass2pS.f34502B[i].f21530C;
    }

    /* renamed from: C */
    private static AnonymousClass1ha m17348C(AnonymousClass1H2 anonymousClass1H2) {
        return anonymousClass1H2 != null ? new AnonymousClass1ha(anonymousClass1H2) : null;
    }
}
