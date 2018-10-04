package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.text.Layout.Alignment;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.C0164R;

/* renamed from: X.27v */
public final class AnonymousClass27v extends Drawable implements Callback {
    /* renamed from: G */
    private static final Interpolator f26443G = new AccelerateInterpolator();
    /* renamed from: B */
    public AnonymousClass27u f26444B = AnonymousClass27u.BELOW;
    /* renamed from: C */
    public final Resources f26445C;
    /* renamed from: D */
    public long f26446D;
    /* renamed from: E */
    public final AnonymousClass2bu f26447E;
    /* renamed from: F */
    private final Drawable f26448F;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public AnonymousClass27v(Context context, Drawable drawable) {
        Resources resources = context.getResources();
        this.f26445C = resources;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0164R.dimen.asset_picker_rotatable_sticker_tap_affordance_prominent_spacing);
        int dimensionPixelSize = this.f26445C.getDimensionPixelSize(C0164R.dimen.font_medium_large_not_scaled);
        this.f26448F = drawable;
        this.f26447E = new AnonymousClass2bu(context, AnonymousClass0Nm.J(context));
        this.f26447E.setCallback(this);
        this.f26447E.m16447E(Alignment.ALIGN_CENTER);
        this.f26447E.m16449G(0.0f, (float) dimensionPixelOffset);
        this.f26447E.m16452J(-1);
        this.f26447E.m16453K((float) dimensionPixelSize);
        this.f26447E.m16455M(AnonymousClass0nA.E());
    }

    /* renamed from: A */
    public final void m14523A() {
        this.f26446D = 0;
        invalidateSelf();
    }

    /* renamed from: B */
    public final void m14524B(int i) {
        this.f26447E.m16451I(this.f26445C.getString(i));
        invalidateSelf();
    }

    /* renamed from: B */
    private void m14522B(Canvas canvas, float f) {
        Rect bounds = this.f26448F.getBounds();
        this.f26447E.setAlpha(Math.round(f * 255.0f));
        if (this.f26444B == AnonymousClass27u.ABOVE) {
            this.f26447E.setBounds(bounds.centerX() - (this.f26447E.getIntrinsicWidth() / 2), bounds.top - this.f26447E.getIntrinsicHeight(), bounds.centerX() + (this.f26447E.getIntrinsicWidth() / 2), bounds.top);
        } else {
            this.f26447E.setBounds(bounds.centerX() - (this.f26447E.getIntrinsicWidth() / 2), bounds.bottom, bounds.centerX() + (this.f26447E.getIntrinsicWidth() / 2), bounds.bottom + this.f26447E.getIntrinsicHeight());
        }
        this.f26447E.draw(canvas);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f26446D;
        if (currentTimeMillis < 2000 + j) {
            m14522B(canvas, 1.0f);
        } else if (currentTimeMillis < 2500 + j) {
            m14522B(canvas, f26443G.getInterpolation(AnonymousClass0nB.D((float) (currentTimeMillis - j), 2000.0f, 2500.0f, 1.0f, 0.0f)));
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26447E.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
