package com.facebook.common.jniexecutors;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

public class AndroidAsyncExecutorFactory {
    private final HybridData mHybridData;

    private static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService);

    static {
        AnonymousClass0CF.E("jniexecutors");
    }

    public AndroidAsyncExecutorFactory(ScheduledExecutorService scheduledExecutorService) {
        this.mHybridData = initHybrid(scheduledExecutorService);
    }
}
