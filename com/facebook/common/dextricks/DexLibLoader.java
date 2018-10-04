package com.facebook.common.dextricks;

import X.AnonymousClass00i;
import X.AnonymousClass00r;
import X.AnonymousClass09y;
import X.AnonymousClass0Db;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import com.facebook.common.dextricks.DexManifest.Dex;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class DexLibLoader {
    public static final int LOAD_ALL_ASYNC_OPTIMIZATION = 4;
    public static final int LOAD_ALL_BETA_BUILD = 1;
    public static final int LOAD_ALL_OPEN_ONLY = 2;
    public static final int LOAD_SECONDARY = 8;
    public static boolean deoptTaint;
    private static DexErrorRecoveryInfo mDeri;
    private static DexStore sMainDexStore;

    public final class ApkResProvider extends ResProvider {
        private static final String SECONDARY_PROGRAM_DEX_JARS = "secondary-program-dex-jars";
        private ZipFile mApkZip;
        private final Context mContext;

        public ApkResProvider(Context context) {
            this.mContext = context;
        }

        public void close() {
            Fs.safeClose(this.mApkZip);
        }

        public void markRootRelative() {
            if (this.mApkZip == null) {
                this.mApkZip = new ZipFile(this.mContext.getApplicationInfo().sourceDir);
            }
        }

        public InputStream open(String str) {
            StringBuilder stringBuilder;
            if (this.mApkZip != null) {
                if (!DexStore.SECONDARY_DEX_MANIFEST.equals(str)) {
                    ZipEntry entry = this.mApkZip.getEntry(str);
                    if (entry != null) {
                        return this.mApkZip.getInputStream(entry);
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("cannot find root-relative resource: ");
                    stringBuilder.append(str);
                    throw new FileNotFoundException(stringBuilder.toString());
                }
            }
            AssetManager assets = this.mContext.getAssets();
            stringBuilder = new StringBuilder();
            stringBuilder.append("secondary-program-dex-jars/");
            stringBuilder.append(str);
            return assets.open(stringBuilder.toString());
        }
    }

    public final class ApkRootResProvider extends ResProvider {
        private static Method mOpenNonAssetMethod;
        private final Context mContext;

        private ApkRootResProvider(Context context) {
            if (mOpenNonAssetMethod == null) {
                mOpenNonAssetMethod = AssetManager.class.getMethod("openNonAsset", new Class[]{String.class});
            }
            this.mContext = context;
        }

        public InputStream open(String str) {
            Throwable e;
            try {
                return (InputStream) mOpenNonAssetMethod.invoke(this.mContext.getAssets(), new Object[]{str});
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (Throwable e3) {
                e2 = e3.getCause();
                if (e2 instanceof RuntimeException) {
                    throw ((RuntimeException) e2);
                } else if (e2 instanceof IOException) {
                    throw ((IOException) e2);
                } else {
                    throw new RuntimeException(e3);
                }
            }
        }
    }

    public final class ExoPackageResProvider extends ResProvider {
        private static final String EXOPACKAGE_DIR = "/data/local/tmp/exopackage";
        private final File mDirectory;

        public ExoPackageResProvider(Context context) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/data/local/tmp/exopackage/");
            stringBuilder.append(context.getPackageName());
            stringBuilder.append("/secondary-dex");
            this.mDirectory = new File(stringBuilder.toString());
        }

        public InputStream open(String str) {
            return new FileInputStream(new File(this.mDirectory, str));
        }
    }

    public static synchronized long getLastCompilationTime(Context context) {
        long j;
        synchronized (DexLibLoader.class) {
            j = 0;
            if (sMainDexStore != null) {
                j = sMainDexStore.getLastRegenTime();
            }
        }
        return j;
    }

    public static synchronized DexStore getMainDexStore() {
        DexStore dexStore;
        synchronized (DexLibLoader.class) {
            if (sMainDexStore != null) {
                dexStore = sMainDexStore;
            } else {
                throw new IllegalStateException("main dex store not loaded");
            }
        }
        return dexStore;
    }

    public static DexErrorRecoveryInfo getMainDexStoreLoadInformation() {
        DexErrorRecoveryInfo dexErrorRecoveryInfo = mDeri;
        if (dexErrorRecoveryInfo != null) {
            return dexErrorRecoveryInfo;
        }
        throw new AssertionError("main dex store not yet loaded");
    }

    private static boolean inCtScanOptMode() {
        return AnonymousClass00r.f103C;
    }

    private static void learnApplicationDexFiles(Context context, ClassLoader classLoader, ArrayList arrayList, ArrayList arrayList2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            declaredField = Class.forName("dalvik.system.DexPathList").getDeclaredField("dexElements");
            declaredField.setAccessible(true);
            Object[] objArr = (Object[]) declaredField.get(obj);
            Field declaredField2 = Class.forName("dalvik.system.DexPathList$Element").getDeclaredField("dexFile");
            declaredField2.setAccessible(true);
            Mlog.m50d("primary dex name: %s", context.getApplicationInfo().sourceDir);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : objArr) {
                DexFile dexFile = (DexFile) declaredField2.get(obj2);
                if (r7.equals(dexFile.getName())) {
                    Mlog.m50d("Found primary dex %s", dexFile.getName());
                    arrayList.add(dexFile);
                } else {
                    Mlog.m50d("Found system/other dex %s", dexFile.getName());
                    arrayList2.add(dexFile);
                }
            }
            Mlog.m50d("Setup multi dex took %d ms.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            Mlog.m50d("Setup multi dex took %d ms.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public static void loadAll(Context context) {
        loadAll(context, false);
    }

    public static synchronized void loadAll(Context context, int i, AnonymousClass00i anonymousClass00i) {
        synchronized (DexLibLoader.class) {
            if (mDeri == null) {
                if (anonymousClass00i == null) {
                    anonymousClass00i = new AnonymousClass09y();
                }
                try {
                    mDeri = loadAllImpl(context, i, anonymousClass00i);
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            throw new AssertionError("loadAll already loaded dex files");
        }
    }

    public static void loadAll(Context context, boolean z) {
        loadAll(context, z, null);
    }

    public static void loadAll(Context context, boolean z, AnonymousClass00i anonymousClass00i) {
        loadAll(context, 1, anonymousClass00i);
    }

    private static com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllImpl(android.content.Context r15, int r16, X.AnonymousClass00i r17) {
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
        r14 = r16 & 1;
        r6 = 1;
        r5 = 0;
        if (r14 == 0) goto L_0x0008;
    L_0x0006:
        r3 = 1;
        goto L_0x0009;
    L_0x0008:
        r3 = 0;
    L_0x0009:
        r2 = "DLL.loadAll betaBuild:%s flags:0x%08x";
        r11 = 2;
        r1 = new java.lang.Object[r11];
        r0 = java.lang.Boolean.valueOf(r3);
        r1[r5] = r0;
        r0 = java.lang.Integer.valueOf(r16);
        r1[r6] = r0;
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);
        r10 = new java.util.ArrayList;
        r10.<init>();
        r9 = new java.util.ArrayList;
        r9.<init>();
        r0 = com.facebook.common.dextricks.DexLibLoader.class;	 Catch:{ Exception -> 0x0031 }
        r0 = r0.getClassLoader();	 Catch:{ Exception -> 0x0031 }
        learnApplicationDexFiles(r15, r0, r10, r9);	 Catch:{ Exception -> 0x0031 }
        goto L_0x0041;	 Catch:{ Exception -> 0x0031 }
    L_0x0031:
        r2 = move-exception;
        r1 = "failure to locate primary/auxiliary dexes: perf loss";
        r0 = new java.lang.Object[r6];
        r0[r5] = r2;
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);
        r10.clear();
        r9.clear();
    L_0x0041:
        r1 = "DLL2_load_main";
        r0 = 8912897; // 0x880001 float:1.2489629E-38 double:4.403556E-317;
        r8 = r17;
        r13 = r8.mo28A(r1, r0);
        r0 = 0;
        r1 = r15.getApplicationInfo();	 Catch:{ Throwable -> 0x0152 }
        r7 = r1.dataDir;	 Catch:{ Throwable -> 0x0152 }
        r4 = com.facebook.common.dextricks.DalvikInternals.realpath(r7);	 Catch:{ Throwable -> 0x0152 }
        r12 = new java.io.File;	 Catch:{ Throwable -> 0x0152 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0152 }
        r2.<init>();	 Catch:{ Throwable -> 0x0152 }
        r2.append(r4);	 Catch:{ Throwable -> 0x0152 }
        r1 = "/app_secondary_program_dex";	 Catch:{ Throwable -> 0x0152 }
        r2.append(r1);	 Catch:{ Throwable -> 0x0152 }
        r1 = r2.toString();	 Catch:{ Throwable -> 0x0152 }
        r12.<init>(r1);	 Catch:{ Throwable -> 0x0152 }
        com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r12);	 Catch:{ Throwable -> 0x0152 }
        r12 = new java.io.File;	 Catch:{ Throwable -> 0x0152 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0152 }
        r2.<init>();	 Catch:{ Throwable -> 0x0152 }
        r2.append(r4);	 Catch:{ Throwable -> 0x0152 }
        r1 = "/app_secondary_program_dex_opt";	 Catch:{ Throwable -> 0x0152 }
        r2.append(r1);	 Catch:{ Throwable -> 0x0152 }
        r1 = r2.toString();	 Catch:{ Throwable -> 0x0152 }
        r12.<init>(r1);	 Catch:{ Throwable -> 0x0152 }
        com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r12);	 Catch:{ Throwable -> 0x0152 }
        r1 = r7.equals(r4);	 Catch:{ Throwable -> 0x0152 }
        if (r1 != 0) goto L_0x009a;	 Catch:{ Throwable -> 0x0152 }
    L_0x008f:
        r2 = "resolved non-canonical data directory %s to %s";	 Catch:{ Throwable -> 0x0152 }
        r1 = new java.lang.Object[r11];	 Catch:{ Throwable -> 0x0152 }
        r1[r5] = r7;	 Catch:{ Throwable -> 0x0152 }
        r1[r6] = r4;	 Catch:{ Throwable -> 0x0152 }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ Throwable -> 0x0152 }
    L_0x009a:
        r7 = new java.io.File;	 Catch:{ Throwable -> 0x0152 }
        r1 = "dex";	 Catch:{ Throwable -> 0x0152 }
        r7.<init>(r4, r1);	 Catch:{ Throwable -> 0x0152 }
        r4 = new java.io.File;	 Catch:{ Throwable -> 0x0152 }
        r1 = r15.getApplicationInfo();	 Catch:{ Throwable -> 0x0152 }
        r1 = r1.sourceDir;	 Catch:{ Throwable -> 0x0152 }
        r4.<init>(r1);	 Catch:{ Throwable -> 0x0152 }
        r3 = obtainResProvider(r8, r15, r3);	 Catch:{ Throwable -> 0x0152 }
        if (r3 != 0) goto L_0x00c4;	 Catch:{ Throwable -> 0x0152 }
    L_0x00b2:
        r2 = "Nothing to do in DexLibLoader.loadAll: no resProvider";	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r4 = new com.facebook.common.dextricks.DexErrorRecoveryInfo;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r4.<init>();	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        if (r13 == 0) goto L_0x00c3;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00c0:
        r13.close();
    L_0x00c3:
        return r4;
    L_0x00c4:
        r2 = "opening dex store %s";	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1[r5] = r7;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r7 = com.facebook.common.dextricks.DexStore.open(r7, r4, r3, r10, r9);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        sMainDexStore = r7;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = r16 & 2;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        if (r1 != 0) goto L_0x012c;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00d7:
        if (r14 == 0) goto L_0x00db;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00d9:
        r4 = 1;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        goto L_0x00dc;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00db:
        r4 = 0;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00dc:
        r1 = r16 & 8;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        if (r1 == 0) goto L_0x00e2;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00e0:
        r4 = r4 | 16;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00e2:
        r1 = r16 & 4;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        if (r1 == 0) goto L_0x00e8;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00e6:
        r4 = r4 | 4;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00e8:
        r1 = shouldSynchronouslyGenerateOmniOat(r15);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        if (r1 == 0) goto L_0x010a;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00ee:
        r2 = "disabling background optimization";	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        com.facebook.common.dextricks.Mlog.m58w(r2, r1);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r4 = r4 & -5;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = 26;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        if (r2 < r1) goto L_0x0106;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x00fd:
        r1 = com.facebook.common.dextricks.DexStore.oatmealEnabled(r15);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        if (r1 == 0) goto L_0x0104;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x0103:
        goto L_0x0106;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x0104:
        r4 = r4 | r6;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        goto L_0x0108;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x0106:
        r4 = r4 & -2;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x0108:
        r4 = r4 | 8;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x010a:
        r4 = r7.loadAll(r4, r8, r15);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = r4.loadResult;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = r1 & 8;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        if (r1 == 0) goto L_0x0134;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x0114:
        r1 = inCtScanOptMode();	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        if (r1 != 0) goto L_0x0124;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x011a:
        r2 = "running deoptimized code";	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        deoptTaint = r6;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        goto L_0x0134;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x0124:
        r2 = new java.lang.IllegalStateException;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = "In ct-scan mode, but not running optimized code. Out of disk space? Bad config?";	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r2.<init>(r1);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        throw r2;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x012c:
        r2 = "skipping actual loadAll as requested";	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r1 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
        r4 = r0;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x0134:
        if (r3 == 0) goto L_0x0139;	 Catch:{ Throwable -> 0x013f, all -> 0x013c }
    L_0x0136:
        r3.close();	 Catch:{ Throwable -> 0x0152 }
    L_0x0139:
        if (r13 == 0) goto L_0x00c3;	 Catch:{ Throwable -> 0x0152 }
    L_0x013b:
        goto L_0x00c0;	 Catch:{ Throwable -> 0x0152 }
    L_0x013c:
        r2 = move-exception;
        r1 = r0;
        goto L_0x0142;
    L_0x013f:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0141 }
    L_0x0141:
        r2 = move-exception;
    L_0x0142:
        if (r3 == 0) goto L_0x014d;
    L_0x0144:
        if (r1 == 0) goto L_0x014a;
    L_0x0146:
        r3.close();	 Catch:{ Throwable -> 0x014d }
        goto L_0x014d;	 Catch:{ Throwable -> 0x014d }
    L_0x014a:
        r3.close();	 Catch:{ Throwable -> 0x0152 }
    L_0x014d:
        throw r2;	 Catch:{ Throwable -> 0x0152 }
    L_0x014e:
        r1 = move-exception;
        if (r13 == 0) goto L_0x015d;
    L_0x0151:
        goto L_0x0154;
    L_0x0152:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x014e }
    L_0x0154:
        if (r0 == 0) goto L_0x015a;	 Catch:{ all -> 0x014e }
    L_0x0156:
        r13.close();	 Catch:{ Throwable -> 0x015d }
        goto L_0x015d;	 Catch:{ Throwable -> 0x015d }
    L_0x015a:
        r13.close();
    L_0x015d:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexLibLoader.loadAllImpl(android.content.Context, int, X.00i):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    public static com.facebook.common.dextricks.ResProvider obtainResProvider(X.AnonymousClass00i r3, android.content.Context r4, boolean r5) {
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
        r1 = "DLL2_obtain_res_provider";
        r0 = 8912898; // 0x880002 float:1.248963E-38 double:4.4035567E-317;
        r3 = r3.mo28A(r1, r0);
        r2 = 0;
        r0 = obtainResProviderInternal(r4, r5);	 Catch:{ IOException -> 0x001a }
        if (r3 == 0) goto L_0x0013;	 Catch:{ IOException -> 0x001a }
    L_0x0010:
        r3.close();
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        if (r3 == 0) goto L_0x002b;
    L_0x0017:
        goto L_0x0022;
    L_0x0018:
        r2 = move-exception;
        goto L_0x0021;
    L_0x001a:
        r1 = move-exception;
        r0 = new java.lang.RuntimeException;	 Catch:{ Throwable -> 0x0018 }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x0018 }
        throw r0;	 Catch:{ Throwable -> 0x0018 }
    L_0x0021:
        throw r2;	 Catch:{ all -> 0x0014 }
    L_0x0022:
        if (r2 == 0) goto L_0x0028;	 Catch:{ all -> 0x0014 }
    L_0x0024:
        r3.close();	 Catch:{ Throwable -> 0x002b }
        goto L_0x002b;	 Catch:{ Throwable -> 0x002b }
    L_0x0028:
        r3.close();
    L_0x002b:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexLibLoader.obtainResProvider(X.00i, android.content.Context, boolean):com.facebook.common.dextricks.ResProvider");
    }

    private static com.facebook.common.dextricks.ResProvider obtainResProviderInternal(android.content.Context r5, boolean r6) {
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
        r1 = new com.facebook.common.dextricks.DexLibLoader$ApkResProvider;
        r4 = 0;
        r1.<init>(r5);
        r0 = "metadata.txt";	 Catch:{ NotFoundException -> 0x0010, NotFoundException -> 0x0010 }
        r0 = r1.open(r0);	 Catch:{ NotFoundException -> 0x0010, NotFoundException -> 0x0010 }
        r0.close();	 Catch:{ NotFoundException -> 0x0010, NotFoundException -> 0x0010 }
        return r1;	 Catch:{ NotFoundException -> 0x0010, NotFoundException -> 0x0010 }
    L_0x0010:
        if (r6 == 0) goto L_0x0031;
    L_0x0012:
        r2 = new com.facebook.common.dextricks.DexLibLoader$ExoPackageResProvider;
        r2.<init>(r5);
        r3 = 0;
        r0 = "metadata.txt";	 Catch:{ FileNotFoundException -> 0x0029 }
        r0 = r2.open(r0);	 Catch:{ FileNotFoundException -> 0x0029 }
        r0.close();	 Catch:{ FileNotFoundException -> 0x0029 }
        r1 = "using exopackage";	 Catch:{ FileNotFoundException -> 0x0029 }
        r0 = new java.lang.Object[r3];	 Catch:{ FileNotFoundException -> 0x0029 }
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);	 Catch:{ FileNotFoundException -> 0x0029 }
        return r2;	 Catch:{ FileNotFoundException -> 0x0029 }
    L_0x0029:
        r2 = move-exception;
        r1 = "using exo res provider failed";
        r0 = new java.lang.Object[r3];
        com.facebook.common.dextricks.Mlog.m57v(r2, r1, r0);
    L_0x0031:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexLibLoader.obtainResProviderInternal(android.content.Context, boolean):com.facebook.common.dextricks.ResProvider");
    }

    public static synchronized void setRegenerateOnNextLoadHint(Context context) {
        synchronized (DexLibLoader.class) {
            if (sMainDexStore != null) {
                sMainDexStore.forceRegenerateOnNextLoad();
            } else {
                Mlog.m58w("setRegenerateOnNextLoadHint called without a main dex store present", new Object[0]);
            }
        }
    }

    private static boolean shouldSynchronouslyGenerateOmniOat(Context context) {
        if (!(inCtScanOptMode() || VERSION.SDK_INT >= 26 || AnonymousClass00r.f102B || DalvikConstants.FB_REDEX_VERIFY_NONE_ENABLED)) {
            if (!AnonymousClass0Db.m1232B(context, Experiments.ART_OATMEAL_GK_ENABLED_FILENAME)) {
                return false;
            }
        }
        return true;
    }

    public static RuntimeException verifyCanaryClasses() {
        try {
            for (DexStore dexStoreListHead = DexStore.dexStoreListHead(); dexStoreListHead != null; dexStoreListHead = dexStoreListHead.next) {
                DexManifest loadedManifest = dexStoreListHead.getLoadedManifest();
                if (loadedManifest != null) {
                    for (Dex dex : loadedManifest.dexes) {
                        Class.forName(dex.canaryClass);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            return Fs.runtimeExFrom(th);
        }
    }
}
