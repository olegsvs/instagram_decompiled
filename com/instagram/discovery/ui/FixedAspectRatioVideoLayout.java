package com.instagram.discovery.ui;

import X.AnonymousClass0LH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.facebook.forker.Process;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

public class FixedAspectRatioVideoLayout extends SimpleVideoLayout {
    /* renamed from: B */
    private float f57489B;

    public FixedAspectRatioVideoLayout(Context context) {
        this(context, null);
    }

    public FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57489B = 1.0f;
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i);
        if (mode == Process.WAIT_RESULT_TIMEOUT || mode == 1073741824) {
            float f = (float) size;
            float f2 = (float) size2;
            float f3 = this.f57489B;
            if (f < f2 / f3) {
                mode = MeasureSpec.makeMeasureSpec((int) (f * f3), 1073741824);
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(size, 1073741824);
                super.onMeasure(mode, makeMeasureSpec);
            }
        }
        makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) (((float) size2) / this.f57489B), 1073741824);
        mode = MeasureSpec.makeMeasureSpec(size2, 1073741824);
        super.onMeasure(mode, makeMeasureSpec);
    }

    public void setAspectRatio(float f) {
        AnonymousClass0LH.C(f > 0.0f, "aspect ratio shall be > 0");
        this.f57489B = f;
    }
}
