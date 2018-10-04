package X;

/* renamed from: X.3Id */
public final class AnonymousClass3Id {
    /* renamed from: B */
    private static final Class f39959B = AnonymousClass3Id.class;

    /* renamed from: B */
    public static boolean m19302B(AnonymousClass0OA anonymousClass0OA) {
        Object obj = anonymousClass0OA.AD != 0 ? 1 : null;
        boolean z = anonymousClass0OA.JB;
        boolean z2 = anonymousClass0OA.bC.f17213J;
        boolean z3 = anonymousClass0OA.hB;
        if (obj != null || z || z2) {
            return true;
        }
        if (z3) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static boolean m19303C(AnonymousClass0OA anonymousClass0OA, int i, int i2, int i3, int i4, boolean z) {
        Object obj;
        Object obj2 = anonymousClass0OA.AD != i ? 1 : null;
        Object obj3 = anonymousClass0OA.f3815c != i2 ? 1 : null;
        AnonymousClass1Km anonymousClass1Km = anonymousClass0OA.bC;
        if (i3 == anonymousClass1Km.f17220Q) {
            if (i4 == anonymousClass1Km.f17209F) {
                obj = null;
                Object obj4 = anonymousClass0OA.hB == z ? 1 : null;
                if (obj2 == null || obj3 != null || r1 != null) {
                    return true;
                }
                if (obj4 != null) {
                    return true;
                }
                return false;
            }
        }
        obj = 1;
        if (anonymousClass0OA.hB == z) {
        }
        return obj2 == null ? true : true;
    }

    /* renamed from: D */
    public static void m19304D(android.content.Context r5, X.AnonymousClass0OA r6, java.io.File r7, int r8, int r9, int r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r6 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r6 = r6.bC;
        r1 = new java.io.File;
        r0 = r6.f17222S;
        r1.<init>(r0);
        r5 = new android.media.MediaMetadataRetriever;
        r5.<init>();
        r0 = r1.getAbsolutePath();	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r5.setDataSource(r0);	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r1 = 0;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r0 = 2;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r4 = r5.getFrameAtTime(r1, r0);	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        if (r4 != 0) goto L_0x0025;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
    L_0x0021:
        r5.release();
        return;
    L_0x0025:
        r0 = X.AnonymousClass3Zn.m20047C(r6);	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r3 = 0;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        if (r0 != 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
    L_0x002c:
        r1 = r6.f17207D;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r0 = -1;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        if (r1 == r0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
    L_0x0031:
        r1 = r6.f17207D;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r0 = new android.hardware.Camera$CameraInfo;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        android.hardware.Camera.getCameraInfo(r1, r0);	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r2 = r0.orientation;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r1 = r0.facing;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r0 = 1;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        if (r1 != r0) goto L_0x0045;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
    L_0x0042:
        r3 = 1;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        goto L_0x0045;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
    L_0x0044:
        r2 = 0;	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
    L_0x0045:
        r2 = X.AnonymousClass0rm.K(r4, r8, r9, r2, r3);	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r4.recycle();	 Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
        r5.release();
        r4 = 0;
        r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0066 }
        r1.<init>(r7);	 Catch:{ FileNotFoundException -> 0x0066 }
        r0 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ FileNotFoundException -> 0x0061, all -> 0x005e }
        r2.compress(r0, r10, r1);	 Catch:{ FileNotFoundException -> 0x0061, all -> 0x005e }
        X.AnonymousClass0Du.C(r1);
        goto L_0x0002;
    L_0x005e:
        r0 = move-exception;
        r4 = r1;
        goto L_0x0075;
    L_0x0061:
        r3 = move-exception;
        r4 = r1;
        goto L_0x0067;
    L_0x0064:
        r0 = move-exception;
        goto L_0x0075;
    L_0x0066:
        r3 = move-exception;
    L_0x0067:
        r2 = f39959B;	 Catch:{ all -> 0x0064 }
        r1 = "Unable to save initial frame to file.";	 Catch:{ all -> 0x0064 }
        r0 = 0;	 Catch:{ all -> 0x0064 }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0064 }
        X.AnonymousClass0Dc.E(r2, r3, r1, r0);	 Catch:{ all -> 0x0064 }
        X.AnonymousClass0Du.C(r4);
        goto L_0x0002;
    L_0x0075:
        X.AnonymousClass0Du.C(r4);
        throw r0;
    L_0x0079:
        r0 = move-exception;
        r5.release();
        throw r0;
    L_0x007e:
        r5.release();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3Id.D(android.content.Context, X.0OA, java.io.File, int, int, int):void");
    }

    /* renamed from: E */
    public static void m19305E(AnonymousClass0OA anonymousClass0OA, int i, int i2, int i3, int i4, boolean z) {
        anonymousClass0OA.AD = i;
        anonymousClass0OA.f3815c = i2;
        anonymousClass0OA.bC.f17220Q = i3;
        anonymousClass0OA.bC.f17209F = i4;
        anonymousClass0OA.hB = z;
    }
}
