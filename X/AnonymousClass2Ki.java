package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.facebook.C0164R;

/* renamed from: X.2Ki */
public final class AnonymousClass2Ki extends Drawable {
    /* renamed from: B */
    public final float f29069B;
    /* renamed from: C */
    public final int f29070C;
    /* renamed from: D */
    public final Paint f29071D = new Paint(1);
    /* renamed from: E */
    public final int f29072E;
    /* renamed from: F */
    public final RectF f29073F = new RectF(0.0f, 0.0f, 62.0f, 73.0f);
    /* renamed from: G */
    public final Path f29074G = new Path();
    /* renamed from: H */
    public final Matrix f29075H = new Matrix();
    /* renamed from: I */
    public final int f29076I;
    /* renamed from: J */
    public final RectF f29077J;
    /* renamed from: K */
    public final RectF f29078K = new RectF();
    /* renamed from: L */
    public final int f29079L;
    /* renamed from: M */
    private Bitmap f29080M;
    /* renamed from: N */
    private final Shader f29081N;
    /* renamed from: O */
    private final float f29082O;
    /* renamed from: P */
    private final int f29083P;
    /* renamed from: Q */
    private final Paint f29084Q = new Paint(1);
    /* renamed from: R */
    private final Paint f29085R = new Paint(1);

    public final int getOpacity() {
        return -1;
    }

    public final void setColorFilter(int i, Mode mode) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass2Ki(Resources resources) {
        Resources resources2 = resources;
        int dimensionPixelSize = resources2.getDimensionPixelSize(C0164R.dimen.droplet_drawable_width);
        this.f29079L = dimensionPixelSize;
        float width = ((float) dimensionPixelSize) / (this.f29073F.width() / this.f29073F.height());
        int color = resources2.getColor(C0164R.color.white);
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(C0164R.dimen.droplet_drawable_stroke_miter);
        int color2 = resources2.getColor(C0164R.color.black_30_transparent);
        this.f29076I = resources2.getDimensionPixelSize(C0164R.dimen.droplet_drawable_stroke_width);
        this.f29070C = resources2.getDimensionPixelSize(C0164R.dimen.droplet_drawable_circle_shadow_offset);
        this.f29083P = resources2.getDimensionPixelSize(C0164R.dimen.droplet_drawable_path_shadow_offset);
        float f = width / 3.5f;
        int i = this.f29079L;
        float f2 = ((float) i) / 6.0f;
        float f3 = f2 / 2.0f;
        this.f29069B = f3;
        int i2 = this.f29070C;
        this.f29082O = ((float) i2) + f3;
        this.f29072E = (int) (((f + width) + f2) + ((float) i2));
        this.f29081N = new RadialGradient((float) (((i / 2) + this.f29076I) + i2), ((float) this.f29072E) - f3, this.f29082O, color2, 0, TileMode.CLAMP);
        i = this.f29076I;
        this.f29077J = new RectF((float) i, (float) i, (float) (this.f29079L - i), width - ((float) i));
        this.f29071D.setStyle(Style.FILL);
        this.f29085R.setStrokeWidth((float) this.f29076I);
        this.f29085R.setStrokeMiter((float) dimensionPixelSize2);
        this.f29085R.setStyle(Style.STROKE);
        this.f29085R.setColor(color);
        this.f29084Q.setShadowLayer((float) this.f29083P, 0.0f, 0.0f, color2);
        this.f29074G.reset();
        this.f29074G.moveTo(0.0f, 31.02f);
        this.f29074G.cubicTo(-0.18f, 55.51f, 31.0f, 73.0f, 31.0f, 73.0f);
        this.f29074G.cubicTo(31.0f, 73.0f, 62.0f, 55.51f, 62.0f, 31.02f);
        this.f29074G.cubicTo(62.0f, 13.89f, 48.12f, 0.0f, 31.0f, 0.0f);
        this.f29074G.cubicTo(13.88f, 0.0f, 0.13f, 13.89f, 0.0f, 31.02f);
        this.f29074G.close();
        AnonymousClass2MN.m15209B(AnonymousClass2MM.AspectFit, this.f29073F, this.f29077J, this.f29078K);
        this.f29075H.setScale(this.f29078K.width() / this.f29073F.width(), this.f29078K.height() / this.f29073F.height(), 0.0f, 0.0f);
        this.f29074G.transform(this.f29075H);
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        if (this.f29080M == null) {
            this.f29080M = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.f29080M);
            canvas2.save();
            i = this.f29076I;
            i2 = this.f29083P;
            canvas2.translate((float) (i + i2), (float) (i + i2));
            canvas2.drawPath(this.f29074G, this.f29084Q);
            canvas2.restore();
        }
        canvas.drawBitmap(this.f29080M, 0.0f, 0.0f, null);
        canvas.save();
        i = this.f29076I;
        i2 = this.f29083P;
        canvas.translate((float) (i + i2), (float) (i + i2));
        canvas.drawPath(this.f29074G, this.f29071D);
        canvas.drawPath(this.f29074G, this.f29085R);
        canvas.restore();
        canvas.save();
        this.f29071D.setShader(this.f29081N);
        canvas.drawCircle((float) (((this.f29079L / 2) + this.f29076I) + this.f29070C), ((float) this.f29072E) - this.f29069B, this.f29082O, this.f29071D);
        this.f29071D.setShader(null);
        float f = (float) (((this.f29079L / 2) + this.f29076I) + this.f29070C);
        float f2 = (float) this.f29072E;
        float f3 = this.f29069B;
        canvas.drawCircle(f, f2 - f3, f3, this.f29071D);
        f = (float) (((this.f29079L / 2) + this.f29076I) + this.f29070C);
        f2 = (float) this.f29072E;
        f3 = this.f29069B;
        canvas.drawCircle(f, f2 - f3, f3, this.f29085R);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f29072E + (this.f29083P * 2);
    }

    public final int getIntrinsicWidth() {
        return this.f29079L + (this.f29083P * 2);
    }

    public final void setAlpha(int i) {
        this.f29071D.setAlpha(i);
        invalidateSelf();
    }
}
