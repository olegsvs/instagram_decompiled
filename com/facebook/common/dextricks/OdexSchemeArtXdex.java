package com.facebook.common.dextricks;

import X.AnonymousClass0CF;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemProperties;
import com.facebook.common.dextricks.DexManifest.Dex;
import com.facebook.common.dextricks.DexStore.Config;
import com.facebook.common.dextricks.DexStore.OptimizationSession;
import com.facebook.common.dextricks.DexStore.OptimizationSession.Job;
import com.facebook.common.dextricks.DexStore.RecoverableDexException;
import com.facebook.common.dextricks.DexStore.TmpDir;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.webrtc.audio.WebRtcAudioRecord;

public final class OdexSchemeArtXdex extends OdexSchemeArtTurbo {
    private static final boolean APPLY_MIRANDA_HACK = true;
    private static final String CREATED_BY_OATMEAL = "86827de6f1ef3407f8dc98b76382d3a6e0759ab3";
    private static final String EVERYTHING_OAT_FILENAME = "everything.oat";
    private static final String MIXED_MODE_DATA_RESOURCE_PATH = "mixed_mode.txt";
    private static final int OREO_SDK_INT = 26;
    private static final String PGO_RESOURCE_PATH = "art_pgo_input.txt";
    private static final String QUICK_DATA_RESOURCE_PATH = "oatmeal.bin";
    private static final long STATE_DEX2OAT_QUICKENING_NEEDED = 64;
    private static final long STATE_DEX2OAT_QUICK_ATTEMPTED = 512;
    private static final long STATE_MASK = 240;
    private static final long STATE_MIXED_ATTEMPTED = 1024;
    private static final long STATE_MIXED_NEEDED = 128;
    private static final long STATE_OATMEAL_QUICKENING_NEEDED = 32;
    private static final long STATE_OATMEAL_QUICK_ATTEMPTED = 256;
    private static final long STATE_OPT_COMPLETED = 16;
    private static final String TMP_MIXED_MODE_DATA_FILE = "art_mixed_mode_data_input";
    private static final String TMP_PGO_FILE = "art_pgo_input";
    private static final String TMP_QUICK_DATA_FILE = "art_quick_data_input";
    private final int lowMemoryThreshold = 1048576;
    private final Dex[] mDexes;
    private final boolean mIsLoadable;
    private String mOatmealPath;
    private final ResProvider mResProvider;
    private final ArrayList oatFiles;
    private final int oatmealWaitTimeoutMs = 5000;

    public class Renamer {
        private ArrayList mDestFiles = new ArrayList();
        private ArrayList mSourceFiles = new ArrayList();
        private final TmpDir mTmpDir;

        public Renamer(TmpDir tmpDir) {
            this.mTmpDir = tmpDir;
        }

        public void addFile(File file, File file2) {
            this.mSourceFiles.add(file);
            this.mDestFiles.add(file2);
        }

        public void renameOrThrow() {
            for (int i = 0; i < this.mSourceFiles.size(); i++) {
                Fs.renameOrThrow((File) this.mSourceFiles.get(i), (File) this.mDestFiles.get(i));
            }
        }
    }

    public static boolean anyOptimizationDone(long j) {
        return (j & STATE_MASK) != 0;
    }

    public static boolean optimizationCompleted(long j) {
        return (j & 16) != 0;
    }

    public static boolean quickeningNeeded(long j) {
        j &= STATE_MASK;
        if (j != STATE_OATMEAL_QUICKENING_NEEDED) {
            if (j != STATE_DEX2OAT_QUICKENING_NEEDED) {
                return false;
            }
        }
        return true;
    }

    public String getSchemeName() {
        return "OdexSchemeArtXdex";
    }

    public OdexSchemeArtXdex(Dex[] dexArr, ResProvider resProvider, long j) {
        super(getOdexFlags(), makeExpectedFileList(dexArr, j));
        this.mDexes = dexArr;
        this.mResProvider = resProvider;
        this.mIsLoadable = (STATE_MASK & j) != 0;
        this.mOatmealPath = null;
        this.oatFiles = new ArrayList();
    }

    private boolean checkForPgoFile(java.lang.String r4) {
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
        r2 = 0;
        r0 = r3.mResProvider;	 Catch:{ IOException -> 0x0012 }
        r1 = r0.open(r4);	 Catch:{ IOException -> 0x0012 }
        if (r1 == 0) goto L_0x000b;	 Catch:{ IOException -> 0x0012 }
    L_0x0009:
        r0 = 1;	 Catch:{ IOException -> 0x0012 }
        goto L_0x000c;	 Catch:{ IOException -> 0x0012 }
    L_0x000b:
        r0 = 0;	 Catch:{ IOException -> 0x0012 }
    L_0x000c:
        if (r1 == 0) goto L_0x0011;	 Catch:{ IOException -> 0x0012 }
    L_0x000e:
        r1.close();	 Catch:{ IOException -> 0x0012 }
    L_0x0011:
        return r0;	 Catch:{ IOException -> 0x0012 }
    L_0x0012:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.checkForPgoFile(java.lang.String):boolean");
    }

