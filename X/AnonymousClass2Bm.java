package X;

/* renamed from: X.2Bm */
public enum AnonymousClass2Bm {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    UNSTYLED,
    PARAGRAPH,
    UNORDERED_LIST_ITEM,
    ORDERED_LIST_ITEM,
    BLOCKQUOTE,
    HEADER_ONE,
    HEADER_TWO,
    CODE,
    MEDIA,
    PULLQUOTE,
    HEADER_THREE,
    HEADER_FOUR,
    HEADER_FIVE,
    HEADER_SIX,
    CHECKBOX_LIST_ITEM,
    TABLE,
    THEMATIC_BREAK;

    /* renamed from: B */
    public static AnonymousClass2Bm m14620B(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (str.equalsIgnoreCase("UNSTYLED")) {
                    return UNSTYLED;
                }
                if (str.equalsIgnoreCase("PARAGRAPH")) {
                    return PARAGRAPH;
                }
                if (str.equalsIgnoreCase("UNORDERED_LIST_ITEM")) {
                    return UNORDERED_LIST_ITEM;
                }
                if (str.equalsIgnoreCase("ORDERED_LIST_ITEM")) {
                    return ORDERED_LIST_ITEM;
                }
                if (str.equalsIgnoreCase("BLOCKQUOTE")) {
                    return BLOCKQUOTE;
                }
                if (str.equalsIgnoreCase("HEADER_ONE")) {
                    return HEADER_ONE;
                }
                if (str.equalsIgnoreCase("HEADER_TWO")) {
                    return HEADER_TWO;
                }
                if (str.equalsIgnoreCase("CODE")) {
                    return CODE;
                }
                if (str.equalsIgnoreCase("MEDIA")) {
                    return MEDIA;
                }
                if (str.equalsIgnoreCase("PULLQUOTE")) {
                    return PULLQUOTE;
                }
                if (str.equalsIgnoreCase("HEADER_THREE")) {
                    return HEADER_THREE;
                }
                if (str.equalsIgnoreCase("HEADER_FOUR")) {
                    return HEADER_FOUR;
                }
                if (str.equalsIgnoreCase("HEADER_FIVE")) {
                    return HEADER_FIVE;
                }
                if (str.equalsIgnoreCase("HEADER_SIX")) {
                    return HEADER_SIX;
                }
                if (str.equalsIgnoreCase("CHECKBOX_LIST_ITEM")) {
                    return CHECKBOX_LIST_ITEM;
                }
                if (str.equalsIgnoreCase("TABLE")) {
                    return TABLE;
                }
                if (str.equalsIgnoreCase("THEMATIC_BREAK")) {
                    return THEMATIC_BREAK;
                }
            }
        }
        return UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    }

    public final String toString() {
        return name();
    }
}
