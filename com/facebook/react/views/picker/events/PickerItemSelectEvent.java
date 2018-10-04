package com.facebook.react.views.picker.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class PickerItemSelectEvent extends Event {
    private final int mPosition;

    public final String getEventName() {
        return "topSelect";
    }

    public PickerItemSelectEvent(int i, int i2) {
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
