package X;

/* renamed from: X.3Pw */
public enum AnonymousClass3Pw {
    EU("eu"),
    ROW("row"),
    UNKNOWN("unknown");
    
    /* renamed from: B */
    private String f41020B;

    private AnonymousClass3Pw(String str) {
        this.f41020B = str;
    }

    /* renamed from: A */
    public final String m19576A() {
        return this.f41020B;
    }

    /* renamed from: B */
    public static AnonymousClass3Pw m19575B(String str) {
        for (AnonymousClass3Pw anonymousClass3Pw : AnonymousClass3Pw.values()) {
            if (anonymousClass3Pw.m19576A().equals(str)) {
                return anonymousClass3Pw;
            }
        }
        return UNKNOWN;
    }
}
