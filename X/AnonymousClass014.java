package X;

/* renamed from: X.014 */
public final class AnonymousClass014 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass016 f132B;

    public AnonymousClass014(AnonymousClass016 anonymousClass016) {
        this.f132B = anonymousClass016;
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r5.f132B;	 Catch:{ IOException -> 0x0024 }
        r0 = r0.f139C;	 Catch:{ IOException -> 0x0024 }
        r4 = r0.getErrorStream();	 Catch:{ IOException -> 0x0024 }
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ IOException -> 0x0024 }
        r3 = new byte[r0];	 Catch:{ IOException -> 0x0024 }
    L_0x000c:
        r0 = r4.read(r3);	 Catch:{ IOException -> 0x0024 }
        if (r0 < 0) goto L_0x0031;	 Catch:{ IOException -> 0x0024 }
    L_0x0012:
        r2 = r5.f132B;	 Catch:{ IOException -> 0x0024 }
        monitor-enter(r2);	 Catch:{ IOException -> 0x0024 }
        r0 = r5.f132B;	 Catch:{ all -> 0x0021 }
        r1 = r0.f140D;	 Catch:{ all -> 0x0021 }
        r0 = X.AnonymousClass015.f136E;	 Catch:{ all -> 0x0021 }
        if (r1 == r0) goto L_0x001f;	 Catch:{ all -> 0x0021 }
    L_0x001d:
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        goto L_0x0031;	 Catch:{ all -> 0x0021 }
    L_0x001f:
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        goto L_0x000c;	 Catch:{ all -> 0x0021 }
    L_0x0021:
        r0 = move-exception;	 Catch:{ all -> 0x0021 }
        monitor-exit(r2);	 Catch:{ all -> 0x0021 }
        throw r0;	 Catch:{ IOException -> 0x0024 }
    L_0x0024:
        r0 = r5.f132B;
        r0 = r0.f139C;
        r0.destroy();
        r1 = r5.f132B;
        r0 = X.AnonymousClass015.f135D;
        r1.f140D = r0;
    L_0x0031:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.014.run():void");
    }
}
