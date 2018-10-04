package X;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.instagram.ui.widget.drawing.ColourPalette;

/* renamed from: X.2Kf */
public final class AnonymousClass2Kf {
    /* renamed from: B */
    public final RectF f29032B;
    /* renamed from: C */
    public final RectF f29033C;
    /* renamed from: D */
    public final int f29034D;
    /* renamed from: E */
    public final Paint f29035E;
    /* renamed from: F */
    public float f29036F = (this.f29033C.width() / 2.0f);
    /* renamed from: G */
    public final RectF f29037G = new RectF(this.f29033C);
    /* renamed from: H */
    public final Paint f29038H;
    /* renamed from: I */
    public final boolean f29039I;
    /* renamed from: J */
    public final /* synthetic */ ColourPalette f29040J;
    /* renamed from: K */
    private final int f29041K;
    /* renamed from: L */
    private final int f29042L;

    public AnonymousClass2Kf(ColourPalette colourPalette, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int i2, int i3) {
        this.f29040J = colourPalette;
        this.f29039I = z;
        this.f29032B = new RectF(f, f2, f3, f4);
        RectF rectF = new RectF(f5, f6, f7, f8);
        this.f29033C = rectF;
        rectF.inset(colourPalette.f29053D / 2.0f, colourPalette.f29053D / 2.0f);
        Paint paint = new Paint(1);
        this.f29035E = paint;
        paint.setStyle(Style.FILL);
        int i4 = i;
        this.f29035E.setColor(i4);
        this.f29034D = i4;
        this.f29041K = i2;
        this.f29042L = i3;
        RectF rectF2 = this.f29032B;
        Shader composeShader = new ComposeShader(new LinearGradient(0.0f, 0.0f, 0.0f, rectF2.height(), new int[]{ColourPalette.f29048T, ColourPalette.f29049U}, 0.0f, TileMode.CLAMP), new LinearGradient(0.0f, 0.0f, rectF2.width(), 0.0f, new int[]{i2, i4, i3}, 0, TileMode.CLAMP), Mode.OVERLAY);
        f2 = new Paint();
        f2.setShader(composeShader);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF2.width(), (int) rectF2.height(), Config.ARGB_8888);
        new Canvas(createBitmap).drawRect(0.0f, null, rectF2.width(), rectF2.height(), f2);
        Shader bitmapShader = new BitmapShader(createBitmap, TileMode.CLAMP, TileMode.REPEAT);
        Matrix matrix = new Matrix();
        bitmapShader.getLocalMatrix(matrix);
        matrix.setTranslate(this.f29032B.left, 0.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint = new Paint();
        this.f29038H = paint;
        paint.setShader(bitmapShader);
    }

    /* renamed from: A */
    public final int m15099A(float f, float f2) {
        if (this.f29040J.f29056G == AnonymousClass2Kh.SINGLE_COLOUR) {
            return this.f29034D;
        }
        int B;
        if (f < this.f29032B.centerX()) {
            B = AnonymousClass2Km.m15107B((f - this.f29032B.left) / (this.f29032B.width() / 2.0f), this.f29041K, this.f29034D);
        } else {
            B = AnonymousClass2Km.m15107B((this.f29032B.right - f) / (this.f29032B.width() / 2.0f), this.f29042L, this.f29034D);
        }
        int B2 = AnonymousClass2Km.m15107B((f2 - this.f29032B.top) / this.f29032B.height(), ColourPalette.f29048T, ColourPalette.f29049U);
        f2 = Color.red(B);
        f = Color.green(B);
        int blue = Color.blue(B);
        return Color.rgb(AnonymousClass26h.m14464G(Color.red(B2), f2), AnonymousClass26h.m14464G(Color.green(B2), f), AnonymousClass26h.m14464G(Color.blue(B2), blue));
    }

    /* renamed from: B */
    public final boolean m15100B(float f, float f2) {
        return f >= this.f29037G.left && f <= this.f29037G.right && f2 >= this.f29037G.top && f2 <= this.f29037G.bottom;
    }
}
