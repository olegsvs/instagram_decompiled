package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.facebook.common.dextricks.StartupQEsConfig;

/* renamed from: X.5JL */
public final class AnonymousClass5JL extends Drawable {
    /* renamed from: B */
    public int f62056B;
    /* renamed from: C */
    public int f62057C;
    /* renamed from: D */
    public int f62058D;
    /* renamed from: E */
    public float f62059E;
    /* renamed from: F */
    public int f62060F;
    /* renamed from: G */
    public float f62061G;
    /* renamed from: H */
    public float f62062H;
    /* renamed from: I */
    public float f62063I;
    /* renamed from: J */
    public float f62064J;
    /* renamed from: K */
    public int f62065K;
    /* renamed from: L */
    private final Paint f62066L = new Paint(5);
    /* renamed from: M */
    private final ValueAnimator f62067M;
    /* renamed from: N */
    private final Paint f62068N = new Paint(5);
    /* renamed from: O */
    private final Paint f62069O = new Paint(5);
    /* renamed from: P */
    private final ValueAnimator f62070P;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass5JL(Context context, int i, int i2) {
        m26225A(i, i2);
        this.f62069O.setStyle(Style.STROKE);
        this.f62069O.setStrokeWidth(AnonymousClass0Nm.C(context, 1));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f62067M = ofFloat;
        ofFloat.addUpdateListener(new AnonymousClass5JJ(this));
        this.f62067M.setRepeatCount(-1);
        this.f62067M.setRepeatMode(2);
        this.f62067M.setDuration(750);
        this.f62067M.setInterpolator(new LinearInterpolator());
        this.f62067M.start();
        ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f62070P = ofFloat;
        ofFloat.addUpdateListener(new AnonymousClass5JK(this));
        this.f62070P.setRepeatCount(-1);
        this.f62070P.setRepeatMode(1);
        this.f62070P.setDuration(3500);
        this.f62070P.setInterpolator(new LinearInterpolator());
        this.f62070P.start();
    }

    /* renamed from: A */
    public final void m26225A(int i, int i2) {
        Object obj;
        if (i == this.f62068N.getColor() && i == this.f62069O.getColor()) {
            if (this.f62066L.getColor() == i2) {
                obj = null;
                if (obj != null) {
                    this.f62068N.setColor(i);
                    this.f62069O.setColor(i);
                    this.f62066L.setColor(i2);
                    this.f62066L.setAlpha(127);
                    invalidateSelf();
                }
            }
        }
        obj = 1;
        if (obj != null) {
            this.f62068N.setColor(i);
            this.f62069O.setColor(i);
            this.f62066L.setColor(i2);
            this.f62066L.setAlpha(127);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        AnonymousClass5JL anonymousClass5JL = this;
        Canvas canvas2 = canvas;
        canvas2.drawCircle((float) this.f62056B, (float) this.f62057C, this.f62059E, this.f62066L);
        canvas2.drawCircle((float) this.f62056B, (float) this.f62057C, this.f62064J, this.f62068N);
        float f = this.f62061G;
        double C = f > 0.8f ? AnonymousClass0dh.C((double) f, 0.800000011920929d, 1.0d, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) : (double) f;
        f = anonymousClass5JL.f62062H;
        double C2 = f > 0.8f ? AnonymousClass0dh.C((double) f, 0.800000011920929d, 1.0d, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) : (double) f;
        float f2 = anonymousClass5JL.f62063I;
        double C3 = f2 > 0.8f ? AnonymousClass0dh.C((double) f2, 0.800000011920929d, 1.0d, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) : (double) f2;
        anonymousClass5JL.f62069O.setAlpha((int) (C * 127.0d));
        canvas2.drawCircle((float) anonymousClass5JL.f62056B, (float) anonymousClass5JL.f62057C, anonymousClass5JL.f62061G * ((float) anonymousClass5JL.f62060F), anonymousClass5JL.f62069O);
        anonymousClass5JL.f62069O.setAlpha((int) (C2 * 127.0d));
        canvas2.drawCircle((float) anonymousClass5JL.f62056B, (float) anonymousClass5JL.f62057C, anonymousClass5JL.f62062H * ((float) anonymousClass5JL.f62060F), anonymousClass5JL.f62069O);
        anonymousClass5JL.f62069O.setAlpha((int) (C3 * 127.0d));
        canvas2.drawCircle((float) anonymousClass5JL.f62056B, (float) anonymousClass5JL.f62057C, anonymousClass5JL.f62063I * ((float) anonymousClass5JL.f62060F), anonymousClass5JL.f62069O);
    }

    public final int getIntrinsicHeight() {
        return this.f62058D;
    }

    public final int getIntrinsicWidth() {
        return this.f62065K;
    }

    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        this.f62056B = bounds.width() / 2;
        this.f62057C = bounds.height() / 2;
        this.f62060F = bounds.width() / 2;
        this.f62065K = bounds.width();
        this.f62058D = bounds.height();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (!this.f62067M.isRunning() && z) {
            this.f62067M.start();
            this.f62070P.start();
        } else if (this.f62067M.isRunning() && !z) {
            this.f62067M.end();
            this.f62070P.end();
        }
        return super.setVisible(z, z2);
    }
}
