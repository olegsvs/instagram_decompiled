package com.facebook.systrace;

public class TraceDirect {
    private static final boolean DISABLED;

    private static native void nativeAsyncTraceBegin(String str, int i, long j);

    private static native void nativeAsyncTraceCancel(String str, int i);

    private static native void nativeAsyncTraceEnd(String str, int i, long j);

    private static native void nativeAsyncTraceRename(String str, String str2, int i);

    private static native void nativeAsyncTraceStageBegin(String str, int i, long j, String str2);

    private static native void nativeBeginSection(String str);

    private static native void nativeBeginSectionWithArgs(StringBuilder stringBuilder);

    private static native void nativeEndAsyncFlow(String str, int i);

    private static native void nativeEndSection();

    private static native void nativeEndSectionWithArgs(StringBuilder stringBuilder);

    private static native void nativeSetEnabledTags(long j);

    private static native void nativeStartAsyncFlow(String str, int i);

    private static native void nativeStepAsyncFlow(String str, int i);

    private static native void nativeTraceCounter(String str, int i);

    private static native void nativeTraceInstant(String str, String str2, char c);

    private static native void nativeTraceMetadata(String str, String str2, int i);

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r1 = 1;
        r0 = "fbsystrace";	 Catch:{ UnsatisfiedLinkError -> 0x0008 }
        X.AnonymousClass0CF.m856E(r0);	 Catch:{ UnsatisfiedLinkError -> 0x0008 }
        r0 = 1;	 Catch:{ UnsatisfiedLinkError -> 0x0008 }
        goto L_0x0009;	 Catch:{ UnsatisfiedLinkError -> 0x0008 }
    L_0x0008:
        r0 = 0;
    L_0x0009:
        r1 = r1 ^ r0;
        DISABLED = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.systrace.TraceDirect.<clinit>():void");
    }

    public static void asyncTraceBegin(String str, int i, long j) {
        if (!DISABLED) {
            nativeAsyncTraceBegin(str, i, j);
        }
    }

    public static void asyncTraceCancel(String str, int i) {
        if (!DISABLED) {
            nativeAsyncTraceCancel(str, i);
        }
    }

    public static void asyncTraceEnd(String str, int i, long j) {
        if (!DISABLED) {
            nativeAsyncTraceEnd(str, i, j);
        }
    }

    public static void asyncTraceRename(String str, String str2, int i) {
        if (!DISABLED) {
            nativeAsyncTraceRename(str, str2, i);
        }
    }

    public static void asyncTraceStageBegin(String str, int i, long j, String str2) {
        if (!DISABLED) {
            nativeAsyncTraceStageBegin(str, i, j, str2);
        }
    }

    public static void beginSection(String str) {
        if (!DISABLED) {
            nativeBeginSection(str);
        }
    }

    public static void beginSectionWithArgs(StringBuilder stringBuilder) {
        if (!DISABLED) {
            nativeBeginSectionWithArgs(stringBuilder);
        }
    }

    public static void endAsyncFlow(String str, int i) {
        if (!DISABLED) {
            nativeEndAsyncFlow(str, i);
        }
    }

    public static void endSection() {
        if (!DISABLED) {
            nativeEndSection();
        }
    }

    public static void endSectionWithArgs(StringBuilder stringBuilder) {
        if (!DISABLED) {
            nativeEndSectionWithArgs(stringBuilder);
        }
    }

    public static void setEnabledTags(long j) {
        if (!DISABLED) {
            nativeSetEnabledTags(j);
        }
    }

    public static void startAsyncFlow(String str, int i) {
        if (!DISABLED) {
            nativeStartAsyncFlow(str, i);
        }
    }

    public static void traceCounter(String str, int i) {
        if (!DISABLED) {
            nativeTraceCounter(str, i);
        }
    }
}
