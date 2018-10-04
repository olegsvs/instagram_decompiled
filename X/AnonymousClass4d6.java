package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4d6 */
public final class AnonymousClass4d6 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4d8 f55809B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5VW f55810C;

    public AnonymousClass4d6(AnonymousClass4d8 anonymousClass4d8, AnonymousClass5VW anonymousClass5VW) {
        this.f55809B = anonymousClass4d8;
        this.f55810C = anonymousClass5VW;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 112589760);
        AnonymousClass5VW anonymousClass5VW = this.f55810C;
        View view2 = this.f55809B.f55814B;
        if (anonymousClass5VW.f65333B.f65377j == null) {
            AnonymousClass0Gn.H("thread_summary_non_null_to_null", "Thread summary went from nonnull to null");
        } else {
            AnonymousClass0W7 L;
            if (anonymousClass5VW.f65333B.f65377j.L() != null) {
                L = anonymousClass5VW.f65333B.f65377j.L();
            } else {
                L = anonymousClass5VW.f65333B.f65377j.K();
            }
            if (L != null) {
                AnonymousClass5VY anonymousClass5VY = anonymousClass5VW.f65333B;
                AnonymousClass5VY.M(anonymousClass5VY, 2, anonymousClass5VY.f65377j.F(), L, L.Z(anonymousClass5VW.f65333B.f65382o.B()) ^ 1, false, "launch_surface_thread_header", AnonymousClass0Nm.L(view2), new AnonymousClass5VV(anonymousClass5VW, view2));
            }
        }
        AnonymousClass0cQ.L(this, 448522491, M);
    }
}
