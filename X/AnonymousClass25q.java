package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: X.25q */
public final class AnonymousClass25q extends Drawable {
    /* renamed from: B */
    private final RectF f25857B;
    /* renamed from: C */
    private final Paint f25858C;
    /* renamed from: D */
    private final float f25859D;
    /* renamed from: E */
    private float f25860E;
    /* renamed from: F */
    private final float f25861F;
    /* renamed from: G */
    private float f25862G;
    /* renamed from: H */
    private float f25863H;
    /* renamed from: I */
    private final float f25864I;
    /* renamed from: J */
    private final Paint f25865J;
    /* renamed from: K */
    private float f25866K;

    public final int getOpacity() {
        return -2;
    }

    public AnonymousClass25q(int i, float f, float f2) {
        this.f25864I = f;
        this.f25861F = f2;
        float f3 = this.f25861F;
        this.f25859D = this.f25864I + f3;
        int[] iArr = new int[]{0, i, 0};
        float f4 = this.f25859D;
        f3 /= f4;
        float[] fArr = new float[]{f3 - 0.02f, f3, 1.0f};
        this.f25857B = new RectF(0.0f, 0.0f, f4 * 2.0f, f4 * 2.0f);
        Paint paint = new Paint(1);
        this.f25858C = paint;
        paint.setStyle(Style.FILL);
        Paint paint2 = this.f25858C;
        f3 = this.f25859D;
        TileMode tileMode = TileMode.CLAMP;
        paint2.setShader(new RadialGradient(f3, f3, f3, iArr, fArr, tileMode));
        paint2 = new Paint(1);
        this.f25865J = paint2;
        paint2.setShader(new LinearGradient(0.0f, this.f25859D, 0.0f, 0.0f, iArr, fArr, tileMode));
    }

    /* renamed from: B */
    private void m14386B(Canvas canvas, float f) {
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, f, this.f25859D, this.f25865J);
        canvas.translate(f - this.f25859D, 0.0f);
        canvas2.drawArc(this.f25857B, -90.0f, 90.0f, true, this.f25858C);
        float f2 = this.f25859D;
        canvas.translate(2.0f * f2, f2);
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f25862G + this.f25859D, this.f25863H);
        m14386B(canvas, this.f25860E);
        canvas.rotate(90.0f);
        m14386B(canvas, this.f25866K);
        canvas.rotate(90.0f);
        m14386B(canvas, this.f25860E);
        canvas.rotate(90.0f);
        m14386B(canvas, this.f25866K);
        canvas.restore();
    }

    public final void onBoundsChange(Rect rect) {
        this.f25862G = (float) rect.left;
        this.f25863H = (float) rect.top;
        this.f25860E = ((float) rect.width()) - (this.f25859D * 2.0f);
        this.f25866K = ((float) rect.height()) - (this.f25859D * 2.0f);
    }

    public final void setAlpha(int i) {
        this.f25858C.setAlpha(i);
        this.f25865J.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25858C.setColorFilter(colorFilter);
        this.f25865J.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
