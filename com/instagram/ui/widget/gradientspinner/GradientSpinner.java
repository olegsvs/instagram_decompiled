package com.instagram.ui.widget.gradientspinner;

import X.AnonymousClass0eS;
import X.AnonymousClass13W;
import X.AnonymousClass16Q;
import X.AnonymousClass16S;
import X.AnonymousClass16T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.C0164R;
import com.facebook.forker.Process;

public class GradientSpinner extends View {
    /* renamed from: W */
    public static final Interpolator f10552W = AnonymousClass16Q.m9425B(1.0f, 0.25f, 1.0f, 0.25f);
    /* renamed from: B */
    public final Paint f10553B;
    /* renamed from: C */
    public LinearGradient f10554C;
    /* renamed from: D */
    public long f10555D;
    /* renamed from: E */
    public int f10556E;
    /* renamed from: F */
    public final int[] f10557F;
    /* renamed from: G */
    public final Paint f10558G;
    /* renamed from: H */
    private float f10559H;
    /* renamed from: I */
    private int f10560I;
    /* renamed from: J */
    private long f10561J;
    /* renamed from: K */
    private final RectF f10562K;
    /* renamed from: L */
    private final AccelerateDecelerateInterpolator f10563L;
    /* renamed from: M */
    private final int[] f10564M;
    /* renamed from: N */
    private final Paint f10565N;
    /* renamed from: O */
    private Integer f10566O;
    /* renamed from: P */
    private final Matrix f10567P;
    /* renamed from: Q */
    private float f10568Q;
    /* renamed from: R */
    private final Paint f10569R;
    /* renamed from: S */
    private final float f10570S;
    /* renamed from: T */
    private final Picture f10571T;
    /* renamed from: U */
    private float f10572U;
    /* renamed from: V */
    private AnonymousClass16S[] f10573V;

    public GradientSpinner(Context context) {
        this(context, null);
    }

