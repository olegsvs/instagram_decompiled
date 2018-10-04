package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public class CxxCallbackImpl implements Callback {
    private final HybridData mHybridData;

    private native void nativeInvoke(NativeArray nativeArray);

    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
