package com.facebook.hermes.reactexecutor;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.util.concurrent.ScheduledExecutorService;

public class HermesExecutor extends JavaScriptExecutor {
    private static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService, double d, RuntimeConfig runtimeConfig);

    public final String getName() {
        return "HermesExecutor";
    }

    static {
        AnonymousClass0CF.E("hermes-executor");
    }

    public HermesExecutor(ScheduledExecutorService scheduledExecutorService, double d, RuntimeConfig runtimeConfig) {
        super(initHybrid(scheduledExecutorService, d, runtimeConfig));
    }
}
