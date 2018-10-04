package X;

import com.instagram.nux.fragment.OneTapLoginLandingFragment;

/* renamed from: X.57r */
public final class AnonymousClass57r extends AnonymousClass40r {
    public AnonymousClass57r(OneTapLoginLandingFragment oneTapLoginLandingFragment, AnonymousClass0IL anonymousClass0IL, AnonymousClass2Ds anonymousClass2Ds, AnonymousClass2Na anonymousClass2Na, String str, String str2, AnonymousClass0EE anonymousClass0EE) {
        super(anonymousClass0IL, anonymousClass2Ds, anonymousClass2Na, str, str2, anonymousClass0EE);
    }

    /* renamed from: C */
    public final void m25801C(AnonymousClass2aG anonymousClass2aG) {
        int I = AnonymousClass0cQ.I(this, 340978688);
        super.C(anonymousClass2aG);
        AnonymousClass57s.m25802B("one_tap_login_success");
        AnonymousClass0dy.B().f7558B.I(AnonymousClass57s.f60381B);
        AnonymousClass0cQ.H(this, -920140127, I);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -211395785);
        super.onFail(anonymousClass0Q6);
        if (AnonymousClass1Qv.B(anonymousClass0Q6)) {
            AnonymousClass57s.m25802B("one_tap_login_2fac_failed");
        } else {
            AnonymousClass57s.m25802B("one_tap_login_failed");
        }
        AnonymousClass0cQ.H(this, -1395795421, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -263443833);
        m25801C((AnonymousClass2aG) obj);
        AnonymousClass0cQ.H(this, -1026875719, I);
    }
}
