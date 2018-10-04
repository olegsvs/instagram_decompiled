package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class ReactTextInputFocusEvent extends Event {
    public final boolean canCoalesce() {
        return false;
    }

    public final String getEventName() {
        return "topFocus";
    }

    public ReactTextInputFocusEvent(int i) {
        super(i);
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        return createMap;
    }
}
