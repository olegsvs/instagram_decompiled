package X;

import android.text.TextUtils;
import java.net.CookieHandler;
import java.net.HttpCookie;

/* renamed from: X.22y */
public final class AnonymousClass22y {
    /* renamed from: B */
    public static void m14286B(AnonymousClass0Cn anonymousClass0Cn, CookieHandler cookieHandler, AnonymousClass0Pn anonymousClass0Pn, String str) {
        AnonymousClass0Pn anonymousClass0Pn2 = anonymousClass0Pn;
        AnonymousClass0Cn anonymousClass0Cn2 = anonymousClass0Cn;
        if (anonymousClass0Pn.f4196V != null) {
            for (AnonymousClass232 anonymousClass232 : anonymousClass0Pn.f4196V) {
                synchronized (AnonymousClass0HD.class) {
                    String str2 = anonymousClass232.f25440B;
                    AnonymousClass24i anonymousClass24i = (AnonymousClass24i) AnonymousClass0HD.f2576B.get(str2);
                    if (anonymousClass24i != null) {
                        AnonymousClass0FH anonymousClass0FH = AnonymousClass0FH.f2099C;
                        String B = AnonymousClass0FH.B(str2);
                        Float valueOf = anonymousClass0FH.f2100B.contains(B) ? Float.valueOf(anonymousClass0FH.f2100B.getFloat(B, -1.0f)) : null;
                        Float f = anonymousClass232.f25441C;
                        if (valueOf == null || valueOf.floatValue() < f.floatValue()) {
                            anonymousClass0FH.f2100B.edit().putFloat(AnonymousClass0FH.B(str2), f.floatValue()).apply();
                            anonymousClass24i.hD(anonymousClass0Cn);
                        }
                    }
                }
            }
        }
        if (!anonymousClass0Pn.isOk()) {
            if ("login_required".equals(anonymousClass0Pn.f4180F) && AnonymousClass0FL.F(anonymousClass0Cn)) {
                HttpCookie C = AnonymousClass0Cf.C(anonymousClass0Cn, "sessionid");
                if (C == null) {
                    anonymousClass0Pn = null;
                } else {
                    anonymousClass0Pn = C.getValue();
                }
                AnonymousClass0GU.f2367B.A(anonymousClass0Cn2, "login_required_response_from_server", anonymousClass0Pn2.f4183I, anonymousClass0Pn2.f4179E, anonymousClass0Pn2.f4193S, anonymousClass0Pn, str);
            } else if (anonymousClass0Pn.D()) {
                AnonymousClass2MQ anonymousClass2MQ = anonymousClass0Pn.f4176B;
                if (anonymousClass2MQ == null) {
                    Object obj = anonymousClass0Pn.f4177C;
                    if (TextUtils.isEmpty(obj)) {
                        AnonymousClass0Gn.C("checkpoint", "Checkpoint is required but none was provided.");
                        return;
                    }
                    anonymousClass2MQ = new AnonymousClass2MQ(false, obj, anonymousClass0Pn.f4192R ^ 1, false);
                }
                r1 = AnonymousClass0HF.B();
                if (r1 != null) {
                    r1.C(AnonymousClass0EV.f1977B, cookieHandler, anonymousClass2MQ);
                }
            } else if ("consent_required".equals(anonymousClass0Pn.f4180F) && AnonymousClass0FL.F(anonymousClass0Cn)) {
                AnonymousClass2MR anonymousClass2MR = anonymousClass0Pn.f4178D;
                if (anonymousClass2MR != null) {
                    r1 = AnonymousClass0HF.B();
                    if (r1 != null) {
                        r1.E(AnonymousClass0EV.f1977B, cookieHandler, anonymousClass2MR);
                    }
                } else {
                    AnonymousClass0Gn.C("consent", "consent data is required but none was provided.");
                }
            }
        }
    }
}
