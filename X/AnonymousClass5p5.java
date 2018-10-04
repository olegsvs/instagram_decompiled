package X;

import com.facebook.C0164R;

/* renamed from: X.5p5 */
public final class AnonymousClass5p5 extends AnonymousClass0Iw {
    /* renamed from: B */
    public final AnonymousClass5p6 f69190B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass5p7 f69191C;

    public AnonymousClass5p5(AnonymousClass5p7 anonymousClass5p7, AnonymousClass5p6 anonymousClass5p6) {
        this.f69191C = anonymousClass5p7;
        this.f69190B = anonymousClass5p6;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -185555857);
        AnonymousClass0IG.F(C0164R.string.people_tagging_settings_change_fail);
        this.f69191C.f69196C.B().nB = this.f69190B != AnonymousClass5p6.REVIEW_ENABLED;
        AnonymousClass0TM anonymousClass0TM = this.f69191C;
        anonymousClass0TM.setItems(AnonymousClass5p7.m28486B(anonymousClass0TM));
        AnonymousClass0cQ.H(this, -108053351, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 127624515);
        this.f69191C.f69195B = false;
        AnonymousClass0cQ.H(this, -64030082, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 669150489);
        super.onStart();
        this.f69191C.f69196C.B().nB = this.f69190B == AnonymousClass5p6.REVIEW_ENABLED;
        this.f69191C.f69195B = true;
        AnonymousClass0cQ.H(this, -1321891582, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1089452474);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, 1278059144);
        if (this.f69190B == AnonymousClass5p6.REVIEW_ENABLED) {
            AnonymousClass2Go.B("photos_of_you_adds_to_profile_automatically_switched_off");
        } else {
            AnonymousClass2Go.B("photos_of_you_adds_to_profile_automatically_switched_on");
        }
        AnonymousClass0Cg.f1704B.A(this.f69191C.f69196C.B());
        AnonymousClass0cQ.H(this, 805855961, I2);
        AnonymousClass0cQ.H(this, -1971940591, I);
    }
}
