package com.facebook.common.iopri;

import X.AnonymousClass1tE;
import X.AnonymousClass1tF;

public class IoPriority {
    public static final AnonymousClass1tF DEFAULT_IO_PRIORITY_VALUE = new AnonymousClass1tF(AnonymousClass1tE.IOPRIO_CLASS_NONE, 0);
    private static final Class IO_PRI_LOADER_CLS;
    private static boolean sLibLoaded;

    private static native int nativeGetCurrentIoPriority();

    private static native int nativeGetIoPriority(int i);

    private static native int nativeGetIoValueClass(int i);

    private static native int nativeGetIoValueData(int i);

    private static native int nativeGetRawIoPriValue(int i, int i2);

    private static native void nativeSetCurrentIoPriority(int i, int i2);

    private static native void nativeSetCurrentRawIoPriority(int i);

    private static native void nativeSetIoPriority(int i, int i2, int i3);

    private static native void nativeSetRawIoPriority(int i, int i2);

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = new X.1tF;
        r0 = X.AnonymousClass1tE.IOPRIO_CLASS_NONE;
        r4 = 0;
        r1.<init>(r0, r4);
        DEFAULT_IO_PRIORITY_VALUE = r1;
        r3 = 0;
        r0 = "com.facebook.common.iopri.loader.IoPriLoader";	 Catch:{ Exception -> 0x0028 }
        r2 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0028 }
        r1 = "load";	 Catch:{ Exception -> 0x0029 }
        r0 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0029 }
        r1 = r2.getDeclaredMethod(r1, r0);	 Catch:{ Exception -> 0x0029 }
        r0 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0029 }
        r0 = r1.invoke(r3, r0);	 Catch:{ Exception -> 0x0029 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Exception -> 0x0029 }
        r0 = r0.booleanValue();	 Catch:{ Exception -> 0x0029 }
        sLibLoaded = r0;	 Catch:{ Exception -> 0x0029 }
        goto L_0x002b;	 Catch:{ Exception -> 0x0029 }
    L_0x0028:
        r2 = r3;
    L_0x0029:
        sLibLoaded = r4;
    L_0x002b:
        IO_PRI_LOADER_CLS = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.iopri.IoPriority.<clinit>():void");
    }

    private IoPriority() {
    }

    public static int getCurrentRawIoPriority() {
        if (sLibLoaded) {
            return nativeGetCurrentIoPriority();
        }
        return 0;
    }

    public static void setCurrentRawIoPriority(int i) {
        if (sLibLoaded) {
            nativeSetCurrentRawIoPriority(i);
        }
    }
}
