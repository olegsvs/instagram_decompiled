package com.facebook.breakpad;

import X.AnonymousClass0CF;
import android.content.Context;
import java.io.File;
import java.util.Formatter;
import java.util.Map;
import java.util.TreeMap;

public class BreakpadManager {
    private static File mCrashDirectory;
    private static boolean mIsCloningExperimentEnabled;
    private static boolean mIsUnifiedCustomDataEnabled;
    private static String mNativeLibraryName;

    public static native void crashThisProcess();

    private static native boolean disableCoreDumpingImpl();

    private static native boolean enableCoreDumpingImpl(String str);

    public static native String getCustomData(String str);

    public static native long getMinidumpFlags();

    private static native void install(String str, boolean z, int i);

    private static native boolean isCoreResouceHardUnlimited();

    private static native void nativeGetCustomDataSnapshot(TreeMap treeMap);

    private static native void nativeSetCustomData(String str, String str2);

    private static native boolean nativeSetJvmStreamEnabled(boolean z, boolean z2);

    public static native void removeCustomData(String str);

    public static native void setMinidumpFlags(long j);

    private static native void setVersionInfo(int i, String str);

    public static native void uninstall();

    public static File getCrashDirectory() {
        File file = mCrashDirectory;
        if (file != null) {
            return file;
        }
        throw new RuntimeException("Breakpad not installed");
    }

    public static Map getCustomDataSnapshot() {
        Map treeMap = new TreeMap();
        nativeGetCustomDataSnapshot(treeMap);
        return treeMap;
    }

    public static String getNativeLibraryName() {
        String str = mNativeLibraryName;
        if (str != null) {
            return str;
        }
        throw new RuntimeException("Breakpad not installed");
    }

    public static boolean isActive() {
        return mCrashDirectory != null;
    }

    public static boolean isArt() {
        String property = System.getProperty("java.vm.version");
        return (property == null || property.startsWith("1.") || property.startsWith("0.")) ? false : true;
    }

    private static void loadLibrary(boolean z) {
        if (mNativeLibraryName == null) {
            String str = z ? "breakpad_static" : "breakpad";
            AnonymousClass0CF.m856E(str);
            mNativeLibraryName = str;
        }
    }

