package X;

/* renamed from: X.2Bi */
public enum AnonymousClass2Bi {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE,
    POST_ENGAGEMENT,
    LINK_CLICKS,
    VIDEO_VIEWS,
    REACH,
    SEND_MESSAGE,
    WEBSITE_CONVERSIONS,
    LEAD_GENERATION,
    GET_BOOKINGS,
    EVENT_RESPONSES,
    PROFILE_VISITS,
    BRAND_AWARENESS;

    /* renamed from: B */
    public static AnonymousClass2Bi m14616B(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                if (str.equalsIgnoreCase("POST_ENGAGEMENT")) {
                    return POST_ENGAGEMENT;
                }
                if (str.equalsIgnoreCase("LINK_CLICKS")) {
                    return LINK_CLICKS;
                }
                if (str.equalsIgnoreCase("VIDEO_VIEWS")) {
                    return VIDEO_VIEWS;
                }
                if (str.equalsIgnoreCase("REACH")) {
                    return REACH;
                }
                if (str.equalsIgnoreCase("SEND_MESSAGE")) {
                    return SEND_MESSAGE;
                }
                if (str.equalsIgnoreCase("WEBSITE_CONVERSIONS")) {
                    return WEBSITE_CONVERSIONS;
                }
                if (str.equalsIgnoreCase("LEAD_GENERATION")) {
                    return LEAD_GENERATION;
                }
                if (str.equalsIgnoreCase("GET_BOOKINGS")) {
                    return GET_BOOKINGS;
                }
                if (str.equalsIgnoreCase("EVENT_RESPONSES")) {
                    return EVENT_RESPONSES;
                }
                if (str.equalsIgnoreCase("PROFILE_VISITS")) {
                    return PROFILE_VISITS;
                }
                if (str.equalsIgnoreCase("BRAND_AWARENESS")) {
                    return BRAND_AWARENESS;
                }
            }
        }
        return UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    }

    public final String toString() {
        return name();
    }
}
