package X;

/* renamed from: X.46r */
public final class AnonymousClass46r {
    /* renamed from: B */
    public long f50374B = 0;
    /* renamed from: C */
    public long f50375C = 0;
    /* renamed from: D */
    public long f50376D = 0;

    /* renamed from: A */
    public final AnonymousClass46r m23262A() {
        AnonymousClass46r anonymousClass46r = new AnonymousClass46r();
        anonymousClass46r.f50375C = this.f50375C;
        anonymousClass46r.f50376D = this.f50376D;
        anonymousClass46r.f50374B = this.f50374B;
        return anonymousClass46r;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m23262A();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass46r anonymousClass46r = (AnonymousClass46r) obj;
                    if (this.f50374B != anonymousClass46r.f50374B || this.f50376D != anonymousClass46r.f50376D || this.f50375C != anonymousClass46r.f50375C) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.f50374B;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        j = this.f50376D;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f50375C;
        return i + ((int) ((j >>> 32) ^ j));
    }
}
