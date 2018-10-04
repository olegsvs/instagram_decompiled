package com.facebook.native_bridge;

import X.AnonymousClass0CF;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.jni.HybridData;

public class NativeLocationManager {
    private static final double[] EMPTY = new double[]{StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED};
    private final HybridData mHybridData;

    private native HybridData initHybrid();

    static {
        AnonymousClass0CF.E("native_bridge");
    }
}