    private void checkTmpOatFileLength(File file) {
        if (!file.exists()) {
            return;
        }
        if (file.length() == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(file);
            stringBuilder.append(" is an impossibly short oat file");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void configureClassLoader(File file, Configuration configuration) {
        Throwable e;
        File file2 = file;
        Configuration configuration2 = configuration;
        if (this.mIsLoadable) {
            String oreoOdexOutputDirectory;
            StringBuilder stringBuilder;
            Mlog.m56v("We pass through this code when loading secondary dexes", new Object[0]);
            if (VERSION.SDK_INT >= OREO_SDK_INT) {
                Mlog.assertThat(Arrays.asList(r10.expectedFiles).contains(OdexSchemeArtTurbo.OREO_ODEX_DIR), "expect oat dir", new Object[0]);
            }
            Mlog.m56v("loading pre-built omni-oat", new Object[0]);
            if (DalvikConstants.FB_REDEX_VERIFY_NONE_ENABLED) {
                Mlog.m54i("redex ran in verify-none mode, and may have produced non-verifying bytecode.", new Object[0]);
            }
            DexStore findOpened = DexStore.findOpened(file2);
            file = findOpened.reportStatus();
            int truncatedSize = getTruncatedSize(findOpened);
            if (VERSION.SDK_INT >= OREO_SDK_INT) {
                oreoOdexOutputDirectory = OdexSchemeArtTurbo.getOreoOdexOutputDirectory(file2, false);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(file2.getCanonicalPath());
                stringBuilder.append("/");
                oreoOdexOutputDirectory = stringBuilder.toString();
            }
            int i = 1;
            for (int i2 = 0; i2 < r10.expectedFiles.length; i2++) {
                if (r10.expectedFiles[i2].endsWith(".dex")) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(oreoOdexOutputDirectory);
                    stringBuilder.append(oatNameFromDexName(r10.expectedFiles[i2]));
                    File file3 = new File(stringBuilder.toString());
                    long lastModified = file3.lastModified();
                    long length = file3.length();
                    File file4 = new File(file2, r10.expectedFiles[i2]);
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(r10.expectedFiles[i2]);
                    stringBuilder.append(".backup");
                    File file5 = new File(file2, stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("odexSchemeArtXDex.configureClassLoader() status=");
                    stringBuilder2.append(Long.toHexString(findOpened.reportStatus()));
                    String stringBuilder3 = stringBuilder2.toString();
                    if (!file4.exists()) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(stringBuilder3);
                        stringBuilder.append(" expected dex file ");
                        stringBuilder.append(file4);
                        stringBuilder.append(" not found");
                        stringBuilder3 = stringBuilder.toString();
                    } else if (file4.length() == 0 && file3.exists()) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(stringBuilder3);
                        stringBuilder.append(" attempting to load 0 length dex file ");
                        stringBuilder.append(file4);
                        stringBuilder.append(" when we seemed to have already compiled to ");
                        stringBuilder.append(file3);
                        stringBuilder3 = stringBuilder.toString();
                    }
                    Mlog.m56v(stringBuilder3, new Object[0]);
                    if (needsTruncation(file4, truncatedSize) && i != 0 && optimizationCompleted(file)) {
                        truncateWithBackup(file4, file5, truncatedSize);
                        try {
                            String str = "attempting to truncate %s to %d";
                            Object[] objArr = new Object[2];
                            objArr[0] = file4;
                            try {
                                objArr[1] = Integer.valueOf(truncatedSize);
                                Mlog.m56v(str, objArr);
                                configuration2.addDex(file4, file3);
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("added truncated dex ok ");
                                stringBuilder.append(file4);
                                Mlog.m56v(stringBuilder.toString(), new Object[0]);
                                Fs.deleteRecursive(file5);
                            } catch (IOException e2) {
                                e = e2;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            try {
                                Fs.renameOrThrow(file5, file4);
                                Mlog.m53e(e, "failed to load truncated dex", new Object[0]);
                                findOpened.forceRegenerateOnNextLoad();
                                configuration2.addDex(file4, file3);
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("added full dex ok ");
                                stringBuilder.append(file4);
                                Mlog.m56v(stringBuilder.toString(), new Object[0]);
                                i = isOatFileStillValid(file3, length, lastModified) & i;
                            } catch (Throwable e4) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("IOException adding dex ");
                                stringBuilder.append(file4);
                                stringBuilder.append(" will rethrow and attempt recovery");
                                Mlog.m53e(e4, stringBuilder.toString(), new Object[0]);
                                findOpened.forceRegenerateOnNextLoad();
                                throw new RecoverableDexException(new IOException(stringBuilder3, e4));
                            }
                        }
                    }
                    if (i != 0) {
                        configuration2.addDex(file4, file3);
                    } else {
                        configuration2.addDex(file4);
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("added dex ok ");
                    stringBuilder.append(file4);
                    Mlog.m56v(stringBuilder.toString(), new Object[0]);
                    i = isOatFileStillValid(file3, length, lastModified) & i;
                }
            }
            if (i == 0) {
                findOpened.forceRegenerateOnNextLoad();
            }
            if (optimizationCompleted(file)) {
                findOpened.writeStatusLocked(file);
            }
            return;
        }
        Mlog.m56v("App is not loadable yet, avoid loading secondary dexes", new Object[0]);
        super.configureClassLoader(file2, configuration2);
    }

    private java.io.File extractResourceFile(java.lang.String r6, java.io.File r7, java.lang.String r8) {
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
        r5 = this;
        r4 = 0;
        r0 = "txt";	 Catch:{ IOException -> 0x0046 }
        r1 = java.io.File.createTempFile(r8, r0, r7);	 Catch:{ IOException -> 0x0046 }
        r1.deleteOnExit();	 Catch:{ IOException -> 0x0046 }
        r3 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0046 }
        r3.<init>(r1);	 Catch:{ IOException -> 0x0046 }
        r0 = r5.mResProvider;	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
        r2 = r0.open(r6);	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
        com.facebook.common.dextricks.Fs.copyBytes(r3, r2, r0);	 Catch:{ Throwable -> 0x0027, all -> 0x0024 }
        if (r2 == 0) goto L_0x0020;	 Catch:{ Throwable -> 0x0027, all -> 0x0024 }
    L_0x001d:
        r2.close();	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
    L_0x0020:
        r3.close();	 Catch:{ IOException -> 0x0046 }
        goto L_0x0063;	 Catch:{ IOException -> 0x0046 }
    L_0x0024:
        r0 = move-exception;
        r1 = r4;
        goto L_0x002a;
    L_0x0027:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
    L_0x002a:
        if (r2 == 0) goto L_0x0035;
    L_0x002c:
        if (r1 == 0) goto L_0x0032;
    L_0x002e:
        r2.close();	 Catch:{ Throwable -> 0x0035, all -> 0x0036 }
        goto L_0x0035;	 Catch:{ Throwable -> 0x0035, all -> 0x0036 }
    L_0x0032:
        r2.close();	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
    L_0x0035:
        throw r0;	 Catch:{ Throwable -> 0x0039, all -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        r1 = r4;
        goto L_0x003c;
    L_0x0039:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x003b }
    L_0x003b:
        r0 = move-exception;
    L_0x003c:
        if (r1 == 0) goto L_0x0042;
    L_0x003e:
        r3.close();	 Catch:{ Throwable -> 0x0045 }
        goto L_0x0045;	 Catch:{ Throwable -> 0x0045 }
    L_0x0042:
        r3.close();	 Catch:{ IOException -> 0x0046 }
    L_0x0045:
        throw r0;	 Catch:{ IOException -> 0x0046 }
    L_0x0046:
        r2 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "[opt][res] io exception ";
        r1.append(r0);
        r0 = r2.toString();
        r1.append(r0);
        r1 = r1.toString();
        r0 = 0;
        r0 = new java.lang.Object[r0];
        com.facebook.common.dextricks.Mlog.m52e(r1, r0);
        r1 = r4;
    L_0x0063:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.extractResourceFile(java.lang.String, java.io.File, java.lang.String):java.io.File");
    }

