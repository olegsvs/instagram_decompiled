package com.instagram.ui.widget.drawing;

import X.AnonymousClass0cN;
import X.AnonymousClass0ca;
import X.AnonymousClass0e6;
import X.AnonymousClass0eS;
import X.AnonymousClass14I;
import X.AnonymousClass26h;
import X.AnonymousClass2Kj;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public class EyedropperColorPickerTool extends View {
    /* renamed from: B */
    public float f29087B;
    /* renamed from: C */
    public Drawable f29088C;
    /* renamed from: D */
    public Drawable f29089D;
    /* renamed from: E */
    public AnonymousClass0cN f29090E;
    /* renamed from: F */
    public float f29091F;
    /* renamed from: G */
    private final Paint f29092G;
    /* renamed from: H */
    private final Paint f29093H;
    /* renamed from: I */
    private final float f29094I;
    /* renamed from: J */
    private float f29095J;
    /* renamed from: K */
    private final AnonymousClass14I f29096K;
    /* renamed from: L */
    private final float f29097L;

    public EyedropperColorPickerTool(Context context) {
        this(context, null);
    }

    public EyedropperColorPickerTool(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EyedropperColorPickerTool(Context context, AttributeSet attributeSet, int i) {
        Throwable th;
        super(context, attributeSet, i);
        this.f29096K = new AnonymousClass2Kj(this);
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.EyedropperTool);
            try {
                this.f29097L = Math.max(0.0f, Math.min(typedArray.getFloat(2, -1.0f), 1.0f));
                this.f29094I = typedArray.getDimension(4, 3.0f);
                this.f29095J = typedArray.getDimension(3, 0.0f);
                this.f29089D = typedArray.getDrawable(1);
                this.f29088C = typedArray.getDrawable(0);
                if (typedArray != null) {
                    typedArray.recycle();
                }
                Paint paint = new Paint(1);
                this.f29093H = paint;
                paint.setColor(-1);
                this.f29093H.setStyle(Style.STROKE);
                this.f29093H.setStrokeWidth(this.f29094I);
                Paint paint2 = new Paint(1);
                this.f29092G = paint2;
                paint2.setStyle(Style.FILL);
                setColor(-1);
                AnonymousClass0cN C = AnonymousClass0e6.B().C();
                C.f7108F = true;
                this.f29090E = C.A(this.f29096K);
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    private float getButtonRadius() {
        return (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) / 2.0f) + this.f29094I;
    }

    public final void onDraw(Canvas canvas) {
        float buttonRadius = getButtonRadius();
        canvas.drawCircle(this.f29091F, this.f29087B, buttonRadius - this.f29094I, this.f29092G);
        canvas.drawCircle(this.f29091F, this.f29087B, buttonRadius - this.f29094I, this.f29093H);
        buttonRadius = (float) this.f29090E.E();
        if (this.f29089D != null) {
            canvas.save();
            canvas.rotate(-45.0f * buttonRadius, this.f29091F, this.f29087B);
            this.f29089D.setAlpha((int) ((1.0f - buttonRadius) * 255.0f));
            this.f29089D.draw(canvas);
            canvas.restore();
        }
        if (this.f29088C != null) {
            canvas.save();
            canvas.rotate((1.0f - buttonRadius) * 45.0f, this.f29091F, this.f29087B);
            this.f29088C.setAlpha((int) (buttonRadius * 255.0f));
            this.f29088C.draw(canvas);
            canvas.restore();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f29091F = ((float) getWidth()) / 2.0f;
        this.f29087B = (((float) getHeight()) - this.f29091F) - ((float) getPaddingBottom());
        Drawable drawable = this.f29089D;
        if (drawable != null) {
            setIconBounds(drawable);
            this.f29089D.setAlpha(255);
        }
        drawable = this.f29088C;
        if (drawable != null) {
            setIconBounds(drawable);
            this.f29088C.setAlpha(0);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec((int) (((float) getResources().getDisplayMetrics().widthPixels) * this.f29097L), 1073741824), i2);
    }

    public void setColor(int i) {
        this.f29092G.setColor(i);
        ColorFilter B = AnonymousClass0ca.B(AnonymousClass26h.m14460C(i));
        Drawable drawable = this.f29089D;
        if (drawable != null) {
            drawable.setColorFilter(B);
        }
        drawable = this.f29088C;
        if (drawable != null) {
            drawable.setColorFilter(B);
        }
        invalidate();
    }

    private void setIconBounds(Drawable drawable) {
        float buttonRadius = getButtonRadius() * 2.0f;
        float min = Math.min(((float) Math.sqrt((double) ((buttonRadius * buttonRadius) / 2.0f))) - this.f29095J, ((float) drawable.getIntrinsicWidth()) / 2.0f);
        float f = this.f29091F;
        int i = (int) (f - min);
        float f2 = this.f29087B;
        drawable.setBounds(i, (int) (f2 - min), (int) (f + min), (int) (f2 + min));
    }
}
