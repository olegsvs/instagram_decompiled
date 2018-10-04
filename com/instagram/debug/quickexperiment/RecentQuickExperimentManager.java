package com.instagram.debug.quickexperiment;

import X.AnonymousClass0CE;
import X.AnonymousClass0Dc;
import X.AnonymousClass0FZ;
import java.util.List;

public class RecentQuickExperimentManager {
    private static final int NUM_RECENT_EXPERIMENTS = 5;
    private static final Class TAG = RecentQuickExperimentManager.class;

    public static java.util.List getRecentExperimentParameters() {
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
        r0 = X.AnonymousClass0FZ.m1634B();
        r2 = r0.f2177B;
        r1 = "recent_qe";
        r0 = 0;
        r0 = r2.getString(r1, r0);
        r0 = com.instagram.debug.quickexperiment.RecentExperimentsStorageModel__JsonHelper.parseFromJson(r0);	 Catch:{ IOException -> 0x0016, IOException -> 0x0016 }
        r0 = r0.getRecentExperimentParameters();	 Catch:{ IOException -> 0x0016, IOException -> 0x0016 }
        goto L_0x001b;	 Catch:{ IOException -> 0x0016, IOException -> 0x0016 }
    L_0x0016:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x001b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.RecentQuickExperimentManager.getRecentExperimentParameters():java.util.List");
    }

    public static void markRecentExperimentParameter(AnonymousClass0CE anonymousClass0CE) {
        List recentExperimentParameters = getRecentExperimentParameters();
        recentExperimentParameters.remove(anonymousClass0CE);
        if (recentExperimentParameters.size() == 5) {
            recentExperimentParameters.remove(4);
        }
        recentExperimentParameters.add(0, anonymousClass0CE);
        save(recentExperimentParameters);
    }

    private static void save(List list) {
        RecentExperimentsStorageModel recentExperimentsStorageModel = new RecentExperimentsStorageModel(list);
        try {
            AnonymousClass0FZ B = AnonymousClass0FZ.m1634B();
            B.f2177B.edit().putString("recent_qe", RecentExperimentsStorageModel__JsonHelper.serializeToJson(recentExperimentsStorageModel)).apply();
        } catch (List list2) {
            AnonymousClass0Dc.m1240C(TAG, "failed to save Recent Experiments json", list2);
        }
    }
}
