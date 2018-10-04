package com.facebook.common.dextricks;

import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.common.dextricks.DexManifest.Dex;
import com.facebook.common.dextricks.DexStore.TmpDir;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.OdexScheme.Compiler;
import java.io.File;

public class OdexSchemeArtTurbo extends OdexScheme {
    public static final String OREO_ODEX_DIR = "oat";
    public static boolean sAttemptedArtHackInstallation;

    public final class TurboArtCompiler extends Compiler {
        private final DexStore mDexStore;
        private final int mFlags;
        private final TmpDir mTmpDir;

        public TurboArtCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("turbo-art-compiler");
        }

        public void close() {
            this.mTmpDir.close();
        }

        public void compile(com.facebook.common.dextricks.InputDex r10) {
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
            r9 = this;
            r0 = r10.dex;
            r6 = com.facebook.common.dextricks.OdexSchemeArtTurbo.makeDexName(r0);
            r1 = new java.io.File;
            r0 = r9.mDexStore;
            r0 = r0.root;
            r1.<init>(r0, r6);
            r0 = r9.mFlags;
            r8 = 1;
            r0 = r0 & r8;
            if (r0 == 0) goto L_0x001c;
        L_0x0015:
            r0 = r1.exists();
            if (r0 == 0) goto L_0x001c;
        L_0x001b:
            return;
        L_0x001c:
            r5 = new java.io.File;
            r0 = r9.mTmpDir;
            r0 = r0.directory;
            r5.<init>(r0, r6);
            r4 = r10.getDexContents();
            r0 = 0;
            r7 = r10.getSizeHint(r4);	 Catch:{ Throwable -> 0x007a }
            r3 = "size hint for %s: %s";	 Catch:{ Throwable -> 0x007a }
            r1 = 2;	 Catch:{ Throwable -> 0x007a }
            r2 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x007a }
            r1 = 0;	 Catch:{ Throwable -> 0x007a }
            r2[r1] = r10;	 Catch:{ Throwable -> 0x007a }
            r1 = java.lang.Integer.valueOf(r7);	 Catch:{ Throwable -> 0x007a }
            r2[r8] = r1;	 Catch:{ Throwable -> 0x007a }
            com.facebook.common.dextricks.Mlog.m56v(r3, r2);	 Catch:{ Throwable -> 0x007a }
            r3 = new java.io.RandomAccessFile;	 Catch:{ Throwable -> 0x007a }
            r1 = "rw";	 Catch:{ Throwable -> 0x007a }
            r3.<init>(r5, r1);	 Catch:{ Throwable -> 0x007a }
            r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ Throwable -> 0x007a }
            r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;	 Catch:{ Throwable -> 0x007a }
            r1 = new byte[r1];	 Catch:{ Throwable -> 0x0069, all -> 0x0066 }
            com.facebook.common.dextricks.Fs.copyBytes(r3, r4, r2, r1);	 Catch:{ Throwable -> 0x0069, all -> 0x0066 }
            r3.close();	 Catch:{ Throwable -> 0x007a }
            if (r4 == 0) goto L_0x0059;	 Catch:{ Throwable -> 0x007a }
        L_0x0056:
            r4.close();
        L_0x0059:
            r1 = new java.io.File;
            r0 = r9.mDexStore;
            r0 = r0.root;
            r1.<init>(r0, r6);
            com.facebook.common.dextricks.Fs.renameOrThrow(r5, r1);
            return;
        L_0x0066:
            r1 = move-exception;
            r2 = r0;
            goto L_0x006c;
        L_0x0069:
            r2 = move-exception;
            throw r2;	 Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception;
        L_0x006c:
            if (r2 == 0) goto L_0x0072;
        L_0x006e:
            r3.close();	 Catch:{ Throwable -> 0x0075 }
            goto L_0x0075;	 Catch:{ Throwable -> 0x0075 }
        L_0x0072:
            r3.close();	 Catch:{ Throwable -> 0x007a }
        L_0x0075:
            throw r1;	 Catch:{ Throwable -> 0x007a }
        L_0x0076:
            r1 = move-exception;
            if (r4 == 0) goto L_0x0085;
        L_0x0079:
            goto L_0x007c;
        L_0x007a:
            r0 = move-exception;
            throw r0;	 Catch:{ all -> 0x0076 }
        L_0x007c:
            if (r0 == 0) goto L_0x0082;	 Catch:{ all -> 0x0076 }
        L_0x007e:
            r4.close();	 Catch:{ Throwable -> 0x0085 }
            goto L_0x0085;	 Catch:{ Throwable -> 0x0085 }
        L_0x0082:
            r4.close();
        L_0x0085:
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtTurbo.TurboArtCompiler.compile(com.facebook.common.dextricks.InputDex):void");
        }
    }

    public String getSchemeName() {
        return "OdexSchemeArtTurbo";
    }

    public OdexSchemeArtTurbo(int i, String[] strArr) {
        super(i, strArr);
    }

    public OdexSchemeArtTurbo(Dex[] dexArr) {
        this(8, makeExpectedFileList(dexArr, VERSION.SDK_INT >= 26 ? OREO_ODEX_DIR : null));
    }

    public void configureClassLoader(File file, Configuration configuration) {
        if (!sAttemptedArtHackInstallation) {
            sAttemptedArtHackInstallation = true;
            try {
                DalvikInternals.installArtHacks(6, VERSION.SDK_INT);
            } catch (Throwable e) {
                Mlog.m59w(e, "failed to install verifier-disabling ART hacks; continuing slowly", new Object[0]);
            }
        }
        int enabledThreadArtHacks = DalvikInternals.getEnabledThreadArtHacks();
        DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks | 6);
        try {
            Mlog.m56v("enabled ART verifier hack (warning-level logs following are expected)", new Object[0]);
            for (int i = 0; i < this.expectedFiles.length; i++) {
                if (!this.expectedFiles[i].equals(OREO_ODEX_DIR)) {
                    configuration.addDex(new File(file, this.expectedFiles[i]));
                }
            }
            DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
            Mlog.m56v("restored old ART hack mask", new Object[0]);
        } catch (Throwable th) {
            DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
            Mlog.m56v("restored old ART hack mask", new Object[0]);
        }
    }

    public static String getArch() {
        StringBuilder stringBuilder;
        int i = 0;
        String str = VERSION.SDK_INT >= 21 ? Build.SUPPORTED_32_BIT_ABIS[0] : Build.CPU_ABI;
        int hashCode = str.hashCode();
        if (hashCode != 117110) {
            if (hashCode == 145444210) {
                if (str.equals("armeabi-v7a")) {
                    switch (i) {
                        case 0:
                            return "arm";
                        case 1:
                            return "x86";
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown ABI ");
                            stringBuilder.append(str);
                            throw new RuntimeException(stringBuilder.toString());
                    }
                }
            }
        } else if (str.equals("x86")) {
            i = 1;
            switch (i) {
                case 0:
                    return "arm";
                case 1:
                    return "x86";
                default:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown ABI ");
                    stringBuilder.append(str);
                    throw new RuntimeException(stringBuilder.toString());
            }
        }
        i = -1;
        switch (i) {
            case 0:
                return "arm";
            case 1:
                return "x86";
            default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown ABI ");
                stringBuilder.append(str);
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static String getOreoOdexOutputDirectory(File file, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("oat/");
        stringBuilder.append(getArch());
        File file2 = new File(file, stringBuilder.toString());
        if (z) {
            Fs.mkdirOrThrow(file2);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(file2.getPath());
        stringBuilder.append("/");
        return stringBuilder.toString();
    }

    public final Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboArtCompiler(dexStore, i);
    }

    public static String makeDexName(Dex dex) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("prog-");
        stringBuilder.append(dex.hash);
        stringBuilder.append(".dex");
        return stringBuilder.toString();
    }

    public static String[] makeExpectedFileList(Dex[] dexArr, String str) {
        String[] strArr;
        if (str != null) {
            strArr = new String[(dexArr.length + 1)];
            strArr[dexArr.length] = str;
        } else {
            strArr = new String[dexArr.length];
        }
        for (int i = 0; i < dexArr.length; i++) {
            strArr[i] = makeDexName(dexArr[i]);
        }
        return strArr;
    }

    public static String makeOdexName(Dex dex) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("prog-");
        stringBuilder.append(dex.hash);
        stringBuilder.append(".odex");
        return stringBuilder.toString();
    }
}
