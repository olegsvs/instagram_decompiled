package X;

/* renamed from: X.2QD */
public final class AnonymousClass2QD {
    /* renamed from: B */
    private AnonymousClass2Q6 f30307B;
    /* renamed from: C */
    private AnonymousClass1tb f30308C;
    /* renamed from: D */
    private AnonymousClass1td f30309D;
    /* renamed from: E */
    private AnonymousClass1tW f30310E;

    public AnonymousClass2QD(AnonymousClass2Q6 anonymousClass2Q6, AnonymousClass1tb anonymousClass1tb, AnonymousClass1tW anonymousClass1tW, AnonymousClass1td anonymousClass1td) {
        this.f30307B = anonymousClass2Q6;
        this.f30308C = anonymousClass1tb;
        this.f30310E = anonymousClass1tW;
        this.f30309D = anonymousClass1td;
    }

    /* renamed from: A */
    public final X.AnonymousClass1tS m15660A(X.AnonymousClass1tX r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = 0;
        r4 = r11;	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
        if (r1 == 0) goto L_0x010d;	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
    L_0x0006:
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
        r0 = X.AnonymousClass2QI.parseFromJson(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
        if (r0 == 0) goto L_0x0101;	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
    L_0x000e:
        r1 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x0101;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0012:
        r1 = r0.f23823G;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x0101;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0016:
        r2 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = "single-context-buckets-table";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r2.equals(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x0032;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0020:
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r5 = X.AnonymousClass2QZ.parseFromJson(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3 = new X.2dM;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r6 = r10.f30307B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r7 = r10.f30308C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r8 = r10.f30309D;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0031:
        return r3;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0032:
        r2 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = "multi-output-single-context-table";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r2.equals(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x004e;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x003c:
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r5 = X.AnonymousClass2QR.parseFromJson(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3 = new X.2dM;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r6 = r10.f30307B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r7 = r10.f30308C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r8 = r10.f30309D;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        goto L_0x0031;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x004e:
        r2 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = "resolved";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r2.equals(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x0066;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0058:
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3 = X.AnonymousClass2QX.parseFromJson(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r2 = new X.2dL;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r10.f30309D;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r2.<init>(r11, r3, r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        return r2;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0066:
        r2 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = "multi-output-resolved";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r2.equals(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x0082;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0070:
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r5 = X.AnonymousClass2QP.parseFromJson(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3 = new X.2dK;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r6 = r10.f30307B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r7 = r10.f30308C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r8 = r10.f30309D;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        goto L_0x0031;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0082:
        r2 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = "multi-context-buckets-table";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r2.equals(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x009e;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x008c:
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r5 = X.AnonymousClass2QN.parseFromJson(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3 = new X.2dM;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r6 = r10.f30307B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r7 = r10.f30308C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r8 = r10.f30309D;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        goto L_0x0031;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x009e:
        r2 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = "table";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r2.equals(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x00bb;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x00a8:
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r5 = X.AnonymousClass2Qc.parseFromJson(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3 = new X.2dM;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r6 = r10.f30307B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r7 = r10.f30308C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r8 = r10.f30309D;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        goto L_0x0031;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x00bb:
        r2 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = "dense";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r2.equals(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x00d8;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x00c5:
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r5 = X.AnonymousClass2QL.parseFromJson(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3 = new X.2dJ;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r6 = r10.f30307B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r7 = r10.f30308C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r8 = r10.f30309D;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        goto L_0x0031;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x00d8:
        r2 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = "compute";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r2.equals(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        if (r1 == 0) goto L_0x00f7;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x00e2:
        r1 = r11.f23798B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r5 = X.AnonymousClass2QH.parseFromJson(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3 = new X.2dI;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r6 = r10.f30307B;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r7 = r10.f30308C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r8 = r10.f30310E;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r9 = r10.f30309D;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        goto L_0x0031;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x00f7:
        r3 = new X.1tc;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r2 = "Unknown config type";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = r0.f23819C;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3.<init>(r2, r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0100:
        throw r3;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0101:
        r3 = new X.1tc;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r1 = "Can't identify config";	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        r3.<init>(r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
        goto L_0x0100;	 Catch:{ IOException -> 0x0133, 1tc -> 0x010b, IndexOutOfBoundsException -> 0x0109 }
    L_0x0109:
        r1 = move-exception;
        goto L_0x011a;
    L_0x010b:
        r1 = move-exception;
        goto L_0x0127;
    L_0x010d:
        r3 = new X.1tc;	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
        r2 = "Config not found";	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
        r1 = r11.m13622A();	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
        r3.<init>(r2, r1);	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
        throw r3;	 Catch:{ IOException -> 0x0133, 1tc -> 0x0126, IndexOutOfBoundsException -> 0x0119 }
    L_0x0119:
        r1 = move-exception;
    L_0x011a:
        r3 = new X.2Q8;
        r2 = r1.getMessage();
        r1 = r10.f30309D;
        r3.<init>(r11, r0, r2, r1);
        return r3;
    L_0x0126:
        r1 = move-exception;
    L_0x0127:
        r3 = new X.2Q8;
        r2 = r1.getMessage();
        r1 = r10.f30309D;
        r3.<init>(r11, r0, r2, r1);
        return r3;
    L_0x0133:
        r3 = new X.2Q8;
        r2 = "Can't read config";
        r1 = r10.f30309D;
        r3.<init>(r11, r0, r2, r1);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.2QD.A(X.1tX):X.1tS");
    }
}
