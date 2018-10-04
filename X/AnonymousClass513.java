package X;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: X.513 */
public final class AnonymousClass513 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass514 f59299B;

    public AnonymousClass513(AnonymousClass514 anonymousClass514) {
        this.f59299B = anonymousClass514;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass514.m25596C(this.f59299B);
        if (((Boolean) AnonymousClass0CC.th.H(AnonymousClass0Ce.G(this.f59299B.getArguments()))).booleanValue()) {
            AnonymousClass0EF.R(this.f59299B.getContext(), "com.duosecurity.duomobile", "ig_two_fac_authenticator_app_confirm");
        } else {
            AnonymousClass0EF.R(this.f59299B.getContext(), "com.google.android.apps.authenticator2", "ig_two_fac_authenticator_app_confirm");
        }
    }
}
