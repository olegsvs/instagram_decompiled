package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.56x */
public final class AnonymousClass56x implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass572 f60243B;

    public AnonymousClass56x(AnonymousClass572 anonymousClass572) {
        this.f60243B = anonymousClass572;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1650011285);
        AnonymousClass0Fr.SwitchToLogin.F(AnonymousClass2Na.LANDING_STEP).E();
        AnonymousClass3X4.K(this.f60243B.getFragmentManager(), new AnonymousClass57K(), "android.nux.LoginLandingFragment");
        AnonymousClass0cQ.L(this, -1826610032, M);
    }
}
