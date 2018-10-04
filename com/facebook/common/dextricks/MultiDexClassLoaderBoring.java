package com.facebook.common.dextricks;

import X.AnonymousClass0A4;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.profilo.logger.api.ProfiloLogger;
import dalvik.system.DexFile;

public final class MultiDexClassLoaderBoring extends MultiDexClassLoader {
    private final ClassLoadingStats mClassLoadingStats = ClassLoadingStats.m2805C(new AnonymousClass0A4());
    private DexFile[] mDexFiles;

    public void onColdstartDone() {
    }

    public String toString() {
        return "MultiDexClassLoaderBoring";
    }

    public void configure(Configuration configuration) {
        super.configure(configuration);
        this.mDexFiles = (DexFile[]) configuration.mDexFiles.toArray(new DexFile[configuration.mDexFiles.size()]);
        configureArtHacks(configuration);
    }

    public DexFile[] doGetConfiguredDexFiles() {
        return this.mDexFiles;
    }

    public Class findClass(String str) {
        ProfiloLogger.classLoadStart();
        ClassTracingLogger.beginClassLoad(str);
        this.mClassLoadingStats.incrementClassLoadsAttempted();
        int i = 0;
        int i2 = 0;
        while (i < this.mDexFiles.length) {
            try {
                i2++;
                Class loadClass = this.mDexFiles[i].loadClass(str, this.mPutativeLoader);
                if (loadClass != null) {
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    if (loadClass != null) {
                        ClassTracingLogger.classLoaded(loadClass);
                        ProfiloLogger.classLoadEnd(loadClass);
                    } else {
                        ClassTracingLogger.classNotFound();
                        ProfiloLogger.classLoadFailed();
                        this.mClassLoadingStats.incrementClassLoadsFailed();
                    }
                    return loadClass;
                }
                i++;
            } finally {
                this.mClassLoadingStats.incrementDexFileQueries(i2);
                ClassTracingLogger.classNotFound();
                ProfiloLogger.classLoadFailed();
                this.mClassLoadingStats.incrementClassLoadsFailed();
            }
        }
        throw MultiDexClassLoader.PREFAB_CLASSNOTFOUND_EXCEPTION;
    }
}
