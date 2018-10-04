package com.facebook.common.dextricks;

import X.AnonymousClass0CF;
import android.content.Context;
import android.util.Log;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.common.dextricks.stats.ClassLoadingStatsNative;
import dalvik.system.DexFile;
import java.util.ArrayList;

public final class MultiDexClassLoaderDalvikNative extends MultiDexClassLoader {
    public static final int AVG_DEX_SIZE = 7340032;
    public static final int MAX_COLDSTART_OAT_SIZE = 31457280;
    public static final int MB = 1048576;
    public static final int OAT_HEADER_SIZE = 1048576;
    private static final boolean USE_LOW_LEVEL_DALVIK_HOOKS = true;
    private static final boolean USE_O1_DALVIK_LOCATOR_HACK = true;
    private static final int WANT_PROC_EXEC = 1;
    public static boolean sIsIntialized;
    private final DexFile[] mAuxDexes;
    private boolean mDirectLookupsEnabled = false;
    private boolean mHacksAttempted = false;
    private boolean mO1HackEnabled = false;
    private final DexFile[] mPrimaryDexes;
    private DexFile[] mSecondaryDexes;
    private int[] mStoreLocators;

    private static native void nativeConfigure(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, int i5, int[] iArr, int i6);

    private native void nativeEnableDirectLookupHooks();

    private static native void nativeEnableO1Hack();

    private native void nativeInitialize(Object obj, ClassLoadingStatsNative classLoadingStatsNative, Object obj2, Object[] objArr);

    private static native void unlockAllMemory();

    public native Class findClass(String str);

    public native Class loadClass(String str, boolean z);

    static {
        AnonymousClass0CF.m856E("dextricks");
    }

    public MultiDexClassLoaderDalvikNative(Context context, ArrayList arrayList, ArrayList arrayList2) {
        boolean z = false;
        if (!(arrayList.isEmpty() && arrayList2.isEmpty())) {
            z = true;
        }
        if (z) {
            this.mPrimaryDexes = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
            this.mAuxDexes = (DexFile[]) arrayList2.toArray(new DexFile[arrayList2.size()]);
        } else {
            Log.w(MultiDexClassLoader.TAG, "cannot enable dex hooks: failure to locate primary/aux dexes");
            this.mPrimaryDexes = null;
            this.mAuxDexes = null;
        }
        ClassLoadingStats classLoadingStatsNative = new ClassLoadingStatsNative();
        ClassLoadingStats.m2805C(classLoadingStatsNative);
        nativeInitialize(this.mPutativeLoader, classLoadingStatsNative, MultiDexClassLoader.PREFAB_CLASSNOTFOUND_EXCEPTION, this.mAuxDexes);
        sIsIntialized = true;
    }

    public synchronized void configure(Configuration configuration) {
        ArrayList arrayList = configuration.mDexFiles;
        DexFile[] dexFileArr = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        int i = DalvikConstants.FB_REDEX_COLD_START_SET_DEX_COUNT;
        StartupQEsConfig startupQEsConfig = configuration.startupQEsConfig;
        int i2 = (startupQEsConfig == null || !startupQEsConfig.enableLockDexExp) ? -1 : startupQEsConfig.lockDexNum;
        this.mStoreLocators = configuration.storeLocators;
        nativeConfigure(this.mPrimaryDexes, dexFileArr, configuration.getConfigFlags(), DalvikConstants.FB_REDEX_COLD_START_SET_DEX_COUNT, i, i2, 1, this.mStoreLocators, configuration.enableWillNeedForDex ? DalvikConstants.FB_REDEX_COLD_START_SET_DEX_COUNT : -1);
        this.mSecondaryDexes = dexFileArr;
        if (!this.mHacksAttempted) {
            this.mHacksAttempted = true;
            try {
                enableDirectLookupHooks();
                this.mDirectLookupsEnabled = true;
            } catch (Throwable e) {
                Log.w(MultiDexClassLoader.TAG, "unable to install direct Dalvik class-lookup hooks; continuing with classloader API", e);
            }
            try {
                enableO1Hack();
                this.mO1HackEnabled = true;
            } catch (Throwable e2) {
                Log.w(MultiDexClassLoader.TAG, "unable to enable O1 Dalvik hack", e2);
            }
        }
        return;
    }

    public DexFile[] doGetConfiguredDexFiles() {
        return this.mSecondaryDexes;
    }

    public void enableDirectLookupHooks() {
        DexFile[] dexFileArr = this.mPrimaryDexes;
        if (dexFileArr == null || this.mAuxDexes == null) {
            throw new UnsupportedOperationException("cannot enable direct hooks: we could not locate primary and aux dexes");
        } else if (dexFileArr.length == 1) {
            nativeEnableDirectLookupHooks();
        } else {
            throw new UnsupportedOperationException("cannot enable direct hooks: must have found exactly one primary dex");
        }
    }

    public void enableO1Hack() {
        DexFile[] dexFileArr = this.mPrimaryDexes;
        int length = dexFileArr == null ? 0 : dexFileArr.length;
        if (length == 1) {
            nativeEnableO1Hack();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("To use the O(1) class lookup hack, must have exactly one primary dex: have ");
        stringBuilder.append(length);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public void onColdstartDone() {
        unlockAllMemory();
    }

    public String toString() {
        return String.format("MultiDexClassLoaderDalvikNative(lookups=%s,o1=%s)", new Object[]{Boolean.valueOf(this.mDirectLookupsEnabled), Boolean.valueOf(this.mO1HackEnabled)});
    }
}
