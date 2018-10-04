package com.facebook.common.dextricks.classtracing.logger;

import X.AnonymousClass0A3;
import X.AnonymousClass0CF;
import X.AnonymousClass0D2;
import com.facebook.common.dextricks.classid.ClassId;

public final class ClassTracingLogger {
    private static volatile boolean sEnabled;
    private static volatile boolean sLoggerEnabled;
    private static volatile boolean sSystraceEnabled;

    private static native void classLoadCancelled();

    private static native void classLoadStarted(String str);

    private static native void classLoaded(long j);

    private static native void configureTracing(boolean z, boolean z2);

    public static native long[] getLoadedClassIds();

    static {
        AnonymousClass0CF.m856E("classtracing");
        AnonymousClass0D2.m1090B(new AnonymousClass0A3());
    }

    public static void beginClassLoad(String str) {
        if (sEnabled) {
            if (ClassId.sInitialized) {
                classLoadStarted(str);
            }
        }
    }

    public static void classLoaded(Class cls) {
        if (sEnabled) {
            if (ClassId.sInitialized) {
                classLoaded(ClassId.getClassId(cls));
            }
        }
    }

    public static void classNotFound() {
        if (sEnabled) {
            if (ClassId.sInitialized) {
                classLoadCancelled();
            }
        }
    }

    public static void setLogToSystrace(boolean z) {
        boolean z2;
        sSystraceEnabled = z;
        if (!sLoggerEnabled) {
            if (!sSystraceEnabled) {
                z2 = false;
                sEnabled = z2;
                configureTracing(sLoggerEnabled, sSystraceEnabled);
            }
        }
        z2 = true;
        sEnabled = z2;
        configureTracing(sLoggerEnabled, sSystraceEnabled);
    }
}
