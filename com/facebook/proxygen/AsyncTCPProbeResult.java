package com.facebook.proxygen;

public class AsyncTCPProbeResult {
    private final String mErrorMsg;
    private final boolean mHasError;
    private final String mHostAndPort;
    private final int mRTTInMs;
    private final int mRTTStdDevInMs;
    private final String mRegion;
    private final int mTTFBInMs;

    public AsyncTCPProbeResult(String str, String str2, boolean z, String str3, int i, int i2, int i3) {
        this.mHostAndPort = str;
        this.mRegion = str2;
        this.mHasError = z;
        this.mErrorMsg = str3;
        this.mRTTInMs = i;
        this.mRTTStdDevInMs = i2;
        this.mTTFBInMs = i3;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getHostAndPort() {
        return this.mHostAndPort;
    }

    public int getRTT() {
        return this.mRTTInMs;
    }

    public int getRTTStdDev() {
        return this.mRTTStdDevInMs;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public int getTTFB() {
        return this.mTTFBInMs;
    }

    public boolean hasError() {
        return this.mHasError;
    }
}
