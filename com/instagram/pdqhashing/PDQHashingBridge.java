package com.instagram.pdqhashing;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public class PDQHashingBridge {
    private final HybridData mHybridData;

    private static native HybridData initHybrid(String str);

    public native String getHash(String str);

    static {
        AnonymousClass0CF.E("pdqhashing");
    }

    public PDQHashingBridge(String str) {
        this.mHybridData = initHybrid(str);
    }
}
