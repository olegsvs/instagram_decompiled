package X;

import java.util.List;

/* renamed from: X.3wB */
public abstract class AnonymousClass3wB extends AnonymousClass2xL {
    /* renamed from: B */
    public final long f47129B;
    /* renamed from: C */
    public final List f47130C;
    /* renamed from: D */
    public final long f47131D;

    /* renamed from: B */
    public abstract int mo5272B(long j);

    /* renamed from: F */
    public abstract AnonymousClass2xI mo5273F(AnonymousClass2xJ anonymousClass2xJ, long j);

    public AnonymousClass3wB(AnonymousClass2xI anonymousClass2xI, long j, long j2, long j3, long j4, List list) {
        super(anonymousClass2xI, j, j2);
        this.f47131D = j3;
        this.f47129B = j4;
        this.f47130C = list;
    }

    /* renamed from: C */
    public final long m21617C(long j, long j2) {
        List list = this.f47130C;
        if (list != null) {
            return (((AnonymousClass2xK) list.get((int) (j - this.f47131D))).f36221B * 1000000) / this.f36225D;
        }
        int B = mo5272B(j2);
        j2 = (B == -1 || j != (this.f47131D + ((long) B)) - 1) ? (this.f47129B * 1000000) / this.f36225D : j2 - m21619E(j);
        return j2;
    }

    /* renamed from: D */
    public final long m21618D(long j, long j2) {
        long j3 = this.f47131D;
        long B = (long) mo5272B(j2);
        if (B != 0) {
            if (this.f47130C == null) {
                j = (j / ((this.f47129B * 1000000) / this.f36225D)) + this.f47131D;
                if (j >= j3) {
                    j3 = B == -1 ? j : Math.min(j, (j3 + B) - 1);
                }
            } else {
                B = (B + j3) - 1;
                long j4 = j3;
                while (j4 <= B) {
                    long j5 = ((B - j4) / 2) + j4;
                    long E = m21619E(j5);
                    if (E < j) {
                        j4 = j5 + 1;
                    } else if (E <= j) {
                        return j5;
                    } else {
                        B = j5 - 1;
                    }
                }
                if (j4 != j3) {
                    j4 = B;
                }
                return j4;
            }
        }
        return j3;
    }

    /* renamed from: E */
    public final long m21619E(long j) {
        long j2;
        List list = this.f47130C;
        if (list != null) {
            j2 = ((AnonymousClass2xK) list.get((int) (j - this.f47131D))).f36222C - this.f36224C;
        } else {
            j2 = (j - this.f47131D) * this.f47129B;
        }
        return AnonymousClass2yi.m18106a(j2, 1000000, this.f36225D);
    }

    /* renamed from: G */
    public boolean mo5274G() {
        return this.f47130C != null;
    }
}
