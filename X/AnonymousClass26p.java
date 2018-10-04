package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.widget.ImageView;
import com.instagram.common.util.gradient.BackgroundGradientColors;

/* renamed from: X.26p */
public final class AnonymousClass26p {
    /* renamed from: B */
    private static final Matrix f26052B = new Matrix();

    /* renamed from: B */
    public static void m14471B(BackgroundGradientColors backgroundGradientColors, ImageView imageView, Orientation orientation) {
        imageView.setBackground(new GradientDrawable(orientation, new int[]{backgroundGradientColors.f26047C, backgroundGradientColors.f26046B}));
    }

    /* renamed from: C */
    public static BackgroundGradientColors m14472C(Bitmap bitmap, AnonymousClass26o anonymousClass26o) {
        int width;
        int max;
        Bitmap bitmap2 = bitmap;
        switch (AnonymousClass26n.f26048B[anonymousClass26o.ordinal()]) {
            case 1:
                width = bitmap.getWidth();
                max = Math.max((int) (((float) bitmap.getHeight()) * 0.05f), 1);
                break;
            case 2:
                width = Math.max((int) (((float) bitmap.getWidth()) * 0.05f), 1);
                max = bitmap.getHeight();
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported extraction type ");
                stringBuilder.append(anonymousClass26o.name());
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        f26052B.setScale(1.0f / ((float) width), 1.0f / ((float) max));
        bitmap = f26052B;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, max, bitmap, true);
        int pixel = createBitmap.getPixel(0, 0);
        if (createBitmap != bitmap2) {
            createBitmap.recycle();
        }
        createBitmap = Bitmap.createBitmap(bitmap2, bitmap2.getWidth() - width, bitmap2.getHeight() - max, width, max, bitmap, true);
        int pixel2 = createBitmap.getPixel(0, 0);
        if (createBitmap != bitmap2) {
            createBitmap.recycle();
        }
        return new BackgroundGradientColors(pixel, pixel2);
    }
}
