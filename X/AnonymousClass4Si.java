package X;

import android.view.View;
import java.util.Collection;

/* renamed from: X.4Si */
public final class AnonymousClass4Si extends AnonymousClass16a {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5U7 f54308B;

    public AnonymousClass4Si(AnonymousClass5U7 anonymousClass5U7) {
        this.f54308B = anonymousClass5U7;
    }

    public final void Xq(View view) {
        if (this.f54308B.f64741H != null) {
            view = this.f54308B.f64741H.f64386B.f66841H;
            Collection B = view.f7365E.m18284B(view.f7407u, view.f7374N.G(), view.f7374N.E().m19099A(), view.f7374N.D());
            if (B.isEmpty()) {
                AnonymousClass0dF.E(view);
                return;
            }
            AnonymousClass3FR H = AnonymousClass0dF.H(view);
            H.f39482H.clear();
            H.f39482H.addAll(B);
            AnonymousClass0dF.b(view, new AnonymousClass1Tw(view));
        }
    }

    public final boolean yCA(View view) {
        if (this.f54308B.f64741H != null) {
            AnonymousClass0dF.S(this.f54308B.f64741H.f64386B.f66841H, null);
        }
        return true;
    }
}
