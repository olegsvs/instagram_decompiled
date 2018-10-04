package X;

/* renamed from: X.2Bx */
public enum AnonymousClass2Bx {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    TEXT,
    INLINE_SELECT,
    SELECT,
    MESSENGER_CHECKBOX,
    CONDITIONAL_ANSWER,
    STORE_LOOKUP,
    STORE_LOOKUP_WITH_TYPEAHEAD,
    DATE_TIME_PICKER,
    PHOTO;

    /* renamed from: B */
    public static AnonymousClass2Bx m14631B(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (str.equalsIgnoreCase("TEXT")) {
                    return TEXT;
                }
                if (str.equalsIgnoreCase("INLINE_SELECT")) {
                    return INLINE_SELECT;
                }
                if (str.equalsIgnoreCase("SELECT")) {
                    return SELECT;
                }
                if (str.equalsIgnoreCase("MESSENGER_CHECKBOX")) {
                    return MESSENGER_CHECKBOX;
                }
                if (str.equalsIgnoreCase("CONDITIONAL_ANSWER")) {
                    return CONDITIONAL_ANSWER;
                }
                if (str.equalsIgnoreCase("STORE_LOOKUP")) {
                    return STORE_LOOKUP;
                }
                if (str.equalsIgnoreCase("STORE_LOOKUP_WITH_TYPEAHEAD")) {
                    return STORE_LOOKUP_WITH_TYPEAHEAD;
                }
                if (str.equalsIgnoreCase("DATE_TIME_PICKER")) {
                    return DATE_TIME_PICKER;
                }
                if (str.equalsIgnoreCase("PHOTO")) {
                    return PHOTO;
                }
            }
        }
        return UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    }

    public final String toString() {
        return name();
    }
}
