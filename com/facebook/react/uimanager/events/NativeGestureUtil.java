package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.RootViewUtil;

public final class NativeGestureUtil {
    public static void notifyNativeGestureStarted(View view, MotionEvent motionEvent) {
        RootViewUtil.getRootView(view).onChildStartedNativeGesture(motionEvent);
    }
}
