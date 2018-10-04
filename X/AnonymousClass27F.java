package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.C0164R;
import java.util.Calendar;

/* renamed from: X.27F */
public final class AnonymousClass27F extends Drawable {
    /* renamed from: O */
    private static final String[] f26115O = new String[]{"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    /* renamed from: B */
    public final Paint f26116B = new Paint(1);
    /* renamed from: C */
    private final int f26117C;
    /* renamed from: D */
    private final float[] f26118D = new float[2];
    /* renamed from: E */
    private final float f26119E;
    /* renamed from: F */
    private final int f26120F;
    /* renamed from: G */
    private final int f26121G;
    /* renamed from: H */
    private final int f26122H;
    /* renamed from: I */
    private final Matrix f26123I = new Matrix();
    /* renamed from: J */
    private final int f26124J;
    /* renamed from: K */
    private final float f26125K;
    /* renamed from: L */
    private int f26126L;
    /* renamed from: M */
    private int f26127M;
    /* renamed from: N */
    private final float f26128N;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass27F(Context context, Resources resources, float f, long j) {
        int J = (int) (((float) AnonymousClass0Nm.J(context)) * f);
        this.f26122H = J;
        this.f26121G = J;
        float E = ((float) J) / AnonymousClass0Nm.E(resources.getDisplayMetrics(), 150);
        float E2 = AnonymousClass0Nm.E(resources.getDisplayMetrics(), 21) * E;
        this.f26116B.setTextAlign(Align.CENTER);
        this.f26116B.setTypeface(AnonymousClass0nA.C(resources));
        this.f26116B.setStrokeCap(Cap.ROUND);
        this.f26116B.setTextSize(E2);
        this.f26125K = AnonymousClass0Nm.E(resources.getDisplayMetrics(), 8) * E;
        this.f26119E = AnonymousClass0Nm.E(resources.getDisplayMetrics(), 3) * E;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        this.f26120F = instance.get(10);
        this.f26124J = instance.get(12);
        this.f26117C = resources.getColor(C0164R.color.sticker_subtle_light_background);
        Rect rect = new Rect();
        this.f26116B.getTextBounds("1", 0, 1, rect);
        this.f26128N = (float) rect.height();
    }

    /* renamed from: B */
    private void m14493B(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        float[] fArr = this.f26118D;
        fArr[0] = f;
        fArr[1] = f2;
        this.f26123I.reset();
        float f6 = f3;
        float f7 = f4;
        this.f26123I.preRotate(f5, f3, f4);
        this.f26123I.mapPoints(this.f26118D);
        fArr = this.f26118D;
        canvas.drawLine(f6, f7, fArr[0], fArr[1], this.f26116B);
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas.save();
        AnonymousClass27F anonymousClass27F = this;
        canvas.translate((float) this.f26126L, (float) this.f26127M);
        float f = ((float) this.f26122H) / 2.0f;
        this.f26116B.setColor(this.f26117C);
        this.f26116B.setStyle(Style.FILL);
        canvas.drawCircle(f, f, f, this.f26116B);
        this.f26116B.setColor(-1);
        float f2 = (0.16f * f) + this.f26128N;
        canvas.drawText(f26115O[0], f, f2, this.f26116B);
        float[] fArr = this.f26118D;
        fArr[0] = f;
        fArr[1] = f2;
        this.f26123I.reset();
        this.f26123I.preRotate(30.0f, f, (this.f26128N / 2.0f) + f);
        for (int i = 1; i < f26115O.length; i++) {
            this.f26123I.mapPoints(this.f26118D);
            String str = f26115O[i];
            fArr = this.f26118D;
            canvas.drawText(str, fArr[0], fArr[1], this.f26116B);
        }
        canvas.drawCircle(f, f, this.f26125K / 2.0f, this.f26116B);
        this.f26116B.setStrokeWidth(this.f26119E);
        f2 = ((float) this.f26124J) / 60.0f;
        float f3 = f;
        float f4 = f;
        m14493B(canvas2, f, f * 0.73f, f3, f4, ((((float) this.f26120F) + f2) / 12.0f) * 1135869952);
        m14493B(canvas2, f, f * 0.55f, f3, f4, f2 * 360.0f);
        canvas2.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f26121G;
    }

    public final int getIntrinsicWidth() {
        return this.f26122H;
    }

    public final void onBoundsChange(Rect rect) {
        this.f26126L = rect.left;
        this.f26127M = rect.top;
    }
}
