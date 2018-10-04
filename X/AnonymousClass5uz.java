package X;

import com.instagram.reels.fragment.ReelDashboardFragment;

/* renamed from: X.5uz */
public final class AnonymousClass5uz extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ ReelDashboardFragment f69999B;

    public AnonymousClass5uz(ReelDashboardFragment reelDashboardFragment) {
        this.f69999B = reelDashboardFragment;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 2101542295);
        AnonymousClass3nW anonymousClass3nW = (AnonymousClass3nW) obj;
        int I2 = AnonymousClass0cQ.I(this, 474798221);
        for (AnonymousClass0Ci anonymousClass0Ci : anonymousClass3nW.VN()) {
            anonymousClass0Ci.f1722Q = true;
        }
        if (this.f69999B.mListAdapter != null) {
            for (AnonymousClass5u6 anonymousClass5u6 : this.f69999B.mListAdapter.f69832D.values()) {
                AnonymousClass0rF.B(anonymousClass5u6.f69801B, -1672689622);
            }
        }
        AnonymousClass0cQ.H(this, 933389106, I2);
        AnonymousClass0cQ.H(this, -400998527, I);
    }
}
