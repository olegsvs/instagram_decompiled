package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.5tz */
public final class AnonymousClass5tz implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5u7 f69788B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Pj f69789C;
    /* renamed from: D */
    public final /* synthetic */ int f69790D;

    public AnonymousClass5tz(AnonymousClass5u7 anonymousClass5u7, AnonymousClass0Pj anonymousClass0Pj, int i) {
        this.f69788B = anonymousClass5u7;
        this.f69789C = anonymousClass0Pj;
        this.f69790D = i;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 129602348);
        AnonymousClass0IL anonymousClass0IL = this.f69788B.f69830B;
        AnonymousClass0Pj anonymousClass0Pj = this.f69789C;
        int i = this.f69790D;
        AnonymousClass0GK.E(anonymousClass0IL.getContext(), anonymousClass0IL.f74056O).E(anonymousClass0Pj.f4135G, AnonymousClass0iY.C(anonymousClass0IL.getContext()));
        float f = (float) i;
        anonymousClass0IL.mListViewPager.J(f);
        anonymousClass0IL.mImageViewPager.J(f);
        AnonymousClass0cQ.L(this, 165189660, M);
    }
}
