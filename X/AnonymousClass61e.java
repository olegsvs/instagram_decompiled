package X;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.61e */
public final class AnonymousClass61e implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass61h f71000B;

    public AnonymousClass61e(AnonymousClass61h anonymousClass61h) {
        this.f71000B = anonymousClass61h;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -26790535);
        Bundle bundle = new Bundle();
        bundle.putInt(AnonymousClass61h.f71003G, AnonymousClass0cX.HighQualityMedia.ordinal());
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f71000B.getActivity());
        AnonymousClass0Jl.f2940B.A();
        AnonymousClass0IL anonymousClass61c = new AnonymousClass61c();
        anonymousClass61c.setArguments(bundle);
        anonymousClass0IZ.f2754D = anonymousClass61c;
        anonymousClass0IZ.E(this.f71000B, AnonymousClass61h.f71004H).B();
        AnonymousClass0cQ.L(this, -1714504845, M);
    }
}
