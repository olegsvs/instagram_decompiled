package X;

import android.app.Activity;

/* renamed from: X.40r */
public class AnonymousClass40r extends AnonymousClass3TL {
    /* renamed from: B */
    public final AnonymousClass0EE f48348B;
    /* renamed from: C */
    public final String f48349C;
    /* renamed from: D */
    private AnonymousClass2Ds f48350D;
    /* renamed from: E */
    private AnonymousClass2Hh f48351E;
    /* renamed from: F */
    private String f48352F;

    public AnonymousClass40r(AnonymousClass0IL anonymousClass0IL, AnonymousClass2Ds anonymousClass2Ds, AnonymousClass2Na anonymousClass2Na, String str, String str2, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass2Na anonymousClass2Na2 = anonymousClass2Na;
        String str3 = str;
        AnonymousClass0EE anonymousClass0EE2 = anonymousClass0EE;
        super((Activity) AnonymousClass0T1.B(anonymousClass0IL.getContext(), Activity.class), anonymousClass2Na2, anonymousClass0EE2, AnonymousClass3TK.SSO, str3, anonymousClass2Ds, AnonymousClass1Qv.C(anonymousClass0IL));
        this.f48349C = str2;
        this.f48351E = new AnonymousClass2Hh(anonymousClass0IL, new AnonymousClass3YH());
        this.f48350D = anonymousClass2Ds;
        this.f48352F = str;
        this.f48348B = anonymousClass0EE2;
    }

    /* renamed from: C */
    public void mo4963C(AnonymousClass2aG anonymousClass2aG) {
        int I = AnonymousClass0cQ.I(this, -1348438587);
        AnonymousClass0dp.B().B(this.f48349C);
        super.mo4963C(anonymousClass2aG);
        AnonymousClass0cQ.H(this, 547177205, I);
    }

    public void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 235811553);
        this.f48351E.m14933A();
        if (AnonymousClass1Qv.B(anonymousClass0Q6)) {
            super.onFail(anonymousClass0Q6);
        } else {
            Object obj;
            String str;
            boolean xb = this.f48350D.xb(this.f48352F);
            if (!xb) {
                super.onFail(anonymousClass0Q6);
            }
            if (anonymousClass0Q6.B()) {
                if ((((AnonymousClass2aG) anonymousClass0Q6.f4288C).f4184J != null ? 1 : null) != null) {
                    obj = 1;
                    if (obj == null) {
                        str = ((AnonymousClass2aG) anonymousClass0Q6.f4288C).f4184J;
                    } else {
                        str = "other";
                    }
                    AnonymousClass0Fr.OneTapFailed.F(this.f41492D).m15361B("instagram_id", this.f48349C).m15361B("error", str).m15362C("fallback_shown", xb).m15361B("module", this.f48348B.getModuleName()).m15362C("multi_tap_enabled", ((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.uU)).booleanValue()).m15364E();
                }
            }
            obj = null;
            if (obj == null) {
                str = "other";
            } else {
                str = ((AnonymousClass2aG) anonymousClass0Q6.f4288C).f4184J;
            }
            AnonymousClass0Fr.OneTapFailed.F(this.f41492D).m15361B("instagram_id", this.f48349C).m15361B("error", str).m15362C("fallback_shown", xb).m15361B("module", this.f48348B.getModuleName()).m15362C("multi_tap_enabled", ((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.uU)).booleanValue()).m15364E();
        }
        AnonymousClass0cQ.H(this, 1419146587, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1024855337);
        super.onStart();
        this.f48351E.m14934B();
        AnonymousClass0cQ.H(this, 1271028531, I);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1931939002);
        mo4963C((AnonymousClass2aG) obj);
        AnonymousClass0cQ.H(this, 938644664, I);
    }
}
