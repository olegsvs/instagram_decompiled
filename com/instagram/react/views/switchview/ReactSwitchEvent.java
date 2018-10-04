package com.instagram.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class ReactSwitchEvent extends Event {
    private final boolean mIsChecked;

    public final short getCoalescingKey() {
        return (short) 0;
    }

    public final String getEventName() {
        return "topChange";
    }

    public ReactSwitchEvent(int i, boolean z) {
        super(i);
        this.mIsChecked = z;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    public final boolean getIsChecked() {
        return this.mIsChecked;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putBoolean("value", getIsChecked());
        return createMap;
    }
}
