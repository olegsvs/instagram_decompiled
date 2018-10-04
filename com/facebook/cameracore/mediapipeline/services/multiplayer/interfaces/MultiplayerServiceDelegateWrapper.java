package com.facebook.cameracore.mediapipeline.services.multiplayer.interfaces;

import X.AnonymousClass2js;
import java.util.HashMap;
import java.util.Map;

public class MultiplayerServiceDelegateWrapper {
    /* renamed from: B */
    private final AnonymousClass2js f33137B;

    /* renamed from: B */
    private static Map m17002B(String[] strArr, String[] strArr2) {
        if (strArr.length == strArr2.length) {
            int length = strArr.length;
            Map hashMap = new HashMap(length);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], strArr2[i]);
            }
            return hashMap;
        }
        throw new IllegalArgumentException("Keys and values should have the same number of elements");
    }

    public void activate() {
        AnonymousClass2js anonymousClass2js = this.f33137B;
        if (anonymousClass2js != null) {
            anonymousClass2js.activate();
        }
    }

    public String getEffectScopedViewerID() {
        AnonymousClass2js anonymousClass2js = this.f33137B;
        return anonymousClass2js != null ? anonymousClass2js.getEffectScopedViewerID() : "0";
    }

    public void sendMessage(String[] strArr, String[] strArr2) {
        if (this.f33137B != null) {
            this.f33137B.sendMessage(m17002B(strArr, strArr2));
        }
    }

    public void sendStateUpdate(String[] strArr, String[] strArr2) {
        if (this.f33137B != null) {
            this.f33137B.sendStateUpdate(m17002B(strArr, strArr2));
        }
    }
}
