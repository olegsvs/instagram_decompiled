package X;

/* renamed from: X.2Bk */
public enum AnonymousClass2Bk {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    NEW,
    WAITING_FOR_FB,
    WAITING_FOR_ADVERTISER,
    PERMANENTLY_CLOSED;

    /* renamed from: B */
    public static AnonymousClass2Bk m14618B(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (str.equalsIgnoreCase("NEW")) {
                    return NEW;
                }
                if (str.equalsIgnoreCase("WAITING_FOR_FB")) {
                    return WAITING_FOR_FB;
                }
                if (str.equalsIgnoreCase("WAITING_FOR_ADVERTISER")) {
                    return WAITING_FOR_ADVERTISER;
                }
                if (str.equalsIgnoreCase("PERMANENTLY_CLOSED")) {
                    return PERMANENTLY_CLOSED;
                }
            }
        }
        return UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    }

    public final String toString() {
        return name();
    }
}
