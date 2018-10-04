package X;

/* renamed from: X.2rb */
public enum AnonymousClass2rb {
    DEFAULT(0),
    REFRESH_AFTER_FINISH_INIT(1),
    REFRESH_AFTER_FINISH_CURRENT(2);
    
    /* renamed from: B */
    public final int f35095B;

    private AnonymousClass2rb(int i) {
        this.f35095B = i;
    }

    /* renamed from: B */
    public static AnonymousClass2rb m17504B(int i) {
        for (AnonymousClass2rb anonymousClass2rb : AnonymousClass2rb.values()) {
            if (anonymousClass2rb.f35095B == i) {
                return anonymousClass2rb;
            }
        }
        return DEFAULT;
    }
}
