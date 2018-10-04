package X;

/* renamed from: X.3wY */
public final class AnonymousClass3wY implements AnonymousClass2yX {
    /* renamed from: B */
    private long f47181B;
    /* renamed from: C */
    private long f47182C;
    /* renamed from: D */
    private final AnonymousClass2yP f47183D;
    /* renamed from: E */
    private AnonymousClass2uT f47184E = AnonymousClass2uT.f35630F;
    /* renamed from: F */
    private boolean f47185F;

    public AnonymousClass3wY(AnonymousClass2yP anonymousClass2yP) {
        this.f47183D = anonymousClass2yP;
    }

    /* renamed from: A */
    public final void m21635A(long j) {
        this.f47182C = j;
        if (this.f47185F) {
            this.f47181B = this.f47183D.zG();
        }
    }

    /* renamed from: B */
    public final void m21636B() {
        if (!this.f47185F) {
            this.f47181B = this.f47183D.zG();
            this.f47185F = true;
        }
    }

    /* renamed from: C */
    public final void m21637C() {
        if (this.f47185F) {
            m21635A(jP());
            this.f47185F = false;
        }
    }

    public final AnonymousClass2uT TQA(AnonymousClass2uT anonymousClass2uT) {
        if (this.f47185F) {
            m21635A(jP());
        }
        this.f47184E = anonymousClass2uT;
        return anonymousClass2uT;
    }

    public final AnonymousClass2uT cP() {
        return this.f47184E;
    }

    public final long jP() {
        long j = this.f47182C;
        if (!this.f47185F) {
            return j;
        }
        long zG = this.f47183D.zG() - this.f47181B;
        if (this.f47184E.f35634E == 1.0f) {
            return j + AnonymousClass2uA.m17666B(zG);
        }
        return j + (zG * ((long) this.f47184E.f35632C));
    }
}
