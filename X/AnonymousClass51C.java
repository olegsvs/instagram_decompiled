package X;

import android.os.Bundle;

/* renamed from: X.51C */
public final class AnonymousClass51C extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51F f59307B;

    public AnonymousClass51C(AnonymousClass51F anonymousClass51F) {
        this.f59307B = anonymousClass51F;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -2029606719);
        super.onFail(anonymousClass0Q6);
        AnonymousClass3nj.F(this.f59307B.getContext(), this.f59307B.f59309B.f1759C, anonymousClass0Q6);
        AnonymousClass0cQ.H(this, 311514352, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1850791087);
        AnonymousClass50r anonymousClass50r = (AnonymousClass50r) obj;
        int I2 = AnonymousClass0cQ.I(this, -1432328093);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f59307B.getActivity());
        AnonymousClass0GQ.f2360B.A();
        Bundle arguments = this.f59307B.getArguments();
        String str = anonymousClass50r.f59286B;
        AnonymousClass0IL anonymousClass514 = new AnonymousClass514();
        if (str != null) {
            arguments.putString("arg_totp_seed", str);
        }
        anonymousClass514.setArguments(arguments);
        anonymousClass0IZ.f2754D = anonymousClass514;
        anonymousClass0IZ.A().B();
        AnonymousClass0cQ.H(this, -55984064, I2);
        AnonymousClass0cQ.H(this, 1108871920, I);
    }
}
