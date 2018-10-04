package X;

/* renamed from: X.2vY */
public final class AnonymousClass2vY {
    /* renamed from: B */
    public int f35849B;
    /* renamed from: C */
    public int f35850C;
    /* renamed from: D */
    public boolean f35851D;
    /* renamed from: E */
    public int f35852E;
    /* renamed from: F */
    public long f35853F;
    /* renamed from: G */
    private final byte[] f35854G = new byte[10];

    /* renamed from: A */
    public final void m17778A(AnonymousClass2vX anonymousClass2vX, long j) {
        if (this.f35851D) {
            int i = this.f35852E;
            this.f35852E = i + 1;
            if (i == 0) {
                this.f35853F = j;
            }
            if (this.f35852E >= 16) {
                anonymousClass2vX.f35832b.fLA(this.f35853F, this.f35849B, this.f35850C, 0, anonymousClass2vX.f35814J);
                this.f35852E = 0;
            }
        }
    }

    /* renamed from: B */
    public final void m17779B(AnonymousClass2vK anonymousClass2vK, int i, int i2) {
        if (!this.f35851D) {
            anonymousClass2vK.JHA(this.f35854G, 0, 10);
            anonymousClass2vK.MLA();
            if (AnonymousClass2uf.m17739C(this.f35854G) != -1) {
                this.f35851D = true;
                this.f35852E = 0;
            } else {
                return;
            }
        }
        if (this.f35852E == 0) {
            this.f35849B = i;
            this.f35850C = 0;
        }
        this.f35850C += i2;
    }
}
