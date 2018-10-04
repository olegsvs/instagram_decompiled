package com.instagram.iig.components.stepperheader;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Nm;
import X.AnonymousClass0QP;
import X.AnonymousClass0QQ;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0eS;
import X.AnonymousClass1Ar;
import X.AnonymousClass1Iw;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import com.facebook.C0164R;
import com.facebook.forker.Process;

public class StepperHeader extends View implements AnonymousClass1Ar, AnonymousClass0QP, AnonymousClass0QQ {
    /* renamed from: B */
    public int f58858B;
    /* renamed from: C */
    public final Paint f58859C;
    /* renamed from: D */
    public final Paint f58860D;
    /* renamed from: E */
    public int f58861E;
    /* renamed from: F */
    private final int[] f58862F;
    /* renamed from: G */
    private final int[][] f58863G;
    /* renamed from: H */
    private final int[] f58864H;
    /* renamed from: I */
    private final Paint f58865I;
    /* renamed from: J */
    private final int[] f58866J;
    /* renamed from: K */
    private int f58867K;
    /* renamed from: L */
    private int f58868L;
    /* renamed from: M */
    private int f58869M;
    /* renamed from: N */
    private int f58870N;
    /* renamed from: O */
    private final AnonymousClass0cN f58871O;
    /* renamed from: P */
    private int f58872P;

    public final void At(int i) {
    }

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Bt(int i) {
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void Kt(int i, int i2) {
    }

    public final void RGA(View view) {
    }

    public final void eCA(int i, int i2) {
    }

    public final void ly(float f, float f2, AnonymousClass1Iw anonymousClass1Iw) {
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void uy(AnonymousClass1Iw anonymousClass1Iw, AnonymousClass1Iw anonymousClass1Iw2) {
    }

    public StepperHeader(Context context) {
        this(context, null);
    }

    public StepperHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StepperHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58864H = new int[]{AnonymousClass0Ca.C(getContext(), C0164R.color.warm_left), AnonymousClass0Ca.C(getContext(), C0164R.color.warm_mid), AnonymousClass0Ca.C(getContext(), C0164R.color.warm_right)};
        this.f58862F = new int[]{AnonymousClass0Ca.C(getContext(), C0164R.color.cold_left), AnonymousClass0Ca.C(getContext(), C0164R.color.cold_mid), AnonymousClass0Ca.C(getContext(), C0164R.color.cold_right)};
        this.f58863G = new int[][]{this.f58864H, this.f58862F};
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0eS.StepperHeader, i, 0);
            this.f58866J = obtainStyledAttributes.getInt(0, 0) == 1 ? this.f58862F : this.f58864H;
            this.f58872P = obtainStyledAttributes.getInt(1, 5);
            obtainStyledAttributes.recycle();
        } else {
            this.f58866J = this.f58863G[0];
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f58870N = displayMetrics.widthPixels;
        this.f58858B = Math.round(AnonymousClass0Nm.E(displayMetrics, 3));
        this.f58869M = Math.round(AnonymousClass0Nm.E(displayMetrics, 2));
        Paint paint = new Paint(1);
        this.f58865I = paint;
        paint.setStrokeWidth((float) (this.f58869M * 2));
        this.f58865I.setShader(new LinearGradient(0.0f, 0.0f, (float) this.f58870N, 0.0f, this.f58866J, null, TileMode.MIRROR));
        paint = new Paint(1);
        this.f58859C = paint;
        paint.setStrokeWidth((float) (this.f58869M * 2));
        this.f58859C.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_0));
        paint = new Paint(1);
        this.f58860D = paint;
        paint.setStrokeWidth((float) (this.f58869M * 2));
        this.f58860D.setColor(AnonymousClass0Ca.C(getContext(), C0164R.color.grey_5));
        this.f58871O = AnonymousClass0e6.B().C().O(AnonymousClass0e5.C(30.0d, 7.0d));
    }

    /* renamed from: A */
    public final void m25490A(int i, int i2) {
        this.f58868L = i;
        this.f58867K = i2;
        double d = (double) this.f58870N;
        int i3 = this.f58858B;
        int i4 = this.f58867K;
        double d2 = (double) (i3 * (i4 - 1));
        Double.isNaN(d);
        Double.isNaN(d2);
        d -= d2;
        d2 = (double) i4;
        Double.isNaN(d2);
        this.f58861E = (int) Math.ceil(d / d2);
        requestLayout();
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        if (this.f58867K > this.f58872P) {
            setScrollX((int) Math.round(anonymousClass0cN.E()));
        } else {
            setScrollX(0);
        }
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, 2071199970);
        super.onAttachedToWindow();
        this.f58871O.A(this);
        AnonymousClass0cQ.O(this, 1766535177, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, 1913771);
        super.onDetachedFromWindow();
        this.f58871O.K().J(this);
        AnonymousClass0cQ.O(this, 385920058, N);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        canvas2.drawLine(0.0f, 0.0f, (float) this.f58870N, 0.0f, this.f58865I);
        int paddingLeft = getPaddingLeft();
        for (int i = 0; i < this.f58867K; i++) {
            if (i != 0) {
                canvas2.drawLine((float) paddingLeft, 0.0f, (float) (this.f58858B + paddingLeft), 0.0f, this.f58859C);
                paddingLeft += this.f58858B;
            }
            if (i > this.f58868L) {
                canvas2.drawLine((float) paddingLeft, 0.0f, (float) (this.f58861E + paddingLeft), 0.0f, this.f58860D);
            }
            paddingLeft += this.f58861E;
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int i3 = this.f58870N;
            size = mode == Process.WAIT_RESULT_TIMEOUT ? Math.min(i3, size) : i3;
        }
        int mode2 = MeasureSpec.getMode(i2);
        mode = MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            i3 = this.f58869M;
            mode = mode2 == Process.WAIT_RESULT_TIMEOUT ? Math.min(i3, mode) : i3;
        }
        setMeasuredDimension(size, mode);
    }

    public final void onPageSelected(int i) {
        setCurrentPage(i);
    }

    private void setCurrentPage(int i) {
        this.f58868L = i;
        invalidate();
    }

    public final void ys(int i, int i2) {
        setCurrentPage(i);
    }
}
