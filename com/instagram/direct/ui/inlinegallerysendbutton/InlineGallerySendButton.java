package com.instagram.direct.ui.inlinegallerysendbutton;

import X.AnonymousClass0Ca;
import X.AnonymousClass0Dc;
import X.AnonymousClass0Nm;
import X.AnonymousClass0QP;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0ca;
import X.AnonymousClass0dh;
import X.AnonymousClass0e5;
import X.AnonymousClass0e6;
import X.AnonymousClass0eS;
import X.AnonymousClass4m3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;

public class InlineGallerySendButton extends View implements AnonymousClass0QP {
    /* renamed from: B */
    public float f57063B;
    /* renamed from: C */
    public AnonymousClass0cN f57064C;
    /* renamed from: D */
    private int f57065D;
    /* renamed from: E */
    private final float f57066E;
    /* renamed from: F */
    private final float f57067F;
    /* renamed from: G */
    private final Path f57068G;
    /* renamed from: H */
    private final float f57069H;
    /* renamed from: I */
    private final float f57070I;
    /* renamed from: J */
    private Paint f57071J;
    /* renamed from: K */
    private int f57072K;
    /* renamed from: L */
    private final int f57073L;
    /* renamed from: M */
    private final float f57074M;
    /* renamed from: N */
    private final Paint f57075N;
    /* renamed from: O */
    private float f57076O;
    /* renamed from: P */
    private AnonymousClass4m3 f57077P;
    /* renamed from: Q */
    private final int f57078Q;
    /* renamed from: R */
    private final Paint f57079R;
    /* renamed from: S */
    private float f57080S;
    /* renamed from: T */
    private final Paint f57081T;
    /* renamed from: U */
    private Bitmap f57082U;
    /* renamed from: V */
    private Paint f57083V;

    public final void BBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public final void EBA(AnonymousClass0cN anonymousClass0cN) {
    }

    public InlineGallerySendButton(Context context) {
        this(context, null);
    }

