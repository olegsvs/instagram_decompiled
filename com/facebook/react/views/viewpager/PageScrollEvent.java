package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class PageScrollEvent extends Event {
    private final float mOffset;
    private final int mPosition;

    public final String getEventName() {
        return "topPageScroll";
    }

    public PageScrollEvent(int i, int i2, float f) {
        super(i);
        this.mPosition = i2;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        this.mOffset = f;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.mPosition);
        createMap.putDouble("offset", (double) this.mOffset);
        return createMap;
    }
}
