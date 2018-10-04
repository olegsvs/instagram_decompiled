package X;

/* renamed from: X.1Ac */
public final class AnonymousClass1Ac {
    /* renamed from: B */
    public static volatile Boolean f15305B = null;

    static {
        AnonymousClass0D5.m1097B(new AnonymousClass1Ad());
    }

    /* renamed from: B */
    public static void m9732B() {
        String C = AnonymousClass0D5.m1098C("debug.atrace.app_cmdlines");
        if (C.length() != 0) {
            String[] split = C.split(",");
            String C2 = AnonymousClass0D4.m1096C();
            for (Object equals : split) {
                if (C2.equals(equals)) {
                    f15305B = Boolean.valueOf(true);
                    return;
                }
            }
        }
        f15305B = Boolean.valueOf(false);
    }
}
