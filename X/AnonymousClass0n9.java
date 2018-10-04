package X;

import com.instagram.igtv.feed.IGTVFeedController;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0n9 */
public final class AnonymousClass0n9 extends AnonymousClass5YM {
    /* renamed from: B */
    public final /* synthetic */ IGTVFeedController f10018B;

    public AnonymousClass0n9(IGTVFeedController iGTVFeedController) {
        this.f10018B = iGTVFeedController;
    }

    /* renamed from: B */
    public final void m7613B() {
        this.f10018B.f5142J = true;
        IGTVFeedController.m4498C(this.f10018B);
    }

    /* renamed from: E */
    public final /* bridge */ /* synthetic */ void m7614E(Object obj) {
        Collection emptyList;
        AnonymousClass11r anonymousClass11r = (AnonymousClass11r) obj;
        IGTVFeedController iGTVFeedController = this.f10018B;
        AnonymousClass0HV.m2008D(iGTVFeedController.f5146N).f2646B.edit().putString("igtv_banner_token", anonymousClass11r.f13452C).apply();
        AnonymousClass0HV.m2008D(iGTVFeedController.f5146N).m2057s(anonymousClass11r.f13454E.f13455B);
        AnonymousClass11t anonymousClass11t = anonymousClass11r.f13451B;
        String A = anonymousClass11t != null ? anonymousClass11t.m8831A() : null;
        if (anonymousClass11r.f13451B == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = anonymousClass11r.f13451B.f13456B;
        }
        List list = anonymousClass11r.f13453D;
        if (AnonymousClass0FZ.m1634B().f2177B.getBoolean("force_igtv_banner", false)) {
            AnonymousClass0HV.m2008D(iGTVFeedController.f5146N).JA(null);
            AnonymousClass0HV.m2008D(iGTVFeedController.f5146N).HA(null);
            AnonymousClass0HV.m2008D(iGTVFeedController.f5146N).LA(null);
            if (!list.isEmpty()) {
                emptyList.clear();
                int i = 0;
                AnonymousClass0n8 anonymousClass0n8 = (AnonymousClass0n8) list.get(0);
                List K = anonymousClass0n8.m7608K();
                while (i < K.size() && i < 3) {
                    AnonymousClass0P7 anonymousClass0P7 = (AnonymousClass0P7) K.get(i);
                    emptyList.add(new AnonymousClass0n7(anonymousClass0n8.f10006B, anonymousClass0P7.getId()));
                    if (A == null) {
                        A = anonymousClass0P7.getId();
                    }
                    i++;
                }
            }
        }
        iGTVFeedController.f5136D.clear();
        iGTVFeedController.f5136D.addAll(emptyList);
        if (A != null) {
            AnonymousClass0HV.m2008D(iGTVFeedController.f5146N).JA(A);
        }
        this.f10018B.f5139G.G(anonymousClass11r.f13453D);
    }
}
