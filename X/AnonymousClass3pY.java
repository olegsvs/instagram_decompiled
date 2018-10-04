package X;

import android.net.NetworkInfo;

/* renamed from: X.3pY */
public final class AnonymousClass3pY implements AnonymousClass1Ei {
    /* renamed from: B */
    public final boolean f44982B;

    public final void mz() {
    }

    public AnonymousClass3pY(AnonymousClass0Cm anonymousClass0Cm) {
        this.f44982B = ((Boolean) AnonymousClass0CC.f1441D.H(anonymousClass0Cm)).booleanValue();
    }

    public final void lz() {
        AnonymousClass0a1.D(AnonymousClass1EE.C(true));
        AnonymousClass0a1.E();
        if (this.f44982B) {
            NetworkInfo networkInfo = AnonymousClass0Fp.f2209I.f2211C;
            if (networkInfo != null) {
                AnonymousClass17X.f14756W.C(networkInfo.getTypeName());
            }
        }
    }
}
