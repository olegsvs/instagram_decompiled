package com.facebook.react.uimanager.events;

import com.facebook.react.common.SystemClock;

public abstract class Event {
    private static int sUniqueID;
    private boolean mInitialized;
    private long mTimestampMs;
    private int mUniqueID;
    private int mViewTag;

    public boolean canCoalesce() {
        return true;
    }

    public abstract void dispatch(RCTEventEmitter rCTEventEmitter);

    public short getCoalescingKey() {
        return (short) 0;
    }

    public abstract String getEventName();

    public void onDispose() {
    }

    public Event() {
        int i = sUniqueID;
        sUniqueID = i + 1;
        this.mUniqueID = i;
    }

    public Event(int i) {
        int i2 = sUniqueID;
        sUniqueID = i2 + 1;
        this.mUniqueID = i2;
        init(i);
    }

    public final Event coalesce(Event event) {
        return getTimestampMs() >= event.getTimestampMs() ? this : event;
    }

    public final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public final int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    public final void init(int i) {
        this.mViewTag = i;
        this.mTimestampMs = SystemClock.uptimeMillis();
        this.mInitialized = true;
    }

    public final boolean isInitialized() {
        return this.mInitialized;
    }
}
