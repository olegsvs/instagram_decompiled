package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0wg */
public final class AnonymousClass0wg {
    /* renamed from: B */
    public static boolean m8435B(View view, double d) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        if (view.getParent() == null) {
            return false;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        long height = ((long) rect.height()) * ((long) rect.width());
        long height2 = ((long) view.getHeight()) * ((long) view.getWidth());
        if (height2 <= 0) {
            return false;
        }
        double d2 = (double) height;
        double d3 = (double) height2;
        Double.isNaN(d3);
        if (d2 >= d * d3) {
            return true;
        }
        return false;
    }
}
