package X;

import java.util.List;

/* renamed from: X.4Ci */
public final class AnonymousClass4Ci extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Cl f51440B;

    public AnonymousClass4Ci(AnonymousClass4Cl anonymousClass4Cl) {
        this.f51440B = anonymousClass4Cl;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1043664398);
        AnonymousClass4Cl.m23519B(this.f51440B);
        AnonymousClass0cQ.H(this, 1213361476, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 1858528799);
        this.f51440B.f51444C.m18471A();
        AnonymousClass0cQ.H(this, -963421970, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1553421985);
        this.f51440B.f51444C.m18472B();
        AnonymousClass0cQ.H(this, 1429954167, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1143986538);
        AnonymousClass2Vt anonymousClass2Vt = (AnonymousClass2Vt) obj;
        int I2 = AnonymousClass0cQ.I(this, 226946196);
        if (anonymousClass2Vt == null || anonymousClass2Vt.f31076B == null || anonymousClass2Vt.f31076B.f31075B == null || anonymousClass2Vt.f31076B.f31075B.isEmpty()) {
            AnonymousClass4Cl.m23519B(this.f51440B);
        } else {
            List list = anonymousClass2Vt.f31076B.f31075B;
            int K = AnonymousClass1gr.K(list);
            this.f51440B.f51449H = ((AnonymousClass2W3) list.get(K)).f31091E;
            this.f51440B.f51450I = ((AnonymousClass2W3) list.get(K)).f31092F;
            this.f51440B.f51451J = ((AnonymousClass2W3) list.get(K)).f31099M;
            AnonymousClass4Cl.m23521D(this.f51440B);
        }
        AnonymousClass0cQ.H(this, -779449071, I2);
        AnonymousClass0cQ.H(this, 45975053, I);
    }
}
