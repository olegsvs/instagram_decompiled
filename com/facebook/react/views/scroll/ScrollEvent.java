package com.facebook.react.views.scroll;

import X.AnonymousClass0KX;
import X.AnonymousClass0LR;
import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public final class ScrollEvent extends Event {
    private static final AnonymousClass0KX EVENTS_POOL = new AnonymousClass0KX(3);
    private int mContentHeight;
    private int mContentWidth;
    private ScrollEventType mScrollEventType;
    private int mScrollViewHeight;
    private int mScrollViewWidth;
    private int mScrollX;
    private int mScrollY;
    private double mXVelocity;
    private double mYVelocity;

    public final short getCoalescingKey() {
        return (short) 0;
    }

    private ScrollEvent() {
    }

    public final boolean canCoalesce() {
        return this.mScrollEventType == ScrollEventType.SCROLL;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    public final String getEventName() {
        return ((ScrollEventType) AnonymousClass0LR.D(this.mScrollEventType)).getJSEventName();
    }

    private void init(int i, ScrollEventType scrollEventType, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        super.init(i);
        this.mScrollEventType = scrollEventType;
        this.mScrollX = i2;
        this.mScrollY = i3;
        this.mXVelocity = (double) f;
        this.mYVelocity = (double) f2;
        this.mContentWidth = i4;
        this.mContentHeight = i5;
        this.mScrollViewWidth = i6;
        this.mScrollViewHeight = i7;
    }

    public static ScrollEvent obtain(int i, ScrollEventType scrollEventType, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        ScrollEvent scrollEvent = (ScrollEvent) EVENTS_POOL.acquire();
        if (scrollEvent == null) {
            scrollEvent = new ScrollEvent();
        }
        scrollEvent.init(i, scrollEventType, i2, i3, f, f2, i4, i5, i6, i7);
        return scrollEvent;
    }

    public final void onDispose() {
        EVENTS_POOL.release(this);
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        createMap.putDouble("bottom", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        createMap.putDouble("left", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        createMap.putDouble("right", StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", (double) PixelUtil.toDIPFromPixel((float) this.mScrollX));
        createMap2.putDouble("y", (double) PixelUtil.toDIPFromPixel((float) this.mScrollY));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mContentWidth));
        createMap3.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mContentHeight));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mScrollViewWidth));
        createMap4.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mScrollViewHeight));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", this.mXVelocity);
        createMap5.putDouble("y", this.mYVelocity);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", getViewTag());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }
}
