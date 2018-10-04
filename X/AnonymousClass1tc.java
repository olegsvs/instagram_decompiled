package X;

/* renamed from: X.1tc */
public final class AnonymousClass1tc extends Exception {
    public AnonymousClass1tc(String str) {
        super(str);
    }

    public AnonymousClass1tc(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(": ");
        if (str2 == null) {
            str2 = "null";
        }
        stringBuilder.append(str2);
        super(stringBuilder.toString());
    }

    /* renamed from: B */
    public static String m13638B(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PARAM ACCESS ERROR - ");
        stringBuilder.append(str2);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
