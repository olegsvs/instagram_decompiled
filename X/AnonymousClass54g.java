package X;

import android.graphics.RectF;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.54g */
public final class AnonymousClass54g implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1LU f59862B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5ZH f59863C;
    /* renamed from: D */
    public final /* synthetic */ int f59864D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass1Oq f59865E;

    public AnonymousClass54g(AnonymousClass5ZH anonymousClass5ZH, AnonymousClass1LU anonymousClass1LU, AnonymousClass1Oq anonymousClass1Oq, int i) {
        this.f59863C = anonymousClass5ZH;
        this.f59862B = anonymousClass1LU;
        this.f59865E = anonymousClass1Oq;
        this.f59864D = i;
    }

    public final void onClick(View view) {
        RectF L;
        int M = AnonymousClass0cQ.M(this, 2116508292);
        if (this.f59863C.f66352H != null) {
            L = AnonymousClass0Nm.L(this.f59863C.f66352H);
        } else if (this.f59863C.f66353I != null) {
            L = AnonymousClass0Nm.L(this.f59863C.f66353I);
        } else {
            L = AnonymousClass0Nm.L(this.f59863C.f66346B);
        }
        this.f59862B.vv(this.f59865E, this.f59864D, L);
        AnonymousClass0cQ.L(this, -454965424, M);
    }
}
