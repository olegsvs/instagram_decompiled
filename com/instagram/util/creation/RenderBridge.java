package com.instagram.util.creation;

import X.AnonymousClass0CF;
import X.AnonymousClass0Dc;

public class RenderBridge {
    private static final Class TAG = RenderBridge.class;
    private static boolean sLoaded;

    public static native int computeHistogram(int i, int[] iArr);

    public static native long configureImage(String str);

    public static native int mirrorAndComputeHistogram(int i, int[] iArr);

    public static native int mirrorImage(int i);

    public static native int readRenderResult(int i, int i2);

    public static native long saveAndClearCachedImage(int i, String str, boolean z, boolean z2, int i2, boolean z3);

    public static synchronized boolean loadLibraries() {
        boolean z;
        synchronized (RenderBridge.class) {
            if (!sLoaded) {
                try {
                    AnonymousClass0CF.E("glcommon");
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
