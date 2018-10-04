package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.50F */
public final class AnonymousClass50F implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass50K f59220B;

    public AnonymousClass50F(AnonymousClass50K anonymousClass50K) {
        this.f59220B = anonymousClass50K;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -237454414);
        View currentFocus = this.f59220B.getActivity().getCurrentFocus();
        if (currentFocus != null) {
            AnonymousClass0Nm.N(currentFocus);
        }
        AnonymousClass3X4.G(this.f59220B.getFragmentManager());
        AnonymousClass0cQ.L(this, -1733227971, M);
    }
}
