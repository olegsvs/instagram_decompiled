package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: X.64F */
public final class AnonymousClass64F extends Drawable {
    /* renamed from: B */
    private LinearGradient f71424B;
    /* renamed from: C */
    private final Paint f71425C = new Paint(1);

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        this.f71425C.setShader(this.f71424B);
        canvas.drawPaint(this.f71425C);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f71424B = new LinearGradient(0.0f, 0.0f, 0.0f, (float) rect.height(), new int[]{Color.argb(0, 0, 0, 0), Color.argb(0, 0, 0, 0), Color.argb(127, 0, 0, 0)}, new float[]{0.0f, 0.6f, 1.0f}, TileMode.CLAMP);
    }
}
