package com.facebook.react.views.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class TopLoadingFinishEvent extends Event {
    private WritableMap mEventData;

    public final boolean canCoalesce() {
        return false;
    }

    public final short getCoalescingKey() {
        return (short) 0;
    }

    public final String getEventName() {
        return "topLoadingFinish";
    }

    public TopLoadingFinishEvent(int i, WritableMap writableMap) {
        super(i);
        this.mEventData = writableMap;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.mEventData);
    }
}
