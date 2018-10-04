package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.45q */
public final class AnonymousClass45q extends AnonymousClass44w {
    /* renamed from: B */
    private final AnonymousClass1fo f50125B;
    /* renamed from: C */
    private final String f50126C;
    /* renamed from: D */
    private final AnonymousClass0Cm f50127D;

    public AnonymousClass45q(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0EE anonymousClass0EE, AnonymousClass1fo anonymousClass1fo, String str, AnonymousClass3mP anonymousClass3mP, Map map) {
        super(anonymousClass0EE, str, "user", anonymousClass3mP.m20631A(), map);
        this.f50127D = anonymousClass0Cm;
        this.f50126C = str;
        this.f50125B = anonymousClass1fo;
    }

    /* renamed from: B */
    public final void mo5440B(int i, AnonymousClass0Ci anonymousClass0Ci) {
        super.mo5440B(i, anonymousClass0Ci);
        this.f50125B.OFA(anonymousClass0Ci, i);
    }

    /* renamed from: C */
    public final void mo5441C(int i, AnonymousClass0Ci anonymousClass0Ci) {
        super.mo5441C(i, anonymousClass0Ci);
        AnonymousClass0Ix.D(AnonymousClass0ma.C(this.f50127D, this.f50126C, anonymousClass0Ci.getId()));
    }

    /* renamed from: D */
    public final void mo5442D() {
        super.mo5442D();
        AnonymousClass1fo anonymousClass1fo = this.f50125B;
        anonymousClass1fo.f21253C.K(AnonymousClass3P8.Closed);
        AnonymousClass0rF.B(anonymousClass1fo.f21253C, -867982684);
    }

    /* renamed from: G */
    public final void mo5443G() {
        super.mo5443G();
        AnonymousClass1fo anonymousClass1fo = this.f50125B;
        String str = this.f50126C;
        Bundle bundle = new Bundle();
        bundle.putString(AnonymousClass3mT.f44326L, str);
        String str2 = AnonymousClass3mT.f44325K;
        AnonymousClass0Ci pT = anonymousClass1fo.f21253C.pT();
        List arrayList = new ArrayList();
        for (AnonymousClass0Ci pT2 : pT2.f1735d) {
            arrayList.add(pT2.getId());
        }
        bundle.putStringArrayList(str2, (ArrayList) arrayList);
        AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(anonymousClass1fo.f21252B);
        anonymousClass0IZ.f2754D = AnonymousClass0IY.B().i(bundle);
        anonymousClass0IZ.B();
    }
}
