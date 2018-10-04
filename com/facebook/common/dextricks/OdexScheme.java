package com.facebook.common.dextricks;

import android.content.Context;
import com.facebook.common.dextricks.DexStore.OptimizationSession;
import com.facebook.common.dextricks.DexStore.ProgressListener;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import java.io.Closeable;
import java.io.File;

public abstract class OdexScheme {
    public static final int ODEX_SCHEME_BATCH_ONLY = 1;
    public static final int ODEX_SCHEME_INVALID = 2;
    public static final int ODEX_SCHEME_NOT_OPTIMAL = 8;
    public static final int ODEX_SCHEME_OPTIMIZATION_IS_CRAZY_EXPENSIVE = 4;
    public static final int ODEX_SCHEME_SKIP_COMPILER = 16;
    public final String[] expectedFiles;
    public final int flags;

    public abstract class Compiler implements Closeable {
        public static final int COMPILE_INCREMENTAL = 1;

        public void close() {
        }

        public abstract void compile(InputDex inputDex);
    }

    public abstract void configureClassLoader(File file, Configuration configuration);

    public abstract String getSchemeName();

    public int loadInformationalStatus(File file, long j) {
        return 0;
    }

    public boolean loadNotOptimized(long j) {
        return true;
    }

    public abstract Compiler makeCompiler(DexStore dexStore, int i);

    public boolean needOptimization(long j) {
        return false;
    }

    public void optimize(Context context, DexStore dexStore, OptimizationSession optimizationSession, ProgressListener progressListener) {
    }

    public OdexScheme(int i, String[] strArr) {
        this.flags = i;
        this.expectedFiles = strArr;
    }

    public final String toString() {
        return getClass().getName();
    }
}
