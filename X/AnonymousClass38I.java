package X;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;

/* renamed from: X.38I */
public final class AnonymousClass38I {
    /* renamed from: B */
    private static final String[] f38209B = new String[]{"SM-G388F", "SM-J100F", "SM-J100FN", "SM-J100M", "SM-J100MU", "SM-J100Y", "SM-J110F", "SM-J110G", "SM-T239", "SM-T239M"};
    /* renamed from: C */
    private static final String[] f38210C = new String[]{"SM-G361F", "SM-G388F", "SM-G531F", "SM-G531M", "SM-G531Y", "SM-J110M", "SM-J700M"};
    /* renamed from: D */
    private static Boolean f38211D;

    /* renamed from: B */
    public static boolean m18716B(Context context) {
        if (f38211D == null) {
            Object obj;
            boolean z;
            int i = VERSION.SDK_INT;
            if (i >= 18 && AnonymousClass38I.m18717C(context)) {
                if (i >= 27) {
                    AnonymousClass0uu.B();
                    if (AnonymousClass0uu.C(context) <= 1073741824) {
                        obj = 1;
                        if (obj == null) {
                            obj = 1;
                            z = obj == null && !AnonymousClass38I.m18718D();
                            f38211D = Boolean.valueOf(z);
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    obj = 1;
                    if (obj == null) {
                    }
                    f38211D = Boolean.valueOf(z);
                }
            }
            obj = null;
            if (obj == null) {
            }
            f38211D = Boolean.valueOf(z);
        }
        return f38211D.booleanValue();
    }

    /* renamed from: C */
    public static boolean m18717C(Context context) {
        context = AnonymousClass0tt.B(context);
        if (context >= 2008) {
            return context >= 2010;
        } else {
            return true;
        }
    }

    /* renamed from: D */
    private static boolean m18718D() {
        String str = VERSION.RELEASE;
        String[] strArr;
        if (str.equals("5.1.1")) {
            strArr = f38210C;
        } else {
            if (str.equals("4.4.4")) {
                strArr = f38209B;
            }
            return false;
        }
        Object obj = Build.MODEL;
        if (!TextUtils.isEmpty(obj)) {
            for (String equalsIgnoreCase : r4) {
                if (obj.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        return false;
    }
}
