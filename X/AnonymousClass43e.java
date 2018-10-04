package X;

/* renamed from: X.43e */
public final class AnonymousClass43e extends AnonymousClass3u0 implements AnonymousClass3u1 {
    /* renamed from: B */
    public AnonymousClass3uR f49122B;
    /* renamed from: C */
    public AnonymousClass2s0 f49123C;
    /* renamed from: D */
    public AnonymousClass2qi f49124D;
    /* renamed from: E */
    public AnonymousClass2sY f49125E;
    /* renamed from: F */
    private volatile int f49126F;
    /* renamed from: G */
    private final AnonymousClass3u2 f49127G;
    /* renamed from: H */
    private volatile boolean f49128H;

    public AnonymousClass43e(AnonymousClass2t7 anonymousClass2t7, AnonymousClass2tB anonymousClass2tB, int i, AnonymousClass2rO anonymousClass2rO, AnonymousClass3u2 anonymousClass3u2, int i2) {
        super(anonymousClass2t7, anonymousClass2tB, 2, i, anonymousClass2rO, i2);
        this.f49127G = anonymousClass3u2;
    }

    /* renamed from: A */
    public final long mo5179A() {
        return (long) this.f49126F;
    }

    public final void BE() {
        this.f49128H = true;
    }

    public final void LZ() {
        AnonymousClass2tB I = AnonymousClass2u6.m17656I(this.f46188C, this.f49126F);
        AnonymousClass2sO anonymousClass3uQ;
        try {
            anonymousClass3uQ = new AnonymousClass3uQ(this.f46187B, I.f35400B, this.f46187B.tGA(I));
            if (this.f49126F == 0) {
                this.f49127G.m21220A(this, this.f49122B);
            }
            int i = 0;
            while (i == 0) {
                if (this.f49128H) {
                    break;
                }
                i = this.f49127G.m21221B(anonymousClass3uQ);
            }
            this.f49126F = (int) (anonymousClass3uQ.gP() - this.f46188C.f35400B);
            this.f46187B.close();
        } catch (Throwable th) {
            this.f46187B.close();
        }
    }

    public final int bLA(AnonymousClass2sO anonymousClass2sO, int i, boolean z) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void dLA(AnonymousClass2tw anonymousClass2tw, int i) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void gLA(long j, int i, int i2, int i3, byte[] bArr) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    public final void pH(AnonymousClass2qi anonymousClass2qi) {
        this.f49124D = anonymousClass2qi;
    }

    public final boolean sX() {
        return this.f49128H;
    }

    public final void uG(AnonymousClass2s0 anonymousClass2s0) {
        this.f49123C = anonymousClass2s0;
    }

    public final void uLA(AnonymousClass2sY anonymousClass2sY) {
        this.f49125E = anonymousClass2sY;
    }
}
