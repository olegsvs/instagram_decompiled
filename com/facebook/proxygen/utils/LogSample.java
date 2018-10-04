package com.facebook.proxygen.utils;

public class LogSample {
    private final String mMessage;
    private final long mTimeStamp;

    public LogSample(long j, String str) {
        this.mTimeStamp = j;
        this.mMessage = str;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public long getTimeStamp() {
        return this.mTimeStamp;
    }
}
