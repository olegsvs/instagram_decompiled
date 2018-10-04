package X;

import java.io.File;

/* renamed from: X.0Mf */
public final class AnonymousClass0Mf {
    /* renamed from: B */
    public AnonymousClass0Mh f3455B;
    /* renamed from: C */
    public File f3456C;

    public AnonymousClass0Mf(File file) {
        this.f3456C = file;
        AnonymousClass0Mh B = AnonymousClass0Mf.m3223B(file);
        if (B == null) {
            B = new AnonymousClass0Mh();
        }
        this.f3455B = B;
    }

    /* renamed from: B */
    private static X.AnonymousClass0Mh m3223B(java.io.File r5) {
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
        r0 = X.AnonymousClass0Mg.parseFromJson(r3);	 Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x0012 }
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
        r1 = "ConfigurationFileStore";	 Catch:{ all -> 0x0021 }
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
        throw new UnsupportedOperationException("Method not decompiled: X.0Mf.B(java.io.File):X.0Mh");
    }
}
