package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C0164R;

/* renamed from: X.50z */
public final class AnonymousClass50z implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass514 f59296B;

    public AnonymousClass50z(AnonymousClass514 anonymousClass514) {
        this.f59296B = anonymousClass514;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1531380056);
        AnonymousClass0IL anonymousClass0IL = this.f59296B;
        boolean H = AnonymousClass0EF.H(anonymousClass0IL.getContext().getPackageManager(), "com.duosecurity.duomobile");
        boolean H2 = AnonymousClass0EF.H(anonymousClass0IL.getContext().getPackageManager(), "com.google.android.apps.authenticator2");
        if (!H) {
            if (!H2) {
                new AnonymousClass0P2(anonymousClass0IL.getContext()).V(C0164R.string.two_fac_app_not_detect_dialog_title).K(C0164R.string.two_fac_app_not_detect_dialog_body).S(C0164R.string.two_fac_app_not_detect_dialog_primary_button, new AnonymousClass513(anonymousClass0IL)).B(C0164R.string.two_fac_app_not_detect_dialog_secondary_button, new AnonymousClass512(anonymousClass0IL)).N(C0164R.string.cancel, new AnonymousClass511(anonymousClass0IL)).A().show();
                AnonymousClass0cQ.L(this, -319701592, M);
            }
        }
        AnonymousClass514.m25596C(anonymousClass0IL);
        AnonymousClass0cQ.L(this, -319701592, M);
    }
}
