package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;

public final class TouchesHelper {
    private static WritableArray createsPointersArray(int i, TouchEvent touchEvent) {
        WritableArray createArray = Arguments.createArray();
        MotionEvent motionEvent = touchEvent.getMotionEvent();
        float x = motionEvent.getX() - touchEvent.getViewX();
        float y = motionEvent.getY() - touchEvent.getViewY();
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", (double) PixelUtil.toDIPFromPixel(motionEvent.getX(i2)));
            createMap.putDouble("pageY", (double) PixelUtil.toDIPFromPixel(motionEvent.getY(i2)));
            float y2 = motionEvent.getY(i2) - y;
            createMap.putDouble("locationX", (double) PixelUtil.toDIPFromPixel(motionEvent.getX(i2) - x));
            createMap.putDouble("locationY", (double) PixelUtil.toDIPFromPixel(y2));
            createMap.putInt("target", i);
            createMap.putDouble("timestamp", (double) touchEvent.getTimestampMs());
            createMap.putDouble("identifier", (double) motionEvent.getPointerId(i2));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    public static void sendTouchEvent(RCTEventEmitter rCTEventEmitter, TouchEventType touchEventType, int i, TouchEvent touchEvent) {
        WritableArray createsPointersArray = createsPointersArray(i, touchEvent);
        MotionEvent motionEvent = touchEvent.getMotionEvent();
        WritableArray createArray = Arguments.createArray();
        if (touchEventType != TouchEventType.MOVE) {
            if (touchEventType != TouchEventType.CANCEL) {
                if (touchEventType != TouchEventType.START) {
                    if (touchEventType != TouchEventType.END) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown touch type: ");
                        stringBuilder.append(touchEventType);
                        throw new RuntimeException(stringBuilder.toString());
                    }
                }
                createArray.pushInt(motionEvent.getActionIndex());
                rCTEventEmitter.receiveTouches(touchEventType.getJSEventName(), createsPointersArray, createArray);
            }
        }
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            createArray.pushInt(i2);
        }
        rCTEventEmitter.receiveTouches(touchEventType.getJSEventName(), createsPointersArray, createArray);
    }
}
