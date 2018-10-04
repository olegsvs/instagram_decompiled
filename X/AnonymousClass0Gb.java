package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Gb */
public final class AnonymousClass0Gb {
    /* renamed from: D */
    public static AnonymousClass0Gb f2388D;
    /* renamed from: B */
    public final Set f2389B;
    /* renamed from: C */
    private final AnonymousClass0Ge f2390C;

    public AnonymousClass0Gb(AnonymousClass0Ge anonymousClass0Ge, String[] strArr) {
        this.f2390C = anonymousClass0Ge;
        Collection hashSet = new HashSet();
        this.f2389B = hashSet;
        Collections.addAll(hashSet, strArr);
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0Gg m1834B() {
        synchronized (AnonymousClass0Gb.class) {
            if (f2388D != null) {
                AnonymousClass0Gg anonymousClass0Gg = f2388D.f2390C.f2394D;
                return anonymousClass0Gg;
            }
            return null;
        }
    }

    /* renamed from: C */
    public static boolean m1835C() {
        return AnonymousClass0CB.m834D() && AnonymousClass0FZ.m1634B().f2177B.getBoolean("client_leak_analysis", false);
    }

    /* renamed from: D */
    public static synchronized void m1836D(Object obj, String str) {
        synchronized (AnonymousClass0Gb.class) {
            if (f2388D != null) {
                if (!f2388D.f2389B.contains(obj.getClass().getCanonicalName())) {
                    AnonymousClass0Ge anonymousClass0Ge = f2388D.f2390C;
                    AnonymousClass2DL anonymousClass2DL = new AnonymousClass2DL(obj, str, anonymousClass0Ge.f2396F);
                    anonymousClass0Ge.f2397G.put(anonymousClass2DL.f27575B, anonymousClass2DL);
                    Runnable anonymousClass2DJ = new AnonymousClass2DJ(anonymousClass0Ge, anonymousClass2DL);
                    if (anonymousClass0Ge.f2393C) {
                        AnonymousClass0Oy.m3698B().m3699A(anonymousClass2DJ, 10000);
                    } else {
                        AnonymousClass0OR.m3626F(anonymousClass0Ge.f2392B, anonymousClass2DJ, 10000, 832001893);
                    }
                }
            }
        }
    }
}
