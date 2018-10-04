package com.instagram.ui.simplevideolayout;

import X.AnonymousClass0tZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public class SimpleVideoLayout extends FrameLayout implements AnonymousClass0tZ {
    public SimpleVideoLayout(Context context) {
        this(context, null);
    }

    public SimpleVideoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void attachViewToParent(View view, int i, LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }
}
