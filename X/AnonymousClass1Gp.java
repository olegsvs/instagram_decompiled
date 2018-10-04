package X;

import java.io.Serializable;

/* renamed from: X.1Gp */
public final class AnonymousClass1Gp implements Serializable {
    /* renamed from: B */
    public final int f16472B;
    /* renamed from: C */
    public final int f16473C;

    public AnonymousClass1Gp(int i, int i2) {
        this.f16472B = i;
        this.f16473C = i2;
    }

    /* renamed from: A */
    public final boolean m10579A() {
        return this.f16472B > 0 && this.f16473C > 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1Gp)) {
            return false;
        }
        AnonymousClass1Gp anonymousClass1Gp = (AnonymousClass1Gp) obj;
        boolean z = this.f16472B == anonymousClass1Gp.f16472B && this.f16473C == anonymousClass1Gp.f16473C;
        return z;
    }

    public final int hashCode() {
        return (this.f16472B * 31) + this.f16473C;
    }
}
