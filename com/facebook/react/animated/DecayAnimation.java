package com.facebook.react.animated;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.ReadableMap;

public final class DecayAnimation extends AnimationDriver {
    private int mCurrentLoop;
    private double mDeceleration;
    private double mFromValue;
    private int mIterations;
    private double mLastValue;
    private long mStartFrameTimeMillis;
    private final double mVelocity;

    public DecayAnimation(ReadableMap readableMap) {
        this.mVelocity = readableMap.getDouble("velocity");
        resetConfig(readableMap);
    }

    public final void resetConfig(ReadableMap readableMap) {
        this.mDeceleration = readableMap.getDouble("deceleration");
        boolean z = true;
        this.mIterations = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.mCurrentLoop = 1;
        if (this.mIterations != 0) {
            z = false;
        }
        this.mHasFinished = z;
        this.mStartFrameTimeMillis = -1;
        this.mFromValue = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        this.mLastValue = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    public final void runAnimationStep(long j) {
        j /= 1000000;
        if (this.mStartFrameTimeMillis == -1) {
            this.mStartFrameTimeMillis = j - 16;
            if (this.mFromValue == this.mLastValue) {
                this.mFromValue = this.mAnimatedValue.mValue;
            } else {
                this.mAnimatedValue.mValue = this.mFromValue;
            }
            this.mLastValue = this.mAnimatedValue.mValue;
        }
        double d = this.mFromValue;
        double d2 = this.mVelocity;
        double d3 = this.mDeceleration;
        d2 /= 1.0d - d3;
        d3 = -(1.0d - d3);
        double d4 = (double) (j - this.mStartFrameTimeMillis);
        Double.isNaN(d4);
        d += d2 * (1.0d - Math.exp(d3 * d4));
        if (Math.abs(this.mLastValue - d) < 0.1d) {
            int i = this.mIterations;
            if (i != -1) {
                if (this.mCurrentLoop >= i) {
                    this.mHasFinished = true;
                    return;
                }
            }
            this.mStartFrameTimeMillis = -1;
            this.mCurrentLoop++;
        }
        this.mLastValue = d;
        this.mAnimatedValue.mValue = d;
    }
}
