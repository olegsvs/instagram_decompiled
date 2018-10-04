package X;

/* renamed from: X.0NL */
public final class AnonymousClass0NL implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0Fb f3549B;

    public AnonymousClass0NL(AnonymousClass0Fb anonymousClass0Fb) {
        this.f3549B = anonymousClass0Fb;
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
        r7 = this;
        r1 = r7.f3549B;
        monitor-enter(r1);
        r4 = r1.f2181B;	 Catch:{ all -> 0x00bc }
        r0 = 0;	 Catch:{ all -> 0x00bc }
        r1.f2181B = r0;	 Catch:{ all -> 0x00bc }
        monitor-exit(r1);
        if (r4 == 0) goto L_0x00bb;
    L_0x000b:
        r0 = r4.isEmpty();
        if (r0 != 0) goto L_0x00bb;
    L_0x0011:
        r7 = r4.iterator();
    L_0x0015:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x00b2;
    L_0x001b:
        r5 = r7.next();
        r5 = (java.lang.String) r5;
        java.net.URI.create(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0078;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0025:
        r6 = move-exception;
        r3 = "viewtag_error";
        r2 = "Failed to sent http request to: %s. %s";
        r0 = 2;
        r1 = new java.lang.Object[r0];
        r0 = 0;
        r1[r0] = r5;
        r0 = 1;
        r1[r0] = r6;
        r0 = X.AnonymousClass0IE.m2137E(r2, r1);
        X.AnonymousClass0Gn.m1876C(r3, r0);
        goto L_0x0015;
    L_0x003b:
        r3 = android.net.Uri.parse(r5);	 Catch:{ Exception -> 0x0025 }
        r2 = new android.net.Uri$Builder;	 Catch:{ Exception -> 0x0025 }
        r2.<init>();	 Catch:{ Exception -> 0x0025 }
        r0 = r3.getScheme();	 Catch:{ Exception -> 0x0025 }
        r1 = r2.scheme(r0);	 Catch:{ Exception -> 0x0025 }
        r0 = r3.getPath();	 Catch:{ Exception -> 0x0025 }
        r1 = r1.path(r0);	 Catch:{ Exception -> 0x0025 }
        r0 = r3.getAuthority();	 Catch:{ Exception -> 0x0025 }
        r1.authority(r0);	 Catch:{ Exception -> 0x0025 }
        r0 = r3.getEncodedQuery();	 Catch:{ Exception -> 0x0025 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x0025 }
        if (r0 != 0) goto L_0x0070;	 Catch:{ Exception -> 0x0025 }
    L_0x0065:
        r0 = r3.getEncodedQuery();	 Catch:{ Exception -> 0x0025 }
        r0 = java.net.URLEncoder.encode(r0);	 Catch:{ Exception -> 0x0025 }
        r2.query(r0);	 Catch:{ Exception -> 0x0025 }
    L_0x0070:
        r0 = r2.build();	 Catch:{ Exception -> 0x0025 }
        r5 = r0.toString();	 Catch:{ Exception -> 0x0025 }
    L_0x0078:
        r0 = X.AnonymousClass0Cd.f1698B;	 Catch:{ Exception -> 0x0025 }
        r0 = r0.m958B();	 Catch:{ Exception -> 0x0025 }
        r1 = new X.0aB;	 Catch:{ Exception -> 0x0025 }
        r0 = X.AnonymousClass0G7.m1739F(r0);	 Catch:{ Exception -> 0x0025 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0025 }
        r0 = X.AnonymousClass0Pu.GET;	 Catch:{ Exception -> 0x0025 }
        r1.f6464D = r0;	 Catch:{ Exception -> 0x0025 }
        r1.f6466F = r5;	 Catch:{ Exception -> 0x0025 }
        r3 = r1.m5435B();	 Catch:{ Exception -> 0x0025 }
        r1 = new X.0gN;	 Catch:{ Exception -> 0x0025 }
        r1.<init>();	 Catch:{ Exception -> 0x0025 }
        r0 = X.AnonymousClass0Qv.Other;	 Catch:{ Exception -> 0x0025 }
        r1.f8152H = r0;	 Catch:{ Exception -> 0x0025 }
        r2 = r1.m6617A();	 Catch:{ Exception -> 0x0025 }
        r1 = X.AnonymousClass0aD.m5438B();	 Catch:{ Exception -> 0x0025 }
        r0 = new X.0aC;	 Catch:{ Exception -> 0x0025 }
        r0.<init>(r3, r2);	 Catch:{ Exception -> 0x0025 }
        r0 = r1.m5439A(r0);	 Catch:{ Exception -> 0x0025 }
        r0 = r0.f6476D;	 Catch:{ Exception -> 0x0025 }
        X.AnonymousClass0Du.m1315C(r0);	 Catch:{ Exception -> 0x0025 }
        goto L_0x0015;	 Catch:{ Exception -> 0x0025 }
    L_0x00b2:
        r0 = 44;
        r0 = X.AnonymousClass0RR.m4156B(r0);
        r0.m4158A(r4);
    L_0x00bb:
        return;
    L_0x00bc:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0NL.run():void");
    }
}
