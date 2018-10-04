package com.facebook.proxygen.utils;

import com.facebook.proxygen.EventBase;

public class EventBaseFuncLog {
    private EventBase mEventBase;

    private native String getRecentCallsDetails(EventBase eventBase);

    public EventBaseFuncLog(EventBase eventBase) {
        this.mEventBase = eventBase;
    }

    public String getRecentCallsDetails() {
        return getRecentCallsDetails(this.mEventBase);
    }
}
