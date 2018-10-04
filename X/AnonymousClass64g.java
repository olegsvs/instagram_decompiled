package X;

import android.graphics.RectF;
import java.util.ArrayList;

/* renamed from: X.64g */
public final class AnonymousClass64g implements AnonymousClass3bM {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6FR f71521B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass64b f71522C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0MI f71523D;

    public AnonymousClass64g(AnonymousClass6FR anonymousClass6FR, AnonymousClass0MI anonymousClass0MI, AnonymousClass64b anonymousClass64b) {
        this.f71521B = anonymousClass6FR;
        this.f71523D = anonymousClass0MI;
        this.f71522C = anonymousClass64b;
    }

    public final void EZ(long j, boolean z) {
        AnonymousClass0IL anonymousClass0IL = this.f71521B;
        AnonymousClass0MI anonymousClass0MI = this.f71523D;
        AnonymousClass64b anonymousClass64b = this.f71522C;
        RectF L = AnonymousClass0Nm.L(anonymousClass64b.f71508F);
        anonymousClass64b.f71508F.setVisibility(4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(anonymousClass0MI);
        RectF rectF = new RectF(L.centerX(), L.centerY(), L.centerX(), L.centerY());
        AnonymousClass0Jd.f2931B.O(anonymousClass0IL.getActivity(), anonymousClass0IL.f73426E).E(anonymousClass0MI, -1, L, rectF, new AnonymousClass64h(anonymousClass0IL, arrayList, j, z, anonymousClass64b), false, AnonymousClass0Qf.FEATURED_USER);
    }
}
