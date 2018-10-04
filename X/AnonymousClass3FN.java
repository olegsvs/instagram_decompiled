package X;

/* renamed from: X.3FN */
public enum AnonymousClass3FN {
    f39447G(1),
    CUSTOM_BACK_BUTTON(2),
    SWIPE(3),
    SYSTEM_BACK_BUTTON(4),
    APP_BACKGROUNDED(5),
    POST_VIA_RECIPIENT_PICKERS_OR_REPLY_CAMERA(6),
    USER_LEAVES_GROUP(7),
    KEEP_USER_IN_CAMERA_AFTER_MEDIA_POSTED(8),
    UNKNOWN(-1);
    
    /* renamed from: B */
    private final int f39453B;

    private AnonymousClass3FN(int i) {
        this.f39453B = i;
    }

    /* renamed from: A */
    public final int m19107A() {
        return this.f39453B;
    }

    /* renamed from: B */
    public static AnonymousClass3FN m19106B(int i) {
        for (AnonymousClass3FN anonymousClass3FN : AnonymousClass3FN.values()) {
            if (anonymousClass3FN.f39453B == i) {
                return anonymousClass3FN;
            }
        }
        return UNKNOWN;
    }
}
