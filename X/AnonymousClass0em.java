package X;

import android.content.Context;

/* renamed from: X.0em */
public final class AnonymousClass0em {
    /* renamed from: B */
    public AnonymousClass0Ks f7839B;
    /* renamed from: C */
    public AnonymousClass0eo f7840C;
    /* renamed from: D */
    private String f7841D;
    /* renamed from: E */
    private Context f7842E;
    /* renamed from: F */
    private AnonymousClass0To f7843F;

    public AnonymousClass0em(Context context, String str, AnonymousClass0eo anonymousClass0eo) {
        this.f7842E = context;
        this.f7840C = anonymousClass0eo;
        this.f7841D = str;
        AnonymousClass0Kq B = AnonymousClass0Kq.m2860B();
        B.f3132F = this.f7841D;
        this.f7839B = B.m2861A();
    }

    /* renamed from: A */
    public final java.lang.Object m6427A(java.lang.String r6, boolean r7) {
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
        if (r7 != 0) goto L_0x0005;
    L_0x0002:
        X.AnonymousClass0Sy.m4433B();
    L_0x0005:
        r4 = new X.0es;
        r4.<init>(r5);
        r2 = new X.0eu;
        r2.<init>(r5, r6, r4);
        r1 = r5.f7839B;
        r0 = 1229573238; // 0x4949cc76 float:826567.4 double:6.07489896E-315;
        X.AnonymousClass0GG.m1763B(r1, r2, r0);
        r3 = r4.f7847B;	 Catch:{ InterruptedException -> 0x0020 }
        r1 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;	 Catch:{ InterruptedException -> 0x0020 }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0020 }
        r3.await(r1, r0);	 Catch:{ InterruptedException -> 0x0020 }
    L_0x0020:
        r0 = r4.f7848C;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0em.A(java.lang.String, boolean):java.lang.Object");
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0To m6426B(AnonymousClass0em anonymousClass0em) {
        AnonymousClass0To anonymousClass0To;
        synchronized (anonymousClass0em) {
            if (anonymousClass0em.f7843F == null) {
                AnonymousClass1dd B = new AnonymousClass1dd().m12229B(AnonymousClass0Gq.m1903B(anonymousClass0em.f7842E, anonymousClass0em.f7841D, false));
                B.f20780E = 5242880;
                AnonymousClass0Kq B2 = AnonymousClass0Kq.m2860B();
                B2.f3132F = AnonymousClass0em.class.getName();
                B.f20778C = B2.m2861A();
                anonymousClass0em.f7843F = B.m12228A();
            }
            anonymousClass0To = anonymousClass0em.f7843F;
        }
        return anonymousClass0To;
    }

    /* renamed from: B */
    public final void m6428B(String str) {
        AnonymousClass0GG.m1763B(this.f7839B, new AnonymousClass0fM(this, str), 2064082667);
    }

    /* renamed from: C */
    public final void m6429C(String str, Object obj) {
        AnonymousClass0GG.m1763B(this.f7839B, new AnonymousClass1Ef(this, str, obj), -1458796786);
    }

    /* renamed from: D */
    public final void m6430D(String str, Object obj) {
        AnonymousClass0Sy.m4433B();
        new AnonymousClass1Ef(this, str, obj).run();
    }
}
