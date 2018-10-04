package X;

/* renamed from: X.0K7 */
public enum AnonymousClass0K7 {
    YES,
    NO,
    UNSET;

    /* renamed from: A */
    public final boolean m2764A(boolean z) {
        switch (ordinal()) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return z;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized TriState value: ");
                stringBuilder.append(this);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: B */
    public static AnonymousClass0K7 m2762B(Boolean bool) {
        return bool != null ? AnonymousClass0K7.m2763C(bool.booleanValue()) : UNSET;
    }

    /* renamed from: B */
    public final Boolean m2765B() {
        switch (ordinal()) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.FALSE;
            case 2:
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized TriState value: ");
                stringBuilder.append(this);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: C */
    public static AnonymousClass0K7 m2763C(boolean z) {
        return z ? YES : NO;
    }
}
