package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest.Dex;
import com.facebook.common.dextricks.DexStore.Config;
import com.facebook.common.dextricks.DexStore.TmpDir;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.OdexScheme.Compiler;
import com.facebook.forker.ProcessBuilder;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class OdexSchemeTurbo extends OdexScheme {

    public final class TurboCompiler extends Compiler {
        private final TurboDexOptRunner mDexOptRunner;
        private final DexStore mDexStore;
        private final File mDummyZip;
        private final int mFlags;
        private final TmpDir mTmpDir;

        public TurboCompiler(DexStore dexStore, int i) {
            this.mDexOptRunner = new TurboDexOptRunner(dexStore.root);
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("turbo-compiler");
            try {
                this.mDummyZip = new File(this.mTmpDir.directory, "dummy.zip");
                OdexSchemeTurbo.makeDummyZip(this.mDummyZip);
            } catch (Throwable th) {
                Fs.safeClose(this.mTmpDir);
            }
        }

        public void close() {
            this.mDexOptRunner.cleanup();
            this.mTmpDir.close();
        }

        public void compile(com.facebook.common.dextricks.InputDex r14) {
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
            r13 = this;
            r0 = r14.dex;
            r9 = com.facebook.common.dextricks.OdexSchemeTurbo.makeDexName(r0);
            r3 = com.facebook.common.dextricks.OdexSchemeTurbo.makeOdexName(r9);
            r2 = new java.io.File;
            r0 = r13.mDexStore;
            r0 = r0.root;
            r2.<init>(r0, r9);
            r1 = new java.io.File;
            r0 = r13.mDexStore;
            r0 = r0.root;
            r1.<init>(r0, r3);
            r0 = r13.mFlags;
            r6 = 1;
            r0 = r0 & r6;
            if (r0 == 0) goto L_0x002f;
        L_0x0022:
            r0 = r2.exists();
            if (r0 == 0) goto L_0x002f;
        L_0x0028:
            r0 = r1.exists();
            if (r0 == 0) goto L_0x002f;
        L_0x002e:
            return;
        L_0x002f:
            r2 = new java.io.File;
            r0 = r13.mTmpDir;
            r0 = r0.directory;
            r2.<init>(r0, r3);
            r7 = r14.getDexContents();
            r0 = 0;
            r8 = r14.getSizeHint(r7);	 Catch:{ Throwable -> 0x009f }
            r5 = "size hint for %s: %s";	 Catch:{ Throwable -> 0x009f }
            r1 = 2;	 Catch:{ Throwable -> 0x009f }
            r4 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x009f }
            r1 = 0;	 Catch:{ Throwable -> 0x009f }
            r4[r1] = r14;	 Catch:{ Throwable -> 0x009f }
            r1 = java.lang.Integer.valueOf(r8);	 Catch:{ Throwable -> 0x009f }
            r4[r6] = r1;	 Catch:{ Throwable -> 0x009f }
            com.facebook.common.dextricks.Mlog.m56v(r5, r4);	 Catch:{ Throwable -> 0x009f }
            r10 = new java.io.RandomAccessFile;	 Catch:{ Throwable -> 0x009f }
            r1 = "rw";	 Catch:{ Throwable -> 0x009f }
            r10.<init>(r2, r1);	 Catch:{ Throwable -> 0x009f }
            r6 = r13.mDexOptRunner;	 Catch:{ InterruptedException -> 0x0089 }
            r11 = "quick";	 Catch:{ InterruptedException -> 0x0089 }
            r12 = 0;	 Catch:{ InterruptedException -> 0x0089 }
            r6.run(r7, r8, r9, r10, r11, r12);	 Catch:{ InterruptedException -> 0x0089 }
            r10.close();	 Catch:{ Throwable -> 0x009f }
            if (r7 == 0) goto L_0x0069;	 Catch:{ Throwable -> 0x009f }
        L_0x0066:
            r7.close();
        L_0x0069:
            r4 = r13.mDummyZip;
            r1 = new java.io.File;
            r0 = r13.mDexStore;
            r0 = r0.root;
            r1.<init>(r0, r9);
            com.facebook.common.dextricks.Fs.linkAtomic(r4, r1);
            r1 = new java.io.File;
            r0 = r13.mDexStore;
            r0 = r0.root;
            r1.<init>(r0, r3);
            com.facebook.common.dextricks.Fs.renameOrThrow(r2, r1);
            return;
        L_0x0084:
            r1 = move-exception;
            r2 = r0;
            goto L_0x0091;
        L_0x0087:
            r2 = move-exception;
            goto L_0x008f;
        L_0x0089:
            r1 = new java.lang.AssertionError;	 Catch:{ Throwable -> 0x0087, all -> 0x0084 }
            r1.<init>();	 Catch:{ Throwable -> 0x0087, all -> 0x0084 }
            throw r1;	 Catch:{ Throwable -> 0x0087, all -> 0x0084 }
        L_0x008f:
            throw r2;	 Catch:{ all -> 0x0090 }
        L_0x0090:
            r1 = move-exception;
        L_0x0091:
            if (r2 == 0) goto L_0x0097;
        L_0x0093:
            r10.close();	 Catch:{ Throwable -> 0x009a }
            goto L_0x009a;	 Catch:{ Throwable -> 0x009a }
        L_0x0097:
            r10.close();	 Catch:{ Throwable -> 0x009f }
        L_0x009a:
            throw r1;	 Catch:{ Throwable -> 0x009f }
        L_0x009b:
            r1 = move-exception;
            if (r7 == 0) goto L_0x00aa;
        L_0x009e:
            goto L_0x00a1;
        L_0x009f:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x009b }
        L_0x00a1:
            if (r0 == 0) goto L_0x00a7;	 Catch:{ all -> 0x009b }
        L_0x00a3:
            r7.close();	 Catch:{ Throwable -> 0x00aa }
            goto L_0x00aa;	 Catch:{ Throwable -> 0x00aa }
        L_0x00a7:
            r7.close();
        L_0x00aa:
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeTurbo.TurboCompiler.compile(com.facebook.common.dextricks.InputDex):void");
        }
    }

    public final class TurboDexOptRunner extends DexOptRunner {
        private final byte[] mBuffer;
        private final Config mDsConfig;

        public TurboDexOptRunner(Config config, File file) {
            super(file);
            this.mBuffer = new byte[65536];
            this.mDsConfig = config;
        }

        public TurboDexOptRunner(File file) {
            super(file);
            this.mBuffer = new byte[65536];
            this.mDsConfig = null;
        }

        public void addDexOptOptions(ProcessBuilder processBuilder) {
            Config config = this.mDsConfig;
            if (config != null) {
                OdexSchemeTurbo.addConfiguredDexOptOptions(config, processBuilder);
            }
        }

        public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
            return Fs.copyBytes(randomAccessFile, inputStream, Integer.MAX_VALUE, this.mBuffer);
        }
    }

    public String getSchemeName() {
        return "OdexSchemeTurbo";
    }

    public OdexSchemeTurbo(int i, Dex[] dexArr) {
        super(i, makeExpectedFileList(dexArr));
    }

    public OdexSchemeTurbo(Dex[] dexArr) {
        this(8, dexArr);
    }

    public static void addConfiguredDexOptOptions(Config config, ProcessBuilder processBuilder) {
        if (config.dalvikVerify != (byte) 0) {
            switch (config.dalvikVerify) {
                case (byte) 1:
                    Mlog.m54i("using DALVIK_VERIFY_NONE as requested in config file", new Object[0]);
                    processBuilder.addArgument("-Vn");
                    break;
                case (byte) 2:
                    Mlog.m54i("using DALVIK_VERIFY_REMOTE as requested in config file", new Object[0]);
                    processBuilder.addArgument("-Vr");
                    break;
                case (byte) 3:
                    Mlog.m54i("using DALVIK_VERIFY_ALL as requested in config file", new Object[0]);
                    processBuilder.addArgument("-Va");
                    break;
                default:
                    Mlog.m58w("ignoring unknown Dalvik verify value %s in config file", Byte.valueOf(config.dalvikVerify));
                    break;
            }
        }
        if (config.dalvikOptimize != (byte) 0) {
            switch (config.dalvikOptimize) {
                case (byte) 1:
                    Mlog.m54i("using DALVIK_OPT_NONE as requested in config file", new Object[0]);
                    processBuilder.addArgument("-On");
                    break;
                case (byte) 2:
                    Mlog.m54i("using DALVIK_OPT_VERIFIED as requested in config file", new Object[0]);
                    processBuilder.addArgument("-Ov");
                    break;
                case (byte) 3:
                    Mlog.m54i("using DALVIK_OPT_ALL as requested in config file", new Object[0]);
                    processBuilder.addArgument("-Oa");
                    break;
                case (byte) 4:
                    Mlog.m54i("using DALVIK_OPT_FULL as requested in config file", new Object[0]);
                    processBuilder.addArgument("-Of");
                    break;
                default:
                    Mlog.m58w("ignoring unknown Dalvik optimize value %s in config file", Byte.valueOf(config.dalvikOptimize));
                    break;
            }
        }
        if (config.dalvikRegisterMaps != (byte) 0) {
            switch (config.dalvikRegisterMaps) {
                case (byte) 1:
                    processBuilder.addArgument("-Rn");
                    return;
                case (byte) 2:
                    processBuilder.addArgument("-Ry");
                    return;
                default:
                    Mlog.m58w("ignoring unknown Dalvik register map value %s in config file", Byte.valueOf(config.dalvikRegisterMaps));
                    return;
            }
        }
    }

    public final void configureClassLoader(File file, Configuration configuration) {
        for (int i = 0; i < this.expectedFiles.length; i += 2) {
            configuration.addDex(new File(file, this.expectedFiles[i]), new File(file, this.expectedFiles[i + 1]));
        }
    }

    public final Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboCompiler(dexStore, i);
    }

    public static String makeDexName(Dex dex) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("prog-");
        stringBuilder.append(dex.hash);
        stringBuilder.append(".dex.jar");
        return stringBuilder.toString();
    }

    public static void makeDummyZip(java.io.File r6) {
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
        r5 = new java.io.FileOutputStream;
        r5.<init>(r6);
        r4 = 0;
        r3 = new java.util.zip.ZipOutputStream;	 Catch:{ Throwable -> 0x0058 }
        r3.<init>(r5);	 Catch:{ Throwable -> 0x0058 }
        r1 = new java.util.zip.ZipEntry;	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r0 = "META-INF/MANIFEST.MF";	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r1.<init>(r0);	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r3.putNextEntry(r1);	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r2 = new java.io.PrintStream;	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r0 = "Manifest-Version: 1.0";	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r2.println(r0);	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r0 = "Created-By: OdexSchemeTurbo";	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r2.println(r0);	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r2.flush();	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r2.close();	 Catch:{ Throwable -> 0x0037, all -> 0x0034 }
        r2.close();	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
        r3.close();	 Catch:{ Throwable -> 0x0058 }
        r5.close();
        return;
    L_0x0034:
        r0 = move-exception;
        r1 = r4;
        goto L_0x003a;
    L_0x0037:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
    L_0x003a:
        if (r1 == 0) goto L_0x0040;
    L_0x003c:
        r2.close();	 Catch:{ Throwable -> 0x0043, all -> 0x0044 }
        goto L_0x0043;	 Catch:{ Throwable -> 0x0043, all -> 0x0044 }
    L_0x0040:
        r2.close();	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
    L_0x0043:
        throw r0;	 Catch:{ Throwable -> 0x0047, all -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        r1 = r4;
        goto L_0x004a;
    L_0x0047:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
    L_0x004a:
        if (r1 == 0) goto L_0x0050;
    L_0x004c:
        r3.close();	 Catch:{ Throwable -> 0x0053 }
        goto L_0x0053;	 Catch:{ Throwable -> 0x0053 }
    L_0x0050:
        r3.close();	 Catch:{ Throwable -> 0x0058 }
    L_0x0053:
        throw r0;	 Catch:{ Throwable -> 0x0058 }
    L_0x0054:
        r0 = move-exception;
        if (r4 == 0) goto L_0x005e;
    L_0x0057:
        goto L_0x005a;
    L_0x0058:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0054 }
    L_0x005a:
        r5.close();	 Catch:{ Throwable -> 0x0061 }
        goto L_0x0061;	 Catch:{ Throwable -> 0x0061 }
    L_0x005e:
        r5.close();
    L_0x0061:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeTurbo.makeDummyZip(java.io.File):void");
    }

    private static String[] makeExpectedFileList(Dex[] dexArr) {
        String[] strArr = new String[(dexArr.length * 2)];
        for (int i = 0; i < dexArr.length; i++) {
            String makeDexName = makeDexName(dexArr[i]);
            int i2 = i * 2;
            strArr[i2] = makeDexName;
            strArr[i2 + 1] = makeOdexName(makeDexName);
        }
        return strArr;
    }

    public static String makeOdexName(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Fs.stripLastExtension(str));
        stringBuilder.append(".odex");
        return stringBuilder.toString();
    }
}
