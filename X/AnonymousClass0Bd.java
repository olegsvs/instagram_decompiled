package X;

/* renamed from: X.0Bd */
public final class AnonymousClass0Bd extends AnonymousClass1GY {
    /* renamed from: B */
    public static String m799B(Integer num) {
        switch (num.intValue()) {
            case null:
                return "UNKNOWN";
            case 1:
                return "DISABLED";
            case 2:
                return "LOCAL";
            case 3:
                return "REMOTE";
            case 4:
                return "DOWNLOADING";
            default:
                throw new NullPointerException();
        }
    }

    /* renamed from: C */
    public static String m800C(Integer num) {
        if (num.intValue() != -1) {
            return AnonymousClass0Bd.m799B(num);
        }
        throw new NullPointerException();
    }
}
