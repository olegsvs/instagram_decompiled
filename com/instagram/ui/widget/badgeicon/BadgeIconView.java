package com.instagram.ui.widget.badgeicon;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Nm;
import X.AnonymousClass1m3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;

public class BadgeIconView extends View {
    /* renamed from: B */
    public int[] f12803B;
    /* renamed from: C */
    private final Paint f12804C;
    /* renamed from: D */
    private float f12805D;
    /* renamed from: E */
    private final Paint f12806E;
    /* renamed from: F */
    private Drawable f12807F;
    /* renamed from: G */
    private float f12808G;
    /* renamed from: H */
    private float f12809H;

    public BadgeIconView(Context context) {
        this(context, null);
    }

    public BadgeIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BadgeIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12809H = 0.25f;
        this.f12808G = 0.55f;
        this.f12804C = new Paint();
        this.f12806E = new Paint();
        this.f12805D = AnonymousClass0Nm.m3424C(getContext(), 2);
        int C = AnonymousClass0Ca.m937C(getContext(), C0164R.color.grey_0);
        this.f12804C.setAntiAlias(true);
        Paint paint = this.f12804C;
        Style style = Style.FILL;
        paint.setStyle(style);
        this.f12804C.setColor(C);
        this.f12806E.setAntiAlias(true);
        this.f12806E.setStyle(style);
        this.f12803B = new int[]{C, C};
        m8642A((float) getMeasuredWidth(), (float) getMeasuredHeight());
    }

    /* renamed from: A */
    public final void m8642A(float f, float f2) {
        float f3 = f2;
        this.f12806E.setShader(new LinearGradient(0.0f, f3, f, 0.0f, this.f12803B, null, TileMode.CLAMP));
    }

    public final void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        canvas.drawCircle(width, height, width, this.f12804C);
        float f = width - this.f12805D;
        canvas.drawCircle(width, height, f, this.f12806E);
        Drawable drawable = this.f12807F;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            f = (f * 2.0f) * this.f12808G;
            float f2 = (float) intrinsicWidth;
            width = (float) this.f12807F.getIntrinsicHeight();
            float min = Math.min(1.0f, Math.min(f / f2, f / width));
            int round = Math.round(f2 * min);
            int round2 = Math.round(width * min);
            intrinsicWidth = Math.round(((float) (getWidth() - round)) / 2.0f);
            int round3 = Math.round(((float) (getHeight() - round2)) / 2.0f);
            this.f12807F.setBounds(intrinsicWidth, round3, round + intrinsicWidth, round2 + round3);
            this.f12807F.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = ((float) getMeasuredWidth()) - (this.f12805D * 2.0f);
        m8642A(measuredWidth, measuredWidth);
        setTranslationY(((float) getMeasuredHeight()) * this.f12809H);
    }

    public void setBackgroundColorGradient(int[] iArr) {
        if (this.f12803B != iArr) {
            this.f12803B = iArr;
            m8642A((float) getMeasuredWidth(), (float) getMeasuredHeight());
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        float B = AnonymousClass0Nm.m3423B(getContext(), f);
        if (this.f12805D != B) {
            this.f12805D = B;
            invalidate();
        }
    }

    public void setIconDrawable(int i) {
        setIconDrawable(AnonymousClass0Ca.m939E(getContext(), i));
    }

    public void setIconDrawable(Drawable drawable) {
        if (this.f12807F != drawable) {
            this.f12807F = drawable;
            invalidate();
        }
    }

    public void setIconSizeFactor(float f) {
        if (f != this.f12808G) {
            this.f12808G = f;
            invalidate();
        }
    }

    public void setIconTintColor(int i) {
        Drawable drawable = this.f12807F;
        if (drawable != null) {
            AnonymousClass1m3.f22522B.C(drawable, i);
        }
    }

    public void setIconTintColorResource(int i) {
        setIconTintColor(AnonymousClass0Ca.m937C(getContext(), i));
    }

    public void setTranslationYFactor(float f) {
        if (f != this.f12809H) {
            this.f12809H = f;
            invalidate();
        }
    }
}
