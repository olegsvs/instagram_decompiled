package com.facebook.common.dextricks;

import X.AnonymousClass0A4;
import android.content.Context;
import android.util.Log;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import dalvik.system.DexFile;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class MultiDexClassLoaderJava extends MultiDexClassLoader {
    private static final byte API_FALLBACK = (byte) 3;
    private static final byte API_NEW_WORKS = (byte) 1;
    private static final byte API_OLD_WORKS = (byte) 2;
    private static final byte API_UNTESTED = (byte) 0;
    private static final int HIGH_WATER_MARK_CLASS_NAME_LEN_RENAME = 6;
    private static byte sApiDetectionState;
    private final DexFile[] mAuxiliaryDexes;
    private final ClassLoadingStats mClassLoadingStats;
    private DexFile[] mDexFiles = new DexFile[0];
    private final String[] mDexLoadFailureHistory = new String[4];
    private int mDexLoadFailurePosition;
    private final AtomicInteger mLastLoadedDexIndex = new AtomicInteger(1);
    private final DexFile[] mPrimaryDexes;

    private static int getFixedDexIndex(int i, int i2) {
        return (i2 + i) + 1;
    }

    public void onColdstartDone() {
    }

    public String toString() {
        return "MultiDexClassLoaderJava";
    }

    public MultiDexClassLoaderJava(Context context, ArrayList arrayList, ArrayList arrayList2) {
        this.mPrimaryDexes = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        this.mAuxiliaryDexes = (DexFile[]) arrayList2.toArray(new DexFile[arrayList2.size()]);
        this.mClassLoadingStats = ClassLoadingStats.m2805C(new AnonymousClass0A4());
    }

    private boolean canPromoteDexesAndUpdateState(int i, int i2) {
        if (i2 <= i) {
            return false;
        }
        int i3;
        do {
            i3 = this.mLastLoadedDexIndex.get();
            if (i3 >= i) {
                break;
            }
        } while (!this.mLastLoadedDexIndex.compareAndSet(i3, i));
        return true;
    }

    public void configure(Configuration configuration) {
        super.configure(configuration);
        int length = this.mPrimaryDexes.length;
        int size = configuration.mDexFiles.size();
        int length2 = this.mAuxiliaryDexes.length;
        int i = (length + size) + length2;
        DexFile[] dexFileArr = new DexFile[((i * 2) + 1)];
        this.mDexFiles = dexFileArr;
        int i2 = 0;
        dexFileArr[0] = null;
        int i3 = 0;
        int i4 = 1;
        while (i3 < length) {
            DexFile dexFile = this.mPrimaryDexes[i3];
            dexFileArr = this.mDexFiles;
            dexFileArr[i4] = dexFile;
            dexFileArr[i4 + i] = dexFile;
            i3++;
            i4++;
        }
        i3 = 0;
        while (i3 < size) {
            dexFile = (DexFile) configuration.mDexFiles.get(i3);
            dexFileArr = this.mDexFiles;
            dexFileArr[i4] = dexFile;
            dexFileArr[i4 + i] = dexFile;
            i3++;
            i4++;
        }
        while (i2 < length2) {
            dexFile = this.mAuxiliaryDexes[i2];
            dexFileArr = this.mDexFiles;
            dexFileArr[i4] = dexFile;
            dexFileArr[i4 + i] = dexFile;
            i2++;
            i4++;
        }
        configureArtHacks(configuration);
    }

    public DexFile[] doGetConfiguredDexFiles() {
        DexFile[] dexFileArr = this.mDexFiles;
        int dexLength = getDexLength(dexFileArr);
        DexFile[] dexFileArr2 = new DexFile[dexLength];
        for (int i = 0; i < dexLength; i++) {
            dexFileArr2[i] = dexFileArr[getFixedDexIndex(i, dexLength)];
        }
        return dexFileArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Class findClass(java.lang.String r5) {
        /*
        r4 = this;
        r3 = r4.mDexFiles;
        r2 = r3.length;
        com.facebook.profilo.logger.api.ProfiloLogger.classLoadStart();
        com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.beginClassLoad(r5);
        r0 = r4.mClassLoadingStats;
        r0.incrementClassLoadsAttempted();
        r1 = 0;
        r0 = sApiDetectionState;	 Catch:{ all -> 0x0071 }
        switch(r0) {
            case 0: goto L_0x004a;
            case 1: goto L_0x0037;
            case 2: goto L_0x0026;
            case 3: goto L_0x0015;
            default: goto L_0x0014;
        };	 Catch:{ all -> 0x0071 }
    L_0x0014:
        goto L_0x004e;
    L_0x0015:
        r0 = r4.mLastLoadedDexIndex;	 Catch:{ all -> 0x0071 }
        r0 = r0.get();	 Catch:{ all -> 0x0071 }
        r1 = r4.loadInnerFallbackApiClass(r5, r3, r0);	 Catch:{ all -> 0x0071 }
        if (r1 != 0) goto L_0x004e;
    L_0x0021:
        r1 = r4.loadInnerFallbackApiClass(r5, r3, r2);	 Catch:{ all -> 0x0048 }
        goto L_0x004e;
    L_0x0026:
        r0 = r4.mLastLoadedDexIndex;	 Catch:{ all -> 0x0071 }
        r0 = r0.get();	 Catch:{ all -> 0x0071 }
        r1 = r4.loadInnerOldApiClass(r5, r3, r0);	 Catch:{ all -> 0x0071 }
        if (r1 != 0) goto L_0x004e;
    L_0x0032:
        r1 = r4.loadInnerOldApiClass(r5, r3, r2);	 Catch:{ all -> 0x0048 }
        goto L_0x004e;
    L_0x0037:
        r0 = r4.mLastLoadedDexIndex;	 Catch:{ all -> 0x0071 }
        r0 = r0.get();	 Catch:{ all -> 0x0071 }
        r1 = r4.loadInnerNewApiClass(r5, r3, r0);	 Catch:{ all -> 0x0071 }
        if (r1 != 0) goto L_0x004e;
    L_0x0043:
        r1 = r4.loadInnerNewApiClass(r5, r3, r2);	 Catch:{ all -> 0x0048 }
        goto L_0x004e;
    L_0x0048:
        r1 = move-exception;
        goto L_0x0072;
    L_0x004a:
        r1 = r4.findClassSlowPath(r5);	 Catch:{ all -> 0x0071 }
    L_0x004e:
        if (r1 == 0) goto L_0x0060;
    L_0x0050:
        com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.classLoaded(r1);
        r0 = com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger.f100B;
        if (r0 == 0) goto L_0x005c;
    L_0x0057:
        r0 = com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger.f101C;
        r0.add(r1);
    L_0x005c:
        com.facebook.profilo.logger.api.ProfiloLogger.classLoadEnd(r1);
        goto L_0x006b;
    L_0x0060:
        com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.classNotFound();
        com.facebook.profilo.logger.api.ProfiloLogger.classLoadFailed();
        r0 = r4.mClassLoadingStats;
        r0.incrementClassLoadsFailed();
    L_0x006b:
        if (r1 == 0) goto L_0x006e;
    L_0x006d:
        return r1;
    L_0x006e:
        r0 = com.facebook.common.dextricks.MultiDexClassLoader.PREFAB_CLASSNOTFOUND_EXCEPTION;
        throw r0;
    L_0x0071:
        r1 = move-exception;
    L_0x0072:
        com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.classNotFound();
        com.facebook.profilo.logger.api.ProfiloLogger.classLoadFailed();
        r0 = r4.mClassLoadingStats;
        r0.incrementClassLoadsFailed();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderJava.findClass(java.lang.String):java.lang.Class");
    }

    private java.lang.Class findClassSlowPath(java.lang.String r9) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r8 = this;
        r5 = r8.mDexFiles;
        r0 = r5.length;
        r6 = 0;
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return r6;
    L_0x0007:
        r4 = r5.length;
        r3 = r8.mPutativeLoader;
        r7 = 0;
        r2 = 1;
        r0 = r5[r7];	 Catch:{ NoSuchMethodError -> 0x0030 }
        if (r0 == 0) goto L_0x0015;	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x0010:
        r6 = com.facebook.common.dextricks.DexFileLoadNew.loadClassBinaryName(r0, r9, r3);	 Catch:{ NoSuchMethodError -> 0x0030 }
        goto L_0x0018;	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x0015:
        r8.onNoDexInThePromotedFrontDexSpot();	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x0018:
        r1 = 1;	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x0019:
        if (r6 != 0) goto L_0x0026;	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x001b:
        if (r1 >= r4) goto L_0x0026;	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x001d:
        r0 = r5[r1];	 Catch:{ NoSuchMethodError -> 0x0030 }
        r6 = com.facebook.common.dextricks.DexFileLoadNew.loadClassBinaryName(r0, r9, r3);	 Catch:{ NoSuchMethodError -> 0x0030 }
        r1 = r1 + 1;	 Catch:{ NoSuchMethodError -> 0x0030 }
        goto L_0x0019;	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x0026:
        if (r4 <= r2) goto L_0x002a;	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x0028:
        sApiDetectionState = r2;	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x002a:
        r0 = r8.mClassLoadingStats;	 Catch:{ NoSuchMethodError -> 0x0030 }
        r0.incrementDexFileQueries(r1);	 Catch:{ NoSuchMethodError -> 0x0030 }
        goto L_0x0006;	 Catch:{ NoSuchMethodError -> 0x0030 }
    L_0x0030:
        r0 = r5[r7];	 Catch:{ NoSuchMethodError -> 0x0053 }
        if (r0 == 0) goto L_0x0039;	 Catch:{ NoSuchMethodError -> 0x0053 }
    L_0x0034:
        r6 = com.facebook.common.dextricks.DexFileLoadOld.loadClassBinaryName(r0, r9, r3);	 Catch:{ NoSuchMethodError -> 0x0053 }
        goto L_0x003c;	 Catch:{ NoSuchMethodError -> 0x0053 }
    L_0x0039:
        r8.onNoDexInThePromotedFrontDexSpot();	 Catch:{ NoSuchMethodError -> 0x0053 }
    L_0x003c:
        r1 = 1;	 Catch:{ NoSuchMethodError -> 0x0053 }
    L_0x003d:
        if (r6 != 0) goto L_0x004a;	 Catch:{ NoSuchMethodError -> 0x0053 }
    L_0x003f:
        if (r1 >= r4) goto L_0x004a;	 Catch:{ NoSuchMethodError -> 0x0053 }
    L_0x0041:
        r0 = r5[r1];	 Catch:{ NoSuchMethodError -> 0x0053 }
        r6 = com.facebook.common.dextricks.DexFileLoadOld.loadClassBinaryName(r0, r9, r3);	 Catch:{ NoSuchMethodError -> 0x0053 }
        r1 = r1 + 1;	 Catch:{ NoSuchMethodError -> 0x0053 }
        goto L_0x003d;	 Catch:{ NoSuchMethodError -> 0x0053 }
    L_0x004a:
        r0 = 2;	 Catch:{ NoSuchMethodError -> 0x0053 }
        sApiDetectionState = r0;	 Catch:{ NoSuchMethodError -> 0x0053 }
        r0 = r8.mClassLoadingStats;	 Catch:{ NoSuchMethodError -> 0x0053 }
        r0.incrementDexFileQueries(r1);	 Catch:{ NoSuchMethodError -> 0x0053 }
        goto L_0x0006;	 Catch:{ NoSuchMethodError -> 0x0053 }
    L_0x0053:
        r0 = 3;
        sApiDetectionState = r0;
        r0 = r5[r7];
        if (r0 == 0) goto L_0x005f;
    L_0x005a:
        r6 = r0.loadClass(r9, r3);
        goto L_0x0062;
    L_0x005f:
        r8.onNoDexInThePromotedFrontDexSpot();
    L_0x0062:
        if (r6 != 0) goto L_0x006f;
    L_0x0064:
        if (r2 >= r4) goto L_0x006f;
    L_0x0066:
        r0 = r5[r2];
        r6 = r0.loadClass(r9, r3);
        r2 = r2 + 1;
        goto L_0x0062;
    L_0x006f:
        r0 = r8.mClassLoadingStats;
        r0.incrementDexFileQueries(r2);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderJava.findClassSlowPath(java.lang.String):java.lang.Class");
    }

    private static int getDexLength(DexFile[] dexFileArr) {
        return (dexFileArr.length - 1) / 2;
    }

    private static int getFirstIndexOfFixedDexes(DexFile[] dexFileArr) {
        return (dexFileArr.length + 1) / 2;
    }

    public String[] getRecentFailedClasses() {
        String[] strArr = this.mDexLoadFailureHistory;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            if (i < length) {
                i += length;
            }
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                strArr2[i2] = strArr[(i - i3) % length];
                i2 = i3;
            }
        }
        return strArr2;
    }

    public Class loadClass(String str, boolean z) {
        if (shouldAskParent(str)) {
            Object obj = 1;
            Class loadParentBootLoaderClass = loadParentBootLoaderClass(str);
            if (loadParentBootLoaderClass != null) {
                return loadParentBootLoaderClass;
            }
        }
        obj = null;
        try {
            return findClass(str);
        } catch (ClassNotFoundException e) {
            if (obj == null && oldShouldAskBootClassLoader(str)) {
                Class loadParentBootLoaderClass2 = loadParentBootLoaderClass(str);
                if (loadParentBootLoaderClass2 != null) {
                    this.mClassLoadingStats.incrementIncorrectDfaGuesses();
                    String str2 = MultiDexClassLoader.TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Class ");
                    stringBuilder.append(str);
                    stringBuilder.append(" was loaded on fallback. ");
                    stringBuilder.append("This should be fixed and added to the shouldAskParent method.");
                    Log.w(str2, stringBuilder.toString());
                    return loadParentBootLoaderClass2;
                }
            }
            noteClassLoadFailure(str);
            throw e;
        }
    }

    private Class loadInnerFallbackApiClass(String str, DexFile[] dexFileArr, int i) {
        Throwable th;
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            DexFile dexFile = dexFileArr[0];
            if (dexFile != null) {
                cls = dexFile.loadClass(str, classLoader);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    dexFile = dexFileArr[i3];
                    cls = dexFile.loadClass(str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile, i3);
                    }
                    i3++;
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i3;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th3) {
            th = th3;
            this.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }

    private Class loadInnerNewApiClass(String str, DexFile[] dexFileArr, int i) {
        Throwable th;
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            DexFile dexFile = dexFileArr[0];
            if (dexFile != null) {
                cls = DexFileLoadNew.loadClassBinaryName(dexFile, str, classLoader);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    dexFile = dexFileArr[i3];
                    cls = DexFileLoadNew.loadClassBinaryName(dexFile, str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile, i3);
                    }
                    i3++;
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i3;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th3) {
            th = th3;
            this.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }

    private Class loadInnerOldApiClass(String str, DexFile[] dexFileArr, int i) {
        Throwable th;
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            DexFile dexFile = dexFileArr[0];
            if (dexFile != null) {
                cls = DexFileLoadOld.loadClassBinaryName(dexFile, str, classLoader);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    dexFile = dexFileArr[i3];
                    cls = DexFileLoadOld.loadClassBinaryName(dexFile, str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile, i3);
                    }
                    i3++;
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i3;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th3) {
            th = th3;
            this.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }

    private java.lang.Class loadParentBootLoaderClass(java.lang.String r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.getParent();
        if (r0 == 0) goto L_0x000f;
    L_0x0006:
        r0 = r1.getParent();	 Catch:{ ClassNotFoundException -> 0x000f }
        r0 = r0.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x000f }
        return r0;	 Catch:{ ClassNotFoundException -> 0x000f }
    L_0x000f:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderJava.loadParentBootLoaderClass(java.lang.String):java.lang.Class");
    }

    private void noteClassLoadFailure(String str) {
        String[] strArr = this.mDexLoadFailureHistory;
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            this.mDexLoadFailurePosition = i + 1;
            strArr[i % strArr.length] = str;
        }
    }

    private boolean oldShouldAskBootClassLoader(String str) {
        return str.startsWith("com.facebook.") ^ 1;
    }

    private void onNoDexInThePromotedFrontDexSpot() {
        this.mClassLoadingStats.decrementDexFileQueries();
    }

    private void promoteDexFile(DexFile dexFile, int i) {
        DexFile[] dexFileArr = this.mDexFiles;
        if (canPromoteDexesAndUpdateState(i, getFirstIndexOfFixedDexes(dexFileArr))) {
            synchronized (this.mDexFiles) {
                if (dexFileArr[1] != dexFile && dexFileArr[i] == dexFile) {
                    dexFileArr[0] = dexFile;
                    while (i >= 1) {
                        dexFileArr[i] = dexFileArr[i - 1];
                        i--;
                    }
                    dexFileArr[0] = null;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean shouldAskParent(java.lang.String r14) {
        /*
        r4 = 0;
        r8 = r14.length();	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        r9 = 6;
        if (r8 > r9) goto L_0x0009;
    L_0x0008:
        return r4;
    L_0x0009:
        r13 = r14.charAt(r4);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        r10 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r12 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r7 = 12;
        r6 = 8;
        r5 = 46;
        r3 = 97;
        r2 = 1;
        if (r13 == r3) goto L_0x00b3;
    L_0x001c:
        r1 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        if (r13 == r1) goto L_0x00a9;
    L_0x0020:
        r0 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r13 == r0) goto L_0x006d;
    L_0x0024:
        r0 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r11 = 4;
        r10 = 5;
        if (r13 == r0) goto L_0x0078;
    L_0x002a:
        if (r13 == r12) goto L_0x006e;
    L_0x002c:
        switch(r13) {
            case 99: goto L_0x0034;
            case 100: goto L_0x0030;
            default: goto L_0x002f;
        };	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
    L_0x002f:
        goto L_0x0008;
    L_0x0030:
        if (r8 < r6) goto L_0x0008;
    L_0x0032:
        r4 = 1;
        goto L_0x0008;
    L_0x0034:
        r0 = 29;
        r6 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r8 < r0) goto L_0x005f;
    L_0x003a:
        r0 = r14.charAt(r11);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r3) goto L_0x005f;
    L_0x0040:
        r0 = r14.charAt(r10);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r6) goto L_0x005f;
    L_0x0046:
        r1 = r14.charAt(r7);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        r0 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r1 != r0) goto L_0x005f;
    L_0x004e:
        r0 = 27;
        r0 = r14.charAt(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r5) goto L_0x005f;
    L_0x0056:
        r0 = "om.android.installreferrer.";
        r0 = r14.startsWith(r0, r2);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        r0 = r0 ^ 1;
        return r0;
    L_0x005f:
        if (r8 < r9) goto L_0x0008;
    L_0x0061:
        r0 = r14.charAt(r11);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r3) goto L_0x0008;
    L_0x0067:
        r0 = r14.charAt(r10);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r6) goto L_0x0008;
    L_0x006d:
        return r2;
    L_0x006e:
        if (r8 < r10) goto L_0x0008;
    L_0x0070:
        r0 = 3;
        r0 = r14.charAt(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r5) goto L_0x0008;
    L_0x0077:
        goto L_0x0032;
    L_0x0078:
        if (r8 >= r9) goto L_0x007b;
    L_0x007a:
        goto L_0x0008;
    L_0x007b:
        r0 = r14.charAt(r11);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 == r3) goto L_0x0090;
    L_0x0081:
        if (r0 == r1) goto L_0x006d;
    L_0x0083:
        switch(r0) {
            case 119: goto L_0x0087;
            case 120: goto L_0x006d;
            default: goto L_0x0086;
        };	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
    L_0x0086:
        goto L_0x0008;
    L_0x0087:
        r1 = r14.charAt(r10);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        r0 = 51;
        if (r1 != r0) goto L_0x0008;
    L_0x008f:
        goto L_0x0032;
    L_0x0090:
        if (r8 < r7) goto L_0x0008;
    L_0x0092:
        r1 = r14.charAt(r10);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        r0 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        if (r1 != r0) goto L_0x0008;
    L_0x009a:
        r0 = r14.charAt(r9);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r3) goto L_0x0008;
    L_0x00a0:
        r0 = 10;
        r0 = r14.charAt(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r5) goto L_0x0008;
    L_0x00a8:
        goto L_0x0032;
    L_0x00a9:
        r0 = r14.charAt(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 == r3) goto L_0x006d;
    L_0x00af:
        if (r0 == r10) goto L_0x006d;
    L_0x00b1:
        goto L_0x0008;
    L_0x00b3:
        r1 = 16;
        if (r8 < r1) goto L_0x00e6;
    L_0x00b7:
        r0 = r14.charAt(r6);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r12) goto L_0x00e6;
    L_0x00bd:
        r0 = 9;
        r0 = r14.charAt(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r10) goto L_0x00e6;
    L_0x00c5:
        r0 = 15;
        r0 = r14.charAt(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r5) goto L_0x00e6;
    L_0x00cd:
        r0 = 7;
        r0 = r14.charAt(r0);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r5) goto L_0x00e6;
    L_0x00d4:
        r0 = "ndroid.support";
        r0 = r14.startsWith(r0, r2);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 == 0) goto L_0x0032;
    L_0x00dc:
        r0 = "test.";
        r0 = r14.startsWith(r0, r1);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 == 0) goto L_0x0008;
    L_0x00e4:
        goto L_0x0032;
    L_0x00e6:
        r0 = 13;
        if (r8 < r0) goto L_0x006d;
    L_0x00ea:
        r0 = r14.charAt(r6);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r3) goto L_0x006d;
    L_0x00f0:
        r0 = r14.charAt(r7);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        if (r0 != r5) goto L_0x006d;
    L_0x00f6:
        r0 = "ndroid.arch.";
        r0 = r14.startsWith(r0, r2);	 Catch:{ IndexOutOfBoundsException -> 0x00ff }
        r0 = r0 ^ 1;
        return r0;
    L_0x00ff:
        r3 = move-exception;
        r2 = "MultiDexClassLoader";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Class out of bounds: ";
        r1.append(r0);
        r1.append(r14);
        r0 = r1.toString();
        android.util.Log.e(r2, r0, r3);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoaderJava.shouldAskParent(java.lang.String):boolean");
    }
}
