package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.0yp */
public final class AnonymousClass0yp implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0pS f12897B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0MI f12898C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0pl f12899D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass0P7 f12900E;
    /* renamed from: F */
    public final /* synthetic */ AnonymousClass0m3 f12901F;
    /* renamed from: G */
    public final /* synthetic */ int f12902G;

    public AnonymousClass0yp(AnonymousClass0pS anonymousClass0pS, AnonymousClass0MI anonymousClass0MI, AnonymousClass0m3 anonymousClass0m3, AnonymousClass0pl anonymousClass0pl, AnonymousClass0P7 anonymousClass0P7, int i) {
        this.f12897B = anonymousClass0pS;
        this.f12898C = anonymousClass0MI;
        this.f12901F = anonymousClass0m3;
        this.f12899D = anonymousClass0pl;
        this.f12900E = anonymousClass0P7;
        this.f12902G = i;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.m5863M(this, 291964313);
        if (this.f12898C == null || this.f12897B.f10617E) {
            this.f12897B.f10615C.Qg(this.f12900E, this.f12901F, this.f12902G);
        } else if (AnonymousClass19v.m9708B(this.f12897B.f10620H, AnonymousClass19u.STORY)) {
            AnonymousClass0HV D = AnonymousClass0HV.m2008D(this.f12897B.f10620H);
            int e = D.m2043e();
            AnonymousClass0gb ET = AnonymousClass0gV.m6626B(this.f12897B.f10620H).ET();
            AnonymousClass19x.m9709B(this.f12897B.f10614B, this.f12899D.f10730U.getUrl(), Boolean.valueOf(false), new AnonymousClass19w(this, D, e), AnonymousClass19u.STORY, ET);
        } else {
            this.f12897B.f10615C.Rg(this.f12898C, this.f12901F.f9715x, this.f12899D);
        }
        AnonymousClass0cQ.m5862L(this, 1638177871, M);
    }
}
