package X;

import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.0eU */
public final class AnonymousClass0eU extends Drawable {
    /* renamed from: B */
    private boolean f7745B;
    /* renamed from: C */
    private final Paint f7746C = new Paint();
    /* renamed from: D */
    private final int f7747D;

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass0eU(Theme theme, AnonymousClass0eV anonymousClass0eV) {
        int i = anonymousClass0eV.f7755B;
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        this.f7747D = typedValue.data;
    }

    public final void draw(Canvas canvas) {
        if (this.f7745B) {
            this.f7746C.setColor(this.f7747D);
            canvas.drawRect(getBounds(), this.f7746C);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z = this.f7745B;
        this.f7745B = false;
        for (int i : iArr) {
            if (i == 16842919) {
                this.f7745B = true;
                break;
            }
        }
        if (z == this.f7745B) {
            return false;
        }
        invalidateSelf();
        return true;
    }
}
