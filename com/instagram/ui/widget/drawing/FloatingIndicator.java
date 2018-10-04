package com.instagram.ui.widget.drawing;

import X.AnonymousClass0cN;
import X.AnonymousClass0e6;
import X.AnonymousClass0e7;
import X.AnonymousClass0eS;
import X.AnonymousClass2Kk;
import X.AnonymousClass2Kl;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.dextricks.StartupQEsConfig;

public class FloatingIndicator extends View {
    /* renamed from: B */
    public final Paint f29104B;
    /* renamed from: C */
    public boolean f29105C;
    /* renamed from: D */
    public boolean f29106D;
    /* renamed from: E */
    public float f29107E;
    /* renamed from: F */
    public AnonymousClass0cN f29108F;
    /* renamed from: G */
    public final Path f29109G;
    /* renamed from: H */
    public final RectF f29110H;
    /* renamed from: I */
    public final Paint f29111I;
    /* renamed from: J */
    public float f29112J;
    /* renamed from: K */
    public float f29113K;
    /* renamed from: L */
    public float f29114L;
    /* renamed from: M */
    private int f29115M;
    /* renamed from: N */
    private final Runnable f29116N;
    /* renamed from: O */
    private final AnonymousClass2Kl f29117O;

    public FloatingIndicator(Context context) {
        this(context, null);
    }

    public FloatingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29106D = false;
        this.f29105C = false;
        this.f29115M = 0;
        this.f29116N = new AnonymousClass2Kk(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0eS.FloatingIndicator);
        try {
            float dimension = obtainStyledAttributes.getDimension(0, 5.0f);
            Paint paint = new Paint();
            this.f29104B = paint;
            paint.setStyle(Style.FILL);
            paint = new Paint(1);
            this.f29111I = paint;
            paint.setStyle(Style.STROKE);
            this.f29111I.setColor(-1);
            this.f29111I.setStrokeWidth(dimension);
            this.f29111I.setStrokeJoin(Join.ROUND);
            AnonymousClass0e7 B = AnonymousClass0e6.B();
            this.f29117O = new AnonymousClass2Kl(this);
            this.f29108F = B.C().A(this.f29117O);
            this.f29109G = new Path();
            this.f29110H = new RectF();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: A */
    public final void m15105A() {
        removeCallbacks(this.f29116N);
        this.f29105C = false;
        this.f29106D = false;
        this.f29108F.K().N(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    /* renamed from: B */
    public final void m15106B(float f, float f2, float f3, float f4, float f5, int i, int i2, long j) {
        AnonymousClass2Kl anonymousClass2Kl = this.f29117O;
        anonymousClass2Kl.f29099B = f;
        anonymousClass2Kl.f29100C = f2;
        anonymousClass2Kl.f29101D = f3;
        anonymousClass2Kl.f29102E = f4;
        this.f29115M = i2;
        if (this.f29106D) {
            this.f29113K = Math.min(Math.max(f3, 0.0f), (float) getWidth());
            this.f29114L = Math.min(Math.max(f4, 0.0f), (float) getHeight());
            this.f29107E = f5 / 2.0f;
        } else if (!this.f29105C) {
            postDelayed(this.f29116N, j);
            this.f29105C = true;
        }
        this.f29104B.setColor(i);
        this.f29112J = f5;
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f29115M;
        if (i == 0) {
            canvas.drawCircle(this.f29113K, this.f29114L, this.f29107E, this.f29104B);
            canvas.drawCircle(this.f29113K, this.f29114L, this.f29107E, this.f29111I);
        } else if (i == 1) {
            this.f29109G.rewind();
            RectF rectF = this.f29110H;
            float f = this.f29113K;
            float f2 = this.f29107E;
            float f3 = f - f2;
            float f4 = this.f29114L;
            rectF.set(f3, f4 - f2, f + f2, f4 + f2);
            this.f29109G.addArc(this.f29110H, 130.0f, 280.0f);
            this.f29109G.lineTo(this.f29113K, this.f29114L + (this.f29107E * 1.3f));
            this.f29109G.close();
            canvas.drawPath(this.f29109G, this.f29104B);
            canvas.drawPath(this.f29109G, this.f29111I);
        }
    }
}
