package X;

/* renamed from: X.18U */
public final class AnonymousClass18U {
    /* renamed from: B */
    public String f14983B;
    /* renamed from: C */
    public String f14984C;
    /* renamed from: D */
    public String f14985D;

    public AnonymousClass18U(String str, String str2, String str3) {
        this.f14984C = str;
        this.f14983B = str2;
        this.f14985D = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass18U)) {
            return false;
        }
        AnonymousClass18U anonymousClass18U = (AnonymousClass18U) obj;
        if (obj == this || (AnonymousClass0LQ.m2954B(this.f14984C, anonymousClass18U.f14984C) && AnonymousClass0LQ.m2954B(this.f14983B, anonymousClass18U.f14983B) && AnonymousClass0LQ.m2954B(this.f14985D, anonymousClass18U.f14985D))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.m2956D(this.f14984C, this.f14983B, this.f14985D);
    }
}
