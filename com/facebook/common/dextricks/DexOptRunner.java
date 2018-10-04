package com.facebook.common.dextricks;

import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class DexOptRunner {
    private final ProcessBuilder mTemplate;
    private final File mTmpDir;
    private File mTmpFbDexOpt = null;

    public class DexOptException extends RuntimeException {
        public final String errout;
        public final int status;

        public DexOptException(int i, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dexopt failed with status ");
            stringBuilder.append(Process.describeStatus(i));
            stringBuilder.append(": [");
            stringBuilder.append(str);
            stringBuilder.append("]");
            super(stringBuilder.toString());
            this.status = i;
            this.errout = str;
        }
    }

    public void addDexOptOptions(ProcessBuilder processBuilder) {
    }

    public DexOptRunner(java.io.File r7) {
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
        r6 = this;
        r6.<init>();
        r0 = 0;
        r6.mTmpFbDexOpt = r0;
        r6.mTmpDir = r7;
        r1 = "fbdexopt";
        r5 = X.AnonymousClass0CF.m863L(r1);
        r1 = r5.canExecute();
        if (r1 != 0) goto L_0x0059;
    L_0x0014:
        r1 = "fbdexopt";
        r2 = java.io.File.createTempFile(r1, r0, r7);
        r6.mTmpFbDexOpt = r2;
        r4 = new java.io.FileOutputStream;
        r4.<init>(r2);
        r3 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x004f }
        r3.<init>(r5);	 Catch:{ Throwable -> 0x004f }
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ Throwable -> 0x004f }
        com.facebook.common.dextricks.Fs.copyBytes(r4, r3, r1);	 Catch:{ Throwable -> 0x003e, all -> 0x003b }
        r4.flush();	 Catch:{ Throwable -> 0x003e, all -> 0x003b }
        r3.close();	 Catch:{ Throwable -> 0x004f }
        r4.close();
        r0 = 1;
        r2.setExecutable(r0, r0);
        r5 = r2;
        goto L_0x0059;
    L_0x003b:
        r1 = move-exception;
        r2 = r0;
        goto L_0x0041;
    L_0x003e:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0040 }
    L_0x0040:
        r1 = move-exception;
    L_0x0041:
        if (r2 == 0) goto L_0x0047;
    L_0x0043:
        r3.close();	 Catch:{ Throwable -> 0x004a }
        goto L_0x004a;	 Catch:{ Throwable -> 0x004a }
    L_0x0047:
        r3.close();	 Catch:{ Throwable -> 0x004f }
    L_0x004a:
        throw r1;	 Catch:{ Throwable -> 0x004f }
    L_0x004b:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0055;
    L_0x004e:
        goto L_0x0051;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004b }
    L_0x0051:
        r4.close();	 Catch:{ Throwable -> 0x0058 }
        goto L_0x0058;	 Catch:{ Throwable -> 0x0058 }
    L_0x0055:
        r4.close();
    L_0x0058:
        throw r1;
    L_0x0059:
        r2 = new com.facebook.forker.ProcessBuilder;
        r1 = r5.getAbsolutePath();
        r0 = 0;
        r0 = new java.lang.String[r0];
        r2.<init>(r1, r0);
        r1 = "LD_LIBRARY_PATH";
        r0 = X.AnonymousClass0CF.m859H();
        r0 = r2.setenv(r1, r0);
        r0 = r0.setTmpDir(r7);
        r6.mTemplate = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptRunner.<init>(java.io.File):void");
    }

    public boolean attemptAllocate(int i, long j) {
        return DalvikInternals.attemptAllocate(i, j, -1);
    }

    public void cleanup() {
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
        r3 = this;
        r0 = r3.mTmpFbDexOpt;
        if (r0 == 0) goto L_0x0019;
    L_0x0004:
        r2 = 0;
        r1 = "Cleaning up temporary fbdexopt";	 Catch:{ IOException -> 0x0012 }
        r0 = new java.lang.Object[r2];	 Catch:{ IOException -> 0x0012 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ IOException -> 0x0012 }
        r0 = r3.mTmpFbDexOpt;	 Catch:{ IOException -> 0x0012 }
        com.facebook.common.dextricks.Fs.deleteRecursive(r0);	 Catch:{ IOException -> 0x0012 }
        goto L_0x0019;	 Catch:{ IOException -> 0x0012 }
    L_0x0012:
        r1 = "Unable to delete temporary fbdexopt";
        r0 = new java.lang.Object[r2];
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);
    L_0x0019:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptRunner.cleanup():void");
    }

    public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
        return Fs.copyBytes(randomAccessFile, inputStream, Integer.MAX_VALUE, new byte[32768]);
    }

    public final void run(java.io.InputStream r12, int r13, java.lang.String r14, java.io.RandomAccessFile r15, java.lang.String r16, java.lang.String[] r17) {
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
        r11 = this;
        r0 = r15.getFilePointer();
        r3 = 0;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        r6 = 1;
        r5 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000c:
        r2 = 1;
        goto L_0x000f;
    L_0x000e:
        r2 = 0;
    L_0x000f:
        r1 = "odex fpos must be 0";
        r0 = new java.lang.Object[r5];
        com.facebook.common.dextricks.Mlog.assertThat(r2, r1, r0);
        r0 = r15.length();
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 != 0) goto L_0x0020;
    L_0x001e:
        r2 = 1;
        goto L_0x0021;
    L_0x0020:
        r2 = 0;
    L_0x0021:
        r1 = "odex must be empty";
        r0 = new java.lang.Object[r5];
        com.facebook.common.dextricks.Mlog.assertThat(r2, r1, r0);
        r0 = r15.getFD();
        r4 = com.facebook.forker.Fd.fileno(r0);
        com.facebook.common.dextricks.DalvikInternals.dexOptCreateEmptyHeader(r4);
        r0 = r15.getFilePointer();
        r7 = (int) r0;
        if (r13 <= r6) goto L_0x005b;
    L_0x003a:
        r0 = r15.getFilePointer();
        r2 = (long) r13;
        r0 = r0 + r2;
        r0 = r11.attemptAllocate(r4, r0);
        if (r0 == 0) goto L_0x0054;
    L_0x0046:
        r2 = "allocated more %s bytes for dex content";
        r1 = new java.lang.Object[r6];
        r0 = java.lang.Integer.valueOf(r13);
        r1[r5] = r0;
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);
        goto L_0x005b;
    L_0x0054:
        r1 = "unable to preallocate on this system";
        r0 = new java.lang.Object[r5];
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);
    L_0x005b:
        r9 = r11.copyDexToOdex(r12, r13, r15);
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r9 == r0) goto L_0x011d;
    L_0x0064:
        r3 = "wrote %s bytes to dex %s";
        r2 = 2;
        r1 = new java.lang.Object[r2];
        r0 = java.lang.Integer.valueOf(r9);
        r1[r5] = r0;
        r1[r6] = r14;
        com.facebook.common.dextricks.Mlog.m56v(r3, r1);
        r0 = r11.mTmpDir;
        r10 = com.facebook.common.dextricks.Fs.openUnlinkedTemporaryFile(r0);
        r0 = 0;
        r1 = r11.mTemplate;	 Catch:{ Throwable -> 0x0111 }
        r3 = r1.clone();	 Catch:{ Throwable -> 0x0111 }
        r1 = r10.getFD();	 Catch:{ Throwable -> 0x0111 }
        r1 = com.facebook.forker.Fd.fileno(r1);	 Catch:{ Throwable -> 0x0111 }
        r3 = r3.setStream(r6, r1);	 Catch:{ Throwable -> 0x0111 }
        r1 = -5;	 Catch:{ Throwable -> 0x0111 }
        r1 = r3.setStream(r2, r1);	 Catch:{ Throwable -> 0x0111 }
        r8 = r1.setFdCloseOnExec(r4, r5);	 Catch:{ Throwable -> 0x0111 }
        r11.addDexOptOptions(r8);	 Catch:{ Throwable -> 0x0111 }
        r1 = 10;	 Catch:{ Throwable -> 0x0111 }
        r3 = new java.lang.String[r1];	 Catch:{ Throwable -> 0x0111 }
        r1 = "--";	 Catch:{ Throwable -> 0x0111 }
        r3[r5] = r1;	 Catch:{ Throwable -> 0x0111 }
        r1 = java.lang.Integer.toString(r4);	 Catch:{ Throwable -> 0x0111 }
        r3[r6] = r1;	 Catch:{ Throwable -> 0x0111 }
        r3[r2] = r14;	 Catch:{ Throwable -> 0x0111 }
        r2 = 3;	 Catch:{ Throwable -> 0x0111 }
        r1 = java.lang.Integer.toString(r5);	 Catch:{ Throwable -> 0x0111 }
        r3[r2] = r1;	 Catch:{ Throwable -> 0x0111 }
        r2 = 4;	 Catch:{ Throwable -> 0x0111 }
        r1 = java.lang.Integer.toString(r5);	 Catch:{ Throwable -> 0x0111 }
        r3[r2] = r1;	 Catch:{ Throwable -> 0x0111 }
        r2 = 5;	 Catch:{ Throwable -> 0x0111 }
        r1 = "BOOTCLASSPATH";	 Catch:{ Throwable -> 0x0111 }
        r1 = java.lang.System.getenv(r1);	 Catch:{ Throwable -> 0x0111 }
        r3[r2] = r1;	 Catch:{ Throwable -> 0x0111 }
        r2 = 6;	 Catch:{ Throwable -> 0x0111 }
        r5 = r17;	 Catch:{ Throwable -> 0x0111 }
        if (r17 != 0) goto L_0x00c8;	 Catch:{ Throwable -> 0x0111 }
    L_0x00c5:
        r1 = "";	 Catch:{ Throwable -> 0x0111 }
        goto L_0x00ce;	 Catch:{ Throwable -> 0x0111 }
    L_0x00c8:
        r1 = ":";	 Catch:{ Throwable -> 0x0111 }
        r1 = android.text.TextUtils.join(r1, r5);	 Catch:{ Throwable -> 0x0111 }
    L_0x00ce:
        r3[r2] = r1;	 Catch:{ Throwable -> 0x0111 }
        r5 = 7;	 Catch:{ Throwable -> 0x0111 }
        r1 = (long) r7;	 Catch:{ Throwable -> 0x0111 }
        r1 = java.lang.Long.toString(r1);	 Catch:{ Throwable -> 0x0111 }
        r3[r5] = r1;	 Catch:{ Throwable -> 0x0111 }
        r5 = 8;	 Catch:{ Throwable -> 0x0111 }
        r1 = (long) r9;	 Catch:{ Throwable -> 0x0111 }
        r1 = java.lang.Long.toString(r1);	 Catch:{ Throwable -> 0x0111 }
        r3[r5] = r1;	 Catch:{ Throwable -> 0x0111 }
        r1 = 9;	 Catch:{ Throwable -> 0x0111 }
        r3[r1] = r16;	 Catch:{ Throwable -> 0x0111 }
        r8.addArguments(r3);	 Catch:{ Throwable -> 0x0111 }
        r2 = r11.startSubprocess(r8);	 Catch:{ Throwable -> 0x0111 }
        r11.waitForDexOpt(r2, r4);	 Catch:{ all -> 0x0108 }
        r3 = r2.exitValueEx();	 Catch:{ all -> 0x0108 }
        r2.destroy();	 Catch:{ Throwable -> 0x0111 }
        if (r3 != 0) goto L_0x00fe;	 Catch:{ Throwable -> 0x0111 }
    L_0x00f8:
        if (r10 == 0) goto L_0x00fd;	 Catch:{ Throwable -> 0x0111 }
    L_0x00fa:
        r10.close();
    L_0x00fd:
        return;
    L_0x00fe:
        r2 = new com.facebook.common.dextricks.DexOptRunner$DexOptException;	 Catch:{ Throwable -> 0x0111 }
        r1 = com.facebook.common.dextricks.Fs.readProgramOutputFile(r10);	 Catch:{ Throwable -> 0x0111 }
        r2.<init>(r3, r1);	 Catch:{ Throwable -> 0x0111 }
        throw r2;	 Catch:{ Throwable -> 0x0111 }
    L_0x0108:
        r1 = move-exception;	 Catch:{ Throwable -> 0x0111 }
        r2.destroy();	 Catch:{ Throwable -> 0x0111 }
        throw r1;	 Catch:{ Throwable -> 0x0111 }
    L_0x010d:
        r1 = move-exception;
        if (r10 == 0) goto L_0x011c;
    L_0x0110:
        goto L_0x0113;
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x010d }
    L_0x0113:
        if (r0 == 0) goto L_0x0119;	 Catch:{ all -> 0x010d }
    L_0x0115:
        r10.close();	 Catch:{ Throwable -> 0x011c }
        goto L_0x011c;	 Catch:{ Throwable -> 0x011c }
    L_0x0119:
        r10.close();
    L_0x011c:
        throw r1;
    L_0x011d:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "refusing to deal with impossibly huge dex file ";
        r1.append(r0);
        r1.append(r14);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptRunner.run(java.io.InputStream, int, java.lang.String, java.io.RandomAccessFile, java.lang.String, java.lang.String[]):void");
    }

    public Process startSubprocess(ProcessBuilder processBuilder) {
        return processBuilder.create();
    }

    public void waitForDexOpt(Process process, int i) {
        process.waitForUninterruptibly();
    }
}
