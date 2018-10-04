package X;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/* renamed from: X.0Iy */
public final class AnonymousClass0Iy {
    /* renamed from: B */
    public static AnonymousClass34o m2386B(String str) {
        for (AnonymousClass34o anonymousClass34o : AnonymousClass34o.values()) {
            if (anonymousClass34o.toString().equals(str)) {
                return anonymousClass34o;
            }
        }
        return AnonymousClass34o.f37621F;
    }

    /* renamed from: C */
    public static Bundle m2387C(AnonymousClass0Cm anonymousClass0Cm) {
        Bundle bundle = new Bundle();
        bundle.putString("pk", anonymousClass0Cm.f1759C);
        bundle.putString("userID", anonymousClass0Cm.f1759C);
        bundle.putString("fbUserId", AnonymousClass0a2.m5424I(anonymousClass0Cm));
        return bundle;
    }

    /* renamed from: D */
    public static AnonymousClass0IL m2388D(Activity activity, AnonymousClass1Pv anonymousClass1Pv) {
        FragmentActivity B = AnonymousClass0In.m2342B(activity);
        activity = B != null ? B.mo382D() : null;
        return activity != null ? activity.mo1454F(AnonymousClass0Iy.m2394J(anonymousClass1Pv)) : null;
    }

    /* renamed from: E */
    public static AnonymousClass1Pv m2389E(String str) {
        for (AnonymousClass1Pv anonymousClass1Pv : AnonymousClass1Pv.values()) {
            if (anonymousClass1Pv.toString().equals(str)) {
                return anonymousClass1Pv;
            }
        }
        return null;
    }

    /* renamed from: F */
    public static void m2390F(AnonymousClass0Cm anonymousClass0Cm, String str, String str2, String str3, String str4, String str5, FragmentActivity fragmentActivity) {
        Bundle C = AnonymousClass0Iy.m2387C(anonymousClass0Cm);
        C.putString("entryPoint", str3);
        C.putString("mediaID", str);
        if ("IgInsightsPromoteInsightsRoute".equals(str4)) {
            C.putString("accessToken", AnonymousClass0Cf.m976F(anonymousClass0Cm));
        }
        AnonymousClass0Il.getInstance().newReactNativeLauncher(anonymousClass0Cm).KRA(str4).zRA(str5).LSA(str2).kQA(C).cVA(fragmentActivity).m2308B();
    }

    /* renamed from: G */
    public static void m2391G(AnonymousClass0Cm anonymousClass0Cm, String str, FragmentActivity fragmentActivity) {
        Bundle C = AnonymousClass0Iy.m2387C(anonymousClass0Cm);
        String str2 = "profile";
        C.putString("entryPoint", str2);
        AnonymousClass0xT.m8546C("insights_icon", str2, "appeared", AnonymousClass0a2.m5424I(anonymousClass0Cm));
        AnonymousClass0Il.getInstance().newReactNativeLauncher(anonymousClass0Cm).KRA("IgInsightsAccountInsightsRoute").zRA("ig_insights_account_insights").LSA(str).kQA(C).XVA(fragmentActivity).m2308B();
    }

    /* renamed from: H */
    public static void m2392H(AnonymousClass0Cm anonymousClass0Cm, String str, String str2, String str3, FragmentActivity fragmentActivity) {
        AnonymousClass2NW.B();
        String str4 = str;
        String str5 = str3;
        AnonymousClass2NW.f29695M.A().m3298F("m_pk", str).m3298F("entry_point", str3).m3310R();
        AnonymousClass0Iy.m2390F(anonymousClass0Cm, str4, str2, str5, "IgInsightsPromoteInsightsRoute", "ig_insights_promote_insights", fragmentActivity);
    }

    /* renamed from: I */
    public static boolean m2393I(long j) {
        if (j <= ((long) ((Integer) AnonymousClass0E6.m1317C(AnonymousClass0CC.WZ)).intValue())) {
            return false;
        }
        return ((String) AnonymousClass0CC.YZ.m845G()).equals("enabled");
    }

    /* renamed from: J */
    private static String m2394J(AnonymousClass1Pv anonymousClass1Pv) {
        switch (anonymousClass1Pv.ordinal()) {
            case null:
                return "IgInsightsAccountInsightsRoute";
            case 2:
                return "IgInsightsStoryGridRoute";
            case 3:
                return "IgBusinessTutorialsRoute";
            default:
                return null;
        }
    }
}
