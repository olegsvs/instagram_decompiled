package com.facebook.proxygen;

public class AsyncTracerouteHop {
    public String mErrorMsg;
    public String mGateway;
    public int mRTTInMs;
    public int mTtl;

    public AsyncTracerouteHop(String str, String str2, int i, int i2) {
        this.mTtl = i;
        this.mRTTInMs = i2;
        this.mGateway = str;
        this.mErrorMsg = str2;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getGateway() {
        return this.mGateway;
    }

    public int getRTT() {
        return this.mRTTInMs;
    }

    public int getTTL() {
        return this.mTtl;
    }
}
