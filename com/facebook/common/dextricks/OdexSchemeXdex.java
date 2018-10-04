package com.facebook.common.dextricks;

import android.text.TextUtils.SimpleStringSplitter;
import com.facebook.common.dextricks.DexManifest.Dex;
import com.facebook.common.dextricks.DexOptRunner.DexOptException;
import com.facebook.common.dextricks.DexStore.OptimizationSession;
import com.facebook.common.dextricks.ReentrantLockFile.Lock;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;

public final class OdexSchemeXdex extends OdexSchemeTurbo {
    private final Dex[] mDexes;

    public final class DexToOptimize implements Closeable {
        public final int dexNr;
        public final Lock signalLock;

        public DexToOptimize(int i, Lock lock) {
            this.dexNr = i;
            this.signalLock = lock;
        }

        public void close() {
            this.signalLock.close();
        }

        public String toString() {
            return String.format("DexToOptimize(dexNr=%d)", new Object[]{Integer.valueOf(this.dexNr)});
        }
    }

    public final class PoliteDexOptRunner extends DexOptRunner {
        private final byte[] mBuffer = new byte[262144];
        private final OptimizationSession mOptimizationSession;

        public PoliteDexOptRunner(OptimizationSession optimizationSession, File file) {
            super(file);
            this.mOptimizationSession = optimizationSession;
        }

        public void addDexOptOptions(ProcessBuilder processBuilder) {
            processBuilder.addArgument("-n");
            OdexSchemeTurbo.addConfiguredDexOptOptions(this.mOptimizationSession.dexStoreConfig, processBuilder);
        }

