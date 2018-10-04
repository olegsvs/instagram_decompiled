package X;

import android.app.Dialog;

/* renamed from: X.206 */
public final class AnonymousClass206 extends AnonymousClass1Es {
    /* renamed from: B */
    private /* synthetic */ Dialog f25161B;
    /* renamed from: C */
    private /* synthetic */ AnonymousClass205 f25162C;

    public AnonymousClass206(AnonymousClass205 anonymousClass205, Dialog dialog) {
        this.f25162C = anonymousClass205;
        this.f25161B = dialog;
    }

    /* renamed from: A */
    public final void m14138A() {
        AnonymousClass2Sp anonymousClass2Sp = this.f25162C.f25159B;
        anonymousClass2Sp.f30624C.set(null);
        anonymousClass2Sp.mo3537K();
        if (this.f25161B.isShowing()) {
            this.f25161B.dismiss();
        }
    }
}
