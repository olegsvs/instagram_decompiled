package com.facebook.common.dextricks;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public final class ReentrantLockFile implements Closeable {
    public static final int ACQUIRE_SHARED = 1;
    private static final boolean LOCK_DEBUG = false;
    private static final ReentrantLockFile sListHead = new ReentrantLockFile();
    public final File lockFileName;
    private FileChannel mChannel;
    private int mLockFlags;
    private final Lock mLockHandle;
    private boolean mLockInProgress;
    private Thread mLockOwner;
    private int mLockShareCount;
    private ReentrantLockFile mNext;
    private ReentrantLockFile mPrev;
    private int mReferenceCount;
    private FileLock mTheLock;

    public final class Lock implements Closeable {
        public void close() {
            ReentrantLockFile.this.release();
        }

        public ReentrantLockFile getReentrantLockFile() {
            return ReentrantLockFile.this;
        }
    }

    public com.facebook.common.dextricks.ReentrantLockFile.Lock acquireInterruptubly(int r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.fixSplitterBlock(BlockFinish.java:63)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:34)
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
        r0 = r11 & 1;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        r9 = 1;
        goto L_0x0009;
    L_0x0008:
        r9 = 0;
    L_0x0009:
        r10.assertMonitorLockNotHeld();
        monitor-enter(r10);	 Catch:{ all -> 0x008a }
        r3 = 0;	 Catch:{ all -> 0x008a }
    L_0x000e:
        r0 = r10.tryAcquire(r11);	 Catch:{ all -> 0x0081 }
        if (r0 == 0) goto L_0x001d;	 Catch:{ all -> 0x0081 }
    L_0x0014:
        r0 = r10.mLockHandle;	 Catch:{ all -> 0x0081 }
        monitor-exit(r10);	 Catch:{ all -> 0x0081 }
        if (r3 == 0) goto L_0x001c;	 Catch:{ all -> 0x0081 }
    L_0x0019:
        r10.close();
    L_0x001c:
        return r0;
    L_0x001d:
        r0 = r10.mLockInProgress;	 Catch:{ all -> 0x0081 }
        if (r0 != 0) goto L_0x0077;	 Catch:{ all -> 0x0081 }
    L_0x0021:
        r0 = r10.mLockShareCount;	 Catch:{ all -> 0x0081 }
        if (r0 != 0) goto L_0x0077;	 Catch:{ all -> 0x0081 }
    L_0x0025:
        if (r3 != 0) goto L_0x002b;	 Catch:{ all -> 0x0081 }
    L_0x0027:
        r10.addrefLocked();	 Catch:{ all -> 0x0081 }
        r3 = 1;	 Catch:{ all -> 0x0081 }
    L_0x002b:
        r10.mLockInProgress = r1;	 Catch:{ all -> 0x0081 }
        monitor-exit(r10);	 Catch:{ all -> 0x0081 }
        r4 = r10.mChannel;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        r5 = 0;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        r7 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        r0 = r4.lock(r5, r7, r9);	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        if (r0 != 0) goto L_0x004b;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
    L_0x003d:
        monitor-enter(r10);	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        r10.mLockInProgress = r2;	 Catch:{ all -> 0x0048 }
        r10.notifyAll();	 Catch:{ all -> 0x0048 }
        monitor-exit(r10);	 Catch:{ all -> 0x0048 }
        r10.close();	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        goto L_0x004b;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
    L_0x0048:
        r0 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x0048 }
    L_0x004a:
        throw r0;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
    L_0x004b:
        monitor-enter(r10);	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        r10.claimLock(r11, r0);	 Catch:{ all -> 0x005a }
        r10.mLockInProgress = r2;	 Catch:{ all -> 0x0058 }
        r10.notifyAll();	 Catch:{ all -> 0x0058 }
        r0 = r10.mLockHandle;	 Catch:{ all -> 0x0058 }
        monitor-exit(r10);	 Catch:{ all -> 0x0058 }
        goto L_0x001c;	 Catch:{ all -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        goto L_0x005c;
    L_0x005a:
        r0 = move-exception;
        r2 = r3;
    L_0x005c:
        monitor-exit(r10);	 Catch:{ all -> 0x0058 }
    L_0x005d:
        throw r0;	 Catch:{ all -> 0x0085 }
    L_0x005e:
        r0 = move-exception;
        goto L_0x0067;
    L_0x0060:
        r1 = move-exception;
        r0 = new java.lang.RuntimeException;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        throw r0;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
    L_0x0067:
        monitor-enter(r10);	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        r10.mLockInProgress = r2;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        r10.notifyAll();	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        monitor-exit(r10);	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        r10.close();	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        goto L_0x004a;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
    L_0x0072:
        r0 = move-exception;
        goto L_0x008c;
    L_0x0074:
        r0 = move-exception;
        monitor-exit(r10);	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
        goto L_0x004a;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
    L_0x0077:
        if (r3 != 0) goto L_0x007d;	 Catch:{ IOException -> 0x0060, all -> 0x005e, all -> 0x0072, all -> 0x0074 }
    L_0x0079:
        r10.addrefLocked();	 Catch:{ all -> 0x0081 }
        r3 = 1;	 Catch:{ all -> 0x0081 }
    L_0x007d:
        r10.wait();	 Catch:{ all -> 0x0081 }
        goto L_0x000e;	 Catch:{ all -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        r2 = r3;
    L_0x0083:
        monitor-exit(r10);	 Catch:{ all -> 0x0088 }
        goto L_0x005d;	 Catch:{ all -> 0x0088 }
    L_0x0085:
        r0 = move-exception;
        r3 = r2;
        goto L_0x008c;
    L_0x0088:
        r0 = move-exception;
        goto L_0x0083;
    L_0x008a:
        r0 = move-exception;
        r3 = 0;
    L_0x008c:
        if (r3 == 0) goto L_0x0091;
    L_0x008e:
        r10.close();
    L_0x0091:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.acquireInterruptubly(int):com.facebook.common.dextricks.ReentrantLockFile$Lock");
    }

    private ReentrantLockFile() {
        this.lockFileName = null;
        this.mLockHandle = null;
        this.mNext = this;
        this.mPrev = this;
    }

    private ReentrantLockFile(File file, FileChannel fileChannel) {
        this.lockFileName = file;
        this.mChannel = fileChannel;
        this.mReferenceCount = 1;
        this.mLockHandle = new Lock();
    }

    public com.facebook.common.dextricks.ReentrantLockFile.Lock acquire(int r1) {
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
        r0 = this;
        r1 = r0.acquireInterruptubly(r1);	 Catch:{ InterruptedException -> 0x0006 }
        r0 = 0;	 Catch:{ InterruptedException -> 0x0006 }
        goto L_0x0008;	 Catch:{ InterruptedException -> 0x0006 }
    L_0x0006:
        r0 = 1;
        r1 = 0;
    L_0x0008:
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0011:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.acquire(int):com.facebook.common.dextricks.ReentrantLockFile$Lock");
    }

    private void addrefLocked() {
        if (this.mChannel != null) {
            this.mReferenceCount++;
            return;
        }
        throw new IllegalStateException("cannot add reference to dead lock");
    }

    private void assertMonitorLockNotHeld() {
        Mlog.assertThat(Thread.holdsLock(this) ^ 1, "lock order violation", new Object[0]);
    }

    private void claimLock(int i, FileLock fileLock) {
        if ((i & 1) == 0) {
            this.mLockOwner = Thread.currentThread();
        }
        this.mTheLock = fileLock;
        this.mLockFlags = i;
        this.mLockShareCount = 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
        r3 = this;
        r3.assertMonitorLockNotHeld();
        monitor-enter(r3);
        r0 = r3.mChannel;	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r3);	 Catch:{ all -> 0x0044 }
    L_0x0009:
        return;
    L_0x000a:
        r0 = r3.mReferenceCount;	 Catch:{ all -> 0x0044 }
        r1 = 1;
        if (r0 <= r1) goto L_0x0015;
    L_0x000f:
        r0 = r3.mReferenceCount;	 Catch:{ all -> 0x0044 }
        r0 = r0 - r1;
        r3.mReferenceCount = r0;	 Catch:{ all -> 0x0044 }
        goto L_0x0008;
    L_0x0015:
        monitor-exit(r3);	 Catch:{ all -> 0x0044 }
        r2 = com.facebook.common.dextricks.ReentrantLockFile.class;
        monitor-enter(r2);
        monitor-enter(r3);	 Catch:{ all -> 0x0041 }
        r0 = r3.mReferenceCount;	 Catch:{ all -> 0x003e }
        r0 = r0 - r1;
        r3.mReferenceCount = r0;	 Catch:{ all -> 0x003e }
        r0 = r3.mReferenceCount;	 Catch:{ all -> 0x003e }
        if (r0 != 0) goto L_0x003b;
    L_0x0023:
        r1 = r3.mPrev;	 Catch:{ all -> 0x003e }
        r0 = r3.mNext;	 Catch:{ all -> 0x003e }
        r1.mNext = r0;	 Catch:{ all -> 0x003e }
        r1 = r3.mNext;	 Catch:{ all -> 0x003e }
        r0 = r3.mPrev;	 Catch:{ all -> 0x003e }
        r1.mPrev = r0;	 Catch:{ all -> 0x003e }
        r1 = 0;
        r3.mPrev = r1;	 Catch:{ all -> 0x003e }
        r3.mNext = r1;	 Catch:{ all -> 0x003e }
        r0 = r3.mChannel;	 Catch:{ all -> 0x003e }
        com.facebook.common.dextricks.Fs.safeClose(r0);	 Catch:{ all -> 0x003e }
        r3.mChannel = r1;	 Catch:{ all -> 0x003e }
    L_0x003b:
        monitor-exit(r3);	 Catch:{ all -> 0x003e }
        monitor-exit(r2);	 Catch:{ all -> 0x0041 }
        goto L_0x0009;
    L_0x003e:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x003e }
        throw r0;	 Catch:{ all -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0041 }
    L_0x0043:
        throw r0;
    L_0x0044:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0044 }
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.close():void");
    }

    public void donateLock(Thread thread) {
        Mlog.assertThat(getExclusiveOwner() == Thread.currentThread(), "caller must own lock exclusively", new Object[0]);
        this.mLockOwner = thread;
    }

    public Thread getExclusiveOwner() {
        return this.mLockOwner;
    }

    public static synchronized ReentrantLockFile open(File file) {
        ReentrantLockFile reentrantLockFile;
        Throwable th;
        Closeable closeable;
        synchronized (ReentrantLockFile.class) {
            File absoluteFile = file.getAbsoluteFile();
            reentrantLockFile = sListHead;
            do {
                reentrantLockFile = reentrantLockFile.mNext;
                if (reentrantLockFile == sListHead) {
                    RandomAccessFile randomAccessFile;
                    Closeable closeable2 = null;
                    try {
                        randomAccessFile = new RandomAccessFile(absoluteFile, "rw");
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = null;
                        Fs.safeClose(closeable2);
                        Fs.safeClose(closeable);
                        throw th;
                    }
                    try {
                        closeable = randomAccessFile.getChannel();
                        try {
                            reentrantLockFile = new ReentrantLockFile(absoluteFile, closeable);
                            ReentrantLockFile reentrantLockFile2 = sListHead;
                            reentrantLockFile.mPrev = reentrantLockFile2;
                            reentrantLockFile.mNext = reentrantLockFile2.mNext;
                            reentrantLockFile.mPrev.mNext = reentrantLockFile;
                            reentrantLockFile.mNext.mPrev = reentrantLockFile;
                            Fs.safeClose(null);
                            Fs.safeClose(null);
                            break;
                        } catch (Throwable th3) {
                            th = th3;
                            Fs.safeClose(closeable2);
                            Fs.safeClose(closeable);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        closeable = null;
                        closeable2 = randomAccessFile;
                        Fs.safeClose(closeable2);
                        Fs.safeClose(closeable);
                        throw th;
                    }
                }
            } while (!absoluteFile.equals(reentrantLockFile.lockFileName));
            synchronized (reentrantLockFile) {
                try {
                    reentrantLockFile.addrefLocked();
                } catch (Throwable th5) {
                    while (true) {
                        th = th5;
                    }
                    throw th;
                }
            }
        }
        return reentrantLockFile;
    }

    public void release() {
        assertMonitorLockNotHeld();
        synchronized (this) {
            boolean z;
            int i = 1;
            Mlog.assertThat(this.mLockShareCount > 0, "lock release balance", new Object[0]);
            if (((this.mLockFlags & 1) != 0 ? 1 : null) == null) {
                if (this.mLockOwner != Thread.currentThread()) {
                    z = false;
                    Mlog.assertThat(z, "lock thread affinity", new Object[0]);
                    this.mLockShareCount--;
                    if (this.mLockShareCount != 0) {
                        try {
                            this.mTheLock.release();
                            this.mLockOwner = null;
                            this.mTheLock = null;
                            this.mLockFlags = 0;
                            notifyAll();
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    }
                    i = 0;
                }
            }
            z = true;
            Mlog.assertThat(z, "lock thread affinity", new Object[0]);
            this.mLockShareCount--;
            if (this.mLockShareCount != 0) {
                i = 0;
            } else {
                this.mTheLock.release();
                this.mLockOwner = null;
                this.mTheLock = null;
                this.mLockFlags = 0;
                notifyAll();
            }
        }
        if (i != 0) {
            close();
        }
    }

    public void stealLock() {
        Mlog.assertThat(getExclusiveOwner() != null, "cannot steal unowned lock", new Object[0]);
        this.mLockOwner = Thread.currentThread();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.common.dextricks.ReentrantLockFile.Lock tryAcquire(int r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.mChannel;	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x006e;
    L_0x0005:
        r0 = r11 & 1;
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        r9 = 1;
        goto L_0x000e;
    L_0x000d:
        r9 = 0;
    L_0x000e:
        r0 = r10.mLockInProgress;	 Catch:{ all -> 0x0076 }
        r3 = 0;
        if (r0 == 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r10);
        return r3;
    L_0x0015:
        r0 = r10.mLockShareCount;	 Catch:{ all -> 0x0076 }
        if (r0 <= 0) goto L_0x0036;
    L_0x0019:
        r0 = r10.mLockFlags;	 Catch:{ all -> 0x0076 }
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        r1 = 1;
    L_0x001f:
        if (r9 == 0) goto L_0x0023;
    L_0x0021:
        if (r1 != 0) goto L_0x002d;
    L_0x0023:
        if (r1 != 0) goto L_0x0013;
    L_0x0025:
        r1 = r10.mLockOwner;	 Catch:{ all -> 0x0076 }
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0076 }
        if (r1 != r0) goto L_0x0013;
    L_0x002d:
        r0 = r10.mLockShareCount;	 Catch:{ all -> 0x0076 }
        r0 = r0 + r2;
        r10.mLockShareCount = r0;	 Catch:{ all -> 0x0076 }
        r0 = r10.mLockHandle;	 Catch:{ all -> 0x0076 }
    L_0x0034:
        monitor-exit(r10);
        return r0;
    L_0x0036:
        r4 = r10.mChannel;	 Catch:{ IOException -> 0x0044 }
        r5 = 0;
        r7 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = r4.tryLock(r5, r7, r9);	 Catch:{ IOException -> 0x0044 }
        goto L_0x005c;
    L_0x0044:
        r2 = move-exception;
        r1 = r2.getMessage();	 Catch:{ all -> 0x0076 }
        if (r1 == 0) goto L_0x0068;
    L_0x004b:
        r0 = ": EAGAIN (";
        r0 = r1.contains(r0);	 Catch:{ all -> 0x0076 }
        if (r0 != 0) goto L_0x005b;
    L_0x0053:
        r0 = ": errno 11 (";
        r0 = r1.contains(r0);	 Catch:{ all -> 0x0076 }
        if (r0 == 0) goto L_0x0068;
    L_0x005b:
        r0 = r3;
    L_0x005c:
        if (r0 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x0013;
    L_0x005f:
        r10.addrefLocked();	 Catch:{ all -> 0x0076 }
        r10.claimLock(r11, r0);	 Catch:{ all -> 0x0076 }
        r0 = r10.mLockHandle;	 Catch:{ all -> 0x0076 }
        goto L_0x0034;
    L_0x0068:
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0076 }
        r1.<init>(r2);	 Catch:{ all -> 0x0076 }
    L_0x006d:
        throw r1;	 Catch:{ all -> 0x0076 }
    L_0x006e:
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0076 }
        r0 = "cannot acquire closed lock";
        r1.<init>(r0);	 Catch:{ all -> 0x0076 }
        goto L_0x006d;
    L_0x0076:
        r0 = move-exception;
        monitor-exit(r10);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.tryAcquire(int):com.facebook.common.dextricks.ReentrantLockFile$Lock");
    }
}
