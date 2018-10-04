package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.0fG */
public final class AnonymousClass0fG implements Runnable {
    /* renamed from: B */
    public final CountDownLatch f7883B = new CountDownLatch(1);
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0fC f7884C;
    /* renamed from: D */
    private final String f7885D;

    public AnonymousClass0fG(AnonymousClass0fC anonymousClass0fC, String str) {
        this.f7884C = anonymousClass0fC;
        this.f7885D = str;
    }

    public final void run() {
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
        r5 = this;
        r1 = "initFeedSeenState";
        r0 = 1752537193; // 0x68759869 float:4.639165E24 double:8.6586842E-315;
        X.AnonymousClass0CN.m901B(r1, r0);
        r0 = r5.f7885D;	 Catch:{ all -> 0x00c9 }
        r4 = X.AnonymousClass0Ma.m3206B(r0);	 Catch:{ all -> 0x00c9 }
        r0 = r5.f7884C;	 Catch:{ all -> 0x00c9 }
        r0 = r0.f7869D;	 Catch:{ all -> 0x00c9 }
        r3 = 1;	 Catch:{ all -> 0x00c9 }
        if (r0 != 0) goto L_0x0017;	 Catch:{ all -> 0x00c9 }
    L_0x0015:
        r0 = 1;	 Catch:{ all -> 0x00c9 }
        goto L_0x0018;	 Catch:{ all -> 0x00c9 }
    L_0x0017:
        r0 = 0;	 Catch:{ all -> 0x00c9 }
    L_0x0018:
        X.AnonymousClass0LH.m2924B(r0);	 Catch:{ all -> 0x00c9 }
        r0 = r5.f7884C;	 Catch:{ all -> 0x00c9 }
        r0.f7869D = r4;	 Catch:{ all -> 0x00c9 }
        r2 = "seen_state_background_succeed";	 Catch:{ all -> 0x00c9 }
        r1 = 0;	 Catch:{ all -> 0x00c9 }
        monitor-enter(r4);	 Catch:{ all -> 0x00c9 }
        r0 = r4.f3446E;	 Catch:{ all -> 0x00d1 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x00d1 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x00d1 }
        if (r0 == 0) goto L_0x0031;	 Catch:{ all -> 0x00d1 }
    L_0x002d:
        r1 = r0.booleanValue();	 Catch:{ all -> 0x00d1 }
    L_0x0031:
        monitor-exit(r4);	 Catch:{ all -> 0x00c9 }
        r0 = r5.f7884C;	 Catch:{ all -> 0x00c9 }
        r0 = r0.m6511C();	 Catch:{ all -> 0x00c9 }
        r0 = r0.size();	 Catch:{ all -> 0x00c9 }
        java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00c9 }
        r0 = r5.f7884C;	 Catch:{ all -> 0x00c9 }
        r0 = r0.m6512D();	 Catch:{ all -> 0x00c9 }
        r0 = r0.size();	 Catch:{ all -> 0x00c9 }
        java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00c9 }
        if (r1 != 0) goto L_0x0084;	 Catch:{ all -> 0x00c9 }
    L_0x004e:
        r0 = r5.f7884C;	 Catch:{ all -> 0x00c9 }
        r0 = r0.f7868C;	 Catch:{ all -> 0x00c9 }
        r0.set(r3);	 Catch:{ all -> 0x00c9 }
        r3 = r5.f7884C;	 Catch:{ all -> 0x00c9 }
        r2 = new java.util.HashSet;	 Catch:{ all -> 0x00c9 }
        r2.<init>();	 Catch:{ all -> 0x00c9 }
        X.AnonymousClass0fC.m6505B(r3);	 Catch:{ all -> 0x00c9 }
        r1 = r3.f7869D;	 Catch:{ all -> 0x00c9 }
        r0 = "seen_ids";	 Catch:{ all -> 0x00c9 }
        r1.m3214G(r0, r2);	 Catch:{ all -> 0x00c9 }
        r2 = new java.util.HashSet;	 Catch:{ all -> 0x00c9 }
        r2.<init>();	 Catch:{ all -> 0x00c9 }
        X.AnonymousClass0fC.m6505B(r3);	 Catch:{ all -> 0x00c9 }
        r1 = r3.f7869D;	 Catch:{ all -> 0x00c9 }
        r0 = "unseen_ids";	 Catch:{ all -> 0x00c9 }
        r1.m3214G(r0, r2);	 Catch:{ all -> 0x00c9 }
        r2 = r3.f7869D;	 Catch:{ all -> 0x00c9 }
        r0 = 1;	 Catch:{ all -> 0x00c9 }
        r1 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x00c9 }
        r0 = new java.util.HashSet;	 Catch:{ all -> 0x00c9 }
        r0.<init>();	 Catch:{ all -> 0x00c9 }
        X.AnonymousClass0fC.m6506C(r2, r1, r0);	 Catch:{ all -> 0x00c9 }
    L_0x0084:
        r0 = r5.f7884C;	 Catch:{ all -> 0x00c9 }
        r0 = r0.f7871F;	 Catch:{ all -> 0x00c9 }
        if (r0 == 0) goto L_0x00bd;	 Catch:{ all -> 0x00c9 }
    L_0x008a:
        r1 = "seen_state_view_infos";	 Catch:{ all -> 0x00c9 }
        r0 = new java.util.HashSet;	 Catch:{ all -> 0x00c9 }
        r0.<init>();	 Catch:{ all -> 0x00c9 }
        r0 = r4.m3212E(r1, r0);	 Catch:{ all -> 0x00c9 }
        r3 = r0.iterator();	 Catch:{ IOException -> 0x00b3 }
    L_0x0099:
        r0 = r3.hasNext();	 Catch:{ IOException -> 0x00b3 }
        if (r0 == 0) goto L_0x00bd;	 Catch:{ IOException -> 0x00b3 }
    L_0x009f:
        r0 = r3.next();	 Catch:{ IOException -> 0x00b3 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x00b3 }
        r2 = X.AnonymousClass0fE.parseFromJson(r0);	 Catch:{ IOException -> 0x00b3 }
        r0 = r5.f7884C;	 Catch:{ IOException -> 0x00b3 }
        r1 = r0.f7870E;	 Catch:{ IOException -> 0x00b3 }
        r0 = r2.f7875D;	 Catch:{ IOException -> 0x00b3 }
        r1.put(r0, r2);	 Catch:{ IOException -> 0x00b3 }
        goto L_0x0099;	 Catch:{ IOException -> 0x00b3 }
    L_0x00b3:
        r1 = "seen_state_view_infos";	 Catch:{ all -> 0x00c9 }
        r0 = new java.util.HashSet;	 Catch:{ all -> 0x00c9 }
        r0.<init>();	 Catch:{ all -> 0x00c9 }
        r4.m3214G(r1, r0);	 Catch:{ all -> 0x00c9 }
    L_0x00bd:
        r0 = r5.f7883B;	 Catch:{ all -> 0x00c9 }
        r0.countDown();	 Catch:{ all -> 0x00c9 }
        r0 = -43221428; // 0xfffffffffd6c7e4c float:-1.9647099E37 double:NaN;
        X.AnonymousClass0CN.m902C(r0);
        return;
    L_0x00c9:
        r1 = move-exception;
        r0 = -1618367141; // 0xffffffff9f89ad5b float:-5.830855E-20 double:NaN;
        X.AnonymousClass0CN.m902C(r0);
        throw r1;
    L_0x00d1:
        r0 = move-exception;	 Catch:{ all -> 0x00c9 }
        monitor-exit(r4);	 Catch:{ all -> 0x00c9 }
        throw r0;	 Catch:{ all -> 0x00c9 }
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0fG.run():void");
    }
}
