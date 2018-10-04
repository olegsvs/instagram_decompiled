package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0H6 */
public final class AnonymousClass0H6 {
    /* renamed from: F */
    private static AnonymousClass0H6 f2525F;
    /* renamed from: B */
    public final Map f2526B = new HashMap();
    /* renamed from: C */
    public boolean f2527C = false;
    /* renamed from: D */
    public final AnonymousClass0Ea f2528D;
    /* renamed from: E */
    public int f2529E = 1;

    private AnonymousClass0H6() {
        AnonymousClass0Ea anonymousClass0Ea = AnonymousClass0Ea.f1980C;
        this.f2528D = anonymousClass0Ea;
        anonymousClass0Ea.m1407j(23396353, 1);
    }

    /* renamed from: A */
    public final void m1949A(boolean z, int i) {
        synchronized (this.f2526B) {
            this.f2527C = z;
            this.f2529E = i;
            for (Integer intValue : this.f2526B.keySet()) {
                this.f2528D.m1445S(23396353, intValue.intValue());
            }
            this.f2526B.clear();
        }
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0H6 m1945B() {
        AnonymousClass0H6 anonymousClass0H6;
        synchronized (AnonymousClass0H6.class) {
            if (f2525F == null) {
                f2525F = new AnonymousClass0H6();
            }
            anonymousClass0H6 = f2525F;
        }
        return anonymousClass0H6;
    }

    /* renamed from: B */
    public final void m1950B(String str, int i) {
        int C = AnonymousClass0H6.m1946C(str);
        synchronized (this.f2526B) {
            if (AnonymousClass0H6.m1947D(this, C)) {
                this.f2528D.markerAnnotate(23396353, C, "ENCODED_BYTE_SIZE", i);
            }
        }
    }

    /* renamed from: C */
    public static int m1946C(String str) {
        return str.hashCode();
    }

    /* renamed from: C */
    public final void m1951C(String str) {
        int C = AnonymousClass0H6.m1946C(str);
        synchronized (this.f2526B) {
            AnonymousClass0H6.m1947D(this, C);
        }
    }

    /* renamed from: D */
    public final void m1952D(String str, String str2, String str3) {
        int C = AnonymousClass0H6.m1946C(str);
        synchronized (this.f2526B) {
            if (this.f2527C && AnonymousClass0H6.m1947D(this, C)) {
                this.f2528D.markerAnnotate(23396353, C, "LOAD_SOURCE", str2);
                this.f2528D.markerAnnotate(23396353, C, "END_STATUS", str3);
                this.f2528D.markerEnd(23396353, C, (short) 467);
            }
            this.f2526B.remove(Integer.valueOf(C));
        }
        if (str2.equals("memory")) {
            AnonymousClass22v.B(C, "DISK");
        }
        if (!str2.equals("disk")) {
            if (!str2.equals("memory")) {
                if (str2.equals("network")) {
                    str2 = "NETWORK";
                }
                AnonymousClass22v.C(C, str2);
            }
        }
        str2 = "DISK";
        AnonymousClass22v.C(C, str2);
    }

    /* renamed from: D */
    public static boolean m1947D(AnonymousClass0H6 anonymousClass0H6, int i) {
        return anonymousClass0H6.f2526B.containsKey(Integer.valueOf(i)) && ((Boolean) anonymousClass0H6.f2526B.get(Integer.valueOf(i))).booleanValue();
    }

    /* renamed from: E */
    public static void m1948E(AnonymousClass0H6 anonymousClass0H6, String str, String str2) {
        int C = AnonymousClass0H6.m1946C(str);
        synchronized (anonymousClass0H6.f2526B) {
            if (AnonymousClass0H6.m1947D(anonymousClass0H6, C)) {
                anonymousClass0H6.f2528D.m1451Y(23396353, C, str2);
            }
        }
    }
}
