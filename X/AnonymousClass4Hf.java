package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4Hf */
public final class AnonymousClass4Hf implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5ST f52367B;

    public AnonymousClass4Hf(AnonymousClass5ST anonymousClass5ST) {
        this.f52367B = anonymousClass5ST;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 728859728);
        this.f52367B.f63940r.m18920G();
        AnonymousClass2NY.m15348B().f29707D = true;
        AnonymousClass0IL anonymousClass0IL = this.f52367B.f52317B;
        if (anonymousClass0IL.f64004C == null) {
            anonymousClass0IL.f64004C = new AnonymousClass0uR(anonymousClass0IL);
        }
        anonymousClass0IL.f64004C.A(anonymousClass0IL.getContext(), "ig_gallery_upsell");
        AnonymousClass0cQ.L(this, 920001028, M);
    }
}
