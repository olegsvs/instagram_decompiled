package X;

/* renamed from: X.5Nu */
public enum AnonymousClass5Nu {
    NORMAL,
    WEAK,
    CRITICAL;

    /* renamed from: B */
    public static AnonymousClass5Nu m26384B(int i) {
        switch (i) {
            case 0:
                return NORMAL;
            case 1:
                return WEAK;
            case 2:
                return CRITICAL;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown state value: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
