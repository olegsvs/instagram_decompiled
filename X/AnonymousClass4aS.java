package X;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4aS */
public final class AnonymousClass4aS implements OnClickListener {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5Uw f55505B;
    /* renamed from: C */
    public final /* synthetic */ Context f55506C;

    public AnonymousClass4aS(AnonymousClass5Uw anonymousClass5Uw, Context context) {
        this.f55505B = anonymousClass5Uw;
        this.f55506C = context;
    }

    public final void onClick(View view) {
        int M = AnonymousClass0cQ.M(this, -1777676233);
        Collection arrayList = new ArrayList(this.f55505B.f65106D);
        Context context = this.f55506C;
        AnonymousClass0Cm anonymousClass0Cm = this.f55505B.f65109G;
        AnonymousClass0EE anonymousClass0EE = this.f55505B;
        AnonymousClass4lo.B(context, anonymousClass0Cm, arrayList, anonymousClass0EE, anonymousClass0EE.A().getCount(), 2, new AnonymousClass4aZ(this.f55505B, arrayList, AnonymousClass1TE.APPROVE));
        AnonymousClass0cQ.L(this, 1142873902, M);
    }
}
