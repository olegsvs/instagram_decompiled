package com.facebook.hybridlogsink;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;
import com.fasterxml.jackson.databind.JsonMappingException;

public class HybridLogSink {
    private final HybridData mHybridData;

    private static native HybridData initHybrid(int i);

    public native String[] getLogMessages();

    static {
        AnonymousClass0CF.E("hybridlogsinkjni");
    }

    public HybridLogSink() {
        this(JsonMappingException.MAX_REFS_TO_LIST);
    }

    public HybridLogSink(int i) {
        if (i > 0) {
            this.mHybridData = initHybrid(i);
            return;
        }
        throw new IllegalArgumentException("maxLogLines must be positive");
    }
}
