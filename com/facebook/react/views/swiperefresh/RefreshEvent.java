package com.facebook.react.views.swiperefresh;

import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class RefreshEvent extends Event {
    public final String getEventName() {
        return "topRefresh";
    }

    public RefreshEvent(int i) {
        super(i);
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), null);
    }
}
