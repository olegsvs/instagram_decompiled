package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class ReactTextInputSubmitEditingEvent extends Event {
    private String mText;

    public final boolean canCoalesce() {
        return false;
    }

    public final String getEventName() {
        return "topSubmitEditing";
    }

    public ReactTextInputSubmitEditingEvent(int i, String str) {
        super(i);
        this.mText = str;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putString("text", this.mText);
        return createMap;
    }
}
