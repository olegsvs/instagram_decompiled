package X;

import android.support.v7.widget.RecyclerView;

/* renamed from: X.4Rt */
public final class AnonymousClass4Rt extends AnonymousClass0Gv {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4S0 f54159B;

    public AnonymousClass4Rt(AnonymousClass4S0 anonymousClass4S0) {
        this.f54159B = anonymousClass4S0;
    }

    /* renamed from: A */
    public final void m24242A(RecyclerView recyclerView, int i) {
        super.A(recyclerView, i);
        switch (i) {
            case 0:
                this.f54159B.f54163C = false;
                if (!this.f54159B.f54164D) {
                    AnonymousClass5Tl.H(this.f54159B.f54165E.f64598B);
                    return;
                }
                return;
            case 1:
                this.f54159B.f54163C = true;
                return;
            default:
                return;
        }
    }

    /* renamed from: B */
    public final void m24243B(RecyclerView recyclerView, int i, int i2) {
        super.B(recyclerView, i, i2);
        boolean A = this.f54159B.m24248A();
        AnonymousClass4S0.m24245C(this.f54159B, A);
        AnonymousClass4S0.m24244B(this.f54159B, A);
    }
}
