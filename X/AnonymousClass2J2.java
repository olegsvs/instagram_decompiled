package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2J2 */
public final class AnonymousClass2J2 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f28772B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass2J2(Context context) {
        this.f28772B = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 517938389);
        if (view == null) {
            view = AnonymousClass2J1.m14997C(this.f28772B, viewGroup);
        }
        AnonymousClass2J1.m14996B(view, (AnonymousClass2Ie) obj);
        AnonymousClass0cQ.H(this, 435712778, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2Ie anonymousClass2Ie = (AnonymousClass2Ie) obj;
        Void voidR = (Void) obj2;
        anonymousClass0p9.A(0);
    }
}