    public InlineGallerySendButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InlineGallerySendButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57068G = new Path();
        this.f57080S = 1.0f;
        this.f57076O = 1.0f;
        this.f57065D = 255;
        int i2 = -1;
        this.f57072K = -1;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass0eS.InlineGallerySendButton, 0, 0);
        try {
            this.f57073L = obtainStyledAttributes.getColor(5, -7829368);
            this.f57078Q = obtainStyledAttributes.getColor(7, -1);
            this.f57074M = obtainStyledAttributes.getDimension(6, 10.0f);
            i2 = -16777216;
            int color = obtainStyledAttributes.getColor(1, -16777216);
            float f = 0.0f;
            this.f57067F = obtainStyledAttributes.getDimension(2, f);
            this.f57069H = obtainStyledAttributes.getDimension(3, f);
            this.f57070I = obtainStyledAttributes.getDimension(4, f);
            this.f57066E = obtainStyledAttributes.getFloat(0, f);
            Paint paint = new Paint(1);
            this.f57075N = paint;
            paint.setColor(this.f57073L);
            this.f57075N.setStyle(Style.FILL);
            paint = new Paint(this.f57075N);
            this.f57079R = paint;
            paint.setStyle(Style.STROKE);
            this.f57079R.setColor(this.f57078Q);
            this.f57079R.setStrokeWidth(this.f57074M);
            Paint paint2 = new Paint(1);
            this.f57081T = paint2;
            paint2.setColor(color);
            this.f57081T.setStrokeCap(Cap.ROUND);
            this.f57081T.setStrokeJoin(Join.MITER);
            this.f57081T.setStrokeWidth(this.f57070I);
            this.f57081T.setStyle(Style.STROKE);
            color = AnonymousClass0Ca.C(context, C0164R.color.black_40_transparent);
            paint = new Paint(1);
            this.f57083V = paint;
            paint.setShadowLayer(AnonymousClass0Nm.C(context, 4), f, f, color);
            paint = new Paint(1);
            this.f57071J = paint;
            paint.setColorFilter(AnonymousClass0ca.B(i2));
            this.f57064C = AnonymousClass0e6.B().C().O(AnonymousClass0e5.C(80.0d, 7.0d));
            if (VERSION.SDK_INT > 25) {
                setClickable(false);
                setFocusable(true);
                return;
            }
            setClickable(true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: B */
    private void m25024B(int i) {
        setPressedAlpha(false);
        if (i != 3) {
            AnonymousClass4m3 anonymousClass4m3 = this.f57077P;
            if (anonymousClass4m3 != null) {
                anonymousClass4m3.az();
            }
        }
    }

    public final void DBA(AnonymousClass0cN anonymousClass0cN) {
        invalidate();
    }

    public final void FBA(AnonymousClass0cN anonymousClass0cN) {
        this.f57080S = (float) anonymousClass0cN.E();
        this.f57076O = 1.0f;
        int C = (int) AnonymousClass0dh.C((double) this.f57080S, 1.0d, (double) this.f57063B, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 255.0d);
        this.f57065D = C;
        this.f57065D = (int) AnonymousClass0dh.B((double) C, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 255.0d);
        invalidate();
    }

    public final void onAttachedToWindow() {
        int N = AnonymousClass0cQ.N(this, -1088281566);
        super.onAttachedToWindow();
        this.f57064C.A(this);
        AnonymousClass0cQ.O(this, 368443941, N);
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -1018456818);
        super.onDetachedFromWindow();
        this.f57064C.J(this);
        AnonymousClass0cQ.O(this, 850635360, N);
    }

    public final void onDraw(Canvas canvas) {
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        float f = this.f57080S * min;
        min = (min - this.f57074M) * this.f57076O;
        Canvas canvas2 = canvas;
        if (this.f57082U == null) {
            this.f57082U = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Config.ALPHA_8);
            new Canvas(this.f57082U).drawCircle(((float) canvas.getWidth()) / 2.0f, ((float) canvas.getHeight()) / 2.0f, (float) Math.floor((double) min), this.f57083V);
        }
        canvas.drawBitmap(this.f57082U, 0.0f, 0.0f, this.f57071J);
        if (f != min) {
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, f, this.f57079R);
        }
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, min, this.f57075N);
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        float f2 = this.f57069H;
        float f3 = width - (f2 / 2.0f);
        float f4 = f3 + f2;
        canvas.rotate(this.f57066E, width, height);
        canvas.save();
        canvas.translate(0.0f, -(height - f3));
        canvas.rotate(45.0f, width, height);
        this.f57068G.moveTo(this.f57067F + width, height);
        this.f57068G.lineTo(width, height);
        this.f57068G.lineTo(width, this.f57067F + height);
        this.f57081T.setAlpha(this.f57065D);
        canvas.drawPath(this.f57068G, this.f57081T);
        canvas.restore();
        canvas2.drawLine(width, f3 + this.f57070I, width, f4, this.f57081T);
        canvas.rotate(-this.f57066E, width, height);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int N = AnonymousClass0cQ.N(this, 1439140834);
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        this.f57063B = (min - this.f57074M) / min;
        AnonymousClass0cQ.O(this, -1872217825, N);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int M = AnonymousClass0cQ.M(this, 1421043214);
        if (isEnabled()) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            switch (actionMasked) {
                case 0:
                case 5:
                    int i = this.f57072K;
                    if (i == -1) {
                        this.f57072K = pointerId;
                        setPressedAlpha(true);
                        AnonymousClass0cQ.L(this, 1936194587, M);
                        return true;
                    } else if (i == pointerId) {
                        AnonymousClass0Dc.R("InlineGallerySendButton", "The touch sequence shall not happen. Current pointer id: %s. Incoming: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(pointerId)});
                        AnonymousClass0cQ.L(this, 258164124, M);
                        return false;
                    } else {
                        AnonymousClass0cQ.L(this, -2096040625, M);
                        return false;
                    }
                case 1:
                case 3:
                case 6:
                    if (pointerId == this.f57072K) {
                        m25024B(actionMasked);
                    }
                    if (actionMasked != 6) {
                        this.f57072K = -1;
                    }
                    AnonymousClass0cQ.L(this, 1915615108, M);
                    return true;
                case 2:
                case 4:
                    break;
                default:
                    break;
            }
        }
        AnonymousClass0cQ.L(this, -1516961496, M);
        return false;
    }

    public void setListener(AnonymousClass4m3 anonymousClass4m3) {
        this.f57077P = anonymousClass4m3;
    }

    private void setPressedAlpha(boolean z) {
        if (z) {
            this.f57075N.setAlpha((int) (((float) Color.alpha(this.f57073L)) * 0.6f));
            this.f57079R.setAlpha((int) (((float) Color.alpha(this.f57078Q)) * 0.6f));
        } else {
            this.f57075N.setColor(this.f57073L);
            this.f57079R.setColor(this.f57078Q);
        }
        invalidate();
    }
}
