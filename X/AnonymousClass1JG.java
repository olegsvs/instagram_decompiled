package X;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

/* renamed from: X.1JG */
public final class AnonymousClass1JG extends Drawable implements AnonymousClass0RL {
    /* renamed from: B */
    public boolean f16976B;
    /* renamed from: C */
    private final Paint f16977C;
    /* renamed from: D */
    private final Paint f16978D;
    /* renamed from: E */
    private final Paint f16979E;
    /* renamed from: F */
    private final boolean f16980F;
    /* renamed from: G */
    private final Matrix f16981G;
    /* renamed from: H */
    private final Runnable f16982H;
    /* renamed from: I */
    private final Paint f16983I;
    /* renamed from: J */
    private final boolean f16984J;
    /* renamed from: K */
    private final Paint f16985K;
    /* renamed from: L */
    private final int f16986L;
    /* renamed from: M */
    private final boolean f16987M;
    /* renamed from: N */
    private final int f16988N;
    /* renamed from: O */
    private final Paint f16989O;
    /* renamed from: P */
    private final int f16990P;

    public final void Ao(AnonymousClass0aa anonymousClass0aa) {
    }

    public final void Bo(AnonymousClass0aa anonymousClass0aa, int i) {
    }

    public final int getOpacity() {
        return -1;
    }

    public AnonymousClass1JG(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f16981G = new Matrix();
        this.f16983I = new Paint(3);
        this.f16977C = new Paint(1);
        this.f16978D = new Paint(3);
        this.f16989O = new Paint(1);
        this.f16985K = new Paint(1);
        this.f16979E = new Paint(1);
        this.f16982H = new AnonymousClass1JH(this);
        this.f16984J = z;
        this.f16990P = i2;
        this.f16986L = i4;
        this.f16988N = i;
        Paint paint = this.f16983I;
        Style style = Style.FILL;
        paint.setStyle(style);
        this.f16989O.setStyle(style);
        this.f16989O.setStrokeWidth((float) i2);
        this.f16989O.setColor(i3);
        paint = this.f16985K;
        Style style2 = Style.FILL;
        paint.setStyle(style2);
        this.f16985K.setStrokeWidth((float) i4);
        this.f16985K.setColor(i5);
        boolean z2 = false;
        this.f16980F = i6 != 0;
        this.f16977C.setStyle(style2);
        this.f16977C.setColor(i6);
        this.f16979E.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f16979E.setStyle(style2);
        if (i3 == 0 && i2 > 0) {
            z2 = true;
        }
        this.f16987M = z2;
        if (str != null) {
            AnonymousClass0Gs.f2431j.m1908D(str).m4149C(this).m4148B();
        }
    }

    public AnonymousClass1JG(int i, int i2, int i3, int i4, String str) {
        this(i, i2, i3, 0, 0, i4, false, str);
    }

    /* renamed from: A */
    public final void m10686A(Bitmap bitmap) {
        if (this.f16984J) {
            AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass1Ln(this, bitmap), -1502134140);
        } else {
            AnonymousClass1JG.m10685B(this, bitmap);
        }
    }

    /* renamed from: B */
    public static void m10685B(AnonymousClass1JG anonymousClass1JG, Bitmap bitmap) {
        int i = anonymousClass1JG.f16988N - ((anonymousClass1JG.f16990P + anonymousClass1JG.f16986L) * 2);
        AnonymousClass0TJ.m4486B(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, i, i), anonymousClass1JG.f16981G);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, anonymousClass1JG.f16981G, anonymousClass1JG.f16978D);
        TileMode tileMode = TileMode.CLAMP;
        anonymousClass1JG.f16983I.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        AnonymousClass0Sy.m4437F(anonymousClass1JG.f16982H);
    }

    public final void Se(AnonymousClass0aa anonymousClass0aa, Bitmap bitmap) {
        m10686A(bitmap);
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        canvas.translate((float) bounds.left, (float) bounds.top);
        int i = this.f16988N / 2;
        if (this.f16987M) {
            float f = (float) i;
            canvas.drawCircle(f, f, f, this.f16979E);
        }
        if (this.f16986L > 0 && (this.f16980F || this.f16976B)) {
            f = (float) i;
            canvas.drawCircle(f, f, f, this.f16985K);
        }
        if (this.f16990P > 0 && (this.f16980F || this.f16976B)) {
            float f2 = (float) i;
            canvas.drawCircle(f2, f2, (float) (i - this.f16986L), this.f16989O);
        }
        int i2 = (this.f16988N - ((this.f16990P + this.f16986L) * 2)) / 2;
        canvas.save();
        i = this.f16990P;
        int i3 = this.f16986L;
        canvas.translate((float) (i + i3), (float) (i + i3));
        if (this.f16980F) {
            f = (float) i2;
            canvas.drawCircle(f, f, f, this.f16977C);
        }
        if (this.f16976B) {
            f = (float) i2;
            canvas.drawCircle(f, f, f, this.f16983I);
        }
        canvas.restoreToCount(save);
    }

    public final int getIntrinsicHeight() {
        return this.f16988N;
    }

    public final int getIntrinsicWidth() {
        return this.f16988N;
    }

    public final void setAlpha(int i) {
        this.f16983I.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16983I.setColorFilter(colorFilter);
    }
}
