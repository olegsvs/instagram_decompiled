package com.facebook.proxygen.utils;

import com.facebook.proxygen.EventBase;

public class CircularEventLog {
    private EventBase mEventBase;
    private boolean mInitialized;
    private final int mRingSize;

    private native InflightRequestResponseInfo[] getInflightRequestResponseInfos(EventBase eventBase);

    private native String[] getLogLines(EventBase eventBase);

    private native String[] getQuicLogLines(EventBase eventBase);

    private native void init(EventBase eventBase, boolean z, int i);

    private native void markAdhocEvent(EventBase eventBase, String str);

    public CircularEventLog(EventBase eventBase, int i) {
        this.mEventBase = eventBase;
        this.mRingSize = i;
    }

    public InflightRequestResponseInfo[] getInflightRequestResponseInfos() {
        Preconditions.checkState(this.mInitialized, "CircularEventLog was not initialized");
        return getInflightRequestResponseInfos(this.mEventBase);
    }

    public String[] getLogLines() {
        Preconditions.checkState(this.mInitialized, "CircularEventLog was not initialized");
        return getLogLines(this.mEventBase);
    }

    public String[] getQuicLogLines() {
        Preconditions.checkState(this.mInitialized, "CircularEventLog was not initialized");
        return getQuicLogLines(this.mEventBase);
    }

    public void init() {
        init(this.mEventBase, true, this.mRingSize);
        this.mInitialized = true;
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }

    public void markAdhocEvent(String str) {
        Preconditions.checkState(this.mInitialized, "CircularEventLog was not initialized");
        markAdhocEvent(this.mEventBase, str);
    }

    public void nonBlockingInit() {
        init(this.mEventBase, false, this.mRingSize);
        this.mInitialized = true;
    }
}
