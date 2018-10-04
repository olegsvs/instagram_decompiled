package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.3CF */
public final class AnonymousClass3CF extends LruCache {
    public AnonymousClass3CF(AnonymousClass3CJ anonymousClass3CJ, int i) {
        super(i);
    }

    public final int sizeOf(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        return ((Bitmap) obj2).getByteCount();
    }
}
