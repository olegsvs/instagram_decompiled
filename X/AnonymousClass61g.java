package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.61g */
public final class AnonymousClass61g implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass61h f71002B;

    public AnonymousClass61g(AnonymousClass61h anonymousClass61h) {
        this.f71002B = anonymousClass61h;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -911873982);
        Bundle bundle = new Bundle();
        bundle.putInt(AnonymousClass61h.f71003G, AnonymousClass0cX.StoriesVideoAutoplay.ordinal());
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f71002B.getActivity());
        AnonymousClass0Jl.f2940B.A();
        AnonymousClass0IL anonymousClass61c = new AnonymousClass61c();
        anonymousClass61c.setArguments(bundle);
        anonymousClass0IZ.f2754D = anonymousClass61c;
        anonymousClass0IZ.E(this.f71002B, AnonymousClass61h.f71004H).B();
        AnonymousClass0cQ.L(this, 1085345500, M);
    }
}
