package X;

import java.lang.ref.WeakReference;

/* renamed from: X.665 */
public final class AnonymousClass665 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final WeakReference f71705B;
    /* renamed from: C */
    public final WeakReference f71706C;
    /* renamed from: D */
    public final boolean f71707D;

    public AnonymousClass665(boolean z, AnonymousClass6G7 anonymousClass6G7, AnonymousClass5aa anonymousClass5aa) {
        this.f71707D = z;
        this.f71706C = new WeakReference(anonymousClass6G7);
        this.f71705B = new WeakReference(anonymousClass5aa);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -653720846);
        super.onFail(anonymousClass0Q6);
        AnonymousClass6G7 anonymousClass6G7 = (AnonymousClass6G7) this.f71706C.get();
        if (anonymousClass6G7 != null) {
            if (this.f71707D) {
                anonymousClass6G7.m29689A(false);
            } else {
                anonymousClass6G7.m29691C(false);
            }
        }
        AnonymousClass0cQ.H(this, -2044708544, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1195845471);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -1708234832);
        super.onSuccess(anonymousClass0Pn);
        AnonymousClass5aa anonymousClass5aa = (AnonymousClass5aa) this.f71705B.get();
        if (anonymousClass5aa != null) {
            anonymousClass5aa.f66676U = this.f71707D ^ true;
        }
        AnonymousClass6G7 anonymousClass6G7 = (AnonymousClass6G7) this.f71706C.get();
        if (anonymousClass6G7 != null) {
            if (this.f71707D) {
                anonymousClass6G7.m29689A(true);
            } else {
                anonymousClass6G7.m29691C(true);
            }
        }
        AnonymousClass0cQ.H(this, 1829673802, I2);
        AnonymousClass0cQ.H(this, 358700898, I);
    }
}
