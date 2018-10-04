package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest.Dex;
import com.facebook.xzdecoder.XzInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class InputDex implements Closeable {
    private static final byte STATE_RAW = (byte) 0;
    private static final byte STATE_USED = (byte) 2;
    private static final byte STATE_ZIPPED = (byte) 1;
    private static final String XZS_ASSET_SUFFIX = ".xzs.tmp~";
    public final Dex dex;
    private InputStream mContents;
    private byte mState;
    private int sizeHint;

    public InputDex(Dex dex, InputStream inputStream) {
        this.dex = dex;
        String str = dex.assetName;
        Closeable xzInputStream;
        try {
            if (str.endsWith(XZS_ASSET_SUFFIX)) {
                str = str.substring(0, str.length() - XZS_ASSET_SUFFIX.length());
            }
            if (str.endsWith(".xz")) {
                str = str.substring(0, str.length() - 3);
                xzInputStream = new XzInputStream(inputStream);
            }
            if (str.endsWith(".jar")) {
                str = str.substring(0, str.length() - 4);
                this.mState = (byte) 1;
            }
            if (str.endsWith(".dex")) {
                this.mContents = xzInputStream;
                Fs.safeClose(null);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("malformed dex asset name: ");
            stringBuilder.append(dex.assetName);
            throw new RuntimeException(stringBuilder.toString());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            Fs.safeClose(xzInputStream);
        }
    }

    public void close() {
        Fs.safeClose(this.mContents);
    }

    public void extract(java.io.File r10) {
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
        r9 = this;
        r8 = r9.mState;
        r0 = 2;
        r9.mState = r0;
        r7 = 1;
        if (r8 == 0) goto L_0x0013;
    L_0x0008:
        if (r8 != r7) goto L_0x000b;
    L_0x000a:
        goto L_0x0013;
    L_0x000b:
        r1 = new java.lang.RuntimeException;
        r0 = "InputDex already used";
        r1.<init>(r0);
        throw r1;
    L_0x0013:
        r6 = r10.getName();
        r3 = new java.io.FileOutputStream;
        r3.<init>(r10);
        r5 = 0;
        r0 = ".dex.jar";	 Catch:{ Throwable -> 0x0080 }
        r0 = r6.endsWith(r0);	 Catch:{ Throwable -> 0x0080 }
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ Throwable -> 0x0080 }
        r2 = 0;	 Catch:{ Throwable -> 0x0080 }
        if (r0 == 0) goto L_0x0047;	 Catch:{ Throwable -> 0x0080 }
    L_0x0029:
        if (r8 != r7) goto L_0x003a;	 Catch:{ Throwable -> 0x0080 }
    L_0x002b:
        r1 = "copying existing zip file %s";	 Catch:{ Throwable -> 0x0080 }
        r0 = new java.lang.Object[r7];	 Catch:{ Throwable -> 0x0080 }
        r0[r2] = r9;	 Catch:{ Throwable -> 0x0080 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x0080 }
        r0 = r9.mContents;	 Catch:{ Throwable -> 0x0080 }
        com.facebook.common.dextricks.Fs.copyBytes(r3, r0, r4);	 Catch:{ Throwable -> 0x0080 }
        goto L_0x0061;	 Catch:{ Throwable -> 0x0080 }
    L_0x003a:
        r1 = "synthesizing new zip file %s";	 Catch:{ Throwable -> 0x0080 }
        r0 = new java.lang.Object[r7];	 Catch:{ Throwable -> 0x0080 }
        r0[r2] = r9;	 Catch:{ Throwable -> 0x0080 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x0080 }
        r9.synthesizeDexJarFile(r3);	 Catch:{ Throwable -> 0x0080 }
        goto L_0x0061;	 Catch:{ Throwable -> 0x0080 }
    L_0x0047:
        r0 = ".dex";	 Catch:{ Throwable -> 0x0080 }
        r0 = r6.endsWith(r0);	 Catch:{ Throwable -> 0x0080 }
        if (r0 == 0) goto L_0x0065;	 Catch:{ Throwable -> 0x0080 }
    L_0x004f:
        r1 = "writing raw dex file %s";	 Catch:{ Throwable -> 0x0080 }
        r0 = new java.lang.Object[r7];	 Catch:{ Throwable -> 0x0080 }
        r0[r2] = r9;	 Catch:{ Throwable -> 0x0080 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x0080 }
        r9.mState = r8;	 Catch:{ Throwable -> 0x0080 }
        r0 = r9.getDexContents();	 Catch:{ Throwable -> 0x0080 }
        com.facebook.common.dextricks.Fs.copyBytes(r3, r0, r4);	 Catch:{ Throwable -> 0x0080 }
    L_0x0061:
        r3.close();
        return;
    L_0x0065:
        r2 = new java.lang.RuntimeException;	 Catch:{ Throwable -> 0x0080 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0080 }
        r1.<init>();	 Catch:{ Throwable -> 0x0080 }
        r0 = "don't know how to make this kind of file: ";	 Catch:{ Throwable -> 0x0080 }
        r1.append(r0);	 Catch:{ Throwable -> 0x0080 }
        r1.append(r6);	 Catch:{ Throwable -> 0x0080 }
        r0 = r1.toString();	 Catch:{ Throwable -> 0x0080 }
        r2.<init>(r0);	 Catch:{ Throwable -> 0x0080 }
        throw r2;	 Catch:{ Throwable -> 0x0080 }
    L_0x007c:
        r0 = move-exception;
        if (r5 == 0) goto L_0x0086;
    L_0x007f:
        goto L_0x0082;
    L_0x0080:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x007c }
    L_0x0082:
        r3.close();	 Catch:{ Throwable -> 0x0089 }
        goto L_0x0089;	 Catch:{ Throwable -> 0x0089 }
    L_0x0086:
        r3.close();
    L_0x0089:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.InputDex.extract(java.io.File):void");
    }

    public InputStream getDexContents() {
        byte b = this.mState;
        this.mState = (byte) 2;
        if (b == (byte) 1) {
            ZipEntry nextEntry;
            InputStream zipInputStream = new ZipInputStream(this.mContents);
            this.mContents = zipInputStream;
            do {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
            } while (!nextEntry.getName().equals("classes.dex"));
            if (nextEntry != null) {
                long size = nextEntry.getSize();
                this.sizeHint = size > 2147483647L ? Integer.MAX_VALUE : (int) size;
                return this.mContents;
            }
            throw new IOException(String.format("zip file %s did not contain a classes.dex", new Object[]{this.dex}));
        } else if (b == (byte) 0) {
            return this.mContents;
        } else {
            throw new RuntimeException("InputDex already used");
        }
    }

    public int getSizeHint(InputStream inputStream) {
        int i = this.sizeHint;
        if (i > 0) {
            return i;
        }
        inputStream = inputStream.available();
        return inputStream > 1 ? inputStream : -1;
    }

    private void synthesizeDexJarFile(java.io.OutputStream r14) {
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
        r13 = this;
        r7 = r13.mContents;
        r5 = new java.util.zip.ZipOutputStream;
        r5.<init>(r14);
        r12 = 0;
        r8 = new java.util.zip.ZipEntry;	 Catch:{ Throwable -> 0x009a }
        r0 = "classes.dex";	 Catch:{ Throwable -> 0x009a }
        r8.<init>(r0);	 Catch:{ Throwable -> 0x009a }
        r0 = r7 instanceof java.io.FileInputStream;	 Catch:{ Throwable -> 0x009a }
        if (r0 == 0) goto L_0x0086;	 Catch:{ Throwable -> 0x009a }
    L_0x0013:
        r9 = r7;	 Catch:{ Throwable -> 0x009a }
        r9 = (java.io.FileInputStream) r9;	 Catch:{ Throwable -> 0x009a }
        r6 = r9.getChannel();	 Catch:{ Throwable -> 0x009a }
        r0 = r6.position();	 Catch:{ Throwable -> 0x009a }
        r2 = 0;	 Catch:{ Throwable -> 0x009a }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ Throwable -> 0x009a }
        if (r0 != 0) goto L_0x0086;	 Catch:{ Throwable -> 0x009a }
    L_0x0024:
        r4 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x009a }
        r0 = r9.getFD();	 Catch:{ Throwable -> 0x009a }
        r4.<init>(r0);	 Catch:{ Throwable -> 0x009a }
        r1 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x0081 }
        r1.<init>(r4);	 Catch:{ all -> 0x0081 }
        r4 = new java.util.zip.CheckedInputStream;	 Catch:{ all -> 0x007e }
        r0 = new java.util.zip.CRC32;	 Catch:{ all -> 0x007e }
        r0.<init>();	 Catch:{ all -> 0x007e }
        r4.<init>(r1, r0);	 Catch:{ all -> 0x007e }
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ all -> 0x007e }
        r0 = r4.skip(r0);	 Catch:{ all -> 0x0081 }
        r8.setSize(r0);	 Catch:{ all -> 0x0081 }
        r0 = r4.getChecksum();	 Catch:{ all -> 0x0081 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0081 }
        r8.setCrc(r0);	 Catch:{ all -> 0x0081 }
        r1 = 0;	 Catch:{ all -> 0x0081 }
        r8.setMethod(r1);	 Catch:{ all -> 0x0081 }
        r11 = "computed zip data for %s from file size:%s crc:%s";	 Catch:{ all -> 0x0081 }
        r0 = 3;	 Catch:{ all -> 0x0081 }
        r10 = new java.lang.Object[r0];	 Catch:{ all -> 0x0081 }
        r10[r1] = r13;	 Catch:{ all -> 0x0081 }
        r9 = 1;	 Catch:{ all -> 0x0081 }
        r0 = r8.getSize();	 Catch:{ all -> 0x0081 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x0081 }
        r10[r9] = r0;	 Catch:{ all -> 0x0081 }
        r9 = 2;	 Catch:{ all -> 0x0081 }
        r0 = r8.getCrc();	 Catch:{ all -> 0x0081 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x0081 }
        r10[r9] = r0;	 Catch:{ all -> 0x0081 }
        com.facebook.common.dextricks.Mlog.m56v(r11, r10);	 Catch:{ all -> 0x0081 }
        com.facebook.common.dextricks.Fs.safeClose(r4);	 Catch:{ Throwable -> 0x009a }
        r6.position(r2);	 Catch:{ Throwable -> 0x009a }
        goto L_0x0086;	 Catch:{ Throwable -> 0x009a }
    L_0x007e:
        r0 = move-exception;
        r4 = r1;
        goto L_0x0082;
    L_0x0081:
        r0 = move-exception;
    L_0x0082:
        com.facebook.common.dextricks.Fs.safeClose(r4);	 Catch:{ Throwable -> 0x009a }
        throw r0;	 Catch:{ Throwable -> 0x009a }
    L_0x0086:
        r5.putNextEntry(r8);	 Catch:{ Throwable -> 0x009a }
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ Throwable -> 0x009a }
        com.facebook.common.dextricks.Fs.copyBytes(r5, r7, r0);	 Catch:{ Throwable -> 0x009a }
        r5.finish();	 Catch:{ Throwable -> 0x009a }
        r5.close();
        return;
    L_0x0096:
        r0 = move-exception;
        if (r12 == 0) goto L_0x00a0;
    L_0x0099:
        goto L_0x009c;
    L_0x009a:
        r12 = move-exception;
        throw r12;	 Catch:{ all -> 0x0096 }
    L_0x009c:
        r5.close();	 Catch:{ Throwable -> 0x00a3 }
        goto L_0x00a3;	 Catch:{ Throwable -> 0x00a3 }
    L_0x00a0:
        r5.close();
    L_0x00a3:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.InputDex.synthesizeDexJarFile(java.io.OutputStream):void");
    }

    public String toString() {
        return String.format("InputDex:[%s]", new Object[]{this.dex.assetName});
    }
}
