package X;

import android.graphics.RectF;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.54j */
public final class AnonymousClass54j implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59873B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5ZI f59874C;
    /* renamed from: D */
    public final /* synthetic */ int f59875D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1Oq f59876E;

    public AnonymousClass54j(AnonymousClass1Oq anonymousClass1Oq, AnonymousClass5ZI anonymousClass5ZI, AnonymousClass1LU anonymousClass1LU, int i) {
        this.f59876E = anonymousClass1Oq;
        this.f59874C = anonymousClass5ZI;
        this.f59873B = anonymousClass1LU;
        this.f59875D = i;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1217897213);
        if (AnonymousClass54n.m25667B(this.f59876E)) {
            View view2 = this.f59874C.f66361H;
            RectF rectF = AnonymousClass54n.f59887B;
            AnonymousClass0Nm.M(view2, rectF);
            this.f59873B.xg(this.f59876E, this.f59875D, rectF);
        } else if ("product_display_page".equals(this.f59876E.D())) {
            this.f59873B.su(this.f59876E, this.f59875D);
        } else {
            AnonymousClass0Nm.M(this.f59874C.f66361H, AnonymousClass54n.f59887B);
            this.f59873B.Cr(this.f59876E.N(), this.f59876E, this.f59875D, AnonymousClass54n.f59887B);
        }
        AnonymousClass0cQ.L(this, -1943062887, M);
    }
}
