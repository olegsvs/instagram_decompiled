package X;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* renamed from: X.130 */
public class AnonymousClass130 extends AnonymousClass131 {
    /* renamed from: B */
    public final Display mo2064B(View view) {
        return view.getDisplay();
    }

    /* renamed from: F */
    public final int mo2065F(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: I */
    public final int mo2066I(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: J */
    public final int mo2067J(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: d */
    public final void mo2068d(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* renamed from: g */
    public final void mo2069g(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
