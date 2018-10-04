package X;

import android.content.Context;
import android.content.pm.Signature;
import com.facebook.common.dextricks.DexStore;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* renamed from: X.3Jy */
public final class AnonymousClass3Jy {
    /* renamed from: C */
    private static final Set f40129C = new HashSet(Arrays.asList(new String[]{"META-INF/MANIFEST.MF", "AndroidManifest.xml", "classes.dex"}));
    /* renamed from: D */
    private static final Set f40130D = new HashSet(Arrays.asList(new String[]{"META-INF/MANIFEST.MF", DexStore.SECONDARY_DEX_MANIFEST}));
    /* renamed from: E */
    private static final Class f40131E = AnonymousClass3Jy.class;
    /* renamed from: B */
    private final Context f40132B;

    public AnonymousClass3Jy(Context context) {
        this.f40132B = context;
    }

    /* renamed from: A */
    public final boolean m19388A(JarFile jarFile, String str) {
        if (jarFile == null) {
            return false;
        }
        boolean E = AnonymousClass3Jy.m19387E(jarFile, str);
        if (E) {
            Signature[] C = AnonymousClass3Jy.m19385C(this.f40132B);
            if (!(C == null || C.length <= 0 || AnonymousClass1Vd.C(C[0]).contains("CN=Android Debug"))) {
                E = AnonymousClass3Jy.m19384B(C, AnonymousClass3Jy.m19386D(jarFile));
            }
        }
        return E;
    }

    /* renamed from: B */
    private static boolean m19384B(Signature[] signatureArr, Signature[] signatureArr2) {
        boolean z = false;
        if (signatureArr == null) {
            if (signatureArr2 == null) {
                z = true;
            }
        } else if (signatureArr2 != null) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(signatureArr));
            HashSet hashSet2 = new HashSet();
            hashSet2.addAll(Arrays.asList(signatureArr2));
            return hashSet.equals(hashSet2);
        }
        return z;
    }

    /* renamed from: C */
    private static Signature[] m19385C(Context context) {
        Signature[] signatureArr = null;
        if (context == null) {
            return null;
        }
        try {
            signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            return signatureArr;
        } catch (Throwable e) {
            AnonymousClass0Dc.E(f40131E, e, "PackageManager.NameNotFoundException", new Object[0]);
            return signatureArr;
        }
    }

    /* renamed from: D */
    private static Signature[] m19386D(JarFile jarFile) {
        try {
            Enumeration entries = jarFile.entries();
            Certificate[] certificateArr = null;
            while (entries.hasMoreElements()) {
                JarEntry jarEntry = (JarEntry) entries.nextElement();
                if (!jarEntry.isDirectory()) {
                    if (!jarEntry.getName().startsWith("META-INF/")) {
                        Class cls;
                        String str;
                        Object[] objArr;
                        Certificate[] D = AnonymousClass1Vd.D(jarFile, jarEntry);
                        if (D == null) {
                            cls = f40131E;
                            str = "%s has no certificates";
                            objArr = new Object[]{jarFile.getName()};
                        } else if (certificateArr == null) {
                            certificateArr = D;
                        } else {
                            int length = certificateArr.length;
                            int i = 0;
                            while (i < length) {
                                Object obj;
                                Certificate certificate = certificateArr[i];
                                for (Object obj2 : D) {
                                    if (certificate != null && certificate.equals(obj2)) {
                                        obj = 1;
                                        break;
                                    }
                                }
                                obj = null;
                                if (obj != null) {
                                    if (certificateArr.length == D.length) {
                                        i++;
                                    }
                                }
                                cls = f40131E;
                                str = "Package %s has mismatched certificates at entry %s";
                                objArr = new Object[]{jarFile.getName(), jarEntry.getName()};
                            }
                            continue;
                        }
                        AnonymousClass0Dc.D(cls, str, objArr);
                        return null;
                    }
                }
            }
            return AnonymousClass1Vd.B(certificateArr);
        } catch (Throwable e) {
            AnonymousClass0Dc.E(f40131E, e, "Runtime exception reading %s", new Object[]{jarFile.getName()});
            return null;
        }
    }

    /* renamed from: E */
    private static boolean m19387E(JarFile jarFile, String str) {
        if (str.equals("\"application/java-archive\"")) {
            str = f40130D;
        } else {
            str = f40129C;
        }
        jarFile = jarFile.entries();
        while (jarFile.hasMoreElements()) {
            JarEntry jarEntry = (JarEntry) jarFile.nextElement();
            if (!jarEntry.isDirectory()) {
                String name = jarEntry.getName();
                if (str.contains(name)) {
                    str.remove(name);
                }
                if (str.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
