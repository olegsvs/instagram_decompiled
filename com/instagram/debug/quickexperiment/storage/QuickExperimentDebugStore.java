package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass0Du;
import X.AnonymousClass0Gn;
import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonEncoding;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class QuickExperimentDebugStore {
    private File mFile;
    private QuickExperimentDebugStoreModel mModel;

    public QuickExperimentDebugStore(File file, QuickExperimentDebugStoreModel quickExperimentDebugStoreModel) {
        this.mFile = file;
        this.mModel = quickExperimentDebugStoreModel;
    }

    public void clearAllTrackedParameters() {
        this.mModel.clearAllTrackedParameters();
        persist();
    }

    public static QuickExperimentDebugStore create(File file) {
        QuickExperimentDebugStoreModel fromFile = fromFile(file);
        if (fromFile == null) {
            fromFile = new QuickExperimentDebugStoreModel();
        }
        return new QuickExperimentDebugStore(file, fromFile);
    }

    private static com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel fromFile(java.io.File r5) {
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
        r0 = com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel__JsonHelper.parseFromJson(r3);	 Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x0012 }
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
        r1 = "QuickExperimentDebugStore";	 Catch:{ all -> 0x0021 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore.fromFile(java.io.File):com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreModel");
    }

    public String getOverriddenParameter(String str, String str2) {
        return this.mModel.getOverriddenParameter(str, str2);
    }

    public boolean isParameterTracked(String str, String str2) {
        return this.mModel.isParameterTracked(str, str2);
    }

    public synchronized void persist() {
        Throwable e;
        Throwable th;
        Closeable closeable = null;
        try {
            closeable = AnonymousClass0Lm.f3274B.createGenerator(this.mFile, JsonEncoding.UTF8);
            try {
                QuickExperimentDebugStoreModel__JsonHelper.serializeToJson(closeable, this.mModel, true);
            } catch (IOException e2) {
                e = e2;
                try {
                    AnonymousClass0Gn.m1878E("QuickExperimentDebugStore", "Error while writing to cache file", e);
                    AnonymousClass0Du.m1315C(closeable);
                } catch (Throwable th2) {
                    th = th2;
                    AnonymousClass0Du.m1315C(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                AnonymousClass0Du.m1315C(closeable);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            AnonymousClass0Gn.m1878E("QuickExperimentDebugStore", "Error while writing to cache file", e);
            AnonymousClass0Du.m1315C(closeable);
        }
        AnonymousClass0Du.m1315C(closeable);
    }

    public void putOverriddenParameter(String str, String str2, String str3) {
        this.mModel.putOverriddenParameter(str, str2, str3);
    }

    public void putOverriddenParameterAndPersist(String str, String str2, String str3) {
        this.mModel.putOverriddenParameter(str, str2, str3);
        persist();
    }

    public void removeAll() {
        this.mModel.removeAll();
    }

    public String removeOverriddenParameter(String str, String str2) {
        return this.mModel.removeOverriddenParameter(str, str2);
    }

    public String removeOverriddenParameterAndPersist(String str, String str2) {
        String removeOverriddenParameter = this.mModel.removeOverriddenParameter(str, str2);
        if (removeOverriddenParameter != null) {
            persist();
        }
        return removeOverriddenParameter;
    }

    public boolean removeTrackedParameterAndPersist(String str, String str2) {
        boolean removeTrackedParameter = this.mModel.removeTrackedParameter(str, str2);
        if (removeTrackedParameter) {
            persist();
        }
        return removeTrackedParameter;
    }

    public void trackParameterAndPersist(String str, String str2) {
        this.mModel.trackParameter(str, str2);
        persist();
    }
}
