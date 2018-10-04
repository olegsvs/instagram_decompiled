package com.instagram.realtimeclient;

import X.AnonymousClass0Vi;
import com.instagram.realtimeclient.RealtimeClientManager.MessageDeliveryCallback;

public abstract class RealtimeEventHandler {
    public abstract boolean canHandleRealtimeEvent(String str, String str2);

    public void onMqttChannelStateChanged(AnonymousClass0Vi anonymousClass0Vi) {
    }

    public abstract void onRealtimeEventPayload(String str, String str2, String str3);

    public void onSendRealtimeCommand(String str, MessageDeliveryCallback messageDeliveryCallback) {
    }
}
