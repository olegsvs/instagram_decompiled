package X;

/* renamed from: X.0S2 */
public enum AnonymousClass0S2 {
    UNDERAGE("underage"),
    CONSENT("consent"),
    UNKNOWN("unknown");
    
    /* renamed from: B */
    private String f4842B;

    private AnonymousClass0S2(String str) {
        this.f4842B = str;
    }

    /* renamed from: A */
    public final String m4300A() {
        return this.f4842B;
    }

    /* renamed from: B */
    public static AnonymousClass0S2 m4299B(String str) {
        for (AnonymousClass0S2 anonymousClass0S2 : AnonymousClass0S2.values()) {
            if (anonymousClass0S2.m4300A().equals(str)) {
                return anonymousClass0S2;
            }
        }
        return UNKNOWN;
    }
}
