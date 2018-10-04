package com.instagram.feed.ui.views;

import X.AnonymousClass0Ca;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.facebook.C0164R;

public class TileShadowLayout extends FrameLayout {
    /* renamed from: B */
    private float f26549B;
    /* renamed from: C */
    private float f26550C;
    /* renamed from: D */
    private Paint f26551D;
    /* renamed from: E */
    private RectF f26552E;

    public TileShadowLayout(Context context) {
        super(context);
        m14556A();
    }

    public TileShadowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14556A();
    }

    public TileShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14556A();
    }

    /* renamed from: A */
    public final void m14556A() {
        setWillNotDraw(false);
        float dimensionPixelSize = (float) getResources().getDimensionPixelSize(C0164R.dimen.default_corner_radius);
        this.f26550C = dimensionPixelSize;
        this.f26549B = dimensionPixelSize * 10.0f;
        MaskFilter blurMaskFilter = new BlurMaskFilter(this.f26549B, Blur.NORMAL);
        Paint paint = new Paint(1);
        this.f26551D = paint;
        paint.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.tileShadowLayoutShadowColor));
        this.f26552E = new RectF();
        this.f26551D.setMaskFilter(blurMaskFilter);
        setLayerType(1, this.f26551D);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            this.f26552E.set((float) childAt.getLeft(), (float) childAt.getTop(), (float) childAt.getRight(), (float) childAt.getBottom());
            RectF rectF = this.f26552E;
            float f = this.f26549B;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.f26552E.offset(0.0f, this.f26549B / 8.0f);
            RectF rectF2 = this.f26552E;
            float f2 = this.f26550C;
            canvas.drawRoundRect(rectF2, f2, f2, this.f26551D);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                i3 += childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(MeasureSpec.getSize(i), i3);
    }
}
