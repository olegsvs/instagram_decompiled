package com.facebook.native_bridge;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public class NativeDataPromise {
    private final HybridData mHybridData;

    public native void setException(String str);

    public native void setValue(Object obj);

    static {
        AnonymousClass0CF.E("native_bridge");
    }

    private NativeDataPromise(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
