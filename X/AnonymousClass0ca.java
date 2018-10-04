package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;

/* renamed from: X.0ca */
public final class AnonymousClass0ca {
    /* renamed from: B */
    private static final SparseArray f7199B = new SparseArray();

    /* renamed from: B */
    public static ColorFilter m5921B(int i) {
        ColorFilter colorFilter = (ColorFilter) f7199B.get(i);
        if (colorFilter != null) {
            return colorFilter;
        }
        colorFilter = new PorterDuffColorFilter(i, Mode.SRC_ATOP);
        f7199B.put(i, colorFilter);
        return colorFilter;
    }
}
