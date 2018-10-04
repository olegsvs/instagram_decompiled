package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureState;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture.GestureType;

public class PanGesture extends Gesture {
    public final float translateX;
    public final float translateY;

    public PanGesture(long j, float f, float f2, float f3, float f4, GestureState gestureState, boolean z, float f5, float f6) {
        super(j, f3, f4, gestureState, z, f5, f6);
        this.translateX = f;
        this.translateY = f2;
    }

    public final GestureType getGestureType() {
        return GestureType.PAN;
    }
}
