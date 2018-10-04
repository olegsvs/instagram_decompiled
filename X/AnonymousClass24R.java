package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.lang.reflect.Method;

/* renamed from: X.24R */
public final class AnonymousClass24R implements AnonymousClass0al {
    /* renamed from: B */
    public final /* synthetic */ Method f25615B;

    public AnonymousClass24R(Method method) {
        this.f25615B = method;
    }

    public final AnonymousClass0lc IG(int i, byte[] bArr, int i2, int i3) {
        Options options = new Options();
        int i4 = i;
        if (i != 1) {
            options = new Options();
            options.inPurgeable = true;
            options.inInputShareable = false;
            options.inSampleSize = i;
        }
        int i5 = i2;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
        if (decodeByteArray == null) {
            return null;
        }
        try {
            Bitmap bitmap = (Bitmap) this.f25615B.invoke(decodeByteArray, new Object[0]);
            bitmap.prepareToDraw();
            return new AnonymousClass0lc(bitmap, new AnonymousClass24Q(this, i4, i5, bitmap.getByteCount(), i3, bitmap));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
