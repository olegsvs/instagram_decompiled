package com.instagram.common.ui.widget.zoomcontainer;

import X.AnonymousClass0sC;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public class SimpleZoomableViewContainer extends FrameLayout implements AnonymousClass0sC {
    public SimpleZoomableViewContainer(Context context) {
        this(context, null);
    }

    public SimpleZoomableViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleZoomableViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void attachViewToParent(View view, int i, LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }
}
