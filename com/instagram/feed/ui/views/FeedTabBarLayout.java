package com.instagram.feed.ui.views;

import X.AnonymousClass0Ca;
import X.AnonymousClass0G5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0164R;

public class FeedTabBarLayout extends LinearLayout {
    /* renamed from: B */
    private int f26532B;
    /* renamed from: C */
    private final int f26533C;
    /* renamed from: D */
    private final int f26534D;
    /* renamed from: E */
    private Paint f26535E;

    public FeedTabBarLayout(Context context) {
        this(context, null);
    }

    public FeedTabBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedTabBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int dimensionPixelSize = getResources().getDimensionPixelSize(AnonymousClass0G5.F(getContext(), C0164R.attr.segmentedUnderlineWidth));
        Paint paint = new Paint(1);
        this.f26535E = paint;
        paint.setStyle(Style.STROKE);
        this.f26535E.setStrokeWidth((float) dimensionPixelSize);
        this.f26534D = AnonymousClass0Ca.C(context, C0164R.color.grey_5);
        this.f26533C = AnonymousClass0Ca.C(context, C0164R.color.grey_9);
        setWillNotDraw(false);
    }

    /* renamed from: A */
    public final void m14553A(int i) {
        if (getChildCount() != 0) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                TextView textView = (TextView) getChildAt(i2);
                if (i2 == i) {
                    textView.setTextColor(this.f26533C);
                } else {
                    textView.setTextColor(this.f26534D);
                }
            }
            this.f26532B = i;
            invalidate();
        }
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (getChildCount() != 0) {
            int width = ((getWidth() / getChildCount()) - getPaddingLeft()) - getPaddingRight();
            int paddingLeft = (this.f26532B * width) + getPaddingLeft();
            float height = (((float) getHeight()) - (this.f26535E.getStrokeWidth() / 2.0f)) - ((float) getPaddingBottom());
            canvas2.drawLine((float) paddingLeft, height, (float) (paddingLeft + width), height, this.f26535E);
        }
    }
}
