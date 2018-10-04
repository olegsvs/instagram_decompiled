package X;

/* renamed from: X.45H */
public final class AnonymousClass45H extends AnonymousClass43r {
    public AnonymousClass45H(long j) {
        super(j);
    }

    /* renamed from: A */
    public final int mo5342A(AnonymousClass2tZ anonymousClass2tZ, AnonymousClass2tZ anonymousClass2tZ2) {
        long B = AnonymousClass45H.m22782B(anonymousClass2tZ.f35457D);
        long B2 = AnonymousClass45H.m22782B(anonymousClass2tZ2.f35457D);
        if (B == -1 && B2 == -1) {
            return super.mo5342A(anonymousClass2tZ, anonymousClass2tZ2);
        }
        return B <= B2 ? -1 : 1;
    }

    /* renamed from: B */
    private static long m22782B(java.lang.String r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = -1;
        if (r8 != 0) goto L_0x0005;
    L_0x0004:
        return r6;
    L_0x0005:
        r0 = "video-";
        r1 = r8.lastIndexOf(r0);
        if (r1 >= 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0004;
    L_0x000e:
        r0 = 46;
        r1 = r1 + 6;
        r0 = r8.indexOf(r0, r1);
        if (r0 >= 0) goto L_0x0019;
    L_0x0018:
        goto L_0x0004;
    L_0x0019:
        r1 = r8.substring(r1, r0);
        r0 = X.AnonymousClass0Ip.B(r1);
        if (r0 != 0) goto L_0x0004;
    L_0x0023:
        r0 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0039 }
        r4 = (long) r0;	 Catch:{ NumberFormatException -> 0x0039 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ NumberFormatException -> 0x0039 }
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ NumberFormatException -> 0x0039 }
        r2 = r2 / r0;	 Catch:{ NumberFormatException -> 0x0039 }
        r2 = r2 - r4;	 Catch:{ NumberFormatException -> 0x0039 }
        r0 = 172800; // 0x2a300 float:2.42144E-40 double:8.53745E-319;	 Catch:{ NumberFormatException -> 0x0039 }
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0039 }
        if (r0 >= 0) goto L_0x0004;	 Catch:{ NumberFormatException -> 0x0039 }
    L_0x0037:
        r6 = r4;	 Catch:{ NumberFormatException -> 0x0039 }
        goto L_0x0004;	 Catch:{ NumberFormatException -> 0x0039 }
    L_0x0039:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.45H.B(java.lang.String):long");
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return mo5342A((AnonymousClass2tZ) obj, (AnonymousClass2tZ) obj2);
    }
}
