package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;

public final class VelocityHelper {
    private VelocityTracker mVelocityTracker;
    private float mXVelocity;
    private float mYVelocity;

    public final void calculateVelocity(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.mVelocityTracker.computeCurrentVelocity(1);
            this.mXVelocity = this.mVelocityTracker.getXVelocity();
            this.mYVelocity = this.mVelocityTracker.getYVelocity();
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
            }
        }
    }

    public final float getXVelocity() {
        return this.mXVelocity;
    }

    public final float getYVelocity() {
        return this.mYVelocity;
    }
}