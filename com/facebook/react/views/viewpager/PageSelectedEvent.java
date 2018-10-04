package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class PageSelectedEvent extends Event {
    private final int mPosition;

    public final String getEventName() {
        return "topPageSelected";
    }

    public PageSelectedEvent(int i, int i2) {
        super(i);
        this.mPosition = i2;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.mPosition);
        return createMap;
    }
}
