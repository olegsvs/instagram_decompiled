package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.234 */
public final class AnonymousClass234 extends AnonymousClass0VA {
    /* renamed from: B */
    public final ArrayList f25444B = new ArrayList();

    public final void wh(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass233(this, view));
    }
}
