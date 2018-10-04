package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.3A4 */
public final class AnonymousClass3A4 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass45n f38503B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass44c f38504C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass38m f38505D;

    public AnonymousClass3A4(AnonymousClass44c anonymousClass44c, AnonymousClass45n anonymousClass45n, AnonymousClass38m anonymousClass38m) {
        this.f38504C = anonymousClass44c;
        this.f38503B = anonymousClass45n;
        this.f38505D = anonymousClass38m;
    }

    public final void onClick(View view) {
        AnonymousClass3A4 anonymousClass3A4 = this;
        int M = AnonymousClass0cQ.M(this, -1609609996);
        AnonymousClass0PZ anonymousClass0PZ = this.f38504C;
        AnonymousClass397 anonymousClass397 = this.f38503B;
        AnonymousClass38m anonymousClass38m = this.f38505D;
        if ("slideshow".equals(anonymousClass397.f50008B)) {
            Object A = anonymousClass397.m22999A(anonymousClass38m.f38275B);
            AnonymousClass39Y.m18777B(anonymousClass0PZ.f49462N.getActivity(), anonymousClass0PZ.f49475a, A.JI(), anonymousClass397.f50008B, anonymousClass397.sN().f47580B, A.sN().f47580B, anonymousClass0PZ.f49464P, anonymousClass0PZ, anonymousClass0PZ.f49465Q, anonymousClass0PZ.f49457I, anonymousClass0PZ.f49459K, "tap");
        } else {
            AnonymousClass39Y.m18777B(anonymousClass0PZ.f49462N.getActivity(), anonymousClass0PZ.f49475a, anonymousClass397.JI(), anonymousClass397.f50008B, anonymousClass397.sN().f47580B, null, anonymousClass0PZ.f49464P, anonymousClass0PZ, anonymousClass0PZ.f49465Q, anonymousClass0PZ.f49457I, anonymousClass0PZ.f49459K, "tap");
        }
        AnonymousClass0cQ.L(anonymousClass3A4, -896230634, M);
    }
}
