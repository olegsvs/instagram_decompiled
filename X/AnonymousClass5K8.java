package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.5K8 */
public final class AnonymousClass5K8 implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1bK f62241B;
    /* renamed from: C */
    public final /* synthetic */ int f62242C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ci f62243D;

    public AnonymousClass5K8(AnonymousClass1bK anonymousClass1bK, int i, AnonymousClass0Ci anonymousClass0Ci) {
        this.f62241B = anonymousClass1bK;
        this.f62242C = i;
        this.f62243D = anonymousClass0Ci;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -453509136);
        AnonymousClass1bK anonymousClass1bK = this.f62241B;
        int i = this.f62242C;
        AnonymousClass0Ci anonymousClass0Ci = this.f62243D;
        AnonymousClass5K7.USER_TAP.m26255A(anonymousClass1bK, i, anonymousClass0Ci.getId());
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass1bK.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jj.f2938B.B().D(AnonymousClass0bx.C(anonymousClass1bK.f20432H, anonymousClass0Ci.getId(), "feed_follow_request_row").A());
        anonymousClass0IZ.B();
        AnonymousClass0cQ.L(this, -422974964, M);
    }
}
