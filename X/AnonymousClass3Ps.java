package X;

/* renamed from: X.3Ps */
public enum AnonymousClass3Ps {
    CONSENT("consent"),
    TEXT("text");
    
    /* renamed from: B */
    private String f40998B;

    private AnonymousClass3Ps(String str) {
        this.f40998B = str;
    }

    /* renamed from: A */
    public final String m19572A() {
        return this.f40998B;
    }

    /* renamed from: B */
    public static AnonymousClass3Ps m19571B(String str) {
        for (AnonymousClass3Ps anonymousClass3Ps : AnonymousClass3Ps.values()) {
            if (anonymousClass3Ps.m19572A().equals(str)) {
                return anonymousClass3Ps;
            }
        }
        return null;
    }
}
