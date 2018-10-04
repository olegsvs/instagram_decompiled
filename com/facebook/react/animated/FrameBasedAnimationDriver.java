package com.facebook.react.animated;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public final class FrameBasedAnimationDriver extends AnimationDriver {
    private int mCurrentLoop;
    private double[] mFrames;
    private double mFromValue;
    private int mIterations;
    private long mStartFrameTimeNanos;
    private double mToValue;

    public FrameBasedAnimationDriver(ReadableMap readableMap) {
        resetConfig(readableMap);
    }

    public final void resetConfig(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.mFrames;
        if (dArr == null || dArr.length != size) {
            this.mFrames = new double[size];
        }
        for (int i = 0; i < size; i++) {
            this.mFrames[i] = array.getDouble(i);
        }
        this.mToValue = readableMap.hasKey("toValue") ? readableMap.getDouble("toValue") : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        boolean z = true;
        this.mIterations = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.mCurrentLoop = 1;
        if (this.mIterations != 0) {
            z = false;
        }
        this.mHasFinished = z;
        this.mStartFrameTimeNanos = -1;
    }

    public final void runAnimationStep(long j) {
        if (this.mStartFrameTimeNanos < 0) {
            this.mStartFrameTimeNanos = j;
            if (this.mCurrentLoop == 1) {
                this.mFromValue = this.mAnimatedValue.mValue;
            }
        }
        double d = (double) ((j - this.mStartFrameTimeNanos) / 1000000);
        Double.isNaN(d);
        int round = (int) Math.round(d / 16.666666666666668d);
        if (round < 0) {
            throw new IllegalStateException("Calculated frame index should never be lower than 0");
        } else if (!this.mHasFinished) {
            double[] dArr = this.mFrames;
            if (round >= dArr.length - 1) {
                d = this.mToValue;
                int i = this.mIterations;
                if (i != -1) {
                    if (this.mCurrentLoop >= i) {
                        this.mHasFinished = true;
                    }
                }
                this.mStartFrameTimeNanos = -1;
                this.mCurrentLoop++;
            } else {
                double d2 = this.mFromValue;
                d = (dArr[round] * (this.mToValue - d2)) + d2;
            }
            this.mAnimatedValue.mValue = d;
        }
    }
}
