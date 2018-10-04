package X;

/* renamed from: X.65q */
public final class AnonymousClass65q {
    /* renamed from: B */
    public boolean f71665B;
    /* renamed from: C */
    public boolean f71666C;
    /* renamed from: D */
    public boolean f71667D;
    /* renamed from: E */
    public boolean f71668E;
    /* renamed from: F */
    public boolean f71669F;
    /* renamed from: G */
    private String f71670G;

    public AnonymousClass65q(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        this.f71667D = z;
        this.f71665B = z2;
        this.f71669F = z3;
        this.f71666C = z4;
        this.f71668E = z5;
        this.f71670G = str;
    }

    /* renamed from: A */
    public final AnonymousClass65r m28969A() {
        return new AnonymousClass65r(this.f71667D, this.f71665B, this.f71669F, this.f71666C, this.f71668E, this.f71670G);
    }

    /* renamed from: B */
    public final AnonymousClass65q m28970B(String str) {
        this.f71670G = str;
        if (str == null || str.isEmpty()) {
            this.f71665B = false;
        }
        return this;
    }
}
