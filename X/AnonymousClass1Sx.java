package X;

import android.content.Context;
import android.util.Pair;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Sx */
public final class AnonymousClass1Sx {
    /* renamed from: B */
    public static final long f18858B = TimeUnit.DAYS.toMillis(1);
    /* renamed from: C */
    public static AnonymousClass3nf f18859C;
    /* renamed from: D */
    private static Pair f18860D;
    /* renamed from: E */
    public static long f18861E;

    /* renamed from: B */
    public static synchronized void m11509B() {
        synchronized (AnonymousClass1Sx.class) {
            f18860D = null;
        }
    }

    /* renamed from: C */
    public static void m11510C(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Ci anonymousClass0Ci, String str, int i, AnonymousClass0Iw anonymousClass0Iw) {
        AnonymousClass0Iw anonymousClass3nd;
        int i2 = i;
        if (i == 0) {
            AnonymousClass3nS D = AnonymousClass1Sx.m11511D(anonymousClass0Ci.getId());
            if (!(D == null || D.f44558C == 0)) {
                AnonymousClass0NN.m3291B("invite_fb_friends_cache_hit", null).m3310R();
                anonymousClass0Iw.onStart();
                anonymousClass0Iw.onFinish();
                anonymousClass0Iw.onSuccess(D);
                return;
            }
        }
        if (i == 0) {
            AnonymousClass0NN.m3291B("invite_fb_friends_cache_miss", null).m3310R();
            anonymousClass3nd = new AnonymousClass3nd(anonymousClass0Iw, anonymousClass0Ci);
        } else {
            anonymousClass3nd = anonymousClass0Iw;
        }
        AnonymousClass1Sx.m11514G(context, anonymousClass0Cm, anonymousClass0Fz, str, i2, anonymousClass3nd);
    }

    /* renamed from: D */
    public static synchronized AnonymousClass3nS m11511D(String str) {
        synchronized (AnonymousClass1Sx.class) {
            AnonymousClass22n.B(str);
            if (f18860D != null && str.equals(f18860D.first)) {
                if ((AnonymousClass0Gd.m1840E() - f18861E > f18858B ? 1 : null) == null) {
                    AnonymousClass3nS anonymousClass3nS = (AnonymousClass3nS) f18860D.second;
                    return anonymousClass3nS;
                }
            }
            return null;
        }
    }

    /* renamed from: E */
    public static void m11512E(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz, AnonymousClass0Ci anonymousClass0Ci, String str) {
        if (AnonymousClass1Sx.m11511D(anonymousClass0Ci.getId()) == null) {
            AnonymousClass1Sx.m11514G(context, anonymousClass0Cm, anonymousClass0Fz, str, 0, new AnonymousClass3ne(anonymousClass0Ci));
        }
    }

    /* renamed from: F */
    public static synchronized void m11513F(String str, AnonymousClass3nS anonymousClass3nS) {
        synchronized (AnonymousClass1Sx.class) {
            f18860D = Pair.create(AnonymousClass22n.B(str), AnonymousClass22n.B(anonymousClass3nS));
            f18861E = AnonymousClass0Gd.m1840E();
            if (f18859C == null) {
                f18859C = new AnonymousClass3nf();
                AnonymousClass0F4.f2058E.m1504A(AnonymousClass0F5.class, f18859C);
            }
        }
    }

    /* renamed from: G */
    private static void m11514G(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Fz anonymousClass0Fz, String str, int i, AnonymousClass0Iw anonymousClass0Iw) {
        AnonymousClass22n.B(context);
        AnonymousClass22n.B(anonymousClass0Fz);
        if ((i >= 0 ? 1 : null) != null) {
            AnonymousClass22n.B(anonymousClass0Iw);
            String num = Integer.toString(50);
            String num2 = Integer.toString(i);
            AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
            anonymousClass0Pt.f4229M = "fb/get_invite_suggestions/";
            anonymousClass0Pt = anonymousClass0Pt.m3935D("count", num).m3935D("offset", num2).m3944M(AnonymousClass3nT.class);
            if (str != null) {
                anonymousClass0Pt.m3935D("fb_access_token", str);
            }
            AnonymousClass0GA H = anonymousClass0Pt.m3939H();
            H.f2849B = anonymousClass0Iw;
            AnonymousClass0Px.m3949B(context, anonymousClass0Fz, H);
            return;
        }
        throw new IllegalStateException();
    }
}
