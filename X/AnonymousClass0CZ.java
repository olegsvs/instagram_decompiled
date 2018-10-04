package X;

import java.util.HashMap;

/* renamed from: X.0CZ */
public final class AnonymousClass0CZ implements AnonymousClass1ls {
    /* renamed from: B */
    public final HashMap f1691B = new HashMap();
    /* renamed from: C */
    private final String f1692C;

    public AnonymousClass0CZ(String str) {
        this.f1692C = str;
    }

    public final android.net.Uri oT(java.io.File r7) {
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
        r6 = this;
        r3 = r7.getCanonicalPath();	 Catch:{ IOException -> 0x00bf }
        r5 = 0;
        r0 = r6.f1691B;
        r0 = r0.entrySet();
        r4 = r0.iterator();
    L_0x000f:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0043;
    L_0x0015:
        r2 = r4.next();
        r2 = (java.util.Map.Entry) r2;
        r0 = r2.getValue();
        r0 = (java.io.File) r0;
        r1 = r0.getPath();
        r0 = r3.startsWith(r1);
        if (r0 == 0) goto L_0x000f;
    L_0x002b:
        if (r5 == 0) goto L_0x0041;
    L_0x002d:
        r1 = r1.length();
        r0 = r5.getValue();
        r0 = (java.io.File) r0;
        r0 = r0.getPath();
        r0 = r0.length();
        if (r1 <= r0) goto L_0x000f;
    L_0x0041:
        r5 = r2;
        goto L_0x000f;
    L_0x0043:
        if (r5 == 0) goto L_0x00a8;
    L_0x0045:
        r0 = r5.getValue();
        r0 = (java.io.File) r0;
        r1 = r0.getPath();
        r0 = "/";
        r0 = r1.endsWith(r0);
        if (r0 == 0) goto L_0x0060;
    L_0x0057:
        r0 = r1.length();
        r2 = r3.substring(r0);
        goto L_0x006a;
    L_0x0060:
        r0 = r1.length();
        r0 = r0 + 1;
        r2 = r3.substring(r0);
    L_0x006a:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r5.getKey();
        r0 = (java.lang.String) r0;
        r0 = android.net.Uri.encode(r0);
        r1.append(r0);
        r0 = 47;
        r1.append(r0);
        r0 = "/";
        r0 = android.net.Uri.encode(r2, r0);
        r1.append(r0);
        r2 = r1.toString();
        r1 = new android.net.Uri$Builder;
        r1.<init>();
        r0 = "content";
        r1 = r1.scheme(r0);
        r0 = r6.f1692C;
        r0 = r1.authority(r0);
        r0 = r0.encodedPath(r2);
        r0 = r0.build();
        return r0;
    L_0x00a8:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Failed to find configured root that contains ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x00bf:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Failed to resolve canonical path for ";
        r1.append(r0);
        r1.append(r7);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0CZ.oT(java.io.File):android.net.Uri");
    }

    public final java.io.File qL(android.net.Uri r6) {
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
        r5 = this;
        r4 = r6.getEncodedPath();
        r3 = 1;
        r0 = 47;
        r1 = r4.indexOf(r0, r3);
        r0 = r4.substring(r3, r1);
        r2 = android.net.Uri.decode(r0);
        r1 = r1 + r3;
        r0 = r4.substring(r1);
        r1 = android.net.Uri.decode(r0);
        r0 = r5.f1691B;
        r0 = r0.get(r2);
        r0 = (java.io.File) r0;
        if (r0 == 0) goto L_0x005d;
    L_0x0026:
        r3 = new java.io.File;
        r3.<init>(r0, r1);
        r2 = r3.getCanonicalFile();	 Catch:{ IOException -> 0x0046 }
        r1 = r2.getPath();
        r0 = r0.getPath();
        r0 = r1.startsWith(r0);
        if (r0 == 0) goto L_0x003e;
    L_0x003d:
        return r2;
    L_0x003e:
        r1 = new java.lang.SecurityException;
        r0 = "Resolved path jumped beyond configured root";
        r1.<init>(r0);
        throw r1;
    L_0x0046:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Failed to resolve canonical path for ";
        r1.append(r0);
        r1.append(r3);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x005d:
        r2 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unable to find configured root for ";
        r1.append(r0);
        r1.append(r6);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.0CZ.qL(android.net.Uri):java.io.File");
    }
}
