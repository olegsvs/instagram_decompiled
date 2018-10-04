package com.facebook.react.views.scroll;

import android.os.SystemClock;
import com.facebook.forker.Process;

public final class OnScrollDispatchHelper {
    private long mLastScrollEventTimeMs = -11;
    private int mPrevX = Process.WAIT_RESULT_TIMEOUT;
    private int mPrevY = Process.WAIT_RESULT_TIMEOUT;
    private float mXFlingVelocity = 0.0f;
    private float mYFlingVelocity = 0.0f;

    public final float getXFlingVelocity() {
        return this.mXFlingVelocity;
    }

    public final float getYFlingVelocity() {
        return this.mYFlingVelocity;
    }

    public final boolean onScrollChanged(int i, int i2) {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.mLastScrollEventTimeMs <= 10 && this.mPrevX == i) {
            if (this.mPrevY == i2) {
                z = false;
                j = this.mLastScrollEventTimeMs;
                if (uptimeMillis - j != 0) {
                    this.mXFlingVelocity = ((float) (i - this.mPrevX)) / ((float) (uptimeMillis - j));
                    this.mYFlingVelocity = ((float) (i2 - this.mPrevY)) / ((float) (uptimeMillis - j));
                }
                this.mLastScrollEventTimeMs = uptimeMillis;
                this.mPrevX = i;
                this.mPrevY = i2;
                return z;
            }
        }
        z = true;
        j = this.mLastScrollEventTimeMs;
        if (uptimeMillis - j != 0) {
            this.mXFlingVelocity = ((float) (i - this.mPrevX)) / ((float) (uptimeMillis - j));
            this.mYFlingVelocity = ((float) (i2 - this.mPrevY)) / ((float) (uptimeMillis - j));
        }
        this.mLastScrollEventTimeMs = uptimeMillis;
        this.mPrevX = i;
        this.mPrevY = i2;
        return z;
    }
}
