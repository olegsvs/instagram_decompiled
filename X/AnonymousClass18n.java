package X;

/* renamed from: X.18n */
public final class AnonymousClass18n implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass14R f15031B;
    /* renamed from: C */
    public final /* synthetic */ String f15032C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass18j f15033D;
    /* renamed from: E */
    public final /* synthetic */ Throwable f15034E;

    public AnonymousClass18n(AnonymousClass14R anonymousClass14R, AnonymousClass18j anonymousClass18j, String str, Throwable th) {
        this.f15031B = anonymousClass14R;
        this.f15033D = anonymousClass18j;
        this.f15032C = str;
        this.f15034E = th;
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
        r4 = this;
        r3 = r4.f15031B;
        r0 = r4.f15033D;
        r2 = r0.f15019B;
        r1 = r0.f15024G;
        r0 = r0.f15023F;
        r1 = X.AnonymousClass14R.m9184M(r3, r2, r1, r0);
        if (r1 != 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r2 = new java.util.HashMap;	 Catch:{ Throwable -> 0x002b }
        r2.<init>();	 Catch:{ Throwable -> 0x002b }
        r0 = "soft_error_category";	 Catch:{ Throwable -> 0x002b }
        r2.put(r0, r1);	 Catch:{ Throwable -> 0x002b }
        r1 = "soft_error_message";	 Catch:{ Throwable -> 0x002b }
        r0 = r4.f15032C;	 Catch:{ Throwable -> 0x002b }
        r2.put(r1, r0);	 Catch:{ Throwable -> 0x002b }
        r1 = X.AnonymousClass0DE.m1113F();	 Catch:{ Throwable -> 0x002b }
        r0 = r4.f15034E;	 Catch:{ Throwable -> 0x002b }
        r1.m1176Q(r0, r2);	 Catch:{ Throwable -> 0x002b }
    L_0x002b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.18n.run():void");
    }
}
