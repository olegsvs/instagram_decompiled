package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import java.util.List;

/* renamed from: X.1Co */
public final class AnonymousClass1Co {
    /* renamed from: B */
    public static final List f15581B = new AnonymousClass1DB();
    /* renamed from: C */
    public static final List f15582C = new AnonymousClass1DA();

    /* renamed from: B */
    public static boolean m9929B(Context context) {
        return AnonymousClass1Co.m9930C(context).equals(context.getPackageName());
    }

    /* renamed from: C */
    public static String m9930C(Context context) {
        for (String str : f15582C) {
            if (AnonymousClass1Cp.m9939E(context, str, AnonymousClass1Bj.f15443C)) {
                return str;
            }
        }
        return context.getPackageName();
    }

    /* renamed from: D */
    public static String m9931D(Context context) {
        return AnonymousClass1E1.m10139B(context).m10140A() != null ? "com.facebook.katana" : "com.facebook.wakizashi";
    }

    /* renamed from: E */
    public static boolean m9932E(Context context) {
        String C = AnonymousClass1Co.m9930C(context);
        return AnonymousClass1Co.m9934G(C) && AnonymousClass1Co.m9935H(context, C);
    }

    /* renamed from: F */
    public static boolean m9933F(Context context) {
        for (String E : f15582C) {
            if (AnonymousClass1Cp.m9939E(context, E, AnonymousClass1Bj.f15443C)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m9934G(String str) {
        if (!"com.facebook.services.dev".equals(str)) {
            if (!"com.facebook.services".equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public static boolean m9935H(Context context, String str) {
        AnonymousClass1Bl B = AnonymousClass1Cp.m9936B(context, str, 4160, AnonymousClass1Bj.f15443C);
        if (B.f15447D == AnonymousClass1Bm.TRUSTED && B.f15445B != null) {
            if (B.f15445B.applicationInfo != null) {
                PackageInfo packageInfo = B.f15445B;
                int i = packageInfo.applicationInfo.flags;
                if (!((i & 1) == 0 && (i & 128) == 0)) {
                    if (VERSION.SDK_INT >= 23) {
                        if (packageInfo.requestedPermissions != null) {
                            if (packageInfo.requestedPermissionsFlags != null) {
                                context = packageInfo.requestedPermissions;
                                int[] iArr = packageInfo.requestedPermissionsFlags;
                                i = 0;
                                while (i < context.length && i < iArr.length) {
                                    if ((iArr[i] & 2) != 0) {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return null;
    }
}
