package com.instagram.ui.text;

import X.AnonymousClass0Ca;
import X.AnonymousClass0eS;
import X.AnonymousClass2JX;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.C0164R;

public class FittingTextView extends View {
    /* renamed from: B */
    public Drawable f28836B;
    /* renamed from: C */
    public int f28837C;
    /* renamed from: D */
    public String f28838D;
    /* renamed from: E */
    public boolean f28839E;
    /* renamed from: F */
    public int f28840F;
    /* renamed from: G */
    public boolean f28841G;
    /* renamed from: H */
    public float f28842H;
    /* renamed from: I */
    private AnonymousClass2JX f28843I;
    /* renamed from: J */
    private final StaticLayout f28844J;

    public FittingTextView(Context context) {
        this(context, null);
    }

    public FittingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FittingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28837C = 0;
        this.f28843I = AnonymousClass2JX.TEXT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.FittingTextView, 0, 0);
        if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.hasValue(1)) {
            this.f28836B = obtainStyledAttributes.getDrawable(0);
            this.f28838D = obtainStyledAttributes.getString(2);
            this.f28842H = obtainStyledAttributes.getDimension(6, 0.0f);
            this.f28837C = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f28839E = obtainStyledAttributes.getBoolean(3, false);
            this.f28840F = obtainStyledAttributes.getColor(4, -1);
            this.f28841G = obtainStyledAttributes.getBoolean(5, false);
            obtainStyledAttributes.recycle();
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            float f = this.f28842H;
            if (f <= 0.0f) {
                f = (float) getResources().getDimensionPixelSize(C0164R.dimen.font_large);
            }
            textPaint.setTextSize(f);
            textPaint.setColor(this.f28840F);
            if (this.f28841G) {
                textPaint.setShadowLayer(7.2f, 0.0f, 0.0f, AnonymousClass0Ca.C(getContext(), C0164R.color.black_25_transparent));
            }
            if (this.f28839E) {
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            }
            int measureText = (int) textPaint.measureText(this.f28838D);
            CharSequence charSequence = this.f28838D;
            this.f28844J = new StaticLayout(charSequence, 0, charSequence.length(), textPaint, measureText, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        obtainStyledAttributes.recycle();
        throw new RuntimeException("Fitting text, icon, and maximum width required.");
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (this.f28843I.ordinal()) {
            case 0:
                canvas.save();
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                this.f28844J.draw(canvas);
                canvas.restore();
                return;
            case 1:
                Drawable drawable = this.f28836B;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f28836B.getIntrinsicHeight());
                this.f28836B.draw(canvas);
                return;
            default:
                return;
        }
    }

    public final void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        AnonymousClass2JX anonymousClass2JX = this.f28844J.getWidth() + paddingLeft > this.f28837C ? AnonymousClass2JX.ICON : AnonymousClass2JX.TEXT;
        this.f28843I = anonymousClass2JX;
        setMeasuredDimension(anonymousClass2JX == AnonymousClass2JX.TEXT ? this.f28844J.getWidth() + paddingLeft : this.f28836B.getIntrinsicWidth(), MeasureSpec.getSize(i2));
    }

    public void setMaxWidth(int i) {
        this.f28837C = i;
        requestLayout();
    }
}
