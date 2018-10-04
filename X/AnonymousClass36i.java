package X;

/* renamed from: X.36i */
public final class AnonymousClass36i {
    /* renamed from: B */
    public String f37898B;
    /* renamed from: C */
    public String f37899C;
    /* renamed from: D */
    public String f37900D;

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    AnonymousClass36i anonymousClass36i = (AnonymousClass36i) obj;
                    if (!AnonymousClass0LQ.B(this.f37900D, anonymousClass36i.f37900D) || !AnonymousClass0LQ.B(this.f37899C, anonymousClass36i.f37899C) || !AnonymousClass0LQ.B(this.f37898B, anonymousClass36i.f37898B)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.D(new Object[]{this.f37900D, this.f37899C, this.f37898B});
    }
}
