package com.instagram.realtimeclient;

public class RawSkywalkerSubscription {
    private static final String REALTIME_USER_TOPIC_PREFIX = "ig/u/v1/";
    private static final String SKYWALKER_USER_LIVE_TOPIC_PREFIX = "ig/live_notification_subscribe/";

    public static String getLiveNotificationTopicSubscription(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SKYWALKER_USER_LIVE_TOPIC_PREFIX);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public static String getUserTopicSubscription(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(REALTIME_USER_TOPIC_PREFIX);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
