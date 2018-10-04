package X;

import java.lang.ref.SoftReference;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.1xA */
public final class AnonymousClass1xA {
    /* renamed from: C */
    private static final Class f24600C = AnonymousClass1xA.class;
    /* renamed from: B */
    private SoftReference f24601B = new SoftReference(null);

    /* renamed from: A */
    public final synchronized X509Certificate[] m13916A() {
        X509Certificate[] x509CertificateArr;
        x509CertificateArr = (X509Certificate[]) this.f24601B.get();
        if (x509CertificateArr == null) {
            X509TrustManager B = m13917B();
            if (B == null) {
                x509CertificateArr = new X509Certificate[0];
            } else {
                x509CertificateArr = B.getAcceptedIssuers();
                this.f24601B = new SoftReference(x509CertificateArr);
            }
        }
        return x509CertificateArr;
    }

    /* renamed from: B */
    public final synchronized X509TrustManager m13917B() {
        TrustManagerFactory instance;
        Throwable e;
        int i;
        try {
            instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            try {
                instance.init((KeyStore) null);
            } catch (NoSuchAlgorithmException e2) {
                e = e2;
            } catch (KeyStoreException e3) {
                e = e3;
                AnonymousClass0Dc.C(f24600C, "Failed to create TrustManagerFactory", e);
                if (instance != null) {
                    for (TrustManager trustManager : instance.getTrustManagers()) {
                        if (trustManager instanceof X509TrustManager) {
                            return (X509TrustManager) trustManager;
                        }
                    }
                }
                return null;
            }
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            instance = null;
            AnonymousClass0Dc.C(f24600C, "Failed to create TrustManagerFactory", e);
            if (instance != null) {
                for (i = 0; i < r3; i++) {
                    if (trustManager instanceof X509TrustManager) {
                        return (X509TrustManager) trustManager;
                    }
                }
            }
            return null;
        } catch (KeyStoreException e5) {
            e = e5;
            instance = null;
            AnonymousClass0Dc.C(f24600C, "Failed to create TrustManagerFactory", e);
            if (instance != null) {
                while (i < r3) {
                    if (trustManager instanceof X509TrustManager) {
                    } else {
                        return (X509TrustManager) trustManager;
                    }
                }
            }
            return null;
        }
        if (instance != null) {
            for (i = 0; i < r3; i++) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
        }
    }

    /* renamed from: B */
    public static byte[][] m13913B(List list) {
        byte[][] bArr = new byte[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            try {
                bArr[i] = ((X509Certificate) list.get(i)).getEncoded();
            } catch (Throwable e) {
                AnonymousClass0Dc.M(f24600C, "Failed to encode Root CA", e);
            }
        }
        return bArr;
    }

    /* renamed from: C */
    public static synchronized java.util.ArrayList m13914C() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = X.AnonymousClass1xA.class;
        monitor-enter(r8);
        r7 = X.AnonymousClass1xA.m13915D();	 Catch:{ all -> 0x0072 }
        if (r7 != 0) goto L_0x0010;	 Catch:{ all -> 0x0072 }
    L_0x0009:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0072 }
        r0.<init>();	 Catch:{ all -> 0x0072 }
    L_0x000e:
        monitor-exit(r8);
        return r0;
    L_0x0010:
        r4 = r7.getClass();	 Catch:{ Throwable -> 0x006c }
        r1 = "userAliases";	 Catch:{ Throwable -> 0x006c }
        r6 = 0;	 Catch:{ Throwable -> 0x006c }
        r0 = new java.lang.Class[r6];	 Catch:{ Throwable -> 0x006c }
        r3 = r4.getMethod(r1, r0);	 Catch:{ Throwable -> 0x006c }
        r2 = "getCertificate";	 Catch:{ Throwable -> 0x006c }
        r5 = 1;	 Catch:{ Throwable -> 0x006c }
        r1 = new java.lang.Class[r5];	 Catch:{ Throwable -> 0x006c }
        r0 = java.lang.String.class;	 Catch:{ Throwable -> 0x006c }
        r1[r6] = r0;	 Catch:{ Throwable -> 0x006c }
        r4 = r4.getMethod(r2, r1);	 Catch:{ Throwable -> 0x006c }
        r0 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x006c }
        r1 = r3.invoke(r7, r0);	 Catch:{ Throwable -> 0x006c }
        r1 = (java.util.Set) r1;	 Catch:{ Throwable -> 0x006c }
        if (r1 == 0) goto L_0x0066;	 Catch:{ Throwable -> 0x006c }
    L_0x0034:
        r0 = r1.size();	 Catch:{ Throwable -> 0x006c }
        if (r0 != 0) goto L_0x003b;	 Catch:{ Throwable -> 0x006c }
    L_0x003a:
        goto L_0x0066;	 Catch:{ Throwable -> 0x006c }
    L_0x003b:
        r3 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x006c }
        r0 = r1.size();	 Catch:{ Throwable -> 0x006c }
        r3.<init>(r0);	 Catch:{ Throwable -> 0x006c }
        r2 = r1.iterator();	 Catch:{ Throwable -> 0x006c }
    L_0x0048:
        r0 = r2.hasNext();	 Catch:{ Throwable -> 0x006c }
        if (r0 == 0) goto L_0x0064;	 Catch:{ Throwable -> 0x006c }
    L_0x004e:
        r1 = r2.next();	 Catch:{ Throwable -> 0x006c }
        r1 = (java.lang.String) r1;	 Catch:{ Throwable -> 0x006c }
        r0 = new java.lang.Object[r5];	 Catch:{ Throwable -> 0x006c }
        r0[r6] = r1;	 Catch:{ Throwable -> 0x006c }
        r0 = r4.invoke(r7, r0);	 Catch:{ Throwable -> 0x006c }
        r0 = (java.security.cert.X509Certificate) r0;	 Catch:{ Throwable -> 0x006c }
        if (r0 == 0) goto L_0x0048;	 Catch:{ Throwable -> 0x006c }
    L_0x0060:
        r3.add(r0);	 Catch:{ Throwable -> 0x006c }
        goto L_0x0048;	 Catch:{ Throwable -> 0x006c }
    L_0x0064:
        monitor-exit(r8);
        return r3;
    L_0x0066:
        r0 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x006c }
        r0.<init>();	 Catch:{ Throwable -> 0x006c }
        goto L_0x000e;	 Catch:{ Throwable -> 0x006c }
    L_0x006c:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0072 }
        r0.<init>();	 Catch:{ all -> 0x0072 }
        goto L_0x000e;	 Catch:{ all -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1xA.C():java.util.ArrayList");
    }

    /* renamed from: D */
    private static java.lang.Object m13915D() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "com.android.org.conscrypt.TrustedCertificateStore";	 Catch:{ Throwable -> 0x000b }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x000b }
        r0 = r0.newInstance();	 Catch:{ Throwable -> 0x000b }
        return r0;	 Catch:{ Throwable -> 0x000b }
    L_0x000b:
        r0 = "org.apache.harmony.xnet.provider.jsse.TrustedCertificateStore";	 Catch:{ Throwable -> 0x0016 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x0016 }
        r0 = r0.newInstance();	 Catch:{ Throwable -> 0x0016 }
        return r0;	 Catch:{ Throwable -> 0x0016 }
    L_0x0016:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.1xA.D():java.lang.Object");
    }
}
