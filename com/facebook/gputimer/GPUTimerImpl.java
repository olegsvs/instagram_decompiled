package com.facebook.gputimer;

import X.AnonymousClass0CF;
import X.AnonymousClass0Dc;
import X.AnonymousClass1uz;
import com.facebook.jni.HybridData;

public class GPUTimerImpl implements AnonymousClass1uz {
    private static final Class TAG = GPUTimerImpl.class;
    private HybridData mHybridData = initHybrid();

    private static native HybridData initHybrid();

    public native void beginFrame();

    public native void beginMarker(int i);

    public native int createTimerHandle(String str);

    public native void endFrame();

    public native void endMarker();

    public native void insertMarker(int i);

    static {
        loadLib("gputimer-jni");
    }

    private static void loadLib(String str) {
        try {
            AnonymousClass0CF.E(str);
        } catch (Throwable e) {
            AnonymousClass0Dc.E(TAG, e, "Failed to load: %s", new Object[]{str});
        }
    }
}
