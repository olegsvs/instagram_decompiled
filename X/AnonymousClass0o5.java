package X;

/* renamed from: X.0o5 */
public enum AnonymousClass0o5 {
    PROFILE_HEADER("instagram_profile_page"),
    PROFILE_PROMPT("instagram_profile_page_prompt"),
    PROFILE_TOOLTIP("instagram_self_profile_tooltip"),
    PROFILE_OTHER_HEADER("instagram_other_profile_page_header"),
    PROFILE_OTHER_PROMPT("instagram_other_profile_page_prompt"),
    PROFILE_OTHER_TOOLTIP("instagram_other_profile_tooltip"),
    FEED_HEADER("instagram_feed_header"),
    FEED_PROMPT("instagram_feed_prompt"),
    FEED_TOOLTIP("instagram_feed_tool_tip"),
    HASHTAG_FEED_TOOLTIP("instagram_hashtag_feed_tooltip"),
    INBOX_HEADER("instagram_inbox_header"),
    INBOX_PROMPT("instagram_inbox_prompt"),
    DIRECT_APP_INBOX_HEADER("direct_inbox_header"),
    DIRECT_APP_INBOX_PROMPT("direct_inbox_prompt"),
    ACTIVITY_FEED_HEADER("instagram_activity_feed_header"),
    ACTIVITY_FEED_PROMPT("instagram_activity_feed_prompt"),
    EXPLORE_HEADER("instagram_explore_header"),
    EXPLORE_PROMPT("instagram_explore_prompt"),
    SHOPPING_PRODUCT_DETAILS_LOADED("instagram_shopping_product_details_loaded"),
    LOCATION_PAGE_INFO_LOADED("instagram_location_page_info_loaded");
    
    /* renamed from: B */
    private final String f10222B;

    private AnonymousClass0o5(String str) {
        this.f10222B = str;
    }

    /* renamed from: B */
    public static AnonymousClass0o5 m7679B(String str) {
        for (AnonymousClass0o5 anonymousClass0o5 : AnonymousClass0o5.values()) {
            if (anonymousClass0o5.f10222B.equals(str)) {
                return anonymousClass0o5;
            }
        }
        return null;
    }
}
