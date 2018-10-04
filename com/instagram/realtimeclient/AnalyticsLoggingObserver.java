package com.instagram.realtimeclient;

import X.AnonymousClass0NN;
import X.AnonymousClass0Vi;
import X.AnonymousClass1Sj;
import java.util.Random;

public class AnalyticsLoggingObserver implements RealtimeClientManager$Observer {
    private int mConnectingCount;
    private long mLastConnectionStatusChangeTimestamp;
    private final Random mRandomGenerator = new Random();
    private final int mReceiveMessageSampleRate;

    public AnalyticsLoggingObserver(int i) {
        this.mReceiveMessageSampleRate = i;
    }

    public void onConnectionChanged(AnonymousClass0Vi anonymousClass0Vi) {
        AnonymousClass0NN B = AnonymousClass0NN.m3291B(RealtimeConstants.CONNECTION_STATUS_EVENT_NAME, null);
        long currentTimeMillis = System.currentTimeMillis();
        if (anonymousClass0Vi.m4898A()) {
            B.m3298F("event_type", RealtimeConstants.MQTT_CONNECTED).m3294B("connecting_count", this.mConnectingCount).m3295C("time_spend", currentTimeMillis - this.mLastConnectionStatusChangeTimestamp);
            B.m3310R();
            this.mConnectingCount = 0;
            this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
            return;
        }
        Object obj;
        if (anonymousClass0Vi.f5766B != AnonymousClass1Sj.CONNECTED) {
            if (anonymousClass0Vi.f5766B != AnonymousClass1Sj.CONNECTING) {
                obj = null;
                if (obj != null) {
                    B.m3298F("event_type", RealtimeConstants.MQTT_DISCONNECTED).m3294B("connecting_count", this.mConnectingCount).m3295C("time_spend", currentTimeMillis - this.mLastConnectionStatusChangeTimestamp);
                    B.m3310R();
                    this.mConnectingCount = 0;
                    this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
                }
                this.mConnectingCount++;
                this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
                if (this.mConnectingCount == 1) {
                    B.m3298F("event_type", RealtimeConstants.MQTT_CONNECTING).m3294B("connecting_count", this.mConnectingCount);
                    B.m3310R();
                    return;
                }
                return;
            }
        }
        obj = 1;
        if (obj != null) {
            this.mConnectingCount++;
            this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
            if (this.mConnectingCount == 1) {
                B.m3298F("event_type", RealtimeConstants.MQTT_CONNECTING).m3294B("connecting_count", this.mConnectingCount);
                B.m3310R();
                return;
            }
            return;
        }
        B.m3298F("event_type", RealtimeConstants.MQTT_DISCONNECTED).m3294B("connecting_count", this.mConnectingCount).m3295C("time_spend", currentTimeMillis - this.mLastConnectionStatusChangeTimestamp);
        B.m3310R();
        this.mConnectingCount = 0;
        this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
    }

    public void onMessage(String str, String str2, String str3) {
        if ((RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || str2 == null || (RealtimeConstants.MQTT_TOPIC_SKYWALKER.equals(str) && !str2.equals("1"))) && this.mRandomGenerator.nextInt(this.mReceiveMessageSampleRate) == 0) {
            AnonymousClass0NN F = AnonymousClass0NN.m3291B(RealtimeConstants.RECEIVE_MESSAGE, null).m3298F("payload", str3).m3298F("mqtt_topic", str);
            String str4 = "sub_topic";
            if (str2 == null) {
                str2 = "unknown";
            }
            F.m3298F(str4, str2).m3310R();
        }
    }

    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        str2 = AnonymousClass0NN.m3291B(z ? RealtimeConstants.SUBSCRIPTION_STATUS_EVENT_NAME : RealtimeConstants.SEND_MESSAGE_EVENT_NAME, null).m3298F("send_message", str2).m3298F("event_type", str3).m3298F("mqtt_topic", str);
        if (l != null) {
            str2.m3295C("send_time", l.longValue());
        }
        str2.m3310R();
    }
}
