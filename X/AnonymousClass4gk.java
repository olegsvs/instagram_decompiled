package X;

/* renamed from: X.4gk */
public final class AnonymousClass4gk {
    /* renamed from: B */
    public AnonymousClass1i0 f56287B;
    /* renamed from: C */
    public Long f56288C;
    /* renamed from: D */
    public String f56289D;

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof AnonymousClass4gk)) {
                return false;
            }
            AnonymousClass4gk anonymousClass4gk = (AnonymousClass4gk) obj;
            if (!AnonymousClass0LQ.B(this.f56288C, anonymousClass4gk.f56288C) || !AnonymousClass0LQ.B(this.f56287B, anonymousClass4gk.f56287B) || !AnonymousClass0LQ.B(this.f56289D, anonymousClass4gk.f56289D)) {
                z = false;
            }
        }
        return z;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.D(new Object[]{this.f56287B, this.f56288C, this.f56289D});
    }
}
