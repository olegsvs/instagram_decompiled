package com.facebook.profilo.provider.threadmetadata;

import X.AnonymousClass0CJ;
import com.facebook.profilo.ipc.TraceContext;
import java.io.File;

public final class ThreadMetadataProvider extends AnonymousClass0CJ {
    private static native void nativeLogThreadMetadata();

    public final void disable() {
    }

    public final void enable() {
    }

    public final int getSupportedProviders() {
        return -1;
    }

    public final int getTracingProviders() {
        return 0;
    }

    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }

    public final void onTraceEnded(TraceContext traceContext, File file) {
        nativeLogThreadMetadata();
    }
}
