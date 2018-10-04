package X;

/* renamed from: X.1BK */
public final class AnonymousClass1BK {
    /* renamed from: B */
    public static AnonymousClass0Iu m9797B(AnonymousClass0Cm anonymousClass0Cm, String str, String str2, boolean z) {
        String str3 = "news/inbox/";
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
        anonymousClass0Pt.f4229M = str3;
        anonymousClass0Pt.f4228L = new AnonymousClass0R8(AnonymousClass1BL.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str3);
        stringBuilder.append(str2);
        anonymousClass0Pt.f4219C = stringBuilder.toString();
        anonymousClass0Pt.f4220D = AnonymousClass0Ny.UseCacheWithTimeout;
        anonymousClass0Pt.f4221E = 4500;
        if (Boolean.FALSE.equals(AnonymousClass0fj.m6547B(AnonymousClass0EV.f1977B))) {
            anonymousClass0Pt.m3935D("push_disabled", "true");
        }
        if (str != null) {
            anonymousClass0Pt.m3935D("last_checked", str);
        }
        if (z) {
            anonymousClass0Pt.m3942K();
        }
        AnonymousClass0It.m2379F(anonymousClass0Pt, str2);
        return anonymousClass0Pt.m3939H();
    }

    /* renamed from: C */
    public static AnonymousClass0Iu m9798C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass1dA anonymousClass1dA, String str, String str2) {
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "news/log/";
        return anonymousClass0Pt.m3944M(AnonymousClass0Pv.class).m3935D("action", anonymousClass1dA.f20714B).m3935D("pk", str).m3935D("tuuid", str2).m3939H();
    }
}
