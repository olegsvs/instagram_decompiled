package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Xx */
public final class AnonymousClass3Xx extends AnonymousClass0VA {
    /* renamed from: B */
    public AnonymousClass3Xw f42135B;
    /* renamed from: C */
    public final AnonymousClass3Xv f42136C;
    /* renamed from: D */
    public final View f42137D;
    /* renamed from: E */
    public final AnonymousClass3WQ f42138E;
    /* renamed from: F */
    public final View f42139F;
    /* renamed from: G */
    public final AnonymousClass3XU f42140G;
    /* renamed from: H */
    public final ViewGroup f42141H;
    /* renamed from: I */
    private AnonymousClass0Oh f42142I;
    /* renamed from: J */
    private final AnonymousClass3WG f42143J;
    /* renamed from: K */
    private final AnonymousClass3WG f42144K;

    public AnonymousClass3Xx(ViewGroup viewGroup, AnonymousClass3WG anonymousClass3WG, AnonymousClass3WG anonymousClass3WG2, AnonymousClass3WQ anonymousClass3WQ, AnonymousClass3XU anonymousClass3XU, View view, View view2, AnonymousClass3Xw anonymousClass3Xw, AnonymousClass3Xv anonymousClass3Xv) {
        this.f42141H = viewGroup;
        this.f42143J = anonymousClass3WG;
        this.f42144K = anonymousClass3WG2;
        this.f42138E = anonymousClass3WQ;
        this.f42140G = anonymousClass3XU;
        this.f42137D = view;
        this.f42139F = view2;
        this.f42135B = anonymousClass3Xw;
        this.f42136C = anonymousClass3Xv;
    }

    /* renamed from: A */
    public final void m19912A() {
        boolean z = true;
        this.f42137D.setEnabled(this.f42135B != AnonymousClass3Xw.Email);
        View view = this.f42139F;
        if (this.f42135B == AnonymousClass3Xw.Phone) {
            z = false;
        }
        view.setEnabled(z);
    }

    /* renamed from: B */
    public static void m19911B(AnonymousClass3Xx anonymousClass3Xx) {
        AnonymousClass0Fr.RegScreenLoaded.G(anonymousClass3Xx.f42136C.IS(), anonymousClass3Xx.f42142I).m15364E();
        anonymousClass3Xx.f42141H.setLayoutTransition(null);
        anonymousClass3Xx.f42141H.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3Xu(anonymousClass3Xx));
        boolean z = true;
        anonymousClass3Xx.f42143J.m19801A(anonymousClass3Xx.f42135B == AnonymousClass3Xw.Email);
        AnonymousClass3WG anonymousClass3WG = anonymousClass3Xx.f42144K;
        if (anonymousClass3Xx.f42135B != AnonymousClass3Xw.Phone) {
            z = false;
        }
        anonymousClass3WG.m19801A(z);
        switch (anonymousClass3Xx.f42135B.ordinal()) {
            case 0:
                anonymousClass3Xx.f42140G.m19884E();
                break;
            case 1:
                anonymousClass3Xx.f42138E.m19806C();
                break;
            default:
                break;
        }
        anonymousClass3Xx.f42136C.Kd();
        anonymousClass3Xx.f42136C.Ld(anonymousClass3Xx);
    }

    /* renamed from: B */
    public final boolean m19913B() {
        return this.f42135B == AnonymousClass3Xw.Phone;
    }

    /* renamed from: C */
    public final void m19914C(AnonymousClass3Xw anonymousClass3Xw) {
        switch (anonymousClass3Xw.ordinal()) {
            case 0:
                this.f42142I = AnonymousClass0Oh.PHONE;
                AnonymousClass0Fr.SwitchToPhone.G(this.f42136C.IS(), this.f42142I).m15364E();
                break;
            case 1:
                this.f42142I = AnonymousClass0Oh.EMAIL;
                AnonymousClass0Fr.SwitchToEmail.G(this.f42136C.IS(), this.f42142I).m15364E();
                break;
            default:
                break;
        }
        this.f42135B = anonymousClass3Xw;
        AnonymousClass3Xx.m19911B(this);
    }

    public final void St() {
        AnonymousClass3XU anonymousClass3XU = this.f42140G;
        AnonymousClass1Ee anonymousClass1Ee = anonymousClass3XU.f42062C;
        if (anonymousClass1Ee != null) {
            anonymousClass1Ee.A();
        }
        AnonymousClass0Nm.N(anonymousClass3XU.f42066G);
        AnonymousClass3WQ anonymousClass3WQ = this.f42138E;
        anonymousClass3WQ.f41889C.removeTextChangedListener(anonymousClass3WQ.f41893G);
        AnonymousClass0Nm.N(anonymousClass3WQ.f41889C);
    }

    public final void gi() {
        super.gi();
        this.f42140G.f42067H = null;
    }

    public final void gx() {
        switch (this.f42135B.ordinal()) {
            case 0:
                AnonymousClass3X4.m19850O(this.f42140G.f42066G);
                return;
            case 1:
                AnonymousClass3X4.m19850O(this.f42138E.f41889C);
                return;
            default:
                return;
        }
    }

    public final void wh(View view) {
        this.f42137D.setOnClickListener(new AnonymousClass3Xs(this));
        this.f42139F.setOnClickListener(new AnonymousClass3Xt(this));
        AnonymousClass3WQ anonymousClass3WQ = this.f42138E;
        anonymousClass3WQ.f41888B.setVisibility(anonymousClass3WQ.f41889C.getText().length() > 0 ? 0 : 8);
        anonymousClass3WQ.f41888B.setOnClickListener(new AnonymousClass3WO(anonymousClass3WQ));
        anonymousClass3WQ.f41889C.addTextChangedListener(anonymousClass3WQ.f41893G);
        AnonymousClass3XU anonymousClass3XU = this.f42140G;
        anonymousClass3XU.f42067H.m20068B();
        anonymousClass3XU.f42061B.setVisibility(AnonymousClass0Nm.P(anonymousClass3XU.f42066G) ? 4 : 0);
        anonymousClass3XU.f42061B.setOnClickListener(new AnonymousClass3XS(anonymousClass3XU));
        anonymousClass3XU.f42063D.setOnClickListener(new AnonymousClass3XT(anonymousClass3XU));
        anonymousClass3XU.f42066G.addTextChangedListener(anonymousClass3XU.f42069J);
        AnonymousClass3Xx.m19911B(this);
    }
}
