package X;

import java.util.Arrays;

/* renamed from: X.0LQ */
public final class AnonymousClass0LQ {
    /* renamed from: B */
    public static boolean m2954B(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: C */
    public static Object m2955C(Object obj, Object obj2) {
        return obj != null ? obj : AnonymousClass0LR.m2961D(obj2);
    }

    /* renamed from: D */
    public static int m2956D(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: E */
    public static String m2957E(Class cls) {
        cls = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = cls.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = cls.lastIndexOf(46);
        }
        return cls.substring(lastIndexOf + 1);
    }

    /* renamed from: F */
    public static AnonymousClass0XQ m2958F(Object obj) {
        return new AnonymousClass0XQ(AnonymousClass0LQ.m2957E(obj.getClass()));
    }
}
