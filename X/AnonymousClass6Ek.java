package X;

import com.instagram.reels.fragment.ReelDashboardFragment;
import java.util.List;

/* renamed from: X.6Ek */
public final class AnonymousClass6Ek implements AnonymousClass5v9 {
    /* renamed from: B */
    public final /* synthetic */ ReelDashboardFragment f73204B;
    /* renamed from: C */
    public final /* synthetic */ String f73205C;

    public AnonymousClass6Ek(ReelDashboardFragment reelDashboardFragment, String str) {
        this.f73204B = reelDashboardFragment;
        this.f73205C = str;
    }

    public final void cGA(List list, List list2, int i, String str, AnonymousClass3bZ anonymousClass3bZ) {
        this.f73204B.mListAdapter.m28624C(this.f73205C, i);
        AnonymousClass5u7 anonymousClass5u7 = this.f73204B.mListAdapter;
        AnonymousClass5u6 anonymousClass5u6 = (AnonymousClass5u6) anonymousClass5u7.f69832D.get(this.f73205C);
        if (anonymousClass5u6 != null) {
            AnonymousClass5uL anonymousClass5uL = anonymousClass5u6.f69801B;
            anonymousClass5uL.f69888J.addAll(list);
            AnonymousClass5uL.m28628D(anonymousClass5uL);
            anonymousClass5u6.f69816Q.f62385E = str;
        }
    }
}
