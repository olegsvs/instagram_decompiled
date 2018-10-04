package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.2CQ */
public enum AnonymousClass2CQ {
    ACTIVITY_FEED("newsfeed"),
    EXTERNAL_URL("external_url"),
    FEED("feed_timeline"),
    SINGLE_FEED("single_feed"),
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING),
    NOTIFICATIONS("notifications"),
    STORIES("stories"),
    PROFILE("profile"),
    EXPLORE_TRAY("explore_popular"),
    EXPLORE_GRID("explore_grid"),
    FEED_NETEGO_UNIT("feed_netego");
    
    /* renamed from: B */
    private String f27408B;

    private AnonymousClass2CQ(String str) {
        this.f27408B = str;
    }

    /* renamed from: A */
    public final String m14659A() {
        return this.f27408B;
    }
}