        public int copyDexToOdex(java.io.InputStream r9, int r10, java.io.RandomAccessFile r11) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r8 = this;
            r0 = r11.getFD();
            r7 = com.facebook.forker.Fd.fileno(r0);
            r0 = r8.mOptimizationSession;
            r0 = r0.config;
            r0 = r0.prio;
            r0 = r0.ioOnly();
            r6 = r0.with();
            r5 = 0;
            r4 = 0;
        L_0x0018:
            r0 = 0;
            r2 = r8.mBuffer;	 Catch:{ Throwable -> 0x0041 }
            r1 = r8.mBuffer;	 Catch:{ Throwable -> 0x0041 }
            r1 = r1.length;	 Catch:{ Throwable -> 0x0041 }
            r3 = com.facebook.common.dextricks.Fs.slurp(r9, r2, r1);	 Catch:{ Throwable -> 0x0041 }
            r2 = -1;	 Catch:{ Throwable -> 0x0041 }
            if (r3 == r2) goto L_0x0037;	 Catch:{ Throwable -> 0x0041 }
        L_0x0025:
            r1 = r8.mBuffer;	 Catch:{ Throwable -> 0x0041 }
            r11.write(r1, r5, r3);	 Catch:{ Throwable -> 0x0041 }
            r4 = r4 + r3;	 Catch:{ Throwable -> 0x0041 }
            r1 = r8.mOptimizationSession;	 Catch:{ Throwable -> 0x0041 }
            r1.checkShouldStop();	 Catch:{ Throwable -> 0x0041 }
            com.facebook.common.dextricks.DalvikInternals.fdatasync(r7, r2);	 Catch:{ Throwable -> 0x0041 }
            com.facebook.common.dextricks.Fs.tryDiscardPageCache(r7);	 Catch:{ Throwable -> 0x0041 }
            goto L_0x0018;	 Catch:{ Throwable -> 0x0041 }
        L_0x0037:
            if (r6 == 0) goto L_0x003c;	 Catch:{ Throwable -> 0x0041 }
        L_0x0039:
            r6.close();
        L_0x003c:
            return r4;
        L_0x003d:
            r1 = move-exception;
            if (r6 == 0) goto L_0x004c;
        L_0x0040:
            goto L_0x0043;
        L_0x0041:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x003d }
        L_0x0043:
            if (r0 == 0) goto L_0x0049;	 Catch:{ all -> 0x003d }
        L_0x0045:
            r6.close();	 Catch:{ Throwable -> 0x004c }
            goto L_0x004c;	 Catch:{ Throwable -> 0x004c }
        L_0x0049:
            r6.close();
        L_0x004c:
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeXdex.PoliteDexOptRunner.copyDexToOdex(java.io.InputStream, int, java.io.RandomAccessFile):int");
        }

        public com.facebook.forker.Process startSubprocess(com.facebook.forker.ProcessBuilder r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.mOptimizationSession;
            r0 = r0.config;
            r0 = r0.prio;
            r2 = r0.with();
            r0 = r3.create();	 Catch:{ Throwable -> 0x0017, all -> 0x0014 }
            if (r2 == 0) goto L_0x0013;	 Catch:{ Throwable -> 0x0017, all -> 0x0014 }
        L_0x0010:
            r2.close();
        L_0x0013:
            return r0;
        L_0x0014:
            r1 = move-exception;
            r0 = 0;
            goto L_0x001a;
        L_0x0017:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x0019 }
        L_0x0019:
            r1 = move-exception;
        L_0x001a:
            if (r2 == 0) goto L_0x0025;
        L_0x001c:
            if (r0 == 0) goto L_0x0022;
        L_0x001e:
            r2.close();	 Catch:{ Throwable -> 0x0025 }
            goto L_0x0025;	 Catch:{ Throwable -> 0x0025 }
        L_0x0022:
            r2.close();
        L_0x0025:
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeXdex.PoliteDexOptRunner.startSubprocess(com.facebook.forker.ProcessBuilder):com.facebook.forker.Process");
        }

        public void waitForDexOpt(Process process, int i) {
            this.mOptimizationSession.waitForAndManageProcess(process);
        }
    }

    public String getSchemeName() {
        return "OdexSchemeXdex";
    }

    public OdexSchemeXdex(Dex[] dexArr) {
        super(1, dexArr);
        this.mDexes = dexArr;
    }

    private com.facebook.common.dextricks.OdexSchemeXdex.DexToOptimize findDexToOptimize(com.facebook.common.dextricks.DexStore r9, long r10) {
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
        r4 = 0;
        r3 = 0;
    L_0x0002:
        r0 = r8.mDexes;
        r0 = r0.length;
        r7 = 0;
        if (r3 >= r0) goto L_0x0050;
    L_0x0008:
        r5 = 16;
        r5 = r5 << r3;
        r5 = r5 & r10;
        r0 = 0;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0030;
    L_0x0013:
        r1 = r8.expectedFiles;
        r0 = r3 * 2;
        r0 = r0 + r4;
        r2 = r1[r0];
        r1 = new java.io.File;
        r0 = r9.root;
        r1.<init>(r0, r2);
        r2 = com.facebook.common.dextricks.ReentrantLockFile.open(r1);
        r1 = r2.tryAcquire(r4);	 Catch:{ Throwable -> 0x0044 }
        if (r2 == 0) goto L_0x002e;	 Catch:{ Throwable -> 0x0044 }
    L_0x002b:
        r2.close();
    L_0x002e:
        if (r1 != 0) goto L_0x0033;
    L_0x0030:
        r3 = r3 + 1;
        goto L_0x0002;
    L_0x0033:
        r0 = new com.facebook.common.dextricks.OdexSchemeXdex$DexToOptimize;	 Catch:{ all -> 0x0039 }
        r0.<init>(r3, r1);	 Catch:{ all -> 0x0039 }
        return r0;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        if (r1 == 0) goto L_0x003f;
    L_0x003c:
        r1.close();
    L_0x003f:
        throw r0;
    L_0x0040:
        r0 = move-exception;
        if (r2 == 0) goto L_0x004f;
    L_0x0043:
        goto L_0x0046;
    L_0x0044:
        r7 = move-exception;
        throw r7;	 Catch:{ all -> 0x0040 }
    L_0x0046:
        if (r7 == 0) goto L_0x004c;	 Catch:{ all -> 0x0040 }
    L_0x0048:
        r2.close();	 Catch:{ Throwable -> 0x004f }
        goto L_0x004f;	 Catch:{ Throwable -> 0x004f }
    L_0x004c:
        r2.close();
    L_0x004f:
        throw r0;
    L_0x0050:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeXdex.findDexToOptimize(com.facebook.common.dextricks.DexStore, long):com.facebook.common.dextricks.OdexSchemeXdex$DexToOptimize");
    }

    private boolean isFileCorruptionException(DexOptException dexOptException) {
        if (dexOptException.status != 1) {
            return false;
        }
        String str = dexOptException.errout;
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf("E/dalvikvm: ERROR: bad checksum");
        if (indexOf == 0 || (indexOf > 0 && str.charAt(indexOf - 1) == '\n')) {
            return true;
        }
        return false;
    }

    private void makeFakeCacheSymlink(File file, File file2, File file3) {
        StringBuilder stringBuilder;
        if (!file2.exists()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("expected file to exist: ");
            stringBuilder.append(file2);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (file3.exists()) {
            Mlog.m56v("[opt] symlink %s -> %s", Fs.dexOptGenerateCacheFileName(file, file2, file2.getPath().endsWith(".jar") ? "classes.dex" : null), file3);
            Fs.symlink(file3, file2);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("expected file to exist: ");
            stringBuilder.append(file3);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public boolean needOptimization(long j) {
        Mlog.m56v("expectedDexBits:0x%08x actualDexBits:0x%08x", Long.valueOf((long) ((1 << this.mDexes.length) - 1)), Long.valueOf(j >> 4));
        if (((long) ((1 << this.mDexes.length) - 1)) != (j >> 4)) {
            return true;
        }
        return false;
    }

    private PartialInputStream openDexInsideOdex(FileInputStream fileInputStream) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        FileChannel channel = fileInputStream.getChannel();
        channel.position(8);
        allocate.order(ByteOrder.nativeOrder());
        if (channel.read(allocate) == 8) {
            int i = 0;
            allocate.position(0);
            int i2 = allocate.getInt();
            int i3 = allocate.getInt();
            Mlog.m56v("dexOffset:%s dexLength:%s", Integer.valueOf(i2), Integer.valueOf(i3));
            int i4 = i2 <= 0 ? 1 : 0;
            if (i3 <= 0) {
                i = 1;
            }
            if ((i | i4) == 0) {
                channel.position((long) i2);
                return new PartialInputStream(fileInputStream, i3);
            }
        }
        throw new IllegalArgumentException("invalid odex file");
    }

    public void optimize(android.content.Context r25, com.facebook.common.dextricks.DexStore r26, com.facebook.common.dextricks.DexStore.OptimizationSession r27, com.facebook.common.dextricks.DexStore.ProgressListener r28) {
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
        r24 = this;
        r7 = r26;
        r5 = r7.getDependencyOdexFiles();
        r0 = r7.getOdexCachePath();
        r23 = com.facebook.common.dextricks.DalvikInternals.readOdexDepBlock(r0);
        r0 = "dexopt";
        r3 = r7.makeTemporaryDirectory(r0);
        r13 = 0;
        r2 = "[opt] opened tmpDir %s";	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r9 = 1;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r1 = new java.lang.Object[r9];	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r0 = r3.directory;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r8 = 0;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r1[r8] = r0;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r6 = r27;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r0 = r6.config;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r0 = r0.flags;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r0 = r0 & r9;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        if (r0 == 0) goto L_0x002d;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
    L_0x002b:
        r0 = 1;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        goto L_0x002e;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
    L_0x002d:
        r0 = 0;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
    L_0x002e:
        if (r0 == 0) goto L_0x003c;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
    L_0x0030:
        r4 = new com.facebook.common.dextricks.OdexSchemeXdex$PoliteDexOptRunner;	 Catch:{ Throwable -> 0x0039, all -> 0x00f7 }
        r0 = r3.directory;	 Catch:{ Throwable -> 0x0039, all -> 0x00f7 }
        r4.<init>(r6, r0);	 Catch:{ Throwable -> 0x0039, all -> 0x00f7 }
    L_0x0037:
        r14 = 0;	 Catch:{ Throwable -> 0x0039, all -> 0x00f7 }
        goto L_0x0046;	 Catch:{ Throwable -> 0x0039, all -> 0x00f7 }
    L_0x0039:
        r13 = move-exception;
        goto L_0x00fa;
    L_0x003c:
        r4 = new com.facebook.common.dextricks.OdexSchemeTurbo$TurboDexOptRunner;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r1 = r6.dexStoreConfig;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r0 = r3.directory;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r4.<init>(r1, r0);	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        goto L_0x0037;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
    L_0x0046:
        r1 = "[opt] starting optimization pass; creating job";	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r0 = new java.lang.Object[r8];	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r2 = new com.facebook.common.dextricks.DexStore$OptimizationSession$Job;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r6.getClass();	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r2.<init>();	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r1 = "[opt] opened job";	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        r0 = new java.lang.Object[r8];	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        r15 = r24;	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        r12 = r28;	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        if (r28 == 0) goto L_0x0073;	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
    L_0x0062:
        r0 = r15.mDexes;	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
        r11 = r0.length;	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
        r0 = r2.initialStatus;	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
        r10 = 4;	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
        r0 = r0 >> r10;	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
        r0 = java.lang.Long.bitCount(r0);	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
        r12.onProgress(r11, r0, r8);	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
        goto L_0x0073;	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
    L_0x0071:
        r1 = move-exception;
        goto L_0x00e9;
    L_0x0073:
        if (r14 != 0) goto L_0x007b;
    L_0x0075:
        r0 = r3.directory;	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
        r15.prepareTmpDirForXdex(r5, r7, r0);	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
        r14 = 1;	 Catch:{ Throwable -> 0x0071, all -> 0x00e5 }
    L_0x007b:
        r0 = r2.initialStatus;	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        r21 = r15.findDexToOptimize(r7, r0);	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        r1 = "[opt] dto %s";	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        r0 = new java.lang.Object[r9];	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        r0[r8] = r21;	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
        if (r21 == 0) goto L_0x00cd;	 Catch:{ Throwable -> 0x00e8, all -> 0x00e5 }
    L_0x008c:
        r0 = r3.directory;	 Catch:{ DexOptException -> 0x00a9, all -> 0x00a7 }
        r16 = r7;	 Catch:{ DexOptException -> 0x00a9, all -> 0x00a7 }
        r18 = r6;	 Catch:{ DexOptException -> 0x00a9, all -> 0x00a7 }
        r19 = r2;	 Catch:{ DexOptException -> 0x00a9, all -> 0x00a7 }
        r8 = 0;	 Catch:{ DexOptException -> 0x00a9, all -> 0x00a7 }
        r9 = 1;	 Catch:{ DexOptException -> 0x00a9, all -> 0x00a7 }
        r22 = r5;	 Catch:{ DexOptException -> 0x00a5 }
        r17 = r0;	 Catch:{ DexOptException -> 0x00a5 }
        r20 = r4;	 Catch:{ DexOptException -> 0x00a5 }
        r15.optimize1(r16, r17, r18, r19, r20, r21, r22, r23);	 Catch:{ DexOptException -> 0x00a5 }
    L_0x009f:
        r21.close();	 Catch:{ Throwable -> 0x00cb, all -> 0x00c9 }
        goto L_0x00c0;	 Catch:{ Throwable -> 0x00cb, all -> 0x00c9 }
    L_0x00a3:
        r0 = move-exception;
        goto L_0x00c5;
    L_0x00a5:
        r1 = move-exception;
        goto L_0x00ac;
    L_0x00a7:
        r0 = move-exception;
        goto L_0x00c5;
    L_0x00a9:
        r1 = move-exception;
        r8 = 0;
        r9 = 1;
    L_0x00ac:
        r0 = com.facebook.common.dextricks.Fs.isKernelPageCacheFlushIsBroken;	 Catch:{ all -> 0x00a3 }
        if (r0 != 0) goto L_0x00c4;	 Catch:{ all -> 0x00a3 }
    L_0x00b0:
        r0 = r15.isFileCorruptionException(r1);	 Catch:{ all -> 0x00a3 }
        if (r0 == 0) goto L_0x00c4;	 Catch:{ all -> 0x00a3 }
    L_0x00b6:
        r1 = "detected odex file corruption: trying again with kernel workaround";	 Catch:{ all -> 0x00a3 }
        r0 = new java.lang.Object[r8];	 Catch:{ all -> 0x00a3 }
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);	 Catch:{ all -> 0x00a3 }
        com.facebook.common.dextricks.Fs.isKernelPageCacheFlushIsBroken = r9;	 Catch:{ all -> 0x00a3 }
        goto L_0x009f;	 Catch:{ all -> 0x00a3 }
    L_0x00c0:
        r2.close();	 Catch:{ Throwable -> 0x00f5 }
        goto L_0x00cf;	 Catch:{ Throwable -> 0x00f5 }
    L_0x00c4:
        throw r1;	 Catch:{ all -> 0x00a3 }
    L_0x00c5:
        r21.close();	 Catch:{ Throwable -> 0x00cb, all -> 0x00c9 }
        throw r0;	 Catch:{ Throwable -> 0x00cb, all -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        goto L_0x00e6;
    L_0x00cb:
        r1 = move-exception;
        goto L_0x00e9;
    L_0x00cd:
        r8 = 0;
        goto L_0x00c0;
    L_0x00cf:
        if (r21 != 0) goto L_0x00e1;
    L_0x00d1:
        r4.cleanup();	 Catch:{ Throwable -> 0x00f5 }
        r1 = "[opt] optimization complete";	 Catch:{ Throwable -> 0x00f5 }
        r0 = new java.lang.Object[r8];	 Catch:{ Throwable -> 0x00f5 }
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);	 Catch:{ Throwable -> 0x00f5 }
        if (r3 == 0) goto L_0x00e0;	 Catch:{ Throwable -> 0x00f5 }
    L_0x00dd:
        r3.close();
    L_0x00e0:
        return;
    L_0x00e1:
        r8 = 0;
        r9 = 1;
        goto L_0x0046;
    L_0x00e5:
        r0 = move-exception;
    L_0x00e6:
        r1 = r13;
        goto L_0x00eb;
    L_0x00e8:
        r1 = move-exception;
    L_0x00e9:
        throw r1;	 Catch:{ all -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;
    L_0x00eb:
        if (r1 == 0) goto L_0x00f1;
    L_0x00ed:
        r2.close();	 Catch:{ Throwable -> 0x00f4 }
        goto L_0x00f4;	 Catch:{ Throwable -> 0x00f4 }
    L_0x00f1:
        r2.close();	 Catch:{ Throwable -> 0x00f5 }
    L_0x00f4:
        throw r0;	 Catch:{ Throwable -> 0x00f5 }
    L_0x00f5:
        r13 = move-exception;
        goto L_0x00fa;
    L_0x00f7:
        r0 = move-exception;
        goto L_0x00fc;
    L_0x00f9:
        r13 = move-exception;
    L_0x00fa:
        throw r13;	 Catch:{ all -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
    L_0x00fc:
        if (r3 == 0) goto L_0x0107;
    L_0x00fe:
        if (r13 == 0) goto L_0x0104;
    L_0x0100:
        r3.close();	 Catch:{ Throwable -> 0x0107 }
        goto L_0x0107;	 Catch:{ Throwable -> 0x0107 }
    L_0x0104:
        r3.close();
    L_0x0107:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeXdex.optimize(android.content.Context, com.facebook.common.dextricks.DexStore, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$ProgressListener):void");
    }

    private void optimize1(com.facebook.common.dextricks.DexStore r17, java.io.File r18, com.facebook.common.dextricks.DexStore.OptimizationSession r19, com.facebook.common.dextricks.DexStore.OptimizationSession.Job r20, com.facebook.common.dextricks.DexOptRunner r21, com.facebook.common.dextricks.OdexSchemeXdex.DexToOptimize r22, java.io.File[] r23, byte[] r24) {
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
        r16 = this;
        r8 = r20;
        r8.startOptimizing();
        r4 = r16;
        r1 = r4.expectedFiles;
        r9 = r22;
        r0 = r9.dexNr;
        r2 = 2;
        r0 = r0 * 2;
        r7 = 0;
        r0 = r0 + r7;
        r11 = r1[r0];
        r1 = r4.expectedFiles;
        r0 = r9.dexNr;
        r0 = r0 * 2;
        r12 = 1;
        r0 = r0 + r12;
        r1 = r1[r0];
        r6 = new java.io.File;
        r0 = r18;
        r6.<init>(r0, r1);
        r3 = new java.io.File;
        r14 = r17;
        r0 = r14.root;
        r3.<init>(r0, r11);
        r5 = new java.io.File;
        r0 = r14.root;
        r5.<init>(r0, r1);
        r1 = "[opt] started optimizing %s -> %s";
        r0 = new java.lang.Object[r2];
        r0[r7] = r3;
        r0[r12] = r5;
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        r3 = r23;
        r1 = r3.length;
        r1 = r1 / r2;
        r0 = r4.expectedFiles;
        r0 = r0.length;
        r0 = r0 / r2;
        r1 = r1 + r0;
        r1 = r1 - r12;
        r10 = new java.lang.String[r1];
        r1 = 0;
        r13 = 0;
    L_0x004e:
        r0 = r3.length;
        if (r1 >= r0) goto L_0x005f;
    L_0x0051:
        r15 = r13 + 1;
        r0 = r23[r1];
        r0 = r0.getPath();
        r10[r13] = r0;
        r1 = r1 + 2;
        r13 = r15;
        goto L_0x004e;
    L_0x005f:
        r3 = 0;
    L_0x0060:
        r0 = r4.expectedFiles;
        r0 = r0.length;
        if (r3 >= r0) goto L_0x0083;
    L_0x0065:
        r1 = r3 / 2;
        r0 = r9.dexNr;
        if (r1 == r0) goto L_0x0080;
    L_0x006b:
        r16 = r13 + 1;
        r15 = new java.io.File;
        r1 = r14.root;
        r0 = r4.expectedFiles;
        r0 = r0[r3];
        r15.<init>(r1, r0);
        r0 = r15.getPath();
        r10[r13] = r0;
        r13 = r16;
    L_0x0080:
        r3 = r3 + 2;
        goto L_0x0060;
    L_0x0083:
        r0 = r10.length;
        if (r13 != r0) goto L_0x0088;
    L_0x0086:
        r3 = 1;
        goto L_0x0089;
    L_0x0088:
        r3 = 0;
    L_0x0089:
        r1 = "accounted for all dex files";
        r0 = new java.lang.Object[r7];
        com.facebook.common.dextricks.Mlog.assertThat(r3, r1, r0);
        r3 = new java.io.FileInputStream;
        r3.<init>(r5);
        r0 = 0;
        r13 = r4.openDexInsideOdex(r3);	 Catch:{ Throwable -> 0x0133 }
        r14 = r13.available();	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        if (r14 > r12) goto L_0x00a1;	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
    L_0x00a0:
        r14 = -1;	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
    L_0x00a1:
        r4 = "[opt] size hint for %s: %s";	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        r2 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        r2[r7] = r5;	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        r1 = java.lang.Integer.valueOf(r14);	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        r2[r12] = r1;	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        com.facebook.common.dextricks.Mlog.m56v(r4, r2);	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        r4 = new java.io.RandomAccessFile;	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        r1 = "rw";	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        r4.<init>(r6, r1);	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        r17 = "xdex";	 Catch:{ all -> 0x0108 }
        r12 = r21;	 Catch:{ all -> 0x0108 }
        r18 = r10;	 Catch:{ all -> 0x0108 }
        r16 = r4;	 Catch:{ all -> 0x0108 }
        r15 = r11;	 Catch:{ all -> 0x0108 }
        r12.run(r13, r14, r15, r16, r17, r18);	 Catch:{ all -> 0x0108 }
        r1 = r4.getFD();	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        r2 = com.facebook.forker.Fd.fileno(r1);	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        r1 = r24;	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        com.facebook.common.dextricks.DalvikInternals.replaceOdexDepBlock(r2, r1);	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        r1 = r19;	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        r1 = r1.config;	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        r1 = r1.prio;	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        r1 = r1.ioPriority;	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        com.facebook.common.dextricks.DalvikInternals.fsync(r2, r1);	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        com.facebook.common.dextricks.Fs.tryDiscardPageCache(r2);	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        r4.close();	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
        if (r13 == 0) goto L_0x00e6;	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
    L_0x00e3:
        r13.close();	 Catch:{ Throwable -> 0x0133 }
    L_0x00e6:
        r3.close();
        r3 = r8.startCommitting();
        r1 = 16;
        r0 = r9.dexNr;
        r1 = r1 << r0;
        r3 = r3 | r1;
        r1 = "[opt] started commit";
        r0 = new java.lang.Object[r7];
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);
        com.facebook.common.dextricks.Fs.renameOrThrow(r6, r5);
        r8.finishCommit(r3);
        r1 = "[opt] finished commit";
        r0 = new java.lang.Object[r7];
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);
        return;
    L_0x0108:
        r1 = move-exception;
        com.facebook.common.dextricks.Fs.deleteRecursive(r6);	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
        throw r1;	 Catch:{ Throwable -> 0x0110, all -> 0x010d }
    L_0x010d:
        r2 = move-exception;
        r1 = r0;
        goto L_0x0113;
    L_0x0110:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0112 }
    L_0x0112:
        r2 = move-exception;
    L_0x0113:
        if (r1 == 0) goto L_0x0119;
    L_0x0115:
        r4.close();	 Catch:{ Throwable -> 0x011c, all -> 0x011d }
        goto L_0x011c;	 Catch:{ Throwable -> 0x011c, all -> 0x011d }
    L_0x0119:
        r4.close();	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
    L_0x011c:
        throw r2;	 Catch:{ Throwable -> 0x0120, all -> 0x011d }
    L_0x011d:
        r2 = move-exception;
        r1 = r0;
        goto L_0x0123;
    L_0x0120:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0122 }
    L_0x0122:
        r2 = move-exception;
    L_0x0123:
        if (r13 == 0) goto L_0x012e;
    L_0x0125:
        if (r1 == 0) goto L_0x012b;
    L_0x0127:
        r13.close();	 Catch:{ Throwable -> 0x012e }
        goto L_0x012e;	 Catch:{ Throwable -> 0x012e }
    L_0x012b:
        r13.close();	 Catch:{ Throwable -> 0x0133 }
    L_0x012e:
        throw r2;	 Catch:{ Throwable -> 0x0133 }
    L_0x012f:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0139;
    L_0x0132:
        goto L_0x0135;
    L_0x0133:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x012f }
    L_0x0135:
        r3.close();	 Catch:{ Throwable -> 0x013c }
        goto L_0x013c;	 Catch:{ Throwable -> 0x013c }
    L_0x0139:
        r3.close();
    L_0x013c:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeXdex.optimize1(com.facebook.common.dextricks.DexStore, java.io.File, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$OptimizationSession$Job, com.facebook.common.dextricks.DexOptRunner, com.facebook.common.dextricks.OdexSchemeXdex$DexToOptimize, java.io.File[], byte[]):void");
    }

    private void prepareTmpDirForXdex(File[] fileArr, DexStore dexStore, File file) {
        File findSystemDalvikCache = Fs.findSystemDalvikCache();
        File file2 = new File(file, "dalvik-cache");
        Fs.mkdirOrThrow(file2);
        SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter(':');
        simpleStringSplitter.setString(System.getenv("BOOTCLASSPATH"));
        Iterator it = simpleStringSplitter.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (str.length() != 0) {
                String str2 = str.endsWith(".jar") ? "classes.dex" : null;
                File file3 = new File(str);
                Mlog.m56v("[opt] symlink %s -> %s", Fs.dexOptGenerateCacheFileName(file2, file3, str2), Fs.dexOptGenerateCacheFileName(findSystemDalvikCache, file3, str2));
                Fs.symlink(r3, r4);
            }
        }
        for (int i2 = 0; i2 < fileArr.length; i2 += 2) {
            makeFakeCacheSymlink(file2, fileArr[i2], fileArr[i2 + 1]);
        }
        while (i < this.expectedFiles.length) {
            makeFakeCacheSymlink(file2, new File(dexStore.root, this.expectedFiles[i]), new File(dexStore.root, this.expectedFiles[i + 1]));
            i += 2;
        }
    }
}
