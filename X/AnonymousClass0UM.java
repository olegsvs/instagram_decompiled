package X;

import android.content.Context;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0UM */
public final class AnonymousClass0UM implements AnonymousClass0U2 {
    /* renamed from: E */
    public static final AnonymousClass0U3 f5428E = new AnonymousClass0Yv();
    /* renamed from: B */
    public final Context f5429B;
    /* renamed from: C */
    public final AnonymousClass0Tw f5430C;
    /* renamed from: D */
    public final AnonymousClass0Cm f5431D;

    public AnonymousClass0UM(Context context, AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0Tw anonymousClass0Tw) {
        this.f5429B = context;
        this.f5431D = anonymousClass0Cm;
        this.f5430C = anonymousClass0Tw;
    }

    public final /* bridge */ /* synthetic */ void BV(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0VN anonymousClass0VN) {
        AnonymousClass0UL anonymousClass0UL = (AnonymousClass0UL) anonymousClass0U0;
        AnonymousClass0Yp.m5321D(this.f5429B, this.f5431D, anonymousClass0UL.f5427E, AnonymousClass0V0.REACTION);
        this.f5430C.m4638j(anonymousClass0UL.f5427E, false);
    }

    public final /* bridge */ /* synthetic */ void CV(AnonymousClass0U0 anonymousClass0U0) {
        this.f5430C.m4638j(((AnonymousClass0UL) anonymousClass0U0).f5427E, true);
    }

    public final /* bridge */ /* synthetic */ void KMA(AnonymousClass0U0 anonymousClass0U0, AnonymousClass0db anonymousClass0db, AnonymousClass0XZ anonymousClass0XZ) {
        AnonymousClass0UL anonymousClass0UL = (AnonymousClass0UL) anonymousClass0U0;
        DirectThreadKey directThreadKey = anonymousClass0UL.f5427E;
        String str = anonymousClass0UL.f5424B;
        AnonymousClass0V1.m4815D(anonymousClass0db, AnonymousClass0Xf.m5259C(this.f5431D, directThreadKey, AnonymousClass0W7.m4992C(this.f5431D.m1037B(), AnonymousClass0V0.REACTION, anonymousClass0UL.f5425C, null, 0, str), new AnonymousClass0Yw(this, anonymousClass0XZ, anonymousClass0UL)));
    }

    public final /* bridge */ /* synthetic */ boolean UC(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0UL anonymousClass0UL = (AnonymousClass0UL) anonymousClass0U0;
        String str = anonymousClass0UL.f5426D;
        AnonymousClass0Yr anonymousClass0Yr = anonymousClass0UL.f5425C;
        AnonymousClass0WH S = this.f5430C.m4621S(anonymousClass0UL.f5427E);
        if (S != null) {
            AnonymousClass0W7 K = S.m5074K(str);
            if (K != null) {
                K.f5893W = anonymousClass0Yr;
                AnonymousClass0W7.m4997H(K, "created".equals(anonymousClass0Yr.f6287E));
            }
            this.f5430C.m4637i(anonymousClass0UL.f5427E);
        }
        return true;
    }

    public final void mJA(AnonymousClass0U0 anonymousClass0U0) {
        AnonymousClass0UL anonymousClass0UL = (AnonymousClass0UL) anonymousClass0U0;
    }
}
