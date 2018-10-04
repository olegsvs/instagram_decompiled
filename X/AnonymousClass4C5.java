package X;

/* renamed from: X.4C5 */
public final class AnonymousClass4C5 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4C7 f51323B;

    public AnonymousClass4C5(AnonymousClass4C7 anonymousClass4C7) {
        this.f51323B = anonymousClass4C7;
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -786546023);
        this.f51323B.f51326C.m19858B();
        AnonymousClass0cQ.H(this, 276391987, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 1524525364);
        this.f51323B.f51326C.m19859C();
        AnonymousClass0cQ.H(this, 13590348, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0NN F;
        int I = AnonymousClass0cQ.I(this, 1797317499);
        AnonymousClass2MD anonymousClass2MD = (AnonymousClass2MD) obj;
        int I2 = AnonymousClass0cQ.I(this, 25225679);
        boolean z = anonymousClass2MD.f29520C;
        AnonymousClass4C7 anonymousClass4C7 = this.f51323B;
        anonymousClass4C7.f51338O = z;
        anonymousClass4C7.f51326C.m19860D();
        String str;
        AnonymousClass0db G;
        String I3;
        if (z) {
            AnonymousClass4C7 anonymousClass4C72 = this.f51323B;
            AnonymousClass22w anonymousClass22w = AnonymousClass22w.USERNAME;
            anonymousClass4C72.f51331H.m19931A();
            if (anonymousClass22w == anonymousClass22w) {
                anonymousClass4C72.f51329F.m20525A();
            }
            this.f51323B.f51331H.m19931A();
            str = this.f51323B.f51327D;
            G = AnonymousClass0db.C().G("username", AnonymousClass0Nm.K(this.f51323B.f51336M));
            I3 = AnonymousClass0a2.I(this.f51323B.f51335L);
            F = AnonymousClass33b.m18361C(AnonymousClass33d.BUSINESS_SIGNUP_FETCH_DATA.m18377A(), "edit_username", str, I3).F("component", "username_validation");
            if (G != null) {
                F.D("default_values", G);
            }
        } else {
            this.f51323B.AUA(anonymousClass2MD.f29519B, AnonymousClass22w.USERNAME);
            str = this.f51323B.f51327D;
            G = AnonymousClass0db.C().G("username", AnonymousClass0Nm.K(this.f51323B.f51336M));
            I3 = AnonymousClass0a2.I(this.f51323B.f51335L);
            F = AnonymousClass33b.m18361C(AnonymousClass33d.BUSINESS_SIGNUP_FETCH_DATA_ERROR.m18377A(), "edit_username", str, I3).F("component", "username_validation");
            if (G != null) {
                F.D("default_values", G);
            }
        }
        F.R();
        AnonymousClass0cQ.H(this, -1012557402, I2);
        AnonymousClass0cQ.H(this, 226316151, I);
    }
}
