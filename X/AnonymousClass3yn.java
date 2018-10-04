package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.C0164R;

/* renamed from: X.3yn */
public final class AnonymousClass3yn extends AnonymousClass3D4 {
    /* renamed from: B */
    public int f47778B = -16777216;
    /* renamed from: C */
    public boolean f47779C;
    /* renamed from: D */
    private final RectF f47780D = new RectF();
    /* renamed from: E */
    private final Paint f47781E = new Paint(1);
    /* renamed from: F */
    private final Path f47782F = new Path();
    /* renamed from: G */
    private final String f47783G;
    /* renamed from: H */
    private final Rect f47784H = new Rect();
    /* renamed from: I */
    private int f47785I = -1;

    public AnonymousClass3yn(Resources resources, Drawable drawable, String str) {
        super(drawable);
        resources.getDimensionPixelSize(C0164R.dimen.effect_tile_rounded_corner);
        this.f47782F.setFillType(FillType.EVEN_ODD);
        this.f47783G = str;
        this.f47781E.setTextAlign(Align.CENTER);
        this.f47781E.setStrokeWidth(1.0f);
    }

    /* renamed from: A */
    public final void mo4789A(int i) {
        this.f47785I = i;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (!this.f47779C) {
            if (this.f47783G == null) {
                setAlpha(255);
                super.draw(canvas);
                if (this.f39146B == null) {
                    this.f47781E.setColor(this.f47778B);
                    canvas.drawPath(this.f47782F, this.f47781E);
                } else {
                    this.f47781E.setColor(-16777216);
                    canvas.drawRect(this.f47780D, this.f47781E);
                }
                if (this.f47783G != null) {
                    this.f47781E.setColor(this.f47785I);
                    this.f47781E.setFakeBoldText(true);
                    this.f47781E.setTextSize(((float) getBounds().height()) * 0.18f);
                    Paint paint = this.f47781E;
                    String str = this.f47783G;
                    paint.getTextBounds(str, 0, str.length(), this.f47784H);
                    canvas.drawText(this.f47783G, (float) getBounds().centerX(), ((float) (getBounds().top + (getBounds().height() / 2))) + ((float) (this.f47784H.height() / 2)), this.f47781E);
                }
            }
        }
        setAlpha(128);
        super.draw(canvas);
        if (this.f39146B == null) {
            this.f47781E.setColor(-16777216);
            canvas.drawRect(this.f47780D, this.f47781E);
        } else {
            this.f47781E.setColor(this.f47778B);
            canvas.drawPath(this.f47782F, this.f47781E);
        }
        if (this.f47783G != null) {
            this.f47781E.setColor(this.f47785I);
            this.f47781E.setFakeBoldText(true);
            this.f47781E.setTextSize(((float) getBounds().height()) * 0.18f);
            Paint paint2 = this.f47781E;
            String str2 = this.f47783G;
            paint2.getTextBounds(str2, 0, str2.length(), this.f47784H);
            canvas.drawText(this.f47783G, (float) getBounds().centerX(), ((float) (getBounds().top + (getBounds().height() / 2))) + ((float) (this.f47784H.height() / 2)), this.f47781E);
        }
    }

    public final void onBoundsChange(Rect rect) {
        if (this.f39146B != null) {
            this.f39146B.setBounds(rect);
        }
        super.onBoundsChange(rect);
        this.f47780D.set(rect);
        this.f47782F.reset();
        this.f47782F.addRect(this.f47780D, Direction.CW);
        this.f47782F.addRect(this.f47780D, Direction.CCW);
    }
}
