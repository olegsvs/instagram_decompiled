package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.4Dg */
public final class AnonymousClass4Dg implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Dn f51643B;

    public AnonymousClass4Dg(AnonymousClass4Dn anonymousClass4Dn) {
        this.f51643B = anonymousClass4Dn;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1403821306);
        if (AnonymousClass4Dn.m23590D(this.f51643B) || this.f51643B.f51661B) {
            this.f51643B.getActivity().onBackPressed();
        } else {
            AnonymousClass1gr.I(this.f51643B.getContext(), (IgFragmentActivity) this.f51643B.getActivity(), null).show();
        }
        AnonymousClass0cQ.L(this, -1322564638, M);
    }
}
