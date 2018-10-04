package X;

/* renamed from: X.1JN */
public enum AnonymousClass1JN {
    DATA_INVALID,
    DATA_EXPIRED,
    NOTIF_ACKED,
    NOTIF_DUPED,
    BROADCAST_SENT,
    BROADCAST_FAILED,
    PACKAGE_FAILED,
    PACKAGE_INVALID,
    PACKAGE_UNSUPPORTED,
    PACKAGE_INCOMPATIBLE,
    PACKAGE_NOT_INSTALLED,
    PACKAGE_DISABLED,
    PACKAGE_NOT_TRUSTED,
    PACKAGE_TRUSTED,
    PROCESSOR_FAILED;

    /* renamed from: A */
    public final boolean m10689A() {
        if (!(this == DATA_INVALID || this == DATA_EXPIRED || this == PACKAGE_INVALID || this == PACKAGE_UNSUPPORTED || this == PACKAGE_INCOMPATIBLE || this == PACKAGE_NOT_INSTALLED || this == PACKAGE_DISABLED)) {
            if (this != PACKAGE_NOT_TRUSTED) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public final boolean m10690B() {
        if (!(this == NOTIF_ACKED || this == NOTIF_DUPED)) {
            if (this != BROADCAST_SENT) {
                return false;
            }
        }
        return true;
    }
}
