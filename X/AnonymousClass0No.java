package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;

/* renamed from: X.0No */
public final class AnonymousClass0No extends RealtimeEventHandler {
    public final boolean canHandleRealtimeEvent(String str, String str2) {
        return RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && GraphQLSubscriptionID.LIVE_TYPING_INDICATOR_QUERY_ID.equals(str2);
    }

    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        try {
            AnonymousClass1HZ parseFromJson = AnonymousClass1FQ.parseFromJson(str3);
            if (parseFromJson != null && parseFromJson.f16781B != null) {
                AnonymousClass0F4.f2058E.m1505B(new AnonymousClass1EH(parseFromJson.f16781B));
            }
        } catch (String str4) {
            AnonymousClass0Dc.m1256S("IgLiveTypingIndicatorEventHandler", str4, "onRealtimeEventPayload exception", str2, str3);
        }
    }
}
