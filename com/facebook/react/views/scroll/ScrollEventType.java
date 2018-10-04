package com.facebook.react.views.scroll;

public enum ScrollEventType {
    BEGIN_DRAG("topScrollBeginDrag"),
    END_DRAG("topScrollEndDrag"),
    SCROLL("topScroll"),
    MOMENTUM_BEGIN("topMomentumScrollBegin"),
    MOMENTUM_END("topMomentumScrollEnd");
    
    private final String mJSEventName;

    private ScrollEventType(String str) {
        this.mJSEventName = str;
    }

    public final String getJSEventName() {
        return this.mJSEventName;
    }
}
