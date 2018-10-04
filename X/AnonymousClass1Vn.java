package X;

import android.support.v7.widget.RecyclerView;
import java.util.List;

/* renamed from: X.1Vn */
public final class AnonymousClass1Vn extends AnonymousClass0wR {
    /* renamed from: B */
    public final AnonymousClass0s9 f19386B;
    /* renamed from: C */
    private final AnonymousClass0nJ f19387C;
    /* renamed from: D */
    private final RecyclerView f19388D;

    public AnonymousClass1Vn(RecyclerView recyclerView, AnonymousClass0nJ anonymousClass0nJ, AnonymousClass0s9 anonymousClass0s9) {
        this.f19388D = recyclerView;
        this.f19387C = anonymousClass0nJ;
        this.f19386B = anonymousClass0s9;
    }

    /* renamed from: B */
    public static AnonymousClass0mW m11700B(AnonymousClass0nJ anonymousClass0nJ, int i) {
        if (anonymousClass0nJ instanceof AnonymousClass0s3) {
            AnonymousClass0mW anonymousClass0mW;
            AnonymousClass0s3 anonymousClass0s3 = (AnonymousClass0s3) anonymousClass0nJ;
            if (i == anonymousClass0s3.f11327E.m7415E()) {
                anonymousClass0mW = null;
            } else {
                anonymousClass0mW = anonymousClass0s3.f11327E.m7412B(AnonymousClass0s3.m8051B(anonymousClass0s3, i));
            }
            return anonymousClass0mW;
        }
        AnonymousClass0mW anonymousClass0mW2 = null;
        if (anonymousClass0nJ instanceof AnonymousClass3Mq) {
            List list = ((AnonymousClass3Mq) anonymousClass0nJ).f40534F.f9634L;
            AnonymousClass3NB anonymousClass3NB = (list == null || i >= list.size()) ? null : (AnonymousClass3NB) list.get(i);
            if (anonymousClass3NB != null && anonymousClass3NB.f40584D == AnonymousClass3NH.f40595F) {
                anonymousClass0mW2 = anonymousClass3NB.A();
            }
        }
        return anonymousClass0mW2;
    }

    public final /* bridge */ /* synthetic */ void Vc(Object obj) {
        AnonymousClass0s9.m8061B(this.f19386B, ((AnonymousClass0mW) obj).getId(), true);
    }

    public final Class WT() {
        return AnonymousClass0mW.class;
    }

    public final /* bridge */ /* synthetic */ void Yc(Object obj, int i) {
        this.f19386B.m8062A((AnonymousClass0mW) obj, i);
    }

    public final void rWA(AnonymousClass0wM anonymousClass0wM, int i) {
        AnonymousClass0mW B = AnonymousClass1Vn.m11700B(this.f19387C, i);
        if (B != null && AnonymousClass0wg.m8435B(this.f19388D, 0.75d) && AnonymousClass0wg.m8435B(this.f19388D.getLayoutManager().mo1888O(i), 0.5d)) {
            anonymousClass0wM.sWA(B.getId(), B, i);
        }
    }
}
