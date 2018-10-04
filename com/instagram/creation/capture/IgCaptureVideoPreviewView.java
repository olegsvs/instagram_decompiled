package com.instagram.creation.capture;

import X.AnonymousClass0PI;
import X.AnonymousClass15o;
import X.AnonymousClass1Qp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

public class IgCaptureVideoPreviewView extends VideoPreviewView {
    public float getMaxFitAspectRatio() {
        return 1.91f;
    }

    public float getMinFitAspectRatio() {
        return 0.8f;
    }

    public IgCaptureVideoPreviewView(Context context) {
        this(context, null);
    }

    public IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!(context instanceof AnonymousClass0PI)) {
            throw new RuntimeException("Context is not a SessionProvider");
        }
    }

    public AnonymousClass15o getScaleType() {
        if (((AnonymousClass0PI) getContext()).VK().f38952F == AnonymousClass1Qp.RECTANGULAR) {
            return AnonymousClass15o.FIT_WITH_LIMITS;
        }
        return AnonymousClass15o.FILL;
    }

    public void setAspectRatio(float f) {
        LayoutParams layoutParams = getLayoutParams();
        if (f > 1.0f) {
            layoutParams.width = ((View) getParent()).getWidth();
            layoutParams.height = (int) (((float) layoutParams.width) / f);
        } else if (f < 1.0f) {
            layoutParams.height = ((View) getParent()).getHeight();
            layoutParams.width = (int) (((float) layoutParams.height) * f);
        } else {
            layoutParams.width = ((View) getParent()).getWidth();
            layoutParams.height = ((View) getParent()).getHeight();
        }
        setLayoutParams(layoutParams);
    }
}
