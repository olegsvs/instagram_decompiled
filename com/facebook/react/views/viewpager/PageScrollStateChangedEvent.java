package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class PageScrollStateChangedEvent extends Event {
    private final String mPageScrollState;

    public final String getEventName() {
        return "topPageScrollStateChanged";
    }

    public PageScrollStateChangedEvent(int i, String str) {
        super(i);
        this.mPageScrollState = str;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("pageScrollState", this.mPageScrollState);
        return createMap;
    }
}
