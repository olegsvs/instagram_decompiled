package X;

import com.instagram.reels.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.6El */
public final class AnonymousClass6El implements AnonymousClass5v9 {
    /* renamed from: B */
    public final /* synthetic */ ReelDashboardFragment f73206B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Pj f73207C;

    public AnonymousClass6El(ReelDashboardFragment reelDashboardFragment, AnonymousClass0Pj anonymousClass0Pj) {
        this.f73206B = reelDashboardFragment;
        this.f73207C = anonymousClass0Pj;
    }

    public final void cGA(List list, List list2, int i, String str, AnonymousClass3bZ anonymousClass3bZ) {
        AnonymousClass0Pj anonymousClass0Pj = this.f73207C;
        int i2 = AnonymousClass17C.f14675B[anonymousClass0Pj.f4137I.ordinal()];
        if (i2 == 2) {
            AnonymousClass0P7 anonymousClass0P7 = anonymousClass0Pj.f4134F;
            anonymousClass0P7.bC = list;
            anonymousClass0P7.cC = str;
            anonymousClass0P7.QC = i;
        } else if (i2 == 4) {
            AnonymousClass0Pm anonymousClass0Pm = anonymousClass0Pj.f4131C;
            anonymousClass0Pm.f4169W = list;
            anonymousClass0Pm.f4170X = str;
            anonymousClass0Pm.f4172Z = i;
        }
        AnonymousClass0Pj anonymousClass0Pj2 = this.f73207C;
        anonymousClass0Pj2.f4130B.clear();
        if (list2 != null) {
            anonymousClass0Pj2.f4130B.addAll(list2);
        }
        AnonymousClass5u7 anonymousClass5u7 = this.f73206B.mListAdapter;
        AnonymousClass5u6 anonymousClass5u6 = (AnonymousClass5u6) anonymousClass5u7.f69832D.get(this.f73207C.getId());
        if (anonymousClass5u6 != null) {
            AnonymousClass5uL anonymousClass5uL = anonymousClass5u6.f69801B;
            anonymousClass5uL.f69886H = anonymousClass3bZ;
            AnonymousClass5uL.m28628D(anonymousClass5uL);
        }
        this.f73206B.mListAdapter.m28624C(this.f73207C.getId(), i);
        this.f73206B.mImageViewPager.J(this.f73206B.mImageViewPager.getCurrentOffset());
        this.f73206B.mListViewPager.J(this.f73206B.mListViewPager.getCurrentOffset());
    }
}
