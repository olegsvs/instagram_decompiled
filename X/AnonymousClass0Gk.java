package X;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.C0164R;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.0Gk */
public final class AnonymousClass0Gk {
    /* renamed from: B */
    private static final EnumSet f2410B = EnumSet.of(AnonymousClass0a4.MAIN_FEED, AnonymousClass0a4.PROMOTION_PREVIEW, AnonymousClass0a4.SAVE_HOME, AnonymousClass0a4.AD_RATING, AnonymousClass0a4.NEW_AD_BAKEOFF);
    /* renamed from: C */
    public static boolean f2411C = false;

    /* renamed from: B */
    public static void m1850B(Context context, AnonymousClass0Pt anonymousClass0Pt, AnonymousClass0Nr anonymousClass0Nr) {
        String str;
        anonymousClass0Pt.m3933B("X-Ads-Opt-Out", AnonymousClass0FH.f2099C.m1535G() ? "1" : "0");
        String B = AnonymousClass0FH.f2099C.m1530B();
        String C = AnonymousClass0FH.f2099C.m1531C();
        if (B != null) {
            anonymousClass0Pt.m3933B("X-Attribution-ID", B);
        }
        if (C != null) {
            anonymousClass0Pt.m3933B("X-Google-AD-ID", C);
        }
        C = AnonymousClass0Dt.f1941C.m1312A(context);
        if (C != null) {
            anonymousClass0Pt.m3933B("X-DEVICE-ID", C);
        }
        if (AnonymousClass0Om.m3648F()) {
            anonymousClass0Pt.m3933B("X-FB", "1");
        }
        if (f2411C) {
            String str2 = "%.3f";
            anonymousClass0Pt.m3933B("X-CM-Bandwidth-KBPS", AnonymousClass0IE.m2137E(str2, Double.valueOf(AnonymousClass0Fu.m1694B().m1696A())));
            anonymousClass0Pt.m3933B("X-CM-Latency", AnonymousClass0IE.m2137E(str2, Double.valueOf(AnonymousClass0Fu.m1694B().m1694B())));
        }
        AnonymousClass0Pt D = anonymousClass0Pt.m3935D("battery_level", Integer.toString(anonymousClass0Nr.m3467A())).m3935D("is_charging", anonymousClass0Nr.m3470D() ? "1" : "0").m3935D("phone_id", AnonymousClass0N2.m3261B().m3261B());
        B = "will_sound_on";
        if (AnonymousClass0fo.f7997C.m6558B(false)) {
            if ((anonymousClass0Nr.f3726B.getStreamVolume(3) == 0 ? 1 : null) == null) {
                str = "1";
                D.m3935D(B, str);
            }
        }
        str = "0";
        D.m3935D(B, str);
    }

