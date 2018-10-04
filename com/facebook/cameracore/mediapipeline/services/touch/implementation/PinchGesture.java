package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureState;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureType;

public class PinchGesture extends Gesture {
    public final float scale;

    public PinchGesture(long j, float f, float f2, float f3, GestureState gestureState, boolean z, float f4, float f5) {
        super(j, f2, f3, gestureState, z, f4, f5);
        this.scale = f;
    }

    public final GestureType getGestureType() {
        return GestureType.PINCH;
    }
}
