package X;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.2oQ */
public final class AnonymousClass2oQ {
    /* renamed from: B */
    private static final boolean f34267B = (VERSION.SDK_INT >= 23);
    /* renamed from: C */
    public static final String f34268C = "ContextUtil";

    /* renamed from: B */
    public static boolean m17273B(Context context, String str) {
        if (!f34267B) {
            return AnonymousClass2oQ.m17274C(context, str);
        }
        return context.checkSelfPermission(str) == 0;
    }

    /* renamed from: C */
    private static boolean m17274C(Context context, String str) {
        if (str != null) {
            String[] strArr;
            try {
                strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED).requestedPermissions;
            } catch (Throwable e) {
                Log.wtf(f34268C, "Could not find the package of this very app!", e);
                strArr = null;
            }
            if (strArr != null) {
                for (Object equals : strArr) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
