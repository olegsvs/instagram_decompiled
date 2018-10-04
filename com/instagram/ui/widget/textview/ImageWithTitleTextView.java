package com.instagram.ui.widget.textview;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.instagram.common.ui.text.TitleTextView;

public class ImageWithTitleTextView extends TitleTextView {
    /* renamed from: B */
    private Drawable f12865B;
    /* renamed from: C */
    private int f12866C;
    /* renamed from: D */
    private int f12867D;
    /* renamed from: E */
    private float f12868E = 1.0f;
    /* renamed from: F */
    private float f12869F = 1.0f;
    /* renamed from: G */
    private int f12870G = 0;
    /* renamed from: H */
    private boolean f12871H = true;
    /* renamed from: I */
    private float f12872I;
    /* renamed from: J */
    private float f12873J;

    public ImageWithTitleTextView(Context context) {
        super(context);
    }

    public ImageWithTitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8658H(context, attributeSet, 0);
    }

    public ImageWithTitleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8658H(context, attributeSet, i);
    }

    /* renamed from: G */
    private void m8657G(Canvas canvas) {
        if (this.f12865B != null) {
            canvas.save();
            canvas.translate(((float) getScrollX()) + this.f12872I, ((float) getScrollY()) + this.f12873J);
            canvas.scale(this.f12868E, this.f12869F, ((float) this.f12867D) / 2.0f, ((float) this.f12866C) / 2.0f);
            this.f12865B.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: H */
    private void m8658H(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.ImageWithTextView, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setupDrawable(resourceId);
        }
        this.f12870G = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }

    public Drawable getDrawable() {
        return this.f12865B;
    }

    public float getImageScaleX() {
        return this.f12868E;
    }

    public float getImageScaleY() {
        return this.f12869F;
    }

    public int getInnerSpacing() {
        return this.f12870G;
    }

    public final void onDraw(Canvas canvas) {
        if (this.f12871H) {
            m8657G(canvas);
            canvas.save();
            canvas.translate(((float) (this.f12867D + this.f12870G)) / 2.0f, 0.0f);
        }
        super.onDraw(canvas);
        if (this.f12871H) {
            canvas.restore();
        }
    }

    public final void onMeasure(int i, int i2) {
        int N = AnonymousClass0cQ.m5864N(this, -2128207003);
        if (this.f12871H) {
            i = MeasureSpec.makeMeasureSpec((MeasureSpec.getSize(i) - this.f12867D) - this.f12870G, MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        if (this.f12871H) {
            int max = Math.max(this.f12866C, getMeasuredHeight());
            int measuredWidth = (this.f12867D + this.f12870G) + getMeasuredWidth();
            setMeasuredDimension(measuredWidth, max);
            this.f12872I = (((float) measuredWidth) - (((float) (this.f12867D + this.f12870G)) + getLayout().getLineWidth(0))) / 2.0f;
            this.f12873J = ((float) (max - this.f12866C)) / 2.0f;
        }
        AnonymousClass0cQ.m5865O(this, 605537102, N);
    }

    public void setImageResource(int i) {
        setupDrawable(i);
        requestLayout();
    }

    public void setImageScaleX(float f) {
        if (Float.compare(this.f12868E, f) != 0) {
            this.f12868E = f;
            invalidate();
        }
    }

    public void setImageScaleY(float f) {
        if (Float.compare(this.f12869F, f) != 0) {
            this.f12869F = f;
            invalidate();
        }
    }

    public void setInnerSpacing(int i) {
        this.f12870G = i;
    }

    private void setupDrawable(int i) {
        if (i == 0) {
            this.f12865B = null;
            this.f12866C = 0;
            this.f12867D = 0;
            return;
        }
        Drawable E = AnonymousClass0Ca.m939E(getContext(), i);
        this.f12865B = E;
        this.f12867D = E.getIntrinsicWidth();
        this.f12866C = this.f12865B.getIntrinsicHeight();
        this.f12865B.setBounds(0, 0, this.f12867D, this.f12866C);
    }
}
