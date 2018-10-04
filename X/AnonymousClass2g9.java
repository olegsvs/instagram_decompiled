package X;

/* renamed from: X.2g9 */
public final class AnonymousClass2g9 implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2gB f32315B;

    public AnonymousClass2g9(AnonymousClass2gB anonymousClass2gB) {
        this.f32315B = anonymousClass2gB;
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
        r2 = this;
        r0 = r2.f32315B;	 Catch:{ Exception -> 0x0023 }
        r0 = r0.f32325G;	 Catch:{ Exception -> 0x0023 }
        r1 = 0;	 Catch:{ Exception -> 0x0023 }
        if (r0 == 0) goto L_0x0012;	 Catch:{ Exception -> 0x0023 }
    L_0x0007:
        r0 = r2.f32315B;	 Catch:{ Exception -> 0x0023 }
        r0 = r0.f32325G;	 Catch:{ Exception -> 0x0023 }
        r0.release();	 Catch:{ Exception -> 0x0023 }
        r0 = r2.f32315B;	 Catch:{ Exception -> 0x0023 }
        r0.f32325G = r1;	 Catch:{ Exception -> 0x0023 }
    L_0x0012:
        r0 = r2.f32315B;	 Catch:{ Exception -> 0x0023 }
        r0 = r0.f32326H;	 Catch:{ Exception -> 0x0023 }
        if (r0 == 0) goto L_0x0023;	 Catch:{ Exception -> 0x0023 }
    L_0x0018:
        r0 = r2.f32315B;	 Catch:{ Exception -> 0x0023 }
        r0 = r0.f32326H;	 Catch:{ Exception -> 0x0023 }
        r0.release();	 Catch:{ Exception -> 0x0023 }
        r0 = r2.f32315B;	 Catch:{ Exception -> 0x0023 }
        r0.f32326H = r1;	 Catch:{ Exception -> 0x0023 }
    L_0x0023:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2g9.run():void");
    }
}
