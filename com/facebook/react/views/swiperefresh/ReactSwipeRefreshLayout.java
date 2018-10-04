package com.facebook.react.views.swiperefresh;

import X.AnonymousClass1nk;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.NativeGestureUtil;

public final class ReactSwipeRefreshLayout extends AnonymousClass1nk {
    private boolean mDidLayout = false;
    private boolean mIntercepted;
    private float mPrevTouchX;
    private float mProgressViewOffset = 0.0f;
    private boolean mRefreshing = false;
    private int mTouchSlop;

    public ReactSwipeRefreshLayout(ReactContext reactContext) {
        super(reactContext);
        this.mTouchSlop = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!shouldInterceptTouchEvent(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.mDidLayout) {
            this.mDidLayout = true;
            setProgressViewOffset(this.mProgressViewOffset);
            setRefreshing(this.mRefreshing);
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.mProgressViewOffset = f;
        if (this.mDidLayout) {
            int progressCircleDiameter = getProgressCircleDiameter();
            int round = Math.round(PixelUtil.toPixelFromDIP(f)) - progressCircleDiameter;
            int round2 = Math.round(PixelUtil.toPixelFromDIP(f + 64.0f) - ((float) progressCircleDiameter));
            this.f22803P = false;
            this.f22800M = round;
            this.f22806S = round2;
            this.f22808U = true;
            D();
            this.f22802O = false;
        }
    }

    public void setRefreshing(boolean z) {
        this.mRefreshing = z;
        if (this.mDidLayout) {
            super.setRefreshing(z);
        }
    }

    private boolean shouldInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPrevTouchX = motionEvent.getX();
            this.mIntercepted = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.mPrevTouchX);
            if (this.mIntercepted || abs > ((float) this.mTouchSlop)) {
                this.mIntercepted = true;
                return false;
            }
        }
        return true;
    }
}
