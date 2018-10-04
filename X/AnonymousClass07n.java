package X;

import android.content.Context;
import java.net.Socket;

/* renamed from: X.07n */
public final class AnonymousClass07n {
    /* renamed from: B */
    private static final Object f662B = new Object();
    /* renamed from: C */
    private static Socket f663C = null;
    /* renamed from: D */
    private static String f664D = null;
    /* renamed from: E */
    private static Integer f665E = null;
    /* renamed from: F */
    private static boolean f666F = false;
    /* renamed from: G */
    private static boolean f667G = true;

    /* renamed from: B */
    public static Socket m468B(Context context, String str, Integer num, boolean z) {
        synchronized (f662B) {
            if (f666F) {
                return null;
            }
            f666F = true;
            Socket socket = AnonymousClass07n.m469C(context, str, num, z) ? f663C : null;
            f663C = null;
            return socket;
        }
    }

    /* renamed from: C */
    private static boolean m469C(Context context, String str, Integer num, boolean z) {
        if (!(context == null || str == null)) {
            if (num != null) {
                boolean z2;
                context = AnonymousClass1D6.m9967B(context, AnonymousClass1D6.f15631E).edit();
                if (str.equals(f664D)) {
                    z2 = true;
                } else {
                    f664D = str;
                    context.putString("SHAREDPREFERENCES_HOSTNAME", str);
                    z2 = false;
                }
                if (!num.equals(f665E)) {
                    f665E = num;
                    context.putInt("SHAREDPREFERENCES_PORT_NUM", num.intValue());
                    z2 = false;
                }
                if (z != f667G) {
                    f667G = z;
                    context.putBoolean("SHAREDPREFERENCES_USE_SSL", z);
                    z2 = false;
                }
                if (!z2) {
                    context.commit();
                }
                return z2;
            }
        }
        return false;
    }
}
