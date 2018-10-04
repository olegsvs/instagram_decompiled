package X;

/* renamed from: X.19c */
public enum AnonymousClass19c {
    NO_VERSION,
    BASE,
    REMOVE_UPLOADED_DECOR_IMAGE,
    MIGRATION_TEST;

    /* renamed from: A */
    public void mo2179A(AnonymousClass0OA anonymousClass0OA) {
    }

    /* renamed from: B */
    public static void m9686B(AnonymousClass0OA anonymousClass0OA) {
        if (anonymousClass0OA.xC == null) {
            anonymousClass0OA.xC = NO_VERSION;
        }
        anonymousClass0OA.GC = anonymousClass0OA.xC;
        int ordinal = anonymousClass0OA.xC.ordinal();
        while (true) {
            ordinal++;
            if (ordinal < AnonymousClass19c.values().length) {
                AnonymousClass19c anonymousClass19c = AnonymousClass19c.values()[ordinal];
                anonymousClass0OA.xC = anonymousClass19c;
                anonymousClass19c.mo2179A(anonymousClass0OA);
            } else {
                return;
            }
        }
    }
}
