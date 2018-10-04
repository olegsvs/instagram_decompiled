package X;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Om */
public final class AnonymousClass0Om {
    /* renamed from: B */
    private static final long f3935B = TimeUnit.SECONDS.toMillis(15);
    /* renamed from: C */
    private static AnonymousClass0fm f3936C;
    /* renamed from: D */
    public static AnonymousClass0fm f3937D;
    /* renamed from: E */
    private static long f3938E;
    /* renamed from: F */
    public static long f3939F;
    /* renamed from: G */
    private static Set f3940G;

    /* renamed from: B */
    public static AnonymousClass0fm m3644B(AnonymousClass0fm anonymousClass0fm) {
        if (anonymousClass0fm != null && AnonymousClass0Zv.m5405F(anonymousClass0fm.m6552A())) {
            return anonymousClass0fm;
        }
        for (AnonymousClass0fm anonymousClass0fm2 : AnonymousClass0Om.m3646D()) {
            if (anonymousClass0fm2 != anonymousClass0fm && AnonymousClass0Zv.m5405F(anonymousClass0fm2.m6552A())) {
                return anonymousClass0fm2;
            }
        }
        return null;
    }

    /* renamed from: C */
    public static AnonymousClass0fm m3645C() {
        if (AnonymousClass0Om.m3649G(f3938E)) {
            AnonymousClass0fm B = AnonymousClass0Om.m3644B(f3936C);
            if (B == null || !B.m6556E()) {
                B = null;
            }
            f3936C = B;
            f3938E = AnonymousClass0Gd.m1840E();
        }
        return f3936C;
    }

    /* renamed from: D */
    public static Set m3646D() {
        if (f3940G == null) {
            Set linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(AnonymousClass0fm.KATANA);
            linkedHashSet.add(AnonymousClass0fm.WAKIZASHI);
            for (Object obj : AnonymousClass0fm.values()) {
                if (!linkedHashSet.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            f3940G = linkedHashSet;
        }
        return f3940G;
    }

    /* renamed from: E */
    public static boolean m3647E(Context context) {
        if (AnonymousClass0Om.m3645C() == null) {
            if (AnonymousClass0Om.m3649G(f3939F)) {
                AnonymousClass0fm B = AnonymousClass0Om.m3644B(f3937D);
                if (B == null || B.m6556E() || !B.m6554C(context)) {
                    B = null;
                }
                f3937D = B;
                f3939F = AnonymousClass0Gd.m1840E();
            }
            if (f3937D == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public static boolean m3648F() {
        return AnonymousClass0Om.m3645C() != null;
    }

    /* renamed from: G */
    public static boolean m3649G(long j) {
        return AnonymousClass0Gd.m1840E() - j > f3935B;
    }
}
