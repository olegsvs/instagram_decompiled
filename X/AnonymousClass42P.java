package X;

/* renamed from: X.42P */
public final class AnonymousClass42P extends AnonymousClass3oh {
    public AnonymousClass42P(String str) {
        super(str);
    }

    public AnonymousClass42P(Throwable th) {
        super(th);
    }

    /* renamed from: B */
    public static AnonymousClass42P m22248B(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported codec for ");
        stringBuilder.append(str);
        return new AnonymousClass42P(stringBuilder.toString());
    }
}
