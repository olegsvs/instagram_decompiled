package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.5CD */
public final class AnonymousClass5CD {
    /* renamed from: B */
    public static int m25959B(Context context, boolean z, double d, int i) {
        int J = AnonymousClass0Nm.J(context);
        if (!z) {
            return (int) AnonymousClass0Nm.C(context, i);
        }
        double d2 = (double) J;
        Double.isNaN(d2);
        return (int) (d2 * d);
    }

    /* renamed from: C */
    public static void m25960C(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
            view.animate().cancel();
            view.setAlpha(1.0f);
            return;
        }
        view.animate().alpha(0.0f).setDuration(200).start();
    }
}
