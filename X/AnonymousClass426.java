package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.426 */
public final class AnonymousClass426 implements AnonymousClass3iv {
    /* renamed from: B */
    private final int f48677B = (this.f48679D * 2);
    /* renamed from: C */
    private final Paint f48678C;
    /* renamed from: D */
    private final int f48679D;

    public AnonymousClass426(Paint paint, int i) {
        this.f48678C = paint;
        this.f48679D = i;
    }

    public final void sG(Canvas canvas, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            canvas.drawRect(0.0f, (float) i3, (float) i, (float) (this.f48679D + i3), this.f48678C);
            i3 += this.f48677B;
        }
    }
}
