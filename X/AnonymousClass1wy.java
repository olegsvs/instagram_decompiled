package X;

/* renamed from: X.1wy */
public final class AnonymousClass1wy extends SecurityException {
    public AnonymousClass1wy(String str) {
        super(str);
    }

    public AnonymousClass1wy(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Package name mismatch: expected=");
        stringBuilder.append(str);
        stringBuilder.append(", was=");
        stringBuilder.append(str2);
        this(stringBuilder.toString());
    }
}
