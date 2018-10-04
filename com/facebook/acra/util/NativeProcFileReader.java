package com.facebook.acra.util;

import X.AnonymousClass00a;
import X.AnonymousClass1Kf;
import X.AnonymousClass1Lt;
import java.util.concurrent.atomic.AtomicBoolean;

public class NativeProcFileReader extends AnonymousClass1Kf {
    private static NativeProcFileReader sInstance = null;
    private static Thread sLoadSoThread = null;
    public static final AtomicBoolean sReadyToUse = new AtomicBoolean(false);

    private native int[] getOpenFDLimitsNative();

    public native int getOpenFDCount();

    public native String getOpenFileDescriptors();

    private NativeProcFileReader() {
        if (!isReady()) {
            throw new IllegalStateException("Class is not ready");
        }
    }

    public static NativeProcFileReader getInstance() {
        if (sInstance == null) {
            sInstance = new NativeProcFileReader();
        }
        return sInstance;
    }

    public final AnonymousClass1Lt getOpenFDLimits() {
        int[] openFDLimitsNative = getOpenFDLimitsNative();
        return new AnonymousClass1Lt(String.valueOf(openFDLimitsNative[0]), String.valueOf(openFDLimitsNative[1]));
    }

    public static boolean isReady() {
        return sReadyToUse.get();
    }

    public static void safeToLoadNativeLibraries() {
        synchronized (NativeProcFileReader.class) {
            if (sLoadSoThread == null) {
                sLoadSoThread = new Thread(new AnonymousClass00a());
                sLoadSoThread.start();
            }
        }
    }
}
