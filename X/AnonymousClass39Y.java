package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.39Y */
public final class AnonymousClass39Y {
    /* renamed from: B */
    public static boolean m18777B(Activity activity, AnonymousClass0Cm anonymousClass0Cm, List list, String str, String str2, String str3, AnonymousClass0MJ anonymousClass0MJ, AnonymousClass0PZ anonymousClass0PZ, AnonymousClass0ua anonymousClass0ua, String str4, List list2, String str5) {
        AnonymousClass0vq C = AnonymousClass0vv.C(list, activity);
        AnonymousClass0PZ anonymousClass0PZ2 = anonymousClass0PZ;
        AnonymousClass0ua anonymousClass0ua2 = anonymousClass0ua;
        AnonymousClass0MJ anonymousClass0MJ2 = anonymousClass0MJ;
        if (C != null) {
            String str6;
            String str7 = null;
            switch (AnonymousClass39X.f38425B[C.f12147F.ordinal()]) {
                case 1:
                    str6 = C.f12151J;
                    str7 = "webclick";
                    break;
                case 2:
                    str6 = AnonymousClass0EF.F(C.f12148G).toString();
                    str7 = "appinstall";
                    break;
                case 3:
                    str6 = C.f12145D;
                    str7 = "deeplink";
                    break;
                default:
                    str6 = null;
                    break;
            }
            AnonymousClass0bP C2 = AnonymousClass0bN.C("canvas_action", anonymousClass0PZ2, anonymousClass0MJ2, anonymousClass0ua2);
            C2.RB = str;
            C2.f6726B = str7;
            C2.IE = str6;
            C2.rD = str5;
            C2.NC = str2;
            C2.f6776z = str3;
            AnonymousClass0bN.g(anonymousClass0PZ2, anonymousClass0MJ2, C2.B(), null);
            AnonymousClass0xM anonymousClass0xM = C.f12147F;
            String id = anonymousClass0MJ2.getId();
            String moduleName = anonymousClass0PZ2.getModuleName();
            List list3 = list2;
            if (AnonymousClass0xM.AD_DESTINATION_WEB == anonymousClass0xM) {
                AnonymousClass0he anonymousClass0he = new AnonymousClass0he(activity, anonymousClass0Cm, str6, AnonymousClass0hf.CANVAS_CTA);
                anonymousClass0he.f8454C = list2 != null ? new ArrayList(list3) : null;
                anonymousClass0he.f8462K = true;
                anonymousClass0he.A(id).E(moduleName).D();
            } else {
                AnonymousClass0xR.F(activity, str6, anonymousClass0xM);
            }
            AnonymousClass0dz anonymousClass0dz = AnonymousClass0dy.B().f7558B;
            activity = AnonymousClass0uY.f11847E;
            anonymousClass0Cm = (long) str4.hashCode();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("_tap");
            anonymousClass0dz.E(activity, anonymousClass0Cm, stringBuilder.toString(), AnonymousClass0IE.E("loggingToken=%s:url=%s", new Object[]{str2, str6}));
            return true;
        }
        C2 = AnonymousClass0bN.C("canvas_action_failed", anonymousClass0PZ2, anonymousClass0MJ2, anonymousClass0ua2);
        C2.RB = str;
        C2.NC = str2;
        AnonymousClass0bN.g(anonymousClass0PZ2, anonymousClass0MJ2, C2.B(), null);
        anonymousClass0dz = AnonymousClass0dy.B().f7558B;
        activity = AnonymousClass0uY.f11847E;
        anonymousClass0Cm = (long) str4.hashCode();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_tap_failed");
        anonymousClass0dz.E(activity, anonymousClass0Cm, stringBuilder.toString(), AnonymousClass0IE.E("loggingToken=%s", new Object[]{str2}));
        return false;
    }
}
