package com.instagram.util.jpeg;

import X.AnonymousClass0CF;
import X.AnonymousClass0Dc;
import android.graphics.Rect;

public class JpegBridge {
    private static final Class TAG = JpegBridge.class;
    private static boolean sLoaded;

    public static native float[] calcBWpoint(int i);

    public static native int calcCDF(int i);

    private static native NativeImage decodeCroppedJpeg(String str, int i, int i2, int i3, int i4);

    private static native NativeImage decodeFullJpeg(String str);

    private static native String getJpegLibraryNameNative();

    private static native String getJpegLibraryVersionNative();

    public static native int loadBufferToTexture(long j, int i, int i2);

    public static native int loadCDF(int i);

    public static native NativeImage readFramebuffer(int i, int i2);

    public static native int releaseNativeBuffer(int i);

    public static native NativeImage rotateImage(NativeImage nativeImage, int i);

    public static native int saveImage(NativeImage nativeImage, String str, int i, boolean z);

    public static native String saveImageFromGlContext(String str, int i, int i2, int i3);

    public static native NativeImage scaleImage(NativeImage nativeImage, int i, int i2);

    public static native int uploadTexture(NativeImage nativeImage);

    public static NativeImage decodeJpeg(String str, Rect rect) {
        if (rect != null) {
            return decodeCroppedJpeg(str, rect.left, rect.top, rect.right, rect.bottom);
        }
        return decodeFullJpeg(str);
    }

    public static String getJpegLibraryName() {
        return loadLibraries() ? getJpegLibraryNameNative() : "library_not_loaded";
    }

    public static String getJpegLibraryVersion() {
        return loadLibraries() ? getJpegLibraryVersionNative() : "library_not_loaded";
    }

    public static synchronized boolean loadLibraries() {
        boolean z;
        synchronized (JpegBridge.class) {
            if (!sLoaded) {
                try {
                    AnonymousClass0CF.E("glcommon");
                    AnonymousClass0CF.E("halide");
                    AnonymousClass0CF.E("cj_moz");
                    sLoaded = true;
                } catch (Throwable e) {
                    AnonymousClass0Dc.C(TAG, "Could not load native library", e);
                }
            }
            z = sLoaded;
        }
        return z;
    }
}
