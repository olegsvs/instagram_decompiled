package X;

/* renamed from: X.09J */
public final class AnonymousClass09J {
    /* renamed from: B */
    private static Boolean f1059B;

    private AnonymousClass09J() {
    }

    /* renamed from: B */
    public static synchronized boolean m586B(android.content.Context r3) {
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
        r2 = X.AnonymousClass09J.class;
        monitor-enter(r2);
        r0 = f1059B;	 Catch:{ all -> 0x002a }
        if (r0 != 0) goto L_0x0022;	 Catch:{ all -> 0x002a }
    L_0x0007:
        r0 = 0;	 Catch:{ all -> 0x002a }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IOException -> 0x0022 }
        f1059B = r0;	 Catch:{ IOException -> 0x0022 }
        r1 = r3.getAssets();	 Catch:{ IOException -> 0x0022 }
        r0 = "app_modules.json";	 Catch:{ IOException -> 0x0022 }
        r0 = r1.open(r0);	 Catch:{ IOException -> 0x0022 }
        r0.close();	 Catch:{ IOException -> 0x0022 }
        r0 = 1;	 Catch:{ IOException -> 0x0022 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IOException -> 0x0022 }
        f1059B = r0;	 Catch:{ IOException -> 0x0022 }
    L_0x0022:
        r0 = f1059B;	 Catch:{ all -> 0x002a }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x002a }
        monitor-exit(r2);
        return r0;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.09J.B(android.content.Context):boolean");
    }
}
