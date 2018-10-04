package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.62S */
public final class AnonymousClass62S implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Ci f71165B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass6Ha f71166C;

    public AnonymousClass62S(AnonymousClass6Ha anonymousClass6Ha, AnonymousClass0Ci anonymousClass0Ci) {
        this.f71166C = anonymousClass6Ha;
        this.f71165B = anonymousClass0Ci;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, 1498452949);
        AnonymousClass6Ha anonymousClass6Ha = this.f71166C;
        AnonymousClass0Ci anonymousClass0Ci = this.f71165B;
        if (anonymousClass6Ha.f74117C.f73357J != null) {
            AnonymousClass62l anonymousClass62l = anonymousClass6Ha.f74117C.f73353F;
            AnonymousClass0PZ anonymousClass0PZ = anonymousClass6Ha.f74117C;
            AnonymousClass62l.m28820D(anonymousClass62l, AnonymousClass62l.m28818B(anonymousClass62l, "tap_view_shop", anonymousClass0PZ, anonymousClass0PZ.f73357J), anonymousClass0PZ);
        }
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass6Ha.f74117C.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0Jn.f2942B.A().B(anonymousClass0Ci.uT(), anonymousClass0Ci.DQ(), anonymousClass0Ci.getId());
        anonymousClass0IZ.B();
        AnonymousClass0cQ.L(this, 1814269628, M);
    }
}
