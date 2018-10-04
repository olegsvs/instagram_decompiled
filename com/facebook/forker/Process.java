package com.facebook.forker;

import X.AnonymousClass0CF;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

public final class Process extends Process implements Closeable {
    private static final int FD_STREAM_INPUT = 0;
    private static final int FD_STREAM_OUTPUT = 1;
    private static final int IGNORE_FD = -1;
    public static final int SD_BLACK_HOLE = -3;
    public static final int SD_INHERIT = -2;
    public static final int SD_PIPE = -4;
    public static final int SD_STDOUT = -5;
    public static final int SIGCONT = 18;
    public static final int SIGKILL = 9;
    public static final int SIGSTOP = 19;
    public static final int SIGTERM = 15;
    public static final int SIGTSTP = 20;
    public static final int STATUS_EXITED = 4;
    public static final int STATUS_RUNNING = 1;
    public static final int STATUS_STOPPED = 2;
    public static final int STDERR = 2;
    public static final int STDIN = 0;
    public static final int STDOUT = 1;
    private static final String TAG = "fb-Process";
    public static final int WAIT_RESULT_RUNNING = -2147483646;
    public static final int WAIT_RESULT_STOPPED = -2147483647;
    public static final int WAIT_RESULT_TIMEOUT = Integer.MIN_VALUE;
    private InputStream mChildStderr;
    private OutputStream mChildStdin;
    private InputStream mChildStdout;
    private int mExitStatus;
    private int mPid = -1;
    private int mProcessStatus;
    private WaiterThread mWaiterThread = new WaiterThread();

    public final class WaiterThread extends Thread {
        public WaiterThread() {
            super("PidWaiter:Ready");
        }

        public void run() {
            Process.this.nativeWait();
        }
    }

    private native void nativeKill(int i);

    private native int nativeLaunch(String str, String[] strArr, byte[] bArr, int[] iArr, int[] iArr2);

    private static native void nativeUnixClose(int i);

    private static native int nativeUnixCreateTmpFile(String str);

    private static native int nativeUnixOpen(String str);

    private static native int[] nativeUnixPipe(int[] iArr);

    private native void nativeWait();

    static {
        AnonymousClass0CF.m856E("forker");
    }

