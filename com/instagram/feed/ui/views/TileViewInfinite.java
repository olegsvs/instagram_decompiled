package com.instagram.feed.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.facebook.C0164R;

public class TileViewInfinite extends FrameLayout {
    /* renamed from: B */
    private int f26558B;
    /* renamed from: C */
    private int f26559C;
    /* renamed from: D */
    private int f26560D = 3;

    public TileViewInfinite(Context context) {
        super(context);
        m14559A();
    }

    public TileViewInfinite(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14559A();
    }

    public TileViewInfinite(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14559A();
    }

    /* renamed from: A */
    public final void m14559A() {
        this.f26558B = getResources().getDimensionPixelSize(C0164R.dimen.tile_inf_layout_spacing);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < getChildCount()) {
            if (i5 != 0 && i5 % this.f26560D == 0) {
                i6 += this.f26559C + this.f26558B;
                i7 = 0;
            }
            View childAt = getChildAt(i5);
            childAt.layout(i7, i6, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i6);
            i7 += childAt.getMeasuredWidth() + this.f26558B;
            i5++;
        }
    }

    public final void onMeasure(int i, int i2) {
        if (getVisibility() != 8) {
            int size = MeasureSpec.getSize(i);
            int i3 = this.f26558B;
            int i4 = this.f26560D;
            int i5 = (size - (i3 * (i4 - 1))) / i4;
            this.f26559C = i5;
            int i6 = 0;
            while (i6 < getChildCount()) {
                View childAt = getChildAt(i6);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f26559C, 1073741824);
                measureChild(childAt, makeMeasureSpec, makeMeasureSpec);
                if (i6 != 0 && i6 % this.f26560D == 0) {
                    i5 += this.f26558B + this.f26559C;
                }
                i6++;
            }
            setMeasuredDimension(size, i5);
            return;
        }
        super.onMeasure(i, i2);
    }
}
