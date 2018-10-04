package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0ov */
public final class AnonymousClass0ov {
    /* renamed from: B */
    public AnonymousClass13W f10438B;
    /* renamed from: C */
    public boolean f10439C;
    /* renamed from: D */
    public final AnonymousClass0MI f10440D;
    /* renamed from: E */
    public AnonymousClass0Qf f10441E;

    public AnonymousClass0ov(AnonymousClass0MI anonymousClass0MI, AnonymousClass0Qf anonymousClass0Qf) {
        this.f10440D = anonymousClass0MI;
        this.f10441E = anonymousClass0Qf;
    }

    /* renamed from: A */
    public final boolean m7751A() {
        boolean z = false;
        if (!this.f10440D.m3119K()) {
            if (this.f10440D.m3132X()) {
                return true;
            }
            if (!m7762L() || !m7760J()) {
                if (this.f10440D.m3131W() || this.f10440D.f3383P) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: B */
    public final String m7752B() {
        int C = this.f10440D.m3111C();
        if (C > 9) {
            return "+";
        }
        return String.valueOf(C);
    }

    /* renamed from: C */
    public final Set m7753C() {
        Set hashSet = new HashSet();
        if (this.f10440D.f3388U != null) {
            hashSet.addAll(this.f10440D.f3388U.m3896F());
        }
        return hashSet;
    }

    /* renamed from: D */
    public final String m7754D() {
        return this.f10440D.m3112D();
    }

    /* renamed from: E */
    public final AnonymousClass0Zc m7755E() {
        return this.f10440D.f3385R;
    }

    /* renamed from: F */
    public final boolean m7756F() {
        return m7759I() && this.f10440D.m3120L();
    }

    /* renamed from: G */
    public final boolean m7757G() {
        return this.f10440D.m3122N();
    }

    /* renamed from: H */
    public final boolean m7758H() {
        return this.f10440D.m3125Q();
    }

    /* renamed from: I */
    public final boolean m7759I() {
        return this.f10440D.m3126R();
    }

    /* renamed from: J */
    public final boolean m7760J() {
        return this.f10440D.m3130V();
    }

    /* renamed from: K */
    public final boolean m7761K() {
        return this.f10440D.f3383P;
    }

    /* renamed from: L */
    public final boolean m7762L() {
        return this.f10440D.f3384Q;
    }
}
