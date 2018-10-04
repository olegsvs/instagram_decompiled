package X;

import com.facebook.common.dextricks.DexStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.3K3 */
public final class AnonymousClass3K3 {
    /* renamed from: B */
    private static final Class f40141B = AnonymousClass3K3.class;

    /* renamed from: B */
    public static java.io.File m19393B(android.content.Context r9, X.AnonymousClass0Cm r10, X.AnonymousClass3K1 r11, java.lang.String r12) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        X.AnonymousClass0LH.E(r11);
        r0 = r11.f40135C;
        X.AnonymousClass0LH.E(r0);
        X.AnonymousClass0LH.E(r12);
        r1 = r11.f40135C;
        r0 = r11.f40134B;
        r7 = X.AnonymousClass3K4.m19396C(r9, r0);
        r8 = 0;
        if (r7 != 0) goto L_0x0022;
    L_0x0016:
        r0 = f40141B;
        r1 = r0.getName();
        r0 = "downloadFile: Unable to access file dir";
        X.AnonymousClass0Gn.C(r1, r0);
        return r8;
    L_0x0022:
        r0 = r7.exists();
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r7.delete();
    L_0x002b:
        r3 = new X.0aB;	 Catch:{ IOException -> 0x00c5 }
        r0 = X.AnonymousClass0G7.E(r10);	 Catch:{ IOException -> 0x00c5 }
        r3.<init>(r0);	 Catch:{ IOException -> 0x00c5 }
        r3.f6466F = r1;	 Catch:{ IOException -> 0x00c5 }
        r0 = X.AnonymousClass0Pu.GET;	 Catch:{ IOException -> 0x00c5 }
        r3.f6464D = r0;	 Catch:{ IOException -> 0x00c5 }
        r2 = "Authorization";	 Catch:{ IOException -> 0x00c5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00c5 }
        r1.<init>();	 Catch:{ IOException -> 0x00c5 }
        r0 = "OAuth ";	 Catch:{ IOException -> 0x00c5 }
        r1.append(r0);	 Catch:{ IOException -> 0x00c5 }
        r1.append(r12);	 Catch:{ IOException -> 0x00c5 }
        r0 = r1.toString();	 Catch:{ IOException -> 0x00c5 }
        r0 = r3.A(r2, r0);	 Catch:{ IOException -> 0x00c5 }
        r3 = r0.B();	 Catch:{ IOException -> 0x00c5 }
        r2 = X.AnonymousClass0aD.B();	 Catch:{ IOException -> 0x00c5 }
        r1 = new X.0aC;	 Catch:{ IOException -> 0x00c5 }
        r0 = "selfUpdateDownload";	 Catch:{ IOException -> 0x00c5 }
        r1.<init>(r3, r0);	 Catch:{ IOException -> 0x00c5 }
        r2 = r2.A(r1);	 Catch:{ IOException -> 0x00c5 }
        r0 = r2.f6476D;	 Catch:{ IOException -> 0x00c5 }
        if (r0 == 0) goto L_0x00b9;	 Catch:{ IOException -> 0x00c5 }
    L_0x0068:
        r1 = r2.f6477E;	 Catch:{ IOException -> 0x00c5 }
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x00c5 }
        if (r1 < r0) goto L_0x00b9;	 Catch:{ IOException -> 0x00c5 }
    L_0x006e:
        r1 = r2.f6477E;	 Catch:{ IOException -> 0x00c5 }
        r0 = 300; // 0x12c float:4.2E-43 double:1.48E-321;	 Catch:{ IOException -> 0x00c5 }
        if (r1 < r0) goto L_0x0075;	 Catch:{ IOException -> 0x00c5 }
    L_0x0074:
        goto L_0x00b9;	 Catch:{ IOException -> 0x00c5 }
    L_0x0075:
        r0 = r2.f6476D;	 Catch:{ IOException -> 0x00c5 }
        X.AnonymousClass3K3.m19394C(r0, r7);	 Catch:{ IOException -> 0x00c5 }
        r6 = 0;	 Catch:{ IOException -> 0x00c5 }
        r3 = new java.util.jar.JarFile;	 Catch:{ IOException -> 0x00a0 }
        r3.<init>(r7);	 Catch:{ IOException -> 0x00a0 }
        r0 = 0;	 Catch:{ IOException -> 0x00a0 }
        r2 = new X.3Jy;	 Catch:{ Throwable -> 0x0096 }
        r2.<init>(r9);	 Catch:{ Throwable -> 0x0096 }
        r1 = "application/vnd.android.package-archive";	 Catch:{ Throwable -> 0x0096 }
        r5 = r2.m19388A(r3, r1);	 Catch:{ Throwable -> 0x0096 }
        r3.close();	 Catch:{ IOException -> 0x0090 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0090 }
    L_0x0090:
        r4 = move-exception;
        goto L_0x00a2;
    L_0x0092:
        r1 = move-exception;
        if (r0 == 0) goto L_0x009c;
    L_0x0095:
        goto L_0x0098;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0092 }
    L_0x0098:
        r3.close();	 Catch:{ Throwable -> 0x009f }
        goto L_0x009f;	 Catch:{ Throwable -> 0x009f }
    L_0x009c:
        r3.close();	 Catch:{ IOException -> 0x00a0 }
    L_0x009f:
        throw r1;	 Catch:{ IOException -> 0x00a0 }
    L_0x00a0:
        r4 = move-exception;
        r5 = 0;
    L_0x00a2:
        r3 = X.AnonymousClass3K4.f40142B;
        r2 = "isFileValid(): Failed to read JarFile %s";
        r0 = 1;
        r1 = new java.lang.Object[r0];
        r0 = r7.getPath();
        r1[r6] = r0;
        X.AnonymousClass0Dc.E(r3, r4, r2, r1);
    L_0x00b2:
        if (r5 == 0) goto L_0x00b5;
    L_0x00b4:
        return r7;
    L_0x00b5:
        r7.delete();
        return r8;
    L_0x00b9:
        r0 = f40141B;	 Catch:{ IOException -> 0x00c5 }
        r1 = r0.getName();	 Catch:{ IOException -> 0x00c5 }
        r0 = "downloadFile: Failed to download due to bad http response";	 Catch:{ IOException -> 0x00c5 }
        X.AnonymousClass0Gn.C(r1, r0);	 Catch:{ IOException -> 0x00c5 }
        return r8;	 Catch:{ IOException -> 0x00c5 }
    L_0x00c5:
        r1 = move-exception;
        r0 = f40141B;
        r0 = r0.getName();
        X.AnonymousClass0Gn.G(r0, r1);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.3K3.B(android.content.Context, X.0Cm, X.3K1, java.lang.String):java.io.File");
    }

    /* renamed from: C */
    private static void m19394C(AnonymousClass0aF anonymousClass0aF, File file) {
        try {
            InputStream UJ = anonymousClass0aF.UJ();
            if (UJ == null) {
                AnonymousClass0Gn.C(f40141B.getName(), "createFileFromStream(): input stream was null");
            } else if (anonymousClass0aF.MF() <= 2147483647L) {
                byte[] bArr = new byte[DexStore.LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED];
                OutputStream fileOutputStream = new FileOutputStream(file);
                while (true) {
                    int read = UJ.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
            } else {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
            AnonymousClass0Du.C(anonymousClass0aF);
        } catch (Throwable th) {
            AnonymousClass0Du.C(anonymousClass0aF);
        }
    }
}
