package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class ReactSlidingCompleteEvent extends Event {
    private final double mValue;

    public final boolean canCoalesce() {
        return false;
    }

    public final short getCoalescingKey() {
        return (short) 0;
    }

    public final String getEventName() {
        return "topSlidingComplete";
    }

    public ReactSlidingCompleteEvent(int i, double d) {
        super(i);
        this.mValue = d;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    public final double getValue() {
        return this.mValue;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putDouble("value", getValue());
        return createMap;
    }
}
