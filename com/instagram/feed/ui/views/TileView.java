package com.instagram.feed.ui.views;

import X.AnonymousClass1DN;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.facebook.C0164R;

public class TileView extends FrameLayout {
    /* renamed from: B */
    private AnonymousClass1DN f26553B;
    /* renamed from: C */
    private int f26554C;
    /* renamed from: D */
    private int f26555D;

    public TileView(Context context) {
        super(context);
        m14557A(null);
    }

    public TileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14557A(attributeSet);
    }

    public TileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14557A(attributeSet);
    }

    /* renamed from: A */
    public final void m14557A(AttributeSet attributeSet) {
        this.f26553B = AnonymousClass1DN.B(getContext(), attributeSet);
        setLayerType(2, null);
        this.f26554C = getResources().getDimensionPixelSize(C0164R.dimen.tile_layout_spacing);
    }

    public final void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(15.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
        this.f26553B.A(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = (getWidth() - this.f26555D) / 2;
        int height = getHeight();
        int i5 = this.f26555D;
        int i6 = (height - i5) / 2;
        int i7 = width - i5;
        height = this.f26554C;
        i7 -= height;
        i6 = (i6 - i5) - height;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            childAt.layout(i7, i6, childAt.getMeasuredWidth() + i7, childAt.getMeasuredHeight() + i6);
            int i9 = this.f26555D;
            i5 = this.f26554C;
            i7 += i9 + i5;
            if (i7 > (width + i9) + i5) {
                i7 = (width - i9) - i5;
                i6 += i9 + i5;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        if (getVisibility() != 8) {
            int size = MeasureSpec.getSize(i);
            this.f26555D = (size * 4) / 9;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f26555D, 1073741824);
                measureChild(childAt, makeMeasureSpec, makeMeasureSpec);
            }
            int i4 = (size * 3) / 4;
            setMeasuredDimension(size, i4);
            this.f26553B.B(size, i4);
            return;
        }
        super.onMeasure(i, i2);
        this.f26553B.B(getMeasuredWidth(), getMeasuredHeight());
    }
}
