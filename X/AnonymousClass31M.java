package X;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.31M */
public final class AnonymousClass31M {
    /* renamed from: B */
    public static Rect m18228B(RectF rectF, int i, int i2) {
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
            if (rectF2.contains(rectF)) {
                Rect rect = new Rect();
                rectF.roundOut(rect);
                rect.left = Math.max(rect.left, 0);
                rect.top = Math.max(rect.top, 0);
                rect.right = Math.min(rect.right, i);
                rect.bottom = Math.min(rect.bottom, i2);
                return rect;
            }
        }
        return null;
    }

    /* renamed from: C */
    public static ByteBuffer m18229C(Bitmap bitmap, float f, Point point) {
        Bitmap createBitmap;
        Bitmap bitmap2 = bitmap;
        if (f % 360.0f != 0.0f) {
            bitmap = new Matrix();
            bitmap.setRotate(f, ((float) bitmap2.getWidth()) / 2.0f, ((float) bitmap2.getHeight()) / 2.0f);
            createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), bitmap, Float.MIN_VALUE);
        } else {
            createBitmap = bitmap;
        }
        if (createBitmap != bitmap2) {
            bitmap2.recycle();
        }
        bitmap2 = (point.x <= 0 || point.x >= createBitmap.getWidth() || point.y <= 0 || point.y >= createBitmap.getHeight()) ? createBitmap : Bitmap.createBitmap(createBitmap, (createBitmap.getWidth() - point.x) / 2, (createBitmap.getHeight() - point.y) / 2, point.x, point.y);
        if (bitmap2 != createBitmap) {
            createBitmap.recycle();
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap2.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
        bitmap2.recycle();
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }
}
