package com.facebook.react.views.webview.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class TopMessageEvent extends Event {
    private final String mData;

    public final boolean canCoalesce() {
        return false;
    }

    public final short getCoalescingKey() {
        return (short) 0;
    }

    public final String getEventName() {
        return "topMessage";
    }

    public TopMessageEvent(int i, String str) {
        super(i);
        this.mData = str;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("data", this.mData);
        rCTEventEmitter.receiveEvent(getViewTag(), "topMessage", createMap);
    }
}
