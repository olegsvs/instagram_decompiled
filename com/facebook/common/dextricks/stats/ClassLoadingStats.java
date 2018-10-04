package com.facebook.common.dextricks.stats;

import X.AnonymousClass1KX;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ClassLoadingStats {
    /* renamed from: B */
    private static final AtomicReference f2996B = new AtomicReference();

    public final class SnapshotStats {
        /* renamed from: B */
        public final int f2997B;
        /* renamed from: C */
        public final int f2998C;
        /* renamed from: D */
        public final int f2999D;
        /* renamed from: E */
        public final int f3000E;
        /* renamed from: F */
        public final int f3001F;

        public SnapshotStats(int i, int i2, int i3, int i4, int i5) {
            this.f2997B = i;
            this.f2998C = i2;
            this.f2999D = i3;
            this.f3001F = i4;
            this.f3000E = i5;
        }

        public final String toString() {
            return String.format("[ Class Load Attempts: %d, Class Loads Failed: %d, Dex Queries: %d, Locator-assisted Class Loads: %d, Incorrect DFA Guesses: %d ]", new Object[]{Integer.valueOf(this.f2997B), Integer.valueOf(this.f2998C), Integer.valueOf(this.f2999D), Integer.valueOf(this.f3001F), Integer.valueOf(this.f3000E)});
        }
    }

    public abstract void decrementDexFileQueries();

    public abstract int getClassLoadsAttempted();

    public abstract int getClassLoadsFailed();

    public abstract int getDexFileQueries();

    public abstract int getIncorrectDfaGuesses();

    public abstract int getLocatorAssistedClassLoads();

    public abstract void incrementClassLoadsAttempted();

    public abstract void incrementClassLoadsFailed();

    public abstract void incrementDexFileQueries(int i);

    public abstract void incrementIncorrectDfaGuesses();

    /* renamed from: B */
    public static ClassLoadingStats m2804B() {
        if (f2996B.get() == null) {
            return new AnonymousClass1KX();
        }
        return (ClassLoadingStats) f2996B.get();
    }

    /* renamed from: C */
    public static ClassLoadingStats m2805C(ClassLoadingStats classLoadingStats) {
        f2996B.getAndSet(classLoadingStats);
        return classLoadingStats;
    }
}
