package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest.Dex;
import com.facebook.xzdecoder.XzInputStream;
import java.io.InputStream;

public final class SolidXzInputDexIterator extends InputDexIterator {
    private boolean mConsumingStream;
    private SliceInputStream mLastPartIs;
    private final ResProvider mResProvider;
    public final XzInputStream mXzs;

    public final class SliceInputStream extends InputStream {
        private int mBytesRead = 0;
        private int mBytesToRead;

        public SliceInputStream(int i) {
            this.mBytesToRead = i;
            SolidXzInputDexIterator.this.mConsumingStream = true;
        }

        public int available() {
            return this.mBytesToRead - this.mBytesRead;
        }

        public void close() {
            SolidXzInputDexIterator.this.mConsumingStream = false;
        }

        public int read() {
            if (this.mBytesRead == this.mBytesToRead) {
                return -1;
            }
            int read = SolidXzInputDexIterator.this.mXzs.read();
            if (read != -1) {
                this.mBytesRead++;
                return read;
            }
            throw new RuntimeException("truncated xzs stream");
        }

        public int read(byte[] bArr, int i, int i2) {
            if (i2 > 0 && this.mBytesRead == this.mBytesToRead) {
                return -1;
            }
            int read = SolidXzInputDexIterator.this.mXzs.read(bArr, i, Math.min(i2, this.mBytesToRead - this.mBytesRead));
            if (read > 0) {
                this.mBytesRead += read;
            }
            return read;
        }
    }

    public SolidXzInputDexIterator(DexManifest dexManifest, ResProvider resProvider, InputStream inputStream) {
        super(dexManifest);
        this.mResProvider = resProvider;
        this.mXzs = new XzInputStream(inputStream);
    }

    public void close() {
        Fs.safeClose(this.mXzs);
    }

    private int getJarFileSizeFromMeta(com.facebook.common.dextricks.ResProvider r5, java.lang.String r6) {
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
        r4 = this;
        r3 = r5.open(r6);
        r6 = 0;
        r4 = new java.io.InputStreamReader;	 Catch:{ Throwable -> 0x005e }
        r4.<init>(r3);	 Catch:{ Throwable -> 0x005e }
        r5 = new java.io.BufferedReader;	 Catch:{ Throwable -> 0x004d, all -> 0x004a }
        r5.<init>(r4);	 Catch:{ Throwable -> 0x004d, all -> 0x004a }
        r2 = r5.readLine();	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r1 = 0;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r0 = 32;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r0 = r2.indexOf(r0);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r1 = r2.substring(r1, r0);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r0 = 58;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r0 = r1.indexOf(r0);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r0 = r0 + 1;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r0 = r1.substring(r0);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r5.close();	 Catch:{ Throwable -> 0x004d, all -> 0x004a }
        r4.close();	 Catch:{ Throwable -> 0x005e }
        if (r3 == 0) goto L_0x0039;	 Catch:{ Throwable -> 0x005e }
    L_0x0036:
        r3.close();
    L_0x0039:
        return r0;
    L_0x003a:
        r0 = move-exception;
        r1 = r6;
        goto L_0x0040;
    L_0x003d:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r0 = move-exception;
    L_0x0040:
        if (r1 == 0) goto L_0x0046;
    L_0x0042:
        r5.close();	 Catch:{ Throwable -> 0x0049, all -> 0x004a }
        goto L_0x0049;	 Catch:{ Throwable -> 0x0049, all -> 0x004a }
    L_0x0046:
        r5.close();	 Catch:{ Throwable -> 0x004d, all -> 0x004a }
    L_0x0049:
        throw r0;	 Catch:{ Throwable -> 0x004d, all -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        r1 = r6;
        goto L_0x0050;
    L_0x004d:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x004f }
    L_0x004f:
        r0 = move-exception;
    L_0x0050:
        if (r1 == 0) goto L_0x0056;
    L_0x0052:
        r4.close();	 Catch:{ Throwable -> 0x0059 }
        goto L_0x0059;	 Catch:{ Throwable -> 0x0059 }
    L_0x0056:
        r4.close();	 Catch:{ Throwable -> 0x005e }
    L_0x0059:
        throw r0;	 Catch:{ Throwable -> 0x005e }
    L_0x005a:
        r0 = move-exception;
        if (r3 == 0) goto L_0x0069;
    L_0x005d:
        goto L_0x0060;
    L_0x005e:
        r6 = move-exception;
        throw r6;	 Catch:{ all -> 0x005a }
    L_0x0060:
        if (r6 == 0) goto L_0x0066;	 Catch:{ all -> 0x005a }
    L_0x0062:
        r3.close();	 Catch:{ Throwable -> 0x0069 }
        goto L_0x0069;	 Catch:{ Throwable -> 0x0069 }
    L_0x0066:
        r3.close();
    L_0x0069:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.SolidXzInputDexIterator.getJarFileSizeFromMeta(com.facebook.common.dextricks.ResProvider, java.lang.String):int");
    }

    public InputDex nextImpl(Dex dex) {
        if (this.mConsumingStream) {
            throw new RuntimeException("previous InputDex not closed");
        }
        SliceInputStream sliceInputStream = this.mLastPartIs;
        if (sliceInputStream != null) {
            int available = sliceInputStream.available();
            if (available > 0) {
                Fs.discardFromInputStream(this.mLastPartIs, (long) available);
            }
            this.mLastPartIs = null;
        }
        ResProvider resProvider = this.mResProvider;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(dex.assetName);
        stringBuilder.append(".meta");
        this.mLastPartIs = new SliceInputStream(getJarFileSizeFromMeta(resProvider, stringBuilder.toString()));
        return new InputDex(dex, this.mLastPartIs);
    }
}
