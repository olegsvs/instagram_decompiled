package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3n1 */
public final class AnonymousClass3n1 extends AnonymousClass0TA {
    /* renamed from: B */
    public boolean f44490B;
    /* renamed from: C */
    private final Context f44491C;
    /* renamed from: D */
    private final AnonymousClass0Ij f44492D;
    /* renamed from: E */
    private final boolean f44493E;
    /* renamed from: F */
    private final boolean f44494F;
    /* renamed from: G */
    private final boolean f44495G;
    /* renamed from: H */
    private final AnonymousClass0Cm f44496H;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass3n1(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Ij anonymousClass0Ij, boolean z, boolean z2, boolean z3) {
        this.f44491C = context;
        this.f44496H = anonymousClass0Cm;
        this.f44492D = anonymousClass0Ij;
        this.f44493E = z;
        this.f44495G = z2;
        this.f44494F = z3;
    }

    public final View LU(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        int I = AnonymousClass0cQ.I(this, -117229750);
        if (view == null) {
            view = AnonymousClass3nG.m20654C(this.f44491C, viewGroup);
        }
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj4;
        AnonymousClass3nG.m20653B((AnonymousClass3nF) view.getTag(), this.f44496H, anonymousClass0Ci, (Integer) obj3, this.f44490B ? AnonymousClass0Jd.f2931B.R(this.f44496H, anonymousClass0Ci, anonymousClass0Ci.fB) : null, this.f44493E, this.f44495G, false, false, this.f44494F, this.f44492D);
        AnonymousClass0cQ.H(this, 1350736898, I);
        return view;
    }

    public final void UD(AnonymousClass0p9 anonymousClass0p9, Object obj, Object obj2) {
        AnonymousClass0Ci anonymousClass0Ci = (AnonymousClass0Ci) obj;
        Integer num = (Integer) obj2;
        anonymousClass0p9.A(0);
    }
}
