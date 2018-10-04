package X;

import java.util.List;

/* renamed from: X.0f8 */
public final class AnonymousClass0f8 implements AnonymousClass0GC {
    /* renamed from: B */
    private final AnonymousClass0y1 f7858B;

    public final void JW() {
    }

    public final void Jx() {
    }

    public final String QR() {
        return null;
    }

    public final boolean aW() {
        return false;
    }

    public final String jT() {
        return null;
    }

    public AnonymousClass0f8(AnonymousClass0Cm anonymousClass0Cm) {
        this(AnonymousClass0y1.m8612C(anonymousClass0Cm));
    }

    public AnonymousClass0f8(AnonymousClass0y1 anonymousClass0y1) {
        this.f7858B = anonymousClass0y1;
    }

    public final void Hx(List list, boolean z, String str, boolean z2) {
        for (AnonymousClass0fD anonymousClass0fD : this.f7858B.m8614B()) {
            if (!anonymousClass0fD.m6513A()) {
                AnonymousClass0y1 anonymousClass0y1 = this.f7858B;
                AnonymousClass0y1.m8611B(anonymousClass0y1);
                if (anonymousClass0y1.f12704B.remove(anonymousClass0fD.f7875D) != null) {
                    anonymousClass0y1.f12707E.yKA();
                }
            }
        }
    }

    public final int MU() {
        return this.f7858B.m8614B().size();
    }

    public final java.lang.String PR() {
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
        r4 = this;
        r0 = r4.f7858B;
        r1 = r0.m8614B();
        r0 = r1.isEmpty();
        if (r0 == 0) goto L_0x000f;
    L_0x000c:
        r0 = "[]";
        return r0;
    L_0x000f:
        r4 = new java.io.StringWriter;
        r4.<init>();
        r3 = 0;
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ IOException -> 0x0048 }
        r3 = r0.createGenerator(r4);	 Catch:{ IOException -> 0x0048 }
        r3.writeStartArray();	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        r2 = r1.iterator();	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
    L_0x0022:
        r0 = r2.hasNext();	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        if (r0 == 0) goto L_0x0036;	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
    L_0x0028:
        r1 = r2.next();	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        r1 = (X.AnonymousClass0fD) r1;	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        r0 = 1;	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        X.AnonymousClass0fE.m6518D(r3, r1, r0);	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        r0 = 0;	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        r1.f7873B = r0;	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        goto L_0x0022;	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
    L_0x0036:
        r3.writeEndArray();	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        r3.flush();	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        r0 = r4.toString();	 Catch:{ IOException -> 0x0048, all -> 0x0044 }
        X.AnonymousClass0Du.m1315C(r3);
        return r0;
    L_0x0044:
        r0 = move-exception;
        goto L_0x004e;
    L_0x0046:
        r0 = move-exception;
        goto L_0x004e;
    L_0x0048:
        r0 = "invalid";	 Catch:{ all -> 0x0046 }
        X.AnonymousClass0Du.m1315C(r3);
        return r0;
    L_0x004e:
        X.AnonymousClass0Du.m1315C(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0f8.PR():java.lang.String");
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
        r0 = r0.f7858B;
        r1 = r0.m8613A(r1);
        r0 = 0;
        if (r1 == 0) goto L_0x000f;
    L_0x0009:
        r0 = X.AnonymousClass0fE.m6517C(r1);	 Catch:{ IOException -> 0x000e }
        return r0;	 Catch:{ IOException -> 0x000e }
    L_0x000e:
        return r0;
    L_0x000f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0f8.tR(java.lang.String):java.lang.String");
    }
}
