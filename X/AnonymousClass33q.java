package X;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.33q */
public final class AnonymousClass33q implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass33r f37468B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass2Wa f37469C;

    public AnonymousClass33q(AnonymousClass33r anonymousClass33r, AnonymousClass2Wa anonymousClass2Wa) {
        this.f37468B = anonymousClass33r;
        this.f37469C = anonymousClass2Wa;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -422710936);
        AnonymousClass0IL anonymousClass0IL = this.f37468B.f37470B;
        AnonymousClass2Wa anonymousClass2Wa = this.f37469C;
        String C = AnonymousClass35n.m18474C(AnonymousClass35n.m18493V(anonymousClass2Wa), anonymousClass0IL.f51268E.f1759C);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass0IL.getActivity());
        anonymousClass0IZ.f2754D = AnonymousClass0IY.B().X(C);
        anonymousClass0IZ.B();
        AnonymousClass2NW.ADS_MANAGER_FINISH_STEP.m15343A().F("step", "landing_page").F("entry_point", anonymousClass0IL.f51267D).R();
        AnonymousClass0cQ.L(this, -543560928, M);
    }
}
