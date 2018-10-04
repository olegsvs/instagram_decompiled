package X;

/* renamed from: X.4eE */
public final class AnonymousClass4eE implements AnonymousClass3Ag {
    /* renamed from: B */
    public final String f55956B;
    /* renamed from: C */
    public final boolean f55957C;
    /* renamed from: D */
    public final int f55958D;

    public final long pM() {
        return 1000000000000000003L;
    }

    public AnonymousClass4eE(int i, String str, boolean z) {
        this.f55958D = i;
        this.f55956B = str;
        this.f55957C = z;
    }

    /* renamed from: A */
    public final boolean m24649A(AnonymousClass4eE anonymousClass4eE) {
        return this.f55958D == anonymousClass4eE.f55958D && this.f55957C == anonymousClass4eE.f55957C && AnonymousClass0LQ.B(this.f55956B, anonymousClass4eE.f55956B);
    }

    public final /* bridge */ /* synthetic */ boolean AX(Object obj) {
        return m24649A((AnonymousClass4eE) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return m24649A((AnonymousClass4eE) obj);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.D(new Object[]{Integer.valueOf(this.f55958D), this.f55956B, Boolean.valueOf(this.f55957C)});
    }
}
