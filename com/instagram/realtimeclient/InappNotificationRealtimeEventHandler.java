package com.instagram.realtimeclient;

import X.AnonymousClass0Cm;
import X.AnonymousClass0RG;
import X.AnonymousClass0VS;
import X.AnonymousClass0VT;

public class InappNotificationRealtimeEventHandler extends RealtimeEventHandler {
    private static final Class TAG = InappNotificationRealtimeEventHandler.class;

    private AnonymousClass0VS getNavigationCallback() {
        return null;
    }

    private boolean maybeShowNotification() {
        return true;
    }

    public InappNotificationRealtimeEventHandler(AnonymousClass0Cm anonymousClass0Cm) {
    }

    public boolean canHandleRealtimeEvent(String str, String str2) {
        return RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && str2 != null && str2.equals(GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
    }

    private static void displayInappBanner(String str, String str2, AnonymousClass0VS anonymousClass0VS) {
        AnonymousClass0VT anonymousClass0VT = new AnonymousClass0VT();
        anonymousClass0VT.f5736F = str;
        if (!str2.isEmpty()) {
            anonymousClass0VT.f5735E = str2;
        }
        if (anonymousClass0VS != null) {
            anonymousClass0VT.f5732B = anonymousClass0VS;
        }
        AnonymousClass0RG.D().E(anonymousClass0VT.A());
    }

    public void onRealtimeEventPayload(String str, String str2, String str3) {
        try {
            InappNotificationEventPayload parseFromJson = InappNotificationEventPayload__JsonHelper.parseFromJson(str3);
            if (maybeShowNotification()) {
                displayInappBanner(parseFromJson.getMessageOnBanner(), parseFromJson.getInappUrl(), getNavigationCallback());
            }
        } catch (Throwable e) {
            throw new IllegalStateException("error parsing feedback like event from skywalker", e);
        }
    }
}
