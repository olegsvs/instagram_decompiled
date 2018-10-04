package com.facebook.proxygen;

public interface PushCallbacks {
    void pushConnected(String str, String str2);

    void pushOrphaned(String str, String str2);

    void pushStarted(String str, String str2);
}
