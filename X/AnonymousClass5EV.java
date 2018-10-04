package X;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.5EV */
public final class AnonymousClass5EV implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5EX f61483B;

    public AnonymousClass5EV(AnonymousClass5EX anonymousClass5EX) {
        this.f61483B = anonymousClass5EX;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 11166681);
        Activity activity = (Activity) this.f61483B.f61486B;
        if (activity.getParent() != null) {
            activity = activity.getParent();
        }
        AnonymousClass1Ba.H(activity, new AnonymousClass5EU(this, AnonymousClass1Ba.I(activity, "android.permission.ACCESS_FINE_LOCATION"), activity), new String[]{"android.permission.ACCESS_FINE_LOCATION"});
        AnonymousClass0cQ.L(this, 558689616, M);
    }
}
