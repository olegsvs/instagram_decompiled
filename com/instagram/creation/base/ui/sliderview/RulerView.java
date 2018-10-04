package com.instagram.creation.base.ui.sliderview;

import X.AnonymousClass0G5;
import X.AnonymousClass0Nm;
import X.AnonymousClass3zq;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.C0164R;

public class RulerView extends View {
    /* renamed from: B */
    public int f39245B;
    /* renamed from: C */
    public int f39246C;
    /* renamed from: D */
    public final int f39247D;
    /* renamed from: E */
    public final Paint f39248E;
    /* renamed from: F */
    public int f39249F;
    /* renamed from: G */
    public Rect f39250G;
    /* renamed from: H */
    public final Paint f39251H;
    /* renamed from: I */
    private boolean f39252I;
    /* renamed from: J */
    private int f39253J;
    /* renamed from: K */
    private AnonymousClass3zq f39254K;
    /* renamed from: L */
    private int f39255L;
    /* renamed from: M */
    private float f39256M;
    /* renamed from: N */
    private float f39257N;
    /* renamed from: O */
    private float f39258O;

    public RulerView(Context context) {
        this(context, null);
    }

    public RulerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RulerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39248E = new Paint();
        this.f39251H = new Paint();
        this.f39247D = AnonymousClass0G5.D(getContext(), C0164R.attr.creationTextColor);
        Resources resources = getResources();
        this.f39245B = Math.round(AnonymousClass0Nm.E(resources.getDisplayMetrics(), 20));
        this.f39246C = 2;
        this.f39249F = 5;
        this.f39251H.setColor(this.f39247D);
        this.f39251H.setTextSize((float) resources.getDimensionPixelSize(C0164R.dimen.trim_ruler_text_size));
        this.f39251H.setTextAlign(Align.CENTER);
        this.f39251H.setAntiAlias(true);
        this.f39250G = new Rect();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0164R.dimen.sliderview_pointer_width);
        int i2 = this.f39246C;
        if (i2 % 2 != dimensionPixelSize % 2) {
            this.f39246C = i2 + 1;
        }
    }

    /* renamed from: B */
    public static void m19063B(RulerView rulerView, Canvas canvas, float f, float f2, int i) {
        AnonymousClass3zq anonymousClass3zq = rulerView.f39254K;
        if (anonymousClass3zq != null) {
            String A = anonymousClass3zq.m21931A(i);
            if (A != null) {
                rulerView.f39251H.getTextBounds(A, 0, A.length(), rulerView.f39250G);
                canvas.drawText(A, f, f2 + ((float) rulerView.f39250G.centerY()), rulerView.f39251H);
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        float height = (float) getHeight();
        float f = this.f39257N;
        float f2 = height * f;
        height *= (1.0f - f) - this.f39256M;
        f = this.f39258O;
        float f3 = f2 + ((1.0f - f) * height);
        float f4 = height * f;
        for (int i = 0; i <= r8.f39255L; i++) {
            float f5 = (float) ((r8.f39245B * i) + r8.f39253J);
            Canvas canvas2 = canvas;
            if (i % r8.f39249F == 0) {
                r8.f39248E.setColor(r8.f39247D);
                int i2 = r8.f39246C;
                canvas2.drawRect(f5 - (((float) i2) / 2.0f), f2, f5 + (((float) i2) / 2.0f), f2 + height, r8.f39248E);
                m19063B(r8, canvas2, f5, f2, i);
            } else {
                r8.f39248E.setColor(r8.f39247D);
                canvas2.drawRect(f5, f3, f5 + 1.0f, f3 + f4, r8.f39248E);
                m19063B(r8, canvas2, f5, f3, i);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        if (!this.f39252I) {
            int size = MeasureSpec.getSize(i) - this.f39253J;
            int i3 = this.f39245B;
            this.f39255L = ((size + i3) - 1) / i3;
        }
        setMeasuredDimension((this.f39255L * this.f39245B) + (this.f39253J * 2), MeasureSpec.getSize(i2));
    }

    public void setIncrementWidthPx(int i) {
        this.f39245B = i;
    }

    public void setLeftRightMarginPx(int i) {
        this.f39253J = i;
    }

    public void setLeftRightMarginRatio(float f) {
        this.f39253J = Math.round(f * ((float) getResources().getDisplayMetrics().widthPixels));
    }

    public void setLineLabeler(AnonymousClass3zq anonymousClass3zq) {
        this.f39254K = anonymousClass3zq;
    }

    public void setNumIncrements(int i) {
        this.f39255L = i;
        this.f39252I = true;
    }

    public void setPaddingBottomRatio(float f) {
        this.f39256M = f;
    }

    public void setPaddingTopRatio(float f) {
        this.f39257N = f;
    }

    public void setSmallLineRatio(float f) {
        this.f39258O = f;
    }

    public void setSmallToLargeLineFrequency(int i) {
        this.f39249F = i;
    }
}
