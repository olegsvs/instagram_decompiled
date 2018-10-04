package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4E9 */
public final class AnonymousClass4E9 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Pt f51742B;

    public AnonymousClass4E9(AnonymousClass1Pt anonymousClass1Pt) {
        this.f51742B = anonymousClass1Pt;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1458343892);
        AnonymousClass0db G = AnonymousClass0db.C().G("order", "2");
        AnonymousClass0NN C = AnonymousClass33Z.m18338C("intro", this.f51742B.f18242G, "view_features", AnonymousClass0a2.I(this.f51742B.f18251P));
        if (G != null) {
            C.D("default_values", G);
        }
        C.R();
        this.f51742B.f18253R.F(1, 0.0f);
        AnonymousClass0cQ.L(this, 1147358232, M);
    }
}
