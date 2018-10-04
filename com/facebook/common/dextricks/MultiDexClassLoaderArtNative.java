package com.facebook.common.dextricks;

import X.AnonymousClass0CF;
import X.AnonymousClass0Db;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.common.dextricks.stats.ClassLoadingStatsNative;
import dalvik.system.DexFile;
import java.io.File;
import java.util.ArrayList;

public final class MultiDexClassLoaderArtNative extends MultiDexClassLoader {
    private static final int CRASH_CORRELATION_BAIL_THRESHOLD = 3;
    public static final String FAILEDSTART_FILE = "multidexclassloader_artnative_failedstart";
    private final ArrayList mAuxDexes;
    private final ArrayList mPrimaryDexes;

    private native void cleanupFailedInit();

    private native Class init(ClassLoader classLoader, ClassLoader classLoader2, DexFile[] dexFileArr, ClassLoadingStatsNative classLoadingStatsNative, String str, boolean z);

    public static native boolean isFastHooked();

    private static native void nativeConfigure(DexFile[] dexFileArr, boolean z, int[] iArr);

    public native DexFile[] doGetConfiguredDexFiles();

    public native Class findClass(String str);

    public native String[] getRecentFailedClasses();

    public native Class loadClass(String str, boolean z);

    public void onColdstartDone() {
    }

    public String toString() {
        return "MultiDexClassLoaderArtNative";
    }

    static {
        AnonymousClass0CF.m856E("dextricks");
    }

    public MultiDexClassLoaderArtNative(Context context, ClassLoader classLoader, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        MultiDexClassLoader multiDexClassLoader = this;
        if (!z2) {
            maybeBail(context);
        }
        this.mPrimaryDexes = arrayList;
        this.mAuxDexes = arrayList2;
        ArrayList arrayList3 = this.mPrimaryDexes;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            throw new Exception("Bailing: No primary dexes");
        }
        ClassLoadingStats classLoadingStatsNative = new ClassLoadingStatsNative();
        ClassLoadingStats.m2805C(classLoadingStatsNative);
        try {
            init(classLoader, multiDexClassLoader.mPutativeLoader, (DexFile[]) multiDexClassLoader.mPrimaryDexes.toArray(new DexFile[multiDexClassLoader.mPrimaryDexes.size()]), classLoadingStatsNative, context.getDir("mdclan", 0).getAbsolutePath(), z);
        } catch (Exception e) {
            cleanupFailedInit();
            throw e;
        }
    }

    public void configure(Configuration configuration) {
        super.configure(configuration);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mPrimaryDexes);
        arrayList.addAll(configuration.mDexFiles);
        arrayList.addAll(this.mAuxDexes);
        DexFile[] dexFileArr = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        boolean z = true;
        if ((configuration.getConfigFlags() & 1) == 0) {
            z = false;
        }
        nativeConfigure(dexFileArr, z, configuration.storeLocators);
        configureArtHacks(configuration);
    }

    private static void maybeBail(Context context) {
        File fileStreamPath = context.getFileStreamPath(FAILEDSTART_FILE);
        if (fileStreamPath.exists()) {
            fileStreamPath.delete();
            throw new Exception("MDCLAN bailing: Failed to start last time");
        }
        Object obj;
        fileStreamPath.createNewFile();
        if (VERSION.SDK_INT >= 21) {
            if (Build.SUPPORTED_32_BIT_ABIS.length != 0) {
                obj = Build.SUPPORTED_32_BIT_ABIS[0];
                if (!"x86".equals(obj)) {
                    throw new Exception("Bailing: x86 unsupported");
                } else if (!AnonymousClass0Db.m1233C(context, Experiments.MDCLAN_BLACKLIST_GK_ENABLED_FILENAME)) {
                    throw new Exception("Bailing: Blacklisted device model");
                }
            }
        }
        obj = Build.CPU_ABI;
        if (!"x86".equals(obj)) {
            throw new Exception("Bailing: x86 unsupported");
        } else if (!AnonymousClass0Db.m1233C(context, Experiments.MDCLAN_BLACKLIST_GK_ENABLED_FILENAME)) {
            throw new Exception("Bailing: Blacklisted device model");
        }
    }
}
