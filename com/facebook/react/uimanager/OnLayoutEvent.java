package com.facebook.react.uimanager;

import X.AnonymousClass0KX;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class OnLayoutEvent extends Event {
    private static final AnonymousClass0KX EVENTS_POOL = new AnonymousClass0KX(20);
    private int mHeight;
    private int mWidth;
    private int mX;
    private int mY;

    public final String getEventName() {
        return "topLayout";
    }

    private OnLayoutEvent() {
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", (double) PixelUtil.toDIPFromPixel((float) this.mX));
        createMap.putDouble("y", (double) PixelUtil.toDIPFromPixel((float) this.mY));
        createMap.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mWidth));
        createMap.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mHeight));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", getViewTag());
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap2);
    }

    public final void init(int i, int i2, int i3, int i4, int i5) {
        super.init(i);
        this.mX = i2;
        this.mY = i3;
        this.mWidth = i4;
        this.mHeight = i5;
    }

    public static OnLayoutEvent obtain(int i, int i2, int i3, int i4, int i5) {
        OnLayoutEvent onLayoutEvent = (OnLayoutEvent) EVENTS_POOL.acquire();
        if (onLayoutEvent == null) {
            onLayoutEvent = new OnLayoutEvent();
        }
        onLayoutEvent.init(i, i2, i3, i4, i5);
        return onLayoutEvent;
    }

    public final void onDispose() {
        EVENTS_POOL.release(this);
    }
}
