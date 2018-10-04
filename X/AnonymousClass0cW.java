package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build.VERSION;

/* renamed from: X.0cW */
public final class AnonymousClass0cW {
    /* renamed from: B */
    public static int m5879B(AnonymousClass0Cn anonymousClass0Cn, AnonymousClass0cX anonymousClass0cX) {
        int i;
        AnonymousClass0HV T = AnonymousClass0cW.m5897T(anonymousClass0Cn);
        switch (anonymousClass0cX.ordinal()) {
            case 0:
                i = T.f2646B.getInt("data_saver_network_resources_quality", -1);
                break;
            case 1:
                i = T.f2646B.getInt("data_saver_network_feed_autoplay", -1);
                break;
            case 2:
                i = T.f2646B.getInt("data_saver_network_story_autoplay", -1);
                break;
            default:
                throw new IllegalArgumentException("Unexpected low data mode type");
        }
        return i == -1 ? AnonymousClass0cW.m5895R(anonymousClass0cX) : i;
    }

    /* renamed from: C */
    public static boolean m5880C(AnonymousClass0Cn anonymousClass0Cn) {
        if (AnonymousClass0cW.m5883F(anonymousClass0Cn)) {
            boolean z = true;
            if (AnonymousClass0cW.m5892O(anonymousClass0Cn) != 1) {
                z = false;
            }
            return z;
        }
        anonymousClass0Cn = true;
        if (!(((Integer) AnonymousClass0CC.nT.m845G()).intValue() == 1 || ((Integer) AnonymousClass0CC.oT.m845G()).intValue() == 1 || ((Integer) AnonymousClass0CC.pT.m845G()).intValue() == 1 || ((Integer) AnonymousClass0CC.qT.m845G()).intValue() == 1 || ((Integer) AnonymousClass0CC.rT.m845G()).intValue() == 1)) {
            if (((Integer) AnonymousClass0CC.sT.m845G()).intValue() != 1) {
                anonymousClass0Cn = null;
            }
        }
        return anonymousClass0Cn;
    }

    /* renamed from: D */
    public static boolean m5881D() {
        return AnonymousClass0MM.m3155K(AnonymousClass0EV.f1977B) ^ 1;
    }

    /* renamed from: E */
    public static boolean m5882E(int i) {
        switch (i) {
            case -1:
            case 2:
                return false;
            case 0:
                return true;
            case 1:
                return AnonymousClass0cW.m5881D();
            default:
                throw new IllegalArgumentException("Unexpected network Setting value");
        }
    }

    /* renamed from: F */
    public static boolean m5883F(AnonymousClass0Cn anonymousClass0Cn) {
        return AnonymousClass0cW.m5892O(anonymousClass0Cn) != -1;
    }

