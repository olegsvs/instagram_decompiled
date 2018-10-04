package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.26K */
public final class AnonymousClass26K extends Drawable {
    /* renamed from: B */
    private final Paint f26005B;
    /* renamed from: C */
    private final RectF f26006C = new RectF();
    /* renamed from: D */
    private final float f26007D;
    /* renamed from: E */
    private final int f26008E;
    /* renamed from: F */
    private Path f26009F;

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass26K(int i, int i2, float f, int i3) {
        this.f26007D = f;
        this.f26008E = i3;
        Paint paint = new Paint(1);
        this.f26005B = paint;
        paint.setColor(i2);
        this.f26005B.setStyle(Style.STROKE);
        this.f26005B.setStrokeWidth((float) i);
    }

    public final void draw(Canvas canvas) {
        if (AnonymousClass26L.ALL.m14432B(this.f26008E)) {
            RectF rectF = this.f26006C;
            float f = this.f26007D;
            canvas.drawRoundRect(rectF, f, f, this.f26005B);
            return;
        }
        if (this.f26009F == null) {
            this.f26009F = AnonymousClass26M.m14433B(this.f26007D, this.f26008E, this.f26006C.width(), this.f26006C.height());
        }
        canvas.drawPath(this.f26009F, this.f26005B);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f26006C.set(rect);
        this.f26009F = null;
    }

    public final void setAlpha(int i) {
        if (this.f26005B.getAlpha() != i) {
            this.f26005B.setAlpha(i);
            invalidateSelf();
        }
    }
}
