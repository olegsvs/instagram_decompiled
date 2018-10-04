package com.facebook.react.animated;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.facebook.react.bridge.ReadableMap;

public final class SpringAnimation extends AnimationDriver {
    private int mCurrentLoop;
    private final PhysicsState mCurrentState;
    private double mDisplacementFromRestThreshold;
    private double mEndValue;
    private double mInitialVelocity;
    private int mIterations;
    private long mLastTime;
    private double mOriginalValue;
    private boolean mOvershootClampingEnabled;
    private double mRestSpeedThreshold;
    private double mSpringDamping;
    private double mSpringMass;
    private boolean mSpringStarted;
    private double mSpringStiffness;
    private double mStartValue;
    private double mTimeAccumulator;

    public final class PhysicsState {
        public double position;
        public double velocity;
    }

    public SpringAnimation(ReadableMap readableMap) {
        PhysicsState physicsState = new PhysicsState();
        this.mCurrentState = physicsState;
        physicsState.velocity = readableMap.getDouble("initialVelocity");
        resetConfig(readableMap);
    }

    private void advance(double d) {
        if (!isAtRest()) {
            double sin;
            double d2 = 0.064d;
            if (d <= 0.064d) {
                d2 = d;
            }
            r12.mTimeAccumulator += d2;
            double d3 = r12.mSpringDamping;
            double d4 = r12.mSpringMass;
            d2 = r12.mSpringStiffness;
            double d5 = -r12.mInitialVelocity;
            d3 /= Math.sqrt(d2 * d4) * 2.0d;
            double sqrt = Math.sqrt(d2 / d4);
            d = Math.sqrt(1.0d - (d3 * d3)) * sqrt;
            d4 = r12.mEndValue - r12.mStartValue;
            d2 = r12.mTimeAccumulator;
            if (d3 < 1.0d) {
                double exp = Math.exp(((-d3) * sqrt) * d2);
                d3 *= sqrt;
                d5 += d3 * d4;
                d2 *= d;
                sin = r12.mEndValue - ((((d5 / d) * Math.sin(d2)) + (Math.cos(d2) * d4)) * exp);
                d3 = ((d3 * exp) * (((Math.sin(d2) * d5) / d) + (Math.cos(d2) * d4))) - (((Math.cos(d2) * d5) - ((d * d4) * Math.sin(d2))) * exp);
            } else {
                d3 = Math.exp((-sqrt) * d2);
                sin = r12.mEndValue - (((((sqrt * d4) + d5) * d2) + d4) * d3);
                d3 *= (d5 * ((d2 * sqrt) - 1.0d)) + ((d2 * d4) * (sqrt * sqrt));
            }
            PhysicsState physicsState = r12.mCurrentState;
            physicsState.position = sin;
            physicsState.velocity = d3;
            if (isAtRest() || (r12.mOvershootClampingEnabled && isOvershooting())) {
                if (r12.mSpringStiffness > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) {
                    d4 = r12.mEndValue;
                    r12.mStartValue = d4;
                    r12.mCurrentState.position = d4;
                } else {
                    sin = r12.mCurrentState.position;
                    r12.mEndValue = sin;
                    r12.mStartValue = sin;
                }
                r12.mCurrentState.velocity = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
            }
        }
    }

    private double getDisplacementDistanceForState(PhysicsState physicsState) {
        return Math.abs(this.mEndValue - physicsState.position);
    }

    private boolean isAtRest() {
        return Math.abs(this.mCurrentState.velocity) <= this.mRestSpeedThreshold && (getDisplacementDistanceForState(this.mCurrentState) <= this.mDisplacementFromRestThreshold || this.mSpringStiffness == StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    private boolean isOvershooting() {
        return this.mSpringStiffness > StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED && ((this.mStartValue < this.mEndValue && this.mCurrentState.position > this.mEndValue) || (this.mStartValue > this.mEndValue && this.mCurrentState.position < this.mEndValue));
    }

    public final void resetConfig(ReadableMap readableMap) {
        this.mSpringStiffness = readableMap.getDouble("stiffness");
        this.mSpringDamping = readableMap.getDouble("damping");
        this.mSpringMass = readableMap.getDouble("mass");
        this.mInitialVelocity = this.mCurrentState.velocity;
        this.mEndValue = readableMap.getDouble("toValue");
        this.mRestSpeedThreshold = readableMap.getDouble("restSpeedThreshold");
        this.mDisplacementFromRestThreshold = readableMap.getDouble("restDisplacementThreshold");
        this.mOvershootClampingEnabled = readableMap.getBoolean("overshootClamping");
        boolean z = true;
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.mIterations = i;
        if (i != 0) {
            z = false;
        }
        this.mHasFinished = z;
        this.mCurrentLoop = 0;
        this.mTimeAccumulator = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
        this.mSpringStarted = false;
    }

    public final void runAnimationStep(long j) {
        j /= 1000000;
        if (!this.mSpringStarted) {
            if (this.mCurrentLoop == 0) {
                this.mOriginalValue = this.mAnimatedValue.mValue;
                this.mCurrentLoop = 1;
            }
            PhysicsState physicsState = this.mCurrentState;
            double d = this.mAnimatedValue.mValue;
            physicsState.position = d;
            this.mStartValue = d;
            this.mLastTime = j;
            this.mTimeAccumulator = StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
            this.mSpringStarted = true;
        }
        double d2 = (double) (j - this.mLastTime);
        Double.isNaN(d2);
        advance(d2 / 1000.0d);
        this.mLastTime = j;
        this.mAnimatedValue.mValue = this.mCurrentState.position;
        if (isAtRest()) {
            int i = this.mIterations;
            if (i != -1) {
                if (this.mCurrentLoop >= i) {
                    this.mHasFinished = true;
                    return;
                }
            }
            this.mSpringStarted = false;
            this.mAnimatedValue.mValue = this.mOriginalValue;
            this.mCurrentLoop++;
        }
    }
}
