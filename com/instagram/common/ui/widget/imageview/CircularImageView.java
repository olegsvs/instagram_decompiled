package com.instagram.common.ui.widget.imageview;

import X.AnonymousClass0cQ;
import X.AnonymousClass0eS;
import X.AnonymousClass0h8;
import X.AnonymousClass0te;
import X.AnonymousClass16n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;

public class CircularImageView extends IgImageView {
    /* renamed from: B */
    public int f7200B;
    /* renamed from: C */
    private final Rect f7201C = new Rect();
    /* renamed from: D */
    private AnonymousClass0h8 f7202D;
    /* renamed from: E */
    private boolean f7203E;
    /* renamed from: F */
    private boolean f7204F;
    /* renamed from: G */
    private Rect f7205G;
    /* renamed from: H */
    private int f7206H;

    public CircularImageView(Context context) {
        super(context);
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5922C(attributeSet);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5922C(attributeSet);
    }

    /* renamed from: C */
    private void m5922C(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.CircularImageView);
        int color = obtainStyledAttributes.getColor(0, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f7203E = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        m5924H(dimensionPixelSize, color);
    }

    /* renamed from: G */
    public final void m5923G() {
        setStrokeAlpha(0);
    }

    /* renamed from: H */
    public final void m5924H(int i, int i2) {
        if (i != 0) {
            this.f7206H = i;
            AnonymousClass0h8 anonymousClass0h8 = this.f7202D;
            if (anonymousClass0h8 == null) {
                this.f7202D = new AnonymousClass0h8(i, i2);
                this.f7200B = this.f7202D.f8348B.getAlpha();
            } else {
                anonymousClass0h8.f8348B.setStrokeWidth((float) i);
                this.f7202D.f8348B.setColor(i2);
            }
        }
        invalidate();
    }

    public int getStrokeWidth() {
        return this.f7206H;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7202D != null) {
            if (this.f7204F) {
                Rect rect = this.f7205G;
                if (rect != null) {
                    canvas.clipRect(rect, Op.REPLACE);
                }
            }
            this.f7202D.draw(canvas);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.m5864N(this, 229240072);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f7202D != null) {
            int i5 = 0;
            if (getBackground() != null) {
                getBackground().getPadding(this.f7201C);
            } else {
                this.f7201C.set(0, 0, 0, 0);
            }
            int paddingLeft = this.f7203E ? getPaddingLeft() : 0;
            int paddingTop = this.f7203E ? getPaddingTop() : 0;
            int paddingRight = this.f7203E ? getPaddingRight() : 0;
            if (this.f7203E) {
                i5 = getPaddingBottom();
            }
            if (this.f7204F) {
                this.f7205G = new Rect((paddingLeft + this.f7201C.left) - this.f7206H, (paddingTop + this.f7201C.top) - this.f7206H, ((getWidth() - paddingRight) - this.f7201C.right) + this.f7206H, ((getHeight() - i5) - this.f7201C.bottom) + this.f7206H);
                this.f7202D.setBounds(this.f7205G);
            } else {
                this.f7202D.setBounds(paddingLeft + this.f7201C.left, paddingTop + this.f7201C.top, (getWidth() - paddingRight) - this.f7201C.right, (getHeight() - i5) - this.f7201C.bottom);
            }
        }
        AnonymousClass0cQ.m5865O(this, 1332306114, N);
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageDrawable(bitmap != null ? new AnonymousClass16n(bitmap) : null);
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            setImageBitmap(((BitmapDrawable) drawable).getBitmap());
        } else if (drawable instanceof ColorDrawable) {
            int color = ((ColorDrawable) drawable).getColor();
            Drawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color);
            gradientDrawable.setShape(1);
            super.setImageDrawable(gradientDrawable);
        } else {
            if (!((drawable instanceof AnonymousClass16n) || (drawable instanceof GradientDrawable) || (drawable instanceof LayerDrawable) || (drawable instanceof AnonymousClass0te))) {
                if (drawable != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("This view doesn't support drawable type: ");
                    stringBuilder.append(drawable.getClass());
                    throw new UnsupportedOperationException(stringBuilder.toString());
                }
            }
            super.setImageDrawable(drawable);
        }
    }

    public void setImageResource(int i) {
        throw new UnsupportedOperationException("Use setImageDrawable or setImageBitmap");
    }

    public void setImageURI(Uri uri) {
        throw new UnsupportedOperationException("Use setImageDrawable or setImageBitmap");
    }

    public void setStrokeAlpha(int i) {
        AnonymousClass0h8 anonymousClass0h8 = this.f7202D;
        if (anonymousClass0h8 != null) {
            anonymousClass0h8.setAlpha(i);
        }
    }

    public void setStrokeOnOutsideOfImage(boolean z) {
        this.f7204F = z;
    }
}
