package X;

import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.59G */
public final class AnonymousClass59G implements AnonymousClass3bM {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0os f60569B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass10H f60570C;

    public AnonymousClass59G(AnonymousClass0os anonymousClass0os, AnonymousClass10H anonymousClass10H) {
        this.f60569B = anonymousClass0os;
        this.f60570C = anonymousClass10H;
    }

    public final void EZ(long j, boolean z) {
        List arrayList = new ArrayList();
        for (String D : this.f60569B.f10418H) {
            AnonymousClass0MI D2 = AnonymousClass0MB.C(r1.f60569B.f10412B.f9066G).D(D);
            if (D2 != null) {
                arrayList.add(D2);
            }
        }
        AnonymousClass0jH anonymousClass0jH = r1.f60569B.f10412B;
        AnonymousClass0MI anonymousClass0MI = r1.f60569B.f10416F;
        Object obj = r1.f60570C;
        RecyclerView recyclerView = r1.f60569B.f10415E;
        AnonymousClass0Qf anonymousClass0Qf = r1.f60569B.f10417G;
        String str = r1.f60569B.f10413C;
        obj.eV();
        RectF iI = obj.iI();
        RectF rM = ((AnonymousClass10M) obj).rM();
        AnonymousClass0lG bQ = anonymousClass0jH.bQ();
        bQ.E(anonymousClass0MI, -1, iI, rM, new AnonymousClass1V8(anonymousClass0jH, arrayList, anonymousClass0Qf, str, j, z, bQ, recyclerView, obj), false, anonymousClass0Qf);
    }
}
