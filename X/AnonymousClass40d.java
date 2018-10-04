package X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.40d */
public final class AnonymousClass40d implements AnonymousClass3It {
    /* renamed from: B */
    public AnonymousClass0db f48310B;
    /* renamed from: C */
    public final AnonymousClass0EE f48311C;
    /* renamed from: D */
    public final AnonymousClass3Ix f48312D;
    /* renamed from: E */
    public final String f48313E;

    public AnonymousClass40d(AnonymousClass0EE anonymousClass0EE, AnonymousClass0db anonymousClass0db, String str, AnonymousClass3Ix anonymousClass3Ix) {
        this.f48311C = anonymousClass0EE;
        this.f48310B = anonymousClass0db;
        this.f48313E = str;
        this.f48312D = anonymousClass3Ix;
    }

    /* renamed from: A */
    public final void m22032A(AnonymousClass0mf anonymousClass0mf, int i, int i2, int i3, int i4, String str) {
        AnonymousClass0Ci anonymousClass0Ci = anonymousClass0mf.f9880J;
        int i5 = i4;
        String str2 = str;
        AnonymousClass0NN B = AnonymousClass3Iu.m19321B(this.f48311C, "account_recs_follow_tap", this.f48310B, this.f48313E, i5, str2, i, i2, this.f48312D.LR(anonymousClass0mf));
        AnonymousClass0uC.F(B, anonymousClass0mf, this.f48312D);
        B.B("profile_position", i3);
        B.F(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0Ci.getId());
        B.F("follow_status", AnonymousClass0mk.B(anonymousClass0Ci.f1751t).A());
        B.R();
    }

    /* renamed from: B */
    public final void m22033B(AnonymousClass0mf anonymousClass0mf, int i, int i2, int i3, int i4, String str) {
        int i5 = i4;
        String str2 = str;
        AnonymousClass0NN B = AnonymousClass3Iu.m19321B(this.f48311C, "account_recs_profile_tap", this.f48310B, this.f48313E, i5, str2, i, i2, this.f48312D.LR(anonymousClass0mf));
        AnonymousClass0uC.F(B, anonymousClass0mf, this.f48312D);
        B.B("profile_position", i3);
        B.F(MemoryDumpUploadJob.EXTRA_USER_ID, anonymousClass0mf.f9880J.getId());
        B.R();
    }

    public final void Wn(AnonymousClass0P7 anonymousClass0P7, int i, int i2) {
        AnonymousClass0NN E = AnonymousClass3Iu.m19324E(this.f48311C, "instagram_thumbnail_click", anonymousClass0P7, this.f48310B, this.f48313E, i, i2, this.f48312D.LR(anonymousClass0P7));
        AnonymousClass0uC.F(E, anonymousClass0P7, this.f48312D);
        E.R();
    }
}
