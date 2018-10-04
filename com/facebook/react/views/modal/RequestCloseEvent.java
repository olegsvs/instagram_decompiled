package com.facebook.react.views.modal;

import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class RequestCloseEvent extends Event {
    public final String getEventName() {
        return "topRequestClose";
    }

    public RequestCloseEvent(int i) {
        super(i);
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), null);
    }
}
