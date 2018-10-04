package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.facebook.C0164R;
import com.instagram.model.shopping.Product;
import java.util.Locale;

/* renamed from: X.165 */
public final class AnonymousClass165 extends AnonymousClass166 {
    /* renamed from: B */
    public final float f14453B;
    /* renamed from: C */
    private int f14454C;
    /* renamed from: D */
    private final RectF f14455D;
    /* renamed from: E */
    private int f14456E;
    /* renamed from: F */
    private float f14457F;
    /* renamed from: G */
    private final Bitmap f14458G;
    /* renamed from: H */
    private final int f14459H;
    /* renamed from: I */
    private LinearGradient f14460I;
    /* renamed from: J */
    private int f14461J;
    /* renamed from: K */
    private Bitmap f14462K;
    /* renamed from: L */
    private Bitmap f14463L;
    /* renamed from: M */
    private Canvas f14464M;
    /* renamed from: N */
    private final boolean f14465N;
    /* renamed from: O */
    private final boolean f14466O;
    /* renamed from: P */
    private final Locale f14467P;
    /* renamed from: Q */
    private final int f14468Q;
    /* renamed from: R */
    private final int f14469R;
    /* renamed from: S */
    private int f14470S;
    /* renamed from: T */
    private final Paint f14471T;
    /* renamed from: U */
    private Product f14472U;
    /* renamed from: V */
    private final int f14473V;
    /* renamed from: W */
    private final Rect f14474W;
    /* renamed from: X */
    private final Resources f14475X;
    /* renamed from: Y */
    private final PorterDuffXfermode f14476Y;
    /* renamed from: Z */
    private final int f14477Z;
    /* renamed from: a */
    private String f14478a;
    /* renamed from: b */
    private int f14479b;
    /* renamed from: c */
    private String f14480c;
    /* renamed from: d */
    private int f14481d;

    public AnonymousClass165(Context context, boolean z) {
        this(context.getResources(), AnonymousClass0Nm.m3431J(context), context.getResources().getDimensionPixelSize(C0164R.dimen.product_sticker_text_size), z);
    }

    public AnonymousClass165(Resources resources, int i, int i2, boolean z) {
        this(resources, i, i2, z, false);
    }

    public AnonymousClass165(Resources resources, int i, int i2, boolean z, boolean z2) {
        this.f14476Y = new PorterDuffXfermode(Mode.SRC_ATOP);
        this.f14471T = new Paint(1);
        this.f14474W = new Rect();
        this.f14455D = new RectF();
        this.f14481d = -1;
        this.f14461J = -1;
        this.f14454C = 255;
        this.f14456E = -1;
        this.f14457F = 0.0f;
        this.f14475X = resources;
        this.f14466O = z;
        this.f14482B = z ? "product_item_text_sticker_vibrant" : "product_item_text_sticker_subtle";
        this.f14453B = (float) i2;
        this.f14471T.setTextSize(this.f14453B);
        this.f14471T.setTypeface(AnonymousClass0nA.m7616C(resources));
        this.f14467P = resources.getConfiguration().locale;
        this.f14468Q = i;
        this.f14469R = resources.getDimensionPixelSize(C0164R.dimen.product_sticker_padding);
        this.f14459H = resources.getDimensionPixelSize(C0164R.dimen.product_sticker_editor_icon_padding);
        this.f14473V = resources.getDimensionPixelSize(C0164R.dimen.contextual_sticker_corner_radius);
        this.f14477Z = resources.getColor(C0164R.color.sticker_subtle_light_background);
        this.f14458G = BitmapFactory.decodeResource(resources, C0164R.drawable.stories_shopping_icon, null);
        this.f14465N = z2;
        m9362C(1.0f);
        this.f14478a = resources.getString(C0164R.string.product_sticker_default_text);
        m9363D();
    }

    /* renamed from: A */
    public final int mo2136A() {
        return this.f14456E;
    }

    /* renamed from: B */
    private int m9361B(float f) {
        return (this.f14469R * 2) + ((int) (((float) (this.f14462K.getWidth() + this.f14459H)) * (f / this.f14453B)));
    }

    /* renamed from: B */
    public final Product mo2137B() {
        return this.f14472U;
    }

    /* renamed from: C */
    public final String mo2138C() {
        return this.f14478a;
    }

