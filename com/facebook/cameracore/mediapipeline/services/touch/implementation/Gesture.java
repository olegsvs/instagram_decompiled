package com.facebook.cameracore.mediapipeline.services.touch.implementation;

public abstract class Gesture {
    public final GestureState gestureState;
    public final long id;
    /* renamed from: x */
    public final float f33163x;
    /* renamed from: y */
    public final float f33164y;

    public enum GestureState {
        BEGAN,
        CHANGED,
        ENDED,
        CANCELLED,
        FAILED
    }

    public enum GestureType {
        TAP,
        PAN,
        PINCH,
        ROTATE,
        LONG_PRESS,
        RAW_TOUCH
    }

    public abstract GestureType getGestureType();

    public Gesture(long j, float f, float f2, GestureState gestureState, boolean z, float f3, float f4) {
        this.id = j;
        this.gestureState = gestureState;
        if (!z && f3 > 0.0f) {
            if (f4 > 0.0f) {
                this.f33163x = (f * f3) / f4;
                this.f33164y = (f2 * f4) / f3;
                return;
            }
        }
        this.f33163x = f;
        this.f33164y = f2;
    }

    public String getGestureStateName() {
        return this.gestureState.name();
    }

    public String getGestureTypeName() {
        return getGestureType().name();
    }
}
