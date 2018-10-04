package com.instagram.common.ui.blur;

import X.AnonymousClass0Fx;
import X.AnonymousClass0GG;
import X.AnonymousClass0aM;
import X.AnonymousClass0uu;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public class BlurUtil {
    private static volatile boolean sBoxBlurLibLoaded;
    private static volatile boolean sLibrariesLoaded;
    private static volatile boolean sStackBlurLibLoaded;
    private static boolean sUseBoxBlur;

    private static native void functionToBlur(Bitmap bitmap, int i, int i2);

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    private BlurUtil() {
    }

    public static Bitmap blur(Bitmap bitmap, float f, int i) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * f), Math.round(((float) bitmap.getHeight()) * f), false);
        blurInPlace(createScaledBitmap, i);
        return createScaledBitmap;
    }

    public static void blurInPlace(Bitmap bitmap, int i) {
        if (!sLibrariesLoaded) {
            return;
        }
        if (sUseBoxBlur && sBoxBlurLibLoaded && bitmap.getConfig() == Config.ARGB_8888) {
            nativeIterativeBoxBlur(bitmap, 2, i);
        } else if (sStackBlurLibLoaded) {
            functionToBlur(bitmap, i, AnonymousClass0uu.m8289B().m8291A());
        }
    }

    public static void loadLibraries() {
        AnonymousClass0GG.m1763B(AnonymousClass0Fx.m1698B(), new AnonymousClass0aM(), -1938972756);
    }

    public static void setUseBoxBlur(boolean z) {
        sUseBoxBlur = z;
    }
}
