package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4YI */
public final class AnonymousClass4YI implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Qi f55132B;

    public AnonymousClass4YI(AnonymousClass1Qi anonymousClass1Qi) {
        this.f55132B = anonymousClass1Qi;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1412618891);
        AnonymousClass1Qi anonymousClass1Qi;
        if (this.f55132B.f18424B) {
            anonymousClass1Qi = this.f55132B;
            anonymousClass1Qi.f18436N = anonymousClass1Qi.f18433K;
            this.f55132B.f18435M.setCurrentValue(this.f55132B.f18436N);
        } else {
            anonymousClass1Qi = this.f55132B;
            anonymousClass1Qi.f18427E = anonymousClass1Qi.f18432J;
            this.f55132B.f18435M.setCurrentValue(this.f55132B.f18427E);
        }
        this.f55132B.f18437O.N(1.0d);
        this.f55132B.f18430H.bringToFront();
        this.f55132B.f18429G.setVisibility(0);
        this.f55132B.f18430H.setVisibility(0);
        AnonymousClass0cQ.L(this, 1203231625, M);
    }
}
