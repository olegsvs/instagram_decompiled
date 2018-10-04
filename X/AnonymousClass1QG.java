package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.facebook.C0164R;

/* renamed from: X.1QG */
public final class AnonymousClass1QG extends Drawable {
    /* renamed from: B */
    public Bitmap f18347B;
    /* renamed from: C */
    public int f18348C;
    /* renamed from: D */
    public boolean f18349D;
    /* renamed from: E */
    public int f18350E;
    /* renamed from: F */
    private final RectF f18351F;
    /* renamed from: G */
    private final Rect f18352G;
    /* renamed from: H */
    private final RectF f18353H;
    /* renamed from: I */
    private final int f18354I;
    /* renamed from: J */
    private final float f18355J;
    /* renamed from: K */
    private final RectF f18356K;
    /* renamed from: L */
    private final int f18357L = 0;
    /* renamed from: M */
    private final float f18358M;
    /* renamed from: N */
    private final Paint f18359N;

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass1QG(Resources resources) {
        Paint paint = new Paint();
        this.f18359N = paint;
        paint.setAntiAlias(true);
        this.f18354I = resources.getColor(C0164R.color.white);
        resources.getColor(C0164R.color.grey_5);
        this.f18358M = 0.0f;
        this.f18356K = new RectF();
        this.f18353H = new RectF();
        this.f18351F = new RectF();
        this.f18352G = new Rect();
        this.f18355J = TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
    }

    public final void draw(Canvas canvas) {
        this.f18359N.setStyle(Style.STROKE);
        this.f18359N.setStrokeWidth(this.f18358M);
        if (this.f18358M != 0.0f) {
            this.f18359N.setColor(this.f18357L);
            canvas.drawRoundRect(this.f18356K, 4.0f, 4.0f, this.f18359N);
        }
        this.f18359N.setStrokeWidth(this.f18355J);
        this.f18359N.setColor(this.f18354I);
        if (this.f18349D) {
            canvas.drawRoundRect(this.f18353H, 4.0f, 4.0f, this.f18359N);
        } else {
            canvas.drawRect(this.f18353H, this.f18359N);
        }
        this.f18359N.setStyle(Style.FILL);
        Bitmap bitmap = this.f18347B;
        if (bitmap != null) {
            this.f18347B = AnonymousClass0rm.m7982K(bitmap, getIntrinsicWidth(), getIntrinsicHeight(), 0, false);
            Rect rect = this.f18352G;
            rect.left = 0;
            rect.right = this.f18347B.getWidth();
            rect = this.f18352G;
            rect.top = 0;
            rect.bottom = this.f18347B.getHeight();
            canvas.drawBitmap(this.f18347B, this.f18352G, this.f18351F, this.f18359N);
        }
    }

    public final int getIntrinsicHeight() {
        return this.f18348C;
    }

    public final int getIntrinsicWidth() {
        return this.f18350E;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float f = this.f18358M / 2.0f;
        this.f18356K.set(rect);
        this.f18356K.inset(f, f);
        f = this.f18358M + (this.f18355J / 2.0f);
        this.f18353H.set(rect);
        this.f18353H.inset(f, f);
        f = this.f18358M + this.f18355J;
        this.f18351F.set(rect);
        this.f18351F.inset(f, f);
    }

    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("setAlpha not implemented");
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("setColorFilter not implemented");
    }
}
