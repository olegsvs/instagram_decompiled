package X;

/* renamed from: X.2NU */
public final class AnonymousClass2NU {
    /* renamed from: B */
    public AnonymousClass2NT f29672B;
    /* renamed from: C */
    public boolean f29673C;
    /* renamed from: D */
    public boolean f29674D;
    /* renamed from: E */
    public boolean f29675E;
    /* renamed from: F */
    public AnonymousClass2NT f29676F;
    /* renamed from: G */
    public int f29677G;
    /* renamed from: H */
    public long f29678H;

    /* renamed from: A */
    public final synchronized void m15336A() {
        this.f29678H = 0;
        this.f29677G = 0;
        this.f29675E = false;
        this.f29674D = false;
        this.f29672B = null;
        this.f29676F = null;
        this.f29673C = true;
    }

    /* renamed from: B */
    public final synchronized AnonymousClass2NT m15337B() {
        return this.f29672B;
    }

    /* renamed from: C */
    public final synchronized AnonymousClass2NT m15338C() {
        return this.f29676F;
    }

    /* renamed from: D */
    public final synchronized void m15339D(long j) {
        AnonymousClass2NT anonymousClass2NT = this.f29676F != null ? this.f29676F : this.f29672B;
        if (anonymousClass2NT != null && this.f29675E) {
            anonymousClass2NT.f29669B = j;
            this.f29675E = false;
            this.f29678H += anonymousClass2NT.f29669B - anonymousClass2NT.f29671D;
        }
    }
}
