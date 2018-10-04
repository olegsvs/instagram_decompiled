package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class ReactTextInputKeyPressEvent extends Event {
    private String mKey;

    public final boolean canCoalesce() {
        return false;
    }

    public final String getEventName() {
        return "topKeyPress";
    }

    public ReactTextInputKeyPressEvent(int i, String str) {
        super(i);
        this.mKey = str;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("key", this.mKey);
        return createMap;
    }
}
