package com.facebook.react.uimanager;

import com.facebook.common.dextricks.DexStore;
import com.facebook.react.common.ClearableSynchronizedPool;

public final class YogaNodePool {
    private static final Object sInitLock = new Object();
    private static ClearableSynchronizedPool sPool;

    public static ClearableSynchronizedPool get() {
        ClearableSynchronizedPool clearableSynchronizedPool = sPool;
        if (clearableSynchronizedPool == null) {
            synchronized (sInitLock) {
                if (sPool == null) {
                    sPool = new ClearableSynchronizedPool(DexStore.LOAD_RESULT_MIXED_MODE);
                }
                clearableSynchronizedPool = sPool;
            }
        }
        return clearableSynchronizedPool;
    }
}
