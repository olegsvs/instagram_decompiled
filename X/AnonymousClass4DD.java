package X;

import android.view.View;
import android.view.View.OnClickListener;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.4DD */
public final class AnonymousClass4DD implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4DM f51546B;

    public AnonymousClass4DD(AnonymousClass4DM anonymousClass4DM) {
        this.f51546B = anonymousClass4DM;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 732892074);
        if (this.f51546B.f51561B == null || this.f51546B.f51561B.m18459A()) {
            this.f51546B.getActivity().onBackPressed();
        } else if (this.f51546B.f51563D == null) {
            AnonymousClass1gr.I(this.f51546B.getContext(), (IgFragmentActivity) this.f51546B.getActivity(), null).show();
        } else {
            this.f51546B.JWA(null);
            ((BusinessConversionActivity) this.f51546B.f51563D).a(this.f51546B.f51573N);
            this.f51546B.onBackPressed();
        }
        AnonymousClass0cQ.L(this, 716255881, M);
    }
}
