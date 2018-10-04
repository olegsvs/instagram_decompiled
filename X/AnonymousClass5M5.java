package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.5M5 */
public final class AnonymousClass5M5 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5ai f62500B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass67B f62501C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5aX f62502D;
    /* renamed from: E */
    public final /* synthetic */ View f62503E;

    public AnonymousClass5M5(View view, AnonymousClass5ai anonymousClass5ai, AnonymousClass67B anonymousClass67B, AnonymousClass5aX anonymousClass5aX) {
        this.f62503E = view;
        this.f62500B = anonymousClass5ai;
        this.f62501C = anonymousClass67B;
        this.f62502D = anonymousClass5aX;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1779200038);
        this.f62503E.setOnClickListener(null);
        this.f62500B.f66736B = 0;
        this.f62501C.mo6627M(this.f62500B.pT());
        AnonymousClass5aX anonymousClass5aX = this.f62502D;
        AnonymousClass5ai anonymousClass5ai = this.f62500B;
        ((CircularImageView) anonymousClass5aX.f66634D.A()).setUrl(AnonymousClass2Hj.B("👋"));
        View A = anonymousClass5aX.f66634D.A();
        AnonymousClass14J anonymousClass5M8 = new AnonymousClass5M8(anonymousClass5aX, anonymousClass5ai);
        AnonymousClass14H A2 = AnonymousClass14H.C(A).J().M(0.5f).K(true).A(0.0f, 1.0f);
        A2.f13848N = anonymousClass5M8;
        A2.N();
        AnonymousClass14H A3 = AnonymousClass14H.C(anonymousClass5aX.f66632B.A()).J().M(0.5f).K(true).A(1.0f, 0.0f);
        A3.f13862b = 8;
        A3.N();
        AnonymousClass0cQ.L(this, -158263359, M);
    }
}
