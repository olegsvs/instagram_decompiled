package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;

public class RuntimeConfig {
    private final HybridData mHybridData;

    private RuntimeConfig(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