    public GradientSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0164R.style.GradientSpinnerStyle);
    }

    public GradientSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 0;
        this.f10567P = new Matrix();
        this.f10564M = new int[5];
        this.f10557F = new int[5];
        this.f10563L = new AccelerateDecelerateInterpolator();
        this.f10573V = new AnonymousClass16S[30];
        this.f10560I = i2;
        this.f10556E = i2;
        this.f10555D = -1;
        this.f10571T = new Picture();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass0eS.GradientSpinner, i2, C0164R.style.GradientSpinnerStyle);
        try {
            this.f10559H = obtainStyledAttributes.getDimension(0, 4.0f);
            this.f10570S = obtainStyledAttributes.getDimension(4, 4.0f);
            this.f10566O = Integer.valueOf(obtainStyledAttributes.getResourceId(2, C0164R.style.GradientPatternStyle));
            int color = obtainStyledAttributes.getColor(3, -16777216);
            i2 = obtainStyledAttributes.getColor(1, -65536);
            AnonymousClass16T.m9429C(getContext(), attributeSet, getGradientColorRes(), this.f10564M);
            Paint paint = new Paint(1);
            this.f10553B = paint;
            paint.setStyle(Style.STROKE);
            this.f10553B.setStrokeWidth(this.f10559H);
            this.f10553B.setStrokeCap(Cap.ROUND);
            paint = new Paint(this.f10553B);
            this.f10569R = paint;
            paint.setShader(m7812F(color));
            this.f10569R.setStrokeWidth(this.f10570S);
            paint = new Paint(this.f10569R);
            this.f10565N = paint;
            paint.setShader(m7812F(i2));
            this.f10558G = new Paint(this.f10553B);
            this.f10562K = new RectF();
            if (VERSION.SDK_INT < 23) {
                setLayerType(1, null);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: A */
    public final boolean m7815A() {
        return this.f10560I == 1;
    }

    /* renamed from: B */
    public final void m7816B() {
        setState(0);
    }

    /* renamed from: B */
    public static void m7808B(GradientSpinner gradientSpinner, int i, float f, boolean z) {
        int i2 = 30;
        while (true) {
            i2--;
            if (i2 >= 0) {
                gradientSpinner.f10573V[i2] = new AnonymousClass16S(i2, -(z ? f10552W.getInterpolation(((float) i2) * f) : ((float) i2) * f), i);
            } else {
                return;
            }
        }
    }

    /* renamed from: C */
    public final void m7817C() {
        setState(2);
    }

    /* renamed from: C */
    public static void m7809C(GradientSpinner gradientSpinner, float f, Canvas canvas, float f2, float f3) {
        GradientSpinner gradientSpinner2 = gradientSpinner;
        gradientSpinner2.f10554C.getLocalMatrix(gradientSpinner2.f10567P);
        float elapsedRealtime = (float) (SystemClock.elapsedRealtime() - gradientSpinner2.f10561J);
        gradientSpinner2.f10568Q = ((elapsedRealtime / f2) * 360.0f) % 360.0f;
        gradientSpinner2.f10567P.setRotate(gradientSpinner2.f10568Q, ((float) gradientSpinner2.getWidth()) / 2.0f, ((float) gradientSpinner2.getHeight()) / 2.0f);
        gradientSpinner2.f10554C.setLocalMatrix(gradientSpinner2.f10567P);
        gradientSpinner2.f10572U = ((elapsedRealtime / f3) * 360.0f) % 360.0f;
        gradientSpinner2.getCurrentPaint().setAlpha(gradientSpinner2.getCurrentPaintAlpha());
        gradientSpinner2.f10558G.setAlpha(gradientSpinner2.getNextPaintAlpha());
        Object obj = null;
        for (int i = 0; i < 30; i++) {
            int i2 = gradientSpinner2.f10560I;
            Canvas canvas2 = canvas;
            float f4 = f;
            if (i2 == 1) {
                AnonymousClass16S anonymousClass16S = gradientSpinner2.f10573V[i];
                Paint currentPaint = gradientSpinner2.getCurrentPaint();
                Paint paint = gradientSpinner2.f10558G;
                float f5 = gradientSpinner2.f10572U;
                RectF rectF = gradientSpinner2.f10562K;
                float f6 = gradientSpinner2.f10559H;
                float f7 = anonymousClass16S.f14541E;
                if (f7 < 0.0f) {
                    anonymousClass16S.f14541E = f7 + f;
                }
                f7 = anonymousClass16S.f14541E;
                if (f7 > 0.0f) {
                    anonymousClass16S.f14539C += f7;
                    anonymousClass16S.f14541E = 0.0f;
                } else if (f7 == 0.0f) {
                    anonymousClass16S.f14539C += f;
                }
                if (anonymousClass16S.f14539C > 1.0f) {
                    int i3 = anonymousClass16S.f14538B;
                    if (i3 > 0) {
                        anonymousClass16S.f14538B = i3 - 1;
                    }
                    if (anonymousClass16S.f14538B != 0) {
                        anonymousClass16S.f14539C %= 1.0f;
                    } else {
                        anonymousClass16S.f14539C = 1.0f;
                    }
                }
                f7 = anonymousClass16S.f14539C;
                if (f7 < 0.0f) {
                    f4 = 0.0f;
                } else if (f7 < 0.5f) {
                    f4 = 1.0f - f10552W.getInterpolation(1.0f - (f7 * 2.0f));
                } else {
                    f4 = f10552W.getInterpolation(1.0f - ((f7 * 2.0f) - 1.0f));
                }
                AnonymousClass16S.m9426B(canvas2, currentPaint, paint, f6, f5, f4, anonymousClass16S.f14540D, 30, true, rectF);
            } else if (i2 == 3) {
                gradientSpinner2.f10573V[i].m9427A(canvas2, gradientSpinner2.getCurrentPaint(), gradientSpinner2.f10558G, f4, gradientSpinner2.f10572U, gradientSpinner2.f10562K, gradientSpinner2.f10559H);
            }
            AnonymousClass16S anonymousClass16S2 = gradientSpinner2.f10573V[i];
            Object obj2 = (anonymousClass16S2.f14538B == 0 && anonymousClass16S2.f14539C == 1.0f) ? 1 : null;
            if (obj2 == null) {
                obj = 1;
            }
        }
        if (obj == null) {
            gradientSpinner2.m7822H();
        }
        gradientSpinner2.postInvalidateOnAnimation();
    }

    /* renamed from: D */
    public final void m7818D() {
        setState(1);
    }

    /* renamed from: D */
    private void m7810D(Canvas canvas) {
        Paint currentPaint = getCurrentPaint();
        currentPaint.setAlpha(getCurrentPaintAlpha());
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.f10562K, 0.0f, 360.0f, false, currentPaint);
        this.f10558G.setAlpha(getNextPaintAlpha());
        if (this.f10558G.getAlpha() > 0) {
            canvas2.drawArc(this.f10562K, 0.0f, 360.0f, false, this.f10558G);
        }
    }

    /* renamed from: E */
    public final void m7819E() {
        m7813G(1);
    }

    /* renamed from: E */
    private boolean m7811E() {
        return this.f10555D != -1;
    }

    /* renamed from: F */
    private static BitmapShader m7812F(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(i);
        TileMode tileMode = TileMode.REPEAT;
        return new BitmapShader(createBitmap, tileMode, tileMode);
    }

    /* renamed from: F */
    public final void m7820F() {
        m7813G(-1);
    }

    /* renamed from: G */
    public final void m7821G() {
        m7808B(this, -1, 0.016666668f, true);
        this.f10561J = SystemClock.elapsedRealtime();
        setAnimMode(3);
    }

    /* renamed from: G */
    private void m7813G(int i) {
        m7808B(this, i, 0.033333335f, true);
        this.f10561J = SystemClock.elapsedRealtime();
        setAnimMode(1);
    }

    /* renamed from: H */
    public final void m7822H() {
        int i = this.f10560I;
        if (i != 0) {
            if (i != 2) {
                this.f10561J = SystemClock.elapsedRealtime();
                setAnimMode(2);
            }
        }
    }

    /* renamed from: H */
    private void m7814H(float f, Canvas canvas) {
        this.f10554C.getLocalMatrix(this.f10567P);
        float elapsedRealtime = (float) (SystemClock.elapsedRealtime() - this.f10561J);
        float f2 = this.f10568Q % 360.0f;
        f2 += (360.0f - f2) * (elapsedRealtime / 1000.0f);
        this.f10567P.setRotate(f2, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        this.f10554C.setLocalMatrix(this.f10567P);
        this.f10572U = ((elapsedRealtime / 8000.0f) * 360.0f) % 360.0f;
        getCurrentPaint().setAlpha(getCurrentPaintAlpha());
        this.f10558G.setAlpha(getNextPaintAlpha());
        Object obj = null;
        for (int i = 0; i < 30; i++) {
            AnonymousClass16S anonymousClass16S = r4.f10573V[i];
            Paint currentPaint = getCurrentPaint();
            Paint paint = r4.f10558G;
            float f3 = r4.f10572U;
            RectF rectF = r4.f10562K;
            float f4 = r4.f10559H;
            float f5 = anonymousClass16S.f14539C;
            if (f5 < 0.5f) {
                anonymousClass16S.f14539C = 1.0f - f5;
            }
            float f6 = anonymousClass16S.f14539C + f;
            anonymousClass16S.f14539C = f6;
            if (f6 > 1.0f) {
                anonymousClass16S.f14539C = 1.0f;
            }
            Canvas canvas2 = canvas;
            float f7 = f3;
            float f8 = f4;
            Paint paint2 = paint;
            AnonymousClass16S.m9426B(canvas2, currentPaint, paint2, f8, f7, f10552W.getInterpolation(1.0f - ((anonymousClass16S.f14539C * 2.0f) - 1.0f)), anonymousClass16S.f14540D, 30, true, rectF);
            if (r4.f10573V[i].f14539C != 1.0f) {
                obj = 1;
            }
        }
        if (obj == null && f2 >= 360.0f) {
            setAnimMode(0);
            r4.f10568Q = 0.0f;
            r4.f10567P.setRotate(0.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            r4.f10554C.setLocalMatrix(r4.f10567P);
        }
        postInvalidateOnAnimation();
    }

    private Paint getCurrentPaint() {
        Paint paint;
        Object obj = 1;
        if (this.f10556E != 1) {
            obj = null;
        }
        if (obj != null) {
            paint = this.f10569R;
        } else {
            if ((this.f10556E == 2 ? 1 : null) != null) {
                paint = this.f10565N;
            } else {
                paint = this.f10553B;
            }
        }
        if (this.f10560I == 0) {
            obj = 1;
            if (this.f10556E != 1) {
                obj = null;
            }
            if (obj != null) {
                paint.setStrokeWidth(this.f10570S);
                return paint;
            }
        }
        paint.setStrokeWidth(this.f10559H);
        return paint;
    }

    private int getCurrentPaintAlpha() {
        if (m7811E()) {
            return Math.round((1.0f - getGradientTransitionProgress()) * 255.0f);
        }
        return 255;
    }

    private int getGradientColorRes() {
        Integer num = this.f10566O;
        return num == null ? C0164R.style.GradientPatternStyle : num.intValue();
    }

    private float getGradientTransitionProgress() {
        if (!m7811E()) {
            return 0.0f;
        }
        return this.f10563L.getInterpolation(Math.max(Math.min(((float) (SystemClock.elapsedRealtime() - this.f10555D)) / 500.0f, 1.0f), 0.0f));
    }

    private int getNextPaintAlpha() {
        if (m7811E()) {
            return Math.round(getGradientTransitionProgress() * 255.0f);
        }
        return 0;
    }

    public AnonymousClass13W getProgressState() {
        return new AnonymousClass13W(this.f10573V, this.f10561J, this.f10560I, this.f10556E);
    }

    public final void onDraw(Canvas canvas) {
        Canvas beginRecording = this.f10571T.beginRecording(getWidth(), getHeight());
        int i = this.f10560I;
        if (i == 1) {
            m7809C(this, 0.0083335f, beginRecording, 8000.0f, 8000.0f);
        } else if (i == 2) {
            m7814H(0.0083335f, beginRecording);
        } else if (i == 0) {
            m7810D(beginRecording);
        } else if (i == 3) {
            m7809C(this, 0.002083375f, beginRecording, 22000.0f, 15000.0f);
        }
        if (m7811E()) {
            if (getGradientTransitionProgress() < 1.0f) {
                postInvalidateOnAnimation();
            } else {
                this.f10555D = -1;
                this.f10553B.setShader(AnonymousClass16T.m9430D(getMeasuredWidth(), getMeasuredHeight(), this.f10557F));
            }
        }
        canvas.drawPicture(this.f10571T);
    }

    public final void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i);
        if ((mode == Process.WAIT_RESULT_TIMEOUT || mode == 1073741824) && size < size2) {
            size2 = size;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size2, 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f10554C = AnonymousClass16T.m9430D(measuredWidth, measuredHeight, this.f10564M);
        this.f10553B.setShader(this.f10554C);
        float max = Math.max(this.f10559H, this.f10570S) / 2.0f;
        this.f10562K.set(((float) getPaddingLeft()) + max, ((float) getPaddingTop()) + max, ((float) (measuredWidth - getPaddingRight())) - max, ((float) (measuredHeight - getPaddingBottom())) - max);
    }

    private void setAnimMode(int i) {
        if (this.f10560I != i) {
            this.f10560I = i;
            invalidate();
        }
    }

    public void setErrorColour(int i) {
        this.f10565N.setShader(m7812F(i));
        if ((this.f10556E == 2 ? 1 : null) != null) {
            invalidate();
        }
    }

    public void setGradientColors(int i) {
        Integer num = this.f10566O;
        if (num == null || num.intValue() != i) {
            this.f10566O = Integer.valueOf(i);
            AnonymousClass16T.m9429C(getContext(), null, getGradientColorRes(), this.f10564M);
            this.f10554C = AnonymousClass16T.m9430D(getMeasuredWidth(), getMeasuredHeight(), this.f10564M);
            this.f10553B.setShader(this.f10554C);
            invalidate();
        }
    }

    public void setProgressState(AnonymousClass13W anonymousClass13W) {
        this.f10573V = anonymousClass13W.f13735D;
        this.f10561J = SystemClock.elapsedRealtime() - anonymousClass13W.f13734C;
        this.f10560I = anonymousClass13W.f13733B;
        this.f10556E = anonymousClass13W.f13736E;
        invalidate();
    }

    private void setState(int i) {
        if (this.f10556E != i) {
            this.f10556E = i;
            invalidate();
        }
    }
}
