package X;

import android.os.Bundle;
import com.facebook.C0164R;

/* renamed from: X.61R */
public final class AnonymousClass61R extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6FF f70987B;

    public AnonymousClass61R(AnonymousClass6FF anonymousClass6FF) {
        this.f70987B = anonymousClass6FF;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        AnonymousClass3eQ anonymousClass3eQ;
        int I = AnonymousClass0cQ.I(this, 181242079);
        String string = this.f70987B.getString(C0164R.string.unknown_error_occured);
        if (anonymousClass0Q6.f4288C != null) {
            anonymousClass3eQ = ((AnonymousClass3eR) anonymousClass0Q6.f4288C).f43014B;
            if (((AnonymousClass3eR) anonymousClass0Q6.f4288C).A() != null) {
                string = ((AnonymousClass3eR) anonymousClass0Q6.f4288C).A();
            }
        } else {
            anonymousClass3eQ = null;
        }
        if (anonymousClass3eQ == AnonymousClass3eQ.POPUP) {
            AnonymousClass0IL anonymousClass0IL = this.f70987B;
            anonymousClass0IL.m28789c(anonymousClass0IL.getString(C0164R.string.rate_limit_header), string, null);
        } else {
            this.f70987B.f73329C.B(string);
        }
        AnonymousClass0cQ.H(this, 423902376, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1500593868);
        AnonymousClass3eR anonymousClass3eR = (AnonymousClass3eR) obj;
        int I2 = AnonymousClass0cQ.I(this, -1171813291);
        AnonymousClass0IL anonymousClass0IL = this.f70987B;
        anonymousClass0IL.f73329C.A();
        AnonymousClass0Nm.N(anonymousClass0IL.f73330D);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
        AnonymousClass0Jl.f2940B.A();
        String str = anonymousClass0IL.f73328B;
        AnonymousClass0IL anonymousClass6FE = new AnonymousClass6FE();
        Bundle bundle = new Bundle();
        bundle.putString("email", str);
        anonymousClass6FE.setArguments(bundle);
        anonymousClass0IZ.f2754D = anonymousClass6FE;
        anonymousClass0IZ.B();
        AnonymousClass0cQ.H(this, -64494585, I2);
        AnonymousClass0cQ.H(this, 850267702, I);
    }
}
