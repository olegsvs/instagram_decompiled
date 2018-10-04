package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.2G6 */
public final class AnonymousClass2G6 {
    /* renamed from: B */
    public static AnonymousClass2VC m14869B(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass2Fy anonymousClass2Fy) {
        AnonymousClass2bb anonymousClass2bb = new AnonymousClass2bb(context, anonymousClass2Fy, AnonymousClass2G8.SOLID);
        AnonymousClass2bb anonymousClass2bb2 = new AnonymousClass2bb(context, anonymousClass2Fy, AnonymousClass2G8.FROSTED);
        AnonymousClass2ba anonymousClass2ba = new AnonymousClass2ba(context, anonymousClass2Fy);
        if (((Boolean) AnonymousClass0CC.hf.H(anonymousClass0Cm)).booleanValue()) {
            anonymousClass2bb.TWA(true);
            anonymousClass2bb2.TWA(true);
            anonymousClass2ba.TWA(true);
        }
        if (((Boolean) AnonymousClass0CC.nf.H(anonymousClass0Cm)).booleanValue()) {
            return new AnonymousClass2VC(context, anonymousClass2ba, anonymousClass2bb, anonymousClass2bb2);
        }
        return new AnonymousClass2VC(context, anonymousClass2bb, anonymousClass2bb2, anonymousClass2ba);
    }

    /* renamed from: C */
    public static AnonymousClass2Fy m14870C(Drawable drawable) {
        if (drawable instanceof AnonymousClass2VC) {
            drawable = ((AnonymousClass2VC) drawable).m16108A();
        }
        AnonymousClass1mY.m13011B(drawable instanceof AnonymousClass2G7);
        return ((AnonymousClass2G7) drawable).KS();
    }

    /* renamed from: D */
    public static AnonymousClass2Fy m14871D(AnonymousClass0OA anonymousClass0OA) {
        anonymousClass0OA = anonymousClass0OA.Q(AnonymousClass15c.MUSIC_OVERLAY);
        if (anonymousClass0OA == null || anonymousClass0OA.isEmpty()) {
            return null;
        }
        return ((AnonymousClass0ZF) anonymousClass0OA.get(0)).f6306N;
    }

    /* renamed from: E */
    public static String m14872E(List list) {
        if (!(list == null || list.isEmpty())) {
            for (AnonymousClass0ZF anonymousClass0ZF : list) {
                if (anonymousClass0ZF.f6315W == AnonymousClass15c.MUSIC_OVERLAY && anonymousClass0ZF.f6306N.f28172K) {
                    return anonymousClass0ZF.f6306N.f28173L;
                }
            }
        }
        return null;
    }

    /* renamed from: F */
    public static boolean m14873F(List list) {
        if (!(list == null || list.isEmpty())) {
            for (AnonymousClass0ZF anonymousClass0ZF : list) {
                if (anonymousClass0ZF.f6315W == AnonymousClass15c.MUSIC_OVERLAY) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m14874G(Drawable drawable) {
        return (drawable instanceof AnonymousClass2VC) && (((AnonymousClass2VC) drawable).m16108A() instanceof AnonymousClass2G7);
    }

    /* renamed from: H */
    public static boolean m14875H(List list) {
        if (!(list == null || list.isEmpty())) {
            for (AnonymousClass0ZF anonymousClass0ZF : list) {
                if (anonymousClass0ZF.f6315W == AnonymousClass15c.MUSIC_OVERLAY && anonymousClass0ZF.f6306N.f28172K) {
                    return true;
                }
            }
        }
        return false;
    }
}
