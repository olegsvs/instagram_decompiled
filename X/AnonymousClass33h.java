package X;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.33h */
public final class AnonymousClass33h implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass33j f37458B;

    public AnonymousClass33h(AnonymousClass33j anonymousClass33j) {
        this.f37458B = anonymousClass33j;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -377569541);
        AnonymousClass0IL anonymousClass0IL = this.f37458B.f37460B;
        String H = AnonymousClass35n.m18479H(anonymousClass0IL.f51252B);
        if (H != null) {
            AnonymousClass0IW.T(Uri.parse(AnonymousClass0rE.B(H, anonymousClass0IL.getActivity())), anonymousClass0IL.getActivity());
        } else if (AnonymousClass35n.m18481J(anonymousClass0IL.f51252B) != null) {
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
            anonymousClass0IZ.f2754D = AnonymousClass0Ir.f2848B.A().A(AnonymousClass35n.m18481J(anonymousClass0IL.f51252B), anonymousClass0IL.f51254D, AnonymousClass35n.m18492U(anonymousClass0IL.f51252B), AnonymousClass35n.m18482K(anonymousClass0IL.f51252B));
            anonymousClass0IZ.B();
        }
        AnonymousClass0cQ.L(this, 369200599, M);
    }
}
