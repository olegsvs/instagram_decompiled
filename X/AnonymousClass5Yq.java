package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Yq */
public final class AnonymousClass5Yq implements AnonymousClass4n1 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4yc f66299B;

    public AnonymousClass5Yq(AnonymousClass4yc anonymousClass4yc) {
        this.f66299B = anonymousClass4yc;
    }

    public final void nCA(AnonymousClass3J2 anonymousClass3J2) {
        this.f66299B.f58998E = anonymousClass3J2;
        this.f66299B.f59005L.m27558F(this.f66299B.f58998E);
        AnonymousClass4yO A = this.f66299B.f59003J.m25495A(this.f66299B.f58998E);
        int i = 0;
        if (A == null) {
            this.f66299B.f59003J.m25498D(this.f66299B.f58998E, false, false);
        }
        AnonymousClass5Yh anonymousClass5Yh = this.f66299B.f59005L;
        AnonymousClass0LH.H(AnonymousClass0Sy.E());
        anonymousClass5Yh.f66271D = A;
        AnonymousClass5Yh.m27557B(anonymousClass5Yh);
        List arrayList = new ArrayList();
        AnonymousClass3J2[] anonymousClass3J2Arr = AnonymousClass4yc.f58994e;
        int length = anonymousClass3J2Arr.length;
        while (i < length) {
            arrayList.add(anonymousClass3J2Arr[i].toString());
            i++;
        }
        AnonymousClass0db G = AnonymousClass0db.C().G("tab", this.f66299B.f58998E.toString());
        AnonymousClass3Sf anonymousClass3Sf = this.f66299B.f59006M;
        anonymousClass3Sf.f41387G = "action";
        anonymousClass3Sf.f41394N = "location_page";
        anonymousClass3Sf.f41382B = "tap_tab";
        anonymousClass3Sf.f41384D = "location_tab";
        anonymousClass3Sf.f41383C = arrayList;
        anonymousClass3Sf.f41391K = this.f66299B.f59013T;
        anonymousClass3Sf.f41393M = G;
        if (this.f66299B.f59012S != null) {
            this.f66299B.f59006M.f41389I = this.f66299B.f59012S.f6708E;
        }
        this.f66299B.f59006M.A();
    }
}
