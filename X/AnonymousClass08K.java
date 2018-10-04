package X;

/* renamed from: X.08K */
public final /* synthetic */ class AnonymousClass08K {
    /* renamed from: B */
    public static final /* synthetic */ int[] f888B = new int[AnonymousClass086.values().length];

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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/107041335.run(Unknown Source)
*/
        /*
        r0 = X.AnonymousClass086.values();
        r0 = r0.length;
        r0 = new int[r0];
        f888B = r0;
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0 = X.AnonymousClass086.CONNACK;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
    L_0x0014:
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x001f }
        r0 = X.AnonymousClass086.SUBSCRIBE;	 Catch:{ NoSuchFieldError -> 0x001f }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
        r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
    L_0x001f:
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x002a }
        r0 = X.AnonymousClass086.SUBACK;	 Catch:{ NoSuchFieldError -> 0x002a }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
        r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
    L_0x002a:
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r0 = X.AnonymousClass086.UNSUBSCRIBE;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
        r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0035 }
    L_0x0035:
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r0 = X.AnonymousClass086.UNSUBACK;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
        r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0040 }
    L_0x0040:
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x004b }
        r0 = X.AnonymousClass086.PUBLISH;	 Catch:{ NoSuchFieldError -> 0x004b }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
        r0 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x004b }
    L_0x004b:
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r0 = X.AnonymousClass086.PUBACK;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
        r0 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0056 }
    L_0x0056:
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r0 = X.AnonymousClass086.PINGREQ;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
        r0 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0062 }
    L_0x0062:
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x006e }
        r0 = X.AnonymousClass086.PINGRESP;	 Catch:{ NoSuchFieldError -> 0x006e }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
        r0 = 9;	 Catch:{ NoSuchFieldError -> 0x006e }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x006e }
    L_0x006e:
        r2 = f888B;	 Catch:{ NoSuchFieldError -> 0x007a }
        r0 = X.AnonymousClass086.CONNECT;	 Catch:{ NoSuchFieldError -> 0x007a }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
        r0 = 10;	 Catch:{ NoSuchFieldError -> 0x007a }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x007a }
    L_0x007a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.08K.<clinit>():void");
    }
}
