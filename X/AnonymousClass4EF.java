package X;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: X.4EF */
public final class AnonymousClass4EF implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1Re f51749B;

    public AnonymousClass4EF(AnonymousClass1Re anonymousClass1Re) {
        this.f51749B = anonymousClass1Re;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1429324548);
        AnonymousClass3Po.m19559C().m19563C(AnonymousClass3Pm.CONSENT_ACTION, AnonymousClass3Pq.LOGOUT, this.f51749B, AnonymousClass3Pp.UNDERAGE);
        Context context = this.f51749B.getContext();
        AnonymousClass0Cm anonymousClass0Cm = this.f51749B.f18615C;
        new AnonymousClass4EG(context, anonymousClass0Cm, this.f51749B.getFragmentManager(), false, AnonymousClass0dp.B().G(anonymousClass0Cm.f1759C), AnonymousClass0S2.UNDERAGE).B(new Void[0]);
        this.f51749B.getActivity().finish();
        AnonymousClass0cQ.L(this, -2057408214, M);
    }
}
