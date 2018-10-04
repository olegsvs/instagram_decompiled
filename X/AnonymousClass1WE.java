package X;

/* renamed from: X.1WE */
public enum AnonymousClass1WE {
    SECONDS_SINCE_LAST_IMPRESSION,
    OTHER_PROMOTION_EVENT,
    INSTAGRAM_PUSH_ENABLED,
    IG_WIFI_CONNECTED,
    INSTAGRAM_DIRECTAPP_INSTALLED,
    INSTAGRAM_USER_HAS_MULTIPLE_ACCOUNTS_LOGGED_IN,
    INSTAGRAM_FACEBOOK_APP_INSTALLED,
    UNKNOWN;

    /* renamed from: B */
    public static X.AnonymousClass1WE m11725B(java.lang.String r1) {
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
        if (r1 == 0) goto L_0x000d;
    L_0x0002:
        r0 = java.util.Locale.US;	 Catch:{ IllegalArgumentException -> 0x000d }
        r0 = r1.toUpperCase(r0);	 Catch:{ IllegalArgumentException -> 0x000d }
        r0 = X.AnonymousClass1WE.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x000d }
        return r0;	 Catch:{ IllegalArgumentException -> 0x000d }
    L_0x000d:
        r0 = UNKNOWN;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1WE.B(java.lang.String):X.1WE");
    }
}