    public Process(String str, String[] strArr, byte[] bArr, int[] iArr, int[] iArr2, File file) {
        Throwable th;
        Process process = this;
        int[] iArr3;
        int i;
        try {
            int i2;
            iArr3 = new int[6];
            i = 0;
            while (i < iArr3.length) {
                try {
                    iArr3[i] = -1;
                    i++;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            for (i2 = 0; i2 < iArr3.length; i2 += 2) {
                int[] nativeUnixPipe = nativeUnixPipe(new int[2]);
                if (i2 == 0) {
                    iArr3[0] = nativeUnixPipe[1];
                    iArr3[1] = nativeUnixPipe[0];
                } else {
                    iArr3[i2] = nativeUnixPipe[0];
                    iArr3[i2 + 1] = nativeUnixPipe[1];
                }
            }
            int[] iArr4 = new int[6];
            int i3 = 0;
            i = -1;
            while (i3 < 3) {
                try {
                    switch (iArr2[i3]) {
                        case SD_STDOUT /*-5*/:
                        case -2:
                            i2 = i3;
                            break;
                        case SD_PIPE /*-4*/:
                            i2 = iArr3[(i3 * 2) + 1];
                            break;
                        case SD_BLACK_HOLE /*-3*/:
                            if (i == -1) {
                                i = nativeUnixOpen("/dev/null");
                            }
                            i2 = (i != -1 || file == null) ? i : nativeUnixCreateTmpFile(file.getCanonicalPath());
                            if (i2 != -1) {
                                break;
                            }
                            i2 = -1;
                            break;
                        default:
                            if (iArr2[i3] >= 0) {
                                i2 = iArr2[i3];
                                break;
                            }
                            throw new IllegalArgumentException(String.format("illegal stream disposition %s for fd %s", new Object[]{Integer.valueOf(iArr2[i3]), Integer.valueOf(i3)}));
                    }
                    int i4 = i3 * 2;
                    iArr4[i4] = i2;
                    iArr4[i4 + 1] = i3;
                    i3++;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            for (int i5 = 0; i5 < 3; i5++) {
                if (iArr2[i5] == -5) {
                    iArr4[(i5 * 2) + 0] = iArr4[2];
                }
            }
            process.mPid = nativeLaunch(str, strArr, bArr, iArr4, iArr);
            WaiterThread waiterThread = process.mWaiterThread;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PidWaiter:");
            stringBuilder.append(process.mPid);
            waiterThread.setName(stringBuilder.toString());
            process.mChildStdin = (OutputStream) openFdStream(iArr3[0], 1);
            process.mChildStdout = (InputStream) openFdStream(iArr3[2], 0);
            process.mChildStderr = (InputStream) openFdStream(iArr3[4], 0);
            process.mWaiterThread.start();
            unixClose(i);
            unixClose(iArr3);
        } catch (Throwable th4) {
            th = th4;
            iArr3 = null;
            i = -1;
            unixClose(i);
            unixClose(iArr3);
            safeClose(process.mChildStdin);
            safeClose(process.mChildStdout);
            safeClose(process.mChildStderr);
            if (process.mPid != -1) {
                kill(9);
                nativeWait();
            }
            throw th;
        }
    }

    public void close() {
        destroy();
    }

    public static String describeStatus(int i) {
        StringBuilder stringBuilder;
        if (i < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("killed by signal ");
            stringBuilder.append(-i);
            return stringBuilder.toString();
        } else if (i <= 0) {
            return "exited successfully";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("exited with status ");
            stringBuilder.append(i);
            return stringBuilder.toString();
        }
    }

    public void destroy() {
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
        r2 = this;
        r0 = 9;
        r2.kill(r0);
        r1 = 0;
    L_0x0006:
        r0 = r2.mWaiterThread;	 Catch:{ InterruptedException -> 0x0029 }
        r0.join();	 Catch:{ InterruptedException -> 0x0029 }
        monitor-enter(r2);
        r0 = r2.mChildStdin;	 Catch:{ all -> 0x0026 }
        safeClose(r0);	 Catch:{ all -> 0x0026 }
        r0 = r2.mChildStdout;	 Catch:{ all -> 0x0026 }
        safeClose(r0);	 Catch:{ all -> 0x0026 }
        r0 = r2.mChildStderr;	 Catch:{ all -> 0x0026 }
        safeClose(r0);	 Catch:{ all -> 0x0026 }
        monitor-exit(r2);	 Catch:{ all -> 0x0026 }
        if (r1 == 0) goto L_0x0025;	 Catch:{ all -> 0x0026 }
    L_0x001e:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0025:
        return;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0026 }
        throw r0;
    L_0x0029:
        r1 = 1;
        java.lang.Thread.currentThread();
        java.lang.Thread.interrupted();
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.destroy():void");
    }

    public int exitValue() {
        int exitValueEx = exitValueEx();
        return exitValueEx < 0 ? (-exitValueEx) + 128 : exitValueEx;
    }

    public synchronized int exitValueEx() {
        if (this.mProcessStatus == 4) {
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Process has not yet terminated: ");
            stringBuilder.append(this.mPid);
            throw new IllegalThreadStateException(stringBuilder.toString());
        }
        return this.mExitStatus;
    }

    private static String fdMagicName(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/proc/");
        stringBuilder.append(android.os.Process.myPid());
        stringBuilder.append("/task/");
        stringBuilder.append(android.os.Process.myTid());
        stringBuilder.append("/fd/");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public InputStream getErrorStream() {
        return this.mChildStderr;
    }

    public InputStream getInputStream() {
        return this.mChildStdout;
    }

    public OutputStream getOutputStream() {
        return this.mChildStdin;
    }

    public int getPid() {
        return this.mPid;
    }

    public void kill(int i) {
        nativeKill(i);
    }

    private static java.lang.Object openFdStream(int r2, int r3) {
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
        r1 = fdMagicName(r2);
        if (r3 != 0) goto L_0x000c;
    L_0x0006:
        r0 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0012 }
        r0.<init>(r1);	 Catch:{ FileNotFoundException -> 0x0012 }
        goto L_0x0023;	 Catch:{ FileNotFoundException -> 0x0012 }
    L_0x000c:
        r0 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0012 }
        r0.<init>(r1);	 Catch:{ FileNotFoundException -> 0x0012 }
        goto L_0x0023;	 Catch:{ FileNotFoundException -> 0x0012 }
    L_0x0012:
        r1 = android.os.ParcelFileDescriptor.fromFd(r2);
        if (r3 != 0) goto L_0x001e;
    L_0x0018:
        r0 = new android.os.ParcelFileDescriptor$AutoCloseInputStream;
        r0.<init>(r1);
        goto L_0x0023;
    L_0x001e:
        r0 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream;
        r0.<init>(r1);
    L_0x0023:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.openFdStream(int, int):java.lang.Object");
    }

    private static void safeClose(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.safeClose(java.io.Closeable):void");
    }

    private static void unixClose(int i) {
        if (i != -1) {
            nativeUnixClose(i);
        }
    }

    private static void unixClose(int[] iArr) {
        if (iArr != null) {
            for (int unixClose : iArr) {
                unixClose(unixClose);
            }
        }
    }

    public synchronized int waitFor() {
        while (this.mProcessStatus != 4) {
            wait();
        }
        return exitValue();
    }

    public synchronized int waitFor(int i, int i2) {
        AssertionError assertionError;
        long j = 0;
        while ((this.mProcessStatus & i2) == 0 && this.mProcessStatus != 4 && i != 0) {
            if (i > 0) {
                j = System.currentTimeMillis();
                wait((long) i);
            } else {
                wait();
            }
            if (i > 0) {
                long max = Math.max(0, System.currentTimeMillis() - j);
                i = ((long) i) < max ? 0 : i - ((int) max);
            }
        }
        if ((i2 & this.mProcessStatus) != 0) {
            int i3 = this.mProcessStatus;
            if (i3 != 4) {
                switch (i3) {
                    case 1:
                        return WAIT_RESULT_RUNNING;
                    case 2:
                        return WAIT_RESULT_STOPPED;
                    default:
                        assertionError = new AssertionError();
                        break;
                }
            }
            return this.mExitStatus;
        } else if (i == 0) {
            return WAIT_RESULT_TIMEOUT;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("process entered unexpected state ");
            stringBuilder.append(this.mProcessStatus);
            assertionError = new RuntimeException(stringBuilder.toString());
        }
        throw assertionError;
    }

    public int waitForUninterruptibly() {
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
        r1 = this;
        r0 = 0;
    L_0x0001:
        r1 = r1.waitFor();	 Catch:{ InterruptedException -> 0x000f }
        if (r0 == 0) goto L_0x000e;	 Catch:{ InterruptedException -> 0x000f }
    L_0x0007:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x000e:
        return r1;
    L_0x000f:
        r0 = 1;
        java.lang.Thread.currentThread();
        java.lang.Thread.interrupted();
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.waitForUninterruptibly():int");
    }

    public int waitForUninterruptibly(int r13, int r14) {
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
        r1 = 0;
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r10 = 0;
        r8 = 0;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x0009:
        if (r13 <= 0) goto L_0x000f;
    L_0x000b:
        r10 = java.lang.System.currentTimeMillis();
    L_0x000f:
        r7 = r12.waitFor(r13, r14);	 Catch:{ InterruptedException -> 0x0019 }
        if (r7 == r9) goto L_0x0016;	 Catch:{ InterruptedException -> 0x0019 }
    L_0x0015:
        goto L_0x0036;	 Catch:{ InterruptedException -> 0x0019 }
    L_0x0016:
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ InterruptedException -> 0x0019 }
        goto L_0x0020;	 Catch:{ InterruptedException -> 0x0019 }
    L_0x0019:
        r8 = 1;
        java.lang.Thread.currentThread();
        java.lang.Thread.interrupted();
    L_0x0020:
        if (r13 <= 0) goto L_0x0034;
    L_0x0022:
        r3 = java.lang.System.currentTimeMillis();
        r3 = r3 - r10;
        r3 = java.lang.Math.max(r1, r3);
        r5 = (long) r13;
        r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x0032;
    L_0x0030:
        r13 = 0;
        goto L_0x0034;
    L_0x0032:
        r0 = (int) r3;
        r13 = r13 - r0;
    L_0x0034:
        if (r13 != 0) goto L_0x0009;
    L_0x0036:
        if (r8 == 0) goto L_0x003f;
    L_0x0038:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x003f:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.waitForUninterruptibly(int, int):int");
    }
}
