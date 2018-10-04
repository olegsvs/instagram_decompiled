package com.instagram.ui.widget.edittext;

import X.AnonymousClass0Ca;
import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.util.AttributeSet;
import android.widget.EditText;
import com.facebook.C0164R;

public class ConfirmationCodeEditText extends EditText {
    /* renamed from: B */
    public Paint f62024B;
    /* renamed from: C */
    public int f62025C;
    /* renamed from: D */
    public Paint f62026D;
    /* renamed from: E */
    public int f62027E;
    /* renamed from: F */
    public boolean f62028F;
    /* renamed from: G */
    public Paint f62029G;
    /* renamed from: H */
    public float f62030H;
    /* renamed from: I */
    private float f62031I;
    /* renamed from: J */
    private int f62032J;
    /* renamed from: K */
    private int f62033K;

    public ConfirmationCodeEditText(Context context) {
        super(context);
        m26219C(null);
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26219C(attributeSet);
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26219C(attributeSet);
    }

    /* renamed from: A */
    public final void m26221A(int i, boolean z) {
        this.f62027E = i;
        this.f62028F = z;
        m26218B();
        m26220D();
        invalidate();
    }

    /* renamed from: B */
    private void m26218B() {
        if (this.f62028F) {
            this.f62031I = ((float) this.f62033K) / (((float) this.f62027E) + 0.5f);
        } else {
            this.f62031I = (float) (this.f62033K / this.f62027E);
        }
    }

    /* renamed from: C */
    private void m26219C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.ConfirmationCodeEditText);
            this.f62030H = obtainStyledAttributes.getDimension(1, getResources().getDimension(C0164R.dimen.confirmation_code_font_size));
            this.f62027E = obtainStyledAttributes.getInt(0, 6);
            this.f62028F = obtainStyledAttributes.getBoolean(2, false);
            this.f62025C = 0;
        }
        m26220D();
        Paint paint = new Paint();
        this.f62029G = paint;
        paint.setTextSize(this.f62030H);
        this.f62029G.setAntiAlias(true);
        this.f62029G.setTextAlign(Align.CENTER);
        paint = new Paint();
        this.f62026D = paint;
        paint.setStyle(Style.STROKE);
        this.f62026D.setStrokeWidth(8.0f);
        paint = new Paint();
        this.f62024B = paint;
        paint.setStyle(Style.STROKE);
        this.f62024B.setStrokeWidth(8.0f);
        this.f62024B.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_3));
    }

    /* renamed from: D */
    private void m26220D() {
        setFilters(new InputFilter[]{new LengthFilter(this.f62027E)});
        setBackground(null);
        setCursorVisible(false);
        setInputType(2);
    }

    public int getMaximumSize() {
        return this.f62027E;
    }

    public final void onDraw(Canvas canvas) {
        float f = this.f62031I / 2.0f;
        int i = this.f62032J;
        float f2 = (float) (i - 8);
        float descent = ((float) (i / 2)) - ((this.f62029G.descent() + this.f62029G.ascent()) / 2.0f);
        Editable text = getText();
        int i2 = 0;
        Canvas canvas2 = canvas;
        if (this.f62025C == 1) {
            while (true) {
                i = r6.f62027E;
                if (i2 < i) {
                    if (r6.f62028F && i2 == i / 2) {
                        f += r6.f62031I / 2.0f;
                    }
                    if (i2 < text.length()) {
                        canvas2.drawText(Character.toString(text.charAt(i2)), f, descent, r6.f62029G);
                    }
                    float f3 = r6.f62031I;
                    canvas2.drawRoundRect(new RectF(f - (f3 / 2.5f), (f2 - ((float) r6.f62032J)) + 16.0f, (f3 / 2.5f) + f, f2), 12.0f, 12.0f, r6.f62024B);
                    f += r6.f62031I;
                    i2++;
                } else {
                    return;
                }
            }
        }
        i2 = 0;
        while (true) {
            i = r6.f62027E;
            if (i2 < i) {
                if (r6.f62028F && i2 == i / 2) {
                    f += r6.f62031I / 2.0f;
                }
                if (i2 < text.length()) {
                    canvas2.drawText(Character.toString(text.charAt(i2)), f, f2, r6.f62029G);
                } else {
                    float f4 = r6.f62031I;
                    canvas2.drawLine(f - (f4 / 4.0f), f2, f + (f4 / 4.0f), f2, r6.f62026D);
                }
                f += r6.f62031I;
                i2++;
            } else {
                return;
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 874948578);
        super.onSizeChanged(i, i2, i3, i4);
        this.f62033K = i;
        this.f62032J = i2;
        m26218B();
        AnonymousClass0cQ.O(this, -285740953, N);
    }

    public void setFrameStyle(int i) {
        this.f62025C = i;
    }
}
