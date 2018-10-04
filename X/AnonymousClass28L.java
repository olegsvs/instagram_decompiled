package X;

/* renamed from: X.28L */
public enum AnonymousClass28L {
    Never("never"),
    Always("always");
    
    /* renamed from: B */
    private final String f26500B;

    private AnonymousClass28L(String str) {
        this.f26500B = str;
    }

    /* renamed from: A */
    public final String m14547A() {
        return this.f26500B;
    }

    /* renamed from: B */
    public static AnonymousClass28L m14546B(String str) {
        for (AnonymousClass28L anonymousClass28L : AnonymousClass28L.values()) {
            if (anonymousClass28L.m14547A().equals(str)) {
                return anonymousClass28L;
            }
        }
        return Never;
    }
}
