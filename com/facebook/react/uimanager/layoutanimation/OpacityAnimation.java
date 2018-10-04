package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;

public final class OpacityAnimation extends Animation {
    private final float mDeltaOpacity;
    private final float mStartOpacity;
    private final View mView;

    public final class OpacityAnimationListener implements AnimationListener {
        private boolean mLayerTypeChanged = false;
        private final View mView;

        public final void onAnimationRepeat(Animation animation) {
        }

        public OpacityAnimationListener(View view) {
            this.mView = view;
        }

        public final void onAnimationEnd(Animation animation) {
            if (this.mLayerTypeChanged) {
                this.mView.setLayerType(0, null);
            }
        }

        public final void onAnimationStart(Animation animation) {
            if (this.mView.hasOverlappingRendering() && this.mView.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                this.mView.setLayerType(2, null);
            }
        }
    }

    public final boolean willChangeBounds() {
        return false;
    }

    public OpacityAnimation(View view, float f, float f2) {
        this.mView = view;
        this.mStartOpacity = f;
        this.mDeltaOpacity = f2 - f;
        setAnimationListener(new OpacityAnimationListener(view));
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.mView.setAlpha(this.mStartOpacity + (this.mDeltaOpacity * f));
    }
}
