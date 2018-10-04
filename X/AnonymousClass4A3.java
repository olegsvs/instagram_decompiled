package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4A3 */
public final class AnonymousClass4A3 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Rt f51024B;

    public AnonymousClass4A3(AnonymousClass5Rt anonymousClass5Rt) {
        this.f51024B = anonymousClass5Rt;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1072294730);
        if (AnonymousClass1Ba.D(this.f51024B.f63543B, "android.permission.READ_EXTERNAL_STORAGE")) {
            AnonymousClass5Rt.B(this.f51024B);
        } else if (this.f51024B.f63559R) {
            AnonymousClass1Ba.F(this.f51024B.f63543B);
        } else {
            AnonymousClass5Rt.C(this.f51024B);
        }
        AnonymousClass0cQ.L(this, -1023058749, M);
    }
}
