package X;

import com.google.android.exoplayer2.Format;

/* renamed from: X.45x */
public final class AnonymousClass45x extends AnonymousClass45Q {
    /* renamed from: B */
    private volatile int f50193B;
    /* renamed from: C */
    private final int f50194C;
    /* renamed from: D */
    private final AnonymousClass3vr f50195D;
    /* renamed from: E */
    private volatile boolean f50196E;
    /* renamed from: F */
    private volatile boolean f50197F;
    /* renamed from: G */
    private final long f50198G;

    public AnonymousClass45x(AnonymousClass2yC anonymousClass2yC, AnonymousClass2yE anonymousClass2yE, Format format, int i, Object obj, long j, long j2, long j3, long j4, int i2, long j5, AnonymousClass3vr anonymousClass3vr) {
        super(anonymousClass2yC, anonymousClass2yE, format, i, obj, j, j2, j3, j4);
        this.f50194C = i2;
        this.f50198G = j5;
        this.f50195D = anonymousClass3vr;
    }

    /* renamed from: A */
    public final long mo5261A() {
        return (long) this.f50193B;
    }

    /* renamed from: B */
    public final long mo5469B() {
        return this.f49338B + ((long) this.f50194C);
    }

    public final void BE() {
        this.f50196E = true;
    }

    /* renamed from: C */
    public final boolean mo5470C() {
        return this.f50197F;
    }

    public final void LZ() {
        AnonymousClass2yE A = this.f47030C.m18008A((long) this.f50193B);
        AnonymousClass2vK anonymousClass3vG;
        try {
            anonymousClass3vG = new AnonymousClass3vG(this.f47029B, A.f36490B, this.f47029B.uGA(A));
            if (this.f50193B == 0) {
                AnonymousClass2ww anonymousClass2ww = this.f49902C;
                anonymousClass2ww.m21554A(this.f50198G);
                this.f50195D.m21557A(anonymousClass2ww, this.f49903D == -9223372036854775807L ? 0 : this.f49903D - this.f50198G);
            }
            AnonymousClass2vJ anonymousClass2vJ = this.f50195D.f47042B;
            boolean z = false;
            int i = 0;
            while (i == 0 && !this.f50196E) {
                i = anonymousClass2vJ.cIA(anonymousClass3vG, null);
            }
            if (i != 1) {
                z = true;
            }
            AnonymousClass2yO.m18017F(z);
            this.f50193B = (int) (anonymousClass3vG.gP() - this.f47030C.f36490B);
            AnonymousClass2yi.m18086G(this.f47029B);
            this.f50197F = true;
        } catch (Throwable th) {
            AnonymousClass2yi.m18086G(this.f47029B);
        }
    }

    public final boolean sX() {
        return this.f50196E;
    }
}
