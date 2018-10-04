package com.facebook.common.dextricks;

import X.AnonymousClass00r;
import X.AnonymousClass0Db;
import X.AnonymousClass1tN;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.JsonWriter;
import com.facebook.common.dextricks.DexManifest.Dex;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.OptimizationConfiguration.Provider;
import com.facebook.common.dextricks.ReentrantLockFile.Lock;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.fasterxml.jackson.annotation.JsonProperty;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

public final class DexStore {
    private static final String CONFIG_FILENAME = "config";
    private static final String CONFIG_TMP_FILENAME = "config.tmp";
    public static final long CS_DEX0OPT = 16;
    public static final long CS_STATE_MASK = 15;
    public static final byte CS_STATE_SHIFT = (byte) 4;
    private static final String DEPS_FILENAME = "deps";
    public static final int DS_ASYNC = 4;
    public static final int DS_DO_NOT_OPTIMIZE = 1;
    public static final int DS_FORCE_SYNC = 8;
    public static final int DS_LOAD_SECONDARY = 16;
    public static final int DS_NO_RETRY = 2;
    private static final int LA_LOAD_EXISTING = 0;
    private static final int LA_REGEN_ALL = 2;
    private static final int LA_REGEN_MISSING = 1;
    public static final int LOAD_RESULT_CREATED_BY_OATMEAL = 128;
    public static final int LOAD_RESULT_DEX2OAT_QUICKENED = 512;
    public static final int LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED = 4096;
    public static final int LOAD_RESULT_MIXED_MODE = 1024;
    public static final int LOAD_RESULT_MIXED_MODE_ATTEMPTED = 8192;
    public static final int LOAD_RESULT_NEED_OPTIMIZATION = 2;
    public static final int LOAD_RESULT_NOT_OPTIMIZED = 8;
    public static final int LOAD_RESULT_OATMEAL_QUICKENED = 256;
    public static final int LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED = 2048;
    public static final int LOAD_RESULT_OPTIMIZATION_IS_CRAZY_EXPENSIVE = 4;
    public static final int LOAD_RESULT_RECOVERED_FROM_BAD_GEN = 64;
    public static final int LOAD_RESULT_RECOVERED_FROM_CORRUPTION = 16;
    public static final int LOAD_RESULT_REGENERATED = 1;
    public static final int LOAD_RESULT_REGEN_FORCED = 32;
    public static final String MAIN_DEX_STORE_ID = "dex";
    private static final String MDEX_DIRECTORY = "mdex";
    private static final String MDEX_LOCK_FILENAME = "mdex_lock";
    private static final String MDEX_STATUS_FILENAME = "mdex_status2";
    private static final long MDEX_STATUS_XOR = -374168170706063353L;
    private static final int MS_IN_NS = 1000000;
    private static final String ODEX_LOCK_FILENAME = "odex_lock";
    private static final String OPTIMIZATION_LOG_FILENAME = "optimization_log";
    private static final String REGEN_STAMP_FILENAME = "regen_stamp";
    public static final String SECONDARY_DEX_MANIFEST = "metadata.txt";
    private static final String SECONDARY_XZS_FILENAME = "secondary.dex.jar.xzs";
    private static final byte STATE_ART_TURBO = (byte) 7;
    private static final byte STATE_ART_XDEX = (byte) 8;
    private static final byte STATE_BAD_GEN = (byte) 5;
    private static final byte STATE_FALLBACK = (byte) 2;
    private static final byte STATE_INVALID = (byte) 0;
    private static final byte STATE_NOOP = (byte) 9;
    private static final byte STATE_REGEN_FORCED = (byte) 6;
    private static final byte STATE_RESERVED1 = (byte) 10;
    private static final byte STATE_TURBO = (byte) 4;
    private static final byte STATE_TX_FAILED = (byte) 1;
    private static final byte STATE_XDEX = (byte) 3;
    private static final String TMPDIR_LOCK_SUFFIX = ".tmpdir_lock";
    private static final String TMPDIR_SUFFIX = ".tmpdir";
    private static final String XZS_EXTENSION = ".dex.jar.xzs";
    private static boolean sAttemptedCrossDexHookInstallation;
    private static Throwable sCrossDexHookInstallationError;
    private static DexStore sListHead;
    private static Configuration sMergedDexConfig;
    private final ArrayList auxiliaryDexes;
    private String id;
    private final File mApk;
    private final List mChildStores = new ArrayList();
    private DexErrorRecoveryInfo mLastDeri;
    private DexManifest mLoadedManifest;
    public final ReentrantLockFile mLockFile;
    private DexManifest mManifest;
    private final List mParentStores = new ArrayList();
    private final ResProvider mResProvider;
    public final DexStore next = sListHead;
    private final ArrayList primaryDexes;
    public final File root;

    public final class Config {
        public static final byte ART_FILTER_BALANCED = (byte) 4;
        public static final byte ART_FILTER_DEFAULT = (byte) 0;
        public static final byte ART_FILTER_EVERYTHING = (byte) 6;
        public static final byte ART_FILTER_INTERPRET_ONLY = (byte) 2;
        public static final byte ART_FILTER_SPACE = (byte) 3;
        public static final byte ART_FILTER_SPEED = (byte) 5;
        public static final byte ART_FILTER_TIME = (byte) 7;
        public static final byte ART_FILTER_VERIFY_NONE = (byte) 1;
        public static final byte DALVIK_OPT_ALL = (byte) 3;
        public static final byte DALVIK_OPT_DEFAULT = (byte) 0;
        public static final byte DALVIK_OPT_FULL = (byte) 4;
        public static final byte DALVIK_OPT_NONE = (byte) 1;
        public static final byte DALVIK_OPT_VERIFIED = (byte) 2;
        public static final byte DALVIK_REGISTER_MAPS_DEFAULT = (byte) 0;
        public static final byte DALVIK_REGISTER_MAPS_NO = (byte) 1;
        public static final byte DALVIK_REGISTER_MAPS_YES = (byte) 2;
        public static final byte DALVIK_VERIFY_ALL = (byte) 3;
        public static final byte DALVIK_VERIFY_DEFAULT = (byte) 0;
        public static final byte DALVIK_VERIFY_NONE = (byte) 1;
        public static final byte DALVIK_VERIFY_REMOTE = (byte) 2;
        public static final byte MODE_DEFAULT = (byte) 0;
        public static final byte MODE_FORCE_FALLBACK = (byte) 1;
        public static final byte MODE_FORCE_TURBO = (byte) 2;
        public static final byte MODE_FORCE_XDEX = (byte) 3;
        public static final byte SYNC_CONTROL_ASYNC = (byte) 1;
        public static final byte SYNC_CONTROL_DEFAULT = (byte) 0;
        public static final byte SYNC_CONTROL_SYNC = (byte) 2;
        public static final byte VERSION = (byte) 1;
        public final byte artFilter;
        public final int artHugeMethodMax;
        public final int artLargeMethodMax;
        public final int artSmallMethodMax;
        public final int artTinyMethodMax;
        public final int artTruncatedDexSize;
        public final byte dalvikOptimize;
        public final byte dalvikRegisterMaps;
        public final byte dalvikVerify;
        public final byte mode;
        public final byte sync;

        public final class Builder {
            public byte mArtFilter = (byte) 0;
            public int mArtHugeMethodMax = -1;
            public int mArtLargeMethodMax = -1;
            public int mArtSmallMethodMax = -1;
            public int mArtTinyMethodMax = -1;
            public int mArtTruncatedDexSize = -1;
            public byte mDalvikOptimize = (byte) 0;
            public byte mDalvikRegisterMaps = (byte) 0;
            public byte mDalvikVerify = (byte) 0;
            public byte mMode = (byte) 0;
            public byte mSync = (byte) 0;

            public Builder(Config config) {
                this.mMode = config.mode;
                this.mSync = config.sync;
                this.mDalvikVerify = config.dalvikVerify;
                this.mDalvikOptimize = config.dalvikOptimize;
                this.mDalvikRegisterMaps = config.dalvikRegisterMaps;
                this.mArtFilter = config.artFilter;
                this.mArtHugeMethodMax = config.artHugeMethodMax;
                this.mArtLargeMethodMax = config.artLargeMethodMax;
                this.mArtSmallMethodMax = config.artSmallMethodMax;
                this.mArtTinyMethodMax = config.artTinyMethodMax;
                this.mArtTruncatedDexSize = config.artTruncatedDexSize;
            }

            public Config build() {
                return new Config(this.mMode, this.mSync, this.mDalvikVerify, this.mDalvikOptimize, this.mDalvikRegisterMaps, this.mArtFilter, this.mArtHugeMethodMax, this.mArtLargeMethodMax, this.mArtSmallMethodMax, this.mArtTinyMethodMax, this.mArtTruncatedDexSize);
            }

            public Builder setArtFilter(byte b) {
                this.mArtFilter = b;
                return this;
            }

            public Builder setArtHugeMethodMax(int i) {
                this.mArtHugeMethodMax = i;
                return this;
            }

            public Builder setArtLargeMethodMax(int i) {
                this.mArtLargeMethodMax = i;
                return this;
            }

            public Builder setArtSmallMethodMax(int i) {
                this.mArtSmallMethodMax = i;
                return this;
            }

            public Builder setArtTinyMethodMax(int i) {
                this.mArtTinyMethodMax = i;
                return this;
            }

            public Builder setArtTruncatedDexSize(int i) {
                this.mArtTruncatedDexSize = i;
                return this;
            }

            public Builder setDalvikOptimize(byte b) {
                this.mDalvikOptimize = b;
                return this;
            }

            public Builder setDalvikRegisterMaps(byte b) {
                this.mDalvikRegisterMaps = b;
                return this;
            }

            public Builder setDalvikVerify(byte b) {
                this.mDalvikVerify = b;
                return this;
            }

            public Builder setMode(byte b) {
                this.mMode = b;
                return this;
            }

            public Builder setSync(byte b) {
                this.mSync = b;
                return this;
            }
        }

        public Config(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, int i, int i2, int i3, int i4, int i5) {
            this.mode = b;
            this.sync = b2;
            this.dalvikVerify = b3;
            this.dalvikOptimize = b4;
            this.dalvikRegisterMaps = b5;
            this.artFilter = b6;
            this.artHugeMethodMax = i;
            this.artLargeMethodMax = i2;
            this.artSmallMethodMax = i3;
            this.artTinyMethodMax = i4;
            this.artTruncatedDexSize = i5;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            if (this.mode == config.mode && this.sync == config.sync && this.dalvikVerify == config.dalvikVerify && this.dalvikOptimize == config.dalvikOptimize && this.dalvikRegisterMaps == config.dalvikRegisterMaps && this.artFilter == config.artFilter && this.artHugeMethodMax == config.artHugeMethodMax && this.artLargeMethodMax == config.artLargeMethodMax && this.artSmallMethodMax == config.artSmallMethodMax && this.artTinyMethodMax == config.artTinyMethodMax && this.artTruncatedDexSize == config.artTruncatedDexSize) {
                return true;
            }
            return false;
        }

        public boolean equalsForBootstrapPurposes(Config config) {
            return config.mode == this.mode && config.sync == this.sync && config.artFilter == this.artFilter;
        }

        public int hashCode() {
            return ((((((((((((((((((((10571 + this.mode) * 31) + this.sync) * 31) + this.dalvikVerify) * 31) + this.dalvikOptimize) * 31) + this.dalvikRegisterMaps) * 31) + this.artFilter) * 31) + this.artHugeMethodMax) * 31) + this.artLargeMethodMax) * 31) + this.artSmallMethodMax) * 31) + this.artTinyMethodMax) * 31) + this.artTruncatedDexSize;
        }

        public boolean isDefault() {
            return equals(new Config((byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, -1, -1, -1, -1, -1));
        }

        public static com.facebook.common.dextricks.DexStore.Config read(java.io.File r15) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r1 = new java.io.RandomAccessFile;
            r0 = "r";
            r1.<init>(r15, r0);
            r3 = 0;
            r2 = r1.readByte();	 Catch:{ Throwable -> 0x0050 }
            r0 = 1;	 Catch:{ Throwable -> 0x0050 }
            if (r2 != r0) goto L_0x0044;	 Catch:{ Throwable -> 0x0050 }
        L_0x000f:
            r5 = r1.readByte();	 Catch:{ Throwable -> 0x0050 }
            r6 = r1.readByte();	 Catch:{ Throwable -> 0x0050 }
            r7 = r1.readByte();	 Catch:{ Throwable -> 0x0050 }
            r8 = r1.readByte();	 Catch:{ Throwable -> 0x0050 }
            r9 = r1.readByte();	 Catch:{ Throwable -> 0x0050 }
            r10 = r1.readByte();	 Catch:{ Throwable -> 0x0050 }
            r11 = r1.readInt();	 Catch:{ Throwable -> 0x0050 }
            r12 = r1.readInt();	 Catch:{ Throwable -> 0x0050 }
            r13 = r1.readInt();	 Catch:{ Throwable -> 0x0050 }
            r14 = r1.readInt();	 Catch:{ Throwable -> 0x0050 }
            r15 = r1.readInt();	 Catch:{ Throwable -> 0x0050 }
            r4 = new com.facebook.common.dextricks.DexStore$Config;	 Catch:{ Throwable -> 0x0050 }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ Throwable -> 0x0050 }
            r1.close();
            return r4;
        L_0x0044:
            r2 = new java.lang.UnsupportedOperationException;	 Catch:{ Throwable -> 0x0050 }
            r0 = "unexpected version";	 Catch:{ Throwable -> 0x0050 }
            r2.<init>(r0);	 Catch:{ Throwable -> 0x0050 }
            throw r2;	 Catch:{ Throwable -> 0x0050 }
        L_0x004c:
            r0 = move-exception;
            if (r3 == 0) goto L_0x0056;
        L_0x004f:
            goto L_0x0052;
        L_0x0050:
            r3 = move-exception;
            throw r3;	 Catch:{ all -> 0x004c }
        L_0x0052:
            r1.close();	 Catch:{ Throwable -> 0x0059 }
            goto L_0x0059;	 Catch:{ Throwable -> 0x0059 }
        L_0x0056:
            r1.close();
        L_0x0059:
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.Config.read(java.io.File):com.facebook.common.dextricks.DexStore$Config");
        }

        public byte[] readDepBlock() {
            Parcel obtain = Parcel.obtain();
            obtain.writeByte(this.mode);
            obtain.writeByte(this.sync);
            obtain.writeByte(this.dalvikVerify);
            obtain.writeByte(this.dalvikOptimize);
            obtain.writeByte(this.dalvikRegisterMaps);
            obtain.writeByte(this.artFilter);
            obtain.writeInt(this.artHugeMethodMax);
            obtain.writeInt(this.artLargeMethodMax);
            obtain.writeInt(this.artSmallMethodMax);
            obtain.writeInt(this.artTinyMethodMax);
            return obtain.marshall();
        }

