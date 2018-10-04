package com.instagram.common.ui.widget.framelayout;

import X.AnonymousClass0eS;
import X.AnonymousClass0tZ;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.forker.Process;

public class MediaFrameLayout extends FrameLayout implements AnonymousClass0tZ {
    /* renamed from: B */
    private float f11677B;
    /* renamed from: C */
    private final boolean f11678C;

    public MediaFrameLayout(Context context) {
        this(context, null);
    }

    public MediaFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11677B = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.MediaFrameLayout);
        this.f11678C = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public final void attachViewToParent(View view, int i, LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i);
        if (this.f11677B != -1.0f) {
            if (!this.f11678C && (mode == Process.WAIT_RESULT_TIMEOUT || mode == 1073741824)) {
                float f = (float) size;
                float f2 = (float) size2;
                float f3 = this.f11677B;
                if (f < f2 / f3) {
                    i = MeasureSpec.makeMeasureSpec((int) (f * f3), 1073741824);
                    i2 = MeasureSpec.makeMeasureSpec(size, 1073741824);
                }
            }
            i2 = MeasureSpec.makeMeasureSpec((int) (((float) size2) / this.f11677B), 1073741824);
            i = MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setAspectRatio(float f) {
        this.f11677B = f;
    }
}
