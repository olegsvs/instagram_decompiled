package com.instagram.direct.ui;

import X.AnonymousClass0Nm;
import X.AnonymousClass0cN;
import X.AnonymousClass0cQ;
import X.AnonymousClass0dh;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.common.dextricks.StartupQEsConfig;

public class DirectSmokeOverlayView extends FrameLayout {
    /* renamed from: B */
    public Bitmap f57033B;
    /* renamed from: C */
    public int f57034C;
    /* renamed from: D */
    public AnonymousClass0cN f57035D;
    /* renamed from: E */
    public int f57036E;
    /* renamed from: F */
    public int f57037F;
    /* renamed from: G */
    private final Paint f57038G;
    /* renamed from: H */
    private final Matrix f57039H;
    /* renamed from: I */
    private final float f57040I;
    /* renamed from: J */
    private final float f57041J;

    public DirectSmokeOverlayView(Context context) {
        this(context, null);
    }

    public DirectSmokeOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DirectSmokeOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57040I = AnonymousClass0Nm.B(context, 10.0f);
        this.f57041J = AnonymousClass0Nm.B(context, 20.0f);
        this.f57038G = new Paint(5);
        this.f57039H = new Matrix();
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas2);
        AnonymousClass0cN anonymousClass0cN = this.f57035D;
        if (!(anonymousClass0cN == null || anonymousClass0cN.G())) {
            if (r0.f57034C != 0) {
                float E = (float) r0.f57035D.E();
                int max = Math.max(r0.f57033B.getWidth(), r0.f57033B.getHeight());
                double d = (double) E;
                float C = (float) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, 0.699999988079071d, 1.7999999523162842d);
                if (E < 0.5f) {
                    r0.f57038G.setAlpha((int) AnonymousClass0dh.C(d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.5d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 255.0d));
                } else {
                    r0.f57038G.setAlpha((int) AnonymousClass0dh.C(d, 0.5d, 1.0d, 255.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED));
                }
                canvas2.save();
                canvas2.scale(C, C, (float) r0.f57036E, (float) r0.f57037F);
                canvas2.translate(r0.f57040I * E, E * r0.f57041J);
                int i = r0.f57034C / 2;
                canvas2.translate((float) (r0.f57036E - i), (float) (r0.f57037F - i));
                C = ((float) r0.f57034C) / ((float) max);
                r0.f57039H.setScale(C, C);
                canvas2.drawBitmap(r0.f57033B, r0.f57039H, r0.f57038G);
                canvas2.restore();
            }
        }
    }

    public final void onDetachedFromWindow() {
        int N = AnonymousClass0cQ.N(this, -1693579366);
        super.onDetachedFromWindow();
        AnonymousClass0cN anonymousClass0cN = this.f57035D;
        if (anonymousClass0cN != null) {
            anonymousClass0cN.I();
            this.f57035D = null;
            this.f57033B.recycle();
            this.f57033B = null;
        }
        AnonymousClass0cQ.O(this, 303510565, N);
    }
}