    /* renamed from: C */
    public static SpannableStringBuilder m1851C(SpannableStringBuilder spannableStringBuilder, String str, String str2, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str2);
        length += str2.indexOf("{username}");
        spannableStringBuilder.replace(length, 10 + length, str);
        spannableStringBuilder.setSpan(obj, length, str.length() + length, 33);
        return spannableStringBuilder;
    }

    /* renamed from: D */
    public static int m1852D(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((((float) Color.red(i)) * f) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i)) * f) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i)) * f) + (((float) Color.blue(i2)) * f2)));
    }

    /* renamed from: E */
    public static String m1853E(AnonymousClass0P7 anonymousClass0P7) {
        if (anonymousClass0P7.MA().m1029t()) {
            return anonymousClass0P7.LA();
        }
        return anonymousClass0P7.MA().uT();
    }

    /* renamed from: F */
    public static AnonymousClass0SK m1854F(AnonymousClass0P7 anonymousClass0P7, int i) {
        if (anonymousClass0P7.kA()) {
            return anonymousClass0P7.m3763S(i).OB;
        }
        return anonymousClass0P7.OB;
    }

    /* renamed from: G */
    public static String m1855G(Context context, AnonymousClass0P7 anonymousClass0P7, int i) {
        String str;
        if (anonymousClass0P7.kA()) {
            str = anonymousClass0P7.m3763S(i).lB;
        } else {
            str = anonymousClass0P7.lB;
        }
        return TextUtils.isEmpty(str) ? context.getString(C0164R.string.default_link_text) : str;
    }

    /* renamed from: H */
    public static String m1856H(Context context, AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, AnonymousClass0vq anonymousClass0vq) {
        if (anonymousClass0P7.eY()) {
            AnonymousClass0P7 S = anonymousClass0P7.kA() ? anonymousClass0P7.m3763S(anonymousClass0m3.f9672G) : anonymousClass0P7;
            if (AnonymousClass0Gk.m1860L(anonymousClass0vq) && AnonymousClass0Gk.m1861M(anonymousClass0P7)) {
                return context.getString(C0164R.string.lead_ad_submitted);
            }
            String T = AnonymousClass0Gk.m1868T(S);
            if (T != null) {
                return T;
            }
        }
        return null;
    }

    /* renamed from: I */
    public static SpannableStringBuilder m1857I(String str, String str2, Object obj) {
        return AnonymousClass0Gk.m1851C(new SpannableStringBuilder(), str, str2, obj);
    }

    /* renamed from: J */
    public static boolean m1858J(AnonymousClass0P7 anonymousClass0P7, int i) {
        if (anonymousClass0P7.kA()) {
            return anonymousClass0P7.m3763S(i).VA();
        }
        return anonymousClass0P7.VA();
    }

    /* renamed from: K */
    public static boolean m1859K(AnonymousClass0P7 anonymousClass0P7, int i) {
        if (anonymousClass0P7.kA()) {
            anonymousClass0P7 = anonymousClass0P7.m3763S(i);
        }
        return anonymousClass0P7.XA();
    }

    /* renamed from: L */
    public static boolean m1860L(AnonymousClass0vq anonymousClass0vq) {
        return anonymousClass0vq.f12147F == AnonymousClass0xM.AD_DESTINATION_LEAD_AD;
    }

    /* renamed from: M */
    public static boolean m1861M(AnonymousClass0P7 anonymousClass0P7) {
        return AnonymousClass3Mh.B().A(anonymousClass0P7.m3751G());
    }

    /* renamed from: N */
    public static boolean m1862N(AnonymousClass0P7 anonymousClass0P7) {
        return anonymousClass0P7.MA().m1029t() && anonymousClass0P7.GB != null && ((Boolean) AnonymousClass0CC.SX.m845G()).booleanValue();
    }

    /* renamed from: O */
    public static boolean m1863O(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0a4 anonymousClass0a4) {
        return (anonymousClass0P7.eY() == null || f2410B.contains(anonymousClass0a4) == null) ? null : true;
    }

    /* renamed from: P */
    public static boolean m1864P(AnonymousClass0P7 anonymousClass0P7) {
        return anonymousClass0P7.wY() && anonymousClass0P7.XA();
    }

    /* renamed from: Q */
    public static boolean m1865Q() {
        String str = (String) AnonymousClass0CC.fm.m845G();
        if (!str.equals("launch_button_short_nux")) {
            if (!str.equals("launch_button_long_nux")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: R */
    public static boolean m1866R(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0PZ anonymousClass0PZ) {
        if (AnonymousClass0nL.m7653B().m7655B(anonymousClass0P7)) {
            AnonymousClass0bN.m5559W(anonymousClass0PZ, anonymousClass0P7, "INSTAGRAM_MEDIA_WAS_HIDDEN", new AnonymousClass0uZ(anonymousClass0P7, anonymousClass0P7.m3749E()));
            return true;
        }
        List list;
        if (anonymousClass0P7.kA()) {
            list = anonymousClass0P7.m3763S(0).f4013N;
        } else {
            list = anonymousClass0P7.f4013N;
        }
        if (r6 != null) {
            Object obj = null;
            for (AnonymousClass0vq anonymousClass0vq : r6) {
                if (anonymousClass0vq.f12147F == AnonymousClass0xM.AD_DESTINATION_APP_STORE && AnonymousClass0Zv.m5405F(anonymousClass0vq.f12148G)) {
                    obj = 1;
                }
            }
            for (AnonymousClass0vq anonymousClass0vq2 : r6) {
                if (anonymousClass0vq2.f12147F == AnonymousClass0xM.AD_DESTINATION_DEEPLINK) {
                    obj = null;
                }
            }
            if (obj != null) {
                AnonymousClass0nL.m7653B().m7656C(anonymousClass0P7, true);
                AnonymousClass0bN.m5559W(anonymousClass0PZ, anonymousClass0P7, "already_installed", new AnonymousClass0uZ(anonymousClass0P7, anonymousClass0P7.m3749E()));
                return true;
            }
        }
        return false;
    }

    /* renamed from: S */
    public static boolean m1867S(AnonymousClass0P7 anonymousClass0P7) {
        return anonymousClass0P7.eY() && anonymousClass0P7.iC && ((Boolean) AnonymousClass0CC.sd.m845G()).booleanValue();
    }

    /* renamed from: T */
    private static String m1868T(AnonymousClass0P7 anonymousClass0P7) {
        List<AnonymousClass12B> list = anonymousClass0P7.f4005F;
        if (!(list == null || list.isEmpty())) {
            for (AnonymousClass12B anonymousClass12B : list) {
                if (anonymousClass12B.f13486B == AnonymousClass12C.METADATA_DESTINATION) {
                    return anonymousClass12B.f13487C;
                }
            }
        }
        return null;
    }
}
