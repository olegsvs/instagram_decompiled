package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3j4 */
public final class AnonymousClass3j4 extends AnonymousClass0TA {
    /* renamed from: B */
    private final Context f43665B;
    /* renamed from: C */
    private final AnonymousClass1ev f43666C;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3j4(Context context, AnonymousClass1ev anonymousClass1ev) {
        this.f43665B = context;
        this.f43666C = anonymousClass1ev;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int I = AnonymousClass0cQ.I(this, -1556844475);
        if (view == null) {
            view = AnonymousClass1Tm.C(LayoutInflater.from(this.f43665B), viewGroup);
        }
        AnonymousClass3j2 anonymousClass3j2 = (AnonymousClass3j2) obj;
        AnonymousClass1Tm.B((AnonymousClass3j6) view.getTag(), anonymousClass3j2.f43663C, anonymousClass3j2.f43662B, ((AnonymousClass3j3) obj2).f43664B, this.f43666C);
        AnonymousClass0cQ.H(this, 1806499309, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass3j2 anonymousClass3j2 = (AnonymousClass3j2) obj;
        AnonymousClass3j3 anonymousClass3j3 = (AnonymousClass3j3) obj2;
        anonymousClass0p9.A(0);
    }
}
