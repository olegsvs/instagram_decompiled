package X;

/* renamed from: X.2C2 */
public enum AnonymousClass2C2 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    ANSWER,
    VIEWER,
    QE,
    SESSION,
    TESSA_EVENT,
    QB_OPTIMIZED,
    PREVIOUS_VALUE,
    CONTEXT_DATA,
    GROUP,
    FBT;

    /* renamed from: B */
    public static AnonymousClass2C2 m14636B(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (str.equalsIgnoreCase("ANSWER")) {
                    return ANSWER;
                }
                if (str.equalsIgnoreCase("VIEWER")) {
                    return VIEWER;
                }
                if (str.equalsIgnoreCase("QE")) {
                    return QE;
                }
                if (str.equalsIgnoreCase("SESSION")) {
                    return SESSION;
                }
                if (str.equalsIgnoreCase("TESSA_EVENT")) {
                    return TESSA_EVENT;
                }
                if (str.equalsIgnoreCase("QB_OPTIMIZED")) {
                    return QB_OPTIMIZED;
                }
                if (str.equalsIgnoreCase("PREVIOUS_VALUE")) {
                    return PREVIOUS_VALUE;
                }
                if (str.equalsIgnoreCase("CONTEXT_DATA")) {
                    return CONTEXT_DATA;
                }
                if (str.equalsIgnoreCase("GROUP")) {
                    return GROUP;
                }
                if (str.equalsIgnoreCase("FBT")) {
                    return FBT;
                }
            }
        }
        return UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    }

    public final String toString() {
        return name();
    }
}
