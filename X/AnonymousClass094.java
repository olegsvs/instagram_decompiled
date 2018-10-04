package X;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;

/* renamed from: X.094 */
public final class AnonymousClass094 implements HostnameVerifier {
    /* renamed from: B */
    public static final Pattern f1043B = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: B */
    public static List m568B(X509Certificate x509Certificate, int i) {
        List arrayList = new ArrayList();
        Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames == null) {
            return Collections.emptyList();
        }
        for (List list : subjectAlternativeNames) {
            if (list != null) {
                if (list.size() >= 2) {
                    Integer num = (Integer) list.get(0);
                    if (num != null) {
                        if (num.intValue() == i) {
                            String str = (String) list.get(1);
                            if (str != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: C */
    public static AnonymousClass095 m569C(AnonymousClass094 anonymousClass094, String str, String str2, List list) {
        anonymousClass094 = new AnonymousClass095(str);
        String toLowerCase = str.toLowerCase(Locale.US);
        Object obj = null;
        for (String E : list) {
            if (AnonymousClass094.m571E(toLowerCase, E)) {
                break;
            }
            obj = 1;
        }
        if (obj == null && str2 != null && AnonymousClass094.m571E(toLowerCase, str2)) {
            anonymousClass094.f1044B = true;
            return anonymousClass094;
        }
        anonymousClass094.f1044B = false;
        return anonymousClass094;
    }

    /* renamed from: D */
    public static AnonymousClass095 m570D(String str, List list) {
        AnonymousClass095 anonymousClass095 = new AnonymousClass095(str);
        for (String equalsIgnoreCase : list) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                anonymousClass095.f1044B = true;
                return anonymousClass095;
            }
        }
        anonymousClass095.f1044B = false;
        return anonymousClass095;
    }

    /* renamed from: E */
    private static boolean m571E(String str, String str2) {
        if (!(str == null || str.length() == 0 || str2 == null)) {
            if (str2.length() != 0) {
                String toLowerCase = str2.toLowerCase(Locale.US);
                if (!toLowerCase.contains("*")) {
                    return str.equals(toLowerCase);
                }
                if (!(toLowerCase.startsWith("*.") && str.regionMatches(0, toLowerCase, 2, toLowerCase.length() - 2))) {
                    int indexOf = toLowerCase.indexOf(42);
                    if (indexOf <= toLowerCase.indexOf(46)) {
                        if (str.regionMatches(0, toLowerCase, 0, indexOf)) {
                            int i = indexOf + 1;
                            int length = toLowerCase.length() - i;
                            int length2 = str.length() - length;
                            if (str.indexOf(46, indexOf) >= length2 || str.endsWith(".clients.google.com")) {
                                if (!str.regionMatches(length2, toLowerCase, i, length)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean verify(java.lang.String r7, javax.net.ssl.SSLSession r8) {
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
        r5 = 0;
        r0 = r8.getPeerCertificates();	 Catch:{ SSLException -> 0x0072 }
        r2 = r0[r5];	 Catch:{ SSLException -> 0x0072 }
        r2 = (java.security.cert.X509Certificate) r2;	 Catch:{ SSLException -> 0x0072 }
        r0 = f1043B;	 Catch:{ SSLException -> 0x0072 }
        r0 = r0.matcher(r7);	 Catch:{ SSLException -> 0x0072 }
        r0 = r0.matches();	 Catch:{ SSLException -> 0x0072 }
        if (r0 == 0) goto L_0x003b;	 Catch:{ SSLException -> 0x0072 }
    L_0x0015:
        r0 = 7;	 Catch:{ SSLException -> 0x0072 }
        r2 = X.AnonymousClass094.m568B(r2, r0);	 Catch:{ CertificateParsingException -> 0x001b }
        goto L_0x0036;	 Catch:{ CertificateParsingException -> 0x001b }
    L_0x001b:
        r3 = move-exception;	 Catch:{ SSLException -> 0x0072 }
        r2 = new java.util.ArrayList;	 Catch:{ SSLException -> 0x0072 }
        r0 = 0;	 Catch:{ SSLException -> 0x0072 }
        r2.<init>(r0);	 Catch:{ SSLException -> 0x0072 }
        r1 = new java.lang.StringBuilder;	 Catch:{ SSLException -> 0x0072 }
        r1.<init>();	 Catch:{ SSLException -> 0x0072 }
        r0 = "Failed parsing subjectAltName: ";	 Catch:{ SSLException -> 0x0072 }
        r1.append(r0);	 Catch:{ SSLException -> 0x0072 }
        r0 = r3.getMessage();	 Catch:{ SSLException -> 0x0072 }
        r1.append(r0);	 Catch:{ SSLException -> 0x0072 }
        r1.toString();	 Catch:{ SSLException -> 0x0072 }
    L_0x0036:
        r0 = X.AnonymousClass094.m570D(r7, r2);	 Catch:{ SSLException -> 0x0072 }
        goto L_0x006f;	 Catch:{ SSLException -> 0x0072 }
    L_0x003b:
        r0 = r2.getSubjectX500Principal();	 Catch:{ SSLException -> 0x0072 }
        r1 = new X.093;	 Catch:{ SSLException -> 0x0072 }
        r1.<init>(r0);	 Catch:{ SSLException -> 0x0072 }
        r0 = "cn";	 Catch:{ SSLException -> 0x0072 }
        r4 = r1.m567A(r0);	 Catch:{ SSLException -> 0x0072 }
        r0 = 2;	 Catch:{ SSLException -> 0x0072 }
        r2 = X.AnonymousClass094.m568B(r2, r0);	 Catch:{ CertificateParsingException -> 0x0050 }
        goto L_0x006b;	 Catch:{ CertificateParsingException -> 0x0050 }
    L_0x0050:
        r3 = move-exception;	 Catch:{ SSLException -> 0x0072 }
        r2 = new java.util.ArrayList;	 Catch:{ SSLException -> 0x0072 }
        r0 = 0;	 Catch:{ SSLException -> 0x0072 }
        r2.<init>(r0);	 Catch:{ SSLException -> 0x0072 }
        r1 = new java.lang.StringBuilder;	 Catch:{ SSLException -> 0x0072 }
        r1.<init>();	 Catch:{ SSLException -> 0x0072 }
        r0 = "Failed parsing subjectAltName: ";	 Catch:{ SSLException -> 0x0072 }
        r1.append(r0);	 Catch:{ SSLException -> 0x0072 }
        r0 = r3.getMessage();	 Catch:{ SSLException -> 0x0072 }
        r1.append(r0);	 Catch:{ SSLException -> 0x0072 }
        r1.toString();	 Catch:{ SSLException -> 0x0072 }
    L_0x006b:
        r0 = X.AnonymousClass094.m569C(r6, r7, r4, r2);	 Catch:{ SSLException -> 0x0072 }
    L_0x006f:
        r0 = r0.f1044B;	 Catch:{ SSLException -> 0x0072 }
        return r0;	 Catch:{ SSLException -> 0x0072 }
    L_0x0072:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: X.094.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
