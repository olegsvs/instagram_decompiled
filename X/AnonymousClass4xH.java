package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import com.facebook.C0164R;

/* renamed from: X.4xH */
public final class AnonymousClass4xH extends Drawable implements Callback {
    /* renamed from: B */
    private final int f58805B;
    /* renamed from: C */
    private final int f58806C;
    /* renamed from: D */
    private final Drawable f58807D;
    /* renamed from: E */
    private final Drawable f58808E;
    /* renamed from: F */
    private final float f58809F;
    /* renamed from: G */
    private final float f58810G;
    /* renamed from: H */
    private final AnonymousClass1JG f58811H;
    /* renamed from: I */
    private final int f58812I = this.f58814K;
    /* renamed from: J */
    private AnonymousClass4xG f58813J;
    /* renamed from: K */
    private final int f58814K;
    /* renamed from: L */
    private final Paint f58815L;
    /* renamed from: M */
    private AnonymousClass4xG f58816M;
    /* renamed from: N */
    private final AnonymousClass0cN f58817N;
    /* renamed from: O */
    private final RectF f58818O;

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass4xH(Context context, AnonymousClass0Ci anonymousClass0Ci, int i) {
        this.f58814K = Math.round(AnonymousClass0Nm.C(context, i));
        this.f58809F = AnonymousClass0Nm.C(context, 4);
        this.f58810G = AnonymousClass0Nm.C(context, 8);
        this.f58806C = AnonymousClass0Ca.C(context, C0164R.color.blue_5);
        this.f58805B = AnonymousClass0Ca.C(context, C0164R.color.red_5);
        this.f58808E = AnonymousClass0TJ.J(context, C0164R.drawable.uploading_igtv, -1);
        this.f58807D = AnonymousClass0TJ.J(context, C0164R.drawable.upload_failure_igtv, -1);
        int round = Math.round(AnonymousClass0Nm.C(context, 1));
        this.f58817N = AnonymousClass0e6.B().C();
        AnonymousClass1JG anonymousClass1JG = new AnonymousClass1JG(this.f58814K, round, -1, 0, 0, 0, true, anonymousClass0Ci.DQ());
        this.f58811H = anonymousClass1JG;
        anonymousClass1JG.setCallback(this);
        this.f58818O = new RectF();
        this.f58815L = new Paint(1);
    }

    /* renamed from: A */
    public final void m25477A(AnonymousClass4xG anonymousClass4xG, boolean z) {
        AnonymousClass4xG anonymousClass4xG2 = this.f58813J;
        if (anonymousClass4xG2 != anonymousClass4xG) {
            float f;
            this.f58816M = anonymousClass4xG2;
            this.f58813J = anonymousClass4xG;
            switch (anonymousClass4xG.ordinal()) {
                case 0:
                case 1:
                    f = 1.0f;
                    break;
                case 2:
                    f = 0.0f;
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("invalid state: ");
                    stringBuilder.append(anonymousClass4xG);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (z) {
                this.f58817N.N((double) f);
            } else {
                this.f58817N.L((double) f);
            }
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int i = bounds.top;
        int i2 = bounds.left;
        float E = AnonymousClass0nB.E((float) this.f58817N.E(), 0.0f, 1.0f, (float) (width - this.f58812I), 0.0f, true);
        canvas.save();
        float f = (float) i;
        canvas.translate((float) i2, f);
        float f2 = (float) width;
        float f3 = (float) height;
        this.f58818O.set(E, 0.0f, f2, f3);
        this.f58815L.setColor(-1);
        this.f58815L.setStyle(Style.FILL);
        f3 /= 2.0f;
        canvas.drawRoundRect(this.f58818O, f3, f3, this.f58815L);
        canvas.restore();
        AnonymousClass4xG anonymousClass4xG = this.f58813J;
        AnonymousClass4xG anonymousClass4xG2 = AnonymousClass4xG.NORMAL;
        if (!(anonymousClass4xG == anonymousClass4xG2 && this.f58816M == anonymousClass4xG2)) {
            int intrinsicWidth;
            canvas.save();
            float f4 = this.f58809F;
            f2 -= f4;
            float f5 = this.f58810G;
            canvas.translate(f2 - f5, f4 + f5);
            Drawable drawable = null;
            if (this.f58813J != AnonymousClass4xG.UPLOADING) {
                if (this.f58813J != AnonymousClass4xG.UPLOAD_FAILED) {
                    if (this.f58816M != AnonymousClass4xG.UPLOADING) {
                        if (this.f58816M != AnonymousClass4xG.UPLOAD_FAILED) {
                            height = -1;
                            if (height != -1) {
                                this.f58815L.setColor(height);
                            }
                            canvas.drawCircle(0.0f, 0.0f, this.f58810G, this.f58815L);
                            if (drawable != null) {
                                intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                                width = drawable.getIntrinsicHeight() / 2;
                                drawable.setBounds(-intrinsicWidth, -width, intrinsicWidth, width);
                                drawable.draw(canvas);
                            }
                            canvas.restore();
                        }
                    }
                }
                height = this.f58805B;
                drawable = this.f58807D;
                if (height != -1) {
                    this.f58815L.setColor(height);
                }
                canvas.drawCircle(0.0f, 0.0f, this.f58810G, this.f58815L);
                if (drawable != null) {
                    intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                    width = drawable.getIntrinsicHeight() / 2;
                    drawable.setBounds(-intrinsicWidth, -width, intrinsicWidth, width);
                    drawable.draw(canvas);
                }
                canvas.restore();
            }
            height = this.f58806C;
            drawable = this.f58808E;
            if (height != -1) {
                this.f58815L.setColor(height);
            }
            canvas.drawCircle(0.0f, 0.0f, this.f58810G, this.f58815L);
            if (drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                width = drawable.getIntrinsicHeight() / 2;
                drawable.setBounds(-intrinsicWidth, -width, intrinsicWidth, width);
                drawable.draw(canvas);
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(E, f);
        this.f58811H.draw(canvas);
        canvas.restore();
        if (!this.f58817N.G()) {
            invalidateSelf();
        }
    }

    public final int getIntrinsicHeight() {
        return this.f58814K;
    }

    public final int getIntrinsicWidth() {
        return this.f58814K * 2;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f58815L.setAlpha(i);
        this.f58811H.setAlpha(i);
        this.f58808E.setAlpha(i);
        this.f58807D.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f58815L.setColorFilter(colorFilter);
        this.f58811H.setColorFilter(colorFilter);
        this.f58808E.setColorFilter(colorFilter);
        this.f58807D.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
