package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class ReactSliderEvent extends Event {
    private final boolean mFromUser;
    private final double mValue;

    public final short getCoalescingKey() {
        return (short) 0;
    }

    public final String getEventName() {
        return "topChange";
    }

    public ReactSliderEvent(int i, double d, boolean z) {
        super(i);
        this.mValue = d;
        this.mFromUser = z;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    public final double getValue() {
        return this.mValue;
    }

    public final boolean isFromUser() {
        return this.mFromUser;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putDouble("value", getValue());
        createMap.putBoolean("fromUser", isFromUser());
        return createMap;
    }
}
