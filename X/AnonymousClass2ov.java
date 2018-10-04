package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.concurrent.ForkJoinPool;

/* renamed from: X.2ov */
public final class AnonymousClass2ov {
    /* renamed from: B */
    public int[] f34374B;
    /* renamed from: C */
    public final ForkJoinPool f34375C = new ForkJoinPool();

    /* renamed from: B */
    public static float[] m17308B(Bitmap bitmap, int[] iArr) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        float[] fArr = new float[(bitmap2.getWidth() * bitmap2.getHeight())];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            fArr[i] = ((((float) Color.red(i2)) * 0.299f) + (((float) Color.green(i2)) * 0.587f)) + (((float) Color.blue(i2)) * 0.114f);
        }
        return fArr;
    }
}
