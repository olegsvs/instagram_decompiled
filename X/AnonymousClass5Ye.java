package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.5Ye */
public final class AnonymousClass5Ye implements AnonymousClass4nk {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5c9 f66266B;

    public AnonymousClass5Ye(AnonymousClass5c9 anonymousClass5c9) {
        this.f66266B = anonymousClass5c9;
    }

    public final void BDA(AnonymousClass0MI anonymousClass0MI, AnonymousClass10I anonymousClass10I) {
        AnonymousClass0MI anonymousClass0MI2 = anonymousClass0MI;
        List singletonList = Collections.singletonList(anonymousClass0MI);
        AnonymousClass3bR anonymousClass3bR = this.f66266B.f67331E;
        anonymousClass3bR.f42625M = this.f66266B.f67330D;
        AnonymousClass10I anonymousClass10I2 = anonymousClass10I;
        anonymousClass3bR.f42622J = new AnonymousClass41T(anonymousClass10I.kI(), null);
        anonymousClass3bR.B(anonymousClass10I2, anonymousClass0MI2, singletonList, singletonList, singletonList, this.f66266B.f65779D, null, null);
        if (this.f66266B.f67328B != null) {
            AnonymousClass5Yp anonymousClass5Yp = this.f66266B.f67328B;
            String id = anonymousClass0MI.getId();
            AnonymousClass3Sf anonymousClass3Sf = anonymousClass5Yp.f66298B.f59006M;
            anonymousClass3Sf.f41387G = "action";
            anonymousClass3Sf.f41394N = "location_page";
            anonymousClass3Sf.f41382B = "tap_reel";
            anonymousClass3Sf.f41391K = anonymousClass5Yp.f66298B.f59013T;
            anonymousClass3Sf.f41392L = id;
            if (anonymousClass5Yp.f66298B.f59012S != null) {
                anonymousClass5Yp.f66298B.f59006M.f41389I = anonymousClass5Yp.f66298B.f59012S.f6708E;
            }
            anonymousClass5Yp.f66298B.f59006M.A();
        }
    }

    public final void dq(AnonymousClass0MI anonymousClass0MI) {
        AnonymousClass59c anonymousClass59c = new AnonymousClass59c(this.f66266B.f67329C.getContext(), this.f66266B.f67329C.getActivity(), this.f66266B.f67329C.getLoaderManager(), anonymousClass0MI, this.f66266B.f67332F, null, new AnonymousClass5Yd(this));
        if (anonymousClass59c.m25870A()) {
            anonymousClass59c.m25871B();
        }
    }
}
