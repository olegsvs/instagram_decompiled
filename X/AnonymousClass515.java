package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.515 */
public final class AnonymousClass515 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass519 f59302B;

    public AnonymousClass515(AnonymousClass519 anonymousClass519) {
        this.f59302B = anonymousClass519;
    }

    public final void onClick(View view) {
        CharSequence string;
        int M = AnonymousClass0cQ.M(this, -639668187);
        AnonymousClass0IL anonymousClass0IL = this.f59302B;
        if (((Boolean) AnonymousClass0CC.th.H(AnonymousClass0Ce.G(anonymousClass0IL.getArguments()))).booleanValue()) {
            string = anonymousClass0IL.getString(C0164R.string.two_fac_authenticator_app_download_dialog_body_duo);
        } else {
            string = anonymousClass0IL.getString(C0164R.string.two_fac_authenticator_app_download_dialog_body);
        }
        new AnonymousClass0P2(anonymousClass0IL.getContext()).V(C0164R.string.two_fac_authenticator_app_download_dialog_title).L(string).S(C0164R.string.open, new AnonymousClass518(anonymousClass0IL)).N(C0164R.string.cancel, new AnonymousClass517(anonymousClass0IL)).A().show();
        AnonymousClass0cQ.L(this, 1211899816, M);
    }
}
