package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;

/* renamed from: X.2Uu */
public final class AnonymousClass2Uu extends AnonymousClass25o {
    /* renamed from: B */
    private float f30950B;
    /* renamed from: C */
    private float f30951C;
    /* renamed from: D */
    private final Paint f30952D;
    /* renamed from: E */
    private final Paint f30953E;
    /* renamed from: F */
    private float f30954F;
    /* renamed from: G */
    private final int f30955G;
    /* renamed from: H */
    private float f30956H;
    /* renamed from: I */
    private float f30957I;
    /* renamed from: J */
    private float f30958J;
    /* renamed from: K */
    private long f30959K;
    /* renamed from: L */
    private boolean f30960L;
    /* renamed from: M */
    private boolean f30961M;
    /* renamed from: N */
    private final int[] f30962N;
    /* renamed from: O */
    private final int f30963O;
    /* renamed from: P */
    private float f30964P;
    /* renamed from: Q */
    private final RectF f30965Q;
    /* renamed from: R */
    private final int f30966R;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass2Uu(Context context, int i, int i2, int[] iArr, float f, int i3, int i4) {
        this.f30966R = AnonymousClass0Ca.C(context, i);
        this.f30963O = AnonymousClass0Ca.C(context, i2);
        this.f30962N = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f30962N[i5] = AnonymousClass0Ca.C(context, iArr[i5]);
        }
        this.f30964P = AnonymousClass0Nm.B(context, f);
        Paint paint = new Paint(1);
        this.f30953E = paint;
        paint.setStyle(Style.STROKE);
        this.f30953E.setStrokeWidth(this.f30964P);
        paint = new Paint();
        this.f30952D = paint;
        paint.setStyle(Style.STROKE);
        this.f30952D.setStrokeWidth(this.f30964P);
        this.f30955G = i4;
        this.f30965Q = new RectF();
        m16070F(0.5f);
    }

    /* renamed from: A */
    public final int mo3228A() {
        return Math.round(this.f30954F * 0.5f);
    }

    /* renamed from: B */
    public final void mo3229B(int i) {
        this.f30954F = (float) i;
    }

    /* renamed from: C */
    public final void mo3230C() {
        this.f30961M = false;
        this.f30960L = true;
        invalidateSelf();
    }

    /* renamed from: D */
    public final void mo3231D(boolean z) {
        if (this.f30961M != z) {
            this.f30961M = z;
            if (z) {
                this.f30959K = System.currentTimeMillis();
            }
            invalidateSelf();
        }
    }

    /* renamed from: E */
    public final void mo3232E(float f) {
        this.f30956H = f;
        if (f < 0.5f) {
            this.f30960L = false;
        }
        invalidateSelf();
    }

    /* renamed from: F */
    public final void m16070F(float f) {
        this.f30958J = f / 2.0f;
    }

    public final void draw(Canvas canvas) {
        AnonymousClass2Uu anonymousClass2Uu = this;
        Rect bounds = getBounds();
        int round = Math.round(AnonymousClass0nB.E(this.f30956H, 0.5f, 1.0f, 0.0f, 190.0f, true));
        int round2 = Math.round(AnonymousClass0nB.E(this.f30956H, 0.5f, 1.0f, 0.0f, 255.0f, true));
        this.f30965Q.set(bounds);
        RectF rectF = this.f30965Q;
        int i = this.f30955G;
        rectF.inset((float) i, (float) i);
        RectF rectF2 = this.f30965Q;
        float f = this.f30950B;
        float f2 = this.f30957I;
        float f3 = f - f2;
        float f4 = this.f30951C;
        rectF2.set(f3, f4 - f2, f + f2, f4 + f2);
        Canvas canvas2 = canvas;
        if (!this.f30961M) {
            if (!this.f30960L) {
                this.f30953E.setColor(this.f30966R);
                if (this.f30953E.getColor() != 0) {
                    this.f30953E.setAlpha(round);
                }
                canvas2.drawCircle(this.f30950B, this.f30951C, this.f30957I, this.f30953E);
                this.f30953E.setColor(this.f30963O);
                if (this.f30953E.getColor() != 0) {
                    this.f30953E.setAlpha(round);
                }
                canvas2.drawArc(this.f30965Q, -90.0f, AnonymousClass0nB.E(this.f30956H, 0.5f, 1.0f, 0.0f, 360.0f, true), false, this.f30953E);
                if (!anonymousClass2Uu.f30961M || anonymousClass2Uu.f30960L) {
                    invalidateSelf();
                }
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f30959K;
        this.f30953E.setColor(this.f30966R);
        if (this.f30953E.getColor() != 0) {
            this.f30953E.setAlpha(round);
        }
        canvas2.drawCircle(this.f30950B, this.f30951C, this.f30957I, this.f30953E);
        this.f30953E.setColor(this.f30963O);
        float f5 = (float) currentTimeMillis;
        round = (int) AnonymousClass0nB.E(f5, 0.0f, 300.0f, (float) round, 0.0f, true);
        if (anonymousClass2Uu.f30953E.getColor() != 0) {
            anonymousClass2Uu.f30953E.setAlpha(round);
        }
        canvas2.drawCircle(anonymousClass2Uu.f30950B, anonymousClass2Uu.f30951C, anonymousClass2Uu.f30957I, anonymousClass2Uu.f30953E);
        f3 = AnonymousClass0nB.D((float) (currentTimeMillis % 750), 0.0f, 750.0f, 0.0f, 1.0f) * 360.0f;
        double D = (double) AnonymousClass0nB.D(f5, 0.0f, 1250.0f, 0.0f, 1.0f);
        double floor = Math.floor(D);
        Double.isNaN(D);
        float f6 = (float) (D - floor);
        if (Math.floor(D) % 2.0d == 1.0d) {
            f6 = 1.0f - f6;
        }
        f6 *= 225.0f;
        if (anonymousClass2Uu.f30952D.getColor() != 0) {
            anonymousClass2Uu.f30952D.setAlpha(round2);
        }
        canvas2.rotate(f3 - 90.0f, anonymousClass2Uu.f30950B, anonymousClass2Uu.f30951C);
        canvas2.drawArc(anonymousClass2Uu.f30965Q, 0.0f, f6, false, anonymousClass2Uu.f30952D);
        if (anonymousClass2Uu.f30961M) {
        }
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        int width = rect.width();
        int height = rect.height();
        float f = (float) width;
        this.f30950B = f / 2.0f;
        this.f30951C = ((float) height) / 2.0f;
        this.f30957I = (f * this.f30958J) - (this.f30964P / 2.0f);
        this.f30952D.setShader(new SweepGradient(this.f30950B, this.f30951C, this.f30962N, null));
    }
}
