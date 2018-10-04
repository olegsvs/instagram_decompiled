package X;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: X.09U */
public final class AnonymousClass09U {
    /* renamed from: B */
    public final AnonymousClass09M f1076B;
    /* renamed from: C */
    public boolean f1077C = false;
    /* renamed from: D */
    private final Context f1078D;
    /* renamed from: E */
    private final AnonymousClass1M0 f1079E;

    public AnonymousClass09U(Context context, AnonymousClass1M0 anonymousClass1M0, AnonymousClass09M anonymousClass09M) {
        this.f1078D = context;
        this.f1079E = anonymousClass1M0;
        this.f1076B = anonymousClass09M;
    }

    /* renamed from: B */
    public static void m615B(AnonymousClass09U anonymousClass09U, boolean z) {
        int i;
        Set B;
        String C;
        AnonymousClass09U anonymousClass09U2 = anonymousClass09U;
        AnonymousClass09W.m617B(anonymousClass09U2.f1078D);
        AnonymousClass09Q B2 = AnonymousClass09Q.m602B();
        BitSet bitSet = new BitSet(2);
        BitSet bitSet2 = new BitSet(2);
        AnonymousClass09Q B3 = AnonymousClass09Q.m602B();
        for (i = 0; i < 2; i++) {
            String C2 = AnonymousClass09K.m588C(i);
            Integer D = AnonymousClass09K.m589D(C2);
            if (AnonymousClass1GY.m10501D(D.intValue(), 1)) {
                B3.m610H(C2, Integer.valueOf(2));
            } else if (AnonymousClass1GY.m10501D(D.intValue(), 3)) {
                B3.m610H(C2, Integer.valueOf(0));
            }
        }
        if (VERSION.SDK_INT >= 21) {
            B = AnonymousClass09T.m614B(anonymousClass09U2.f1078D);
        } else {
            B = new HashSet();
        }
        AnonymousClass09L anonymousClass09L = new AnonymousClass09L(anonymousClass09U2.f1076B);
        File file = anonymousClass09U2.f1076B.f1065B;
        String[] list = file.list();
        if (list != null) {
            for (String C3 : list) {
                Object obj;
                File B4;
                int i2;
                Matcher matcher = anonymousClass09L.f1063E.matcher(C3);
                boolean z2 = matcher.find() && matcher.groupCount() == 2;
                anonymousClass09L.f1064F = z2;
                String str = null;
                anonymousClass09L.f1062D = z2 ? matcher.group(1) : null;
                if (anonymousClass09L.f1064F) {
                    str = matcher.group(2);
                }
                anonymousClass09L.f1061C = str;
                anonymousClass09L.f1060B = C3.equals("installed");
                if (!z) {
                    Object obj2 = (anonymousClass09L.f1060B || (anonymousClass09L.f1064F && ("0".equals(anonymousClass09L.f1061C) || anonymousClass09L.m590A()))) ? null : 1;
                    if (obj2 == null) {
                        obj = null;
                        if (obj != null) {
                            AnonymousClass09M.m592B(new File(file, C3));
                        }
                        i = AnonymousClass09N.m598B(anonymousClass09L.f1062D);
                        if (i >= 0) {
                            bitSet2.set(i);
                        }
                        if (anonymousClass09L.m590A()) {
                            B4 = anonymousClass09U2.f1076B.m596B(anonymousClass09L.f1062D, anonymousClass09L.f1061C);
                            if (B.contains(anonymousClass09L.f1062D)) {
                                B4.delete();
                            }
                            if (obj == null) {
                                if (!B4.exists() || B.contains(anonymousClass09L.f1062D)) {
                                    i2 = 2;
                                    AnonymousClass09Q.m602B().m610H(anonymousClass09L.f1062D, Integer.valueOf(i2));
                                    bitSet.set(i);
                                }
                            }
                            i2 = 3;
                            AnonymousClass09Q.m602B().m610H(anonymousClass09L.f1062D, Integer.valueOf(i2));
                            bitSet.set(i);
                        }
                    }
                }
                obj = 1;
                if (obj != null) {
                    AnonymousClass09M.m592B(new File(file, C3));
                }
                i = AnonymousClass09N.m598B(anonymousClass09L.f1062D);
                if (i >= 0) {
                    bitSet2.set(i);
                }
                if (anonymousClass09L.m590A()) {
                    B4 = anonymousClass09U2.f1076B.m596B(anonymousClass09L.f1062D, anonymousClass09L.f1061C);
                    if (B.contains(anonymousClass09L.f1062D)) {
                        B4.delete();
                    }
                    if (obj == null) {
                        if (B4.exists()) {
                        }
                        i2 = 2;
                        AnonymousClass09Q.m602B().m610H(anonymousClass09L.f1062D, Integer.valueOf(i2));
                        bitSet.set(i);
                    }
                    i2 = 3;
                    AnonymousClass09Q.m602B().m610H(anonymousClass09L.f1062D, Integer.valueOf(i2));
                    bitSet.set(i);
                }
            }
        }
        AnonymousClass1M2 A = anonymousClass09U2.f1079E.m10929A("AppModules::PrevDownload");
        boolean z3 = false;
        anonymousClass09U = A.m10937C("key::PrevDownloadInit", false);
        AnonymousClass1ea B5 = A.m10936B();
        int i3 = 0;
        boolean z4 = false;
        while (i3 < 2) {
            C3 = AnonymousClass09K.m588C(i3);
            Integer D2 = AnonymousClass09K.m589D(C3);
            if (!(bitSet.get(i3) || AnonymousClass1GY.m10501D(D2.intValue(), 3))) {
                Integer valueOf = Integer.valueOf(3);
                synchronized (B2) {
                    if (AnonymousClass1GY.m10501D(B2.m603A(i3).intValue(), 0)) {
                        B2.m609G(i3, valueOf);
                    }
                }
            }
            boolean A2 = A.m10935A(C3);
            boolean C4 = A.m10937C(C3, z3);
            boolean z5 = bitSet2.get(i3);
            if (!(!z5 || C4 || anonymousClass09U == null)) {
                AnonymousClass0Dc.m1255R("BackgroundInitializer", "Module %s has download but prev download pref not set (hasPref=%b)", C3, Boolean.valueOf(A2));
            }
            boolean z6 = !z && (z5 || C4);
            if (!A2 || z6 != C4) {
                Boolean.valueOf(z6);
                B5.OIA(C3, z6);
                z4 = true;
            }
            i3++;
            z3 = false;
        }
        if (anonymousClass09U == null) {
            z4 = true;
            B5.OIA("key::PrevDownloadInit", true);
        }
        if (z4) {
            B5.commit();
        }
    }
}
