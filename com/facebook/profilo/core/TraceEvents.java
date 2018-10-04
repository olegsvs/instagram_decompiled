package com.facebook.profilo.core;

import java.util.Map;
import java.util.Map.Entry;

public final class TraceEvents {
    public static boolean sInitialized;
    private static volatile boolean sProviderNamesInitialized;

    public static native void clearAllProviders();

    public static native void disableProviders(int i);

    public static native void enableProviders(int i);

    public static native int nativeEnabledMask(int i);

    public static native void nativeInitProviderNames(int[] iArr, String[] strArr);

    public static native boolean nativeIsEnabled(int i);

    public static int enabledMask(int i) {
        if (sInitialized) {
            return nativeEnabledMask(i);
        }
        return 0;
    }

    public static void initProviderNames(Map map) {
        if (!sInitialized) {
            throw new IllegalStateException("Native library is not initialized.");
        } else if (!sProviderNamesInitialized) {
            int size = map.size();
            int[] iArr = new int[size];
            String[] strArr = new String[size];
            int i = 0;
            for (Entry entry : map.entrySet()) {
                strArr[i] = (String) entry.getKey();
                int i2 = i + 1;
                iArr[i] = ((Integer) entry.getValue()).intValue();
                i = i2;
            }
            nativeInitProviderNames(iArr, strArr);
            sProviderNamesInitialized = true;
        }
    }

    public static boolean isEnabled(int i) {
        return sInitialized && nativeIsEnabled(i);
    }

    public static boolean isProviderNamesInitialized() {
        return sProviderNamesInitialized;
    }
}
