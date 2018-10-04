package X;

import android.content.Context;

/* renamed from: X.09l */
public final class AnonymousClass09l extends AnonymousClass0Iw {
    /* renamed from: B */
    public String f1114B;
    /* renamed from: C */
    public Context f1115C;
    /* renamed from: D */
    public AnonymousClass09i f1116D;

    public AnonymousClass09l(Context context, String str, AnonymousClass09i anonymousClass09i) {
        this.f1115C = context;
        this.f1114B = str;
        this.f1116D = anonymousClass09i;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.m5859I(this, -1910058982);
        AnonymousClass0IG.m2162D(this.f1115C, "Network error");
        if (anonymousClass0Q6.m3973B()) {
            ((AnonymousClass1D3) anonymousClass0Q6.f4288C).mo2585A();
        }
        AnonymousClass0cQ.m5858H(this, 514299923, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.m5859I(this, 314954096);
        AnonymousClass1D3 anonymousClass1D3 = (AnonymousClass1D3) obj;
        int I2 = AnonymousClass0cQ.m5859I(this, -248076179);
        AnonymousClass09h.m633E(this.f1115C, this.f1114B, anonymousClass1D3.f15620B);
        AnonymousClass09i anonymousClass09i = this.f1116D;
        if (anonymousClass09i != null) {
            anonymousClass09i.onOperationStart();
        }
        AnonymousClass0cQ.m5858H(this, 771320448, I2);
        AnonymousClass0cQ.m5858H(this, 621125324, I);
    }
}
