package X;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: X.4nS */
public final class AnonymousClass4nS implements OnScrollListener, AnonymousClass1MZ {
    /* renamed from: B */
    public AnonymousClass4nJ f57338B;
    /* renamed from: C */
    public int f57339C;
    /* renamed from: D */
    public final AnonymousClass4nP f57340D;
    /* renamed from: E */
    public final AnonymousClass0Ie f57341E;
    /* renamed from: F */
    public final AnonymousClass0hj f57342F = new AnonymousClass0hj();
    /* renamed from: G */
    public final AnonymousClass0hr f57343G = new AnonymousClass0hr(new AnonymousClass4nL(this));
    /* renamed from: H */
    public final AnonymousClass0hi f57344H = new AnonymousClass0hi();
    /* renamed from: I */
    public AnonymousClass4nF f57345I;
    /* renamed from: J */
    public AnonymousClass0iW f57346J;
    /* renamed from: K */
    public final AnonymousClass0Cm f57347K;
    /* renamed from: L */
    private AnonymousClass0kd f57348L;
    /* renamed from: M */
    private final AnonymousClass0F8 f57349M = new AnonymousClass4nN(this);
    /* renamed from: N */
    private final AnonymousClass5XB f57350N = new AnonymousClass5XB(this);
    /* renamed from: O */
    private AnonymousClass0iQ f57351O;
    /* renamed from: P */
    private final AnonymousClass0PZ f57352P;
    /* renamed from: Q */
    private final AnonymousClass4nQ f57353Q = new AnonymousClass4nQ(this);
    /* renamed from: R */
    private AnonymousClass0jO f57354R;
    /* renamed from: S */
    private final AnonymousClass0Pa f57355S = new AnonymousClass4nO(this);
    /* renamed from: T */
    private final AnonymousClass0jC f57356T;
    /* renamed from: U */
    private final AnonymousClass4nR f57357U;
    /* renamed from: V */
    private final AnonymousClass0F8 f57358V = new AnonymousClass4nM(this);

    public AnonymousClass4nS(AnonymousClass0Ie anonymousClass0Ie, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0jC anonymousClass0jC, AnonymousClass0iW anonymousClass0iW, boolean z, int i, String str, AnonymousClass4nP anonymousClass4nP, AnonymousClass4nR anonymousClass4nR, AnonymousClass0a4 anonymousClass0a4, AnonymousClass3mP anonymousClass3mP) {
        this.f57341E = anonymousClass0Ie;
        this.f57347K = anonymousClass0Cm;
        this.f57352P = anonymousClass0PZ;
        this.f57356T = anonymousClass0jC;
        this.f57340D = anonymousClass4nP;
        this.f57357U = anonymousClass4nR;
        FragmentActivity activity = this.f57341E.getActivity();
        AnonymousClass5XC anonymousClass5XC = new AnonymousClass5XC(this.f57341E, this.f57347K);
        AnonymousClass0j3 anonymousClass0j3 = new AnonymousClass0j3(this.f57347K, this.f57341E, this.f57352P, activity, AnonymousClass0j1.MAIN_FEED_AYMF, null);
        AnonymousClass0j4 anonymousClass0j4 = new AnonymousClass0j4(activity, new AnonymousClass0j6(this.f57341E.getContext(), this.f57341E.getLoaderManager(), this.f57352P), AnonymousClass0j1.MAIN_FEED_AYMF, this.f57347K, this.f57352P);
        this.f57351O = new AnonymousClass0iQ(this.f57341E, this.f57347K, this.f57352P);
        Context context = this.f57341E.getContext();
        AnonymousClass0IL anonymousClass0IL = this.f57341E;
        AnonymousClass0PZ anonymousClass0PZ2 = this.f57352P;
        AnonymousClass0Ro anonymousClass0Ro = this.f57353Q;
        AnonymousClass0Cm anonymousClass0Cm2 = this.f57347K;
        AnonymousClass0jC anonymousClass0jC2 = this.f57356T;
        AnonymousClass0Pa anonymousClass0Pa = this.f57355S;
        AnonymousClass0iQ anonymousClass0iQ = this.f57351O;
        AnonymousClass0a4 anonymousClass0a42 = anonymousClass0a4;
        AnonymousClass0PZ anonymousClass0PZ3 = anonymousClass0PZ2;
        AnonymousClass0j3 anonymousClass0j32 = anonymousClass0j3;
        AnonymousClass0j4 anonymousClass0j42 = anonymousClass0j4;
        AnonymousClass0Cm anonymousClass0Cm3 = anonymousClass0Cm2;
        AnonymousClass0jC anonymousClass0jC3 = anonymousClass0jC2;
        AnonymousClass0Pa anonymousClass0Pa2 = anonymousClass0Pa;
        AnonymousClass0iQ anonymousClass0iQ2 = anonymousClass0iQ;
        AnonymousClass5XC anonymousClass5XC2 = anonymousClass5XC;
        this.f57338B = new AnonymousClass4nJ(context, anonymousClass0IL, anonymousClass0PZ2, anonymousClass0Ro, anonymousClass0PZ3, anonymousClass5XC2, anonymousClass0j32, anonymousClass0j42, anonymousClass0Cm3, anonymousClass0jC3, anonymousClass0Pa2, anonymousClass0iQ2, anonymousClass0a42, anonymousClass3mP, this.f57357U.DIA());
        this.f57346J = anonymousClass0iW;
        this.f57348L = new AnonymousClass0kd(AnonymousClass0ke.DOWN, 3, this.f57353Q);
        this.f57354R = new AnonymousClass0jO(this.f57341E.getContext(), this.f57352P, this.f57347K);
        this.f57345I = new AnonymousClass4nF(this.f57341E.getContext(), this.f57347K, this.f57341E.getLoaderManager(), this.f57354R, str, z, i, this.f57350N);
    }

