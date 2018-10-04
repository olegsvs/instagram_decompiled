package com.instagram.common.ui.widget.imageview;

import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass0rm;
import X.AnonymousClass26H;
import X.AnonymousClass26I;
import X.AnonymousClass26J;
import X.AnonymousClass26K;
import X.AnonymousClass26L;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View.OnLayoutChangeListener;

public class RoundedCornerImageView extends IgImageView {
    /* renamed from: B */
    public OnLayoutChangeListener f25995B;
    /* renamed from: C */
    private int f25996C;
    /* renamed from: D */
    private AnonymousClass26J f25997D;
    /* renamed from: E */
    private boolean f25998E;
    /* renamed from: F */
    private float f25999F;
    /* renamed from: G */
    private int f26000G;
    /* renamed from: H */
    private int f26001H;
    /* renamed from: I */
    private AnonymousClass26K f26002I;
    /* renamed from: J */
    private boolean f26003J;
    /* renamed from: K */
    private int f26004K;

    public RoundedCornerImageView(Context context) {
        super(context);
        this.f26003J = true;
        this.f25997D = AnonymousClass26J.NONE;
        this.f25999F = 0.0f;
    }

    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26003J = true;
        this.f25997D = AnonymousClass26J.NONE;
        m14430D(attributeSet);
    }

    public RoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26003J = true;
        this.f25997D = AnonymousClass26J.NONE;
        m14430D(attributeSet);
    }

    /* renamed from: C */
    private Matrix m14429C(Bitmap bitmap) {
        return this.f25997D == AnonymousClass26J.CENTER_CROP ? AnonymousClass0rm.J(bitmap.getWidth(), bitmap.getHeight(), (getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom(), this.f25996C, this.f25998E) : null;
    }

    /* renamed from: D */
    private void m14430D(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.FramedRoundedCornerImageView);
        this.f25999F = (float) obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f26000G = obtainStyledAttributes.getInt(1, AnonymousClass26L.ALL.m14431A());
        this.f26004K = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f26001H = obtainStyledAttributes.getColor(2, 0);
        int i = this.f26004K;
        if (i > 0) {
            this.f26002I = new AnonymousClass26K(i, this.f26001H, this.f25999F, this.f26000G);
        }
        obtainStyledAttributes.recycle();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f26003J) {
            AnonymousClass26K anonymousClass26K = this.f26002I;
            if (anonymousClass26K != null) {
                anonymousClass26K.draw(canvas);
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 897815248);
        super.onSizeChanged(i, i2, i3, i4);
        AnonymousClass26K anonymousClass26K = this.f26002I;
        if (anonymousClass26K != null) {
            anonymousClass26K.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        }
        AnonymousClass0cQ.O(this, -1417323995, N);
    }

    public void setBitmapMirrored(boolean z) {
        this.f25998E = z;
    }

    public void setBitmapShaderRotation(int i) {
        this.f25996C = i;
    }

    public void setBitmapShaderScaleType(AnonymousClass26J anonymousClass26J) {
        this.f25997D = anonymousClass26J;
    }

    public static void setDrawable(RoundedCornerImageView roundedCornerImageView, Bitmap bitmap) {
        super.setImageDrawable(new AnonymousClass26H(bitmap, roundedCornerImageView.f25999F, roundedCornerImageView.m14429C(bitmap), roundedCornerImageView.f26000G));
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (this.f25995B != null) {
            removeOnLayoutChangeListener(this.f25995B);
            this.f25995B = null;
        }
        if (this.f25997D != AnonymousClass26J.NONE && getWidth() == 0 && getHeight() == 0) {
            this.f25995B = new AnonymousClass26I(this, bitmap);
            addOnLayoutChangeListener(this.f25995B);
            return;
        }
        setDrawable(this, bitmap);
    }

    public void setImageResource(int i) {
        throw new UnsupportedOperationException();
    }

    public void setImageURI(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public void setRadius(float f) {
        this.f25999F = f;
        if (this.f26002I != null) {
            this.f26002I = new AnonymousClass26K(this.f26004K, this.f26001H, this.f25999F, this.f26000G);
        }
    }

    public void setStrokeEnabled(boolean z) {
        if (this.f26003J != z) {
            this.f26003J = z;
            invalidate();
        }
    }
}