    public static void setCustomData(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            Appendable stringBuilder = new StringBuilder();
            Formatter formatter = new Formatter(stringBuilder);
            formatter.format(str2, objArr);
            formatter.close();
            str2 = stringBuilder.toString();
        }
        nativeSetCustomData(str, str2);
    }

    public static synchronized void setJvmStreamEnabled(boolean z) {
        synchronized (BreakpadManager.class) {
            boolean isArt = isArt();
            if (isArt && z) {
                AnonymousClass0CF.m856E("breakpad_cpp_helper");
            }
            nativeSetJvmStreamEnabled(isArt, z);
        }
    }

    public static void start(Context context) {
        start(context, 0, 1536000);
    }

    public static synchronized void start(android.content.Context r8, int r9, int r10) {
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
        r7 = com.facebook.breakpad.BreakpadManager.class;
        monitor-enter(r7);
        r0 = r9 & 2;
        r3 = 0;
        if (r0 == 0) goto L_0x000a;
    L_0x0008:
        r0 = 1;
        goto L_0x000b;
    L_0x000a:
        r0 = 0;
    L_0x000b:
        loadLibrary(r0);	 Catch:{ all -> 0x00b3 }
        r0 = mCrashDirectory;	 Catch:{ all -> 0x00b3 }
        if (r0 != 0) goto L_0x00b1;	 Catch:{ all -> 0x00b3 }
    L_0x0012:
        r0 = "minidumps";	 Catch:{ all -> 0x00b3 }
        r2 = r8.getDir(r0, r3);	 Catch:{ all -> 0x00b3 }
        if (r2 == 0) goto L_0x00a9;	 Catch:{ all -> 0x00b3 }
    L_0x001a:
        r1 = r2.getAbsolutePath();	 Catch:{ all -> 0x00b3 }
        r0 = mIsCloningExperimentEnabled;	 Catch:{ all -> 0x00b3 }
        install(r1, r0, r10);	 Catch:{ all -> 0x00b3 }
        mCrashDirectory = r2;	 Catch:{ all -> 0x00b3 }
        r4 = getMinidumpFlags();	 Catch:{ all -> 0x00b3 }
        r0 = 2;	 Catch:{ all -> 0x00b3 }
        r4 = r4 | r0;	 Catch:{ all -> 0x00b3 }
        r0 = 4;	 Catch:{ all -> 0x00b3 }
        r4 = r4 | r0;	 Catch:{ all -> 0x00b3 }
        setMinidumpFlags(r4);	 Catch:{ all -> 0x00b3 }
        r0 = mIsUnifiedCustomDataEnabled;	 Catch:{ all -> 0x00b3 }
        if (r0 == 0) goto L_0x006e;	 Catch:{ all -> 0x00b3 }
    L_0x0036:
        r6 = X.AnonymousClass0DN.f1864B;	 Catch:{ all -> 0x00b3 }
        r5 = new X.0A0;	 Catch:{ all -> 0x00b3 }
        r5.<init>();	 Catch:{ all -> 0x00b3 }
        monitor-enter(r6);	 Catch:{ all -> 0x00b3 }
        r0 = X.AnonymousClass0DO.f1865B;	 Catch:{ all -> 0x00b6 }
        r0 = r0.wR();	 Catch:{ all -> 0x00b6 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00b6 }
        r4 = r0.iterator();	 Catch:{ all -> 0x00b6 }
    L_0x004c:
        r0 = r4.hasNext();	 Catch:{ all -> 0x00b6 }
        if (r0 == 0) goto L_0x006b;	 Catch:{ all -> 0x00b6 }
    L_0x0052:
        r0 = r4.next();	 Catch:{ all -> 0x00b6 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00b6 }
        r2 = r0.getKey();	 Catch:{ all -> 0x00b6 }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x00b6 }
        r1 = r0.getValue();	 Catch:{ all -> 0x00b6 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x00b6 }
        r0 = 0;	 Catch:{ all -> 0x00b6 }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x00b6 }
        r5.YNA(r2, r1, r0);	 Catch:{ all -> 0x00b6 }
        goto L_0x004c;	 Catch:{ all -> 0x00b6 }
    L_0x006b:
        X.AnonymousClass0DO.f1865B = r5;	 Catch:{ all -> 0x00b6 }
        monitor-exit(r6);	 Catch:{ all -> 0x00b3 }
    L_0x006e:
        r1 = r8.getPackageManager();	 Catch:{ all -> 0x00b3 }
        if (r1 == 0) goto L_0x009f;	 Catch:{ all -> 0x00b3 }
    L_0x0074:
        r0 = r8.getPackageName();	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
        r2 = r1.getPackageInfo(r0, r3);	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
        r1 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
        r0 = r2.versionName;	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
        if (r0 == 0) goto L_0x0085;	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
    L_0x0082:
        r0 = r2.versionName;	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
        goto L_0x0087;	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
    L_0x0085:
        r0 = "unknown";	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
    L_0x0087:
        setVersionInfo(r1, r0);	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
        goto L_0x009f;	 Catch:{ NameNotFoundException -> 0x008b, RuntimeException -> 0x009f }
    L_0x008b:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b3 }
        r1.<init>();	 Catch:{ all -> 0x00b3 }
        r0 = "Failed to find PackageInfo for current App : ";	 Catch:{ all -> 0x00b3 }
        r1.append(r0);	 Catch:{ all -> 0x00b3 }
        r0 = r8.getPackageName();	 Catch:{ all -> 0x00b3 }
        r1.append(r0);	 Catch:{ all -> 0x00b3 }
        r1.toString();	 Catch:{ all -> 0x00b3 }
    L_0x009f:
        r2 = "Fingerprint";	 Catch:{ all -> 0x00b3 }
        r1 = android.os.Build.FINGERPRINT;	 Catch:{ all -> 0x00b3 }
        r0 = new java.lang.Object[r3];	 Catch:{ all -> 0x00b3 }
        setCustomData(r2, r1, r0);	 Catch:{ all -> 0x00b3 }
        goto L_0x00b1;	 Catch:{ all -> 0x00b3 }
    L_0x00a9:
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x00b3 }
        r0 = "Breakpad init failed to create crash directory: minidumps";	 Catch:{ all -> 0x00b3 }
        r1.<init>(r0);	 Catch:{ all -> 0x00b3 }
        throw r1;	 Catch:{ all -> 0x00b3 }
    L_0x00b1:
        monitor-exit(r7);
        return;
    L_0x00b3:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x00b6:
        r0 = move-exception;	 Catch:{ all -> 0x00b3 }
        monitor-exit(r6);	 Catch:{ all -> 0x00b3 }
        throw r0;	 Catch:{ all -> 0x00b3 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.breakpad.BreakpadManager.start(android.content.Context, int, int):void");
    }
}
