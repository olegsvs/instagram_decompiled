package com.instagram.realtimeclient;

import X.AnonymousClass0Vi;

public interface RealtimeClientManager$Observer {
    void onConnectionChanged(AnonymousClass0Vi anonymousClass0Vi);

    void onMessage(String str, String str2, String str3);

    void onSendMessage(String str, String str2, String str3, boolean z, Long l);
}
