package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.60H */
public final class AnonymousClass60H implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass60K f70784B;

    public AnonymousClass60H(AnonymousClass60K anonymousClass60K) {
        this.f70784B = anonymousClass60K;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 575973098);
        AnonymousClass60K.m28746B(this.f70784B, true);
        AnonymousClass5zL.m28719C("ig_school_invite_tap_done", this.f70784B.f70792F).R();
        this.f70784B.getActivity().onBackPressed();
        AnonymousClass0cQ.L(this, 112199677, M);
    }
}
