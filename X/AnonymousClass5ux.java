package X;

import com.instagram.reels.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ux */
public final class AnonymousClass5ux extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ ReelDashboardFragment f69995B;
    /* renamed from: C */
    public final /* synthetic */ String f69996C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5v9 f69997D;

    public AnonymousClass5ux(ReelDashboardFragment reelDashboardFragment, String str, AnonymousClass5v9 anonymousClass5v9) {
        this.f69995B = reelDashboardFragment;
        this.f69996C = str;
        this.f69997D = anonymousClass5v9;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -663898069);
        super.onFail(anonymousClass0Q6);
        AnonymousClass0cQ.H(this, -999363083, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 1265176090);
        if (this.f69995B.mListAdapter != null) {
            this.f69995B.mListAdapter.m28623B(this.f69996C, false);
        }
        AnonymousClass0cQ.H(this, 170821354, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1016242348);
        if (this.f69995B.mListAdapter != null) {
            this.f69995B.mListAdapter.m28623B(this.f69996C, true);
        }
        AnonymousClass0cQ.H(this, -1508953886, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2 = obj;
        AnonymousClass5ux anonymousClass5ux = this;
        int I = AnonymousClass0cQ.I(this, -1678214760);
        AnonymousClass3b0 anonymousClass3b0 = (AnonymousClass3b0) obj2;
        int I2 = AnonymousClass0cQ.I(this, 1772449958);
        super.onSuccess(anonymousClass3b0);
        AnonymousClass5v9 anonymousClass5v9 = this.f69997D;
        List list = anonymousClass3b0.f42576G;
        AnonymousClass0MB C = AnonymousClass0MB.C(this.f69995B.f74056O);
        List arrayList = new ArrayList();
        List<AnonymousClass3av> list2 = anonymousClass3b0.f42571B;
        if (list2 != null) {
            for (AnonymousClass3av anonymousClass3av : list2) {
                arrayList.add(new AnonymousClass1cM(C.J(anonymousClass3av.f42568C, false), anonymousClass3av.f42569D, anonymousClass3av.f42567B));
            }
        }
        anonymousClass5v9.cGA(list, arrayList, anonymousClass3b0.f42577H, anonymousClass3b0.f42573D, anonymousClass3b0.f42574E);
        AnonymousClass0cQ.H(anonymousClass5ux, -772846396, I2);
        AnonymousClass0cQ.H(anonymousClass5ux, -535500464, I);
    }
}
