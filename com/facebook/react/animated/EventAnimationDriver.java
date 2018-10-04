package com.facebook.react.animated;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;

public class EventAnimationDriver implements RCTEventEmitter {
    private List mEventPath;
    public ValueAnimatedNode mValueNode;

    public EventAnimationDriver(List list, ValueAnimatedNode valueAnimatedNode) {
        this.mEventPath = list;
        this.mValueNode = valueAnimatedNode;
    }

    public void receiveEvent(int i, String str, WritableMap writableMap) {
        if (writableMap != null) {
            for (int i2 = 0; i2 < this.mEventPath.size() - 1; i2++) {
                writableMap = writableMap.getMap((String) this.mEventPath.get(i2));
            }
            ValueAnimatedNode valueAnimatedNode = this.mValueNode;
            List list = this.mEventPath;
            valueAnimatedNode.mValue = writableMap.getDouble((String) list.get(list.size() - 1));
            return;
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }

    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by native animated events");
    }
}
