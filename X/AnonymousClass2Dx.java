package X;

/* renamed from: X.2Dx */
public enum AnonymousClass2Dx {
    SMS("sms"),
    AUTHENTICATOR_APP("authenticator_app"),
    UNKNOWN("unknown");
    
    /* renamed from: B */
    private String f27736B;

    private AnonymousClass2Dx(String str) {
        this.f27736B = str;
    }

    /* renamed from: A */
    public final String m14761A() {
        return this.f27736B;
    }

    /* renamed from: B */
    public static AnonymousClass2Dx m14760B(String str) {
        for (AnonymousClass2Dx anonymousClass2Dx : AnonymousClass2Dx.values()) {
            if (anonymousClass2Dx.m14761A().equals(str)) {
                return anonymousClass2Dx;
            }
        }
        return UNKNOWN;
    }
}
