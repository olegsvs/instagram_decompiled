package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: X.2GF */
public final class AnonymousClass2GF extends Drawable implements AnonymousClass0RL, Callback {
    /* renamed from: B */
    public Drawable f28237B;
    /* renamed from: C */
    public final Paint f28238C = new Paint(1);
    /* renamed from: D */
    public float f28239D;

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

    /* renamed from: A */
    public final void m14881A(String str) {
        this.f28237B = null;
        invalidateSelf();
        AnonymousClass0Gs.f2431j.D(str).C(this).B();
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        Drawable anonymousClass16n = new AnonymousClass16n(bitmap);
        this.f28237B = anonymousClass16n;
        anonymousClass16n.setCallback(this);
        this.f28237B.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        if (this.f28239D > 0.0f) {
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), ((float) min) / 2.0f, this.f28238C);
        }
        Drawable drawable = this.f28237B;
        if (drawable != null) {
            float f = ((float) min) - (this.f28239D * 2.0f);
            float max = Math.max(f / ((float) drawable.getIntrinsicWidth()), f / ((float) this.f28237B.getIntrinsicHeight()));
            canvas.save();
            canvas.translate(((float) bounds.left) + this.f28239D, ((float) bounds.top) + this.f28239D);
            canvas.scale(max, max);
            this.f28237B.draw(canvas);
            canvas.restore();
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
