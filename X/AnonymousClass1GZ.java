package X;

import java.util.Set;

/* renamed from: X.1GZ */
public final class AnonymousClass1GZ {
    /* renamed from: B */
    public final AnonymousClass1GU f16300B;
    /* renamed from: C */
    public final Set f16301C;
    /* renamed from: D */
    public final Set f16302D;

    public AnonymousClass1GZ(AnonymousClass1GU anonymousClass1GU, Set set, Set set2) {
        this.f16300B = anonymousClass1GU;
        this.f16302D = set;
        this.f16301C = set2;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    AnonymousClass1GZ anonymousClass1GZ = (AnonymousClass1GZ) obj;
                    if (this.f16300B == anonymousClass1GZ.f16300B) {
                        Set set = this.f16302D;
                        if (set != null) {
                            if (!set.equals(anonymousClass1GZ.f16302D)) {
                            }
                        } else if (anonymousClass1GZ.f16302D != null) {
                        }
                        set = this.f16301C;
                        if (set != null) {
                            z = set.equals(anonymousClass1GZ.f16301C);
                        } else if (anonymousClass1GZ.f16301C != null) {
                            z = false;
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        AnonymousClass1GU anonymousClass1GU = this.f16300B;
        int i = 0;
        int hashCode = (anonymousClass1GU != null ? anonymousClass1GU.hashCode() : 0) * 31;
        Set set = this.f16302D;
        hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        set = this.f16301C;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }
}
