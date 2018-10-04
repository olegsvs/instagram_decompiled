package X;

import com.google.android.exoplayer2.Format;

/* renamed from: X.442 */
public final class AnonymousClass442 extends AnonymousClass3vp {
    /* renamed from: B */
    private volatile int f49335B;
    /* renamed from: C */
    private final AnonymousClass3vr f49336C;
    /* renamed from: D */
    private volatile boolean f49337D;

    public AnonymousClass442(AnonymousClass2yC anonymousClass2yC, AnonymousClass2yE anonymousClass2yE, Format format, int i, Object obj, AnonymousClass3vr anonymousClass3vr) {
        super(anonymousClass2yC, anonymousClass2yE, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f49336C = anonymousClass3vr;
    }

    /* renamed from: A */
    public final long mo5261A() {
        return (long) this.f49335B;
    }

    public final void BE() {
        this.f49337D = true;
    }

    public final void LZ() {
        AnonymousClass2yE A = this.f47030C.m18008A((long) this.f49335B);
        AnonymousClass2vK anonymousClass3vG;
        try {
            anonymousClass3vG = new AnonymousClass3vG(this.f47029B, A.f36490B, this.f47029B.uGA(A));
            if (this.f49335B == 0) {
                this.f49336C.m21557A(null, -9223372036854775807L);
            }
            AnonymousClass2vJ anonymousClass2vJ = this.f49336C.f47042B;
            int i = 0;
            while (i == 0 && !this.f49337D) {
                i = anonymousClass2vJ.cIA(anonymousClass3vG, null);
            }
            boolean z = true;
            if (i == 1) {
                z = false;
            }
            AnonymousClass2yO.m18017F(z);
            this.f49335B = (int) (anonymousClass3vG.gP() - this.f47030C.f36490B);
            AnonymousClass2yi.m18086G(this.f47029B);
        } catch (Throwable th) {
            AnonymousClass2yi.m18086G(this.f47029B);
        }
    }

    public final boolean sX() {
        return this.f49337D;
    }
}
