package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;

public final class ContentSizeChangeEvent extends Event {
    private final int mHeight;
    private final int mWidth;

    public final String getEventName() {
        return "topContentSizeChange";
    }

    public ContentSizeChangeEvent(int i, int i2, int i3) {
        super(i);
        this.mWidth = i2;
        this.mHeight = i3;
    }

    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("width", (double) PixelUtil.toDIPFromPixel((float) this.mWidth));
        createMap.putDouble("height", (double) PixelUtil.toDIPFromPixel((float) this.mHeight));
        rCTEventEmitter.receiveEvent(getViewTag(), "topContentSizeChange", createMap);
    }
}
