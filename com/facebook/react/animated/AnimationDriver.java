package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

public abstract class AnimationDriver {
    public ValueAnimatedNode mAnimatedValue;
    public Callback mEndCallback;
    public boolean mHasFinished = false;
    public int mId;

    public abstract void runAnimationStep(long j);

    public void resetConfig(ReadableMap readableMap) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Animation config for ");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(" cannot be reset");
        throw new JSApplicationCausedNativeException(stringBuilder.toString());
    }
}
