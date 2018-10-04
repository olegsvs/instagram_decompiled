package com.instagram.wellbeing.timespent.ui;

import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.widget.TextView;

public class GradientTextView extends TextView {
    /* renamed from: B */
    private int f63329B;
    /* renamed from: C */
    private int f63330C;
    /* renamed from: D */
    private int f63331D;
    /* renamed from: E */
    private int f63332E;
    /* renamed from: F */
    private int f63333F;

    public GradientTextView(Context context) {
        super(context);
    }

    public GradientTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26486B(attributeSet);
    }

    public GradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26486B(attributeSet);
    }

    /* renamed from: B */
    private void m26486B(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.GradientText);
        this.f63330C = obtainStyledAttributes.getColor(1, 0);
        this.f63332E = obtainStyledAttributes.getColor(3, 0);
        this.f63333F = obtainStyledAttributes.getColor(4, 0);
        this.f63331D = obtainStyledAttributes.getColor(2, 0);
        this.f63329B = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, -1795332671);
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        super.onSizeChanged(i, i5, i6, i7);
        if (!(i == i6 && i5 == i7)) {
            getPaint().setShader(new LinearGradient(0.0f, (float) i5, (float) i, 0.0f, new int[]{this.f63330C, this.f63332E, this.f63333F, this.f63331D, this.f63329B}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, TileMode.CLAMP));
            getPaint().setDither(true);
        }
        AnonymousClass0cQ.O(this, 594995189, N);
    }

    public void setContent(CharSequence charSequence) {
        setText(charSequence);
    }
}
