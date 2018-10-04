package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* renamed from: X.3D4 */
public abstract class AnonymousClass3D4 extends Drawable {
    /* renamed from: B */
    public final Drawable f39146B;

    /* renamed from: A */
    public abstract void mo4789A(int i);

    public AnonymousClass3D4(Drawable drawable) {
        this.f39146B = drawable;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f39146B;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final int getOpacity() {
        Drawable drawable = this.f39146B;
        return drawable != null ? drawable.getOpacity() : 0;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f39146B;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Gravity.apply(17, bounds.width(), bounds.height(), rect, bounds);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f39146B;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f39146B;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
