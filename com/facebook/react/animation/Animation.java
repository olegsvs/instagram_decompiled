package com.facebook.react.animation;

import android.view.View;

public abstract class Animation {
    private View mAnimatedView;
    private final int mAnimationID;
    private AnimationListener mAnimationListener;
    private volatile boolean mCancelled;
    private volatile boolean mIsFinished;
    private final AnimationPropertyUpdater mPropertyUpdater;

    public abstract void run();

    public final void cancel() {
        if (!this.mIsFinished) {
            if (!this.mCancelled) {
                this.mCancelled = true;
                AnimationListener animationListener = this.mAnimationListener;
                if (animationListener != null) {
                    animationListener.onCancel();
                }
            }
        }
    }

    public final int getAnimationID() {
        return this.mAnimationID;
    }

    public final void setAnimationListener(AnimationListener animationListener) {
        this.mAnimationListener = animationListener;
    }

    public final void start(View view) {
        this.mAnimatedView = view;
        this.mPropertyUpdater.prepare(view);
        run();
    }
}
