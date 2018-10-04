package com.instagram.arlink.ui;

import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;

public class GradientOverlay extends View {
    /* renamed from: B */
    private int f36995B;
    /* renamed from: C */
    private int f36996C;
    /* renamed from: D */
    private int f36997D;
    /* renamed from: E */
    private final Paint f36998E = new Paint();
    /* renamed from: F */
    private int f36999F;
    /* renamed from: G */
    private int f37000G;

    public GradientOverlay(Context context) {
        super(context);
    }

    public GradientOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18217B(attributeSet);
    }

    public GradientOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18217B(attributeSet);
    }

    /* renamed from: B */
    private void m18217B(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.GradientOverlay);
        this.f36999F = obtainStyledAttributes.getColor(2, 0);
        this.f36995B = obtainStyledAttributes.getColor(0, 0);
        this.f36996C = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        canvas2.drawRect(0.0f, 0.0f, (float) this.f37000G, (float) this.f36997D, this.f36998E);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 571548991);
        int i5 = i2;
        super.onSizeChanged(i, i5, i3, i4);
        this.f37000G = i;
        this.f36997D = i5;
        this.f36998E.setShader(new LinearGradient((float) i, 0.0f, 0.0f, (float) i5, new int[]{this.f36999F, this.f36995B, this.f36996C}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
        this.f36998E.setDither(true);
        AnonymousClass0cQ.O(this, 406477006, N);
    }

    public void setAlpha(float f) {
        this.f36998E.setAlpha((int) (f * 255.0f));
        invalidate();
    }
}
