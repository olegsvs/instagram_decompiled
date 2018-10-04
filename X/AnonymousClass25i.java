package X;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.25i */
public final class AnonymousClass25i extends Drawable {
    /* renamed from: B */
    public ColorStateList f25792B;
    /* renamed from: C */
    public float f25793C;
    /* renamed from: D */
    public int f25794D;
    /* renamed from: E */
    public final Paint f25795E;
    /* renamed from: F */
    private final RectF f25796F;
    /* renamed from: G */
    private final Paint f25797G;
    /* renamed from: H */
    private Bitmap f25798H;
    /* renamed from: I */
    private int f25799I;
    /* renamed from: J */
    private String f25800J;
    /* renamed from: K */
    private final String f25801K;
    /* renamed from: L */
    private String f25802L;
    /* renamed from: M */
    private boolean f25803M;
    /* renamed from: N */
    private final int f25804N;
    /* renamed from: O */
    private final Rect f25805O;

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

    public AnonymousClass25i(int i, ColorStateList colorStateList, int i2, float f, float f2) {
        this(i, colorStateList, i2, f, f2, 0, 0, null);
    }

    public AnonymousClass25i(int i, ColorStateList colorStateList, int i2, float f, float f2, int i3, int i4, String str) {
        Paint paint = new Paint();
        this.f25797G = paint;
        paint.setStyle(Style.FILL);
        this.f25797G.setAntiAlias(true);
        this.f25801K = str;
        this.f25804N = i4;
        Paint paint2 = new Paint();
        this.f25795E = paint2;
        paint2.setFilterBitmap(true);
        this.f25795E.setAntiAlias(true);
        if (i3 == 0) {
            this.f25795E.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        } else {
            this.f25795E.setColor(i3);
        }
        this.f25795E.setTypeface(AnonymousClass0nA.E());
        this.f25795E.setTextAlign(Align.CENTER);
        this.f25805O = new Rect();
        this.f25796F = new RectF();
        m14376A(i);
        this.f25793C = f;
        AnonymousClass25i.m14375B(this);
        this.f25792B = colorStateList;
        AnonymousClass25i.m14375B(this);
        this.f25794D = i2;
        AnonymousClass25i.m14375B(this);
        this.f25795E.setTextSize(f2);
        AnonymousClass25i.m14375B(this);
    }

    /* renamed from: A */
    public final void m14376A(int i) {
        this.f25799I = i;
        this.f25802L = i < 100 ? String.valueOf(i) : "99+";
        if (this.f25801K != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f25801K);
            stringBuilder.append(this.f25802L);
            this.f25802L = stringBuilder.toString();
        }
        int i2 = this.f25799I;
        if (i2 < 10) {
            this.f25800J = "8";
        } else if (i2 < 100) {
            this.f25800J = "88";
        } else {
            this.f25800J = "888";
        }
        AnonymousClass25i.m14375B(this);
    }

    /* renamed from: B */
    public static void m14375B(AnonymousClass25i anonymousClass25i) {
        anonymousClass25i.f25803M = true;
        Paint paint = anonymousClass25i.f25795E;
        String str = anonymousClass25i.f25800J;
        paint.getTextBounds(str, 0, str.length(), anonymousClass25i.f25805O);
        Rect rect = anonymousClass25i.f25805O;
        int i = anonymousClass25i.f25794D;
        rect.offsetTo(i, i);
        anonymousClass25i.setBounds(0, 0, anonymousClass25i.f25805O.width() + (anonymousClass25i.f25794D * 2), anonymousClass25i.f25805O.height() + (anonymousClass25i.f25794D * 2));
    }

    public final void draw(Canvas canvas) {
        if (this.f25803M) {
            Bitmap bitmap = this.f25798H;
            if (bitmap == null) {
                this.f25798H = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Config.ARGB_8888);
            } else {
                if (bitmap.getWidth() == getBounds().width()) {
                    if (this.f25798H.getHeight() == getBounds().height()) {
                        this.f25798H.eraseColor(0);
                    }
                }
                this.f25798H.recycle();
                this.f25798H = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Config.ARGB_8888);
            }
            Canvas canvas2 = new Canvas(this.f25798H);
            this.f25796F.set(getBounds());
            RectF rectF = this.f25796F;
            int i = this.f25804N;
            rectF.inset((float) i, (float) i);
            this.f25797G.setColor(this.f25792B.getColorForState(getState(), 0));
            rectF = this.f25796F;
            float f = this.f25793C;
            canvas2.drawRoundRect(rectF, f, f, this.f25797G);
            canvas2.drawText(this.f25802L, (float) getBounds().centerX(), ((float) getBounds().centerY()) + (((float) this.f25805O.height()) / 2.0f), this.f25795E);
        }
        canvas.drawBitmap(this.f25798H, 0.0f, 0.0f, null);
    }

    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    public final int getIntrinsicWidth() {
        return getBounds().width();
    }
}
