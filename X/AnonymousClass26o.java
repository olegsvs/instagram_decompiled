package X;

import android.graphics.Bitmap;

/* renamed from: X.26o */
public enum AnonymousClass26o {
    VERTICAL,
    HORIZONTAL;

    /* renamed from: B */
    public static AnonymousClass26o m14470B(Bitmap bitmap) {
        return bitmap.getWidth() > bitmap.getHeight() ? VERTICAL : HORIZONTAL;
    }
}
