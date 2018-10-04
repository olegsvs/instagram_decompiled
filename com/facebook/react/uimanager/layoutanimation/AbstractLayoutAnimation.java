package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.util.Map;

public abstract class AbstractLayoutAnimation {
    private static final Map INTERPOLATOR = MapBuilder.of(InterpolatorType.LINEAR, new LinearInterpolator(), InterpolatorType.EASE_IN, new AccelerateInterpolator(), InterpolatorType.EASE_OUT, new DecelerateInterpolator(), InterpolatorType.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());
    public AnimatedPropertyType mAnimatedProperty;
    private int mDelayMs;
    public int mDurationMs;
    private Interpolator mInterpolator;

    public abstract Animation createAnimationImpl(View view, int i, int i2, int i3, int i4);

    public abstract boolean isValid();

    public final Animation createAnimation(View view, int i, int i2, int i3, int i4) {
        if (!isValid()) {
            return null;
        }
        Animation createAnimationImpl = createAnimationImpl(view, i, i2, i3, i4);
        if (createAnimationImpl != null) {
            createAnimationImpl.setDuration((long) this.mDurationMs);
            createAnimationImpl.setStartOffset((long) this.mDelayMs);
            createAnimationImpl.setInterpolator(this.mInterpolator);
        }
        return createAnimationImpl;
    }

    private static Interpolator getInterpolator(InterpolatorType interpolatorType, ReadableMap readableMap) {
        Interpolator simpleSpringInterpolator;
        if (interpolatorType.equals(InterpolatorType.SPRING)) {
            simpleSpringInterpolator = new SimpleSpringInterpolator(SimpleSpringInterpolator.getSpringDamping(readableMap));
        } else {
            simpleSpringInterpolator = (Interpolator) INTERPOLATOR.get(interpolatorType);
        }
        if (simpleSpringInterpolator != null) {
            return simpleSpringInterpolator;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Missing interpolator for type : ");
        stringBuilder.append(interpolatorType);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void initializeFromConfig(ReadableMap readableMap, int i) {
        this.mAnimatedProperty = readableMap.hasKey("property") ? AnimatedPropertyType.fromString(readableMap.getString("property")) : null;
        if (readableMap.hasKey(TraceFieldType.Duration)) {
            i = readableMap.getInt(TraceFieldType.Duration);
        }
        this.mDurationMs = i;
        this.mDelayMs = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (readableMap.hasKey("type")) {
            this.mInterpolator = getInterpolator(InterpolatorType.fromString(readableMap.getString("type")), readableMap);
            if (!isValid()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid layout animation : ");
                stringBuilder.append(readableMap);
                throw new IllegalViewOperationException(stringBuilder.toString());
            }
            return;
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    public final void reset() {
        this.mAnimatedProperty = null;
        this.mDurationMs = 0;
        this.mDelayMs = 0;
        this.mInterpolator = null;
    }
}
