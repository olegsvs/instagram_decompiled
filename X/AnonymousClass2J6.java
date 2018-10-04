package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2J6 */
public final class AnonymousClass2J6 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f28777B;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass2J6(Context context) {
        this.f28777B = context;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, 1231071984);
        if (view == null) {
            view = AnonymousClass2J5.m15000C(this.f28777B, viewGroup);
        }
        AnonymousClass2J3 anonymousClass2J3 = (AnonymousClass2J3) obj2;
        AnonymousClass2J5.m14999B(view, (AnonymousClass2If) obj, anonymousClass2J3.f28774C, anonymousClass2J3.f28773B);
        AnonymousClass0cQ.H(this, -1790939624, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass2If anonymousClass2If = (AnonymousClass2If) obj;
        AnonymousClass2J3 anonymousClass2J3 = (AnonymousClass2J3) obj2;
        anonymousClass0p9.A(0);
    }
}