    /* renamed from: G */
    public static boolean m5884G() {
        if (((Integer) AnonymousClass0CC.nT.m845G()).intValue() == -1 && ((Integer) AnonymousClass0CC.oT.m845G()).intValue() == -1 && ((Integer) AnonymousClass0CC.pT.m845G()).intValue() == -1 && ((Integer) AnonymousClass0CC.qT.m845G()).intValue() == -1 && ((Integer) AnonymousClass0CC.rT.m845G()).intValue() == -1) {
            if (((Integer) AnonymousClass0CC.sT.m845G()).intValue() == -1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public static int m5885H(Context context) {
        if (VERSION.SDK_INT < 24) {
            return -1;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager.isActiveNetworkMetered() ? connectivityManager.getRestrictBackgroundStatus() : 0;
    }

    /* renamed from: I */
    public static boolean m5886I(AnonymousClass0Cn anonymousClass0Cn) {
        if (AnonymousClass0cW.m5884G()) {
            Object obj;
            if (!(((Boolean) AnonymousClass0CC.HT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.IT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.JT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.KT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.LT.m845G()).booleanValue())) {
                if (!((Boolean) AnonymousClass0CC.MT.m845G()).booleanValue()) {
                    obj = null;
                    if (obj != null && AnonymousClass0cW.m5880C(anonymousClass0Cn) && AnonymousClass0cW.m5881D()) {
                        return true;
                    }
                }
            }
            obj = 1;
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m5887J(AnonymousClass0Cn anonymousClass0Cn) {
        if (AnonymousClass0cW.m5884G()) {
            Object obj;
            if (!(((Boolean) AnonymousClass0CC.TT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.UT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.VT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.WT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.XT.m845G()).booleanValue())) {
                if (!((Boolean) AnonymousClass0CC.YT.m845G()).booleanValue()) {
                    obj = null;
                    if (obj != null && AnonymousClass0cW.m5880C(anonymousClass0Cn) && AnonymousClass0cW.m5881D()) {
                        return true;
                    }
                }
            }
            obj = 1;
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m5888K(AnonymousClass0Cn anonymousClass0Cn, AnonymousClass0cX anonymousClass0cX) {
        return AnonymousClass0cW.m5884G() && AnonymousClass0cW.m5880C(anonymousClass0Cn) && AnonymousClass0cW.m5882E(AnonymousClass0cW.m5879B(anonymousClass0Cn, anonymousClass0cX));
    }

    /* renamed from: L */
    public static boolean m5889L(AnonymousClass0Cn anonymousClass0Cn) {
        return AnonymousClass0cW.m5888K(anonymousClass0Cn, AnonymousClass0cX.HighQualityMedia);
    }

    /* renamed from: M */
    public static boolean m5890M() {
        if (!((Boolean) AnonymousClass0CC.fT.m845G()).booleanValue()) {
            if (!((Boolean) AnonymousClass0CC.gT.m845G()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    public static boolean m5891N() {
        if (!(((Boolean) AnonymousClass0CC.tT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.uT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.vT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.wT.m845G()).booleanValue() || ((Boolean) AnonymousClass0CC.xT.m845G()).booleanValue())) {
            if (!((Boolean) AnonymousClass0CC.yT.m845G()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O */
    private static int m5892O(AnonymousClass0Cn anonymousClass0Cn) {
        return AnonymousClass0cW.m5897T(anonymousClass0Cn).f2646B.getInt("data_saver_mode_on", -1);
    }

    /* renamed from: P */
    private static int m5893P() {
        if (((Integer) AnonymousClass0CC.ZT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.ZT.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.aT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.aT.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.bT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.bT.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.cT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.cT.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.dT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.dT.m845G()).intValue();
        }
        return ((Integer) AnonymousClass0CC.eT.m845G()).intValue() != -1 ? ((Integer) AnonymousClass0CC.eT.m845G()).intValue() : 2;
    }

    /* renamed from: Q */
    private static int m5894Q() {
        if (((Integer) AnonymousClass0CC.hT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.hT.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.iT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.iT.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.jT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.jT.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.kT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.kT.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.lT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.lT.m845G()).intValue();
        }
        return ((Integer) AnonymousClass0CC.mT.m845G()).intValue() != -1 ? ((Integer) AnonymousClass0CC.mT.m845G()).intValue() : 2;
    }

    /* renamed from: R */
    private static int m5895R(AnonymousClass0cX anonymousClass0cX) {
        switch (anonymousClass0cX.ordinal()) {
            case 0:
                return AnonymousClass0cW.m5894Q();
            case 1:
                return AnonymousClass0cW.m5893P();
            case 2:
                return AnonymousClass0cW.m5896S();
            default:
                throw new IllegalArgumentException("Unexpected low data mode type");
        }
    }

    /* renamed from: S */
    private static int m5896S() {
        if (((Integer) AnonymousClass0CC.zT.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.zT.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.AU.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.AU.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.BU.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.BU.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.CU.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.CU.m845G()).intValue();
        }
        if (((Integer) AnonymousClass0CC.DU.m845G()).intValue() != -1) {
            return ((Integer) AnonymousClass0CC.DU.m845G()).intValue();
        }
        return ((Integer) AnonymousClass0CC.EU.m845G()).intValue() != -1 ? ((Integer) AnonymousClass0CC.EU.m845G()).intValue() : 2;
    }

    /* renamed from: T */
    private static AnonymousClass0HV m5897T(AnonymousClass0Cn anonymousClass0Cn) {
        if (anonymousClass0Cn == null || !anonymousClass0Cn.xX()) {
            return AnonymousClass0HV.m2007C();
        }
        return AnonymousClass0HV.m2008D(AnonymousClass0FL.m1559B(anonymousClass0Cn));
    }
}
