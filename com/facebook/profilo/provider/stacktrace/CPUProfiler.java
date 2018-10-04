package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass0CF;
import android.content.Context;
import android.os.Process;

public class CPUProfiler {
    private static volatile int sAvailableTracers;
    private static volatile boolean sInitialized;

    private static native boolean nativeInitialize(int i);

    private static native void nativeLoggerLoop();

    private static native boolean nativeStartProfiling(int i, int i2, boolean z);

    private static native void nativeStopProfiling();

    static {
        AnonymousClass0CF.m856E("profilo_stacktrace");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int calculateTracers(android.content.Context r3) {
        /*
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 1;
        r0 = 21;
        if (r1 >= r0) goto L_0x0008;
    L_0x0007:
        goto L_0x0072;
    L_0x0008:
        r0 = com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(r3);
        if (r0 == 0) goto L_0x0071;
    L_0x000e:
        r1 = android.os.Build.VERSION.RELEASE;
        r0 = r1.hashCode();
        switch(r0) {
            case 53368: goto L_0x0053;
            case 54329: goto L_0x0049;
            case 54330: goto L_0x003f;
            case 51288123: goto L_0x0035;
            case 52212604: goto L_0x002b;
            case 52212605: goto L_0x0022;
            case 52212606: goto L_0x0018;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x005d;
    L_0x0018:
        r0 = "7.1.2";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x005d;
    L_0x0020:
        r2 = 0;
        goto L_0x005e;
    L_0x0022:
        r0 = "7.1.1";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x005d;
    L_0x002a:
        goto L_0x005e;
    L_0x002b:
        r0 = "7.1.0";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x005d;
    L_0x0033:
        r2 = 3;
        goto L_0x005e;
    L_0x0035:
        r0 = "6.0.1";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x005d;
    L_0x003d:
        r2 = 6;
        goto L_0x005e;
    L_0x003f:
        r0 = "7.1";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x005d;
    L_0x0047:
        r2 = 2;
        goto L_0x005e;
    L_0x0049:
        r0 = "7.0";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x005d;
    L_0x0051:
        r2 = 4;
        goto L_0x005e;
    L_0x0053:
        r0 = "6.0";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x005d;
    L_0x005b:
        r2 = 5;
        goto L_0x005e;
    L_0x005d:
        r2 = -1;
    L_0x005e:
        switch(r2) {
            case 0: goto L_0x006e;
            case 1: goto L_0x006b;
            case 2: goto L_0x0068;
            case 3: goto L_0x0068;
            case 4: goto L_0x0065;
            case 5: goto L_0x0062;
            case 6: goto L_0x0062;
            default: goto L_0x0061;
        };
    L_0x0061:
        goto L_0x0071;
    L_0x0062:
        r2 = 16;
        goto L_0x0072;
    L_0x0065:
        r2 = 32;
        goto L_0x0072;
    L_0x0068:
        r2 = 64;
        goto L_0x0072;
    L_0x006b:
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        goto L_0x0072;
    L_0x006e:
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        goto L_0x0072;
    L_0x0071:
        r2 = 0;
    L_0x0072:
        r0 = "os.arch";
        r1 = java.lang.System.getProperty(r0);
        if (r1 == 0) goto L_0x0082;
    L_0x007a:
        r0 = "arm";
        r0 = r1.startsWith(r0);
        if (r0 == 0) goto L_0x0084;
    L_0x0082:
        r2 = r2 | 4;
    L_0x0084:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.CPUProfiler.calculateTracers(android.content.Context):int");
    }

    public static synchronized boolean init(Context context) {
        synchronized (CPUProfiler.class) {
            if (sInitialized) {
                return true;
            }
            sAvailableTracers = calculateTracers(context);
            sInitialized = nativeInitialize(sAvailableTracers);
            boolean z = sInitialized;
            return z;
        }
    }

    public static void loggerLoop() {
        if (sInitialized) {
            nativeLoggerLoop();
        }
    }

    public static synchronized boolean startProfiling(int i, int i2, boolean z) {
        boolean z2;
        synchronized (CPUProfiler.class) {
            StackTraceWhitelist.add(Process.myPid());
            z2 = sInitialized && nativeStartProfiling(i, i2, z);
        }
        return z2;
    }

    public static synchronized void stopProfiling() {
        synchronized (CPUProfiler.class) {
            if (sInitialized) {
                nativeStopProfiling();
            }
        }
    }
}
