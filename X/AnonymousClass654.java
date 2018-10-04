package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;

/* renamed from: X.654 */
public final class AnonymousClass654 extends RealtimeEventHandler {
    /* renamed from: B */
    private final AnonymousClass0F4 f71564B = AnonymousClass0F4.f2058E;

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        return RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) && GraphQLSubscriptionID.IG_INTERACTIVITY_QUERY_ID.equals(str2);
    }

    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        try {
            AnonymousClass658 parseFromJson = AnonymousClass65B.parseFromJson(str3);
            if (parseFromJson != null && parseFromJson.f71570B != null) {
                AnonymousClass0F6 B = AnonymousClass653.m28923B(parseFromJson.f71570B);
                if (B != null) {
                    this.f71564B.B(B);
                }
            }
        } catch (String str4) {
            AnonymousClass0Dc.S("InteractivityEventHandler", str4, "onRealtimeEventPayload exception", new Object[]{str2, str3});
        }
    }
}
