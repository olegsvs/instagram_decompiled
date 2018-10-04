package com.facebook.audiofiltercore;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public class AudioBuffer {
    private HybridData mHybridData = initHybrid();

    private static native HybridData initHybrid();

    public native void appendData(short[] sArr, int i);

    public native void clear();

    public native void getData(short[] sArr);

    public native long getNativeReference();

    public native int getSize();

    public native void setData(short[] sArr, int i);

    static {
        AnonymousClass0CF.E("audiofiltercore");
    }
}
