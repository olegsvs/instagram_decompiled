package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.0Qf */
public enum AnonymousClass0Qf {
    MAIN_FEED_TRAY("feed_timeline"),
    IN_FEED_STORIES_TRAY("stories_netego"),
    IN_FEED_HIGHLIGHTS_TRAY("highlights_netego"),
    PROFILE("profile"),
    PROFILE_HIGHLIGHTS_TRAY("highlight_profile"),
    PROFILE_HIGHLIGHT_PERMALINK("profile_highlight_permalink"),
    PROFILE_SUGGESTED_HIGHLIGHT("suggested_highlight_profile"),
    HIGHLIGHT_STICKER("highlight_sticker"),
    ARCHIVE("archive"),
    ARCHIVE_SUGGESTED_HIGHLIGHT("suggested_highlight_archive"),
    DASHBOARD("dashboard"),
    DIRECT_APP_SELF_PROFILE("direct_app_self_profile"),
    DIRECT_APP_STORIES_TAB("direct_app_stories_tab"),
    EXPLORE("explore_popular"),
    EXPLORE_LIVE("explore_live_popular"),
    EXPLORE_FEED_ITEM_HEADER("feed_contextual_post_item_header"),
    SINGLE_FEED_ITEM_HEADER("single_post"),
    ACTIVITY_FEED("activity_feed"),
    FOLLOW_LIST("follow_list"),
    LIKES_LIST("liker_list"),
    COMMENTS("comment"),
    REEL_VIEWER_LIST("story_viewer_list"),
    TOP_LIVE("top_live"),
    PUSH_NOTIFICATION("push_notification"),
    IN_APP_NOTIFICATION("in_app_notification"),
    DISCOVER_PEOPLE("discover_people"),
    FEED_ITEM_HEADER("feed_timeline_item_header"),
    SEARCH_ITEM_HEADER("search_item_header"),
    SUGGESTED_LIVE("suggested_live"),
    LOCATION_FEED("location_feed"),
    HASHTAG_FEED("hashtag_feed"),
    FEATURED_USER("featured_user"),
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING),
    VERTICAL_STORY_TRAY("vertical_story_tray"),
    RATE_ADS("rate_ads"),
    BAKEOFF("bakeoff"),
    DIRECT_STORY_RESHARE("direct_story_reshare"),
    CALENDAR("calendar"),
    BRANDED_CONTENT("branded_content"),
    DIRECT_SHARE_SHEET("direct_share_sheet"),
    BUSINESS_INSIGHTS("business_insights"),
    BUSINESS_TUTORIALS("business_tutorials"),
    TRAY_IN_VIEWER("tray_in_viewer"),
    SCHOOL_DIRECTORY("school_directory"),
    INSTAGRAM_SHOPPING_PDP("instagram_shopping_pdp"),
    SHOPPING_PRODUCT_DETAILS_PAGE("shopping_product_details_page"),
    RESHARED_REELS_VIEWER("reshared_reels_viewer"),
    FOLLOW_SHOWCASE("follow_showcase"),
    UNKNOWN("unknown");
    
    /* renamed from: B */
    private String f4406B;

    private AnonymousClass0Qf(String str) {
        this.f4406B = str;
    }

    /* renamed from: A */
    public final String m4038A() {
        return this.f4406B;
    }

    /* renamed from: B */
    public final boolean m4039B() {
        if (this != MAIN_FEED_TRAY) {
            if (this != IN_FEED_STORIES_TRAY) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public final boolean m4040C() {
        if (!(this == EXPLORE || this == EXPLORE_LIVE || this == TOP_LIVE)) {
            if (this != DISCOVER_PEOPLE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m4041D() {
        if (!(this == MAIN_FEED_TRAY || this == IN_FEED_STORIES_TRAY || this == RATE_ADS || this == BAKEOFF || this == PUSH_NOTIFICATION)) {
            if (this != ACTIVITY_FEED) {
                return false;
            }
        }
        return true;
    }
}
