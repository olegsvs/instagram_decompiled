package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.320 */
public final class AnonymousClass320 implements AnonymousClass0TB {
    /* renamed from: B */
    private final AnonymousClass327 f37161B;
    /* renamed from: C */
    private final AnonymousClass31x f37162C;

    public final boolean KX(int i, Object obj, Object obj2) {
        return true;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass320(AnonymousClass31x anonymousClass31x, AnonymousClass327 anonymousClass327) {
        this.f37162C = anonymousClass31x;
        this.f37161B = anonymousClass327;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj;
        int I = AnonymousClass0cQ.I(this, -933505880);
        if (view == null) {
            view = AnonymousClass329.m18244C(viewGroup);
        }
        AnonymousClass32A anonymousClass32A = (AnonymousClass32A) obj2;
        AnonymousClass329.m18243B((AnonymousClass328) view.getTag(), (AnonymousClass0Ci) obj3, this.f37162C, anonymousClass32A.f37187B, anonymousClass32A.f37188C, true, this.f37161B);
        AnonymousClass0cQ.H(this, -307916309, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        AnonymousClass32A anonymousClass32A = (AnonymousClass32A) obj2;
        anonymousClass0p9.A(0);
    }
}