    private String getArtImageLocation() {
        String artImageLocation = DalvikInternals.getArtImageLocation();
        if (artImageLocation != null) {
            return artImageLocation;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/data/dalvik-cache/");
        stringBuilder.append(OdexSchemeArtTurbo.getArch());
        stringBuilder.append("/system@framework@boot.art");
        return stringBuilder.toString();
    }

    private String getOatVersion() {
        String oatFormatVersion = DalvikInternals.getOatFormatVersion();
        if (oatFormatVersion != null && !oatFormatVersion.isEmpty()) {
            return oatFormatVersion;
        }
        StringBuilder stringBuilder;
        int i = VERSION.SDK_INT;
        if (i != 10000) {
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case ParserMinimalBase.INT_CR /*13*/:
                case 14:
                case 15:
                case 16:
                case 17:
                case Process.SIGCONT /*18*/:
                case Process.SIGSTOP /*19*/:
                case Process.SIGTSTP /*20*/:
                    break;
                case 21:
                    return "039";
                case 22:
                    return "045";
                case 23:
                    return "064";
                case 24:
                    return "079";
                case 25:
                    return "088";
                case OREO_SDK_INT /*26*/:
                    return "124";
                case 27:
                    return "131";
                default:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("unknown api version: VERSION.SDK_INT = ");
                    stringBuilder.append(VERSION.SDK_INT);
                    Mlog.m52e(stringBuilder.toString(), new Object[0]);
                    return "039";
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("oatmeal should be used on Dalvik. VERSION.SDK_INT = ");
        stringBuilder.append(VERSION.SDK_INT);
        Mlog.m52e(stringBuilder.toString(), new Object[0]);
        return "039";
    }

    public java.lang.String getOatmealPath(com.facebook.common.dextricks.DexStore.TmpDir r7) {
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
        r0 = r6.mOatmealPath;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r0 = "oatmeal";
        r5 = X.AnonymousClass0CF.m863L(r0);
        r5.getParentFile();
        r0 = r5.canExecute();
        if (r0 != 0) goto L_0x0059;
    L_0x0014:
        r2 = "oatmeal";
        r1 = r7.directory;
        r0 = 0;
        r2 = java.io.File.createTempFile(r2, r0, r1);
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
        goto L_0x005a;
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
        r2 = r5;
    L_0x005a:
        r0 = r2.getAbsolutePath();
        r6.mOatmealPath = r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.getOatmealPath(com.facebook.common.dextricks.DexStore$TmpDir):java.lang.String");
    }

    private static int getOdexFlags() {
        return VERSION.SDK_INT < OREO_SDK_INT ? 5 : 1;
    }

    private int getTruncatedSize(DexStore dexStore) {
        return dexStore.readConfig().artTruncatedDexSize;
    }

    private static boolean isOatFileStillValid(File file, long j, long j2) {
        if (VERSION.SDK_INT < OREO_SDK_INT) {
            long length = file.length();
            long lastModified = file.lastModified();
            if (!(j == length && j2 == lastModified && j != 0)) {
                return false;
            }
        }
        return true;
    }

    public int loadInformationalStatus(java.io.File r14, long r15) {
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
        r0 = r13.mDexes;
        r2 = 0;
        r8 = makeExpectedFileList(r0, r2);
        r1 = android.os.Build.VERSION.SDK_INT;
        r7 = 0;
        r0 = 26;
        if (r1 < r0) goto L_0x0014;
    L_0x000f:
        r6 = com.facebook.common.dextricks.OdexSchemeArtTurbo.getOreoOdexOutputDirectory(r14, r7);
        goto L_0x0029;
    L_0x0014:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r14.getCanonicalPath();
        r1.append(r0);
        r0 = "/";
        r1.append(r0);
        r6 = r1.toString();
    L_0x0029:
        r5 = 0;
        r4 = 0;
    L_0x002b:
        r0 = r8.length;
        if (r5 >= r0) goto L_0x0114;
    L_0x002e:
        r10 = new java.io.File;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r6);
        r0 = r8[r5];
        r0 = oatNameFromDexName(r0);
        r1.append(r0);
        r0 = r1.toString();
        r10.<init>(r0);
        r0 = r10.exists();
        if (r0 != 0) goto L_0x006a;
    L_0x004e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "loadInformationalStatus didn't find: ";
        r1.append(r0);
        r0 = r10.getAbsolutePath();
        r1.append(r0);
        r1 = r1.toString();
        r0 = new java.lang.Object[r7];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        goto L_0x0114;
    L_0x006a:
        r11 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00f6 }
        r11.<init>(r10);	 Catch:{ IOException -> 0x00f6 }
        r9 = 0;	 Catch:{ IOException -> 0x00f6 }
        r12 = new java.io.ByteArrayOutputStream;	 Catch:{ Throwable -> 0x00ec }
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ Throwable -> 0x00ec }
        r12.<init>(r0);	 Catch:{ Throwable -> 0x00ec }
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ Throwable -> 0x00ec }
        r13 = com.facebook.common.dextricks.Fs.discardFromInputStream(r11, r0);	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        if (r0 == 0) goto L_0x00a2;	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
    L_0x0081:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r1.<init>();	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r0 = "loadInformationalStatus couldn't read more than 4k of the beginning of ";	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r1.append(r0);	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r0 = r10.getAbsolutePath();	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r1.append(r0);	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r0 = new java.lang.Object[r7];	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r12.close();	 Catch:{ Throwable -> 0x00ec }
        r11.close();	 Catch:{ IOException -> 0x00f6 }
        goto L_0x0110;	 Catch:{ IOException -> 0x00f6 }
    L_0x00a2:
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ IOException -> 0x00f6 }
        com.facebook.common.dextricks.Fs.copyBytes(r12, r11, r0);	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r12.flush();	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r1 = r12.toString();	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r0 = "86827de6f1ef3407f8dc98b76382d3a6e0759ab3";	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r0 = r1.indexOf(r0);	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        if (r0 < 0) goto L_0x00b8;	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
    L_0x00b6:
        r13 = 1;	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        goto L_0x00b9;	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
    L_0x00b8:
        r13 = 0;	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
    L_0x00b9:
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r1.<init>();	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r0 = "loadInformationalStatus? ";	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r1.append(r0);	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r1.append(r13);	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r0 = new java.lang.Object[r7];	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r4 = r4 | 128;	 Catch:{ Throwable -> 0x00db, all -> 0x00d8 }
        r12.close();	 Catch:{ Throwable -> 0x00ec }
        r11.close();	 Catch:{ IOException -> 0x00f6 }
        goto L_0x0114;	 Catch:{ IOException -> 0x00f6 }
    L_0x00d8:
        r1 = move-exception;
        r0 = r9;
        goto L_0x00de;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00dd }
    L_0x00dd:
        r1 = move-exception;
    L_0x00de:
        if (r0 == 0) goto L_0x00e4;
    L_0x00e0:
        r12.close();	 Catch:{ Throwable -> 0x00e7 }
        goto L_0x00e7;	 Catch:{ Throwable -> 0x00e7 }
    L_0x00e4:
        r12.close();	 Catch:{ Throwable -> 0x00ec }
    L_0x00e7:
        throw r1;	 Catch:{ Throwable -> 0x00ec }
    L_0x00e8:
        r0 = move-exception;
        if (r9 == 0) goto L_0x00f2;
    L_0x00eb:
        goto L_0x00ee;
    L_0x00ec:
        r9 = move-exception;
        throw r9;	 Catch:{ all -> 0x00e8 }
    L_0x00ee:
        r11.close();	 Catch:{ Throwable -> 0x00f5 }
        goto L_0x00f5;	 Catch:{ Throwable -> 0x00f5 }
    L_0x00f2:
        r11.close();	 Catch:{ IOException -> 0x00f6 }
    L_0x00f5:
        throw r0;	 Catch:{ IOException -> 0x00f6 }
    L_0x00f6:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "loadInformationalStatus couldn't open ";
        r1.append(r0);
        r0 = r10.getAbsolutePath();
        r1.append(r0);
        r1 = r1.toString();
        r0 = new java.lang.Object[r7];
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);
    L_0x0110:
        r5 = r5 + 1;
        goto L_0x002b;
    L_0x0114:
        r5 = 32;
        r0 = r15 & r5;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        r9 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r7 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r0 != 0) goto L_0x0129;
    L_0x0120:
        r0 = r15 & r7;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0129;
    L_0x0126:
        r4 = r4 | 256;
        goto L_0x0139;
    L_0x0129:
        r5 = 64;
        r0 = r15 & r5;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0139;
    L_0x0131:
        r0 = r15 & r9;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0139;
    L_0x0137:
        r4 = r4 | 512;
    L_0x0139:
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r15 & r5;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r0 != 0) goto L_0x014b;
    L_0x0143:
        r0 = r15 & r5;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x014b;
    L_0x0149:
        r4 = r4 | 1024;
    L_0x014b:
        r0 = r15 & r7;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0154;
    L_0x0151:
        r4 = r4 | 2048;
        goto L_0x015c;
    L_0x0154:
        r0 = r15 & r9;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x015c;
    L_0x015a:
        r4 = r4 | 4096;
    L_0x015c:
        r15 = r15 & r5;
        r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0163;
    L_0x0161:
        r4 = r4 | 8192;
    L_0x0163:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.loadInformationalStatus(java.io.File, long):int");
    }

    public boolean loadNotOptimized(long j) {
        return anyOptimizationDone(j) ^ 1;
    }

    private static String[] makeExpectedFileList(Dex[] dexArr, long j) {
        boolean anyOptimizationDone = anyOptimizationDone(j);
        String str = VERSION.SDK_INT >= OREO_SDK_INT ? OdexSchemeArtTurbo.OREO_ODEX_DIR : null;
        if (!anyOptimizationDone) {
            str = null;
        }
        dexArr = OdexSchemeArtTurbo.makeExpectedFileList(dexArr, str);
        if (!anyOptimizationDone) {
            return dexArr;
        }
        int i = 0;
        if (VERSION.SDK_INT >= OREO_SDK_INT) {
            String[] strArr = new String[(dexArr.length + 1)];
            System.arraycopy(dexArr, 0, strArr, 0, dexArr.length);
            strArr[dexArr.length] = OdexSchemeArtTurbo.OREO_ODEX_DIR;
            return strArr;
        }
        strArr = new String[(dexArr.length * 2)];
        System.arraycopy(dexArr, 0, strArr, 0, dexArr.length);
        while (i < dexArr.length) {
            strArr[dexArr.length + i] = oatNameFromDexName(dexArr[i]);
            i++;
        }
        return strArr;
    }

    public static String[] makeMixedModeFileList(Dex[] dexArr, String str) {
        String makeDexName;
        String replace = str.substring(1, str.length() - 1).replace('/', '.');
        for (int i = 0; i < dexArr.length; i++) {
            Mlog.m58w("[mixed_mode] comparing %s and %s", dexArr[i].canaryClass, replace);
            if (dexArr[i].canaryClass.equals(replace)) {
                makeDexName = OdexSchemeArtTurbo.makeDexName(dexArr[i]);
                break;
            }
        }
        makeDexName = null;
        if (makeDexName == null) {
            return null;
        }
        return new String[]{makeDexName};
    }

    public static boolean mixedNeeded(long j) {
        return (optimizationCompleted(j) || (j & STATE_MIXED_NEEDED) == 0) ? false : true;
    }

    public boolean needOptimization(long j) {
        return optimizationCompleted(j) ^ 1;
    }

    private boolean needsTruncation(File file, int i) {
        return i >= 0 && file.length() > ((long) i);
    }

    public static String oatNameFromDexName(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        if (VERSION.SDK_INT >= OREO_SDK_INT) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".odex");
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".oat");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void optimize(android.content.Context r36, com.facebook.common.dextricks.DexStore r37, com.facebook.common.dextricks.DexStore.OptimizationSession r38, com.facebook.common.dextricks.DexStore.ProgressListener r39) {
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
        r35 = this;
        r1 = 1;
        r6 = 0;
        r9 = r39;
        if (r39 == 0) goto L_0x0009;
    L_0x0006:
        r9.onProgress(r1, r6, r1);
    L_0x0009:
        r0 = "fb4a_art_verify_none_enabled";
        r11 = r36;
        r28 = X.AnonymousClass0Db.m1232B(r11, r0);
        r23 = com.facebook.common.dextricks.DexStore.oatmealEnabled(r11);
        r15 = com.facebook.common.dextricks.DexStore.dex2oatQuickeningEnabled(r11);
        if (r15 != 0) goto L_0x0024;
    L_0x001b:
        r0 = com.facebook.common.dextricks.DexStore.oatmealQuickeningEnabled(r11);
        if (r0 == 0) goto L_0x0024;
    L_0x0021:
        r22 = 1;
        goto L_0x0026;
    L_0x0024:
        r22 = 0;
    L_0x0026:
        if (r22 != 0) goto L_0x002d;
    L_0x0028:
        if (r15 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002d;
    L_0x002b:
        r14 = 0;
        goto L_0x002e;
    L_0x002d:
        r14 = 1;
    L_0x002e:
        r21 = com.facebook.common.dextricks.DexStore.mixedModeEnabled(r11);
        r0 = "dexopt";
        r10 = r37;
        r5 = r10.makeTemporaryDirectory(r0);
        r20 = 0;
        r7 = new com.facebook.common.dextricks.OdexSchemeArtXdex$Renamer;	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r12 = r35;	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r7.<init>(r5);	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r2 = "[opt] opened tmpDir %s; starting job";	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r1 = new java.lang.Object[r1];	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r0 = r5.directory;	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r1[r6] = r0;	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r4 = new com.facebook.common.dextricks.DexStore$OptimizationSession$Job;	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r8 = r38;	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r8.getClass();	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r4.<init>();	 Catch:{ Throwable -> 0x021a, all -> 0x0218 }
        r1 = "[opt] opened job";	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r0 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r0 = r4.initialStatus;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r2 = optimizationCompleted(r0);	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        if (r2 == 0) goto L_0x007d;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
    L_0x0067:
        r1 = "[opt] nothing to do: ART xdex already complete";	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r0 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        com.facebook.common.dextricks.Mlog.m56v(r1, r0);	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r4.close();	 Catch:{ Throwable -> 0x0077, all -> 0x0218 }
        if (r5 == 0) goto L_0x0076;	 Catch:{ Throwable -> 0x0077, all -> 0x0218 }
    L_0x0073:
        r5.close();
    L_0x0076:
        return;
    L_0x0077:
        r20 = move-exception;
        goto L_0x021b;
    L_0x007a:
        r1 = move-exception;
        goto L_0x020a;
    L_0x007d:
        r2 = 0;
        r4.startOptimizing();	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r13 = anyOptimizationDone(r0);	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r18 = 32;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r16 = 16;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        if (r13 != 0) goto L_0x00fa;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
    L_0x008c:
        if (r23 == 0) goto L_0x00ca;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
    L_0x008e:
        r30 = 0;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r23 = r12;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r39 = r7;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r24 = r11;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r25 = r7;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r26 = r10;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r27 = r8;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r28 = r4;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r29 = r5;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r23.optimizeOatmeal(r24, r25, r26, r27, r28, r29, r30);	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r3 = "[opt] first oatmeal run";	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r2 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        com.facebook.common.dextricks.Mlog.m56v(r3, r2);	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        if (r14 == 0) goto L_0x00b4;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
    L_0x00ac:
        if (r22 == 0) goto L_0x00b1;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
    L_0x00ae:
        r16 = 32;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        goto L_0x00b8;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
    L_0x00b1:
        r16 = 64;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        goto L_0x00b8;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
    L_0x00b4:
        if (r21 == 0) goto L_0x00b8;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
    L_0x00b6:
        r16 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
    L_0x00b8:
        r0 = r0 | r16;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r7 = "[opt] new status 0x%x";	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r2 = 1;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r3 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r2 = java.lang.Long.valueOf(r0);	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r3[r6] = r2;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        com.facebook.common.dextricks.Mlog.m56v(r7, r3);	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        goto L_0x01a1;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
    L_0x00ca:
        r39 = r7;	 Catch:{ Throwable -> 0x007a, all -> 0x0205 }
        r3 = "[opt] first dex2oat run";	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r2 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        com.facebook.common.dextricks.Mlog.m56v(r3, r2);	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r29 = 0;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r21 = r12;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r27 = r5;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r30 = 0;	 Catch:{ Throwable -> 0x0209, all -> 0x0205 }
        r22 = r11;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r23 = r10;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r24 = r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r25 = r8;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r26 = r4;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r21.optimizeDex2Oat(r22, r23, r24, r25, r26, r27, r28, r29, r30);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r0 = r0 | r16;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = "[opt] new status 0x%x";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r2 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r3 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r2 = java.lang.Long.valueOf(r0);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r3[r6] = r2;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        com.facebook.common.dextricks.Mlog.m56v(r7, r3);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        goto L_0x01a1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x00fa:
        r39 = r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r13 = quickeningNeeded(r0);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        if (r13 == 0) goto L_0x0162;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0102:
        r14 = "[opt] quickening";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r13 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        com.facebook.common.dextricks.Mlog.m56v(r14, r13);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        if (r22 == 0) goto L_0x0122;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x010b:
        r30 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r23 = r12;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r29 = r5;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r24 = r11;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r25 = r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r26 = r10;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r27 = r8;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r28 = r4;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r15 = r23.optimizeOatmeal(r24, r25, r26, r27, r28, r29, r30);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        goto L_0x0140;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0122:
        if (r15 == 0) goto L_0x013f;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0124:
        r37 = 0;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r38 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r29 = r12;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r30 = r11;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r31 = r10;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r32 = r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r33 = r8;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r34 = r4;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r35 = r5;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r36 = r28;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r15 = r29.optimizeDex2Oat(r30, r31, r32, r33, r34, r35, r36, r37, r38);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r2 = 512; // 0x200 float:7.175E-43 double:2.53E-321;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        goto L_0x0140;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x013f:
        r15 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0140:
        if (r21 == 0) goto L_0x0144;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0142:
        r16 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0144:
        r0 = r0 | r16;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        if (r15 == 0) goto L_0x0153;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0148:
        if (r22 == 0) goto L_0x014b;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x014a:
        goto L_0x014d;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x014b:
        r18 = 64;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x014d:
        r7 = -1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r18 = r18 ^ r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r0 = r0 & r18;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0153:
        r10 = "[opt] new status 0x%x";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r8 = new java.lang.Object[r7];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = java.lang.Long.valueOf(r0);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r8[r6] = r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x015e:
        com.facebook.common.dextricks.Mlog.m56v(r10, r8);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        goto L_0x01a4;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0162:
        r2 = mixedNeeded(r0);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        if (r2 == 0) goto L_0x019a;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0168:
        r3 = "[opt] mixed mode";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r2 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        com.facebook.common.dextricks.Mlog.m56v(r3, r2);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r29 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r30 = 0;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r21 = r12;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r22 = r11;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r23 = r10;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r24 = r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r25 = r8;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r26 = r4;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r27 = r5;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r15 = r21.optimizeDex2Oat(r22, r23, r24, r25, r26, r27, r28, r29, r30);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r0 = r0 | r16;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        if (r15 == 0) goto L_0x018c;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x0189:
        r2 = -129; // 0xffffffffffffff7f float:NaN double:NaN;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r0 = r0 & r2;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x018c:
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r10 = "[opt] new status 0x%x";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r8 = new java.lang.Object[r7];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = java.lang.Long.valueOf(r0);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r8[r6] = r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        goto L_0x015e;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x019a:
        r3 = "[opt] impossible condition in optimization steps...";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r2 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        com.facebook.common.dextricks.Mlog.m58w(r3, r2);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01a1:
        r2 = 0;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r15 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01a4:
        r13 = r4.startCommitting(r2);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = r4.initialStatus;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = r7 | r2;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = r7 & r13;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1));	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        if (r7 == 0) goto L_0x01c5;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01b0:
        r11 = "[opt] status changed under ourselves... current: 0x%x, new: 0x%x";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = 2;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r10 = new java.lang.Object[r7];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = java.lang.Long.valueOf(r13);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r10[r6] = r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r8 = java.lang.Long.valueOf(r0);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r10[r7] = r8;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        com.facebook.common.dextricks.Mlog.m58w(r11, r10);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01c5:
        if (r15 != 0) goto L_0x01ce;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01c7:
        r8 = "[opt] failure to set up the optimization command";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        com.facebook.common.dextricks.Mlog.m58w(r8, r7);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01ce:
        if (r15 == 0) goto L_0x01d3;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01d0:
        r39.renameOrThrow();	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01d3:
        r10 = "[opt] new status 0x%x";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = 1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r8 = new java.lang.Object[r7];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r7 = java.lang.Long.valueOf(r0);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r8[r6] = r7;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        com.facebook.common.dextricks.Mlog.m56v(r10, r8);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r0 = r0 | r2;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r4.finishCommit(r0);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r1 = "ART xdex optimization complete";	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        r0 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
        if (r15 == 0) goto L_0x01f1;	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01ee:
        r12.saveOatFiles();	 Catch:{ Throwable -> 0x0203, all -> 0x0201 }
    L_0x01f1:
        r4.close();	 Catch:{ Throwable -> 0x0216 }
        if (r5 == 0) goto L_0x01f9;	 Catch:{ Throwable -> 0x0216 }
    L_0x01f6:
        r5.close();
    L_0x01f9:
        if (r9 == 0) goto L_0x0076;
    L_0x01fb:
        r0 = 1;
        r9.onProgress(r0, r0, r6);
        goto L_0x0076;
    L_0x0201:
        r0 = move-exception;
        goto L_0x0206;
    L_0x0203:
        r1 = move-exception;
        goto L_0x020a;
    L_0x0205:
        r0 = move-exception;
    L_0x0206:
        r1 = r20;
        goto L_0x020c;
    L_0x0209:
        r1 = move-exception;
    L_0x020a:
        throw r1;	 Catch:{ all -> 0x020b }
    L_0x020b:
        r0 = move-exception;
    L_0x020c:
        if (r1 == 0) goto L_0x0212;
    L_0x020e:
        r4.close();	 Catch:{ Throwable -> 0x0215 }
        goto L_0x0215;	 Catch:{ Throwable -> 0x0215 }
    L_0x0212:
        r4.close();	 Catch:{ Throwable -> 0x0216 }
    L_0x0215:
        throw r0;	 Catch:{ Throwable -> 0x0216 }
    L_0x0216:
        r20 = move-exception;
        goto L_0x021b;
    L_0x0218:
        r0 = move-exception;
        goto L_0x021d;
    L_0x021a:
        r20 = move-exception;
    L_0x021b:
        throw r20;	 Catch:{ all -> 0x021c }
    L_0x021c:
        r0 = move-exception;
    L_0x021d:
        if (r5 == 0) goto L_0x0228;
    L_0x021f:
        if (r20 == 0) goto L_0x0225;
    L_0x0221:
        r5.close();	 Catch:{ Throwable -> 0x0228 }
        goto L_0x0228;	 Catch:{ Throwable -> 0x0228 }
    L_0x0225:
        r5.close();
    L_0x0228:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.optimize(android.content.Context, com.facebook.common.dextricks.DexStore, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$ProgressListener):void");
    }

    private boolean optimizeDex2Oat(android.content.Context r18, com.facebook.common.dextricks.DexStore r19, com.facebook.common.dextricks.OdexSchemeArtXdex.Renamer r20, com.facebook.common.dextricks.DexStore.OptimizationSession r21, com.facebook.common.dextricks.DexStore.OptimizationSession.Job r22, com.facebook.common.dextricks.DexStore.TmpDir r23, boolean r24, boolean r25, boolean r26) {
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
        r17 = this;
        r9 = r21;
        r0 = r9.config;
        r0 = r0.flags;
        r3 = 1;
        r0 = r0 & r3;
        r2 = 0;
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r16 = 1;
        goto L_0x0010;
    L_0x000e:
        r16 = 0;
    L_0x0010:
        r0 = "art_pgo_input.txt";
        r10 = r17;
        r14 = r10.checkForPgoFile(r0);
        r0 = "BOOTCLASSPATH";
        r7 = java.lang.System.getenv(r0);
        r15 = r19;
        r5 = r15.getDependencyOdexFiles();
        r4 = 0;
    L_0x0025:
        r0 = r5.length;
        if (r4 >= r0) goto L_0x0045;
    L_0x0028:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r7);
        r0 = ":";
        r1.append(r0);
        r0 = r5[r4];
        r0 = r0.getAbsoluteFile();
        r1.append(r0);
        r7 = r1.toString();
        r4 = r4 + 2;
        goto L_0x0025;
    L_0x0045:
        r8 = r23;
        if (r25 == 0) goto L_0x00c2;
    L_0x0049:
        r4 = "mixed_mode.txt";
        r1 = r8.directory;
        r0 = "art_mixed_mode_data_input";
        r1 = r10.extractResourceFile(r4, r1, r0);
        if (r1 != 0) goto L_0x005d;
    L_0x0055:
        r1 = "[opt][mixed_mode] no mixed mode data file found";
        r0 = new java.lang.Object[r2];
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);
        return r2;
    L_0x005d:
        r4 = "[opt][mixed_mode] found mixed mode data file";
        r0 = new java.lang.Object[r2];
        com.facebook.common.dextricks.Mlog.m54i(r4, r0);
        r12 = 0;
        r5 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x00a7 }
        r0 = new java.io.FileReader;	 Catch:{ IOException -> 0x00a7 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00a7 }
        r5.<init>(r0);	 Catch:{ IOException -> 0x00a7 }
        r0 = r5.readLine();	 Catch:{ Throwable -> 0x0097, all -> 0x0093 }
        r4 = r0.trim();	 Catch:{ Throwable -> 0x0097, all -> 0x0093 }
        if (r4 == 0) goto L_0x0085;	 Catch:{ Throwable -> 0x0097, all -> 0x0093 }
    L_0x0079:
        r0 = r4.isEmpty();	 Catch:{ Throwable -> 0x0083, all -> 0x0080 }
        if (r0 == 0) goto L_0x008d;	 Catch:{ Throwable -> 0x0083, all -> 0x0080 }
    L_0x007f:
        goto L_0x0085;	 Catch:{ Throwable -> 0x0083, all -> 0x0080 }
    L_0x0080:
        r1 = move-exception;
        r0 = r12;
        goto L_0x009b;
    L_0x0083:
        r0 = move-exception;
        goto L_0x0099;
    L_0x0085:
        r1 = "[opt][mixed_mode] mixed mode data missing in mixed mode data file";	 Catch:{ Throwable -> 0x0097, all -> 0x0093 }
        r0 = new java.lang.Object[r2];	 Catch:{ Throwable -> 0x0097, all -> 0x0093 }
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);	 Catch:{ Throwable -> 0x0097, all -> 0x0093 }
        r4 = r12;	 Catch:{ Throwable -> 0x0097, all -> 0x0093 }
    L_0x008d:
        r5.close();	 Catch:{ IOException -> 0x0091 }
        goto L_0x00b0;	 Catch:{ IOException -> 0x0091 }
    L_0x0091:
        r5 = move-exception;
        goto L_0x00a9;
    L_0x0093:
        r1 = move-exception;
        r0 = r12;
        r4 = r12;
        goto L_0x009b;
    L_0x0097:
        r0 = move-exception;
        r4 = r12;
    L_0x0099:
        throw r0;	 Catch:{ all -> 0x009a }
    L_0x009a:
        r1 = move-exception;
    L_0x009b:
        if (r0 == 0) goto L_0x00a1;
    L_0x009d:
        r5.close();	 Catch:{ Throwable -> 0x00a4 }
        goto L_0x00a4;	 Catch:{ Throwable -> 0x00a4 }
    L_0x00a1:
        r5.close();	 Catch:{ IOException -> 0x00a5 }
    L_0x00a4:
        throw r1;	 Catch:{ IOException -> 0x00a5 }
    L_0x00a5:
        r5 = move-exception;
        goto L_0x00a9;
    L_0x00a7:
        r5 = move-exception;
        r4 = r12;
    L_0x00a9:
        r1 = "[opt][mixed_mode] problem reading mixed mode data file";
        r0 = new java.lang.Object[r2];
        com.facebook.common.dextricks.Mlog.m59w(r5, r1, r0);
    L_0x00b0:
        r1 = "[opt][mixed_mode] mixed mode canary is %s";
        r0 = new java.lang.Object[r3];
        r0[r2] = r4;
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);
        if (r4 == 0) goto L_0x00ca;
    L_0x00bb:
        r0 = r10.mDexes;
        r12 = makeMixedModeFileList(r0, r4);
        goto L_0x00ca;
    L_0x00c2:
        r4 = r10.mDexes;
        r0 = 0;
        r12 = makeExpectedFileList(r4, r0);
    L_0x00ca:
        if (r12 != 0) goto L_0x00d4;
    L_0x00cc:
        r1 = "[opt] no dex file to compile";
        r0 = new java.lang.Object[r2];
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);
        return r2;
    L_0x00d4:
        r11 = 0;
    L_0x00d5:
        r0 = r12.length;
        if (r11 >= r0) goto L_0x02de;
    L_0x00d8:
        r6 = new java.io.File;
        r1 = r15.root;
        r0 = r12[r11];
        r6.<init>(r1, r0);
        r1 = "[opt] dex2oat - go for %s";
        r0 = new java.lang.Object[r3];
        r0[r2] = r6;
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);
        r0 = r12[r11];
        r1 = oatNameFromDexName(r0);
        r5 = new java.io.File;
        r0 = r15.root;
        r5.<init>(r0, r1);
        r4 = new java.io.File;
        r0 = r8.directory;
        r4.<init>(r0, r1);
        r0 = r10.oatFiles;
        r0.add(r5);
        r3 = new com.facebook.forker.ProcessBuilder;
        r13 = "/system/bin/dex2oat";
        r0 = 5;
        r2 = new java.lang.String[r0];
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "--oat-file=";
        r1.append(r0);
        r1.append(r4);
        r1 = r1.toString();
        r0 = 0;
        r2[r0] = r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "--oat-location=";
        r1.append(r0);
        r0 = r5.getPath();
        r1.append(r0);
        r1 = r1.toString();
        r0 = 1;
        r2[r0] = r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "--dex-file=";
        r1.append(r0);
        r0 = r6.getPath();
        r1.append(r0);
        r1 = r1.toString();
        r0 = 2;
        r2[r0] = r1;
        r1 = 3;
        r0 = "--no-watch-dog";
        r2[r1] = r0;
        r1 = 4;
        r0 = "--dump-timing";
        r2[r1] = r0;
        r3.<init>(r13, r2);
        r0 = "BOOTCLASSPATH";
        r1 = r3.setenv(r0, r7);
        r0 = r18.getApplicationContext();
        r0 = com.facebook.forker.ProcessBuilder.genDefaultTmpDir(r0);
        r6 = r1.setTmpDir(r0);
        r0 = "dalvik.vm.dex2oat-Xms";
        r2 = android.os.SystemProperties.get(r0);
        r0 = r2.isEmpty();
        if (r0 != 0) goto L_0x0192;
    L_0x0179:
        r0 = "--runtime-arg";
        r6.addArgument(r0);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "-Xms";
        r1.append(r0);
        r1.append(r2);
        r0 = r1.toString();
        r6.addArgument(r0);
    L_0x0192:
        r0 = "dalvik.vm.dex2oat-Xmx";
        r2 = android.os.SystemProperties.get(r0);
        r0 = r2.isEmpty();
        if (r0 != 0) goto L_0x01b7;
    L_0x019e:
        r0 = "--runtime-arg";
        r6.addArgument(r0);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "-Xmx";
        r1.append(r0);
        r1.append(r2);
        r0 = r1.toString();
        r6.addArgument(r0);
    L_0x01b7:
        r3 = r9.dexStoreConfig;
        if (r25 == 0) goto L_0x01c9;
    L_0x01bb:
        r1 = "[opt] Enabling compilation for mixed mode";
        r0 = 0;
        r0 = new java.lang.Object[r0];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        r0 = "--compiler-filter=speed";
        r6.addArgument(r0);
        goto L_0x0216;
    L_0x01c9:
        r0 = 0;
        if (r26 == 0) goto L_0x01d9;
    L_0x01cc:
        r1 = "[opt] Enabling quickening";
        r0 = new java.lang.Object[r0];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        r0 = "--compiler-filter=interpret-only";
        r6.addArgument(r0);
        goto L_0x0216;
    L_0x01d9:
        if (r24 == 0) goto L_0x01e8;
    L_0x01db:
        r1 = "[opt] Enabling verify-none option for art";
        r0 = new java.lang.Object[r0];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        r0 = "--compiler-filter=verify-none";
        r6.addArgument(r0);
        goto L_0x0216;
    L_0x01e8:
        r1 = "[opt] Loading compiler system flags";
        r0 = new java.lang.Object[r0];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        r10.setCompilerFilter(r3, r14, r8, r6);
        r0 = "dalvik.vm.dex2oat-flags";
        r2 = android.os.SystemProperties.get(r0);
        r0 = r2.isEmpty();
        if (r0 != 0) goto L_0x0216;
    L_0x01fe:
        r1 = new android.text.TextUtils$SimpleStringSplitter;
        r0 = 32;
        r1.<init>(r0);
        r1.setString(r2);
    L_0x0208:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0216;
    L_0x020e:
        r0 = r1.next();
        r6.addArgument(r0);
        goto L_0x0208;
    L_0x0216:
        if (r16 == 0) goto L_0x021d;
    L_0x0218:
        r0 = "-j1";
        r6.addArgument(r0);
    L_0x021d:
        r0 = r3.artHugeMethodMax;
        if (r0 < 0) goto L_0x0237;
    L_0x0221:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "--huge-method-max=";
        r1.append(r0);
        r0 = r3.artHugeMethodMax;
        r1.append(r0);
        r0 = r1.toString();
        r6.addArgument(r0);
    L_0x0237:
        r0 = r3.artLargeMethodMax;
        if (r0 < 0) goto L_0x0251;
    L_0x023b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "--large-method-max=";
        r1.append(r0);
        r0 = r3.artLargeMethodMax;
        r1.append(r0);
        r0 = r1.toString();
        r6.addArgument(r0);
    L_0x0251:
        r0 = r3.artSmallMethodMax;
        if (r0 < 0) goto L_0x026b;
    L_0x0255:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "--small-method-max=";
        r1.append(r0);
        r0 = r3.artSmallMethodMax;
        r1.append(r0);
        r0 = r1.toString();
        r6.addArgument(r0);
    L_0x026b:
        r0 = r3.artTinyMethodMax;
        if (r0 < 0) goto L_0x0285;
    L_0x026f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "--tiny-method-max=";
        r1.append(r0);
        r0 = r3.artTinyMethodMax;
        r1.append(r0);
        r0 = r1.toString();
        r6.addArgument(r0);
    L_0x0285:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 21;
        if (r1 != r0) goto L_0x02cb;
    L_0x028b:
        r0 = "arthook";
        r3 = X.AnonymousClass0CF.m863L(r0);
        r0 = "LD_PRELOAD";
        r0 = java.lang.System.getenv(r0);
        r2 = "LD_PRELOAD";
        if (r0 != 0) goto L_0x02a0;
    L_0x029b:
        r0 = r3.getAbsolutePath();
        goto L_0x02b8;
    L_0x02a0:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = ":";
        r1.append(r0);
        r0 = r3.getAbsolutePath();
        r1.append(r0);
        r0 = r1.toString();
    L_0x02b8:
        r6.setenv(r2, r0);
        r1 = "LD_LIBRARY_PATH";
        r0 = X.AnonymousClass0CF.m859H();
        r6.setenv(r1, r0);
        r1 = "FB_ENABLE_MIRANDA_HACK";
        r0 = "1";
        r6.setenv(r1, r0);
    L_0x02cb:
        r0 = r20;
        r0.addFile(r4, r5);
        r0 = "dex2oat";
        r10.startOptimizerProcess(r6, r0, r9, r8);
        r10.checkTmpOatFileLength(r4);
        r11 = r11 + 1;
        r3 = 1;
        r2 = 0;
        goto L_0x00d5;
    L_0x02de:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.optimizeDex2Oat(android.content.Context, com.facebook.common.dextricks.DexStore, com.facebook.common.dextricks.OdexSchemeArtXdex$Renamer, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$OptimizationSession$Job, com.facebook.common.dextricks.DexStore$TmpDir, boolean, boolean, boolean):boolean");
    }

    private boolean optimizeOatmeal(Context context, Renamer renamer, DexStore dexStore, OptimizationSession optimizationSession, Job job, TmpDir tmpDir, boolean z) {
        if (VERSION.SDK_INT >= OREO_SDK_INT) {
            return optimizeOatmealForOreo(context, renamer, dexStore, optimizationSession, job, tmpDir);
        }
        String oatmealPath = getOatmealPath(tmpDir);
        r6 = new String[6];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--arch=");
        stringBuilder.append(OdexSchemeArtTurbo.getArch());
        r6[2] = stringBuilder.toString();
        r6[3] = "--one-oat-per-dex";
        stringBuilder = new StringBuilder();
        stringBuilder.append("--art-image-location=");
        stringBuilder.append(getArtImageLocation());
        r6[4] = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("--oat-version=");
        stringBuilder.append(getOatVersion());
        r6[5] = stringBuilder.toString();
        ProcessBuilder tmpDir2 = new ProcessBuilder(oatmealPath, r6).setenv("LD_LIBRARY_PATH", AnonymousClass0CF.m859H()).setTmpDir(ProcessBuilder.genDefaultTmpDir(context.getApplicationContext()));
        if (DalvikInternals.detectSamsungOatFormat()) {
            tmpDir2.addArgument("--samsung-oatformat");
        }
        File extractResourceFile;
        if (z) {
            extractResourceFile = extractResourceFile(QUICK_DATA_RESOURCE_PATH, tmpDir.directory, TMP_QUICK_DATA_FILE);
            if (extractResourceFile != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("--quickening-data=");
                stringBuilder.append(tmpDir.directory);
                stringBuilder.append("/");
                stringBuilder.append(extractResourceFile.getName());
                tmpDir2.addArgument(stringBuilder.toString());
                Mlog.m56v("[opt][quickening] found quick-data file", new Object[0]);
            } else {
                Mlog.m56v("[opt][quickening] no quickening data found", new Object[0]);
                return false;
            }
        }
        Mlog.m56v("[opt][quickening] no quickening requested", new Object[0]);
        String[] makeExpectedFileList = makeExpectedFileList(this.mDexes, 0);
        for (int i = 0; i < makeExpectedFileList.length; i++) {
            extractResourceFile = new File(dexStore.root, makeExpectedFileList[i]);
            stringBuilder = new StringBuilder();
            stringBuilder.append("--dex=");
            stringBuilder.append(extractResourceFile.getPath());
            tmpDir2.addArgument(stringBuilder.toString());
            String oatNameFromDexName = oatNameFromDexName(makeExpectedFileList[i]);
            extractResourceFile = new File(dexStore.root, oatNameFromDexName);
            File file = new File(tmpDir.directory, oatNameFromDexName);
            renamer.addFile(file, extractResourceFile);
            stringBuilder = new StringBuilder();
            stringBuilder.append("--oat=");
            stringBuilder.append(file.getPath());
            tmpDir2.addArgument(stringBuilder.toString());
            this.oatFiles.add(extractResourceFile);
        }
        Mlog.m54i("oatmeal: %s", tmpDir2);
        startOptimizerProcess(tmpDir2, "oatmeal", optimizationSession, tmpDir);
        return true;
    }

    private boolean optimizeOatmealForOreo(Context context, Renamer renamer, DexStore dexStore, OptimizationSession optimizationSession, Job job, TmpDir tmpDir) {
        String oreoOdexOutputDirectory = OdexSchemeArtTurbo.getOreoOdexOutputDirectory(dexStore.root, true);
        TmpDir tmpDir2 = tmpDir;
        String oatmealPath = getOatmealPath(tmpDir2);
        r3 = new String[6];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--arch=");
        stringBuilder.append(OdexSchemeArtTurbo.getArch());
        r3[2] = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("--art-image-location=");
        stringBuilder.append(getArtImageLocation());
        r3[3] = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("--oat=");
        stringBuilder.append(tmpDir2.directory.getPath());
        stringBuilder.append("/");
        r3[4] = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("--oat-version=");
        stringBuilder.append(getOatVersion());
        r3[5] = stringBuilder.toString();
        ProcessBuilder tmpDir3 = new ProcessBuilder(oatmealPath, r3).setenv("LD_LIBRARY_PATH", AnonymousClass0CF.m859H()).setTmpDir(ProcessBuilder.genDefaultTmpDir(context.getApplicationContext()));
        if (DalvikInternals.detectSamsungOatFormat()) {
            tmpDir3.addArgument("--samsung-oatformat");
        }
        String[] makeExpectedFileList = makeExpectedFileList(this.mDexes, 0);
        for (int i = 0; i < makeExpectedFileList.length; i++) {
            File file = new File(dexStore.root, makeExpectedFileList[i]);
            stringBuilder = new StringBuilder();
            stringBuilder.append("--dex=");
            stringBuilder.append(file.getPath());
            tmpDir3.addArgument(stringBuilder.toString());
            String oatNameFromDexName = oatNameFromDexName(makeExpectedFileList[i]);
            oatmealPath = vdexNameFromOdexName(oatNameFromDexName);
            renamer.addFile(new File(tmpDir2.directory, oatNameFromDexName), new File(oreoOdexOutputDirectory, oatNameFromDexName));
            renamer.addFile(new File(tmpDir2.directory, oatmealPath), new File(oreoOdexOutputDirectory, oatmealPath));
        }
        Mlog.m54i("oatmeal: %s", tmpDir3);
        startOptimizerProcess(tmpDir3, "oatmeal", optimizationSession, tmpDir2);
        return true;
    }

    private void saveOatFiles() {
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
        r10 = this;
        r0 = X.AnonymousClass00r.f104D;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r1 = android.os.Build.VERSION.SDK_INT;
        r0 = 26;
        if (r1 < r0) goto L_0x000c;
    L_0x000b:
        goto L_0x0004;
    L_0x000c:
        r0 = android.os.Environment.DIRECTORY_DOWNLOADS;
        r0 = android.os.Environment.getExternalStoragePublicDirectory(r0);
        r5 = 1;
        r4 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00b6 }
        r1.<init>();	 Catch:{ IOException -> 0x00b6 }
        r0 = r0.getCanonicalPath();	 Catch:{ IOException -> 0x00b6 }
        r1.append(r0);	 Catch:{ IOException -> 0x00b6 }
        r0 = "/FB/";	 Catch:{ IOException -> 0x00b6 }
        r1.append(r0);	 Catch:{ IOException -> 0x00b6 }
        r9 = r1.toString();	 Catch:{ IOException -> 0x00b6 }
        r1 = "Saving oat files to sdCardPath: %s";
        r0 = new java.lang.Object[r5];
        r0[r4] = r9;
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        r0 = r10.oatFiles;
        r8 = r0.size();
        r7 = 0;
    L_0x0039:
        if (r7 >= r8) goto L_0x00ae;
    L_0x003b:
        r0 = r10.oatFiles;
        r3 = r0.get(r7);
        r3 = (java.io.File) r3;
        r2 = "Copying oatFile: %s";
        r1 = new java.lang.Object[r5];
        r0 = r3.getName();
        r1[r4] = r0;
        com.facebook.common.dextricks.Mlog.m54i(r2, r1);
        r1 = new java.io.File;
        r0 = r3.getName();
        r1.<init>(r9, r0);
        r6 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0098 }
        r0 = r3.getCanonicalPath();	 Catch:{ IOException -> 0x0098 }
        r6.<init>(r0);	 Catch:{ IOException -> 0x0098 }
        r0 = 0;	 Catch:{ IOException -> 0x0098 }
        r3 = new java.io.FileOutputStream;	 Catch:{ Throwable -> 0x008e }
        r3.<init>(r1);	 Catch:{ Throwable -> 0x008e }
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ Throwable -> 0x008e }
        com.facebook.common.dextricks.Fs.copyBytes(r3, r6, r1);	 Catch:{ Throwable -> 0x007d, all -> 0x007a }
        r3.flush();	 Catch:{ Throwable -> 0x007d, all -> 0x007a }
        r3.close();	 Catch:{ Throwable -> 0x008e }
        r6.close();	 Catch:{ IOException -> 0x0098 }
        r7 = r7 + 1;	 Catch:{ IOException -> 0x0098 }
        goto L_0x0039;	 Catch:{ IOException -> 0x0098 }
    L_0x007a:
        r1 = move-exception;
        r2 = r0;
        goto L_0x0080;
    L_0x007d:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x007f }
    L_0x007f:
        r1 = move-exception;
    L_0x0080:
        if (r2 == 0) goto L_0x0086;
    L_0x0082:
        r3.close();	 Catch:{ Throwable -> 0x0089 }
        goto L_0x0089;	 Catch:{ Throwable -> 0x0089 }
    L_0x0086:
        r3.close();	 Catch:{ Throwable -> 0x008e }
    L_0x0089:
        throw r1;	 Catch:{ Throwable -> 0x008e }
    L_0x008a:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0094;
    L_0x008d:
        goto L_0x0090;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008a }
    L_0x0090:
        r6.close();	 Catch:{ Throwable -> 0x0097 }
        goto L_0x0097;	 Catch:{ Throwable -> 0x0097 }
    L_0x0094:
        r6.close();	 Catch:{ IOException -> 0x0098 }
    L_0x0097:
        throw r1;	 Catch:{ IOException -> 0x0098 }
    L_0x0098:
        r3 = move-exception;
        r1 = "OatFile couldn't be saved to sdcard ";
        r0 = new java.lang.Object[r4];
        com.facebook.common.dextricks.Mlog.m58w(r1, r0);
        r2 = "Exception: %s";
        r1 = new java.lang.Object[r5];
        r0 = r3.toString();
        r1[r4] = r0;
        com.facebook.common.dextricks.Mlog.m58w(r2, r1);
        return;
    L_0x00ae:
        r1 = "Copying oat files complete.";
        r0 = new java.lang.Object[r4];
        com.facebook.common.dextricks.Mlog.m54i(r1, r0);
        return;
    L_0x00b6:
        r0 = move-exception;
        r2 = "Exception: %s";
        r1 = new java.lang.Object[r5];
        r0 = r0.toString();
        r1[r4] = r0;
        com.facebook.common.dextricks.Mlog.m58w(r2, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.saveOatFiles():void");
    }

    private void setCompilerFilter(Config config, boolean z, TmpDir tmpDir, ProcessBuilder processBuilder) {
        if (config.artFilter != (byte) 0) {
            String str = null;
            switch (config.artFilter) {
                case (byte) 1:
                    str = "verify-none";
                    break;
                case (byte) 2:
                    str = "interpret-only";
                    break;
                case (byte) 3:
                    str = "space";
                    break;
                case (byte) 4:
                    str = "balanced";
                    break;
                case (byte) 5:
                    str = "speed";
                    break;
                case (byte) 6:
                    str = "everything";
                    break;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                    str = "time";
                    break;
                default:
                    Mlog.m58w("ignoring unknown configured ART filter %s", Byte.valueOf(config.artFilter));
                    break;
            }
            if (str != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("--compiler-filter=");
                stringBuilder.append(str);
                processBuilder.addArgument(stringBuilder.toString());
                return;
            }
        }
        String str2 = SystemProperties.get("dalvik.vm.dex2oat-filter");
        if (!str2.isEmpty()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("--compiler-filter=");
            stringBuilder.append(str2);
            processBuilder.addArgument(stringBuilder.toString());
        } else if (z) {
            File extractResourceFile = extractResourceFile(PGO_RESOURCE_PATH, tmpDir.directory, TMP_PGO_FILE);
            if (extractResourceFile != null) {
                processBuilder.addArgument("--compiler-filter=everything");
                processBuilder.addArgument("--compiler-backend=Quick");
                stringBuilder = new StringBuilder();
                stringBuilder.append("--profile-file=");
                stringBuilder.append(tmpDir.directory);
                stringBuilder.append("/");
                stringBuilder.append(extractResourceFile.getName());
                processBuilder.addArgument(stringBuilder.toString());
                Mlog.m54i("[opt][pgo] found pgo file, enabling PGO guided compilation", new Object[0]);
            }
        } else {
            Mlog.m54i("[opt] no compile-filter set or pgo data, compiling with verify-none", new Object[0]);
            processBuilder.addArgument("--compiler-filter=verify-none");
        }
    }

    private void startOptimizerProcess(com.facebook.forker.ProcessBuilder r9, java.lang.String r10, com.facebook.common.dextricks.DexStore.OptimizationSession r11, com.facebook.common.dextricks.DexStore.TmpDir r12) {
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
        r2 = 0;
        r0 = r12.directory;	 Catch:{ all -> 0x0088 }
        r8 = com.facebook.common.dextricks.Fs.openUnlinkedTemporaryFile(r0);	 Catch:{ all -> 0x0088 }
        r0 = r8.getFD();	 Catch:{ all -> 0x0086 }
        r0 = com.facebook.forker.Fd.fileno(r0);	 Catch:{ all -> 0x0086 }
        r6 = 1;	 Catch:{ all -> 0x0086 }
        r9.setStream(r6, r0);	 Catch:{ all -> 0x0086 }
        r0 = -5;	 Catch:{ all -> 0x0086 }
        r5 = 2;	 Catch:{ all -> 0x0086 }
        r9.setStream(r5, r0);	 Catch:{ all -> 0x0086 }
        r3 = "starting %s to build %s";	 Catch:{ all -> 0x0086 }
        r1 = new java.lang.Object[r5];	 Catch:{ all -> 0x0086 }
        r7 = 0;	 Catch:{ all -> 0x0086 }
        r1[r7] = r10;	 Catch:{ all -> 0x0086 }
        r0 = "everything.oat";	 Catch:{ all -> 0x0086 }
        r1[r6] = r0;	 Catch:{ all -> 0x0086 }
        com.facebook.common.dextricks.Mlog.m56v(r3, r1);	 Catch:{ all -> 0x0086 }
        r0 = r11.config;	 Catch:{ all -> 0x0086 }
        r0 = r0.prio;	 Catch:{ all -> 0x0086 }
        r3 = r0.with();	 Catch:{ all -> 0x0086 }
        r2 = r9.create();	 Catch:{ Throwable -> 0x0077, all -> 0x0074 }
        if (r3 == 0) goto L_0x0037;	 Catch:{ Throwable -> 0x0077, all -> 0x0074 }
    L_0x0034:
        r3.close();	 Catch:{ all -> 0x0072 }
    L_0x0037:
        r4 = r11.waitForAndManageProcess(r2);	 Catch:{ all -> 0x0072 }
        r3 = com.facebook.common.dextricks.Fs.readProgramOutputFile(r8);	 Catch:{ all -> 0x0072 }
        com.facebook.common.dextricks.Fs.safeClose(r8);
        if (r2 == 0) goto L_0x0047;
    L_0x0044:
        r2.destroy();
    L_0x0047:
        r2 = "%s exited with status %s";
        r1 = new java.lang.Object[r5];
        r1[r7] = r10;
        r0 = java.lang.Integer.valueOf(r4);
        r1[r6] = r0;
        com.facebook.common.dextricks.Mlog.m56v(r2, r1);
        if (r4 != 0) goto L_0x0059;
    L_0x0058:
        return;
    L_0x0059:
        r2 = new java.lang.RuntimeException;
        r0 = 3;
        r1 = new java.lang.Object[r0];
        r1[r7] = r10;
        r0 = com.facebook.forker.Process.describeStatus(r4);
        r1[r6] = r0;
        r1[r5] = r3;
        r0 = "%s failed: %s: %s";
        r0 = java.lang.String.format(r0, r1);
        r2.<init>(r0);
        throw r2;
    L_0x0072:
        r0 = move-exception;
        goto L_0x008a;
    L_0x0074:
        r0 = move-exception;
        r1 = r2;
        goto L_0x007a;
    L_0x0077:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
    L_0x007a:
        if (r3 == 0) goto L_0x0085;
    L_0x007c:
        if (r1 == 0) goto L_0x0082;
    L_0x007e:
        r3.close();	 Catch:{ Throwable -> 0x0085 }
        goto L_0x0085;	 Catch:{ Throwable -> 0x0085 }
    L_0x0082:
        r3.close();	 Catch:{ all -> 0x0086 }
    L_0x0085:
        throw r0;	 Catch:{ all -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        goto L_0x008a;
    L_0x0088:
        r0 = move-exception;
        r8 = r2;
    L_0x008a:
        com.facebook.common.dextricks.Fs.safeClose(r8);
        if (r2 == 0) goto L_0x0092;
    L_0x008f:
        r2.destroy();
    L_0x0092:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.startOptimizerProcess(com.facebook.forker.ProcessBuilder, java.lang.String, com.facebook.common.dextricks.DexStore$OptimizationSession, com.facebook.common.dextricks.DexStore$TmpDir):void");
    }

    private void truncateWithBackup(java.io.File r5, java.io.File r6, int r7) {
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
        if (r7 < 0) goto L_0x003d;
    L_0x0002:
        r0 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = new byte[r0];
        com.facebook.common.dextricks.Fs.renameOrThrow(r5, r6);
        r4 = new java.io.FileOutputStream;
        r4.<init>(r5);
        r3 = 0;
        r2 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x0033 }
        r2.<init>(r6);	 Catch:{ Throwable -> 0x0033 }
        com.facebook.common.dextricks.Fs.copyBytes(r4, r2, r7, r0);	 Catch:{ Throwable -> 0x0022, all -> 0x001f }
        r2.close();	 Catch:{ Throwable -> 0x0033 }
        r4.close();
        goto L_0x003d;
    L_0x001f:
        r0 = move-exception;
        r1 = r3;
        goto L_0x0025;
    L_0x0022:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
    L_0x0025:
        if (r1 == 0) goto L_0x002b;
    L_0x0027:
        r2.close();	 Catch:{ Throwable -> 0x002e }
        goto L_0x002e;	 Catch:{ Throwable -> 0x002e }
    L_0x002b:
        r2.close();	 Catch:{ Throwable -> 0x0033 }
    L_0x002e:
        throw r0;	 Catch:{ Throwable -> 0x0033 }
    L_0x002f:
        r0 = move-exception;
        if (r3 == 0) goto L_0x0039;
    L_0x0032:
        goto L_0x0035;
    L_0x0033:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x002f }
    L_0x0035:
        r4.close();	 Catch:{ Throwable -> 0x003c }
        goto L_0x003c;	 Catch:{ Throwable -> 0x003c }
    L_0x0039:
        r4.close();
    L_0x003c:
        throw r0;
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OdexSchemeArtXdex.truncateWithBackup(java.io.File, java.io.File, int):void");
    }

    public static String vdexNameFromOdexName(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".vdex");
        return stringBuilder.toString();
    }
}
