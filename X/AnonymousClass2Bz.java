package X;

/* renamed from: X.2Bz */
public enum AnonymousClass2Bz {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    NUMBER,
    TEXT,
    DATE;

    /* renamed from: B */
    public static AnonymousClass2Bz m14633B(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (str.equalsIgnoreCase("NUMBER")) {
                    return NUMBER;
                }
                if (str.equalsIgnoreCase("TEXT")) {
                    return TEXT;
                }
                if (str.equalsIgnoreCase("DATE")) {
                    return DATE;
                }
            }
        }
        return UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    }

    public final String toString() {
        return name();
    }
}
