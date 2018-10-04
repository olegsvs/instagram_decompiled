package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.57D */
public final class AnonymousClass57D implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass57K f60283B;

    public AnonymousClass57D(AnonymousClass57K anonymousClass57K) {
        this.f60283B = anonymousClass57K;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -790351176);
        AnonymousClass0Fr.ChooseFacebook.F(AnonymousClass2Na.LOGIN_STEP).E();
        if (AnonymousClass0i7.B().E()) {
            this.f60283B.f60305I.B(AnonymousClass0i7.B().A(), AnonymousClass0i7.B().C(), true);
        } else {
            this.f60283B.f60305I.A(AnonymousClass0mR.LOG_IN);
        }
        AnonymousClass0cQ.L(this, 2043138449, M);
    }
}