    /* renamed from: C */
    private void m9362C(float f) {
        if (this.f14462K == null || Float.compare(f, this.f14457F) != 0) {
            Bitmap createScaledBitmap;
            this.f14457F = f;
            if (this.f14465N) {
                f *= 0.8f;
            }
            if (Float.compare(f, 1.0f) != 0) {
                Bitmap bitmap = this.f14458G;
                createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * f), (int) (((float) this.f14458G.getHeight()) * f), false);
            } else {
                createScaledBitmap = this.f14458G;
            }
            this.f14462K = createScaledBitmap;
            this.f14463L = Bitmap.createBitmap(createScaledBitmap.getWidth(), this.f14462K.getHeight(), Config.ARGB_8888);
            this.f14464M = new Canvas(this.f14463L);
            this.f14470S = (int) (((float) this.f14459H) * f);
        }
    }

    /* renamed from: D */
    private void m9363D() {
        this.f14480c = this.f14478a;
        this.f14471T.setTextSize(this.f14453B);
        Paint paint = this.f14471T;
        String str = this.f14480c;
        paint.getTextBounds(str, 0, str.length(), this.f14474W);
        if (this.f14474W.width() + m9361B(this.f14453B) > this.f14468Q) {
            Object obj;
            float f = this.f14453B * 0.9f;
            while (Float.compare(f, this.f14453B * 0.5f) >= 0) {
                this.f14471T.setTextSize(f);
                paint = this.f14471T;
                str = this.f14480c;
                paint.getTextBounds(str, 0, str.length(), this.f14474W);
                if (this.f14474W.width() + m9361B(f) <= this.f14468Q) {
                    obj = 1;
                    break;
                }
                f -= this.f14453B * 0.1f;
            }
            obj = null;
            if (obj == null) {
                TextPaint textPaint = new TextPaint(this.f14471T);
                textPaint.density = this.f14475X.getDisplayMetrics().density;
                this.f14480c = TextUtils.ellipsize(this.f14478a, textPaint, (float) (this.f14468Q - m9361B(textPaint.getTextSize())), TruncateAt.END).toString();
                paint = this.f14471T;
                str = this.f14480c;
                paint.getTextBounds(str, 0, str.length(), this.f14474W);
            }
        }
        this.f14481d = Math.min(this.f14468Q, this.f14474W.width() + m9361B(this.f14471T.getTextSize()));
        this.f14479b = Math.min(Math.abs(this.f14474W.top), (int) Math.abs(this.f14471T.getFontMetrics().ascent));
        this.f14461J = this.f14474W.height() + (this.f14469R * 2);
        m9362C(this.f14471T.getTextSize() / this.f14453B);
    }

    /* renamed from: D */
    public final void mo2139D(Product product, String str, int i) {
        this.f14472U = product;
        if (str == null) {
            str = product.f4988J.toUpperCase(this.f14467P);
        }
        this.f14478a = str;
        this.f14456E = i;
        m9363D();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (this.f14466O) {
            this.f14471T.setColor(-1);
            this.f14471T.setAlpha(this.f14454C);
        } else {
            this.f14471T.setColor(this.f14477Z);
        }
        this.f14455D.set((float) getBounds().centerX(), (float) getBounds().centerY(), (float) getBounds().centerX(), (float) getBounds().centerY());
        this.f14455D.inset((float) ((-this.f14481d) / 2), (float) ((-this.f14461J) / 2));
        RectF rectF = this.f14455D;
        int i = this.f14473V;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f14471T);
        if (this.f14466O) {
            int i2 = this.f14456E;
            if (i2 == -1) {
                this.f14471T.setShader(this.f14460I);
            } else {
                this.f14471T.setColor(i2);
            }
        } else {
            this.f14471T.setColor(-1);
        }
        this.f14471T.setAlpha(this.f14454C);
        canvas.drawText(this.f14480c, (float) (((getBounds().left + this.f14462K.getWidth()) + this.f14469R) + this.f14470S), (float) (getBounds().centerY() + (this.f14479b / 2)), this.f14471T);
        this.f14463L.eraseColor(0);
        this.f14464M.drawBitmap(this.f14462K, 0.0f, 0.0f, null);
        this.f14471T.setXfermode(this.f14476Y);
        this.f14464M.save();
        float f = this.f14455D.left + ((float) this.f14469R);
        this.f14464M.translate(-f, 0.0f);
        this.f14464M.drawPaint(this.f14471T);
        this.f14464M.restore();
        this.f14471T.setXfermode(null);
        this.f14471T.setShader(null);
        this.f14471T.setAlpha(this.f14454C);
        canvas.drawBitmap(this.f14463L, f, (float) (getBounds().centerY() - (this.f14462K.getHeight() / 2)), this.f14471T);
    }

    public final int getAlpha() {
        return this.f14454C;
    }

    public final int getIntrinsicHeight() {
        return this.f14461J;
    }

    public final int getIntrinsicWidth() {
        return this.f14481d;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f14460I = new LinearGradient((float) (getBounds().centerX() - (this.f14481d / 2)), 0.0f, (float) (getBounds().centerX() + (this.f14481d / 2)), 0.0f, this.f14475X.getColor(C0164R.color.cyan_5), this.f14475X.getColor(C0164R.color.green_5), TileMode.REPEAT);
    }

    public final void setAlpha(int i) {
        this.f14454C = i;
        invalidateSelf();
    }
}
