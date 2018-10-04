package com.facebook.xanalytics;

import X.AnonymousClass0CF;
import com.facebook.jni.HybridData;

public class XAnalyticsAdapterHolder extends XAnalyticsHolder {
    private final XAnalyticsAdapter mAdapter;

    private static native HybridData initHybrid(XAnalyticsAdapter xAnalyticsAdapter);

    static {
        AnonymousClass0CF.E("xanalyticsadapter-jni");
    }

    public XAnalyticsAdapterHolder(XAnalyticsAdapter xAnalyticsAdapter) {
        super(initHybrid(xAnalyticsAdapter));
        this.mAdapter = xAnalyticsAdapter;
    }

    public void cleanup() {
        this.mAdapter.cleanup();
    }

    public void flush() {
        this.mAdapter.flush();
    }

    public String getStructureSamplingConfig(String str) {
        return this.mAdapter.getStructureSamplingConfig(str);
    }

    public void logCounter(String str, long j) {
        this.mAdapter.logCounter(str, (double) j);
    }

    public void logEvent(String str, String str2) {
        logEvent(str, str2, null);
    }

    public void logEvent(String str, String str2, String str3) {
        this.mAdapter.logEvent(str, str2, str3, false, -1.0d);
    }

    public void logRealtimeEvent(String str, String str2) {
        this.mAdapter.logEvent(str, str2, null, true, -1.0d);
    }

    public void logRealtimeEvent(String str, String str2, String str3) {
        this.mAdapter.logEvent(str, str2, str3, true, -1.0d);
    }
}
