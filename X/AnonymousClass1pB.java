package X;

import android.os.Build.VERSION;
import android.system.ErrnoException;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.1pB */
public final class AnonymousClass1pB {
    /* renamed from: B */
    public static final String f23122B = "ErrnoExtractor";
    /* renamed from: C */
    public static boolean f23123C;
    /* renamed from: D */
    public static Class f23124D;
    /* renamed from: E */
    public static Field f23125E;

    private AnonymousClass1pB() {
    }

    /* renamed from: B */
    public static int m13364B(Throwable th) {
        if (th == null) {
            return -1;
        }
        if (VERSION.SDK_INT >= 21) {
            return AnonymousClass1pB.m13365C(th);
        }
        return AnonymousClass1pB.m13366D(th);
    }

    /* renamed from: C */
    public static int m13365C(Throwable th) {
        if (th instanceof ErrnoException) {
            return ((ErrnoException) th).errno;
        }
        return -1;
    }

    /* renamed from: D */
    public static int m13366D(Throwable th) {
        if (!f23123C) {
            synchronized (AnonymousClass1pB.class) {
                if (!f23123C) {
                    f23123C = true;
                    try {
                        Class cls = Class.forName("libcore.io.ErrnoException");
                        Field declaredField = cls.getDeclaredField("errno");
                        f23124D = cls;
                        f23125E = declaredField;
                    } catch (Throwable e) {
                        Log.e(f23122B, "Error loading errno exception class", e);
                    }
                }
            }
        }
        if (f23124D != null) {
            if (th.getClass().equals(f23124D)) {
                try {
                    return f23125E.getInt(th);
                } catch (Throwable e2) {
                    Log.e(f23122B, "Error accessing errno field", e2);
                    return -1;
                }
            }
        }
        return -1;
    }
}
