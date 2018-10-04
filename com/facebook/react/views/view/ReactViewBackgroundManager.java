package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.facebook.react.views.common.ViewHelper;

public final class ReactViewBackgroundManager {
    private ReactViewBackgroundDrawable mReactBackgroundDrawable;
    private View mView;

    public ReactViewBackgroundManager(View view) {
        this.mView = view;
    }

    private ReactViewBackgroundDrawable getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new ReactViewBackgroundDrawable(this.mView.getContext());
            Drawable background = this.mView.getBackground();
            ViewHelper.setBackground(this.mView, null);
            if (background == null) {
                ViewHelper.setBackground(this.mView, this.mReactBackgroundDrawable);
            } else {
                ViewHelper.setBackground(this.mView, new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
        }
        return this.mReactBackgroundDrawable;
    }

    public final void setBackgroundColor(int i) {
        if (i != 0 || this.mReactBackgroundDrawable != null) {
            getOrCreateReactViewBackground().setColor(i);
        }
    }

    public final void setBorderColor(int i, float f, float f2) {
        getOrCreateReactViewBackground().setBorderColor(i, f, f2);
    }

    public final void setBorderRadius(float f) {
        getOrCreateReactViewBackground().setRadius(f);
    }

    public final void setBorderRadius(float f, int i) {
        getOrCreateReactViewBackground().setRadius(f, i);
    }

    public final void setBorderStyle(String str) {
        getOrCreateReactViewBackground().setBorderStyle(str);
    }

    public final void setBorderWidth(int i, float f) {
        getOrCreateReactViewBackground().setBorderWidth(i, f);
    }
}
