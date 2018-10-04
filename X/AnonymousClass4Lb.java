package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import com.facebook.C0164R;

/* renamed from: X.4Lb */
public final class AnonymousClass4Lb extends Drawable implements Callback {
    /* renamed from: B */
    public final AnonymousClass27t f53078B;
    /* renamed from: C */
    public final AnonymousClass27v f53079C;
    /* renamed from: D */
    private final Drawable f53080D;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass4Lb(Context context, Drawable drawable, AnonymousClass0Cm anonymousClass0Cm) {
        Resources resources = context.getResources();
        this.f53080D = drawable;
        this.f53078B = new AnonymousClass27t(resources, this, new AnonymousClass27r(resources.getString(C0164R.string.sticker_tap_for_more), AnonymousClass27q.BELOW_DRAWABLE, new AnonymousClass4La(this, anonymousClass0Cm)));
        this.f53079C = new AnonymousClass27v(context, this);
        this.f53079C.setCallback(this);
        AnonymousClass27v anonymousClass27v = this.f53079C;
        anonymousClass27v.f26444B = AnonymousClass27u.BELOW;
        anonymousClass27v.invalidateSelf();
        this.f53079C.m14524B(C0164R.string.sticker_tap_for_more);
    }

    /* renamed from: A */
    public final void m23958A(boolean z) {
        this.f53078B.m14521D(z);
        this.f53079C.m14523A();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f53078B.m14519B(canvas);
        this.f53080D.draw(canvas);
        if (!this.f53078B.f26428B) {
            this.f53079C.draw(canvas);
        }
        this.f53078B.m14520C(canvas);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        this.f53080D.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