        public void writeAndSync(java.io.File r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r4 = this;
            r3 = new java.io.RandomAccessFile;
            r0 = "rw";
            r3.<init>(r5, r0);
            r1 = 1;
            r0 = 0;
            r3.writeByte(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.mode;	 Catch:{ Throwable -> 0x0059 }
            r3.writeByte(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.sync;	 Catch:{ Throwable -> 0x0059 }
            r3.writeByte(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.dalvikVerify;	 Catch:{ Throwable -> 0x0059 }
            r3.writeByte(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.dalvikOptimize;	 Catch:{ Throwable -> 0x0059 }
            r3.writeByte(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.dalvikRegisterMaps;	 Catch:{ Throwable -> 0x0059 }
            r3.writeByte(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.artFilter;	 Catch:{ Throwable -> 0x0059 }
            r3.writeByte(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.artHugeMethodMax;	 Catch:{ Throwable -> 0x0059 }
            r3.writeInt(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.artLargeMethodMax;	 Catch:{ Throwable -> 0x0059 }
            r3.writeInt(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.artSmallMethodMax;	 Catch:{ Throwable -> 0x0059 }
            r3.writeInt(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.artTinyMethodMax;	 Catch:{ Throwable -> 0x0059 }
            r3.writeInt(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r4.artTruncatedDexSize;	 Catch:{ Throwable -> 0x0059 }
            r3.writeInt(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r3.getFilePointer();	 Catch:{ Throwable -> 0x0059 }
            r3.setLength(r1);	 Catch:{ Throwable -> 0x0059 }
            r1 = r3.getFD();	 Catch:{ Throwable -> 0x0059 }
            r1.sync();	 Catch:{ Throwable -> 0x0059 }
            r3.close();
            return;
        L_0x0055:
            r1 = move-exception;
            if (r0 == 0) goto L_0x005f;
        L_0x0058:
            goto L_0x005b;
        L_0x0059:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x0055 }
        L_0x005b:
            r3.close();	 Catch:{ Throwable -> 0x0062 }
            goto L_0x0062;	 Catch:{ Throwable -> 0x0062 }
        L_0x005f:
            r3.close();
        L_0x0062:
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.Config.writeAndSync(java.io.File):void");
        }
    }

    public final class FinishRegenerationThread extends Thread {
        private final Lock mHeldLock;
        private final long mNewStatus;
        private final OdexScheme mOdexScheme;

        public FinishRegenerationThread(OdexScheme odexScheme, Lock lock, long j) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TxFlush-");
            stringBuilder.append(DexStore.this.root.getName());
            super(stringBuilder.toString());
            this.mHeldLock = lock;
            this.mNewStatus = j;
            this.mOdexScheme = odexScheme;
        }

        public void run() {
            try {
                Mlog.m56v("running syncer thread", new Object[0]);
                for (String file : this.mOdexScheme.expectedFiles) {
                    DalvikInternals.fsyncNamed(new File(DexStore.this.root, file).getCanonicalPath(), -1);
                }
                DexStore.this.writeStatusLocked(this.mNewStatus);
                this.mHeldLock.close();
                Mlog.m54i("finished syncer thread: initial regeneration of dex store %s complete", DexStore.this.root);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                this.mHeldLock.close();
            }
        }
    }

    public final class OptimizationCanceledException extends InterruptedException {
        public OptimizationCanceledException(String str) {
            super(str);
        }
    }

    public final class OptimizationLog {
        public static final int COMPLETE = 1;
        public static final int COUNTER_AWAKE_MS = 0;
        public static final int COUNTER_AWAKE_RUN_MS = 3;
        public static final int COUNTER_AWAKE_YIELD_MS = 2;
        public static final int COUNTER_REAL_TIME_MS = 1;
        public static final int NR_COUNTERS = 4;
        public static final int SUCCESS = 2;
        public long[] counters = new long[4];
        public int flags = 0;
        public long[] lastAttemptCounters = new long[4];
        public String lastFailureExceptionJson = JsonProperty.USE_DEFAULT_NAME;
        public int nrOptimizationsAttempted = 0;
        public int nrOptimizationsFailed = 0;

        public static String getCounterName(int i) {
            switch (i) {
                case 0:
                    return "COUNTER_AWAKE_MS";
                case 1:
                    return "COUNTER_AWAKE_REAL_TIME_MS";
                case 2:
                    return "COUNTER_AWAKE_YIELD_MS";
                case 3:
                    return "COUNTER_AWAKE_RUN_MS";
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unknown counter ");
                    stringBuilder.append(i);
                    throw new AssertionError(stringBuilder.toString());
            }
        }

        public static com.facebook.common.dextricks.DexStore.OptimizationLog read(java.io.File r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r5 = new java.io.RandomAccessFile;
            r0 = "r";
            r5.<init>(r6, r0);
            r6 = 0;
            r4 = new com.facebook.common.dextricks.DexStore$OptimizationLog;	 Catch:{ Throwable -> 0x0044 }
            r4.<init>();	 Catch:{ Throwable -> 0x0044 }
            r0 = r5.readInt();	 Catch:{ Throwable -> 0x0044 }
            r4.flags = r0;	 Catch:{ Throwable -> 0x0044 }
            r0 = r5.readInt();	 Catch:{ Throwable -> 0x0044 }
            r4.nrOptimizationsAttempted = r0;	 Catch:{ Throwable -> 0x0044 }
            r0 = r5.readInt();	 Catch:{ Throwable -> 0x0044 }
            r4.nrOptimizationsFailed = r0;	 Catch:{ Throwable -> 0x0044 }
            r3 = 0;	 Catch:{ Throwable -> 0x0044 }
        L_0x0020:
            r0 = 4;	 Catch:{ Throwable -> 0x0044 }
            if (r3 >= r0) goto L_0x0036;	 Catch:{ Throwable -> 0x0044 }
        L_0x0023:
            r2 = r4.counters;	 Catch:{ Throwable -> 0x0044 }
            r0 = r5.readLong();	 Catch:{ Throwable -> 0x0044 }
            r2[r3] = r0;	 Catch:{ Throwable -> 0x0044 }
            r2 = r4.lastAttemptCounters;	 Catch:{ Throwable -> 0x0044 }
            r0 = r5.readLong();	 Catch:{ Throwable -> 0x0044 }
            r2[r3] = r0;	 Catch:{ Throwable -> 0x0044 }
            r3 = r3 + 1;	 Catch:{ Throwable -> 0x0044 }
            goto L_0x0020;	 Catch:{ Throwable -> 0x0044 }
        L_0x0036:
            r0 = r5.readUTF();	 Catch:{ Throwable -> 0x0044 }
            r4.lastFailureExceptionJson = r0;	 Catch:{ Throwable -> 0x0044 }
            r5.close();
            return r4;
        L_0x0040:
            r0 = move-exception;
            if (r6 == 0) goto L_0x004a;
        L_0x0043:
            goto L_0x0046;
        L_0x0044:
            r6 = move-exception;
            throw r6;	 Catch:{ all -> 0x0040 }
        L_0x0046:
            r5.close();	 Catch:{ Throwable -> 0x004d }
            goto L_0x004d;	 Catch:{ Throwable -> 0x004d }
        L_0x004a:
            r5.close();
        L_0x004d:
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.OptimizationLog.read(java.io.File):com.facebook.common.dextricks.DexStore$OptimizationLog");
        }

        public static com.facebook.common.dextricks.DexStore.OptimizationLog readOrMakeDefault(java.io.File r0) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r0 = read(r0);	 Catch:{ FileNotFoundException -> 0x0005 }
            return r0;	 Catch:{ FileNotFoundException -> 0x0005 }
        L_0x0005:
            r0 = new com.facebook.common.dextricks.DexStore$OptimizationLog;
            r0.<init>();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.OptimizationLog.readOrMakeDefault(java.io.File):com.facebook.common.dextricks.DexStore$OptimizationLog");
        }

        public void write(java.io.File r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r5 = this;
            r3 = new java.io.RandomAccessFile;
            r0 = "rw";
            r3.<init>(r6, r0);
            r4 = 0;
            r0 = r5.flags;	 Catch:{ Throwable -> 0x0040 }
            r3.writeInt(r0);	 Catch:{ Throwable -> 0x0040 }
            r0 = r5.nrOptimizationsAttempted;	 Catch:{ Throwable -> 0x0040 }
            r3.writeInt(r0);	 Catch:{ Throwable -> 0x0040 }
            r0 = r5.nrOptimizationsFailed;	 Catch:{ Throwable -> 0x0040 }
            r3.writeInt(r0);	 Catch:{ Throwable -> 0x0040 }
            r2 = 0;	 Catch:{ Throwable -> 0x0040 }
        L_0x0018:
            r0 = 4;	 Catch:{ Throwable -> 0x0040 }
            if (r2 >= r0) goto L_0x002c;	 Catch:{ Throwable -> 0x0040 }
        L_0x001b:
            r0 = r5.counters;	 Catch:{ Throwable -> 0x0040 }
            r0 = r0[r2];	 Catch:{ Throwable -> 0x0040 }
            r3.writeLong(r0);	 Catch:{ Throwable -> 0x0040 }
            r0 = r5.lastAttemptCounters;	 Catch:{ Throwable -> 0x0040 }
            r0 = r0[r2];	 Catch:{ Throwable -> 0x0040 }
            r3.writeLong(r0);	 Catch:{ Throwable -> 0x0040 }
            r2 = r2 + 1;	 Catch:{ Throwable -> 0x0040 }
            goto L_0x0018;	 Catch:{ Throwable -> 0x0040 }
        L_0x002c:
            r0 = r5.lastFailureExceptionJson;	 Catch:{ Throwable -> 0x0040 }
            r3.writeUTF(r0);	 Catch:{ Throwable -> 0x0040 }
            r0 = r3.getFD();	 Catch:{ Throwable -> 0x0040 }
            r0.sync();	 Catch:{ Throwable -> 0x0040 }
            r3.close();
            return;
        L_0x003c:
            r0 = move-exception;
            if (r4 == 0) goto L_0x0046;
        L_0x003f:
            goto L_0x0042;
        L_0x0040:
            r4 = move-exception;
            throw r4;	 Catch:{ all -> 0x003c }
        L_0x0042:
            r3.close();	 Catch:{ Throwable -> 0x0049 }
            goto L_0x0049;	 Catch:{ Throwable -> 0x0049 }
        L_0x0046:
            r3.close();
        L_0x0049:
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.OptimizationLog.write(java.io.File):void");
        }
    }

    public final class OptimizationSession implements Closeable {
        private static final int PHASE_RUNNING = 0;
        private static final int PHASE_YIELDING = 1;
        private static final boolean PROCMON_VERBOSE = false;
        public long accumulatedRunNs;
        public long accumulatedYieldNs;
        public final OptimizationConfiguration config;
        public final Provider configProvider;
        public final Config dexStoreConfig;
        public final ReentrantLockFile mOptLockFile;
        private final FileInputStream mRegenStampFile;
        public final long startRealtimeMs;
        public final long startUptimeMs;

        public final class Job implements Closeable {
            private static final int PHASE_COMMITTING = 2;
            private static final int PHASE_DONE = 3;
            private static final int PHASE_OPTIMIZING = 1;
            private static final int PHASE_PREPARING = 0;
            public final long initialStatus;
            private Lock mCommitLock;
            private Lock mOptLock;
            private int mPhase;

            public Job() {
                try {
                    this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                    this.initialStatus = DexStore.readStatusLocked(DexStore.this);
                    checkBadStatus(this.initialStatus);
                } catch (Throwable th) {
                    close();
                }
            }

            private void checkBadStatus(long j) {
                byte b = (byte) ((int) (15 & j));
                if (b == (byte) 0 || b == (byte) 1 || b == (byte) 5 || b >= DexStore.STATE_RESERVED1) {
                    throw new OptimizationCanceledException(String.format("bad status %x for dex store %s starting tx", new Object[]{Long.valueOf(j), DexStore.this.root}));
                } else {
                    OptimizationSession.this.checkShouldStop();
                }
            }

            public void close() {
                Lock lock = this.mCommitLock;
                if (lock != null) {
                    lock.close();
                    this.mCommitLock = null;
                }
                lock = this.mOptLock;
                if (lock != null) {
                    lock.close();
                    this.mOptLock = null;
                }
            }

            public void finishCommit(long j) {
                Mlog.assertThat(this.mPhase == 2, "wrong phase", new Object[0]);
                DexStore.this.writeStatusLocked(j);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 3;
            }

            public long startCommitting() {
                return startCommitting(0);
            }

            public long startCommitting(long j) {
                Mlog.assertThat(this.mPhase == 1, "wrong phase: %s", Integer.valueOf(this.mPhase));
                this.mOptLock.close();
                this.mOptLock = null;
                this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                long readStatusLocked = DexStore.readStatusLocked(DexStore.this);
                checkBadStatus(readStatusLocked);
                j |= readStatusLocked;
                DexStore.this.writeStatusLocked(1 | (j << 4));
                this.mPhase = 2;
                return j;
            }

            public void startOptimizing() {
                Mlog.assertThat(this.mPhase == 0, "wrong phase", new Object[0]);
                this.mOptLock = OptimizationSession.this.mOptLockFile.acquireInterruptubly(1);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 1;
            }
        }

        private byte determineOptimizationFailureState(byte b) {
            return b == (byte) 8 ? (byte) 7 : b == (byte) 3 ? (byte) 4 : (byte) 5;
        }

        public OptimizationSession(Provider provider) {
            Closeable open;
            Throwable th;
            File file = new File(DexStore.this.root, DexStore.OPTIMIZATION_LOG_FILENAME);
            OptimizationLog readOrMakeDefault = OptimizationLog.readOrMakeDefault(file);
            readOrMakeDefault.nrOptimizationsAttempted++;
            long readStatusLocked = DexStore.readStatusLocked(DexStore.this);
            DexStore.writeTxFailedStatusLocked(DexStore.this, readStatusLocked);
            readOrMakeDefault.write(file);
            DexStore.this.writeStatusLocked(readStatusLocked);
            this.dexStoreConfig = DexStore.this.readConfig();
            this.startUptimeMs = SystemClock.uptimeMillis();
            this.startRealtimeMs = SystemClock.elapsedRealtime();
            Closeable closeable = null;
            try {
                this.configProvider = provider;
                this.config = provider.baseline;
                FileInputStream fileInputStream = new FileInputStream(new File(DexStore.this.root, DexStore.REGEN_STAMP_FILENAME));
                try {
                    open = ReentrantLockFile.open(new File(DexStore.this.root, DexStore.ODEX_LOCK_FILENAME));
                } catch (Throwable th2) {
                    th = th2;
                    open = null;
                    closeable = fileInputStream;
                    Fs.safeClose(closeable);
                    Fs.safeClose(open);
                    throw th;
                }
                try {
                    this.mRegenStampFile = fileInputStream;
                    try {
                        this.mOptLockFile = open;
                        Fs.safeClose(null);
                        Fs.safeClose(null);
                    } catch (Throwable th3) {
                        th = th3;
                        Fs.safeClose(closeable);
                        Fs.safeClose(open);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    closeable = fileInputStream;
                    Fs.safeClose(closeable);
                    Fs.safeClose(open);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                open = null;
                Fs.safeClose(closeable);
                Fs.safeClose(open);
                throw th;
            }
        }

        public void checkShouldStop() {
            if (DalvikInternals.getOpenFileLinkCount(Fd.fileno(this.mRegenStampFile.getFD())) == 0) {
                throw new OptimizationCanceledException("obsolete optimization: regeneration pending");
            }
        }

        public void close() {
            Fs.safeClose(this.mOptLockFile);
            Fs.safeClose(this.mRegenStampFile);
        }

        public void copeWithOptimizationFailure(java.lang.Throwable r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r4 = this;
            r3 = 0;
            r0 = com.facebook.common.dextricks.DexStore.this;	 Catch:{ Throwable -> 0x0026 }
            r0 = r0.mLockFile;	 Catch:{ Throwable -> 0x0026 }
            r2 = r0.acquire(r3);	 Catch:{ Throwable -> 0x0026 }
            r0 = 0;	 Catch:{ Throwable -> 0x0026 }
            r4.checkShouldStop();	 Catch:{ Throwable -> 0x001a }
            r4.copeWithOptimizationFailureImpl(r5);	 Catch:{ Throwable -> 0x001a }
            if (r2 == 0) goto L_0x002e;	 Catch:{ Throwable -> 0x001a }
        L_0x0012:
            r2.close();	 Catch:{ Throwable -> 0x0026 }
            goto L_0x002e;	 Catch:{ Throwable -> 0x0026 }
        L_0x0016:
            r1 = move-exception;
            if (r2 == 0) goto L_0x0025;
        L_0x0019:
            goto L_0x001c;
        L_0x001a:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x0016 }
        L_0x001c:
            if (r0 == 0) goto L_0x0022;	 Catch:{ all -> 0x0016 }
        L_0x001e:
            r2.close();	 Catch:{ Throwable -> 0x0025 }
            goto L_0x0025;	 Catch:{ Throwable -> 0x0025 }
        L_0x0022:
            r2.close();	 Catch:{ Throwable -> 0x0026 }
        L_0x0025:
            throw r1;	 Catch:{ Throwable -> 0x0026 }
        L_0x0026:
            r2 = move-exception;
            r1 = "recording optimization failure itself failed";
            r0 = new java.lang.Object[r3];
            com.facebook.common.dextricks.Mlog.m59w(r2, r1, r0);
        L_0x002e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.OptimizationSession.copeWithOptimizationFailure(java.lang.Throwable):void");
        }

        public void copeWithOptimizationFailureImpl(Throwable th) {
            File file = new File(DexStore.this.root, DexStore.OPTIMIZATION_LOG_FILENAME);
            OptimizationLog readOrMakeDefault = OptimizationLog.readOrMakeDefault(file);
            Mlog.m59w(th, "optimization failed (%s failures already)", Integer.valueOf(readOrMakeDefault.nrOptimizationsFailed));
            long readStatusLocked = DexStore.readStatusLocked(DexStore.this);
            byte b = (byte) ((int) (15 & readStatusLocked));
            updateOptimizationLogCounters(readOrMakeDefault);
            readOrMakeDefault.nrOptimizationsFailed++;
            try {
                Writer stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                AnonymousClass1tN.B(jsonWriter, th);
                jsonWriter.close();
                readOrMakeDefault.lastFailureExceptionJson = stringWriter.toString();
                if (readOrMakeDefault.nrOptimizationsFailed >= this.config.maximumOptimizationAttempts) {
                    Mlog.m58w("too many optimization failures (threshold is %s): will not keep trying", Integer.valueOf(this.config.maximumOptimizationAttempts));
                    readStatusLocked = (long) determineOptimizationFailureState(b);
                    readOrMakeDefault.flags |= 1;
                }
                DexStore.writeTxFailedStatusLocked(DexStore.this, readStatusLocked);
                readOrMakeDefault.write(file);
                DexStore.this.writeStatusLocked(readStatusLocked);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void noteOptimizationSuccess() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r7 = this;
            r0 = com.facebook.common.dextricks.DexStore.this;
            r1 = r0.mLockFile;
            r0 = 0;
            r6 = r1.acquire(r0);
            r5 = 0;
            r7.checkShouldStop();	 Catch:{ Throwable -> 0x0042 }
            r4 = new java.io.File;	 Catch:{ Throwable -> 0x0042 }
            r0 = com.facebook.common.dextricks.DexStore.this;	 Catch:{ Throwable -> 0x0042 }
            r1 = r0.root;	 Catch:{ Throwable -> 0x0042 }
            r0 = "optimization_log";	 Catch:{ Throwable -> 0x0042 }
            r4.<init>(r1, r0);	 Catch:{ Throwable -> 0x0042 }
            r3 = com.facebook.common.dextricks.DexStore.OptimizationLog.readOrMakeDefault(r4);	 Catch:{ Throwable -> 0x0042 }
            r0 = r3.flags;	 Catch:{ Throwable -> 0x0042 }
            r0 = r0 | 3;	 Catch:{ Throwable -> 0x0042 }
            r3.flags = r0;	 Catch:{ Throwable -> 0x0042 }
            r7.updateOptimizationLogCounters(r3);	 Catch:{ Throwable -> 0x0042 }
            r0 = com.facebook.common.dextricks.DexStore.this;	 Catch:{ Throwable -> 0x0042 }
            r1 = com.facebook.common.dextricks.DexStore.readStatusLocked(r0);	 Catch:{ Throwable -> 0x0042 }
            r0 = com.facebook.common.dextricks.DexStore.this;	 Catch:{ Throwable -> 0x0042 }
            com.facebook.common.dextricks.DexStore.writeTxFailedStatusLocked(r0, r1);	 Catch:{ Throwable -> 0x0042 }
            r3.write(r4);	 Catch:{ Throwable -> 0x0042 }
            r0 = com.facebook.common.dextricks.DexStore.this;	 Catch:{ Throwable -> 0x0042 }
            r0.writeStatusLocked(r1);	 Catch:{ Throwable -> 0x0042 }
            if (r6 == 0) goto L_0x003d;	 Catch:{ Throwable -> 0x0042 }
        L_0x003a:
            r6.close();
        L_0x003d:
            return;
        L_0x003e:
            r0 = move-exception;
            if (r6 == 0) goto L_0x004d;
        L_0x0041:
            goto L_0x0044;
        L_0x0042:
            r5 = move-exception;
            throw r5;	 Catch:{ all -> 0x003e }
        L_0x0044:
            if (r5 == 0) goto L_0x004a;	 Catch:{ all -> 0x003e }
        L_0x0046:
            r6.close();	 Catch:{ Throwable -> 0x004d }
            goto L_0x004d;	 Catch:{ Throwable -> 0x004d }
        L_0x004a:
            r6.close();
        L_0x004d:
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.OptimizationSession.noteOptimizationSuccess():void");
        }

        private int resumeProcess(Process process) {
            process.kill(18);
            return process.waitFor(-1, 5);
        }

        private int stopProcess(Process process) {
            process.kill(20);
            return process.waitFor(-1, 6);
        }

        private void updateOptimizationLogCounters(OptimizationLog optimizationLog) {
            int i = 0;
            optimizationLog.lastAttemptCounters[0] = SystemClock.uptimeMillis() - this.startUptimeMs;
            optimizationLog.lastAttemptCounters[1] = SystemClock.elapsedRealtime() - this.startRealtimeMs;
            optimizationLog.lastAttemptCounters[3] = this.accumulatedRunNs / 1000000;
            optimizationLog.lastAttemptCounters[2] = this.accumulatedYieldNs / 1000000;
            while (i < 4) {
                long[] jArr = optimizationLog.counters;
                jArr[i] = jArr[i] + optimizationLog.lastAttemptCounters[i];
                i++;
            }
        }

        public int waitForAndManageProcess(Process process) {
            long nanoTime = System.nanoTime();
            long j = nanoTime / 1000000;
            long j2 = nanoTime;
            long j3 = j;
            int i = 0;
            int i2 = Process.WAIT_RESULT_TIMEOUT;
            while (true) {
                long j4;
                OptimizationConfiguration instantaneous = this.configProvider.getInstantaneous();
                long j5 = j - j3;
                Process process2 = process;
                if (i == 0) {
                    r9.accumulatedRunNs += nanoTime - j2;
                    j4 = (long) instantaneous.optTimeSliceMs;
                    if (j5 >= j4) {
                        if (instantaneous.yieldTimeSliceMs > 0) {
                            Mlog.m56v("beginning yield", new Object[0]);
                            i2 = stopProcess(process2);
                            if (i2 == Process.WAIT_RESULT_STOPPED) {
                                i2 = Process.WAIT_RESULT_TIMEOUT;
                            }
                            i = 1;
                        }
                    }
                    if (i2 == Process.WAIT_RESULT_TIMEOUT) {
                        i2 = instantaneous.processPollMs;
                        j4 -= j5;
                        if (j4 < ((long) i2)) {
                            i2 = (int) j4;
                        }
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        i2 = process2.waitFor(i2, 4);
                    }
                    checkShouldStop();
                    j4 = System.nanoTime();
                    j = j4 / 1000000;
                    if (i2 != Process.WAIT_RESULT_TIMEOUT) {
                        Mlog.m50d("process exited with status %s", Integer.valueOf(i2));
                        return i2;
                    }
                    j2 = nanoTime;
                    nanoTime = j4;
                } else if (i == 1) {
                    r9.accumulatedYieldNs += nanoTime - j2;
                    j4 = (long) instantaneous.yieldTimeSliceMs;
                    if (j5 >= j4) {
                        if (instantaneous.optTimeSliceMs > 0) {
                            Mlog.m56v("ending yield", new Object[0]);
                            i2 = resumeProcess(process2);
                            if (i2 == Process.WAIT_RESULT_RUNNING) {
                                i2 = Process.WAIT_RESULT_TIMEOUT;
                            }
                            i = 0;
                        }
                    }
                    if (i2 == Process.WAIT_RESULT_TIMEOUT) {
                        i2 = instantaneous.processPollMs;
                        j4 -= j5;
                        if (j4 < ((long) i2)) {
                            i2 = (int) j4;
                        }
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        i2 = process2.waitFor(i2, 4);
                    }
                    checkShouldStop();
                    j4 = System.nanoTime();
                    j = j4 / 1000000;
                    if (i2 != Process.WAIT_RESULT_TIMEOUT) {
                        j2 = nanoTime;
                        nanoTime = j4;
                    } else {
                        Mlog.m50d("process exited with status %s", Integer.valueOf(i2));
                        return i2;
                    }
                } else {
                    throw new AssertionError();
                }
                j3 = j;
                if (i2 == Process.WAIT_RESULT_TIMEOUT) {
                    i2 = instantaneous.processPollMs;
                    j4 -= j5;
                    if (j4 < ((long) i2)) {
                        i2 = (int) j4;
                    }
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    i2 = process2.waitFor(i2, 4);
                }
                checkShouldStop();
                j4 = System.nanoTime();
                j = j4 / 1000000;
                if (i2 != Process.WAIT_RESULT_TIMEOUT) {
                    Mlog.m50d("process exited with status %s", Integer.valueOf(i2));
                    return i2;
                }
                j2 = nanoTime;
                nanoTime = j4;
            }
        }
    }

    public class ProgressListener {
        public void onProgress(int i, int i2, boolean z) {
        }
    }

    public final class RecoverableDexException extends Exception {
        public RecoverableDexException(Throwable th) {
            super(th);
        }
    }

    public final class TmpDir implements Closeable {
        public File directory;
        private Lock mTmpDirLock;

        public TmpDir(Lock lock, File file) {
            this.mTmpDirLock = lock;
            this.directory = file;
        }

        public void close() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r4.mTmpDirLock;
            if (r0 == 0) goto L_0x003d;
        L_0x0004:
            r0 = com.facebook.common.dextricks.DexStore.this;
            r1 = r0.mLockFile;
            r0 = 0;
            r3 = r1.acquire(r0);
            r2 = 0;
            r0 = r4.mTmpDirLock;	 Catch:{ Throwable -> 0x0031 }
            r0 = r0.getReentrantLockFile();	 Catch:{ Throwable -> 0x0031 }
            r1 = r0.lockFileName;	 Catch:{ Throwable -> 0x0031 }
            r0 = r4.mTmpDirLock;	 Catch:{ Throwable -> 0x0031 }
            r0.close();	 Catch:{ Throwable -> 0x0031 }
            r4.mTmpDirLock = r2;	 Catch:{ Throwable -> 0x0031 }
            com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r1);	 Catch:{ Throwable -> 0x0031 }
            r0 = r4.directory;	 Catch:{ Throwable -> 0x0031 }
            com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r0);	 Catch:{ Throwable -> 0x0031 }
            r4.directory = r2;	 Catch:{ Throwable -> 0x0031 }
            if (r3 == 0) goto L_0x003d;	 Catch:{ Throwable -> 0x0031 }
        L_0x0029:
            r3.close();
            goto L_0x003d;
        L_0x002d:
            r0 = move-exception;
            if (r3 == 0) goto L_0x003c;
        L_0x0030:
            goto L_0x0033;
        L_0x0031:
            r2 = move-exception;
            throw r2;	 Catch:{ all -> 0x002d }
        L_0x0033:
            if (r2 == 0) goto L_0x0039;	 Catch:{ all -> 0x002d }
        L_0x0035:
            r3.close();	 Catch:{ Throwable -> 0x003c }
            goto L_0x003c;	 Catch:{ Throwable -> 0x003c }
        L_0x0039:
            r3.close();
        L_0x003c:
            throw r0;
        L_0x003d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.TmpDir.close():void");
        }
    }

    private DexStore(File file, File file2, ResProvider resProvider, ArrayList arrayList, ArrayList arrayList2) {
        this.mApk = file2;
        this.root = file;
        Fs.mkdirOrThrow(file);
        this.mLockFile = ReentrantLockFile.open(new File(file, MDEX_LOCK_FILENAME));
        this.mResProvider = resProvider;
        this.primaryDexes = arrayList;
        this.auxiliaryDexes = arrayList2;
    }

    public void addChild(DexStore dexStore) {
        if (!this.mChildStores.contains(dexStore)) {
            this.mChildStores.add(dexStore);
        }
    }

    private byte adjustDesiredStateForConfig(byte b, Config config) {
        if (config.mode == (byte) 0) {
            return b;
        }
        if (config.mode == (byte) 1) {
            Mlog.m54i("using fallback mode due to request in config file", new Object[0]);
            return (byte) 2;
        } else if (config.mode == (byte) 2) {
            switch (b) {
                case (byte) 2:
                    Mlog.m54i("ignoring configured turbo mode: already forced to fallback mode", new Object[0]);
                    return b;
                case (byte) 3:
                    Mlog.m54i("using Dalvik turbo as requested in config file", new Object[0]);
                    return (byte) 4;
                case (byte) 4:
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    Mlog.m54i("config file wants turbo mode: already using it", new Object[0]);
                    return b;
                case (byte) 8:
                    Mlog.m54i("using ART turbo as requested in config file", new Object[0]);
                    return (byte) 7;
                case (byte) 9:
                    Mlog.m54i("ignoring configured turbo mode: no dex loading to do", new Object[0]);
                    return b;
                default:
                    Mlog.m58w("ignoring configured turbo mode: state not whitelisted: %s", Byte.valueOf(b));
                    return b;
            }
        } else if (config.mode == (byte) 3) {
            switch (b) {
                case (byte) 2:
                    Mlog.m54i("ignoring configured xdex mode: already forced to fallback", new Object[0]);
                    return b;
                case (byte) 3:
                case (byte) 8:
                    Mlog.m54i("config file wants xdex mode: already using it", new Object[0]);
                    return b;
                case (byte) 4:
                    Mlog.m54i("using Dalvik xdex as requested in config", new Object[0]);
                    return (byte) 3;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    Mlog.m54i("using ART xdex as requested in config file", new Object[0]);
                    return (byte) 8;
                case (byte) 9:
                    Mlog.m54i("ignoring configured xdex mode: no dex loading to do", new Object[0]);
                    return b;
                default:
                    Mlog.m58w("ignoring configured xdex mode: state not whitelisted: %s", Byte.valueOf(b));
                    return b;
            }
        } else {
            Mlog.m58w("ignoring unknown configured dex mode %s", Byte.valueOf(config.mode));
            return b;
        }
    }

    private void assertLockHeld() {
        Mlog.assertThat(this.mLockFile.getExclusiveOwner() == Thread.currentThread(), "lock req", new Object[0]);
    }

    public boolean atomicReplaceConfig(com.facebook.common.dextricks.DexStore.Config r10) {
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
        r9 = this;
        r0 = r9.mLockFile;
        r4 = 0;
        r8 = r0.acquire(r4);
        r0 = 0;
        r7 = new java.io.File;	 Catch:{ Throwable -> 0x0087 }
        r2 = r9.root;	 Catch:{ Throwable -> 0x0087 }
        r1 = "config";	 Catch:{ Throwable -> 0x0087 }
        r7.<init>(r2, r1);	 Catch:{ Throwable -> 0x0087 }
        r2 = r9.readConfig();	 Catch:{ Throwable -> 0x0087 }
        r6 = r10.equals(r2);	 Catch:{ Throwable -> 0x0087 }
        r1 = r9.attemptedOptimizationSinceRegeneration();	 Catch:{ Throwable -> 0x0087 }
        if (r1 == 0) goto L_0x0021;	 Catch:{ Throwable -> 0x0087 }
    L_0x001f:
        r5 = r6;	 Catch:{ Throwable -> 0x0087 }
        goto L_0x0025;	 Catch:{ Throwable -> 0x0087 }
    L_0x0021:
        r5 = r10.equalsForBootstrapPurposes(r2);	 Catch:{ Throwable -> 0x0087 }
    L_0x0025:
        if (r5 == 0) goto L_0x0039;	 Catch:{ Throwable -> 0x0087 }
    L_0x0027:
        if (r6 != 0) goto L_0x0039;	 Catch:{ Throwable -> 0x0087 }
    L_0x0029:
        r1 = r9.checkDeps();	 Catch:{ Throwable -> 0x0087 }
        if (r1 != 0) goto L_0x0030;	 Catch:{ Throwable -> 0x0087 }
    L_0x002f:
        r5 = 0;	 Catch:{ Throwable -> 0x0087 }
    L_0x0030:
        if (r5 == 0) goto L_0x0039;	 Catch:{ Throwable -> 0x0087 }
    L_0x0032:
        r1 = r9.attemptedOptimizationSinceRegeneration();	 Catch:{ Throwable -> 0x0087 }
        if (r1 == 0) goto L_0x0039;	 Catch:{ Throwable -> 0x0087 }
    L_0x0038:
        r5 = 0;	 Catch:{ Throwable -> 0x0087 }
    L_0x0039:
        r1 = r10.isDefault();	 Catch:{ Throwable -> 0x0087 }
        if (r1 == 0) goto L_0x0043;	 Catch:{ Throwable -> 0x0087 }
    L_0x003f:
        com.facebook.common.dextricks.Fs.deleteRecursive(r7);	 Catch:{ Throwable -> 0x0087 }
        goto L_0x0052;	 Catch:{ Throwable -> 0x0087 }
    L_0x0043:
        r3 = new java.io.File;	 Catch:{ Throwable -> 0x0087 }
        r2 = r9.root;	 Catch:{ Throwable -> 0x0087 }
        r1 = "config.tmp";	 Catch:{ Throwable -> 0x0087 }
        r3.<init>(r2, r1);	 Catch:{ Throwable -> 0x0087 }
        r10.writeAndSync(r3);	 Catch:{ Throwable -> 0x0087 }
        com.facebook.common.dextricks.Fs.renameOrThrow(r3, r7);	 Catch:{ Throwable -> 0x0087 }
    L_0x0052:
        if (r5 != 0) goto L_0x0073;	 Catch:{ Throwable -> 0x0087 }
    L_0x0054:
        r1 = r9.root;	 Catch:{ Throwable -> 0x0087 }
        r2 = r1.getAbsolutePath();	 Catch:{ Throwable -> 0x0087 }
        r1 = -1;	 Catch:{ Throwable -> 0x0087 }
        com.facebook.common.dextricks.DalvikInternals.fsyncNamed(r2, r1);	 Catch:{ Throwable -> 0x0087 }
        monitor-enter(r9);	 Catch:{ Throwable -> 0x0087 }
        r3 = new java.io.File;	 Catch:{ all -> 0x0070 }
        r2 = r9.root;	 Catch:{ all -> 0x0070 }
        r1 = "regen_stamp";	 Catch:{ all -> 0x0070 }
        r3.<init>(r2, r1);	 Catch:{ all -> 0x0070 }
        r3.delete();	 Catch:{ all -> 0x0070 }
        r9.touchRegenStamp();	 Catch:{ all -> 0x0070 }
        monitor-exit(r9);	 Catch:{ all -> 0x0070 }
        goto L_0x0073;	 Catch:{ all -> 0x0070 }
    L_0x0070:
        r1 = move-exception;	 Catch:{ all -> 0x0070 }
        monitor-exit(r9);	 Catch:{ all -> 0x0070 }
        throw r1;	 Catch:{ Throwable -> 0x0087 }
    L_0x0073:
        if (r5 == 0) goto L_0x007a;	 Catch:{ Throwable -> 0x0087 }
    L_0x0075:
        if (r6 != 0) goto L_0x007a;	 Catch:{ Throwable -> 0x0087 }
    L_0x0077:
        r9.saveDeps();	 Catch:{ Throwable -> 0x0087 }
    L_0x007a:
        if (r5 != 0) goto L_0x007d;	 Catch:{ Throwable -> 0x0087 }
    L_0x007c:
        r4 = 1;	 Catch:{ Throwable -> 0x0087 }
    L_0x007d:
        if (r8 == 0) goto L_0x0082;	 Catch:{ Throwable -> 0x0087 }
    L_0x007f:
        r8.close();
    L_0x0082:
        return r4;
    L_0x0083:
        r1 = move-exception;
        if (r8 == 0) goto L_0x0092;
    L_0x0086:
        goto L_0x0089;
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0083 }
    L_0x0089:
        if (r0 == 0) goto L_0x008f;	 Catch:{ all -> 0x0083 }
    L_0x008b:
        r8.close();	 Catch:{ Throwable -> 0x0092 }
        goto L_0x0092;	 Catch:{ Throwable -> 0x0092 }
    L_0x008f:
        r8.close();
    L_0x0092:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.atomicReplaceConfig(com.facebook.common.dextricks.DexStore$Config):boolean");
    }

    public boolean attemptedOptimizationSinceRegeneration() {
        return new File(this.root, OPTIMIZATION_LOG_FILENAME).exists();
    }

    private static boolean checkAndClearGk(Context context, String str) {
        try {
            boolean C = AnonymousClass0Db.m1233C(context, str);
            return C;
        } finally {
            AnonymousClass0Db.m1236F(context, str, false);
        }
    }

    private boolean checkDeps() {
        byte[] readCurrentDepBlock = readCurrentDepBlock();
        byte[] readSavedDepBlock = readSavedDepBlock();
        return readSavedDepBlock != null && Arrays.equals(readCurrentDepBlock, readSavedDepBlock);
    }

    private int checkDirty(OdexScheme odexScheme, String[] strArr) {
        Object obj = odexScheme.expectedFiles;
        int i = (odexScheme.flags & 2) != 0 ? 2 : 0;
        String[] strArr2 = (String[]) strArr.clone();
        setDifference(strArr2, obj);
        Object obj2 = null;
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            if (strArr2[i2] != null) {
                Mlog.m54i("deleting unknown file %s in dex store %s with schema %s", strArr2[i2], this.root, odexScheme.toString());
                Fs.deleteRecursive(new File(this.root, strArr2[i2]));
                obj2 = 1;
            }
        }
        if (!(obj2 == null || (odexScheme.flags & 1) == 0)) {
            Mlog.m54i("dex store %s had excess files and is non-incremental: regenerating", this.root);
            i = 2;
        }
        if (!checkDeps()) {
            Mlog.m54i("dex store %s dependencies have changed: regenerating all", this.root);
            i = 2;
        }
        if (i < 1) {
            String[] strArr3 = (String[]) obj.clone();
            setDifference(strArr3, strArr);
            for (String str : strArr3) {
                if (str != null) {
                    Mlog.m54i("missing file %s in dex store %s", strArr3[r3], this.root);
                    i = 1;
                }
            }
        }
        return i;
    }

    private void deleteFiles(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null) {
                Mlog.m56v("deleting existing file %s/%s", this.root, strArr[i]);
                Fs.deleteRecursive(new File(this.root, strArr[i]));
            }
        }
    }

    private byte determineDesiredState(byte r6, com.facebook.common.dextricks.DexManifest r7) {
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
        r5 = this;
        r0 = r7.dexes;
        r0 = r0.length;
        r5 = 9;
        r4 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x0008:
        r1 = "no secondary dexes listed: using noop configuration";
        r0 = new java.lang.Object[r4];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        return r5;
    L_0x0010:
        r0 = 5;
        r2 = 2;
        if (r6 != r0) goto L_0x001c;
    L_0x0014:
        r1 = "recovering from bad class gen: using fallback";
        r0 = new java.lang.Object[r4];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        return r2;
    L_0x001c:
        r1 = "Amazon";
        r0 = android.os.Build.BRAND;
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0032;
    L_0x0026:
        r0 = com.facebook.common.dextricks.IsArt.yes;
        if (r0 != 0) goto L_0x0032;
    L_0x002a:
        r1 = "avoiding optimizations on non-standard VM";
        r0 = new java.lang.Object[r4];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        return r2;
    L_0x0032:
        r0 = com.facebook.common.dextricks.IsArt.yes;
        if (r0 == 0) goto L_0x0073;
    L_0x0036:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 21;
        if (r1 >= r0) goto L_0x0044;
    L_0x003c:
        r1 = "avoiding optimizations on pre-L VM";
        r0 = new java.lang.Object[r4];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        return r2;
    L_0x0044:
        r0 = r7.dexes;
        r0 = r0[r4];
        r3 = r0.canaryClass;
        r2 = 1;
        r1 = "attempting to detect built-in ART multidex by classloading %s";	 Catch:{ ClassNotFoundException -> 0x0067 }
        r0 = new java.lang.Object[r2];	 Catch:{ ClassNotFoundException -> 0x0067 }
        r0[r4] = r3;	 Catch:{ ClassNotFoundException -> 0x0067 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ ClassNotFoundException -> 0x0067 }
        r0 = r7.dexes;	 Catch:{ ClassNotFoundException -> 0x0067 }
        r0 = r0[r4];	 Catch:{ ClassNotFoundException -> 0x0067 }
        r0 = r0.canaryClass;	 Catch:{ ClassNotFoundException -> 0x0067 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0067 }
        r1 = "ART native multi-dex in use: found %s";	 Catch:{ ClassNotFoundException -> 0x0067 }
        r0 = new java.lang.Object[r2];	 Catch:{ ClassNotFoundException -> 0x0067 }
        r0[r4] = r3;	 Catch:{ ClassNotFoundException -> 0x0067 }
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);	 Catch:{ ClassNotFoundException -> 0x0067 }
        return r5;	 Catch:{ ClassNotFoundException -> 0x0067 }
    L_0x0067:
        r1 = "ART multi-dex not in use: cannot load %s";
        r0 = new java.lang.Object[r2];
        r0[r4] = r3;
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        r0 = 8;
        return r0;
    L_0x0073:
        r0 = 3;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.determineDesiredState(byte, com.facebook.common.dextricks.DexManifest):byte");
    }

    private static File determineOdexCacheName(File file) {
        if (IsArt.yes) {
            return null;
        }
        String path = file.getPath();
        if (path.endsWith(".apk")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(path.substring(0, path.length() - 4));
            stringBuilder.append(".odex");
            File file2 = new File(stringBuilder.toString());
            if (file2.exists()) {
                return file2;
            }
        }
        return Fs.dexOptGenerateCacheFileName(Fs.findSystemDalvikCache(), file, "classes.dex");
    }

    public static boolean dex2oatQuickeningEnabled(Context context) {
        boolean B;
        String str;
        Object[] objArr;
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            if (i <= 25) {
                if (oatmealEnabled(context)) {
                    B = AnonymousClass0Db.m1232B(context, Experiments.ART_DEX2OAT_QUICKENING_GK_ENABLED_FILENAME);
                    str = "dex2oat quickening enabled: %s";
                    objArr = new Object[1];
                    objArr[0] = B ? "true" : "false";
                    Mlog.m56v(str, objArr);
                    return B;
                }
            }
        }
        B = false;
        str = "dex2oat quickening enabled: %s";
        objArr = new Object[1];
        if (B) {
        }
        objArr[0] = B ? "true" : "false";
        Mlog.m56v(str, objArr);
        return B;
    }

    public static synchronized DexStore dexStoreListHead() {
        DexStore dexStore;
        synchronized (DexStore.class) {
            dexStore = sListHead;
        }
        return dexStore;
    }

    private int findInArray(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static synchronized DexStore findOpened(File file) {
        synchronized (DexStore.class) {
            File absoluteFile = file.getAbsoluteFile();
            for (DexStore dexStoreListHead = dexStoreListHead(); dexStoreListHead != null; dexStoreListHead = dexStoreListHead.next) {
                if (dexStoreListHead.root.equals(absoluteFile)) {
                    return dexStoreListHead;
                }
            }
            return null;
        }
    }

    public void forceRegenerateOnNextLoad() {
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
        r3 = this;
        r1 = r3.mLockFile;
        r0 = 0;
        r2 = r1.acquire(r0);
        r0 = 6;
        r3.writeStatusLocked(r0);	 Catch:{ Throwable -> 0x0015, all -> 0x0012 }
        if (r2 == 0) goto L_0x0011;	 Catch:{ Throwable -> 0x0015, all -> 0x0012 }
    L_0x000e:
        r2.close();
    L_0x0011:
        return;
    L_0x0012:
        r1 = move-exception;
        r0 = 0;
        goto L_0x0018;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x0017:
        r1 = move-exception;
    L_0x0018:
        if (r2 == 0) goto L_0x0023;
    L_0x001a:
        if (r0 == 0) goto L_0x0020;
    L_0x001c:
        r2.close();	 Catch:{ Throwable -> 0x0023 }
        goto L_0x0023;	 Catch:{ Throwable -> 0x0023 }
    L_0x0020:
        r2.close();
    L_0x0023:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.forceRegenerateOnNextLoad():void");
    }

    public com.facebook.common.dextricks.DexStore.OptimizationLog getAndClearCompletedOptimizationLog() {
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
        r5 = this;
        r4 = new java.io.File;
        r1 = r5.root;
        r0 = "optimization_log";
        r4.<init>(r1, r0);
        r1 = r4.exists();
        r0 = 0;
        if (r1 != 0) goto L_0x0011;
    L_0x0010:
        return r0;
    L_0x0011:
        r2 = r5.mLockFile;
        r1 = 0;
        r3 = r2.acquire(r1);
        r2 = com.facebook.common.dextricks.DexStore.OptimizationLog.readOrMakeDefault(r4);	 Catch:{ Throwable -> 0x0035 }
        r1 = r2.flags;	 Catch:{ Throwable -> 0x0035 }
        r1 = r1 & 1;	 Catch:{ Throwable -> 0x0035 }
        if (r1 != 0) goto L_0x0028;	 Catch:{ Throwable -> 0x0035 }
    L_0x0022:
        if (r3 == 0) goto L_0x0010;	 Catch:{ Throwable -> 0x0035 }
    L_0x0024:
        r3.close();
        goto L_0x0010;
    L_0x0028:
        r4.delete();	 Catch:{ Throwable -> 0x0035 }
        if (r3 == 0) goto L_0x0030;	 Catch:{ Throwable -> 0x0035 }
    L_0x002d:
        r3.close();
    L_0x0030:
        return r2;
    L_0x0031:
        r1 = move-exception;
        if (r3 == 0) goto L_0x0040;
    L_0x0034:
        goto L_0x0037;
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0031 }
    L_0x0037:
        if (r0 == 0) goto L_0x003d;	 Catch:{ all -> 0x0031 }
    L_0x0039:
        r3.close();	 Catch:{ Throwable -> 0x0040 }
        goto L_0x0040;	 Catch:{ Throwable -> 0x0040 }
    L_0x003d:
        r3.close();
    L_0x0040:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.getAndClearCompletedOptimizationLog():com.facebook.common.dextricks.DexStore$OptimizationLog");
    }

    public File[] getDependencyOdexFiles() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mApk);
        arrayList.add(determineOdexCacheName(this.mApk));
        for (DexStore dependencyOdexFiles : getParents()) {
            for (Object add : dependencyOdexFiles.getDependencyOdexFiles()) {
                arrayList.add(add);
            }
        }
        File[] fileArr = new File[arrayList.size()];
        arrayList.toArray(fileArr);
        return fileArr;
    }

    public synchronized long getLastRegenTime() {
        return new File(this.root, REGEN_STAMP_FILENAME).lastModified();
    }

    public DexManifest getLoadedManifest() {
        return this.mLoadedManifest;
    }

    public long getNextRecommendedOptimizationAttemptTime(OptimizationConfiguration optimizationConfiguration) {
        long lastModified = new File(this.root, OPTIMIZATION_LOG_FILENAME).lastModified();
        if (lastModified > System.currentTimeMillis()) {
            Mlog.m58w("ignoring optimization log file from the future", new Object[0]);
            lastModified = 0;
        }
        if (lastModified > 0) {
            return ((long) optimizationConfiguration.timeBetweenOptimizationAttemptsMs) + lastModified;
        }
        return 0;
    }

    public String getOdexCachePath() {
        return determineOdexCacheName(this.mApk) != null ? determineOdexCacheName(this.mApk).getAbsolutePath() : null;
    }

    public String[] getParentNames() {
        loadManifest();
        return this.mManifest.requires;
    }

    private DexStore[] getParents() {
        loadManifest();
        if (this.mParentStores.isEmpty() && !MAIN_DEX_STORE_ID.equals(this.mManifest.id)) {
            for (String str : this.mManifest.requires) {
                if (!str.equals(MAIN_DEX_STORE_ID)) {
                    Object obj;
                    for (DexStore dexStoreListHead = dexStoreListHead(); dexStoreListHead != null; dexStoreListHead = dexStoreListHead.next) {
                        String str2 = dexStoreListHead.id;
                        if (str2 != null && str2.equals(str)) {
                            this.mParentStores.add(dexStoreListHead);
                            dexStoreListHead.addChild(this);
                            obj = 1;
                            break;
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unable to find required store ");
                        stringBuilder.append(str);
                        stringBuilder.append(" of store ");
                        stringBuilder.append(this.mManifest.id);
                        throw new IOException(stringBuilder.toString());
                    }
                }
            }
        }
        List list = this.mParentStores;
        return (DexStore[]) list.toArray(new DexStore[list.size()]);
    }

    public static String getStatusDescription(long j) {
        int i = (int) (j & 15);
        j = new StringBuilder();
        switch (i) {
            case 0:
                j.append("STATE_INVALID");
                break;
            case 1:
                j.append("STATE_TX_FAILED");
                break;
            case 2:
                j.append("STATE_FALLBACK");
                break;
            case 3:
                j.append("STATE_XDEX");
                break;
            case 4:
                j.append("STATE_TURBO");
                break;
            case 5:
                j.append("STATE_BAD_GEN");
                break;
            case 6:
                j.append("STATE_REGEN_FORCED");
                break;
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                j.append("STATE_ART_TURBO");
                break;
            case 8:
                j.append("STATE_ART_XDEX");
                break;
            case 9:
                j.append("STATE_NOOP");
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("BAD STATE ");
                stringBuilder.append(i);
                j.append(stringBuilder.toString());
                break;
        }
        return j.toString();
    }

    public boolean hasChildren() {
        return this.mChildStores.isEmpty();
    }

    private static synchronized void installCrossDexHooks() {
        synchronized (DexStore.class) {
            if (!sAttemptedCrossDexHookInstallation) {
                sAttemptedCrossDexHookInstallation = true;
                try {
                    DalvikInternals.fixDvmForCrossDexHack();
                    Mlog.m50d("cross-dex hook installation succeeded", new Object[0]);
                } catch (Throwable th) {
                    sCrossDexHookInstallationError = th;
                }
            } else if (sCrossDexHookInstallationError != null) {
                throw Fs.runtimeExFrom(sCrossDexHookInstallationError);
            }
        }
    }

    public synchronized boolean isLoaded() {
        return this.mLoadedManifest != null;
    }

    private String[] listAndPruneRootFiles() {
        String[] list = this.root.list();
        if (list != null) {
            for (int i = 0; i < list.length; i++) {
                String str = list[i];
                if (str.equals(MDEX_LOCK_FILENAME) || str.equals(MDEX_STATUS_FILENAME) || str.equals(ODEX_LOCK_FILENAME) || str.equals(DEPS_FILENAME) || str.equals(REGEN_STAMP_FILENAME) || str.equals(OPTIMIZATION_LOG_FILENAME) || str.equals(CONFIG_FILENAME)) {
                    list[i] = null;
                }
                if (str.equals(CONFIG_TMP_FILENAME)) {
                    Fs.deleteRecursive(new File(this.root, str));
                    list[i] = null;
                }
            }
            pruneTemporaryDirectoriesLocked(list);
            return list;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unable to list directory ");
        stringBuilder.append(this.root);
        throw new IOException(stringBuilder.toString());
    }

    public synchronized com.facebook.common.dextricks.DexErrorRecoveryInfo loadAll(int r5, X.AnonymousClass00i r6, android.content.Context r7) {
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
        r4 = this;
        monitor-enter(r4);
        r1 = "DLL2_dexstore_load_all";	 Catch:{ all -> 0x0038 }
        r0 = 8912899; // 0x880003 float:1.2489632E-38 double:4.403557E-317;	 Catch:{ all -> 0x0038 }
        r3 = r6.mo28A(r1, r0);	 Catch:{ all -> 0x0038 }
        r2 = 0;	 Catch:{ all -> 0x0038 }
        r0 = r4.loadAllImpl(r5, r6, r7);	 Catch:{ RecoverableDexException -> 0x0016 }
        goto L_0x001f;	 Catch:{ RecoverableDexException -> 0x0016 }
    L_0x0010:
        r0 = move-exception;
        if (r3 == 0) goto L_0x0037;
    L_0x0013:
        goto L_0x002e;
    L_0x0014:
        r2 = move-exception;
        goto L_0x002d;
    L_0x0016:
        r1 = move-exception;
        r0 = r5 | 2;
        r0 = r4.loadAllImpl(r0, r6, r7);	 Catch:{ RecoverableDexException -> 0x0026 }
        r0.regenRetryCause = r1;	 Catch:{ RecoverableDexException -> 0x0026 }
    L_0x001f:
        if (r3 == 0) goto L_0x0024;	 Catch:{ RecoverableDexException -> 0x0026 }
    L_0x0021:
        r3.close();	 Catch:{ all -> 0x0038 }
    L_0x0024:
        monitor-exit(r4);
        return r0;
    L_0x0026:
        r1 = move-exception;
        r0 = new java.lang.AssertionError;	 Catch:{ Throwable -> 0x0014 }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x0014 }
        throw r0;	 Catch:{ Throwable -> 0x0014 }
    L_0x002d:
        throw r2;	 Catch:{ all -> 0x0010 }
    L_0x002e:
        if (r2 == 0) goto L_0x0034;	 Catch:{ all -> 0x0010 }
    L_0x0030:
        r3.close();	 Catch:{ Throwable -> 0x0037 }
        goto L_0x0037;	 Catch:{ Throwable -> 0x0037 }
    L_0x0034:
        r3.close();	 Catch:{ all -> 0x0038 }
    L_0x0037:
        throw r0;	 Catch:{ all -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAll(int, X.00i, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllImpl(int r36, X.AnonymousClass00i r37, android.content.Context r38) {
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
        r35 = this;
        r6 = r36;
        r8 = new com.facebook.common.dextricks.DexErrorRecoveryInfo;
        r8.<init>();
        r1 = r35;
        r0 = r1.isLoaded();
        r12 = 1;
        r11 = 0;
        if (r0 == 0) goto L_0x0025;
    L_0x0011:
        r0 = r1.mLastDeri;
        if (r0 != 0) goto L_0x0022;
    L_0x0015:
        r3 = "dex store %s has already been loaded, but did not save recovery info";
        r2 = new java.lang.Object[r12];
        r0 = r1.root;
        r2[r11] = r0;
        com.facebook.common.dextricks.Mlog.m58w(r3, r2);
        r1.mLastDeri = r8;
    L_0x0022:
        r0 = r1.mLastDeri;
        return r0;
    L_0x0025:
        r2 = "DLL2_manifest_load";
        r0 = 8912900; // 0x880004 float:1.2489633E-38 double:4.4035577E-317;
        r9 = r37;
        r2 = r9.mo28A(r2, r0);
        r7 = r1.loadManifest();	 Catch:{ Throwable -> 0x04a0, all -> 0x049d }
        if (r2 == 0) goto L_0x0039;	 Catch:{ Throwable -> 0x04a0, all -> 0x049d }
    L_0x0036:
        r2.close();
    L_0x0039:
        r5 = r1.getParents();
        r4 = r5.length;
        r3 = 0;
    L_0x003f:
        r10 = 2;
        if (r3 >= r4) goto L_0x0066;
    L_0x0042:
        r15 = r5[r3];
        r0 = r15.isLoaded();
        if (r0 != 0) goto L_0x0063;
    L_0x004a:
        r0 = r38;
        r14 = r15.loadAll(r6, r9, r0);
        r13 = "parent dex store %s loaded with result: %x";
        r2 = new java.lang.Object[r10];
        r0 = r15.id;
        r2[r11] = r0;
        r0 = r14.loadResult;
        r0 = java.lang.Integer.valueOf(r0);
        r2[r12] = r0;
        com.facebook.common.dextricks.Mlog.m56v(r13, r2);
    L_0x0063:
        r3 = r3 + 1;
        goto L_0x003f;
    L_0x0066:
        r0 = r1.mLockFile;
        r35 = r0.acquire(r11);
        r2 = readStatusLocked(r1);	 Catch:{ all -> 0x0496 }
        r18 = 15;	 Catch:{ all -> 0x0496 }
        r4 = r2 & r18;	 Catch:{ all -> 0x0496 }
        r0 = (int) r4;	 Catch:{ all -> 0x0496 }
        r13 = (byte) r0;	 Catch:{ all -> 0x0496 }
        r0 = 10;	 Catch:{ all -> 0x0496 }
        if (r13 < r0) goto L_0x008b;	 Catch:{ all -> 0x0496 }
    L_0x007a:
        r5 = "found invalid state %s: nuking dex store %s";	 Catch:{ all -> 0x0496 }
        r4 = new java.lang.Object[r10];	 Catch:{ all -> 0x0496 }
        r0 = java.lang.Byte.valueOf(r13);	 Catch:{ all -> 0x0496 }
        r4[r11] = r0;	 Catch:{ all -> 0x0496 }
        r0 = r1.root;	 Catch:{ all -> 0x0496 }
        r4[r12] = r0;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m58w(r5, r4);	 Catch:{ all -> 0x0496 }
    L_0x008b:
        r4 = 3;	 Catch:{ all -> 0x0496 }
        r0 = 4;	 Catch:{ all -> 0x0496 }
        if (r13 != r12) goto L_0x00ad;	 Catch:{ all -> 0x0496 }
    L_0x008f:
        r5 = "found abandoned transaction (prev stateno %s status %x) on dex store %s: nuking store";	 Catch:{ all -> 0x0496 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0496 }
        r16 = r2 >> r0;	 Catch:{ all -> 0x0496 }
        r14 = r16 & r18;	 Catch:{ all -> 0x0496 }
        r0 = java.lang.Long.valueOf(r14);	 Catch:{ all -> 0x0496 }
        r4[r11] = r0;	 Catch:{ all -> 0x0496 }
        r0 = java.lang.Long.valueOf(r16);	 Catch:{ all -> 0x0496 }
        r4[r12] = r0;	 Catch:{ all -> 0x0496 }
        r0 = r1.root;	 Catch:{ all -> 0x0496 }
        r4[r10] = r0;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m58w(r5, r4);	 Catch:{ all -> 0x0496 }
        r0 = 16;	 Catch:{ all -> 0x0496 }
        goto L_0x00ae;	 Catch:{ all -> 0x0496 }
    L_0x00ad:
        r0 = 0;	 Catch:{ all -> 0x0496 }
    L_0x00ae:
        r4 = 5;	 Catch:{ all -> 0x0496 }
        if (r13 != r4) goto L_0x00ba;	 Catch:{ all -> 0x0496 }
    L_0x00b1:
        r5 = "crashed last time while loading generated files; trying fallback";	 Catch:{ all -> 0x0496 }
        r4 = new java.lang.Object[r11];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m58w(r5, r4);	 Catch:{ all -> 0x0496 }
        r0 = r0 | 64;	 Catch:{ all -> 0x0496 }
    L_0x00ba:
        r4 = 6;	 Catch:{ all -> 0x0496 }
        if (r13 != r4) goto L_0x00c6;	 Catch:{ all -> 0x0496 }
    L_0x00bd:
        r5 = "force dex regeneration requested";	 Catch:{ all -> 0x0496 }
        r4 = new java.lang.Object[r11];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m58w(r5, r4);	 Catch:{ all -> 0x0496 }
        r0 = r0 | 32;	 Catch:{ all -> 0x0496 }
    L_0x00c6:
        r4 = r1.schemeForState(r7, r2);	 Catch:{ all -> 0x0496 }
        r14 = "DLL2_check_dirty";	 Catch:{ all -> 0x0496 }
        r5 = 8912901; // 0x880005 float:1.2489634E-38 double:4.403558E-317;	 Catch:{ all -> 0x0496 }
        r14 = r9.mo28A(r14, r5);	 Catch:{ all -> 0x0496 }
        r16 = r1.listAndPruneRootFiles();	 Catch:{ Throwable -> 0x0487, all -> 0x0484 }
        r17 = r1;	 Catch:{ Throwable -> 0x0487, all -> 0x0484 }
        r18 = r4;	 Catch:{ Throwable -> 0x0487, all -> 0x0484 }
        r19 = r16;	 Catch:{ Throwable -> 0x0487, all -> 0x0484 }
        r5 = r17.checkDirty(r18, r19);	 Catch:{ Throwable -> 0x0487, all -> 0x0484 }
        if (r14 == 0) goto L_0x00e6;	 Catch:{ Throwable -> 0x0487, all -> 0x0484 }
    L_0x00e3:
        r14.close();	 Catch:{ all -> 0x0496 }
    L_0x00e6:
        if (r5 != 0) goto L_0x00eb;	 Catch:{ all -> 0x0496 }
    L_0x00e8:
        r15 = "LA_LOAD_EXISTING";	 Catch:{ all -> 0x0496 }
        goto L_0x00f2;	 Catch:{ all -> 0x0496 }
    L_0x00eb:
        if (r5 != r12) goto L_0x00f0;	 Catch:{ all -> 0x0496 }
    L_0x00ed:
        r15 = "LA_REGEN_MISSING";	 Catch:{ all -> 0x0496 }
        goto L_0x00f2;	 Catch:{ all -> 0x0496 }
    L_0x00f0:
        r15 = "LA_REGEN_ALL";	 Catch:{ all -> 0x0496 }
    L_0x00f2:
        r14 = "current scheme: %s next step: %s";	 Catch:{ all -> 0x0496 }
        r10 = new java.lang.Object[r10];	 Catch:{ all -> 0x0496 }
        r10[r11] = r4;	 Catch:{ all -> 0x0496 }
        r12 = 1;	 Catch:{ all -> 0x0496 }
        r10[r12] = r15;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m54i(r14, r10);	 Catch:{ all -> 0x0496 }
        if (r5 != r12) goto L_0x010f;	 Catch:{ all -> 0x0496 }
    L_0x0100:
        r10 = r4.flags;	 Catch:{ all -> 0x0496 }
        r10 = r10 & r12;	 Catch:{ all -> 0x0496 }
        if (r10 == 0) goto L_0x010f;	 Catch:{ all -> 0x0496 }
    L_0x0105:
        r10 = "scheme %s is non-incremental: regenerating everything";	 Catch:{ all -> 0x0496 }
        r5 = new java.lang.Object[r12];	 Catch:{ all -> 0x0496 }
        r5[r11] = r4;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m54i(r10, r5);	 Catch:{ all -> 0x0496 }
        r5 = 2;	 Catch:{ all -> 0x0496 }
    L_0x010f:
        if (r5 != 0) goto L_0x0126;	 Catch:{ all -> 0x0496 }
    L_0x0111:
        r10 = 3;	 Catch:{ all -> 0x0496 }
        if (r13 != r10) goto L_0x0126;	 Catch:{ all -> 0x0496 }
    L_0x0114:
        installCrossDexHooks();	 Catch:{ Exception -> 0x0118 }
        goto L_0x0126;	 Catch:{ Exception -> 0x0118 }
    L_0x0118:
        r14 = move-exception;
        r12 = "dex store %s needs xdex hooks, but we can't do it: regenerating";	 Catch:{ all -> 0x0496 }
        r5 = 1;	 Catch:{ all -> 0x0496 }
        r10 = new java.lang.Object[r5];	 Catch:{ all -> 0x0496 }
        r5 = r1.root;	 Catch:{ all -> 0x0496 }
        r10[r11] = r5;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m59w(r14, r12, r10);	 Catch:{ all -> 0x0496 }
        r5 = 2;	 Catch:{ all -> 0x0496 }
    L_0x0126:
        if (r5 <= 0) goto L_0x0196;	 Catch:{ all -> 0x0496 }
    L_0x0128:
        r15 = 58;	 Catch:{ all -> 0x0496 }
        r10 = r7.dexes;	 Catch:{ all -> 0x0496 }
        r10 = r10.length;	 Catch:{ all -> 0x0496 }
        if (r10 <= r15) goto L_0x0149;	 Catch:{ all -> 0x0496 }
    L_0x012f:
        r14 = "too many dexes, forcing turbo mode: have %s but maximum per dex store is %s";	 Catch:{ all -> 0x0496 }
        r10 = 2;	 Catch:{ all -> 0x0496 }
        r12 = new java.lang.Object[r10];	 Catch:{ all -> 0x0496 }
        r10 = r7.dexes;	 Catch:{ all -> 0x0496 }
        r10 = r10.length;	 Catch:{ all -> 0x0496 }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x0496 }
        r12[r11] = r10;	 Catch:{ all -> 0x0496 }
        r15 = java.lang.Integer.valueOf(r15);	 Catch:{ all -> 0x0496 }
        r10 = 1;	 Catch:{ all -> 0x0496 }
        r12[r10] = r15;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m58w(r14, r12);	 Catch:{ all -> 0x0496 }
        r6 = r36 | 1;	 Catch:{ all -> 0x0496 }
    L_0x0149:
        writeTxFailedStatusLocked(r1, r2);	 Catch:{ all -> 0x0496 }
        r12 = new java.io.File;	 Catch:{ all -> 0x0496 }
        r14 = r1.root;	 Catch:{ all -> 0x0496 }
        r10 = "regen_stamp";	 Catch:{ all -> 0x0496 }
        r12.<init>(r14, r10);	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Fs.deleteRecursive(r12);	 Catch:{ all -> 0x0496 }
        r10 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0496 }
        r10.<init>(r12);	 Catch:{ all -> 0x0496 }
        r10.close();	 Catch:{ all -> 0x0496 }
        r12 = new java.io.File;	 Catch:{ all -> 0x0496 }
        r14 = r1.root;	 Catch:{ all -> 0x0496 }
        r10 = "odex_lock";	 Catch:{ all -> 0x0496 }
        r12.<init>(r14, r10);	 Catch:{ all -> 0x0496 }
        r10 = r12.exists();	 Catch:{ all -> 0x0496 }
        if (r10 == 0) goto L_0x0192;	 Catch:{ all -> 0x0496 }
    L_0x016f:
        r10 = com.facebook.common.dextricks.ReentrantLockFile.open(r12);	 Catch:{ all -> 0x0496 }
        r11 = r10.acquire(r11);	 Catch:{ Throwable -> 0x0183, all -> 0x0180 }
        r11.close();	 Catch:{ Throwable -> 0x0183, all -> 0x0180 }
        if (r10 == 0) goto L_0x0192;	 Catch:{ Throwable -> 0x0183, all -> 0x0180 }
    L_0x017c:
        r10.close();	 Catch:{ all -> 0x0496 }
        goto L_0x0192;	 Catch:{ all -> 0x0496 }
    L_0x0180:
        r1 = move-exception;
        r0 = 0;
        goto L_0x0186;
    L_0x0183:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0185 }
    L_0x0185:
        r1 = move-exception;
    L_0x0186:
        if (r10 == 0) goto L_0x0191;
    L_0x0188:
        if (r0 == 0) goto L_0x018e;
    L_0x018a:
        r10.close();	 Catch:{ Throwable -> 0x0191 }
        goto L_0x0191;	 Catch:{ Throwable -> 0x0191 }
    L_0x018e:
        r10.close();	 Catch:{ all -> 0x0496 }
    L_0x0191:
        throw r1;	 Catch:{ all -> 0x0496 }
    L_0x0192:
        r10 = 1;	 Catch:{ all -> 0x0496 }
        r29 = 1;	 Catch:{ all -> 0x0496 }
        goto L_0x0199;	 Catch:{ all -> 0x0496 }
    L_0x0196:
        r10 = 1;	 Catch:{ all -> 0x0496 }
        r29 = 0;	 Catch:{ all -> 0x0496 }
    L_0x0199:
        if (r5 != r10) goto L_0x01e0;	 Catch:{ all -> 0x0496 }
    L_0x019b:
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0496 }
        r10.<init>();	 Catch:{ all -> 0x0496 }
        r5 = "DLL2_regen_missing_";	 Catch:{ all -> 0x0496 }
        r10.append(r5);	 Catch:{ all -> 0x0496 }
        r10.append(r4);	 Catch:{ all -> 0x0496 }
        r10 = r10.toString();	 Catch:{ all -> 0x0496 }
        r5 = 8912902; // 0x880006 float:1.2489636E-38 double:4.4035587E-317;	 Catch:{ all -> 0x0496 }
        r15 = r9.mo28A(r10, r5);	 Catch:{ all -> 0x0496 }
        r5 = 1;	 Catch:{ all -> 0x0496 }
        r1.runCompiler(r7, r4, r5);	 Catch:{ Exception -> 0x01be }
        r5 = 0;	 Catch:{ Exception -> 0x01be }
        goto L_0x01cc;	 Catch:{ Exception -> 0x01be }
    L_0x01b9:
        r1 = move-exception;
        r0 = 0;
        goto L_0x01d4;
    L_0x01bc:
        r0 = move-exception;
        goto L_0x01d2;
    L_0x01be:
        r12 = move-exception;
        r11 = "incremental regeneration error in dex store %s: regenerating";	 Catch:{ Throwable -> 0x01bc, all -> 0x01b9 }
        r10 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x01bc, all -> 0x01b9 }
        r5 = r1.root;	 Catch:{ Throwable -> 0x01bc, all -> 0x01b9 }
        r14 = 0;	 Catch:{ Throwable -> 0x01bc, all -> 0x01b9 }
        r10[r14] = r5;	 Catch:{ Throwable -> 0x01bc, all -> 0x01b9 }
        com.facebook.common.dextricks.Mlog.m59w(r12, r11, r10);	 Catch:{ Throwable -> 0x01bc, all -> 0x01b9 }
        r5 = 2;	 Catch:{ Throwable -> 0x01bc, all -> 0x01b9 }
    L_0x01cc:
        if (r15 == 0) goto L_0x01e0;	 Catch:{ Throwable -> 0x01bc, all -> 0x01b9 }
    L_0x01ce:
        r15.close();	 Catch:{ all -> 0x0496 }
        goto L_0x01e0;	 Catch:{ all -> 0x0496 }
    L_0x01d2:
        throw r0;	 Catch:{ all -> 0x01d3 }
    L_0x01d3:
        r1 = move-exception;
    L_0x01d4:
        if (r15 == 0) goto L_0x01df;
    L_0x01d6:
        if (r0 == 0) goto L_0x01dc;
    L_0x01d8:
        r15.close();	 Catch:{ Throwable -> 0x01df }
        goto L_0x01df;	 Catch:{ Throwable -> 0x01df }
    L_0x01dc:
        r15.close();	 Catch:{ all -> 0x0496 }
    L_0x01df:
        throw r1;	 Catch:{ all -> 0x0496 }
    L_0x01e0:
        r10 = 8;	 Catch:{ all -> 0x0496 }
        if (r5 == 0) goto L_0x032a;	 Catch:{ all -> 0x0496 }
    L_0x01e4:
        r1.saveDeps();	 Catch:{ all -> 0x0496 }
        r2 = r1.determineDesiredState(r13, r7);	 Catch:{ all -> 0x0496 }
        r3 = r6 & 1;	 Catch:{ all -> 0x0496 }
        if (r3 == 0) goto L_0x0208;	 Catch:{ all -> 0x0496 }
    L_0x01ef:
        r3 = 3;	 Catch:{ all -> 0x0496 }
        if (r2 == r3) goto L_0x01ff;	 Catch:{ all -> 0x0496 }
    L_0x01f2:
        if (r2 == r10) goto L_0x01f5;	 Catch:{ all -> 0x0496 }
    L_0x01f4:
        goto L_0x0208;	 Catch:{ all -> 0x0496 }
    L_0x01f5:
        r3 = "using ART turbo instead of ART xdex: DS_DO_NOT_OPTIMIZE";	 Catch:{ all -> 0x0496 }
        r2 = 0;	 Catch:{ all -> 0x0496 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m54i(r3, r2);	 Catch:{ all -> 0x0496 }
        r2 = 7;	 Catch:{ all -> 0x0496 }
        goto L_0x0208;	 Catch:{ all -> 0x0496 }
    L_0x01ff:
        r3 = "using Dalvik turbo instead of xdex: DS_DO_NOT_OPTIMIZE";	 Catch:{ all -> 0x0496 }
        r2 = 0;	 Catch:{ all -> 0x0496 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m54i(r3, r2);	 Catch:{ all -> 0x0496 }
        r2 = 4;	 Catch:{ all -> 0x0496 }
    L_0x0208:
        r13 = new java.io.File;	 Catch:{ all -> 0x0496 }
        r11 = r1.root;	 Catch:{ all -> 0x0496 }
        r3 = "config";	 Catch:{ all -> 0x0496 }
        r13.<init>(r11, r3);	 Catch:{ all -> 0x0496 }
        r3 = com.facebook.common.dextricks.DexStore.Config.read(r13);	 Catch:{ FileNotFoundException -> 0x0221 }
        r12 = "loaded config file %s";	 Catch:{ FileNotFoundException -> 0x0221 }
        r11 = 1;	 Catch:{ FileNotFoundException -> 0x0221 }
        r11 = new java.lang.Object[r11];	 Catch:{ FileNotFoundException -> 0x0221 }
        r14 = 0;	 Catch:{ FileNotFoundException -> 0x0221 }
        r11[r14] = r13;	 Catch:{ FileNotFoundException -> 0x0221 }
        com.facebook.common.dextricks.Mlog.m56v(r12, r11);	 Catch:{ FileNotFoundException -> 0x0221 }
        goto L_0x024b;	 Catch:{ FileNotFoundException -> 0x0221 }
    L_0x0221:
        r13 = "no config file for repository %s found: using all-default configuration";	 Catch:{ all -> 0x0496 }
        r3 = 1;	 Catch:{ all -> 0x0496 }
        r12 = new java.lang.Object[r3];	 Catch:{ all -> 0x0496 }
        r11 = r1.root;	 Catch:{ all -> 0x0496 }
        r3 = 0;	 Catch:{ all -> 0x0496 }
        r12[r3] = r11;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r13, r12);	 Catch:{ all -> 0x0496 }
        r3 = new com.facebook.common.dextricks.DexStore$Config;	 Catch:{ all -> 0x0496 }
        r18 = 0;	 Catch:{ all -> 0x0496 }
        r19 = 0;	 Catch:{ all -> 0x0496 }
        r20 = 0;	 Catch:{ all -> 0x0496 }
        r21 = 0;	 Catch:{ all -> 0x0496 }
        r22 = 0;	 Catch:{ all -> 0x0496 }
        r23 = 0;	 Catch:{ all -> 0x0496 }
        r24 = -1;	 Catch:{ all -> 0x0496 }
        r25 = -1;	 Catch:{ all -> 0x0496 }
        r26 = -1;	 Catch:{ all -> 0x0496 }
        r27 = -1;	 Catch:{ all -> 0x0496 }
        r28 = -1;	 Catch:{ all -> 0x0496 }
        r17 = r3;	 Catch:{ all -> 0x0496 }
        r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);	 Catch:{ all -> 0x0496 }
    L_0x024b:
        r11 = r3.sync;	 Catch:{ all -> 0x0496 }
        switch(r11) {
            case 0: goto L_0x0279;
            case 1: goto L_0x0260;
            case 2: goto L_0x0254;
            default: goto L_0x0250;
        };	 Catch:{ all -> 0x0496 }
    L_0x0250:
        r13 = "config file has unknown sync control mode %s: ignoring";	 Catch:{ all -> 0x0496 }
        r10 = 1;	 Catch:{ all -> 0x0496 }
        goto L_0x026b;	 Catch:{ all -> 0x0496 }
    L_0x0254:
        r12 = "forcing synchronous optimization from config file";	 Catch:{ all -> 0x0496 }
        r11 = 0;	 Catch:{ all -> 0x0496 }
        r11 = new java.lang.Object[r11];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m54i(r12, r11);	 Catch:{ all -> 0x0496 }
        r6 = r6 & -5;	 Catch:{ all -> 0x0496 }
        r6 = r6 | r10;	 Catch:{ all -> 0x0496 }
        goto L_0x0279;	 Catch:{ all -> 0x0496 }
    L_0x0260:
        r11 = "forcing async optimization mode from config file: dangerous!";	 Catch:{ all -> 0x0496 }
        r10 = 0;	 Catch:{ all -> 0x0496 }
        r10 = new java.lang.Object[r10];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m58w(r11, r10);	 Catch:{ all -> 0x0496 }
        r6 = r6 | 4;	 Catch:{ all -> 0x0496 }
        goto L_0x0279;	 Catch:{ all -> 0x0496 }
    L_0x026b:
        r12 = new java.lang.Object[r10];	 Catch:{ all -> 0x0496 }
        r10 = r3.sync;	 Catch:{ all -> 0x0496 }
        r11 = java.lang.Byte.valueOf(r10);	 Catch:{ all -> 0x0496 }
        r10 = 0;	 Catch:{ all -> 0x0496 }
        r12[r10] = r11;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m58w(r13, r12);	 Catch:{ all -> 0x0496 }
    L_0x0279:
        r10 = r1.adjustDesiredStateForConfig(r2, r3);	 Catch:{ all -> 0x0496 }
        r2 = 3;	 Catch:{ all -> 0x0496 }
        if (r10 != r2) goto L_0x0290;	 Catch:{ all -> 0x0496 }
    L_0x0280:
        installCrossDexHooks();	 Catch:{ Exception -> 0x0284 }
        goto L_0x0290;	 Catch:{ Exception -> 0x0284 }
    L_0x0284:
        r10 = move-exception;
        r3 = "disabling cross-dex optimization: cannot install hooks";	 Catch:{ all -> 0x0496 }
        r2 = 0;	 Catch:{ all -> 0x0496 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m59w(r10, r3, r2);	 Catch:{ all -> 0x0496 }
        r8.xdexFailureCause = r10;	 Catch:{ all -> 0x0496 }
        r10 = 4;	 Catch:{ all -> 0x0496 }
    L_0x0290:
        r12 = "desiredStateNo:%s";	 Catch:{ all -> 0x0496 }
        r2 = 1;	 Catch:{ all -> 0x0496 }
        r11 = new java.lang.Object[r2];	 Catch:{ all -> 0x0496 }
        r3 = java.lang.Byte.valueOf(r10);	 Catch:{ all -> 0x0496 }
        r2 = 0;	 Catch:{ all -> 0x0496 }
        r11[r2] = r3;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r12, r11);	 Catch:{ all -> 0x0496 }
    L_0x029f:
        if (r5 == 0) goto L_0x0329;	 Catch:{ all -> 0x0496 }
    L_0x02a1:
        r2 = 2;	 Catch:{ all -> 0x0496 }
        if (r5 < r2) goto L_0x02a6;	 Catch:{ all -> 0x0496 }
    L_0x02a4:
        r4 = 1;	 Catch:{ all -> 0x0496 }
        goto L_0x02a7;	 Catch:{ all -> 0x0496 }
    L_0x02a6:
        r4 = 0;	 Catch:{ all -> 0x0496 }
    L_0x02a7:
        r3 = "incremental regen already handled";	 Catch:{ all -> 0x0496 }
        r2 = 0;	 Catch:{ all -> 0x0496 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.assertThat(r4, r3, r2);	 Catch:{ all -> 0x0496 }
        r2 = (long) r10;	 Catch:{ all -> 0x0496 }
        r4 = r1.schemeForState(r7, r2);	 Catch:{ all -> 0x0496 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x030e }
        r3.<init>();	 Catch:{ Exception -> 0x030e }
        r2 = "DLL2_regen_all_";	 Catch:{ Exception -> 0x030e }
        r3.append(r2);	 Catch:{ Exception -> 0x030e }
        r3.append(r4);	 Catch:{ Exception -> 0x030e }
        r3 = r3.toString();	 Catch:{ Exception -> 0x030e }
        r2 = 8912903; // 0x880007 float:1.2489637E-38 double:4.403559E-317;	 Catch:{ Exception -> 0x030e }
        r12 = r9.mo28A(r3, r2);	 Catch:{ Exception -> 0x030e }
        r2 = r16;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r1.deleteFiles(r2);	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r11 = new java.io.File;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r3 = r1.root;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r2 = "optimization_log";	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r11.<init>(r3, r2);	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r11.delete();	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r3 = r4.flags;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r2 = 16;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r3 = r3 & r2;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        if (r3 == 0) goto L_0x02ed;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
    L_0x02e4:
        r3 = "not running dex compiler: scheme says there is nothing to do";	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r2 = 0;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        com.facebook.common.dextricks.Mlog.m54i(r3, r2);	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        goto L_0x02f1;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
    L_0x02ed:
        r2 = 0;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
        r1.runCompiler(r7, r4, r2);	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
    L_0x02f1:
        if (r12 == 0) goto L_0x02fa;	 Catch:{ Throwable -> 0x02ff, all -> 0x02fc }
    L_0x02f3:
        r12.close();	 Catch:{ Exception -> 0x02f7 }
        goto L_0x02fa;	 Catch:{ Exception -> 0x02f7 }
    L_0x02f7:
        r12 = move-exception;
        r5 = 0;
        goto L_0x030f;
    L_0x02fa:
        r5 = 0;
        goto L_0x029f;
    L_0x02fc:
        r3 = move-exception;
        r2 = 0;
        goto L_0x0302;
    L_0x02ff:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0301 }
    L_0x0301:
        r3 = move-exception;
    L_0x0302:
        if (r12 == 0) goto L_0x030d;
    L_0x0304:
        if (r2 == 0) goto L_0x030a;
    L_0x0306:
        r12.close();	 Catch:{ Throwable -> 0x030d }
        goto L_0x030d;	 Catch:{ Throwable -> 0x030d }
    L_0x030a:
        r12.close();	 Catch:{ Exception -> 0x030e }
    L_0x030d:
        throw r3;	 Catch:{ Exception -> 0x030e }
    L_0x030e:
        r12 = move-exception;
    L_0x030f:
        r2 = 2;
        if (r10 == r2) goto L_0x0328;
    L_0x0312:
        r11 = "dex store %s: failed turbodex: using fallback";	 Catch:{ all -> 0x0496 }
        r2 = 1;	 Catch:{ all -> 0x0496 }
        r10 = new java.lang.Object[r2];	 Catch:{ all -> 0x0496 }
        r3 = r1.root;	 Catch:{ all -> 0x0496 }
        r2 = 0;	 Catch:{ all -> 0x0496 }
        r10[r2] = r3;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m59w(r12, r11, r10);	 Catch:{ all -> 0x0496 }
        r8.fallbackCause = r12;	 Catch:{ all -> 0x0496 }
        r16 = r1.listAndPruneRootFiles();	 Catch:{ all -> 0x0496 }
        r10 = 2;	 Catch:{ all -> 0x0496 }
        goto L_0x029f;	 Catch:{ all -> 0x0496 }
    L_0x0328:
        throw r12;	 Catch:{ all -> 0x0496 }
    L_0x0329:
        r2 = (long) r10;	 Catch:{ all -> 0x0496 }
    L_0x032a:
        r11 = 1;	 Catch:{ all -> 0x0496 }
        r10 = "next step should be LA_LOAD_EXISTING";	 Catch:{ all -> 0x0496 }
        r5 = 0;	 Catch:{ all -> 0x0496 }
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.assertThat(r11, r10, r5);	 Catch:{ all -> 0x0496 }
        r5 = r6 & 4;	 Catch:{ all -> 0x0496 }
        if (r5 == 0) goto L_0x0339;	 Catch:{ all -> 0x0496 }
    L_0x0337:
        r14 = 1;	 Catch:{ all -> 0x0496 }
        goto L_0x033a;	 Catch:{ all -> 0x0496 }
    L_0x0339:
        r14 = 0;	 Catch:{ all -> 0x0496 }
    L_0x033a:
        if (r14 == 0) goto L_0x034d;	 Catch:{ all -> 0x0496 }
    L_0x033c:
        r28 = r1;	 Catch:{ all -> 0x0496 }
        r11 = 2;	 Catch:{ all -> 0x0496 }
        r30 = r4;	 Catch:{ all -> 0x0496 }
        r31 = r7;	 Catch:{ all -> 0x0496 }
        r32 = r9;	 Catch:{ all -> 0x0496 }
        r33 = r38;	 Catch:{ all -> 0x0496 }
        r34 = r6;	 Catch:{ all -> 0x0496 }
        r28.loadDexFiles(r29, r30, r31, r32, r33, r34);	 Catch:{ all -> 0x0496 }
        goto L_0x034e;	 Catch:{ all -> 0x0496 }
    L_0x034d:
        r11 = 2;	 Catch:{ all -> 0x0496 }
    L_0x034e:
        if (r29 == 0) goto L_0x03fa;	 Catch:{ all -> 0x0496 }
    L_0x0350:
        if (r14 == 0) goto L_0x038f;	 Catch:{ all -> 0x0496 }
    L_0x0352:
        r10 = "about to start syncer thread";	 Catch:{ all -> 0x0496 }
        r5 = 0;	 Catch:{ all -> 0x0496 }
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r10, r5);	 Catch:{ all -> 0x0496 }
        r10 = new com.facebook.common.dextricks.DexStore$FinishRegenerationThread;	 Catch:{ all -> 0x0496 }
        r32 = r10;	 Catch:{ all -> 0x0496 }
        r33 = r1;	 Catch:{ all -> 0x0496 }
        r34 = r4;	 Catch:{ all -> 0x0496 }
        r36 = r2;	 Catch:{ all -> 0x0496 }
        r32.<init>(r34, r35, r36);	 Catch:{ all -> 0x0496 }
        r5 = r1.mLockFile;	 Catch:{ all -> 0x0496 }
        r5.donateLock(r10);	 Catch:{ all -> 0x0496 }
        r10.start();	 Catch:{ all -> 0x0380 }
        r10 = "started syncer thread";	 Catch:{ all -> 0x037b }
        r5 = 0;	 Catch:{ all -> 0x037b }
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x037b }
        com.facebook.common.dextricks.Mlog.m56v(r10, r5);	 Catch:{ all -> 0x037b }
        r35 = 0;	 Catch:{ all -> 0x037b }
        goto L_0x03fa;	 Catch:{ all -> 0x037b }
    L_0x037b:
        r0 = move-exception;
        r35 = 0;
        goto L_0x0497;
    L_0x0380:
        r3 = move-exception;
        r2 = "failed to start syncer thread";	 Catch:{ all -> 0x0496 }
        r0 = 0;	 Catch:{ all -> 0x0496 }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m58w(r2, r0);	 Catch:{ all -> 0x0496 }
        r0 = r1.mLockFile;	 Catch:{ all -> 0x0496 }
        r0.stealLock();	 Catch:{ all -> 0x0496 }
        throw r3;	 Catch:{ all -> 0x0496 }
    L_0x038f:
        r13 = "fsyncing just-regenerated dex store %s in foreground as requested";	 Catch:{ all -> 0x0496 }
        r5 = 1;	 Catch:{ all -> 0x0496 }
        r12 = new java.lang.Object[r5];	 Catch:{ all -> 0x0496 }
        r10 = r1.root;	 Catch:{ all -> 0x0496 }
        r5 = 0;	 Catch:{ all -> 0x0496 }
        r12[r5] = r10;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r13, r12);	 Catch:{ all -> 0x0496 }
        r10 = r1.root;	 Catch:{ all -> 0x0496 }
        r5 = com.facebook.common.dextricks.Prio.unchanged();	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Fs.fsyncRecursive(r10, r5);	 Catch:{ all -> 0x0496 }
        r1.writeStatusLocked(r2);	 Catch:{ all -> 0x0496 }
        r10 = "dex store sync completed";	 Catch:{ all -> 0x0496 }
        r12 = 0;	 Catch:{ all -> 0x0496 }
        r5 = new java.lang.Object[r12];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r10, r5);	 Catch:{ all -> 0x0496 }
        r5 = r4.flags;	 Catch:{ all -> 0x0496 }
        r5 = r5 & 4;	 Catch:{ all -> 0x0496 }
        if (r5 != 0) goto L_0x03bf;	 Catch:{ all -> 0x0496 }
    L_0x03b6:
        r10 = "optimizing in foreground";	 Catch:{ all -> 0x0496 }
        r5 = new java.lang.Object[r12];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r10, r5);	 Catch:{ all -> 0x0496 }
    L_0x03bd:
        r5 = 1;	 Catch:{ all -> 0x0496 }
        goto L_0x03d5;	 Catch:{ all -> 0x0496 }
    L_0x03bf:
        r5 = r6 & 8;	 Catch:{ all -> 0x0496 }
        if (r5 == 0) goto L_0x03cc;	 Catch:{ all -> 0x0496 }
    L_0x03c3:
        r10 = "optimizing in foreground despite expense: forced";	 Catch:{ all -> 0x0496 }
        r5 = 0;	 Catch:{ all -> 0x0496 }
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r10, r5);	 Catch:{ all -> 0x0496 }
        goto L_0x03bd;	 Catch:{ all -> 0x0496 }
    L_0x03cc:
        r10 = "not optimizing in foreground: would be too expensive";	 Catch:{ all -> 0x0496 }
        r5 = 0;	 Catch:{ all -> 0x0496 }
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r10, r5);	 Catch:{ all -> 0x0496 }
        r5 = 0;	 Catch:{ all -> 0x0496 }
    L_0x03d5:
        if (r5 == 0) goto L_0x03fa;	 Catch:{ all -> 0x0496 }
    L_0x03d7:
        r15 = r1;	 Catch:{ all -> 0x0496 }
        r16 = r38;	 Catch:{ all -> 0x0496 }
        r17 = r7;	 Catch:{ all -> 0x0496 }
        r18 = r2;	 Catch:{ all -> 0x0496 }
        r15.optimizeInForegroundLocked(r16, r17, r18);	 Catch:{ all -> 0x0496 }
        r2 = readStatusLocked(r1);	 Catch:{ all -> 0x0496 }
        r4 = r1.schemeForState(r7, r2);	 Catch:{ all -> 0x0496 }
        r12 = "done optimizing in foreground: new status %x scheme %s";	 Catch:{ all -> 0x0496 }
        r11 = new java.lang.Object[r11];	 Catch:{ all -> 0x0496 }
        r10 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0496 }
        r5 = 0;	 Catch:{ all -> 0x0496 }
        r11[r5] = r10;	 Catch:{ all -> 0x0496 }
        r5 = 1;	 Catch:{ all -> 0x0496 }
        r11[r5] = r4;	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r12, r11);	 Catch:{ all -> 0x0496 }
    L_0x03fa:
        if (r14 != 0) goto L_0x0409;	 Catch:{ all -> 0x0496 }
    L_0x03fc:
        r10 = r1;	 Catch:{ all -> 0x0496 }
        r11 = r29;	 Catch:{ all -> 0x0496 }
        r12 = r4;	 Catch:{ all -> 0x0496 }
        r13 = r7;	 Catch:{ all -> 0x0496 }
        r14 = r9;	 Catch:{ all -> 0x0496 }
        r15 = r38;	 Catch:{ all -> 0x0496 }
        r16 = r6;	 Catch:{ all -> 0x0496 }
        r10.loadDexFiles(r11, r12, r13, r14, r15, r16);	 Catch:{ all -> 0x0496 }
    L_0x0409:
        r5 = "dexopt";	 Catch:{ Throwable -> 0x042e }
        r7 = r1.makeTemporaryDirectory(r5);	 Catch:{ Throwable -> 0x042e }
        r5 = r1.root;	 Catch:{ Throwable -> 0x041f, all -> 0x041c }
        r5 = r4.loadInformationalStatus(r5, r2);	 Catch:{ Throwable -> 0x041f, all -> 0x041c }
        r0 = r0 | r5;	 Catch:{ Throwable -> 0x041f, all -> 0x041c }
        if (r7 == 0) goto L_0x0437;	 Catch:{ Throwable -> 0x041f, all -> 0x041c }
    L_0x0418:
        r7.close();	 Catch:{ Throwable -> 0x042e }
        goto L_0x0437;	 Catch:{ Throwable -> 0x042e }
    L_0x041c:
        r6 = move-exception;
        r5 = 0;
        goto L_0x0422;
    L_0x041f:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0421 }
    L_0x0421:
        r6 = move-exception;
    L_0x0422:
        if (r7 == 0) goto L_0x042d;
    L_0x0424:
        if (r5 == 0) goto L_0x042a;
    L_0x0426:
        r7.close();	 Catch:{ Throwable -> 0x042d }
        goto L_0x042d;	 Catch:{ Throwable -> 0x042d }
    L_0x042a:
        r7.close();	 Catch:{ Throwable -> 0x042e }
    L_0x042d:
        throw r6;	 Catch:{ Throwable -> 0x042e }
    L_0x042e:
        r7 = move-exception;
        r6 = "Failure while checking oat file provenance.";	 Catch:{ all -> 0x0496 }
        r5 = 0;	 Catch:{ all -> 0x0496 }
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m53e(r7, r6, r5);	 Catch:{ all -> 0x0496 }
    L_0x0437:
        r5 = r4.getSchemeName();	 Catch:{ all -> 0x0496 }
        r8.odexSchemeName = r5;	 Catch:{ all -> 0x0496 }
        if (r29 == 0) goto L_0x0441;	 Catch:{ all -> 0x0496 }
    L_0x043f:
        r0 = r0 | 1;	 Catch:{ all -> 0x0496 }
    L_0x0441:
        r6 = r4.flags;	 Catch:{ all -> 0x0496 }
        r5 = 8;	 Catch:{ all -> 0x0496 }
        r6 = r6 & r5;	 Catch:{ all -> 0x0496 }
        if (r6 == 0) goto L_0x044a;	 Catch:{ all -> 0x0496 }
    L_0x0448:
        r0 = r0 | 8;	 Catch:{ all -> 0x0496 }
    L_0x044a:
        r5 = r4.needOptimization(r2);	 Catch:{ all -> 0x0496 }
        if (r5 == 0) goto L_0x0472;	 Catch:{ all -> 0x0496 }
    L_0x0450:
        r0 = r0 | 2;	 Catch:{ all -> 0x0496 }
        r2 = r4.loadNotOptimized(r2);	 Catch:{ all -> 0x0496 }
        if (r2 == 0) goto L_0x045a;	 Catch:{ all -> 0x0496 }
    L_0x0458:
        r0 = r0 | 8;	 Catch:{ all -> 0x0496 }
    L_0x045a:
        r3 = "optimization needed: yes";	 Catch:{ all -> 0x0496 }
        r5 = 0;	 Catch:{ all -> 0x0496 }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r3, r2);	 Catch:{ all -> 0x0496 }
        r2 = r4.flags;	 Catch:{ all -> 0x0496 }
        r2 = r2 & 4;	 Catch:{ all -> 0x0496 }
        if (r2 == 0) goto L_0x047a;	 Catch:{ all -> 0x0496 }
    L_0x0468:
        r3 = "... but optimization is very expensive";	 Catch:{ all -> 0x0496 }
        r2 = new java.lang.Object[r5];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r3, r2);	 Catch:{ all -> 0x0496 }
        r0 = r0 | 4;	 Catch:{ all -> 0x0496 }
        goto L_0x047a;	 Catch:{ all -> 0x0496 }
    L_0x0472:
        r3 = "optimization needed: no";	 Catch:{ all -> 0x0496 }
        r2 = 0;	 Catch:{ all -> 0x0496 }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0496 }
        com.facebook.common.dextricks.Mlog.m56v(r3, r2);	 Catch:{ all -> 0x0496 }
    L_0x047a:
        r8.loadResult = r0;	 Catch:{ all -> 0x0496 }
        r1.mLastDeri = r8;	 Catch:{ all -> 0x0496 }
        if (r35 == 0) goto L_0x0483;	 Catch:{ all -> 0x0496 }
    L_0x0480:
        r35.close();
    L_0x0483:
        return r8;
    L_0x0484:
        r1 = move-exception;
        r0 = 0;
        goto L_0x048a;
    L_0x0487:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0489 }
    L_0x0489:
        r1 = move-exception;
    L_0x048a:
        if (r14 == 0) goto L_0x0495;
    L_0x048c:
        if (r0 == 0) goto L_0x0492;
    L_0x048e:
        r14.close();	 Catch:{ Throwable -> 0x0495 }
        goto L_0x0495;	 Catch:{ Throwable -> 0x0495 }
    L_0x0492:
        r14.close();	 Catch:{ all -> 0x0496 }
    L_0x0495:
        throw r1;	 Catch:{ all -> 0x0496 }
    L_0x0496:
        r0 = move-exception;
    L_0x0497:
        if (r35 == 0) goto L_0x049c;
    L_0x0499:
        r35.close();
    L_0x049c:
        throw r0;
    L_0x049d:
        r1 = move-exception;
        r0 = 0;
        goto L_0x04a3;
    L_0x04a0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x04a2 }
    L_0x04a2:
        r1 = move-exception;
    L_0x04a3:
        if (r2 == 0) goto L_0x04ae;
    L_0x04a5:
        if (r0 == 0) goto L_0x04ab;
    L_0x04a7:
        r2.close();	 Catch:{ Throwable -> 0x04ae }
        goto L_0x04ae;	 Catch:{ Throwable -> 0x04ae }
    L_0x04ab:
        r2.close();
    L_0x04ae:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAllImpl(int, X.00i, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    private void loadDexFiles(boolean r18, com.facebook.common.dextricks.OdexScheme r19, com.facebook.common.dextricks.DexManifest r20, X.AnonymousClass00i r21, android.content.Context r22, int r23) {
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
        r17 = this;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        if (r18 == 0) goto L_0x000a;
    L_0x0007:
        r0 = "DLL2_multidex_class_loader_first_";
        goto L_0x000c;
    L_0x000a:
        r0 = "DLL2_multidex_class_loader_subsequent_";
    L_0x000c:
        r1.append(r0);
        r4 = r19;
        r1.append(r4);
        r1 = r1.toString();
        if (r18 == 0) goto L_0x001e;
    L_0x001a:
        r0 = 8912905; // 0x880009 float:1.248964E-38 double:4.40356E-317;
        goto L_0x0021;
    L_0x001e:
        r0 = 8912904; // 0x880008 float:1.2489639E-38 double:4.4035597E-317;
    L_0x0021:
        r2 = r21;
        r10 = r2.mo28A(r1, r0);
        r3 = r20;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r2 = r3.locators;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r1 = 1;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r0 = 0;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        if (r2 == 0) goto L_0x0031;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x002f:
        r12 = 1;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        goto L_0x0032;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x0031:
        r12 = 0;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x0032:
        r2 = r23 & 16;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        if (r2 == 0) goto L_0x0038;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x0036:
        r12 = r12 | 2;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x0038:
        r2 = r22;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r15 = com.facebook.common.dextricks.StartupQEsConfig.getCurrentStartupQEsConfig(r2);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r6 = "Read SetupStartupQEsConfig for MDCL Configure: %s";	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5[r0] = r15;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        com.facebook.common.dextricks.Mlog.m54i(r6, r5);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5 = "fb4a_art_execute_goto_impl_enabled";	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r13 = checkAndClearGk(r2, r5);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5 = "fb4a_will_need_for_dex_file_enabled";	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5 = r2.getFileStreamPath(r5);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r16 = r5.exists();	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r11 = new com.facebook.common.dextricks.MultiDexClassLoader$Configuration;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r14 = com.facebook.common.dextricks.DalvikConstants.FB_REDEX_COLD_START_SET_DEX_COUNT;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5 = r11;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r11.<init>(r12, r13, r14, r15, r16);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r7 = r11.getNumberConfiguredDexFiles();	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r6 = r17;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r8 = r6.root;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r4.configureClassLoader(r8, r11);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r8 = sMergedDexConfig;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        if (r8 != 0) goto L_0x0078;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x006e:
        r11 = new com.facebook.common.dextricks.MultiDexClassLoader$Configuration;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r12 = 0;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r14 = com.facebook.common.dextricks.DalvikConstants.FB_REDEX_COLD_START_SET_DEX_COUNT;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r11.<init>(r12, r13, r14, r15, r16);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        sMergedDexConfig = r11;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x0078:
        mergeConfiguration(r5, r3);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r8 = r6.primaryDexes;	 Catch:{ Throwable -> 0x0095, all -> 0x00e7 }
        r5 = r6.auxiliaryDexes;	 Catch:{ Throwable -> 0x0095, all -> 0x00e7 }
        r5 = com.facebook.common.dextricks.MultiDexClassLoader.install(r2, r8, r5, r15);	 Catch:{ Throwable -> 0x0095, all -> 0x00e7 }
        r2 = sMergedDexConfig;	 Catch:{ Throwable -> 0x0095, all -> 0x00e7 }
        r5.configure(r2);	 Catch:{ Throwable -> 0x0095, all -> 0x00e7 }
        if (r18 == 0) goto L_0x008d;	 Catch:{ Throwable -> 0x0095, all -> 0x00e7 }
    L_0x008a:
        r6.verifyCanaryClasses(r3);	 Catch:{ Throwable -> 0x0095, all -> 0x00e7 }
    L_0x008d:
        r6.mLoadedManifest = r3;	 Catch:{ Throwable -> 0x0095, all -> 0x00e7 }
        if (r10 == 0) goto L_0x0094;	 Catch:{ Throwable -> 0x0095, all -> 0x00e7 }
    L_0x0091:
        r10.close();
    L_0x0094:
        return;
    L_0x0095:
        r3 = move-exception;
        r9 = 2;
        r2 = r23 & 2;
        if (r2 != 0) goto L_0x00a6;
    L_0x009b:
        r2 = sMergedDexConfig;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r2 = r2.getNumberConfiguredDexFiles();	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        if (r2 == r7) goto L_0x00a4;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00a3:
        goto L_0x00a6;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00a4:
        r8 = 0;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        goto L_0x00a7;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00a6:
        r8 = 1;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00a7:
        r7 = "%s error in store %s scheme %s regen %s";	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r2 = 4;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        if (r8 == 0) goto L_0x00b1;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00ae:
        r2 = "fatal";	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        goto L_0x00b3;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00b1:
        r2 = "recoverable";	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00b3:
        r5[r0] = r2;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r2 = r6.root;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5[r1] = r2;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5[r9] = r19;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r2 = 3;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r1 = java.lang.Boolean.valueOf(r18);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r5[r2] = r1;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        com.facebook.common.dextricks.Mlog.m53e(r3, r7, r5);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        if (r18 == 0) goto L_0x00cd;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00c7:
        r1 = 5;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r6.writeStatusLocked(r1);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        goto L_0x00d2;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00cd:
        r1 = 0;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r6.writeStatusLocked(r1);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00d2:
        if (r8 == 0) goto L_0x00da;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00d4:
        r0 = new com.facebook.common.dextricks.FatalDexError;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r0.<init>(r3);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00d9:
        throw r0;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00da:
        r1 = "retrying dex store load after reset";	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r0 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r0 = new com.facebook.common.dextricks.DexStore$RecoverableDexException;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        r0.<init>(r3);	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
        goto L_0x00d9;	 Catch:{ Throwable -> 0x00ea, all -> 0x00e7 }
    L_0x00e7:
        r1 = move-exception;
        r0 = 0;
        goto L_0x00ed;
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ec }
    L_0x00ec:
        r1 = move-exception;
    L_0x00ed:
        if (r10 == 0) goto L_0x00f8;
    L_0x00ef:
        if (r0 == 0) goto L_0x00f5;
    L_0x00f1:
        r10.close();	 Catch:{ Throwable -> 0x00f8 }
        goto L_0x00f8;	 Catch:{ Throwable -> 0x00f8 }
    L_0x00f5:
        r10.close();
    L_0x00f8:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadDexFiles(boolean, com.facebook.common.dextricks.OdexScheme, com.facebook.common.dextricks.DexManifest, X.00i, android.content.Context, int):void");
    }

    public com.facebook.common.dextricks.DexManifest loadManifest() {
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
        r4 = this;
        r0 = r4.mManifest;
        if (r0 != 0) goto L_0x0041;
    L_0x0004:
        monitor-enter(r4);
        r0 = r4.mManifest;	 Catch:{ all -> 0x003e }
        if (r0 != 0) goto L_0x003c;	 Catch:{ all -> 0x003e }
    L_0x0009:
        r1 = r4.mResProvider;	 Catch:{ all -> 0x003e }
        r0 = "metadata.txt";	 Catch:{ all -> 0x003e }
        r3 = r1.open(r0);	 Catch:{ all -> 0x003e }
        r2 = 0;	 Catch:{ all -> 0x003e }
        r1 = new com.facebook.common.dextricks.DexManifest;	 Catch:{ Throwable -> 0x0030 }
        r1.<init>(r3);	 Catch:{ Throwable -> 0x0030 }
        if (r3 == 0) goto L_0x001c;	 Catch:{ Throwable -> 0x0030 }
    L_0x0019:
        r3.close();	 Catch:{ all -> 0x003e }
    L_0x001c:
        r0 = r1.rootRelative;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x003e }
    L_0x0020:
        r0 = r4.mResProvider;	 Catch:{ all -> 0x003e }
        r0.markRootRelative();	 Catch:{ all -> 0x003e }
    L_0x0025:
        r0 = r1.id;	 Catch:{ all -> 0x003e }
        r4.id = r0;	 Catch:{ all -> 0x003e }
        r4.mManifest = r1;	 Catch:{ all -> 0x003e }
        goto L_0x003c;	 Catch:{ all -> 0x003e }
    L_0x002c:
        r0 = move-exception;
        if (r3 == 0) goto L_0x003b;
    L_0x002f:
        goto L_0x0032;
    L_0x0030:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x002c }
    L_0x0032:
        if (r2 == 0) goto L_0x0038;	 Catch:{ all -> 0x002c }
    L_0x0034:
        r3.close();	 Catch:{ Throwable -> 0x003b }
        goto L_0x003b;	 Catch:{ Throwable -> 0x003b }
    L_0x0038:
        r3.close();	 Catch:{ all -> 0x003e }
    L_0x003b:
        throw r0;	 Catch:{ all -> 0x003e }
    L_0x003c:
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        goto L_0x0041;	 Catch:{ all -> 0x003e }
    L_0x003e:
        r0 = move-exception;	 Catch:{ all -> 0x003e }
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        throw r0;
    L_0x0041:
        r0 = r4.mManifest;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadManifest():com.facebook.common.dextricks.DexManifest");
    }

    public com.facebook.common.dextricks.DexStore.TmpDir makeTemporaryDirectory(java.lang.String r13) {
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
        r12 = this;
        r0 = r12.mLockFile;
        r9 = 0;
        r11 = r0.acquire(r9);
        r0 = 0;
        r2 = ".tmpdir_lock";	 Catch:{ all -> 0x0078 }
        r1 = r12.root;	 Catch:{ all -> 0x0078 }
        r10 = java.io.File.createTempFile(r13, r2, r1);	 Catch:{ all -> 0x0078 }
        r8 = new java.io.File;	 Catch:{ all -> 0x0075 }
        r3 = r12.root;	 Catch:{ all -> 0x0075 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0075 }
        r2.<init>();	 Catch:{ all -> 0x0075 }
        r1 = r10.getName();	 Catch:{ all -> 0x0075 }
        r1 = com.facebook.common.dextricks.Fs.stripLastExtension(r1);	 Catch:{ all -> 0x0075 }
        r2.append(r1);	 Catch:{ all -> 0x0075 }
        r1 = ".tmpdir";	 Catch:{ all -> 0x0075 }
        r2.append(r1);	 Catch:{ all -> 0x0075 }
        r1 = r2.toString();	 Catch:{ all -> 0x0075 }
        r8.<init>(r3, r1);	 Catch:{ all -> 0x0075 }
        com.facebook.common.dextricks.Fs.mkdirOrThrow(r8);	 Catch:{ all -> 0x0075 }
        r7 = com.facebook.common.dextricks.ReentrantLockFile.open(r10);	 Catch:{ all -> 0x0072 }
        r6 = 1;	 Catch:{ all -> 0x0072 }
        r5 = r7.tryAcquire(r6);	 Catch:{ all -> 0x006f }
        if (r5 == 0) goto L_0x0067;	 Catch:{ all -> 0x006f }
    L_0x003e:
        r4 = new com.facebook.common.dextricks.DexStore$TmpDir;	 Catch:{ all -> 0x0065 }
        r4.<init>(r5, r8);	 Catch:{ all -> 0x0065 }
        r3 = "created tmpdir %s (lock file %s)";	 Catch:{ all -> 0x0065 }
        r1 = 2;	 Catch:{ all -> 0x0065 }
        r2 = new java.lang.Object[r1];	 Catch:{ all -> 0x0065 }
        r1 = r4.directory;	 Catch:{ all -> 0x0065 }
        r2[r9] = r1;	 Catch:{ all -> 0x0065 }
        r1 = r7.lockFileName;	 Catch:{ all -> 0x0065 }
        r2[r6] = r1;	 Catch:{ all -> 0x0065 }
        com.facebook.common.dextricks.Mlog.m56v(r3, r2);	 Catch:{ all -> 0x0065 }
        com.facebook.common.dextricks.Fs.safeClose(r0);	 Catch:{ Throwable -> 0x008e }
        com.facebook.common.dextricks.Fs.safeClose(r0);	 Catch:{ Throwable -> 0x008e }
        com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r0);	 Catch:{ Throwable -> 0x008e }
        com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r0);	 Catch:{ Throwable -> 0x008e }
        if (r11 == 0) goto L_0x0064;	 Catch:{ Throwable -> 0x008e }
    L_0x0061:
        r11.close();
    L_0x0064:
        return r4;
    L_0x0065:
        r1 = move-exception;
        goto L_0x007d;
    L_0x0067:
        r2 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0065 }
        r1 = "should have been able to acquire tmpdir lock";	 Catch:{ all -> 0x0065 }
        r2.<init>(r1);	 Catch:{ all -> 0x0065 }
        throw r2;	 Catch:{ all -> 0x0065 }
    L_0x006f:
        r1 = move-exception;
        r5 = r0;
        goto L_0x007d;
    L_0x0072:
        r1 = move-exception;
        r7 = r0;
        goto L_0x007c;
    L_0x0075:
        r1 = move-exception;
        r8 = r0;
        goto L_0x007b;
    L_0x0078:
        r1 = move-exception;
        r10 = r0;
        r8 = r0;
    L_0x007b:
        r7 = r0;
    L_0x007c:
        r5 = r0;
    L_0x007d:
        com.facebook.common.dextricks.Fs.safeClose(r5);	 Catch:{ Throwable -> 0x008e }
        com.facebook.common.dextricks.Fs.safeClose(r7);	 Catch:{ Throwable -> 0x008e }
        com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r10);	 Catch:{ Throwable -> 0x008e }
        com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r8);	 Catch:{ Throwable -> 0x008e }
        throw r1;	 Catch:{ Throwable -> 0x008e }
    L_0x008a:
        r1 = move-exception;
        if (r11 == 0) goto L_0x0099;
    L_0x008d:
        goto L_0x0090;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008a }
    L_0x0090:
        if (r0 == 0) goto L_0x0096;	 Catch:{ all -> 0x008a }
    L_0x0092:
        r11.close();	 Catch:{ Throwable -> 0x0099 }
        goto L_0x0099;	 Catch:{ Throwable -> 0x0099 }
    L_0x0096:
        r11.close();
    L_0x0099:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.makeTemporaryDirectory(java.lang.String):com.facebook.common.dextricks.DexStore$TmpDir");
    }

    private static void mergeConfiguration(Configuration configuration, DexManifest dexManifest) {
        int numberConfiguredDexFiles = sMergedDexConfig.getNumberConfiguredDexFiles() + 1;
        Configuration configuration2 = sMergedDexConfig;
        configuration2.setConfigFlags(configuration2.getConfigFlags() | configuration.getConfigFlags());
        sMergedDexConfig.addStoreId(dexManifest.locator_id, numberConfiguredDexFiles);
        ArrayList arrayList = configuration.mDexFiles;
        numberConfiguredDexFiles = arrayList.size();
        for (int i = 0; i < numberConfiguredDexFiles; i++) {
            sMergedDexConfig.addDex((DexFile) arrayList.get(i));
        }
        configuration.mDexFiles.clear();
    }

    public static boolean mixedModeEnabled(Context context) {
        boolean z;
        if (VERSION.SDK_INT >= 26) {
            z = false;
        } else {
            z = AnonymousClass0Db.m1232B(context, Experiments.ART_MIXEDMODE_GK_ENABLED_FILENAME);
        }
        String str = "mixed mode enabled: %s";
        Object[] objArr = new Object[1];
        objArr[0] = z ? "true" : "false";
        Mlog.m56v(str, objArr);
        return z;
    }

    public static boolean oatmealEnabled(Context context) {
        boolean z;
        String str;
        Object[] objArr;
        boolean B = AnonymousClass0Db.m1232B(context, Experiments.ART_OATMEAL_GK_ENABLED_FILENAME);
        if (!(AnonymousClass00r.f105E || AnonymousClass00r.f103C || DalvikConstants.FB_REDEX_VERIFY_NONE_ENABLED)) {
            if (!B) {
                z = false;
                str = "oatmeal enabled: %s";
                objArr = new Object[1];
                objArr[null] = z ? "true" : "false";
                Mlog.m56v(str, objArr);
                return z;
            }
        }
        z = true;
        str = "oatmeal enabled: %s";
        objArr = new Object[1];
        if (z) {
        }
        objArr[null] = z ? "true" : "false";
        Mlog.m56v(str, objArr);
        return z;
    }

    public static boolean oatmealQuickeningEnabled(Context context) {
        boolean B;
        String str;
        Object[] objArr;
        int i = VERSION.SDK_INT;
        if (i == 24 || i == 25) {
            if (oatmealEnabled(context)) {
                B = AnonymousClass0Db.m1232B(context, Experiments.ART_OATMEAL_QUICKENING_GK_ENABLED_FILENAME);
                str = "oatmeal quickening enabled: %s";
                objArr = new Object[1];
                objArr[0] = B ? "true" : "false";
                Mlog.m56v(str, objArr);
                return B;
            }
        }
        B = false;
        str = "oatmeal quickening enabled: %s";
        objArr = new Object[1];
        if (B) {
        }
        objArr[0] = B ? "true" : "false";
        Mlog.m56v(str, objArr);
        return B;
    }

    public static DexStore open(File file, File file2, ResProvider resProvider) {
        return open(file, file2, resProvider, new ArrayList(), new ArrayList());
    }

    public static synchronized DexStore open(File file, File file2, ResProvider resProvider, ArrayList arrayList, ArrayList arrayList2) {
        DexStore dexStoreListHead;
        synchronized (DexStore.class) {
            file = file.getAbsoluteFile();
            dexStoreListHead = dexStoreListHead();
            while (dexStoreListHead != null) {
                if (dexStoreListHead.root.equals(file)) {
                    break;
                }
                dexStoreListHead = dexStoreListHead.next;
            }
            dexStoreListHead = new DexStore(file, file2, resProvider, arrayList, arrayList2);
            sListHead = dexStoreListHead;
        }
        return dexStoreListHead;
    }

    private com.facebook.common.dextricks.InputDexIterator openDexIterator(com.facebook.common.dextricks.DexManifest r6) {
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
        r5 = this;
        r4 = 0;
        r0 = r5.id;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x0019;	 Catch:{ all -> 0x0049 }
    L_0x0005:
        r1 = r5.id;	 Catch:{ all -> 0x0049 }
        r0 = "dex";	 Catch:{ all -> 0x0049 }
        r0 = r1.equals(r0);	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x0010;	 Catch:{ all -> 0x0049 }
    L_0x000f:
        goto L_0x0019;	 Catch:{ all -> 0x0049 }
    L_0x0010:
        r1 = r5.id;	 Catch:{ all -> 0x0049 }
        r0 = ".dex.jar.xzs";	 Catch:{ all -> 0x0049 }
        r3 = r1.concat(r0);	 Catch:{ all -> 0x0049 }
        goto L_0x001b;	 Catch:{ all -> 0x0049 }
    L_0x0019:
        r3 = "secondary.dex.jar.xzs";	 Catch:{ all -> 0x0049 }
    L_0x001b:
        r0 = r5.mResProvider;	 Catch:{ FileNotFoundException -> 0x0021 }
        r4 = r0.open(r3);	 Catch:{ FileNotFoundException -> 0x0021 }
    L_0x0021:
        r2 = 0;
        r0 = 1;
        if (r4 == 0) goto L_0x0036;
    L_0x0025:
        r1 = "using solid xz dex store at %s";	 Catch:{ all -> 0x0047 }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0047 }
        r0[r2] = r3;	 Catch:{ all -> 0x0047 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ all -> 0x0047 }
        r1 = new com.facebook.common.dextricks.SolidXzInputDexIterator;	 Catch:{ all -> 0x0047 }
        r0 = r5.mResProvider;	 Catch:{ all -> 0x0047 }
        r1.<init>(r6, r0, r4);	 Catch:{ all -> 0x0047 }
        goto L_0x0046;	 Catch:{ all -> 0x0047 }
    L_0x0036:
        r1 = "using discrete file inputs for store, no file at %s";	 Catch:{ all -> 0x0047 }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0047 }
        r0[r2] = r3;	 Catch:{ all -> 0x0047 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ all -> 0x0047 }
        r1 = new com.facebook.common.dextricks.DiscreteFileInputDexIterator;	 Catch:{ all -> 0x0047 }
        r0 = r5.mResProvider;	 Catch:{ all -> 0x0047 }
        r1.<init>(r6, r0);	 Catch:{ all -> 0x0047 }
    L_0x0046:
        return r1;	 Catch:{ all -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        goto L_0x004a;
    L_0x0049:
        r0 = move-exception;
    L_0x004a:
        if (r4 == 0) goto L_0x004f;
    L_0x004c:
        com.facebook.common.dextricks.Fs.safeClose(r4);
    L_0x004f:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.openDexIterator(com.facebook.common.dextricks.DexManifest):com.facebook.common.dextricks.InputDexIterator");
    }

    public void optimize(android.content.Context r9, com.facebook.common.dextricks.OptimizationConfiguration.Provider r10, com.facebook.common.dextricks.DexStore.ProgressListener r11) {
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
        r8 = this;
        r5 = r8.mLoadedManifest;
        if (r5 != 0) goto L_0x0008;
    L_0x0004:
        r5 = r8.loadManifest();
    L_0x0008:
        r1 = "[opt] loaded manifets";
        r3 = 0;
        r0 = new java.lang.Object[r3];
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);
        r0 = r8.mLockFile;
        r7 = r0.acquireInterruptubly(r3);
        r2 = "[opt] locked dex store %s";
        r4 = 1;
        r1 = new java.lang.Object[r4];
        r0 = r8.root;
        r1[r3] = r0;
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);
        r6 = 0;
        r0 = readStatusLocked(r8);	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        r5 = r8.schemeForState(r5, r0);	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        r1 = "[opt] found scheme %s";	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        r0 = new java.lang.Object[r4];	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        r0[r3] = r5;	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        r0 = r8.checkDeps();	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        if (r0 == 0) goto L_0x007d;	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
    L_0x003a:
        r2 = new com.facebook.common.dextricks.DexStore$OptimizationSession;	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        r2.<init>(r10);	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        r1 = "[opt] opened optimization session";	 Catch:{ Throwable -> 0x0070 }
        r0 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x0070 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x0070 }
        r7.close();	 Catch:{ Throwable -> 0x0070 }
        r5.optimize(r9, r8, r2, r11);	 Catch:{ Throwable -> 0x0066, all -> 0x0063 }
        r2.noteOptimizationSuccess();	 Catch:{ Throwable -> 0x006b, all -> 0x0063 }
        r1 = "[opt] finished optimization session";	 Catch:{ Throwable -> 0x006b, all -> 0x0063 }
        r0 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x006b, all -> 0x0063 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x006b, all -> 0x0063 }
        r2.close();	 Catch:{ InterruptedException -> 0x0060, Throwable -> 0x005d, all -> 0x005a }
        return;	 Catch:{ InterruptedException -> 0x0060, Throwable -> 0x005d, all -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        r7 = r6;
        goto L_0x0094;
    L_0x005d:
        r2 = move-exception;
        r7 = r6;
        goto L_0x0088;
    L_0x0060:
        r2 = move-exception;
        r7 = r6;
        goto L_0x0091;
    L_0x0063:
        r0 = move-exception;
        r7 = r6;
        goto L_0x0073;
    L_0x0066:
        r0 = move-exception;
        r2.copeWithOptimizationFailure(r0);	 Catch:{ Throwable -> 0x006b, all -> 0x0063 }
        throw r0;	 Catch:{ Throwable -> 0x006b, all -> 0x0063 }
    L_0x006b:
        r0 = move-exception;
        r7 = r6;
        goto L_0x0071;
    L_0x006e:
        r0 = move-exception;
        goto L_0x0073;
    L_0x0070:
        r0 = move-exception;
    L_0x0071:
        r6 = r0;
        throw r0;	 Catch:{ all -> 0x006e }
    L_0x0073:
        if (r6 == 0) goto L_0x0079;	 Catch:{ all -> 0x006e }
    L_0x0075:
        r2.close();	 Catch:{ Throwable -> 0x007c, InterruptedException -> 0x0092 }
        goto L_0x007c;	 Catch:{ Throwable -> 0x007c, InterruptedException -> 0x0092 }
    L_0x0079:
        r2.close();	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
    L_0x007c:
        throw r0;	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
    L_0x007d:
        r1 = new com.facebook.common.dextricks.DexStore$OptimizationCanceledException;	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        r0 = "attempt to optimize stale repository";	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        r1.<init>(r0);	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
        throw r1;	 Catch:{ InterruptedException -> 0x0092, Throwable -> 0x0087 }
    L_0x0085:
        r0 = move-exception;
        goto L_0x0094;
    L_0x0087:
        r2 = move-exception;
    L_0x0088:
        r1 = "[opt] optimization failed!";	 Catch:{ all -> 0x0085 }
        r0 = new java.lang.Object[r4];	 Catch:{ all -> 0x0085 }
        r0[r3] = r2;	 Catch:{ all -> 0x0085 }
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);	 Catch:{ all -> 0x0085 }
    L_0x0091:
        throw r2;	 Catch:{ all -> 0x0085 }
    L_0x0092:
        r2 = move-exception;
        goto L_0x0091;
    L_0x0094:
        if (r7 == 0) goto L_0x0099;
    L_0x0096:
        r7.close();
    L_0x0099:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.optimize(android.content.Context, com.facebook.common.dextricks.OptimizationConfiguration$Provider, com.facebook.common.dextricks.DexStore$ProgressListener):void");
    }

    private void optimizeInForegroundLocked(android.content.Context r11, com.facebook.common.dextricks.DexManifest r12, long r13) {
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
        r10 = this;
        r10.assertLockHeld();
        r1 = r10.schemeForState(r12, r13);
        r3 = com.facebook.common.dextricks.Prio.unchanged();
        r2 = new com.facebook.common.dextricks.OptimizationConfiguration;
        r4 = 0;
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = 0;
        r7 = 100;
        r8 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r9 = 10;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9);
        r6 = new com.facebook.common.dextricks.OptimizationConfiguration$Provider;
        r6.<init>(r2);
        r4 = java.lang.System.currentTimeMillis();
        r2 = r10.getNextRecommendedOptimizationAttemptTime(r2);
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        r3 = 0;
        if (r0 >= 0) goto L_0x0035;
    L_0x002d:
        r1 = "... actually, not optimizing in foreground, since we failed optimization too recently";
        r0 = new java.lang.Object[r3];
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);
        return;
    L_0x0035:
        r2 = new com.facebook.common.dextricks.DexStore$OptimizationSession;	 Catch:{ InterruptedException -> 0x0061, Throwable -> 0x0058 }
        r0 = 0;	 Catch:{ InterruptedException -> 0x0061, Throwable -> 0x0058 }
        r2.<init>(r6);	 Catch:{ InterruptedException -> 0x0061, Throwable -> 0x0058 }
        r1.optimize(r11, r10, r2, r0);	 Catch:{ Throwable -> 0x0049 }
        r2.noteOptimizationSuccess();	 Catch:{ Throwable -> 0x004e }
        r2.close();	 Catch:{ InterruptedException -> 0x0061, Throwable -> 0x0058 }
        goto L_0x0060;	 Catch:{ InterruptedException -> 0x0061, Throwable -> 0x0058 }
    L_0x0045:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0054;
    L_0x0048:
        goto L_0x0050;
    L_0x0049:
        r1 = move-exception;
        r2.copeWithOptimizationFailure(r1);	 Catch:{ Throwable -> 0x004e }
        throw r1;	 Catch:{ Throwable -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0045 }
    L_0x0050:
        r2.close();	 Catch:{ Throwable -> 0x0057, InterruptedException -> 0x0061 }
        goto L_0x0057;	 Catch:{ Throwable -> 0x0057, InterruptedException -> 0x0061 }
    L_0x0054:
        r2.close();	 Catch:{ InterruptedException -> 0x0061, Throwable -> 0x0058 }
    L_0x0057:
        throw r1;	 Catch:{ InterruptedException -> 0x0061, Throwable -> 0x0058 }
    L_0x0058:
        r2 = move-exception;
        r1 = "foreground optimization failed; proceeding";
        r0 = new java.lang.Object[r3];
        com.facebook.common.dextricks.Mlog.m59w(r2, r1, r0);
    L_0x0060:
        return;
    L_0x0061:
        r1 = move-exception;
        r0 = new java.lang.AssertionError;
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.optimizeInForegroundLocked(android.content.Context, com.facebook.common.dextricks.DexManifest, long):void");
    }

    public void pruneTemporaryDirectories() {
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
        r5 = this;
        r1 = r5.mLockFile;
        r0 = 0;
        r4 = r1.acquire(r0);
        r3 = 0;
        r0 = r5.root;	 Catch:{ Throwable -> 0x0036 }
        r0 = r0.list();	 Catch:{ Throwable -> 0x0036 }
        if (r0 == 0) goto L_0x0019;	 Catch:{ Throwable -> 0x0036 }
    L_0x0010:
        r5.pruneTemporaryDirectoriesLocked(r0);	 Catch:{ Throwable -> 0x0036 }
        if (r4 == 0) goto L_0x0018;	 Catch:{ Throwable -> 0x0036 }
    L_0x0015:
        r4.close();
    L_0x0018:
        return;
    L_0x0019:
        r2 = new java.io.IOException;	 Catch:{ Throwable -> 0x0036 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0036 }
        r1.<init>();	 Catch:{ Throwable -> 0x0036 }
        r0 = "unable to list directory ";	 Catch:{ Throwable -> 0x0036 }
        r1.append(r0);	 Catch:{ Throwable -> 0x0036 }
        r0 = r5.root;	 Catch:{ Throwable -> 0x0036 }
        r1.append(r0);	 Catch:{ Throwable -> 0x0036 }
        r0 = r1.toString();	 Catch:{ Throwable -> 0x0036 }
        r2.<init>(r0);	 Catch:{ Throwable -> 0x0036 }
        throw r2;	 Catch:{ Throwable -> 0x0036 }
    L_0x0032:
        r0 = move-exception;
        if (r4 == 0) goto L_0x0041;
    L_0x0035:
        goto L_0x0038;
    L_0x0036:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0032 }
    L_0x0038:
        if (r3 == 0) goto L_0x003e;	 Catch:{ all -> 0x0032 }
    L_0x003a:
        r4.close();	 Catch:{ Throwable -> 0x0041 }
        goto L_0x0041;	 Catch:{ Throwable -> 0x0041 }
    L_0x003e:
        r4.close();
    L_0x0041:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.pruneTemporaryDirectories():void");
    }

    private void pruneTemporaryDirectoriesLocked(java.lang.String[] r11) {
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
        r10 = this;
        r10.assertLockHeld();
        r4 = 0;
        r3 = 0;
    L_0x0005:
        r0 = r11.length;
        if (r3 >= r0) goto L_0x00f2;
    L_0x0008:
        r6 = r11[r3];
        if (r6 != 0) goto L_0x000e;
    L_0x000c:
        goto L_0x00ee;
    L_0x000e:
        r0 = ".tmpdir_lock";
        r1 = r6.endsWith(r0);
        r0 = 0;
        if (r1 == 0) goto L_0x003b;
    L_0x0017:
        r11[r3] = r0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r1 = com.facebook.common.dextricks.Fs.stripLastExtension(r6);
        r2.append(r1);
        r1 = ".tmpdir";
        r2.append(r1);
        r1 = r2.toString();
        r1 = r10.findInArray(r11, r1);
        if (r1 < 0) goto L_0x0039;
    L_0x0034:
        r5 = r11[r1];
        r11[r1] = r0;
        goto L_0x006c;
    L_0x0039:
        r5 = r0;
        goto L_0x006c;
    L_0x003b:
        r1 = ".tmpdir";
        r1 = r6.endsWith(r1);
        if (r1 == 0) goto L_0x006a;
    L_0x0043:
        r11[r3] = r0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r1 = com.facebook.common.dextricks.Fs.stripLastExtension(r6);
        r2.append(r1);
        r1 = ".tmpdir_lock";
        r2.append(r1);
        r1 = r2.toString();
        r2 = r10.findInArray(r11, r1);
        if (r2 < 0) goto L_0x0067;
    L_0x0060:
        r1 = r11[r2];
        r11[r2] = r0;
        r5 = r6;
        r6 = r1;
        goto L_0x006c;
    L_0x0067:
        r5 = r6;
        r6 = r0;
        goto L_0x006c;
    L_0x006a:
        r6 = r0;
        r5 = r0;
    L_0x006c:
        r8 = 1;
        if (r6 == 0) goto L_0x00c3;
    L_0x006f:
        if (r5 == 0) goto L_0x00c3;
    L_0x0071:
        r9 = new java.io.File;
        r1 = r10.root;
        r9.<init>(r1, r6);
        r6 = com.facebook.common.dextricks.ReentrantLockFile.open(r9);
        r7 = r6.tryAcquire(r4);	 Catch:{ Throwable -> 0x00b7 }
        if (r7 != 0) goto L_0x0091;	 Catch:{ Throwable -> 0x00b7 }
    L_0x0082:
        r2 = "tmpdir %s in use: not deleting";	 Catch:{ Throwable -> 0x00b7 }
        r1 = new java.lang.Object[r8];	 Catch:{ Throwable -> 0x00b7 }
        r1[r4] = r5;	 Catch:{ Throwable -> 0x00b7 }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ Throwable -> 0x00b7 }
    L_0x008b:
        if (r6 == 0) goto L_0x00ee;	 Catch:{ Throwable -> 0x00b7 }
    L_0x008d:
        r6.close();
        goto L_0x00ee;
    L_0x0091:
        r2 = "tmpdir %s (lockfile %s) is abandoned: deleting";	 Catch:{ all -> 0x00ae }
        r1 = 2;	 Catch:{ all -> 0x00ae }
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x00ae }
        r1[r4] = r9;	 Catch:{ all -> 0x00ae }
        r1[r8] = r5;	 Catch:{ all -> 0x00ae }
        com.facebook.common.dextricks.Mlog.m54i(r2, r1);	 Catch:{ all -> 0x00ae }
        com.facebook.common.dextricks.Fs.deleteRecursive(r9);	 Catch:{ all -> 0x00ae }
        r2 = new java.io.File;	 Catch:{ all -> 0x00ae }
        r1 = r10.root;	 Catch:{ all -> 0x00ae }
        r2.<init>(r1, r5);	 Catch:{ all -> 0x00ae }
        com.facebook.common.dextricks.Fs.deleteRecursive(r2);	 Catch:{ all -> 0x00ae }
        r7.close();	 Catch:{ Throwable -> 0x00b7 }
        goto L_0x008b;	 Catch:{ Throwable -> 0x00b7 }
    L_0x00ae:
        r1 = move-exception;	 Catch:{ Throwable -> 0x00b7 }
        r7.close();	 Catch:{ Throwable -> 0x00b7 }
        throw r1;	 Catch:{ Throwable -> 0x00b7 }
    L_0x00b3:
        r1 = move-exception;
        if (r6 == 0) goto L_0x00c2;
    L_0x00b6:
        goto L_0x00b9;
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b3 }
    L_0x00b9:
        if (r0 == 0) goto L_0x00bf;	 Catch:{ all -> 0x00b3 }
    L_0x00bb:
        r6.close();	 Catch:{ Throwable -> 0x00c2 }
        goto L_0x00c2;	 Catch:{ Throwable -> 0x00c2 }
    L_0x00bf:
        r6.close();
    L_0x00c2:
        throw r1;
    L_0x00c3:
        if (r6 == 0) goto L_0x00d9;
    L_0x00c5:
        r1 = "tmpdir lockfile %s is orphaned: deleting";
        r0 = new java.lang.Object[r8];
        r0[r4] = r6;
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        r1 = new java.io.File;
        r0 = r10.root;
        r1.<init>(r0, r6);
        com.facebook.common.dextricks.Fs.deleteRecursive(r1);
        goto L_0x00ee;
    L_0x00d9:
        if (r5 == 0) goto L_0x00ee;
    L_0x00db:
        r1 = "tmpdir %s is orphaned without its lockfile: deleting";
        r0 = new java.lang.Object[r8];
        r0[r4] = r5;
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        r1 = new java.io.File;
        r0 = r10.root;
        r1.<init>(r0, r5);
        com.facebook.common.dextricks.Fs.deleteRecursive(r1);
    L_0x00ee:
        r3 = r3 + 1;
        goto L_0x0005;
    L_0x00f2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.pruneTemporaryDirectoriesLocked(java.lang.String[]):void");
    }

    public com.facebook.common.dextricks.DexStore.Config readConfig() {
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
        r7 = this;
        r0 = r7.mLockFile;
        r6 = 0;
        r5 = r0.acquire(r6);
        r0 = 0;
        r4 = new java.io.File;	 Catch:{ Throwable -> 0x0052 }
        r2 = r7.root;	 Catch:{ Throwable -> 0x0052 }
        r1 = "config";	 Catch:{ Throwable -> 0x0052 }
        r4.<init>(r2, r1);	 Catch:{ Throwable -> 0x0052 }
        r0 = com.facebook.common.dextricks.DexStore.Config.read(r4);	 Catch:{ FileNotFoundException -> 0x003f, UnsupportedOperationException -> 0x002b, Exception -> 0x0016 }
        goto L_0x0048;	 Catch:{ FileNotFoundException -> 0x003f, UnsupportedOperationException -> 0x002b, Exception -> 0x0016 }
    L_0x0016:
        r3 = move-exception;
        r2 = "error reading dex store config file %s: deleting and proceeding";	 Catch:{ Throwable -> 0x0052 }
        r1 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0052 }
        com.facebook.common.dextricks.Mlog.m59w(r3, r2, r1);	 Catch:{ Throwable -> 0x0052 }
        com.facebook.common.dextricks.Fs.deleteRecursive(r4);	 Catch:{ Throwable -> 0x0052 }
        r1 = new com.facebook.common.dextricks.DexStore$Config$Builder;	 Catch:{ Throwable -> 0x0052 }
        r1.<init>();	 Catch:{ Throwable -> 0x0052 }
        r0 = r1.build();	 Catch:{ Throwable -> 0x0052 }
        goto L_0x0048;	 Catch:{ Throwable -> 0x0052 }
    L_0x002b:
        r2 = "unsupported dex store config file %s: ignoring and deleting";	 Catch:{ Throwable -> 0x0052 }
        r1 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0052 }
        com.facebook.common.dextricks.Mlog.m54i(r2, r1);	 Catch:{ Throwable -> 0x0052 }
        com.facebook.common.dextricks.Fs.deleteRecursive(r4);	 Catch:{ Throwable -> 0x0052 }
        r1 = new com.facebook.common.dextricks.DexStore$Config$Builder;	 Catch:{ Throwable -> 0x0052 }
        r1.<init>();	 Catch:{ Throwable -> 0x0052 }
        r0 = r1.build();	 Catch:{ Throwable -> 0x0052 }
        goto L_0x0048;	 Catch:{ Throwable -> 0x0052 }
    L_0x003f:
        r1 = new com.facebook.common.dextricks.DexStore$Config$Builder;	 Catch:{ Throwable -> 0x0052 }
        r1.<init>();	 Catch:{ Throwable -> 0x0052 }
        r0 = r1.build();	 Catch:{ Throwable -> 0x0052 }
    L_0x0048:
        if (r5 == 0) goto L_0x004d;	 Catch:{ Throwable -> 0x0052 }
    L_0x004a:
        r5.close();
    L_0x004d:
        return r0;
    L_0x004e:
        r1 = move-exception;
        if (r5 == 0) goto L_0x005d;
    L_0x0051:
        goto L_0x0054;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004e }
    L_0x0054:
        if (r0 == 0) goto L_0x005a;	 Catch:{ all -> 0x004e }
    L_0x0056:
        r5.close();	 Catch:{ Throwable -> 0x005d }
        goto L_0x005d;	 Catch:{ Throwable -> 0x005d }
    L_0x005a:
        r5.close();
    L_0x005d:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.readConfig():com.facebook.common.dextricks.DexStore$Config");
    }

    private byte[] readCurrentDepBlock() {
        long lastModified;
        byte[] marshall;
        int i = 1;
        File file = null;
        try {
            file = determineOdexCacheName(this.mApk);
        } catch (Throwable e) {
            Mlog.m59w(e, "error reading odex cache file %s", file);
        }
        Parcel obtain = Parcel.obtain();
        if (file != null) {
            try {
                if (file.exists()) {
                    for (DexStore readCurrentDepBlock : getParents()) {
                        obtain.writeByteArray(readCurrentDepBlock.readCurrentDepBlock());
                    }
                    obtain.writeByteArray(DalvikInternals.readOdexDepBlock(file.getPath()));
                    if (i == 0) {
                        lastModified = this.mApk.lastModified();
                        if (lastModified == 0) {
                            obtain.writeString(this.mApk.getName());
                            obtain.writeLong(lastModified);
                            obtain.writeString(Build.FINGERPRINT);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("unable to get modtime of ");
                            stringBuilder.append(this.mApk);
                            throw new IOException(stringBuilder.toString());
                        }
                    }
                    if (AnonymousClass00r.f103C) {
                        obtain.writeByte((byte) 0);
                    }
                    obtain.writeByteArray(readConfig().readDepBlock());
                    marshall = obtain.marshall();
                    obtain.recycle();
                    return marshall;
                }
            } catch (Exception e2) {
                Mlog.m50d("could not read odex dep block: using modtime: %s", e2);
            } catch (Throwable th) {
                obtain.recycle();
            }
        }
        i = 0;
        if (i == 0) {
            lastModified = this.mApk.lastModified();
            if (lastModified == 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("unable to get modtime of ");
                stringBuilder2.append(this.mApk);
                throw new IOException(stringBuilder2.toString());
            }
            obtain.writeString(this.mApk.getName());
            obtain.writeLong(lastModified);
            obtain.writeString(Build.FINGERPRINT);
        }
        if (AnonymousClass00r.f103C) {
            obtain.writeByte((byte) 0);
        }
        obtain.writeByteArray(readConfig().readDepBlock());
        marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    private byte[] readSavedDepBlock() {
        try {
            Closeable randomAccessFile = new RandomAccessFile(new File(this.root, DEPS_FILENAME), "r");
            try {
                String str;
                Object[] objArr;
                long length = randomAccessFile.length();
                if (length > 16777216) {
                    str = "saved dep block file is way too big (%s bytes): considering invalid";
                    objArr = new Object[]{Long.valueOf(length)};
                } else {
                    byte[] bArr = new byte[((int) length)];
                    if (((long) randomAccessFile.read(bArr)) < length) {
                        str = "short read of dep block %s: wanted %s bytes; got %s: considering invalid";
                        objArr = new Object[]{r8, Long.valueOf(length), Integer.valueOf(randomAccessFile.read(bArr))};
                    } else {
                        Mlog.m56v("read saved dep file %s (%s bytes)", r8, Long.valueOf(length));
                        Fs.safeClose(randomAccessFile);
                        return bArr;
                    }
                }
                Mlog.m54i(str, objArr);
                return null;
            } finally {
                Fs.safeClose(randomAccessFile);
            }
        } catch (Throwable e) {
            Mlog.m57v(e, "unable to open deps file %s", r8);
            return null;
        }
    }

    public static long readStatusLocked(com.facebook.common.dextricks.DexStore r16) {
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
        r0 = r16;
        r0.assertLockHeld();
        r7 = new java.io.File;
        r1 = r0.root;
        r0 = "mdex_status2";
        r7.<init>(r1, r0);
        r15 = 0;
        r9 = 1;
        r8 = 0;
        r6 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0087 }
        r6.<init>(r7);	 Catch:{ FileNotFoundException -> 0x0087 }
        r0 = 16;	 Catch:{ FileNotFoundException -> 0x0087 }
        r2 = new byte[r0];	 Catch:{ all -> 0x0082 }
        r0 = r2.length;	 Catch:{ all -> 0x0082 }
        r1 = r6.read(r2, r8, r0);	 Catch:{ all -> 0x0082 }
        r0 = r2.length;	 Catch:{ all -> 0x0082 }
        if (r1 >= r0) goto L_0x0033;	 Catch:{ all -> 0x0082 }
    L_0x0023:
        r1 = "status file %s too short: treating as zero";	 Catch:{ all -> 0x0082 }
        r0 = new java.lang.Object[r9];	 Catch:{ all -> 0x0082 }
        r0[r8] = r7;	 Catch:{ all -> 0x0082 }
        com.facebook.common.dextricks.Mlog.m50d(r1, r0);	 Catch:{ all -> 0x0082 }
    L_0x002c:
        com.facebook.common.dextricks.Fs.deleteRecursiveNoThrow(r7);	 Catch:{ all -> 0x0082 }
        com.facebook.common.dextricks.Fs.safeClose(r6);
        return r15;
    L_0x0033:
        r0 = java.nio.ByteBuffer.wrap(r2);	 Catch:{ all -> 0x0082 }
        r13 = r0.getLong();	 Catch:{ all -> 0x0082 }
        r11 = r0.getLong();	 Catch:{ all -> 0x0082 }
        r2 = "read status:%x check:%x str:%s";	 Catch:{ all -> 0x0082 }
        r10 = 3;	 Catch:{ all -> 0x0082 }
        r1 = new java.lang.Object[r10];	 Catch:{ all -> 0x0082 }
        r0 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x0082 }
        r1[r8] = r0;	 Catch:{ all -> 0x0082 }
        r0 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x0082 }
        r1[r9] = r0;	 Catch:{ all -> 0x0082 }
        r0 = getStatusDescription(r13);	 Catch:{ all -> 0x0082 }
        r5 = 2;	 Catch:{ all -> 0x0082 }
        r1[r5] = r0;	 Catch:{ all -> 0x0082 }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ all -> 0x0082 }
        r3 = -374168170706063353; // 0xfaceb007faceb007 float:-5.365917E35 double:-3.5650790968196887E283;	 Catch:{ all -> 0x0082 }
        r3 = r3 ^ r13;	 Catch:{ all -> 0x0082 }
        r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));	 Catch:{ all -> 0x0082 }
        if (r0 == 0) goto L_0x007e;	 Catch:{ all -> 0x0082 }
    L_0x0064:
        r2 = "check mismatch: status:%x expected-check:%x actual-check:%x";	 Catch:{ all -> 0x0082 }
        r1 = new java.lang.Object[r10];	 Catch:{ all -> 0x0082 }
        r0 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x0082 }
        r1[r8] = r0;	 Catch:{ all -> 0x0082 }
        r0 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x0082 }
        r1[r9] = r0;	 Catch:{ all -> 0x0082 }
        r0 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x0082 }
        r1[r5] = r0;	 Catch:{ all -> 0x0082 }
        com.facebook.common.dextricks.Mlog.m52e(r2, r1);	 Catch:{ all -> 0x0082 }
        goto L_0x002c;	 Catch:{ all -> 0x0082 }
    L_0x007e:
        com.facebook.common.dextricks.Fs.safeClose(r6);
        return r13;
    L_0x0082:
        r0 = move-exception;
        com.facebook.common.dextricks.Fs.safeClose(r6);
        throw r0;
    L_0x0087:
        r1 = "status file %s not found: treating as zero";
        r0 = new java.lang.Object[r9];
        r0[r8] = r7;
        com.facebook.common.dextricks.Mlog.m50d(r1, r0);
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.readStatusLocked(com.facebook.common.dextricks.DexStore):long");
    }

    public long reportStatus() {
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
        r6 = this;
        r1 = "DexStore::reportStatus()";
        r5 = 0;
        r0 = new java.lang.Object[r5];
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);
        r0 = r6.mLockFile;	 Catch:{ Throwable -> 0x002b }
        r2 = r0.acquire(r5);	 Catch:{ Throwable -> 0x002b }
        r1 = 0;	 Catch:{ Throwable -> 0x002b }
        r3 = readStatusLocked(r6);	 Catch:{ Throwable -> 0x001f }
        if (r2 == 0) goto L_0x0038;	 Catch:{ Throwable -> 0x001f }
    L_0x0015:
        r2.close();	 Catch:{ Throwable -> 0x0019 }
        goto L_0x0038;	 Catch:{ Throwable -> 0x0019 }
    L_0x0019:
        r2 = move-exception;
        goto L_0x002e;
    L_0x001b:
        r0 = move-exception;
        if (r2 == 0) goto L_0x002a;
    L_0x001e:
        goto L_0x0021;
    L_0x001f:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x001b }
    L_0x0021:
        if (r1 == 0) goto L_0x0027;	 Catch:{ all -> 0x001b }
    L_0x0023:
        r2.close();	 Catch:{ Throwable -> 0x002a }
        goto L_0x002a;	 Catch:{ Throwable -> 0x002a }
    L_0x0027:
        r2.close();	 Catch:{ Throwable -> 0x002b }
    L_0x002a:
        throw r0;	 Catch:{ Throwable -> 0x002b }
    L_0x002b:
        r2 = move-exception;
        r3 = 0;
    L_0x002e:
        r1 = "DexStore::reportStatus caught Throwable ";
        r0 = 1;
        r0 = new java.lang.Object[r0];
        r0[r5] = r2;
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);
    L_0x0038:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.reportStatus():long");
    }

    private void runCompiler(com.facebook.common.dextricks.DexManifest r4, com.facebook.common.dextricks.OdexScheme r5, int r6) {
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
        r3 = this;
        r6 = r5.makeCompiler(r3, r6);
        r0 = 0;
        r5 = r3.openDexIterator(r4);	 Catch:{ Throwable -> 0x005a }
    L_0x0009:
        r1 = r5.hasNext();	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        if (r1 == 0) goto L_0x0039;	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
    L_0x000f:
        r4 = r5.next();	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r3 = "compiling %s";	 Catch:{ Throwable -> 0x002a, all -> 0x0027 }
        r1 = 1;	 Catch:{ Throwable -> 0x002a, all -> 0x0027 }
        r2 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x002a, all -> 0x0027 }
        r1 = 0;	 Catch:{ Throwable -> 0x002a, all -> 0x0027 }
        r2[r1] = r4;	 Catch:{ Throwable -> 0x002a, all -> 0x0027 }
        com.facebook.common.dextricks.Mlog.m56v(r3, r2);	 Catch:{ Throwable -> 0x002a, all -> 0x0027 }
        r6.compile(r4);	 Catch:{ Throwable -> 0x002a, all -> 0x0027 }
        if (r4 == 0) goto L_0x0009;	 Catch:{ Throwable -> 0x002a, all -> 0x0027 }
    L_0x0023:
        r4.close();	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        goto L_0x0009;	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
    L_0x0027:
        r1 = move-exception;
        r2 = r0;
        goto L_0x002d;
    L_0x002a:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x002c }
    L_0x002c:
        r1 = move-exception;
    L_0x002d:
        if (r4 == 0) goto L_0x0038;
    L_0x002f:
        if (r2 == 0) goto L_0x0035;
    L_0x0031:
        r4.close();	 Catch:{ Throwable -> 0x0038, all -> 0x0044 }
        goto L_0x0038;	 Catch:{ Throwable -> 0x0038, all -> 0x0044 }
    L_0x0035:
        r4.close();	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
    L_0x0038:
        throw r1;	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
    L_0x0039:
        if (r5 == 0) goto L_0x003e;	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
    L_0x003b:
        r5.close();	 Catch:{ Throwable -> 0x005a }
    L_0x003e:
        if (r6 == 0) goto L_0x0043;	 Catch:{ Throwable -> 0x005a }
    L_0x0040:
        r6.close();
    L_0x0043:
        return;
    L_0x0044:
        r1 = move-exception;
        r2 = r0;
        goto L_0x004a;
    L_0x0047:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r1 = move-exception;
    L_0x004a:
        if (r5 == 0) goto L_0x0055;
    L_0x004c:
        if (r2 == 0) goto L_0x0052;
    L_0x004e:
        r5.close();	 Catch:{ Throwable -> 0x0055 }
        goto L_0x0055;	 Catch:{ Throwable -> 0x0055 }
    L_0x0052:
        r5.close();	 Catch:{ Throwable -> 0x005a }
    L_0x0055:
        throw r1;	 Catch:{ Throwable -> 0x005a }
    L_0x0056:
        r1 = move-exception;
        if (r6 == 0) goto L_0x0065;
    L_0x0059:
        goto L_0x005c;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0056 }
    L_0x005c:
        if (r0 == 0) goto L_0x0062;	 Catch:{ all -> 0x0056 }
    L_0x005e:
        r6.close();	 Catch:{ Throwable -> 0x0065 }
        goto L_0x0065;	 Catch:{ Throwable -> 0x0065 }
    L_0x0062:
        r6.close();
    L_0x0065:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.runCompiler(com.facebook.common.dextricks.DexManifest, com.facebook.common.dextricks.OdexScheme, int):void");
    }

    private void saveDeps() {
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
        r5 = this;
        r2 = r5.readCurrentDepBlock();
        r4 = new java.io.File;
        r1 = r5.root;
        r0 = "deps";
        r4.<init>(r1, r0);
        r3 = new java.io.RandomAccessFile;
        r0 = "rw";
        r3.<init>(r4, r0);
        r0 = 0;
        r3.write(r2);	 Catch:{ Throwable -> 0x0032 }
        r1 = r3.getFilePointer();	 Catch:{ Throwable -> 0x0032 }
        r3.setLength(r1);	 Catch:{ Throwable -> 0x0032 }
        r3.close();
        r2 = "saved deps file %s";
        r0 = 1;
        r1 = new java.lang.Object[r0];
        r0 = 0;
        r1[r0] = r4;
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);
        return;
    L_0x002e:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0038;
    L_0x0031:
        goto L_0x0034;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x0034:
        r3.close();	 Catch:{ Throwable -> 0x003b }
        goto L_0x003b;	 Catch:{ Throwable -> 0x003b }
    L_0x0038:
        r3.close();
    L_0x003b:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.saveDeps():void");
    }

    private OdexScheme schemeForState(DexManifest dexManifest, long j) {
        Dex[] dexArr = dexManifest.dexes;
        switch ((byte) ((int) (15 & j))) {
            case (byte) 2:
                return new OdexSchemeBoring(dexArr);
            case (byte) 3:
                return new OdexSchemeXdex(dexArr);
            case (byte) 4:
                return new OdexSchemeTurbo(dexArr);
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                return new OdexSchemeArtTurbo(dexArr);
            case (byte) 8:
                return new OdexSchemeArtXdex(dexArr, this.mResProvider, j);
            case (byte) 9:
                return new OdexSchemeNoop();
            default:
                return new OdexSchemeInvalid();
        }
    }

    private void setDifference(String[] strArr, String[] strArr2) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null) {
                for (Object obj : strArr2) {
                    if (obj != null && str.equals(obj)) {
                        strArr[i] = null;
                        break;
                    }
                }
            }
        }
    }

    private void touchRegenStamp() {
        File file = new File(this.root, REGEN_STAMP_FILENAME);
        file.createNewFile();
        if (!file.setLastModified(System.currentTimeMillis())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("could not set modtime of ");
            stringBuilder.append(file);
            throw new IOException(stringBuilder.toString());
        }
    }

    private void verifyCanaryClasses(DexManifest dexManifest) {
        for (Dex dex : dexManifest.dexes) {
            Class.forName(dex.canaryClass);
        }
    }

    public void writeStatusLocked(long r8) {
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
        r7 = this;
        r7.assertLockHeld();
        r0 = 15;
        r0 = r0 & r8;
        r0 = (int) r0;
        r0 = (byte) r0;
        r3 = 1;
        if (r0 == r3) goto L_0x0015;
    L_0x000b:
        r0 = r7.root;
        r1 = r0.getAbsolutePath();
        r0 = -1;
        com.facebook.common.dextricks.DalvikInternals.fsyncNamed(r1, r0);
    L_0x0015:
        r6 = new java.io.File;
        r1 = r7.root;
        r0 = "mdex_status2";
        r6.<init>(r1, r0);
        r1 = -374168170706063353; // 0xfaceb007faceb007 float:-5.365917E35 double:-3.5650790968196887E283;
        r1 = r1 ^ r8;
        r7 = "writing status:%x check:%x str:%s";
        r0 = 3;
        r5 = new java.lang.Object[r0];
        r0 = java.lang.Long.valueOf(r8);
        r4 = 0;
        r5[r4] = r0;
        r0 = java.lang.Long.valueOf(r1);
        r5[r3] = r0;
        r3 = 2;
        r0 = getStatusDescription(r8);
        r5[r3] = r0;
        com.facebook.common.dextricks.Mlog.m56v(r7, r5);
        r0 = 16;
        r3 = new byte[r0];
        r0 = java.nio.ByteBuffer.wrap(r3);
        r0.putLong(r8);
        r0.putLong(r1);
        r2 = new java.io.FileOutputStream;
        r2.<init>(r6);
        r1 = 0;
        r0 = r3.length;	 Catch:{ Throwable -> 0x0067 }
        r2.write(r3, r4, r0);	 Catch:{ Throwable -> 0x0067 }
        r0 = r2.getFD();	 Catch:{ Throwable -> 0x0067 }
        r0.sync();	 Catch:{ Throwable -> 0x0067 }
        r2.close();
        return;
    L_0x0063:
        r0 = move-exception;
        if (r1 == 0) goto L_0x006d;
    L_0x0066:
        goto L_0x0069;
    L_0x0067:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0063 }
    L_0x0069:
        r2.close();	 Catch:{ Throwable -> 0x0070 }
        goto L_0x0070;	 Catch:{ Throwable -> 0x0070 }
    L_0x006d:
        r2.close();
    L_0x0070:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.writeStatusLocked(long):void");
    }

    public static void writeTxFailedStatusLocked(DexStore dexStore, long j) {
        dexStore.writeStatusLocked((j << 4) | 1);
    }
}
