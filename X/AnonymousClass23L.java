package X;

import java.io.File;
import java.io.InputStream;

/* renamed from: X.23L */
public final class AnonymousClass23L {
    /* renamed from: B */
    public static java.io.InputStream m14293B(java.io.File r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x001d }
        r2.<init>(r3);	 Catch:{ FileNotFoundException -> 0x001d }
        r1 = r3.getName();	 Catch:{ FileNotFoundException -> 0x001d }
        r0 = ".gz";	 Catch:{ FileNotFoundException -> 0x001d }
        r0 = r1.endsWith(r0);	 Catch:{ FileNotFoundException -> 0x001d }
        if (r0 == 0) goto L_0x001c;	 Catch:{ FileNotFoundException -> 0x001d }
    L_0x0011:
        r1 = new java.util.zip.InflaterInputStream;	 Catch:{ FileNotFoundException -> 0x001d }
        r0 = new java.util.zip.Inflater;	 Catch:{ FileNotFoundException -> 0x001d }
        r0.<init>();	 Catch:{ FileNotFoundException -> 0x001d }
        r1.<init>(r2, r0);	 Catch:{ FileNotFoundException -> 0x001d }
        return r1;	 Catch:{ FileNotFoundException -> 0x001d }
    L_0x001c:
        return r2;	 Catch:{ FileNotFoundException -> 0x001d }
    L_0x001d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.23L.B(java.io.File):java.io.InputStream");
    }

    /* renamed from: C */
    public static boolean m14294C(java.io.InputStream r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = X.AnonymousClass0Lm.f3274B;	 Catch:{ JsonParseException -> 0x0017, IOException -> 0x0012 }
        r1 = r0.createParser(r3);	 Catch:{ JsonParseException -> 0x0017, IOException -> 0x0012 }
    L_0x0006:
        r0 = r1.nextToken();	 Catch:{ JsonParseException -> 0x0017, IOException -> 0x0012 }
        if (r0 == 0) goto L_0x0012;	 Catch:{ JsonParseException -> 0x0017, IOException -> 0x0012 }
    L_0x000c:
        goto L_0x0006;	 Catch:{ JsonParseException -> 0x0017, IOException -> 0x0012 }
    L_0x000d:
        r0 = move-exception;
        X.AnonymousClass0Du.C(r3);
        throw r0;
    L_0x0012:
        X.AnonymousClass0Du.C(r3);
        r0 = 1;
        return r0;
    L_0x0017:
        r2 = move-exception;
        r1 = "InvalidRecoveryFileCleaner";	 Catch:{ all -> 0x000d }
        r0 = "Error parsing batch file: ";	 Catch:{ all -> 0x000d }
        X.AnonymousClass0Gn.E(r1, r0, r2);	 Catch:{ all -> 0x000d }
        r0 = 0;
        X.AnonymousClass0Du.C(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.23L.C(java.io.InputStream):boolean");
    }

    /* renamed from: D */
    public static boolean m14295D(java.io.InputStream r5, java.io.File r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r6.length();	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r3 = 8;	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r2 = 0;	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        if (r0 > 0) goto L_0x000f;	 Catch:{ IOException -> 0x0031, all -> 0x002c }
    L_0x000b:
        X.AnonymousClass0Du.C(r5);
        return r2;
    L_0x000f:
        r0 = r6.length();	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r0 = r0 - r3;	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r5.skip(r0);	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r1 = 8;	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r0 = new byte[r1];	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r5.read(r0, r2, r1);	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r1 = new java.lang.String;	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r0 = "\"data\":[";	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        r0 = r0.equals(r1);	 Catch:{ IOException -> 0x0031, all -> 0x002c }
        if (r0 == 0) goto L_0x0031;	 Catch:{ IOException -> 0x0031, all -> 0x002c }
    L_0x002b:
        goto L_0x000b;	 Catch:{ IOException -> 0x0031, all -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        X.AnonymousClass0Du.C(r5);
        throw r0;
    L_0x0031:
        X.AnonymousClass0Du.C(r5);
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.23L.D(java.io.InputStream, java.io.File):boolean");
    }

    /* renamed from: E */
    public static boolean m14296E(File file) {
        file = AnonymousClass23L.m14293B(file);
        return file != null ? AnonymousClass23L.m14294C(file) : null;
    }

    /* renamed from: F */
    public static boolean m14297F(File file) {
        InputStream B = AnonymousClass23L.m14293B(file);
        return B != null ? AnonymousClass23L.m14295D(B, file) : false;
    }
}
