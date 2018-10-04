package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: X.16n */
public final class AnonymousClass16n extends Drawable {
    /* renamed from: B */
    public final Paint f14600B;
    /* renamed from: C */
    public final RectF f14601C = new RectF();
    /* renamed from: D */
    private final Bitmap f14602D;

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass16n(Bitmap bitmap) {
        this.f14602D = bitmap;
        Paint paint = new Paint(7);
        this.f14600B = paint;
        TileMode tileMode = TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
    }

    public final void draw(Canvas canvas) {
        this.f14601C.set(getBounds());
        RectF rectF;
        if (this.f14601C.height() > this.f14601C.width()) {
            rectF = this.f14601C;
            rectF.inset(0.0f, (rectF.height() - this.f14601C.width()) / 2.0f);
        } else if (this.f14601C.height() < this.f14601C.width()) {
            rectF = this.f14601C;
            rectF.inset((rectF.width() - this.f14601C.height()) / 2.0f, 0.0f);
        }
        canvas.drawOval(this.f14601C, this.f14600B);
    }

    public final int getIntrinsicHeight() {
        return this.f14602D.getHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f14602D.getWidth();
    }

    public final void setAlpha(int i) {
        this.f14600B.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14600B.setColorFilter(colorFilter);
    }
}
