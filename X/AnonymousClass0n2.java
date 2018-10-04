package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.Random;

/* renamed from: X.0n2 */
public final class AnonymousClass0n2 extends Drawable {
    /* renamed from: K */
    private static File f9979K;
    /* renamed from: L */
    public static final AnonymousClass0IP f9980L;
    /* renamed from: B */
    public Bitmap f9981B;
    /* renamed from: C */
    public Shader f9982C;
    /* renamed from: D */
    public final Paint f9983D;
    /* renamed from: E */
    public boolean f9984E;
    /* renamed from: F */
    public boolean f9985F;
    /* renamed from: G */
    public boolean f9986G;
    /* renamed from: H */
    private final Context f9987H;
    /* renamed from: I */
    private final RectF f9988I = new RectF();
    /* renamed from: J */
    private final Matrix f9989J = new Matrix();

    public final int getOpacity() {
        return -3;
    }

    static {
        AnonymousClass0Kq B = AnonymousClass0Kq.m2860B();
        B.f3132F = "StaticAnimationDrawable";
        f9980L = new AnonymousClass0Mo(B.m2861A());
    }

    public AnonymousClass0n2(Context context) {
        this.f9987H = context;
        Paint paint = new Paint(2);
        this.f9983D = paint;
        paint.setStyle(Style.FILL);
        this.f9983D.setColor(-65536);
    }

    /* renamed from: A */
    public final void m7594A() {
        if (!this.f9986G) {
            this.f9986G = true;
        }
    }

    /* renamed from: B */
    public static File m7591B(Context context) {
        if (f9979K == null) {
            f9979K = new File(context.getExternalFilesDir(null), "StaticAnimationDrawable");
            f9979K.mkdirs();
        }
        return new File(f9979K, "static_tile_1");
    }

    /* renamed from: B */
    public final void m7595B() {
        if (this.f9986G) {
            this.f9986G = false;
            invalidateSelf();
        }
    }

    /* renamed from: C */
    public static void m7592C(Bitmap bitmap, String str, long j) {
        Object[] objArr = new Object[]{str, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Float.valueOf(((float) bitmap.getByteCount()) / 1024.0f), Long.valueOf(j)};
    }

    /* renamed from: D */
    private void m7593D() {
        if (!this.f9985F && !this.f9984E) {
            if (this.f9981B == null) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f9985F = true;
                File B = AnonymousClass0n2.m7591B(this.f9987H);
                if (B.exists()) {
                    AnonymousClass0Gs.f2431j.m1908D(B.toURI().toString()).m4149C(new AnonymousClass0nD(this, currentTimeMillis)).m4148B();
                    return;
                }
                AnonymousClass0GA anonymousClass0n3 = new AnonymousClass0n3(new AnonymousClass0n4(this.f9987H, currentTimeMillis));
                anonymousClass0n3.f9990B = new AnonymousClass0nE(this);
                f9980L.schedule(anonymousClass0n3);
            }
        }
    }

    public final void draw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        Canvas canvas2 = canvas;
        canvas2.drawColor(-16777216);
        if (!this.f9986G) {
            Rect bounds = getBounds();
            canvas = bounds.left;
            int i = bounds.top;
            int i2 = bounds.right;
            int i3 = bounds.bottom;
            int width = bounds.width();
            int height = bounds.height();
            m7593D();
            if (r9.f9982C != null) {
                Bitmap bitmap = r9.f9981B;
                if (bitmap != null) {
                    int round = Math.round(((float) bitmap.getWidth()) / 1.5f);
                    Random random = new Random();
                    float f = (float) (-random.nextInt(round));
                    float f2 = (float) (-random.nextInt(round));
                    int i4 = -round;
                    width += round;
                    height += round;
                    int width2 = r9.f9981B.getWidth();
                    round = r9.f9981B.getHeight();
                    int i5 = 0;
                    int i6 = i4;
                    while (i4 < height) {
                        int i7 = i6;
                        while (i7 < width) {
                            r9.f9989J.setRotate(AnonymousClass0nB.m7622E(random.nextFloat(), 0.0f, 1.0f, 0.0f, 360.0f, true), r9.f9988I.centerX(), r9.f9988I.centerY());
                            r9.f9982C.setLocalMatrix(r9.f9989J);
                            float f3 = ((float) i7) + f;
                            float f4 = ((float) i4) + f2;
                            r9.f9988I.set(Math.max(f3, (float) canvas), Math.max(f4, (float) i), Math.min(((float) width2) + f3, (float) i2), Math.min(((float) round) + f4, (float) i3));
                            canvas2.save();
                            if (random.nextBoolean()) {
                                canvas2.scale(-1.0f, -1.0f, r9.f9988I.centerX(), r9.f9988I.centerY());
                            }
                            canvas2.restore();
                            canvas2.drawRect(r9.f9988I, r9.f9983D);
                            i7 += r9.f9981B.getWidth();
                            i5++;
                        }
                        i4 += r9.f9981B.getHeight();
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Long.valueOf(currentTimeMillis2);
                    Long.valueOf(currentTimeMillis2 - currentTimeMillis);
                    Integer.valueOf(i5);
                    if (!r9.f9986G) {
                        invalidateSelf();
                    }
                }
            }
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        this.f9983D.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9983D.setColorFilter(colorFilter);
    }
}
