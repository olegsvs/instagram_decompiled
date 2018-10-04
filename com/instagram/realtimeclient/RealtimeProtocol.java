package com.instagram.realtimeclient;

public class RealtimeProtocol {
    public static final String ADD_DIRECT_V2_INDICATE_ACTIVITY_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/activity_indicator_id/:direct_v2_activity_indicator_id";
    public static final String DIRECT_V2 = "/direct_v2";
    public static final String DIRECT_V2_ACTIVITY_INDICATOR = "activity_indicator_id";
    public static final String DIRECT_V2_ACTIVITY_INDICATOR_ID = "direct_v2_activity_indicator_id";
    public static final String DIRECT_V2_HAS_SEEN = "has_seen";
    public static final String DIRECT_V2_INBOX = "inbox";
    public static final String DIRECT_V2_INBOX_NEWTHREAD_PREFIX = "/direct_v2/inbox/threads";
    public static final String DIRECT_V2_INBOX_NEWTHREAD_TEMPLATE = "/direct_v2/inbox/threads/:direct_v2_thread_id";
    public static final String DIRECT_V2_INBOX_PREFIX = "/direct_v2/inbox";
    public static final String DIRECT_V2_ITEM_ID = "direct_v2_item_id";
    public static final String DIRECT_V2_PARTICIPANTS = "participants";
    public static final String DIRECT_V2_STORIES = "visual_threads";
    public static final String DIRECT_V2_STORIES_PREFIX = "/direct_v2/visual_threads";
    public static final String DIRECT_V2_STORY = "visual_thread";
    public static final String DIRECT_V2_STORY_ACTION_BADGE = "visual_action_badge";
    public static final String DIRECT_V2_STORY_ACTION_BADGE_PREFIX = "/direct_v2/visual_action_badge";
    public static final String DIRECT_V2_STORY_INBOX = "visual_inbox";
    public static final String DIRECT_V2_STORY_INBOX_PREFIX = "/direct_v2/visual_inbox";
    public static final String DIRECT_V2_STORY_PREFIX = "/direct_v2/visual_thread";
    public static final String DIRECT_V2_THREAD = "threads";
    public static final String DIRECT_V2_THREAD_ID = "direct_v2_thread_id";
    public static final String DIRECT_V2_THREAD_MESSAGE_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/items/:direct_v2_item_id";
    public static final String DIRECT_V2_THREAD_PREFIX = "/direct_v2/threads";
    public static final String DIRECT_V2_UNSEEN_COUNT = "unseen_count";
    public static final String DIRECT_V2_USER_ID = "direct_v2_user_id";
    public static final String IG_LIVE = "/broadcast";
    public static final String INBOX = "inbox";
    private static final String ITEMS = "items";
    public static final String REPLACE_DIRECT_V2_MESSAGE_HAS_SEEN_TEMPLATE = "/direct_v2/threads/:direct_v2_thread_id/participants/:direct_v2_user_id/has_seen";
}
