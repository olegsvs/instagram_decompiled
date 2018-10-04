package com.instagram.strings;

import X.AnonymousClass0CF;
import X.AnonymousClass0Dc;

public class StringBridge {
    private static boolean sFailedToLoadStrings = true;

    public static native String getInstagramString(String str);

    public static native String getSignatureString(byte[] bArr);

    static {
        try {
            AnonymousClass0CF.m856E("scrambler");
            AnonymousClass0CF.m856E("strings");
        } catch (Throwable th) {
            AnonymousClass0Dc.m1240C(StringBridge.class, "Failed to load native string libraries", th);
        }
    }

    public static boolean getFailedToLoadStrings() {
        return sFailedToLoadStrings;
    }
}
