package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureState;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureType;

public class LongPressGesture extends Gesture {
    public LongPressGesture(long j, float f, float f2, GestureState gestureState, boolean z, float f3, float f4) {
        super(j, f, f2, gestureState, z, f3, f4);
    }

    public final GestureType getGestureType() {
        return GestureType.LONG_PRESS;
    }
}
