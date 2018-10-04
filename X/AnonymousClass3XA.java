package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagram.login.api.RegistrationFlowExtras;

/* renamed from: X.3XA */
public final class AnonymousClass3XA {
    /* renamed from: B */
    public static void m19853B(AnonymousClass0IJ anonymousClass0IJ, RegistrationFlowExtras registrationFlowExtras, AnonymousClass2DZ anonymousClass2DZ, AnonymousClass3TB anonymousClass3TB) {
        Context context = anonymousClass0IJ.getContext();
        String C = AnonymousClass0i7.B().C();
        String str = JsonProperty.USE_DEFAULT_NAME;
        if (anonymousClass2DZ == AnonymousClass2DZ.EMAIL) {
            str = "accounts/create/";
        } else if (anonymousClass2DZ == AnonymousClass2DZ.PHONE_REG) {
            str = "accounts/create_validated/";
        }
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.G());
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = str;
        AnonymousClass0Pt A = registrationFlowExtras.m14744A(context, anonymousClass0Pt.D("waterfall_id", AnonymousClass0Fr.B()).D("adid", AnonymousClass1fi.J()).D("phone_id", AnonymousClass0N2.B().B()).M(AnonymousClass2Zx.class));
        if (anonymousClass2DZ == AnonymousClass2DZ.EMAIL && C != null) {
            A.D("big_blue_token", C);
        }
        AnonymousClass0GA H = A.H();
        H.f2849B = anonymousClass3TB;
        anonymousClass0IJ.schedule(H);
    }

    /* renamed from: C */
    public static AnonymousClass3WH m19854C() {
        return AnonymousClass3WH.valueOf(((String) AnonymousClass0CC.Ac.G()).toUpperCase());
    }

    /* renamed from: D */
    public static void m19855D(AnonymousClass0IJ anonymousClass0IJ, String str, AnonymousClass0Oh anonymousClass0Oh, AnonymousClass0EE anonymousClass0EE) {
        AnonymousClass0Oh anonymousClass0Oh2 = anonymousClass0Oh;
        String B = anonymousClass0Oh.B();
        AnonymousClass0Iw anonymousClass2Gu = new AnonymousClass2Gu();
        AnonymousClass17t anonymousClass17t = new AnonymousClass17t();
        anonymousClass17t.f14851C = "v2.3";
        anonymousClass17t.f14853E = AnonymousClass0Pu.f4247G;
        anonymousClass17t.f14856H = AnonymousClass17u.f14857B;
        anonymousClass17t.f14850B = AnonymousClass0FO.I();
        anonymousClass17t = anonymousClass17t.D(AnonymousClass17v.class);
        anonymousClass17t.f14852D = new AnonymousClass2Gr(B);
        AnonymousClass0GA C = anonymousClass17t.C();
        C.f2849B = anonymousClass2Gu;
        AnonymousClass0Ix.D(C);
        Activity activity = anonymousClass0IJ.getActivity();
        if (activity instanceof AnonymousClass3XG) {
            ((AnonymousClass3XG) activity).sOA(true);
        }
        AnonymousClass0Cd.f1698B.f1701D = false;
        AnonymousClass0ap.B().zIA();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.USER_ID", str);
        bundle.putBoolean("IS_SIGN_UP_FLOW", true);
        AnonymousClass0Cm G = AnonymousClass0Ce.G(bundle);
        if (AnonymousClass0FO.f2124D) {
            AnonymousClass2HK anonymousClass2HK = AnonymousClass2HK.FB_LOGIN;
            AnonymousClass0FO.f2124D = false;
            AnonymousClass0FO.a(G, AnonymousClass2H2.STORE_TOKEN_ENDPOINT, AnonymousClass0a2.B(G), false, anonymousClass2HK);
        }
        AnonymousClass3Xh.m19902B();
        AnonymousClass3Xg.m19899B(anonymousClass0IJ.getContext()).m19900A();
        boolean booleanValue = ((Boolean) AnonymousClass0E6.B(AnonymousClass0CC.lb)).booleanValue();
        AnonymousClass0Fr.NuxStarted.B(anonymousClass0Oh).H("from_server", booleanValue).R();
        Context context = anonymousClass0IJ.getContext();
        if (((Boolean) AnonymousClass0CC.gb.G()).booleanValue()) {
            AnonymousClass0Ix.D(AnonymousClass2Ei.m14793B(context, G, AnonymousClass0Om.F()));
        }
        AnonymousClass0GO.C().B(anonymousClass0IJ.getContext(), G, anonymousClass0Oh, new AnonymousClass3X6(anonymousClass0Oh2, booleanValue, G, activity, anonymousClass0EE));
    }

    /* renamed from: E */
    public static void m19856E(AnonymousClass0Cn anonymousClass0Cn, String str, AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0Oh anonymousClass0Oh, RegistrationFlowExtras registrationFlowExtras, AnonymousClass0EE anonymousClass0EE, AnonymousClass3TC anonymousClass3TC, Handler handler, AnonymousClass3XF anonymousClass3XF, String str2, AnonymousClass2Na anonymousClass2Na, boolean z) {
        AnonymousClass0Oh anonymousClass0Oh2 = anonymousClass0Oh;
        RegistrationFlowExtras registrationFlowExtras2 = registrationFlowExtras;
        boolean z2 = false;
        String str3 = str2;
        AnonymousClass2NZ C = AnonymousClass0Fr.RegisterWithCIOption.G(anonymousClass2Na, anonymousClass0Oh2).m15362C("is_opted_in", registrationFlowExtras2.f27649B).m15362C("username_suggestion_avail", str2 != null);
        String str4 = "username_suggestion_changed_by_user";
        String str5 = str;
        if (!(str2 == null || str3.equals(str))) {
            z2 = true;
        }
        C.m15362C(str4, z2).m15364E();
        AnonymousClass0Cn anonymousClass0Cn2 = anonymousClass0Cn;
        AnonymousClass0IL anonymousClass0IL = anonymousClass0IJ;
        AnonymousClass0EE anonymousClass0EE2 = anonymousClass0EE;
        AnonymousClass3TC anonymousClass3TC2 = anonymousClass3TC;
        Handler handler2 = handler;
        if (anonymousClass0Oh2 != AnonymousClass0Oh.FACEBOOK) {
            AnonymousClass0OR.D(handler2, new AnonymousClass3X9(registrationFlowExtras2, str5, anonymousClass0Cn2, anonymousClass0IL, handler2, anonymousClass0Oh2, anonymousClass0EE2, anonymousClass3TC2, z), -1838269999);
            return;
        }
        AnonymousClass0GA B = AnonymousClass1fi.B(anonymousClass0IJ.getContext(), str, AnonymousClass0a2.K(anonymousClass0Cn2) ? AnonymousClass0a2.B(anonymousClass0Cn2) : null, registrationFlowExtras2.f27654G, registrationFlowExtras2.f27653F, null, null, registrationFlowExtras2.f27649B);
        Context context = anonymousClass0IL.getContext();
        if (anonymousClass0Cn2.xX()) {
            AnonymousClass0Gn.C("FacebookLoginHelper", "Logged in session when trying to facebook signup");
        }
        B.f2849B = new AnonymousClass3WY(anonymousClass3XF, context, anonymousClass0Cn2, handler2, anonymousClass0IL, anonymousClass0Oh2, anonymousClass0EE2, anonymousClass3TC2);
        anonymousClass0IL.schedule(B);
    }
}
