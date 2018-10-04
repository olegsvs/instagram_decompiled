package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.268 */
public final class AnonymousClass268 extends Drawable {
    /* renamed from: B */
    private final RectF f25936B = new RectF();
    /* renamed from: C */
    private Integer f25937C;
    /* renamed from: D */
    private final Paint f25938D;
    /* renamed from: E */
    private Integer f25939E;

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass268(int i, int i2, int i3, int i4) {
        this.f25939E = Integer.valueOf(i);
        this.f25937C = Integer.valueOf(i2);
        Paint paint = new Paint(1);
        this.f25938D = paint;
        paint.setColor(i3);
        this.f25938D.setStyle(Style.FILL_AND_STROKE);
        this.f25938D.setStrokeWidth((float) i4);
    }

    public final void draw(Canvas canvas) {
        canvas.drawOval(this.f25936B, this.f25938D);
    }

    public final int getIntrinsicHeight() {
        return this.f25937C.intValue();
    }

    public final int getIntrinsicWidth() {
        return this.f25939E.intValue();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f25936B.set(rect);
    }

    public final void setAlpha(int i) {
        if (this.f25938D.getAlpha() != i) {
            this.f25938D.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25938D.setColorFilter(colorFilter);
    }
}
