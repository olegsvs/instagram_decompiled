package com.instagram.ui.widget.gradientspinner;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Nm;
import X.AnonymousClass0cQ;
import X.AnonymousClass2LX;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.facebook.C0164R;

public class SpinningGradientBorder extends FrameLayout {
    /* renamed from: B */
    private final Paint f29300B;
    /* renamed from: C */
    private final RectF f29301C;
    /* renamed from: D */
    private final float f29302D;
    /* renamed from: E */
    private final int f29303E;
    /* renamed from: F */
    private LinearGradient f29304F;
    /* renamed from: G */
    private final Matrix f29305G;
    /* renamed from: H */
    private int f29306H;
    /* renamed from: I */
    private final float f29307I;
    /* renamed from: J */
    private final ValueAnimator f29308J;

    public SpinningGradientBorder(Context context) {
        this(context, null);
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29306H = 0;
        this.f29302D = AnonymousClass0Nm.C(getContext(), 4);
        this.f29307I = AnonymousClass0Nm.B(getContext(), 1.5f);
        Paint paint = new Paint(1);
        this.f29300B = paint;
        paint.setStyle(Style.STROKE);
        this.f29300B.setStrokeWidth(this.f29307I);
        this.f29300B.setStrokeCap(Cap.ROUND);
        this.f29301C = new RectF();
        this.f29305G = new Matrix();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(1200);
        this.f29308J = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.f29308J.setRepeatCount(-1);
        this.f29308J.addUpdateListener(new AnonymousClass2LX(this));
        this.f29303E = AnonymousClass0Ca.C(getContext(), C0164R.color.grey_2);
        setWillNotDraw(false);
    }

    /* renamed from: B */
    private void m15162B(Canvas canvas) {
        RectF rectF = this.f29301C;
        float f = this.f29307I;
        rectF.set(f, f, ((float) getWidth()) - this.f29307I, ((float) getHeight()) - this.f29307I);
        RectF rectF2 = this.f29301C;
        float f2 = this.f29302D;
        canvas.drawRoundRect(rectF2, f2, f2, this.f29300B);
    }

    private LinearGradient getGradient() {
        if (this.f29304F == null) {
            this.f29304F = new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), AnonymousClass0Ca.C(getContext(), C0164R.color.white), AnonymousClass0Ca.C(getContext(), C0164R.color.grey_2), TileMode.CLAMP);
        }
        return this.f29304F;
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 787297186);
        super.onDetachedFromWindow();
        this.f29308J.end();
        AnonymousClass0cQ.O(this, -2123829886, N);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (this.f29306H) {
            case 0:
                return;
            case 1:
                this.f29300B.setShader(getGradient());
                this.f29305G.setRotate((((Float) this.f29308J.getAnimatedValue()).floatValue() * 360.0f) - 0.099609375f, (float) (getWidth() / 2), (float) (getHeight() / 2));
                getGradient().setLocalMatrix(this.f29305G);
                m15162B(canvas);
                return;
            case 2:
                this.f29300B.setShader(null);
                this.f29300B.setColor(this.f29303E);
                m15162B(canvas);
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid SpinnerState ");
                stringBuilder.append(this.f29306H);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void setCurrentPlayTime(long j) {
        this.f29308J.setCurrentPlayTime(j);
    }

    public void setSpinnerState(int i) {
        if (this.f29306H != i) {
            this.f29306H = i;
            switch (i) {
                case 0:
                case 2:
                    this.f29308J.cancel();
                    break;
                case 1:
                    this.f29308J.start();
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid SpinnerState ");
                    stringBuilder.append(this.f29306H);
                    throw new IllegalStateException(stringBuilder.toString());
            }
            invalidate();
        }
    }
}
