package X;

import android.os.Build.VERSION;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0A7 */
public final class AnonymousClass0A7 implements AnonymousClass010 {
    /* renamed from: B */
    private static final String f1149B = "OldProcReader";
    /* renamed from: C */
    private static volatile Method f1150C;
    /* renamed from: D */
    private static volatile boolean f1151D;
    /* renamed from: E */
    private static volatile Method f1152E;
    /* renamed from: F */
    private static volatile boolean f1153F;
    /* renamed from: G */
    private static volatile Method f1154G;
    /* renamed from: H */
    private static volatile boolean f1155H;

    /* renamed from: B */
    public static AnonymousClass0A7 m669B() {
        if (VERSION.SDK_INT <= 25) {
            Object obj = (AnonymousClass0A7.m670C() == null || AnonymousClass0A7.m671D() == null || AnonymousClass0A7.m672E() == null) ? null : 1;
            if (obj != null) {
                return new AnonymousClass0A7();
            }
        }
        return null;
    }

    /* renamed from: C */
    public static Method m670C() {
        if (!f1151D) {
            r2 = new Class[7];
            Class cls = Integer.TYPE;
            r2[1] = cls;
            r2[2] = cls;
            r2[3] = int[].class;
            r2[4] = String[].class;
            r2[5] = long[].class;
            r2[6] = float[].class;
            f1150C = AnonymousClass0A7.m673F("parseProcLine", r2);
            f1151D = true;
        }
        return f1150C;
    }

    /* renamed from: D */
    public static Method m671D() {
        if (!f1153F) {
            f1152E = AnonymousClass0A7.m673F("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class);
            f1153F = true;
        }
        return f1152E;
    }

    /* renamed from: E */
    public static Method m672E() {
        if (!f1155H) {
            f1154G = AnonymousClass0A7.m673F("readProcLines", String.class, String[].class, long[].class);
            f1155H = true;
        }
        return f1154G;
    }

    /* renamed from: F */
    public static Method m673F(String str, Class... clsArr) {
        try {
            return Process.class.getMethod(str, clsArr);
        } catch (Throwable e) {
            String str2 = f1149B;
            if (Log.isLoggable(str2, 5)) {
                StringBuilder stringBuilder = new StringBuilder("Warning! Could not get access to JNI method - ");
                stringBuilder.append(str);
                Log.w(str2, stringBuilder.toString(), e);
            }
            return null;
        }
    }

    public final boolean FHA(byte[] bArr, int i, int i2, int[] iArr, String[] strArr, long[] jArr, float[] fArr) {
        Object G = AnonymousClass0A7.m674G(AnonymousClass0A7.m670C(), bArr, Integer.valueOf(i), Integer.valueOf(i2), iArr, strArr, jArr, fArr);
        if (G == null) {
            return false;
        }
        return ((Boolean) G).booleanValue();
    }

    /* renamed from: G */
    private static Object m674G(Method method, Object... objArr) {
        if (method != null) {
            try {
                return method.invoke(null, objArr);
            } catch (Object[] objArr2) {
                if (Log.isLoggable(f1149B, 6)) {
                    method = new StringBuilder("Error (IllegalAccessException - ");
                    method.append(objArr2.getLocalizedMessage());
                    method.append(")");
                    Log.e(f1149B, method.toString(), objArr2);
                }
            } catch (Object[] objArr22) {
                if (Log.isLoggable(f1149B, 6)) {
                    method = new StringBuilder("Error (InvocationTargetException - ");
                    method.append(objArr22.getLocalizedMessage());
                    method.append(")");
                    Log.e(f1149B, method.toString(), objArr22);
                }
            }
        }
        return Boolean.FALSE;
    }

    public final boolean mIA(String str, int[] iArr, String[] strArr, long[] jArr, float[] fArr) {
        Object G = AnonymousClass0A7.m674G(AnonymousClass0A7.m671D(), str, iArr, strArr, jArr, fArr);
        if (G == null) {
            return false;
        }
        return ((Boolean) G).booleanValue();
    }

    public final boolean nIA(String str, String[] strArr, long[] jArr) {
        return true ^ Boolean.FALSE.equals(AnonymousClass0A7.m674G(AnonymousClass0A7.m672E(), str, strArr, jArr));
    }
}
