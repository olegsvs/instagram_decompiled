package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class ReactContentSizeChangedEvent extends Event {
    private float mContentHeight;
    private float mContentWidth;

    public final String getEventName() {
        return "topContentSizeChange";
    }

    public ReactContentSizeChangedEvent(int i, float f, float f2) {
        super(i);
        this.mContentWidth = f;
        this.mContentHeight = f2;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", (double) this.mContentWidth);
        createMap2.putDouble("height", (double) this.mContentHeight);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt("target", getViewTag());
        return createMap;
    }
}
