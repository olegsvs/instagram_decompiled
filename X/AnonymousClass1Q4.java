package X;

/* renamed from: X.1Q4 */
public final class AnonymousClass1Q4 {
    private AnonymousClass1Q4() {
    }

    /* renamed from: B */
    public static boolean m11325B(android.content.Context r3) {
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
        r2 = 0;
        r1 = r3.getContentResolver();	 Catch:{ SettingNotFoundException -> 0x000c }
        r0 = "location_mode";	 Catch:{ SettingNotFoundException -> 0x000c }
        r0 = android.provider.Settings.Secure.getInt(r1, r0);	 Catch:{ SettingNotFoundException -> 0x000c }
        goto L_0x000d;	 Catch:{ SettingNotFoundException -> 0x000c }
    L_0x000c:
        r0 = 0;
    L_0x000d:
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        r2 = 1;
    L_0x0010:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Q4.B(android.content.Context):boolean");
    }
}
