package X;

/* renamed from: X.3Q8 */
public enum AnonymousClass3Q8 {
    NEW_USER("new"),
    EXISTING_USER("existing"),
    UNKNOWN("unknown");
    
    /* renamed from: B */
    private String f41069B;

    private AnonymousClass3Q8(String str) {
        this.f41069B = str;
    }

    /* renamed from: B */
    public static AnonymousClass3Q8 m19588B(String str) {
        for (AnonymousClass3Q8 anonymousClass3Q8 : AnonymousClass3Q8.values()) {
            if (anonymousClass3Q8.toString().equals(str)) {
                return anonymousClass3Q8;
            }
        }
        return UNKNOWN;
    }

    public final String toString() {
        return this.f41069B;
    }
}
