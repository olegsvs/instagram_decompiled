package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.SystemClock;
import com.facebook.C0164R;
import com.facebook.common.dextricks.StartupQEsConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5AM */
public final class AnonymousClass5AM extends Drawable implements AnonymousClass0RL, Callback {
    /* renamed from: B */
    public boolean f60774B;
    /* renamed from: C */
    public AnonymousClass5Zt f60775C;
    /* renamed from: D */
    public long f60776D;
    /* renamed from: E */
    public final List f60777E = new ArrayList();
    /* renamed from: F */
    public final int f60778F;
    /* renamed from: G */
    public final int f60779G;
    /* renamed from: H */
    private final int f60780H;
    /* renamed from: I */
    private long f60781I;
    /* renamed from: J */
    private boolean f60782J;
    /* renamed from: K */
    private final float f60783K;

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
    }

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass5AM(Context context, int i) {
        this.f60779G = i;
        Resources resources = context.getResources();
        this.f60783K = ((float) resources.getDimensionPixelSize(C0164R.dimen.story_feedback_balloon_size)) / 2.0f;
        this.f60778F = resources.getDimensionPixelSize(C0164R.dimen.row_text_padding);
        this.f60780H = resources.getDimensionPixelSize(C0164R.dimen.story_feedback_balloon_oscillation_width);
    }

    /* renamed from: B */
    public static int m25902B(float f) {
        if (f < 0.3f) {
            return (int) AnonymousClass0dh.C((double) f, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 0.30000001192092896d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 255.0d);
        }
        if (f < 0.6f) {
            return 255;
        }
        return f < 0.9f ? (int) AnonymousClass0dh.C((double) f, 0.6000000238418579d, 0.8999999761581421d, 255.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED) : 0;
    }

    /* renamed from: C */
    public static float m25903C(float f) {
        if (f <= 0.4f || f >= 0.5f) {
            return 0.0f;
        }
        if (f < 0.45f) {
            return (float) AnonymousClass0dh.C((double) f, 0.4000000059604645d, 0.44999998807907104d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d);
        }
        return (float) AnonymousClass0dh.C((double) f, 0.44999998807907104d, 0.5d, 1.0d, StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        Drawable drawable = (Drawable) anonymousClass0aa.f6576M;
        Bitmap bitmap2 = bitmap;
        drawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f60781I = this.f60777E.isEmpty() ? SystemClock.elapsedRealtime() : this.f60781I + 300;
        this.f60777E.add(new AnonymousClass5AL(bitmap2, drawable, this.f60781I, this.f60780H));
        if (!this.f60774B) {
            this.f60774B = true;
            invalidateSelf();
            this.f60776D = SystemClock.elapsedRealtime();
        }
    }

    public final void draw(Canvas canvas) {
        if (this.f60774B) {
            Object obj = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Canvas canvas2 = canvas;
            int height = canvas2.getHeight();
            AnonymousClass5Zt anonymousClass5Zt = r8.f60775C;
            if (!(anonymousClass5Zt == null || r8.f60782J || elapsedRealtime - r8.f60776D <= 150)) {
                if (anonymousClass5Zt.f66415D) {
                    anonymousClass5Zt.f66413B.f60624D.C(anonymousClass5Zt.f66414C);
                }
                r8.f60782J = true;
            }
            for (AnonymousClass5AL anonymousClass5AL : r8.f60777E) {
                long j = elapsedRealtime - anonymousClass5AL.f60771F;
                if (j > 0 && j < 1500) {
                    float f = ((float) j) / 1500.0f;
                    float f2 = (float) height;
                    float f3 = ((f2 - (r8.f60783K * 2.0f)) - ((f * f2) * 0.5f)) - ((float) r8.f60778F);
                    float f4 = (((float) r8.f60778F) + (((float) r8.f60779G) / 2.0f)) + ((float) anonymousClass5AL.f60769D);
                    double d = (double) f;
                    double d2 = (double) (anonymousClass5AL.f60772G * 3);
                    Double.isNaN(d2);
                    f4 += (float) AnonymousClass0dh.C((double) ((float) ((Math.sin((d2 * 3.141592653589793d) * d) + 1.0d) / 2.0d)), StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED, 1.0d, (double) (-anonymousClass5AL.f60768C), (double) anonymousClass5AL.f60768C);
                    float f5 = r8.f60783K;
                    canvas2.save();
                    canvas2.translate(f4, f3);
                    Drawable drawable = f < 0.45f ? anonymousClass5AL.f60767B : anonymousClass5AL.f60770E;
                    float intrinsicWidth = (2.0f * f5) / ((float) drawable.getIntrinsicWidth());
                    float C = 1.0f - AnonymousClass5AM.m25903C(f);
                    canvas2.translate(-(f5 * C), -f5);
                    canvas2.scale(C * intrinsicWidth, intrinsicWidth);
                    drawable.mutate().setAlpha(AnonymousClass5AM.m25902B(f));
                    drawable.draw(canvas2);
                    canvas2.restore();
                    obj = 1;
                }
            }
            if (obj != null) {
                invalidateSelf();
                return;
            }
            AnonymousClass5Zt anonymousClass5Zt2 = r8.f60775C;
            if (!(anonymousClass5Zt2 == null || anonymousClass5Zt2.f66413B.f60623C == null)) {
                anonymousClass5Zt2.f66413B.f60623C.setVisibility(8);
            }
            r8.f60774B = false;
            r8.f60777E.clear();
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
