package X;

/* renamed from: X.1Vd */
public final class AnonymousClass1Vd {
    /* renamed from: B */
    public static android.content.pm.Signature[] m11692B(java.security.cert.Certificate[] r8) {
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
        r7 = 0;
        if (r8 == 0) goto L_0x0023;
    L_0x0003:
        r0 = r8.length;
        if (r0 <= 0) goto L_0x0023;
    L_0x0006:
        r0 = r8.length;	 Catch:{ CertificateEncodingException -> 0x0022 }
        r6 = new android.content.pm.Signature[r0];	 Catch:{ CertificateEncodingException -> 0x0022 }
        r5 = r8.length;	 Catch:{ CertificateEncodingException -> 0x0022 }
        r4 = 0;	 Catch:{ CertificateEncodingException -> 0x0022 }
        r3 = 0;	 Catch:{ CertificateEncodingException -> 0x0022 }
    L_0x000c:
        if (r4 >= r5) goto L_0x0021;	 Catch:{ CertificateEncodingException -> 0x0022 }
    L_0x000e:
        r0 = r8[r4];	 Catch:{ CertificateEncodingException -> 0x0022 }
        r2 = r3 + 1;	 Catch:{ CertificateEncodingException -> 0x0022 }
        r1 = new android.content.pm.Signature;	 Catch:{ CertificateEncodingException -> 0x0022 }
        r0 = r0.getEncoded();	 Catch:{ CertificateEncodingException -> 0x0022 }
        r1.<init>(r0);	 Catch:{ CertificateEncodingException -> 0x0022 }
        r6[r3] = r1;	 Catch:{ CertificateEncodingException -> 0x0022 }
        r4 = r4 + 1;	 Catch:{ CertificateEncodingException -> 0x0022 }
        r3 = r2;	 Catch:{ CertificateEncodingException -> 0x0022 }
        goto L_0x000c;	 Catch:{ CertificateEncodingException -> 0x0022 }
    L_0x0021:
        return r6;	 Catch:{ CertificateEncodingException -> 0x0022 }
    L_0x0022:
        return r7;
    L_0x0023:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Vd.B(java.security.cert.Certificate[]):android.content.pm.Signature[]");
    }

    /* renamed from: C */
    public static java.lang.String m11693C(android.content.pm.Signature r1) {
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
        if (r1 == 0) goto L_0x0023;
    L_0x0002:
        r0 = r1.toByteArray();
        r1 = new java.io.ByteArrayInputStream;
        r1.<init>(r0);
        r0 = "X.509";	 Catch:{ CertificateException -> 0x0020 }
        r0 = java.security.cert.CertificateFactory.getInstance(r0);	 Catch:{ CertificateException -> 0x0020 }
        r0 = r0.generateCertificate(r1);	 Catch:{ CertificateException -> 0x0020 }
        r0 = (java.security.cert.X509Certificate) r0;	 Catch:{ CertificateException -> 0x0020 }
        r0 = r0.getIssuerDN();	 Catch:{ CertificateException -> 0x0020 }
        r0 = r0.getName();	 Catch:{ CertificateException -> 0x0020 }
        return r0;	 Catch:{ CertificateException -> 0x0020 }
    L_0x0020:
        r0 = "Unknown";
        return r0;
    L_0x0023:
        r0 = "Unknown";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Vd.C(android.content.pm.Signature):java.lang.String");
    }

    /* renamed from: D */
    public static java.security.cert.Certificate[] m11694D(java.util.jar.JarFile r4, java.util.jar.JarEntry r5) {
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
        r3 = 0;
        r2 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0026, IOException -> 0x0026, IOException -> 0x0026, all -> 0x001f }
        r0 = r4.getInputStream(r5);	 Catch:{ IOException -> 0x0026, IOException -> 0x0026, IOException -> 0x0026, all -> 0x001f }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0026, IOException -> 0x0026, IOException -> 0x0026, all -> 0x001f }
    L_0x000a:
        r1 = r2.read();	 Catch:{ IOException -> 0x0027, IOException -> 0x0027, IOException -> 0x0027, all -> 0x001c }
        r0 = -1;	 Catch:{ IOException -> 0x0027, IOException -> 0x0027, IOException -> 0x0027, all -> 0x001c }
        if (r1 == r0) goto L_0x0012;	 Catch:{ IOException -> 0x0027, IOException -> 0x0027, IOException -> 0x0027, all -> 0x001c }
    L_0x0011:
        goto L_0x000a;	 Catch:{ IOException -> 0x0027, IOException -> 0x0027, IOException -> 0x0027, all -> 0x001c }
    L_0x0012:
        if (r5 == 0) goto L_0x0018;	 Catch:{ IOException -> 0x0027, IOException -> 0x0027, IOException -> 0x0027, all -> 0x001c }
    L_0x0014:
        r3 = r5.getCertificates();	 Catch:{ IOException -> 0x0027, IOException -> 0x0027, IOException -> 0x0027, all -> 0x001c }
    L_0x0018:
        r2.close();	 Catch:{ IOException -> 0x001b }
    L_0x001b:
        return r3;
    L_0x001c:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0020;
    L_0x001f:
        r0 = move-exception;
    L_0x0020:
        if (r3 == 0) goto L_0x0025;
    L_0x0022:
        r3.close();	 Catch:{ IOException -> 0x0025 }
    L_0x0025:
        throw r0;
    L_0x0026:
        r2 = r3;
    L_0x0027:
        if (r2 == 0) goto L_0x002c;
    L_0x0029:
        r2.close();	 Catch:{ IOException -> 0x002c }
    L_0x002c:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1Vd.D(java.util.jar.JarFile, java.util.jar.JarEntry):java.security.cert.Certificate[]");
    }
}