    /* renamed from: A */
    public final void m25089A() {
        AnonymousClass0IL anonymousClass0IL = this.f57341E;
        anonymousClass0IL.registerLifecycleListener(new AnonymousClass1et(anonymousClass0IL.getContext(), this.f57347K, new AnonymousClass4nK(this)));
        this.f57344H.A(this.f57346J);
        this.f57344H.A(this.f57348L);
        this.f57341E.registerLifecycleListener(this.f57343G);
        AnonymousClass0IL anonymousClass0IL2 = this.f57341E;
        anonymousClass0IL2.registerLifecycleListener(new AnonymousClass0jR(anonymousClass0IL2, this.f57352P, this.f57347K));
        AnonymousClass0F4.f2058E.A(AnonymousClass0ko.class, this.f57358V).A(AnonymousClass0l0.class, this.f57349M);
    }

    /* renamed from: B */
    public final void m25090B() {
        AnonymousClass3mN.B(this.f57347K).f44305B.clear();
        AnonymousClass0F4.f2058E.D(AnonymousClass0ko.class, this.f57358V).D(AnonymousClass0l0.class, this.f57349M);
    }

    /* renamed from: B */
    public static void m25088B(AnonymousClass4nS anonymousClass4nS) {
        AnonymousClass4nF anonymousClass4nF = anonymousClass4nS.f57345I;
        AnonymousClass0Pt TD = anonymousClass4nS.f57357U.TD();
        AnonymousClass0It.F(TD, anonymousClass4nF.f57305C.f10109E);
        anonymousClass4nF.f57305C.C(TD.H(), new AnonymousClass4nE(anonymousClass4nF));
    }

    /* renamed from: C */
    public final void m25091C() {
        this.f57346J.B(this.f57341E.getListView());
        this.f57342F.D(this.f57351O);
    }

    /* renamed from: D */
    public final void m25092D() {
        this.f57346J.D((float) AnonymousClass0ip.B(this.f57341E.getContext()), new AnonymousClass0lD(this.f57341E.getActivity()), new View[]{AnonymousClass0eT.E(this.f57341E.getActivity()).f7727C});
        AnonymousClass0lG O = AnonymousClass0Jd.f2931B.O(this.f57341E.getActivity(), this.f57347K);
        if (O != null && O.G()) {
            O.B();
        }
        this.f57342F.A(this.f57351O);
    }

    public final void Dr() {
        this.f57338B.cH();
    }

    /* renamed from: E */
    public final void m25093E() {
        this.f57346J.G(this.f57341E.getListView(), this.f57338B, AnonymousClass0ip.B(this.f57341E.getContext()));
        this.f57346J.E();
        this.f57341E.setListAdapter(this.f57338B);
        this.f57341E.getListView().setOnScrollListener(this);
    }

    /* renamed from: F */
    public final void m25094F(OnScrollListener onScrollListener) {
        this.f57344H.A(onScrollListener);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int I = AnonymousClass0cQ.I(this, -63649176);
        if (!this.f57338B.FX()) {
            this.f57344H.onScroll(absListView, i, i2, i3);
        } else if (AnonymousClass0iI.E(absListView)) {
            this.f57338B.Tc();
            this.f57344H.onScroll(absListView, i, i2, i3);
        }
        AnonymousClass0cQ.H(this, -1432429562, I);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int I = AnonymousClass0cQ.I(this, -1510141133);
        this.f57339C = i;
        this.f57344H.onScrollStateChanged(absListView, i);
        if (!this.f57345I.f57306D && absListView.getLastVisiblePosition() == this.f57338B.getCount() - 1) {
            this.f57340D.wy();
        }
        AnonymousClass0cQ.H(this, 327398638, I);
    }
}
