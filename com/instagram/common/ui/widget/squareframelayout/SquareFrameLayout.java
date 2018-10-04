package com.instagram.common.ui.widget.squareframelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.facebook.forker.Process;

public class SquareFrameLayout extends FrameLayout {
    public SquareFrameLayout(Context context) {
        super(context);
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i);
        if ((mode == Process.WAIT_RESULT_TIMEOUT || mode == 1073741824) && size < size2) {
            size2 = size;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size2, 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
