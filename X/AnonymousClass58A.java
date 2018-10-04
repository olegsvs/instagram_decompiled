package X;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: X.58A */
public final class AnonymousClass58A implements AnonymousClass3Td {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass0IJ f60423B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass0Cn f60424C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass5jt f60425D;
    /* renamed from: E */
    public final /* synthetic */ AnonymousClass2Na f60426E;

    public AnonymousClass58A(AnonymousClass0IJ anonymousClass0IJ, AnonymousClass0Cn anonymousClass0Cn, AnonymousClass2Na anonymousClass2Na, AnonymousClass5jt anonymousClass5jt) {
        this.f60423B = anonymousClass0IJ;
        this.f60424C = anonymousClass0Cn;
        this.f60426E = anonymousClass2Na;
        this.f60425D = anonymousClass5jt;
    }

    public final /* bridge */ /* synthetic */ void Nh(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue() && this.f60423B.getContext() != null) {
            Context context = this.f60423B.getContext();
            AnonymousClass3Vp anonymousClass3Vp = AnonymousClass3Vq.f41801C;
            AnonymousClass40y anonymousClass40y = (AnonymousClass40y) anonymousClass3Vp.A();
            String str = "smartlock_login_0430";
            AnonymousClass3Vp anonymousClass3Vp2 = AnonymousClass3Vq.f41801C;
            AnonymousClass0LH.E(context);
            AnonymousClass0LH.E(str);
            AnonymousClass0LH.E(anonymousClass3Vp);
            Object obj2 = (((System.currentTimeMillis() > anonymousClass3Vp.f41793C ? 1 : (System.currentTimeMillis() == anonymousClass3Vp.f41793C ? 0 : -1)) < 0 ? 1 : null) == null || anonymousClass3Vp2.f41798H >= anonymousClass3Vp2.f41795E) ? null : 1;
            if (obj2 != null) {
                Long l = (Long) AnonymousClass3Vq.f41802D.get(str);
                if ((SystemClock.elapsedRealtime() - (l != null ? l.longValue() : -AnonymousClass3Vq.f41800B) >= AnonymousClass3Vq.f41800B ? 1 : null) != null) {
                    AnonymousClass3Vq.f41802D.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                    String A = AnonymousClass0Dt.f1941C.A(context);
                    AnonymousClass0Fr.IgLocalExposure.A().F("experiment", str).F("test_group", anonymousClass3Vp2.A().f41803B).F("unitid", A).R();
                    AnonymousClass0Fr.IgD3LocalExposure.A().F("exp_name", str).F("exp_group", anonymousClass3Vp2.A().f41803B).F("app_device_id", A).R();
                }
            }
            if (anonymousClass40y.f48379B) {
                AnonymousClass0Cn anonymousClass0Cn = this.f60424C;
                AnonymousClass0IL anonymousClass0IL = this.f60423B;
                AnonymousClass2Na anonymousClass2Na = this.f60426E;
                AnonymousClass5jt anonymousClass5jt = this.f60425D;
                AnonymousClass0TK anonymousClass57L = new AnonymousClass57L(anonymousClass5jt);
                AnonymousClass57M.m25788B(anonymousClass0IL, anonymousClass57L);
                anonymousClass5jt.f68636B.m28370A(new AnonymousClass5jo(anonymousClass5jt, AnonymousClass5jt.m28374B(), anonymousClass2Na, new AnonymousClass58B(anonymousClass0IL, anonymousClass57L, anonymousClass2Na, anonymousClass0Cn)));
            }
        }
    }
}
