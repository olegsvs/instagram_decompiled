package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.instagram.common.graphics.IgBitmapReferenceFactory;

/* renamed from: X.24J */
public final class AnonymousClass24J implements AnonymousClass0al {
    public final AnonymousClass0lc IG(int i, byte[] bArr, int i2, int i3) {
        Options options = new Options();
        int i4 = i;
        options.inSampleSize = i;
        int i5 = i2;
        i = IgBitmapReferenceFactory.decodeByteArray(bArr, 0, i2, options);
        if (i == 0) {
            return null;
        }
        Bitmap orCreateBitmap = i.getOrCreateBitmap();
        i.makeDiscardable();
        return new AnonymousClass0lc(orCreateBitmap, new AnonymousClass24H(this, i4, i5, orCreateBitmap.getByteCount(), i3, i));
    }
}
