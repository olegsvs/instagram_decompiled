package X;

/* renamed from: X.0fP */
public final class AnonymousClass0fP {
    /* renamed from: B */
    private long f7942B;
    /* renamed from: C */
    private float f7943C;
    /* renamed from: D */
    private long f7944D = -1;

    public AnonymousClass0fP(float f) {
        boolean z = f >= 0.0f && f <= 1.0f;
        AnonymousClass0LH.m2924B(z);
        this.f7943C = f;
    }

    public AnonymousClass0fP(AnonymousClass0fP anonymousClass0fP) {
        this.f7944D = anonymousClass0fP.f7944D;
        this.f7943C = anonymousClass0fP.f7943C;
        this.f7942B = anonymousClass0fP.f7942B;
    }

    /* renamed from: A */
    public final long m6536A(long j) {
        long B = m6537B(j);
        this.f7942B = 0;
        return B;
    }

    /* renamed from: B */
    public final long m6537B(long j) {
        if (m6538C()) {
            return (this.f7942B + j) - this.f7944D;
        }
        return this.f7942B;
    }

    /* renamed from: C */
    public final boolean m6538C() {
        return this.f7944D != -1;
    }

    /* renamed from: D */
    public final boolean m6539D(long j) {
        long j2 = this.f7944D;
        if (j2 == -1) {
            return false;
        }
        this.f7942B += j - j2;
        this.f7944D = -1;
        return true;
    }

    /* renamed from: E */
    public final boolean m6540E(float f, long j) {
        if (f < this.f7943C || this.f7944D != -1) {
            if (f < this.f7943C) {
                long j2 = this.f7944D;
                if (j2 != -1) {
                    this.f7942B += j - j2;
                    this.f7944D = -1;
                    return true;
                }
            }
            return false;
        }
        this.f7944D = j;
        return true;
    }
}
