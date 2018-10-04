package X;

import android.content.Context;

/* renamed from: X.1fm */
public abstract class AnonymousClass1fm {
    /* renamed from: B */
    public static boolean m12427B(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        return (AnonymousClass1fm.m12428C(context, anonymousClass0Cm) == null || ((Boolean) AnonymousClass0CC.nK.m846H(anonymousClass0Cm)).booleanValue() == null) ? null : true;
    }

    /* renamed from: C */
    public static boolean m12428C(Context context, AnonymousClass0Cm anonymousClass0Cm) {
        boolean K = AnonymousClass0a2.m5426K(anonymousClass0Cm);
        AnonymousClass1C0 B = AnonymousClass1C0.m9882B(anonymousClass0Cm);
        boolean z = B.m9884A() != null && B.m9884A().m11950A();
        AnonymousClass0NN H = AnonymousClass0NN.m3291B("fb_invite_global_state_attempt", null).m3300H("is_fb_connected", z).m3300H("has_local_token", K);
        if (context != null) {
            H.m3300H("sso_provider_installed", AnonymousClass0Om.m3647E(context));
        }
        H.m3310R();
        if (!K) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
