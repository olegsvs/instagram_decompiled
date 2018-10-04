package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.fasterxml.jackson.databind.JsonMappingException;

public final class ProgressBarContainerView extends FrameLayout {
    private boolean mAnimating = true;
    private Integer mColor;
    private boolean mIndeterminate = true;
    private double mProgress;
    private ProgressBar mProgressBar;

    public ProgressBarContainerView(Context context) {
        super(context);
    }

    public final void apply() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.mIndeterminate);
            setColor(this.mProgressBar);
            this.mProgressBar.setProgress((int) (this.mProgress * 1000.0d));
            if (this.mAnimating) {
                this.mProgressBar.setVisibility(0);
                return;
            } else {
                this.mProgressBar.setVisibility(8);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("setStyle() not called");
    }

    public final void setAnimating(boolean z) {
        this.mAnimating = z;
    }

    private void setColor(ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar = progressBar.getIndeterminateDrawable();
        } else {
            progressBar = progressBar.getProgressDrawable();
        }
        if (progressBar != null) {
            Integer num = this.mColor;
            if (num != null) {
                progressBar.setColorFilter(num.intValue(), Mode.SRC_IN);
            } else {
                progressBar.clearColorFilter();
            }
        }
    }

    public final void setColor(Integer num) {
        this.mColor = num;
    }

    public final void setIndeterminate(boolean z) {
        this.mIndeterminate = z;
    }

    public final void setProgress(double d) {
        this.mProgress = d;
    }

    public final void setStyle(String str) {
        ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.mProgressBar = createProgressBar;
        createProgressBar.setMax(JsonMappingException.MAX_REFS_TO_LIST);
        removeAllViews();
        addView(this.mProgressBar, new LayoutParams(-1, -1));
    }
}
