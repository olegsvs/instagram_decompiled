package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.lang.ref.WeakReference;

/* renamed from: X.24N */
public final class AnonymousClass24N implements AnonymousClass0al {
    public final AnonymousClass0lc IG(int i, byte[] bArr, int i2, int i3) {
        Options options = new Options();
        int i4 = i;
        if (i != 1) {
            options.inSampleSize = i;
        }
        int i5 = i2;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
        if (decodeByteArray == null) {
            return null;
        }
        return new AnonymousClass0lc(decodeByteArray, new AnonymousClass24M(this, i4, i5, decodeByteArray.getByteCount(), i3, new WeakReference(decodeByteArray)));
    }
}
