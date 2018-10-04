package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass0Dc;
import X.AnonymousClass0Du;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonEncoding;
import com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStoreModel.ExperimentModel;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class QuickExperimentBisectStore {
    private static final String TAG = "QuickExperimentBisectStore";
    private static QuickExperimentBisectStore sBisectStore;
    private File mFile;
    private QuickExperimentBisectStoreModel mModel;

    public QuickExperimentBisectStore(File file, QuickExperimentBisectStoreModel quickExperimentBisectStoreModel) {
        this.mFile = file;
        this.mModel = quickExperimentBisectStoreModel;
    }

    public void clear() {
        this.mModel.clear();
    }

    public static QuickExperimentBisectStore create(File file) {
        QuickExperimentBisectStoreModel fromFile = fromFile(file);
        if (fromFile == null) {
            fromFile = new QuickExperimentBisectStoreModel();
        }
        return new QuickExperimentBisectStore(file, fromFile);
    }

    private static com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStoreModel fromFile(java.io.File r5) {
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
        r4 = 0;
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ FileNotFoundException -> 0x0026, IOException -> 0x0017, all -> 0x0014 }
        r3 = r0.createParser(r5);	 Catch:{ FileNotFoundException -> 0x0026, IOException -> 0x0017, all -> 0x0014 }
        r3.nextToken();	 Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x0012 }
        r0 = com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStoreModel__JsonHelper.parseFromJson(r3);	 Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x0012 }
        X.AnonymousClass0Du.m1315C(r3);
        return r0;
    L_0x0012:
        r2 = move-exception;
        goto L_0x0019;
    L_0x0014:
        r0 = move-exception;
        r3 = r4;
        goto L_0x0022;
    L_0x0017:
        r2 = move-exception;
        r3 = r4;
    L_0x0019:
        r1 = "QuickExperimentBisectStore";	 Catch:{ all -> 0x0021 }
        r0 = "Error while reading file - not loading cache";	 Catch:{ all -> 0x0021 }
        X.AnonymousClass0Gn.m1878E(r1, r0, r2);	 Catch:{ all -> 0x0021 }
        goto L_0x0027;	 Catch:{ all -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
    L_0x0022:
        X.AnonymousClass0Du.m1315C(r3);
        throw r0;
    L_0x0026:
        r3 = r4;
    L_0x0027:
        X.AnonymousClass0Du.m1315C(r3);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStore.fromFile(java.io.File):com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStoreModel");
    }

    public static synchronized QuickExperimentBisectStore getBisectStore(File file) {
        QuickExperimentBisectStore quickExperimentBisectStore;
        synchronized (QuickExperimentBisectStore.class) {
            if (sBisectStore == null) {
                sBisectStore = create(new File(file, "qe_user_bisect"));
            }
            quickExperimentBisectStore = sBisectStore;
        }
        return quickExperimentBisectStore;
    }

    public String getExperimentStringByIndex(int i) {
        try {
            return ((ExperimentModel) this.mModel.mBisectExperiments.get(i)).toString();
        } catch (Throwable e) {
            AnonymousClass0Dc.m1246I(TAG, e, "Could not get experiment at index: %d", Integer.valueOf(i));
            return "Bisect in error state, please restart.";
        }
    }

    public String getParameter(String str, String str2) {
        return this.mModel.getParameter(str, str2);
    }

    public int getQeCount() {
        return this.mModel.getUniverseCount();
    }

    public Integer getUniverseIndex(String str) {
        try {
            return this.mModel.getUniverseIndex(str);
        } catch (String str2) {
            AnonymousClass0Dc.m1244G(TAG, "Auto-unboxing error", str2);
            return null;
        }
    }

    public synchronized void persist() {
        Throwable e;
        Throwable th;
        Closeable createGenerator;
        this.mModel.generateOrdering();
        try {
            createGenerator = AnonymousClass0Lm.f3274B.createGenerator(this.mFile, JsonEncoding.UTF8);
            try {
                QuickExperimentBisectStoreModel__JsonHelper.serializeToJson(createGenerator, this.mModel, true);
            } catch (IOException e2) {
                e = e2;
                try {
                    AnonymousClass0Gn.m1878E(TAG, "Error while writing to cache file", e);
                    AnonymousClass0Du.m1315C(createGenerator);
                } catch (Throwable th2) {
                    th = th2;
                    AnonymousClass0Du.m1315C(createGenerator);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                AnonymousClass0Du.m1315C(createGenerator);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            AnonymousClass0Gn.m1878E(TAG, "Error while writing to cache file", e);
            AnonymousClass0Du.m1315C(createGenerator);
        }
        AnonymousClass0Du.m1315C(createGenerator);
    }

    public void putParameters(String str, HashMap hashMap) {
        this.mModel.putQuickExperiment(str, hashMap);
    }
}
