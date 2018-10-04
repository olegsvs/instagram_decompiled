package X;

/* renamed from: X.1Ka */
public final class AnonymousClass1Ka {
    /* renamed from: B */
    public static void m10782B(Object obj, Object obj2) {
        StringBuilder stringBuilder;
        if (obj == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("null key in entry: null=");
            stringBuilder.append(obj2);
            throw new NullPointerException(stringBuilder.toString());
        } else if (obj2 == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("null value in entry: ");
            stringBuilder.append(obj);
            stringBuilder.append("=null");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    /* renamed from: C */
    public static int m10783C(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" cannot be negative but was: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
