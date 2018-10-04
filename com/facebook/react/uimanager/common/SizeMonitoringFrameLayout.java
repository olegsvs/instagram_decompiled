package com.facebook.react.uimanager.common;

import X.AnonymousClass0cQ;
import android.content.Context;
import android.widget.FrameLayout;

public class SizeMonitoringFrameLayout extends FrameLayout {
    private OnSizeChangedListener mOnSizeChangedListener;

    public interface OnSizeChangedListener {
        void onSizeChanged(int i, int i2, int i3, int i4);
    }

    public SizeMonitoringFrameLayout(Context context) {
        super(context);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 1229699009);
        super.onSizeChanged(i, i2, i3, i4);
        OnSizeChangedListener onSizeChangedListener = this.mOnSizeChangedListener;
        if (onSizeChangedListener != null) {
            onSizeChangedListener.onSizeChanged(i, i2, i3, i4);
        }
        AnonymousClass0cQ.O(this, -1331632399, N);
    }

    public void setOnSizeChangedListener(OnSizeChangedListener onSizeChangedListener) {
        this.mOnSizeChangedListener = onSizeChangedListener;
    }
}
