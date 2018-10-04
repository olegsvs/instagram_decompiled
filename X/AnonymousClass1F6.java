package X;

import android.content.Context;

/* renamed from: X.1F6 */
public final class AnonymousClass1F6 {
    /* renamed from: B */
    public Context f15976B;

    public AnonymousClass1F6(Context context) {
        this.f15976B = context;
    }

    /* renamed from: A */
    public final boolean m10289A(int r6, java.lang.String r7) {
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
        r0 = X.AnonymousClass1F0.m10277F();
        r4 = 1;
        r3 = 0;
        if (r0 == 0) goto L_0x0017;
    L_0x0008:
        r1 = r5.f15976B;	 Catch:{ SecurityException -> 0x0016 }
        r0 = "appops";	 Catch:{ SecurityException -> 0x0016 }
        r0 = r1.getSystemService(r0);	 Catch:{ SecurityException -> 0x0016 }
        r0 = (android.app.AppOpsManager) r0;	 Catch:{ SecurityException -> 0x0016 }
        r0.checkPackage(r6, r7);	 Catch:{ SecurityException -> 0x0016 }
    L_0x0015:
        return r4;	 Catch:{ SecurityException -> 0x0016 }
    L_0x0016:
        return r3;
    L_0x0017:
        r0 = r5.f15976B;
        r0 = r0.getPackageManager();
        r2 = r0.getPackagesForUid(r6);
        if (r7 == 0) goto L_0x0035;
    L_0x0023:
        if (r2 == 0) goto L_0x0035;
    L_0x0025:
        r1 = 0;
    L_0x0026:
        r0 = r2.length;
        if (r1 >= r0) goto L_0x0035;
    L_0x0029:
        r0 = r2[r1];
        r0 = r7.equals(r0);
        if (r0 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0015;
    L_0x0032:
        r1 = r1 + 1;
        goto L_0x0026;
    L_0x0035:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1F6.A(int, java.lang.String):boolean");
    }
}
