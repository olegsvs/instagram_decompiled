package com.instagram.common.notifications.push;

public enum PushChannelType {
    AMAZON("android_adm"),
    GCM("android_gcm"),
    FBNS("android_mqtt"),
    NOKIA("android_nokia");
    
    /* renamed from: B */
    private final String f4664B;

    private PushChannelType(String str) {
        this.f4664B = str;
    }

    /* renamed from: A */
    public final String m4154A() {
        return this.f4664B;
    }
}
