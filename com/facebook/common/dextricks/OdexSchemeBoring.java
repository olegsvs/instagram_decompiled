package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest.Dex;
import com.facebook.common.dextricks.DexStore.TmpDir;
import com.facebook.common.dextricks.MultiDexClassLoader.Configuration;
import com.facebook.common.dextricks.OdexScheme.Compiler;
import dalvik.system.DexFile;
import java.io.File;

public final class OdexSchemeBoring extends OdexScheme {

    public final class BoringCompiler extends Compiler {
        private final DexStore mDexStore;
        private final int mFlags;
        private final TmpDir mTmpDir;

        public BoringCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("boring-compiler");
        }

        public void close() {
            this.mTmpDir.close();
        }

        public void compile(InputDex inputDex) {
            String makeDexName = OdexSchemeBoring.makeDexName(inputDex.dex);
            String makeOdexName = OdexSchemeBoring.makeOdexName(makeDexName);
            File file = new File(this.mDexStore.root, makeDexName);
            File file2 = new File(this.mDexStore.root, makeOdexName);
            if ((this.mFlags & 1) == 0 || !file.exists() || !file2.exists()) {
                File file3 = new File(this.mTmpDir.directory, makeDexName);
                File file4 = new File(this.mTmpDir.directory, makeOdexName);
                inputDex.extract(file3);
                DexFile.loadDex(file3.getAbsolutePath(), file4.getAbsolutePath(), 0);
                Fs.renameOrThrow(file3, file);
                Fs.renameOrThrow(file4, file2);
            }
        }
    }

    public String getSchemeName() {
        return "OdexSchemeBoring";
    }

    public OdexSchemeBoring(Dex[] dexArr) {
        super(8, makeExpectedFileList(dexArr));
    }

    public void configureClassLoader(File file, Configuration configuration) {
        for (int i = 0; i < this.expectedFiles.length; i += 2) {
            configuration.addDex(new File(file, this.expectedFiles[i]), new File(file, this.expectedFiles[i + 1]));
        }
    }

    public Compiler makeCompiler(DexStore dexStore, int i) {
        return new BoringCompiler(dexStore, i);
    }

    public static String makeDexName(Dex dex) {
        String str;
        StringBuilder stringBuilder;
        if (!dex.assetName.endsWith(".dex.xz")) {
            if (!dex.assetName.endsWith(".dex")) {
                str = ".dex.jar";
                stringBuilder = new StringBuilder();
                stringBuilder.append("prog-");
                stringBuilder.append(dex.hash);
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
        }
        str = ".dex";
        stringBuilder = new StringBuilder();
        stringBuilder.append("prog-");
        stringBuilder.append(dex.hash);
        stringBuilder.append(str);
        return stringBuilder.toString();
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
