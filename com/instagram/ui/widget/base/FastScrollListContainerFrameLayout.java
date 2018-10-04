package com.instagram.ui.widget.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FastScrollListContainerFrameLayout extends FrameLayout {
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public FastScrollListContainerFrameLayout(Context context) {
        super(context);
    }

    public FastScrollListContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FastScrollListContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
