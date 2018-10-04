package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4Go */
public final class AnonymousClass4Go implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SP f52234B;

    public AnonymousClass4Go(AnonymousClass5SP anonymousClass5SP) {
        this.f52234B = anonymousClass5SP;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1994054717);
        boolean z = this.f52234B.getArguments().getBoolean("ShouldSkipContactImport", true);
        AnonymousClass0Iz.f2854L.J(this.f52234B.getActivity(), "next");
        this.f52234B.f63865P.m19868C(this.f52234B.getContext(), AnonymousClass0Ik.InviteFacebookFriends, z);
        AnonymousClass0cQ.L(this, 917124310, M);
    }
}
