package X;

import android.content.Context;
import android.util.Pair;

/* renamed from: X.0xe */
public final class AnonymousClass0xe {
    /* renamed from: B */
    public static Pair m8576B(AnonymousClass0P7 anonymousClass0P7, AnonymousClass0m3 anonymousClass0m3, Context context) {
        Object obj = null;
        if (anonymousClass0m3.f9715x == AnonymousClass0a4.AD_BAKEOFF || (anonymousClass0P7.kA() && !(anonymousClass0P7.kA() && ((Boolean) AnonymousClass0CC.im.m845G()).booleanValue()))) {
            anonymousClass0P7 = null;
        } else {
            anonymousClass0P7 = AnonymousClass0vv.m8374B(anonymousClass0P7, anonymousClass0m3.f9673H, context);
            if (anonymousClass0P7 != null) {
                if (anonymousClass0P7.f12147F == AnonymousClass0xM.AD_DESTINATION_WEB && ((Boolean) AnonymousClass0CC.gm.m845G()).booleanValue()) {
                    obj = AnonymousClass0vp.BROWSE;
                } else if (anonymousClass0P7.f12147F == AnonymousClass0xM.AD_DESTINATION_APP_STORE && ((Boolean) AnonymousClass0CC.dm.m845G()).booleanValue()) {
                    obj = AnonymousClass0vp.INSTALL;
                } else if (anonymousClass0P7.f12147F == AnonymousClass0xM.AD_DESTINATION_LEAD_AD && ((Boolean) AnonymousClass0CC.em.m845G()).booleanValue()) {
                    obj = AnonymousClass0vp.LEAD;
                }
            }
        }
        return new Pair(obj, anonymousClass0P7);
    }
}
