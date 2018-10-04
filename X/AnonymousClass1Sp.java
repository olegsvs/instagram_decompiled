package X;

/* renamed from: X.1Sp */
public final /* synthetic */ class AnonymousClass1Sp {
    /* renamed from: B */
    public static final /* synthetic */ int[] f18834B = new int[AnonymousClass0W9.values().length];
    /* renamed from: C */
    public static final /* synthetic */ int[] f18835C = new int[AnonymousClass1i0.values().length];
    /* renamed from: D */
    public static final /* synthetic */ int[] f18836D = new int[AnonymousClass0V0.values().length];

    static {
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
        r0 = X.AnonymousClass1i0.values();
        r0 = r0.length;
        r0 = new int[r0];
        f18835C = r0;
        r6 = 1;
        r1 = f18835C;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0 = X.AnonymousClass1i0.RAVEN_OPENED;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
        r1[r0] = r6;	 Catch:{ NoSuchFieldError -> 0x0014 }
    L_0x0014:
        r5 = 2;
        r1 = f18835C;	 Catch:{ NoSuchFieldError -> 0x001f }
        r0 = X.AnonymousClass1i0.RAVEN_REPLAYED;	 Catch:{ NoSuchFieldError -> 0x001f }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
        r1[r0] = r5;	 Catch:{ NoSuchFieldError -> 0x001f }
    L_0x001f:
        r4 = 3;
        r1 = f18835C;	 Catch:{ NoSuchFieldError -> 0x002a }
        r0 = X.AnonymousClass1i0.RAVEN_SCREENSHOT;	 Catch:{ NoSuchFieldError -> 0x002a }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
        r1[r0] = r4;	 Catch:{ NoSuchFieldError -> 0x002a }
    L_0x002a:
        r0 = X.AnonymousClass0V0.values();
        r0 = r0.length;
        r0 = new int[r0];
        f18836D = r0;
        r1 = f18836D;	 Catch:{ NoSuchFieldError -> 0x003d }
        r0 = X.AnonymousClass0V0.PLACEHOLDER;	 Catch:{ NoSuchFieldError -> 0x003d }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x003d }
        r1[r0] = r6;	 Catch:{ NoSuchFieldError -> 0x003d }
    L_0x003d:
        r1 = f18836D;	 Catch:{ NoSuchFieldError -> 0x0047 }
        r0 = X.AnonymousClass0V0.TEXT;	 Catch:{ NoSuchFieldError -> 0x0047 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
        r1[r0] = r5;	 Catch:{ NoSuchFieldError -> 0x0047 }
    L_0x0047:
        r1 = f18836D;	 Catch:{ NoSuchFieldError -> 0x0051 }
        r0 = X.AnonymousClass0V0.EXPIRING_MEDIA;	 Catch:{ NoSuchFieldError -> 0x0051 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0051 }
        r1[r0] = r4;	 Catch:{ NoSuchFieldError -> 0x0051 }
    L_0x0051:
        r3 = 4;
        r1 = f18836D;	 Catch:{ NoSuchFieldError -> 0x005c }
        r0 = X.AnonymousClass0V0.MEDIA;	 Catch:{ NoSuchFieldError -> 0x005c }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
        r1[r0] = r3;	 Catch:{ NoSuchFieldError -> 0x005c }
    L_0x005c:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x0067 }
        r0 = X.AnonymousClass0V0.MEDIA_SHARE;	 Catch:{ NoSuchFieldError -> 0x0067 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0067 }
        r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0067 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0067 }
    L_0x0067:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x0072 }
        r0 = X.AnonymousClass0V0.LINK;	 Catch:{ NoSuchFieldError -> 0x0072 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0072 }
        r0 = 6;	 Catch:{ NoSuchFieldError -> 0x0072 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0072 }
    L_0x0072:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x007d }
        r0 = X.AnonymousClass0V0.REEL_SHARE;	 Catch:{ NoSuchFieldError -> 0x007d }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x007d }
        r0 = 7;	 Catch:{ NoSuchFieldError -> 0x007d }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x007d }
    L_0x007d:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x0089 }
        r0 = X.AnonymousClass0V0.STORY_SHARE;	 Catch:{ NoSuchFieldError -> 0x0089 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0089 }
        r0 = 8;	 Catch:{ NoSuchFieldError -> 0x0089 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0089 }
    L_0x0089:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x0095 }
        r0 = X.AnonymousClass0V0.LIVE_VIDEO_SHARE;	 Catch:{ NoSuchFieldError -> 0x0095 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0095 }
        r0 = 9;	 Catch:{ NoSuchFieldError -> 0x0095 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0095 }
    L_0x0095:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x00a1 }
        r0 = X.AnonymousClass0V0.ANIMATED_MEDIA;	 Catch:{ NoSuchFieldError -> 0x00a1 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a1 }
        r0 = 10;	 Catch:{ NoSuchFieldError -> 0x00a1 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00a1 }
    L_0x00a1:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x00ad }
        r0 = X.AnonymousClass0V0.VOICE_MEDIA;	 Catch:{ NoSuchFieldError -> 0x00ad }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ad }
        r0 = 11;	 Catch:{ NoSuchFieldError -> 0x00ad }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00ad }
    L_0x00ad:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x00b9 }
        r0 = X.AnonymousClass0V0.FELIX_SHARE;	 Catch:{ NoSuchFieldError -> 0x00b9 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b9 }
        r0 = 12;	 Catch:{ NoSuchFieldError -> 0x00b9 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00b9 }
    L_0x00b9:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x00c5 }
        r0 = X.AnonymousClass0V0.LIVE_VIEWER_INVITE;	 Catch:{ NoSuchFieldError -> 0x00c5 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c5 }
        r0 = 13;	 Catch:{ NoSuchFieldError -> 0x00c5 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00c5 }
    L_0x00c5:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x00d1 }
        r0 = X.AnonymousClass0V0.PROFILE;	 Catch:{ NoSuchFieldError -> 0x00d1 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00d1 }
        r0 = 14;	 Catch:{ NoSuchFieldError -> 0x00d1 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00d1 }
    L_0x00d1:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x00dd }
        r0 = X.AnonymousClass0V0.HASHTAG;	 Catch:{ NoSuchFieldError -> 0x00dd }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00dd }
        r0 = 15;	 Catch:{ NoSuchFieldError -> 0x00dd }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00dd }
    L_0x00dd:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x00e9 }
        r0 = X.AnonymousClass0V0.LOCATION;	 Catch:{ NoSuchFieldError -> 0x00e9 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00e9 }
        r0 = 16;	 Catch:{ NoSuchFieldError -> 0x00e9 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00e9 }
    L_0x00e9:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x00f5 }
        r0 = X.AnonymousClass0V0.LIKE;	 Catch:{ NoSuchFieldError -> 0x00f5 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00f5 }
        r0 = 17;	 Catch:{ NoSuchFieldError -> 0x00f5 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00f5 }
    L_0x00f5:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x0101 }
        r0 = X.AnonymousClass0V0.SHOPPING_PRODUCT;	 Catch:{ NoSuchFieldError -> 0x0101 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0101 }
        r0 = 18;	 Catch:{ NoSuchFieldError -> 0x0101 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0101 }
    L_0x0101:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x010d }
        r0 = X.AnonymousClass0V0.ACTION_LOG;	 Catch:{ NoSuchFieldError -> 0x010d }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x010d }
        r0 = 19;	 Catch:{ NoSuchFieldError -> 0x010d }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x010d }
    L_0x010d:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x0119 }
        r0 = X.AnonymousClass0V0.VIDEO_CALL_EVENT;	 Catch:{ NoSuchFieldError -> 0x0119 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0119 }
        r0 = 20;	 Catch:{ NoSuchFieldError -> 0x0119 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0119 }
    L_0x0119:
        r2 = f18836D;	 Catch:{ NoSuchFieldError -> 0x0125 }
        r0 = X.AnonymousClass0V0.CTA_LINK;	 Catch:{ NoSuchFieldError -> 0x0125 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0125 }
        r0 = 21;	 Catch:{ NoSuchFieldError -> 0x0125 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0125 }
    L_0x0125:
        r0 = X.AnonymousClass0W9.values();
        r0 = r0.length;
        r0 = new int[r0];
        f18834B = r0;
        r1 = f18834B;	 Catch:{ NoSuchFieldError -> 0x0138 }
        r0 = X.AnonymousClass0W9.VIDEO_CALL_STARTED;	 Catch:{ NoSuchFieldError -> 0x0138 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0138 }
        r1[r0] = r6;	 Catch:{ NoSuchFieldError -> 0x0138 }
    L_0x0138:
        r1 = f18834B;	 Catch:{ NoSuchFieldError -> 0x0142 }
        r0 = X.AnonymousClass0W9.VIDEO_CALL_ENDED;	 Catch:{ NoSuchFieldError -> 0x0142 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0142 }
        r1[r0] = r5;	 Catch:{ NoSuchFieldError -> 0x0142 }
    L_0x0142:
        r1 = f18834B;	 Catch:{ NoSuchFieldError -> 0x014c }
        r0 = X.AnonymousClass0W9.USER_JOINED;	 Catch:{ NoSuchFieldError -> 0x014c }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x014c }
        r1[r0] = r4;	 Catch:{ NoSuchFieldError -> 0x014c }
    L_0x014c:
        r1 = f18834B;	 Catch:{ NoSuchFieldError -> 0x0156 }
        r0 = X.AnonymousClass0W9.USER_LEFT;	 Catch:{ NoSuchFieldError -> 0x0156 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0156 }
        r1[r0] = r3;	 Catch:{ NoSuchFieldError -> 0x0156 }
    L_0x0156:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Sp.<clinit>():void");
    }
}
