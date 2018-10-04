package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.text.style.LineBackgroundSpan;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.List;

/* renamed from: X.2Jh */
public final class AnonymousClass2Jh implements OnPreDrawListener, LineBackgroundSpan {
    /* renamed from: B */
    public final int f28875B;
    /* renamed from: C */
    public final boolean f28876C;
    /* renamed from: D */
    public boolean f28877D;
    /* renamed from: E */
    public final Paint f28878E;
    /* renamed from: F */
    private final List f28879F;

    public AnonymousClass2Jh(int i, float f, List list) {
        this.f28875B = i;
        this.f28879F = list;
        Paint paint = new Paint(1);
        this.f28878E = paint;
        paint.setColor(i);
        this.f28876C = Color.alpha(i) < 255;
        this.f28878E.setStyle(Style.FILL_AND_STROKE);
        this.f28878E.setPathEffect(new CornerPathEffect(f));
        this.f28877D = true;
    }

    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        if (this.f28877D) {
            int i9 = 0;
            this.f28877D = false;
            while (i9 < this.f28879F.size()) {
                canvas.drawPath((Path) this.f28879F.get(i9), this.f28878E);
                i9++;
            }
        }
    }

    public final boolean onPreDraw() {
        this.f28877D = true;
        return true;
    }
}
