package com.facebook.proxygen;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;

public class NetworkStatusMonitor extends NativeHandleImpl {
    private BandwidthEstimate mBandwidthEstimate;
    private int mBandwidthSplitSize = 10000;
    private int mCacheDurationInSeconds = 2;
    private NetworkStatus mCacheStatus;
    private int mDNSPort;
    private boolean mDNSReachabilityEnabled;
    private String mDNSServer;
    private final EventBase mEventBase;
    private int mGoodDL = 2000000;
    private int mGoodRtt = 50;
    private int mGoodUL = 400000;
    private String mHostname;
    private boolean mInitialized;
    private int mMaxPriority = 7;
    private int mModerateDL = 550000;
    private int mModerateRtt = 150;
    private int mModerateUL = 110000;
    private int mPoorDL = 150000;
    private int mPoorRtt = StartupQEsConfig.DEFAULT_NON_CRITICAL_INEED_INIT_IDLE_DELAY;
    private int mPoorUL = 30000;
    private boolean mRadioMonitorEnabled;

    private native BandwidthEstimate getBandwidthEstimateNative();

    private native void getNetworkStatusNative();

    public native void close();

    public native HashMap getAccumulativeRadioCounterData();

    public native int getDownloadBandwidthQualityNative();

    public native long[] getInboundConnectionLevelTraceDataNative();

    public native long[] getInboundHistogramTraceDataNative();

    public native int getLatencyQualityNative();

    public String getNetworkQualityString(int i) {
        switch (i) {
            case 1:
                return "POOR";
            case 2:
                return "MODERATE";
            case 3:
                return "GOOD";
            case 4:
                return "EXCELLENT";
            default:
                return "UNKNOWN";
        }
    }

    public native HashMap getRadioData();

    public native int getUploadBandwidthQualityNative();

    public native void init(EventBase eventBase, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z);

    public native void setNetworkType(int i, int i2);

    public native long startInboundConnectionLevelTracingNative();

    public native long startInboundHistogramTracingNative(int i);

    public native void stopInboundConnectionLevelTracingNative();

    public native void stopInboundHistogramTracingNative();

    public NetworkStatusMonitor(EventBase eventBase) {
        String str = JsonProperty.USE_DEFAULT_NAME;
        this.mDNSServer = str;
        this.mHostname = str;
        this.mEventBase = eventBase;
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public BandwidthEstimate getBandwidthEstimate() {
        if (!this.mInitialized) {
            return null;
        }
        BandwidthEstimate bandwidthEstimateNative = getBandwidthEstimateNative();
        this.mBandwidthEstimate = bandwidthEstimateNative;
        return bandwidthEstimateNative;
    }

    public NetworkStatus getNetworkStatus() {
        if (!this.mInitialized) {
            return null;
        }
        getNetworkStatusNative();
        return this.mCacheStatus;
    }

    public void init(int i) {
        init(this.mEventBase, i, this.mMaxPriority, this.mBandwidthSplitSize, this.mCacheDurationInSeconds, this.mPoorRtt, this.mModerateRtt, this.mGoodRtt, this.mPoorUL, this.mModerateUL, this.mGoodUL, this.mPoorDL, this.mModerateDL, this.mGoodDL, this.mRadioMonitorEnabled);
        this.mInitialized = true;
    }

    public boolean isDNSReachabilityEnabled() {
        return this.mDNSReachabilityEnabled;
    }

    public void setBandwidthSplitSize(int i) {
        this.mBandwidthSplitSize = i;
    }

    public void setCacheDuration(int i) {
        this.mCacheDurationInSeconds = i;
    }

    public void setDNSPort(int i) {
        this.mDNSPort = i;
    }

    public void setDNSReachabilityEnabled(boolean z) {
        this.mDNSReachabilityEnabled = z;
    }

    public void setDNSServer(String str) {
        this.mDNSServer = str;
    }

    public void setHostname(String str) {
        this.mHostname = str;
    }

    public void setMaxPriority(int i) {
        this.mMaxPriority = i;
    }

    public void setQualityBenchmarks(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.mPoorRtt = i;
        this.mModerateRtt = i2;
        this.mGoodRtt = i3;
        this.mPoorUL = i4;
        this.mModerateUL = i5;
        this.mGoodUL = i6;
        this.mPoorDL = i7;
        this.mModerateDL = i8;
        this.mGoodDL = i9;
    }

    public void setRadioMonitorEnabled(boolean z) {
        this.mRadioMonitorEnabled = z;
    }
}
