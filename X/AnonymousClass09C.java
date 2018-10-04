package X;

/* renamed from: X.09C */
public final class AnonymousClass09C implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0D3 f1050B;
    /* renamed from: C */
    public final /* synthetic */ long f1051C;

    public AnonymousClass09C(AnonymousClass0D3 anonymousClass0D3, long j) {
        this.f1050B = anonymousClass0D3;
        this.f1051C = j;
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
        r0 = r5.f1050B;
        r4 = r0.f1803D;
        monitor-enter(r4);
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x002c }
        r0 = 23;	 Catch:{ all -> 0x002c }
        if (r1 >= r0) goto L_0x0018;	 Catch:{ all -> 0x002c }
    L_0x000b:
        r0 = X.AnonymousClass0D3.f1800E;	 Catch:{ all -> 0x002c }
        r2 = r0.lastModified();	 Catch:{ all -> 0x002c }
        r0 = r5.f1051C;	 Catch:{ all -> 0x002c }
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ all -> 0x002c }
        if (r0 != 0) goto L_0x0025;	 Catch:{ all -> 0x002c }
    L_0x0017:
        goto L_0x000b;	 Catch:{ all -> 0x002c }
    L_0x0018:
        r0 = 100;	 Catch:{ all -> 0x002c }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x001e }
        goto L_0x0025;	 Catch:{ InterruptedException -> 0x001e }
    L_0x001e:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x002c }
        r0.interrupt();	 Catch:{ all -> 0x002c }
    L_0x0025:
        r0 = r5.f1050B;	 Catch:{ all -> 0x002c }
        r0.m1094A();	 Catch:{ all -> 0x002c }
        monitor-exit(r4);	 Catch:{ all -> 0x002c }
        return;	 Catch:{ all -> 0x002c }
    L_0x002c:
        r0 = move-exception;	 Catch:{ all -> 0x002c }
        monitor-exit(r4);	 Catch:{ all -> 0x002c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.09C.run():void");
    }
}
