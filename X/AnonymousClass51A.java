package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.51A */
public final class AnonymousClass51A implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51F f59305B;

    public AnonymousClass51A(AnonymousClass51F anonymousClass51F) {
        this.f59305B = anonymousClass51F;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1355978269);
        AnonymousClass0IL anonymousClass0IL = this.f59305B;
        if (AnonymousClass0EF.H(anonymousClass0IL.getContext().getPackageManager(), AnonymousClass2Dv.DUO.A().equals(anonymousClass0IL.getArguments().getString("arg_two_fac_app_name")) ? "com.duosecurity.duomobile" : "com.google.android.apps.authenticator2")) {
            AnonymousClass50o.m25586B(anonymousClass0IL.f59309B, anonymousClass0IL.getContext(), anonymousClass0IL.getLoaderManager(), new AnonymousClass51C(anonymousClass0IL));
        } else {
            new AnonymousClass0P2(anonymousClass0IL.getContext()).V(C0164R.string.two_fac_authenticator_app_download_dialog_title).K(C0164R.string.two_fac_authenticator_app_download_dialog_body).S(C0164R.string.open, new AnonymousClass51E(anonymousClass0IL)).N(C0164R.string.cancel, new AnonymousClass51D(anonymousClass0IL)).A().show();
        }
        AnonymousClass0cQ.L(this, 2125289510, M);
    }
}
