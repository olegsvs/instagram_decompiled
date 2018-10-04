package X;

/* renamed from: X.2Bq */
public enum AnonymousClass2Bq {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    LEFT,
    CENTER,
    RIGHT;

    /* renamed from: B */
    public static AnonymousClass2Bq m14624B(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (str.equalsIgnoreCase("LEFT")) {
                    return LEFT;
                }
                if (str.equalsIgnoreCase("CENTER")) {
                    return CENTER;
                }
                if (str.equalsIgnoreCase("RIGHT")) {
                    return RIGHT;
                }
            }
        }
        return UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    }

    public final String toString() {
        return name();
    }
}
