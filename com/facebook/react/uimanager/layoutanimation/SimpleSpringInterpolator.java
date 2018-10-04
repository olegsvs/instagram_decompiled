package com.facebook.react.uimanager.layoutanimation;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

public final class SimpleSpringInterpolator implements Interpolator {
    private final float mSpringDamping;

    public SimpleSpringInterpolator() {
        this.mSpringDamping = 0.5f;
    }

    public SimpleSpringInterpolator(float f) {
        this.mSpringDamping = f;
    }

    public final float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.mSpringDamping;
        double d = (double) (f - (f2 / 4.0f));
        Double.isNaN(d);
        d = (d * 3.141592653589793d) * 2.0d;
        double d2 = (double) f2;
        Double.isNaN(d2);
        return (float) ((pow * Math.sin(d / d2)) + 1.0d);
    }

    public static float getSpringDamping(ReadableMap readableMap) {
        return readableMap.getType("springDamping").equals(ReadableType.Number) ? (float) readableMap.getDouble("springDamping") : 0.5f;
    }
}
