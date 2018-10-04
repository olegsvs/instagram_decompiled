package X;

import com.facebook.C0164R;

/* renamed from: X.4Ck */
public final class AnonymousClass4Ck extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4Cl f51442B;

    public AnonymousClass4Ck(AnonymousClass4Cl anonymousClass4Cl) {
        this.f51442B = anonymousClass4Cl;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 882468170);
        Object C = AnonymousClass35u.m18505C(anonymousClass0Q6, this.f51442B.getString(C0164R.string.request_error));
        AnonymousClass0IG.H(this.f51442B.getContext(), C);
        String str = this.f51442B.f51447F;
        String C2 = AnonymousClass4Cl.m23520C(this.f51442B);
        String I2 = AnonymousClass0a2.I(this.f51442B.f51453L);
        AnonymousClass33e.EDIT_PROFILE_SUBMIT_ERROR.m18380A().F("entry_point", str).F("fb_user_id", I2).F("step", "change_category").D("selected_values", AnonymousClass0db.C().G("category_id", C2)).F("error_message", C).R();
        AnonymousClass0cQ.H(this, -2037145314, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 884436633);
        super.onFinish();
        AnonymousClass4Cl.m23523F(this.f51442B, false);
        AnonymousClass0cQ.H(this, -657345606, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1743241145);
        super.onStart();
        AnonymousClass4Cl.m23523F(this.f51442B, true);
        AnonymousClass0cQ.H(this, -1706943199, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -104489158);
        AnonymousClass1Nf anonymousClass1Nf = (AnonymousClass1Nf) obj;
        int I2 = AnonymousClass0cQ.I(this, 1645490787);
        if (!(anonymousClass1Nf == null || anonymousClass1Nf.f17816C == null)) {
            anonymousClass1Nf.f17816C.D();
        }
        String str = this.f51442B.f51447F;
        String C = AnonymousClass4Cl.m23520C(this.f51442B);
        String I3 = AnonymousClass0a2.I(this.f51442B.f51453L);
        AnonymousClass33e.EDIT_PROFILE_SUBMIT.m18380A().F("entry_point", str).F("fb_user_id", I3).F("step", "change_category").D("selected_values", AnonymousClass0db.C().G("category_id", C)).R();
        this.f51442B.f51452K = true;
        AnonymousClass0OR.D(this.f51442B.f51448G, new AnonymousClass4Cj(this), 2143550266);
        AnonymousClass0cQ.H(this, 1094768143, I2);
        AnonymousClass0cQ.H(this, 1810400991, I);
    }
}
