package com.facebook.common.dextricks;

import X.AnonymousClass0DE;
import X.AnonymousClass0Dr;
import X.AnonymousClass1C5;
import X.AnonymousClass1C7;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemProperties;
import android.util.Log;
import com.facebook.diskio.DiskIo;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class MultiDexClassLoader extends ClassLoader {
    private static final ClassLoader APP_CLASSLOADER;
    private static final Field CLASSLOADER_PARENT_FIELD;
    private static final Object INSTALL_LOCK = new Object();
    public static final ClassNotFoundException PREFAB_CLASSNOTFOUND_EXCEPTION = new ClassNotFoundException("[MultiDexclassLoader prefab]");
    private static final ClassLoader SYSTEM_CLASSLOADER;
    public static final String TAG = "MultiDexClassLoader";
    private static final boolean USE_DALVIK_NATIVE_LOADER = true;
    private static final boolean USE_FANCY_LOADER = true;
    private static Throwable sFancyLoaderFailure;
    public static volatile MultiDexClassLoader sInstalledClassLoader;
    private Configuration mConfig;
    private volatile boolean mHasArtLocked;
    public final ClassLoader mPutativeLoader = APP_CLASSLOADER;

    public final class Configuration {
        public static final int LOAD_SECONDARY = 2;
        public static final int SUPPORTS_LOCATORS = 1;
        public final ArrayList coldstartDexBaseNames = new ArrayList();
        public final int coldstartDexCount;
        private int configFlags;
        public final boolean enableArtExecuteGotoImpl;
        public final boolean enableWillNeedForDex;
        public final ArrayList mDexFiles = new ArrayList();
        public final StartupQEsConfig startupQEsConfig;
        public int[] storeLocators;

        public Configuration(int i, boolean z, int i2, StartupQEsConfig startupQEsConfig, boolean z2) {
            this.configFlags = i;
            this.enableArtExecuteGotoImpl = z;
            this.coldstartDexCount = i2;
            this.startupQEsConfig = startupQEsConfig;
            this.enableWillNeedForDex = z2;
        }

        public void addDex(DexFile dexFile) {
            this.mDexFiles.add(dexFile);
        }

        public void addDex(File file) {
            this.mDexFiles.add(DexFile.loadDex(file.getAbsolutePath(), null, 0));
            appendColdstartDexBaseName(file);
        }

        public void addDex(File file, File file2) {
            this.mDexFiles.add(DexFile.loadDex(file.getAbsolutePath(), file2.getAbsolutePath(), 0));
            appendColdstartDexBaseName(file);
        }

        public void addStoreId(int i, int i2) {
            if (i > 0) {
                if (this.storeLocators == null) {
                    this.storeLocators = new int[(i + 1)];
                }
                int[] iArr = this.storeLocators;
                if (iArr.length <= i) {
                    this.storeLocators = Arrays.copyOf(iArr, i + 1);
                }
                this.storeLocators[i] = i2;
            }
        }

        private void appendColdstartDexBaseName(File file) {
            if (this.coldstartDexBaseNames.size() < this.coldstartDexCount) {
                file = file.getName();
                this.coldstartDexBaseNames.add(file.substring(0, file.indexOf(".")));
            }
        }

        public int getConfigFlags() {
            return this.configFlags;
        }

        public int getNumberConfiguredDexFiles() {
            return this.mDexFiles.size();
        }

        public void setConfigFlags(int i) {
            this.configFlags = i;
        }
    }

    /* renamed from: com.facebook.common.dextricks.MultiDexClassLoader$1 */
    public final class C00351 implements AnonymousClass0Dr {
        public String getCustomData(Throwable th) {
            return Arrays.toString(MultiDexClassLoader.sInstalledClassLoader.getRecentFailedClasses());
        }
    }

    /* renamed from: com.facebook.common.dextricks.MultiDexClassLoader$2 */
    public final class C00362 implements AnonymousClass0Dr {
        public String getCustomData(Throwable th) {
            return MultiDexClassLoader.sInstalledClassLoader.toString();
        }
    }

    public abstract DexFile[] doGetConfiguredDexFiles();

    public abstract void onColdstartDone();

    static {
        try {
            APP_CLASSLOADER = MultiDexClassLoader.class.getClassLoader();
            CLASSLOADER_PARENT_FIELD = ClassLoader.class.getDeclaredField("parent");
            Field field = CLASSLOADER_PARENT_FIELD;
            field.setAccessible(true);
            SYSTEM_CLASSLOADER = (ClassLoader) field.get(APP_CLASSLOADER);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public MultiDexClassLoader() {
        super(SYSTEM_CLASSLOADER);
    }

    public static void clearFancyLoaderFailure() {
        sFancyLoaderFailure = null;
    }

    public void configure(Configuration configuration) {
        this.mConfig = configuration;
        if (getConfiguration().startupQEsConfig.oatWillNeed) {
            DiskIo.madviseMprotectOat();
        }
    }

    public void configureArtHacks(Configuration configuration) {
        boolean z = configuration.enableArtExecuteGotoImpl;
        boolean isArtLockEnabled = isArtLockEnabled(configuration);
        if (isArt()) {
            if (z) {
                DalvikInternals.installArtHacks(32, VERSION.SDK_INT);
            }
            if (isArtLockEnabled) {
                this.mHasArtLocked = isArtLockEnabled;
                DiskIo.mlockColdstartSet();
            }
            StartupQEsConfig startupQEsConfig = configuration.startupQEsConfig;
            if (startupQEsConfig.mprotectExecOat) {
                DiskIo.configureMprotect();
            }
            if (startupQEsConfig.enableOatMadvise) {
                DiskIo.configureMadvise(configuration.startupQEsConfig.oatMadviseMetadataOption, configuration.startupQEsConfig.oatMadviseDataOption);
            }
            if (startupQEsConfig.enableOatMadvise || startupQEsConfig.mprotectExecOat) {
                DiskIo.madviseMprotectOat();
            }
        }
    }

    private static MultiDexClassLoader createMultiDexClassLoader(Context context, ArrayList arrayList, ArrayList arrayList2, StartupQEsConfig startupQEsConfig) {
        Context context2 = context;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        if (!"true".equals(SystemProperties.get("com.facebook.force_mdclj"))) {
            if (!"Amazon".equals(Build.BRAND)) {
                try {
                    if (!IsArt.yes) {
                        return new MultiDexClassLoaderDalvikNative(context2, arrayList, arrayList2);
                    }
                    if (AnonymousClass1C7.f15491C.equals(AnonymousClass1C5.m9888C().f15489C)) {
                        arrayList2 = "true".equals(SystemProperties.get("com.facebook.force_mdclan"));
                        if (startupQEsConfig.mdclSelector == 1 || startupQEsConfig.mdclSelector == 2 || arrayList2 != null) {
                            return new MultiDexClassLoaderArtNative(context2, SYSTEM_CLASSLOADER, arrayList3, arrayList4, startupQEsConfig.mdclSelector == 2 ? true : null, arrayList2);
                        }
                    }
                } catch (Throwable e) {
                    Log.w(TAG, "unable to use native MDCL: falling back to Java impl", e);
                    sFancyLoaderFailure = e;
                }
            }
        }
        return new MultiDexClassLoaderJava(context2, arrayList3, arrayList4);
    }

    public static void forceLoadProfiloIfPresent() {
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
        r0 = 6;
        r3 = new java.lang.String[r0];
        r0 = "com.facebook.profilo.logger.api.ProfiloLogger";
        r2 = 0;
        r3[r2] = r0;
        r1 = "com.facebook.profilo.core.TraceEvents";
        r0 = 1;
        r3[r0] = r1;
        r1 = "com.facebook.profilo.entries.EntryType";
        r0 = 2;
        r3[r0] = r1;
        r1 = "com.facebook.profilo.logger.ClassLoadLogger";
        r0 = 3;
        r3[r0] = r1;
        r1 = "com.facebook.profilo.logger.Logger";
        r0 = 4;
        r3[r0] = r1;
        r1 = "com.facebook.profilo.core.ProvidersRegistry";
        r0 = 5;
        r3[r0] = r1;
        r1 = r3.length;
    L_0x0022:
        if (r2 >= r1) goto L_0x002c;
    L_0x0024:
        r0 = r3[r2];
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0029 }
    L_0x0029:
        r2 = r2 + 1;
        goto L_0x0022;
    L_0x002c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.MultiDexClassLoader.forceLoadProfiloIfPresent():void");
    }

    public static MultiDexClassLoader get() {
        return sInstalledClassLoader;
    }

    public Configuration getConfig() {
        return this.mConfig;
    }

    public static Configuration getConfiguration() {
        MultiDexClassLoader multiDexClassLoader = sInstalledClassLoader;
        if (multiDexClassLoader == null) {
            return null;
        }
        return multiDexClassLoader.getConfig();
    }

    public static DexFile[] getConfiguredDexFiles() {
        MultiDexClassLoader multiDexClassLoader = sInstalledClassLoader;
        if (multiDexClassLoader == null) {
            return new DexFile[0];
        }
        return multiDexClassLoader.doGetConfiguredDexFiles();
    }

    public static Throwable getFancyLoaderFailure() {
        return sFancyLoaderFailure;
    }

    public String[] getRecentFailedClasses() {
        return new String[0];
    }

    public static MultiDexClassLoader install(Context context, ArrayList arrayList, ArrayList arrayList2, StartupQEsConfig startupQEsConfig) {
        RuntimeException runtimeException;
        MultiDexClassLoader multiDexClassLoader = sInstalledClassLoader;
        if (multiDexClassLoader == null) {
            synchronized (INSTALL_LOCK) {
                multiDexClassLoader = sInstalledClassLoader;
                if (multiDexClassLoader == null) {
                    try {
                        Class.forName("com.facebook.common.dextricks.FatalDexError");
                        Class.forName("com.facebook.common.dextricks.DexFileLoadOld");
                        Class.forName("com.facebook.common.dextricks.DexFileLoadNew");
                        Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats");
                        Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats");
                        Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger");
                        Class.forName("com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger");
                        Class.forName("com.facebook.common.dextricks.classid.ClassId");
                        forceLoadProfiloIfPresent();
                        AnonymousClass0DE.m1113F().m1183X("recentClassLoadFailures", new C00351());
                        AnonymousClass0DE.m1113F().m1183X("multiDexClassLoader", new C00362());
                        multiDexClassLoader = createMultiDexClassLoader(context, arrayList, arrayList2, startupQEsConfig);
                        try {
                            CLASSLOADER_PARENT_FIELD.set(multiDexClassLoader.mPutativeLoader, multiDexClassLoader);
                            sInstalledClassLoader = multiDexClassLoader;
                        } catch (Throwable e) {
                            runtimeException = new RuntimeException(e);
                            throw runtimeException;
                        }
                    } catch (Throwable e2) {
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    }
                }
            }
        }
        return multiDexClassLoader;
    }

    private static boolean isArt() {
        return VERSION.SDK_INT >= 21;
    }

    private static boolean isArtLockEnabled(Configuration configuration) {
        if (configuration == null) {
            return false;
        }
        if (configuration.startupQEsConfig == null) {
            return false;
        }
        if (configuration.startupQEsConfig.lockArt && isArt()) {
            return true;
        }
        return false;
    }

    public void notifyColdstartDone() {
        onColdstartDone();
        if (this.mHasArtLocked) {
            DiskIo.munlockColdstartSet();
        }
    }

    public static void notifyCurrentClassLoaderThatColdstartDone() {
        MultiDexClassLoader multiDexClassLoader = sInstalledClassLoader;
        if (multiDexClassLoader != null) {
            multiDexClassLoader.notifyColdstartDone();
        }
    }
}
