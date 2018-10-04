package X;

/* renamed from: X.1Tx */
public final /* synthetic */ class AnonymousClass1Tx {
    /* renamed from: B */
    public static final /* synthetic */ int[] f19006B = new int[AnonymousClass3AM.values().length];
    /* renamed from: C */
    public static final /* synthetic */ int[] f19007C = new int[AnonymousClass3DU.values().length];

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
        r0 = X.AnonymousClass3AM.values();
        r0 = r0.length;
        r0 = new int[r0];
        f19006B = r0;
        r2 = 1;
        r1 = f19006B;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0 = X.AnonymousClass3AM.f38547V;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
        r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
    L_0x0014:
        r0 = X.AnonymousClass3DU.values();
        r0 = r0.length;
        r0 = new int[r0];
        f19007C = r0;
        r1 = f19007C;	 Catch:{ NoSuchFieldError -> 0x0027 }
        r0 = X.AnonymousClass3DU.f39294S;	 Catch:{ NoSuchFieldError -> 0x0027 }
        r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0027 }
        r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x0027 }
    L_0x0027:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x0032 }
        r0 = X.AnonymousClass3DU.f39293R;	 Catch:{ NoSuchFieldError -> 0x0032 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
        r0 = 2;	 Catch:{ NoSuchFieldError -> 0x0032 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
    L_0x0032:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x003d }
        r0 = X.AnonymousClass3DU.f39300Y;	 Catch:{ NoSuchFieldError -> 0x003d }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x003d }
        r0 = 3;	 Catch:{ NoSuchFieldError -> 0x003d }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x003d }
    L_0x003d:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x0048 }
        r0 = X.AnonymousClass3DU.f39295T;	 Catch:{ NoSuchFieldError -> 0x0048 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
        r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0048 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
    L_0x0048:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x0053 }
        r0 = X.AnonymousClass3DU.f39290O;	 Catch:{ NoSuchFieldError -> 0x0053 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
        r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0053 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
    L_0x0053:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x005e }
        r0 = X.AnonymousClass3DU.f39298W;	 Catch:{ NoSuchFieldError -> 0x005e }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x005e }
        r0 = 6;	 Catch:{ NoSuchFieldError -> 0x005e }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x005e }
    L_0x005e:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x0069 }
        r0 = X.AnonymousClass3DU.f39291P;	 Catch:{ NoSuchFieldError -> 0x0069 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0069 }
        r0 = 7;	 Catch:{ NoSuchFieldError -> 0x0069 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0069 }
    L_0x0069:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x0075 }
        r0 = X.AnonymousClass3DU.f39299X;	 Catch:{ NoSuchFieldError -> 0x0075 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0075 }
        r0 = 8;	 Catch:{ NoSuchFieldError -> 0x0075 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0075 }
    L_0x0075:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x0081 }
        r0 = X.AnonymousClass3DU.f39297V;	 Catch:{ NoSuchFieldError -> 0x0081 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0081 }
        r0 = 9;	 Catch:{ NoSuchFieldError -> 0x0081 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0081 }
    L_0x0081:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x008d }
        r0 = X.AnonymousClass3DU.f39292Q;	 Catch:{ NoSuchFieldError -> 0x008d }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x008d }
        r0 = 10;	 Catch:{ NoSuchFieldError -> 0x008d }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x008d }
    L_0x008d:
        r2 = f19007C;	 Catch:{ NoSuchFieldError -> 0x0099 }
        r0 = X.AnonymousClass3DU.f39296U;	 Catch:{ NoSuchFieldError -> 0x0099 }
        r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0099 }
        r0 = 11;	 Catch:{ NoSuchFieldError -> 0x0099 }
        r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0099 }
    L_0x0099:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Tx.<clinit>():void");
    }
}
