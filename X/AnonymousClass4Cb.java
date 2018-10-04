package X;

import android.os.Bundle;
import com.instagram.login.api.RegistrationFlowExtras;

/* renamed from: X.4Cb */
public final class AnonymousClass4Cb implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Ry f51420B;
    /* renamed from: C */
    public final /* synthetic */ RegistrationFlowExtras f51421C;

    public AnonymousClass4Cb(AnonymousClass5Ry anonymousClass5Ry, RegistrationFlowExtras registrationFlowExtras) {
        this.f51420B = anonymousClass5Ry;
        this.f51421C = registrationFlowExtras;
    }

    public final void run() {
        String str = this.f51420B.f63651J;
        String I = AnonymousClass0a2.I(this.f51420B.f63660S);
        AnonymousClass33b.m18361C(AnonymousClass33d.BUSINESS_SIGNUP_SKIP.m18377A(), "confirmation", str, I).R();
        this.f51421C.m14749F(this.f51420B.f63659R);
        Bundle G = this.f51421C.m14750G();
        if (this.f51420B.f63643B != null) {
            this.f51420B.f63643B.fb(G);
            return;
        }
        G.putString("entry_point", this.f51420B.f63651J);
        str = "target_page_id";
        G.putString(str, this.f51420B.getArguments().getString(str));
        AnonymousClass0IL H = AnonymousClass0Ir.f2848B.A().H(this.f51420B.f63651J, G);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f51420B.getActivity());
        anonymousClass0IZ.f2754D = H;
        anonymousClass0IZ.B();
    }
}
