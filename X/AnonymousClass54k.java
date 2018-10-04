package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.54k */
public final class AnonymousClass54k implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59877B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5ZI f59878C;
    /* renamed from: D */
    public final /* synthetic */ int f59879D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1Oq f59880E;

    public AnonymousClass54k(AnonymousClass5ZI anonymousClass5ZI, AnonymousClass1Oq anonymousClass1Oq, AnonymousClass1LU anonymousClass1LU, int i) {
        this.f59878C = anonymousClass5ZI;
        this.f59880E = anonymousClass1Oq;
        this.f59877B = anonymousClass1LU;
        this.f59879D = i;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1647754008);
        this.f59878C.f66360G.setSelected(this.f59880E.Y() ^ 1);
        this.f59877B.Yp(this.f59880E, this.f59879D);
        AnonymousClass1Oq anonymousClass1Oq = this.f59880E;
        anonymousClass1Oq.d(anonymousClass1Oq.Y() ^ 1);
        AnonymousClass0cQ.L(this, -313540194, M);
    }
}
