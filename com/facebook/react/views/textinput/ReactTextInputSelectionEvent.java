package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class ReactTextInputSelectionEvent extends Event {
    private int mSelectionEnd;
    private int mSelectionStart;

    public final String getEventName() {
        return "topSelectionChange";
    }

    public ReactTextInputSelectionEvent(int i, int i2, int i3) {
        super(i);
        this.mSelectionStart = i2;
        this.mSelectionEnd = i3;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.mSelectionEnd);
        createMap2.putInt("start", this.mSelectionStart);
        createMap.putMap("selection", createMap2);
        return createMap;
    }
}
