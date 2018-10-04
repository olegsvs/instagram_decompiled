package X;

import android.content.Context;
import android.os.Build.VERSION;
import java.net.HttpCookie;

/* renamed from: X.0RC */
public final class AnonymousClass0RC {
    /* renamed from: B */
    public static Boolean f4614B;
    /* renamed from: C */
    public static Boolean f4615C;

    /* renamed from: B */
    public static boolean m4119B(String str) {
        return ("feed_timeline".equals(str) || "reel_server_prefetch".equals(str) || "reel_background_prefetch".equals(str) || "profile".equals(str) || "self_profile".equals(str) || "archive_calendar".equals(str)) ? false : true;
    }

    /* renamed from: C */
    public static boolean m4120C(Context context) {
        return VERSION.SDK_INT == 22 && AnonymousClass0tt.m8192B(context) >= 2011;
    }

    /* renamed from: D */
    public static boolean m4121D(Context context) {
        if (!((Boolean) AnonymousClass0CC.TQ.m845G()).booleanValue() && VERSION.SDK_INT >= 19 && AnonymousClass0tt.m8192B(context) >= 2011) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m4122E(Context context) {
        if (AnonymousClass0RC.m4120C(context)) {
            return ((Boolean) AnonymousClass0CC.uR.m845G()).booleanValue();
        }
        boolean z = ((Boolean) AnonymousClass0CC.OR.m845G()).booleanValue() && AnonymousClass0tt.m8192B(context) >= ((Integer) AnonymousClass0CC.VR.m845G()).intValue();
        return z;
    }

    /* renamed from: F */
    public static boolean m4123F(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        if (AnonymousClass0RC.m4120C(context) != null) {
            return ((Boolean) AnonymousClass0CC.xR.m845G()).booleanValue() ^ 1;
        }
        return ((Boolean) AnonymousClass0CC.RR.m846H(anonymousClass0Cm)).booleanValue();
    }

    /* renamed from: G */
    public static boolean m4124G(Context context) {
        if (!AnonymousClass0EF.m1362M(context)) {
            return false;
        }
        boolean booleanValue = ((Boolean) AnonymousClass0CC.zU.m845G()).booleanValue();
        boolean booleanValue2 = ((Boolean) AnonymousClass0CC.yU.m845G()).booleanValue();
        if (booleanValue || booleanValue2) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m4125H(Context context) {
        return (AnonymousClass0EF.m1362M(context) == null || ((Boolean) AnonymousClass0CC.xU.m845G()).booleanValue() == null) ? null : true;
    }

    /* renamed from: I */
    public static boolean m4126I(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        if (AnonymousClass0RC.m4120C(context) != null) {
            return ((Boolean) AnonymousClass0CC.yR.m845G()).booleanValue();
        }
        return ((Boolean) AnonymousClass0CC.AS.m846H(anonymousClass0Cm)).booleanValue();
    }

    /* renamed from: J */
    public static boolean m4127J(AnonymousClass0Cm anonymousClass0Cm) {
        if (f4615C == null) {
            HttpCookie C = AnonymousClass0Cf.m973C(anonymousClass0Cm, "is_starred_enabled");
            boolean z = C != null && "yes".equals(C.getValue());
            f4615C = Boolean.valueOf(z);
        }
        return f4615C.booleanValue();
    }
}
