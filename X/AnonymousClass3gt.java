package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.3gt */
public final class AnonymousClass3gt implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3gv f43330B;

    public AnonymousClass3gt(AnonymousClass3gv anonymousClass3gv) {
        this.f43330B = anonymousClass3gv;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -23171997);
        AnonymousClass3gq.m20437C(this.f43330B.f43333C, this.f43330B.f43339I, this.f43330B.f43338H, this.f43330B.f43340J, AnonymousClass3h3.DISMISS_INTRO);
        this.f43330B.A();
        Activity activity = this.f43330B.getActivity();
        if (!(activity == null || activity.isFinishing())) {
            activity.finish();
        }
        AnonymousClass0cQ.L(this, -1242489092, M);
    }
}
