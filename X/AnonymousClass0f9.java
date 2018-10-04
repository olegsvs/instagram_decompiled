package X;

import java.util.List;

/* renamed from: X.0f9 */
public final class AnonymousClass0f9 implements AnonymousClass0GC {
    /* renamed from: B */
    private final AnonymousClass0fB f7859B;

    public AnonymousClass0f9(AnonymousClass0Cm anonymousClass0Cm) {
        this.f7859B = AnonymousClass0fB.m6495C(anonymousClass0Cm);
    }

    public final void Hx(List list, boolean z, String str, boolean z2) {
        this.f7859B.m6504I(list, z, str, z2);
    }

    public final void JW() {
        this.f7859B.m6500E();
    }

    public final void Jx() {
        this.f7859B.m6503H();
    }

    public final int MU() {
        return this.f7859B.f7861B.m6510B().size();
    }

    public final String PR() {
        return this.f7859B.m6496A();
    }

    public final String QR() {
        return this.f7859B.m6497B();
    }

    public final boolean aW() {
        return this.f7859B.m6501F();
    }

    public final String jT() {
        return this.f7859B.m6498C();
    }

    public final java.lang.String tR(java.lang.String r1) {
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
        r0 = this;
        r0 = r0.f7859B;
        r0 = r0.f7861B;
        r0 = r0.f7870E;
        r1 = r0.get(r1);
        r1 = (X.AnonymousClass0fD) r1;
        r0 = 0;
        if (r1 == 0) goto L_0x0015;
    L_0x000f:
        r0 = X.AnonymousClass0fE.m6517C(r1);	 Catch:{ IOException -> 0x0014 }
        return r0;	 Catch:{ IOException -> 0x0014 }
    L_0x0014:
        return r0;
    L_0x0015:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0f9.tR(java.lang.String):java.lang.String");
    }
}
