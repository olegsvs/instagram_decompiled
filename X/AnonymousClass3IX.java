package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.3IX */
public final class AnonymousClass3IX extends LruCache {
    public AnonymousClass3IX(AnonymousClass3zu anonymousClass3zu, int i) {
        super(i);
    }

    public final int sizeOf(Object obj, Object obj2) {
        Long l = (Long) obj;
        return ((Bitmap) obj2).getByteCount();
    }
}
