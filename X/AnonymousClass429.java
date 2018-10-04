package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.429 */
public final class AnonymousClass429 implements AnonymousClass3iv {
    /* renamed from: B */
    private final int f48686B = (this.f48688D * 2);
    /* renamed from: C */
    private final Paint f48687C;
    /* renamed from: D */
    private final int f48688D;

    public AnonymousClass429(Paint paint, int i) {
        this.f48687C = paint;
        this.f48688D = i;
    }

    public final void sG(Canvas canvas, int i, int i2) {
        int i3 = 0;
        while (i3 < i) {
            canvas.drawRect((float) i3, 0.0f, (float) (this.f48688D + i3), (float) i2, this.f48687C);
            i3 += this.f48686B;
        }
    }
}
