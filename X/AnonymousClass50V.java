package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.50V */
public final class AnonymousClass50V implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass50d f59255B;

    public AnonymousClass50V(AnonymousClass50d anonymousClass50d) {
        this.f59255B = anonymousClass50d;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1685527556);
        AnonymousClass0IL anonymousClass0IL = this.f59255B;
        AnonymousClass0Fr.RecoverySms.C(AnonymousClass2Na.RECOVERY_PAGE).R();
        AnonymousClass0GA G = AnonymousClass1fi.G(anonymousClass0IL.getContext(), anonymousClass0IL.f59267F, null, true);
        G.f2849B = new AnonymousClass50Z(anonymousClass0IL, anonymousClass0IL);
        anonymousClass0IL.schedule(G);
        AnonymousClass0cQ.L(this, -1545260938, M);
    }
}
