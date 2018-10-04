package com.instagram.ui.widget.balloonsview;

import X.AnonymousClass0Gs;
import X.AnonymousClass0dh;
import X.AnonymousClass5J7;
import X.AnonymousClass5J8;
import X.AnonymousClass5J9;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.ArrayList;
import java.util.List;

public class BalloonsView extends View {
    /* renamed from: B */
    public boolean f61983B;
    /* renamed from: C */
    public AnonymousClass5J9 f61984C;
    /* renamed from: D */
    public Paint f61985D;
    /* renamed from: E */
    public Bitmap f61986E;
    /* renamed from: F */
    public RectF f61987F = new RectF();
    /* renamed from: G */
    public float f61988G;
    /* renamed from: H */
    private List f61989H;
    /* renamed from: I */
    private int f61990I;
    /* renamed from: J */
    private long f61991J;
    /* renamed from: K */
    private int f61992K;

    public BalloonsView(Context context) {
        super(context);
        m26210E();
    }

    public BalloonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26210E();
    }

    public BalloonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26210E();
    }

    /* renamed from: A */
    public final void m26211A() {
        if (!this.f61983B && this.f61986E != null) {
            this.f61983B = true;
            postInvalidateOnAnimation();
            this.f61991J = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: B */
    public static void m26207B(BalloonsView balloonsView) {
        balloonsView.f61989H = new ArrayList();
        for (int i = 0; i < 24; i++) {
            balloonsView.f61989H.add(new AnonymousClass5J8(balloonsView.f61990I));
        }
    }

    /* renamed from: B */
    public final void m26212B(String str) {
        AnonymousClass0Gs.f2431j.D(str).C(new AnonymousClass5J7(this)).B();
    }

    /* renamed from: C */
    private static int m26208C(float f) {
        return f > 0.9f ? (int) AnonymousClass0dh.C((double) f, 0.8999999761581421d, 1.0d, 255.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) : 255;
    }

    /* renamed from: D */
    private static float m26209D(AnonymousClass5J8 anonymousClass5J8, float f) {
        if (f <= 0.9f) {
            return anonymousClass5J8.f61978E;
        }
        double d = (double) anonymousClass5J8.f61978E;
        double C = AnonymousClass0dh.C((double) f, 0.8999999761581421d, 1.0d, 1.0d, 0);
        Double.isNaN(d);
        return (float) (d * C);
    }

    /* renamed from: E */
    private void m26210E() {
        this.f61985D = new Paint(1);
        this.f61990I = getContext().getResources().getDimensionPixelSize(C0164R.dimen.balloon_oscillation_width);
        this.f61992K = getContext().getResources().getDimensionPixelSize(C0164R.dimen.balloon_y_start_range);
        m26207B(this);
    }

    public final void onDraw(Canvas canvas) {
        if (this.f61983B) {
            Canvas canvas2 = canvas;
            int height = canvas2.getHeight();
            r8.f61988G = (float) (getWidth() / 8);
            Object obj = null;
            for (int i = 0; i < r8.f61989H.size(); i++) {
                AnonymousClass5J8 anonymousClass5J8 = (AnonymousClass5J8) r8.f61989H.get(i);
                long elapsedRealtime = SystemClock.elapsedRealtime() - r8.f61991J;
                if (elapsedRealtime >= 0) {
                    float f = (float) elapsedRealtime;
                    if (f < anonymousClass5J8.f61975B) {
                        f /= anonymousClass5J8.f61975B;
                        float height2 = ((float) (height - (r8.f61986E.getHeight() / 2))) - ((f * ((float) height)) * 0.5f);
                        double d = anonymousClass5J8.f61980G;
                        double d2 = (double) r8.f61992K;
                        Double.isNaN(d2);
                        height2 += (float) (d * d2);
                        d = anonymousClass5J8.f61979F;
                        float f2 = r8.f61988G;
                        d2 = (double) f2;
                        Double.isNaN(d2);
                        float f3 = (((float) (d * d2)) + (f2 * ((float) (i % 8)))) + ((float) anonymousClass5J8.f61977D);
                        d = (double) f;
                        d2 = (double) (anonymousClass5J8.f61981H * 6.0f);
                        Double.isNaN(d2);
                        f3 += (float) AnonymousClass0dh.C((double) ((float) ((Math.sin((d2 * 3.141592653589793d) * d) + 1.0d) / 2.0d)), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) (-anonymousClass5J8.f61976C), (double) anonymousClass5J8.f61976C);
                        f2 = ((float) (r8.f61986E.getWidth() / 2)) * m26209D(anonymousClass5J8, f);
                        Bitmap bitmap = r8.f61986E;
                        int C = m26208C(f);
                        RectF rectF = r8.f61987F;
                        rectF.left = f3 - f2;
                        rectF.right = f3 + f2;
                        rectF.top = height2 - f2;
                        rectF.bottom = height2 + f2;
                        r8.f61985D.setAlpha(C);
                        canvas2.drawBitmap(bitmap, null, r8.f61987F, r8.f61985D);
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                postInvalidateOnAnimation();
                return;
            }
            AnonymousClass5J9 anonymousClass5J9 = r8.f61984C;
            if (anonymousClass5J9 != null) {
                anonymousClass5J9.bv();
            }
            m26207B(r8);
            r8.f61983B = false;
        }
    }

    public void setAnimationListener(AnonymousClass5J9 anonymousClass5J9) {
        this.f61984C = anonymousClass5J9;
    }
}
