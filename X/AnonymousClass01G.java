package X;

/* renamed from: X.01G */
public final class AnonymousClass01G {
    /* renamed from: B */
    public static String m72B(int i) {
        switch (i) {
            case 1:
                return "unknown";
            case 2:
                return "controller_init";
            case 3:
                return "missed_event";
            case 4:
                return "timeout";
            case 5:
                return "new_start";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("UNKNOWN REASON ");
                stringBuilder.append(i);
                return stringBuilder.toString();
        }
    }
}
