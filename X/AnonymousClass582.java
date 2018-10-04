package X;

import com.instagram.login.api.RegistrationFlowExtras;

/* renamed from: X.582 */
public final class AnonymousClass582 implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass584 f60395B;

    public AnonymousClass582(AnonymousClass584 anonymousClass584) {
        this.f60395B = anonymousClass584;
    }

    /* renamed from: A */
    public final void m25807A(AnonymousClass3Xp anonymousClass3Xp) {
        int I = AnonymousClass0cQ.I(this, 1319395224);
        if (AnonymousClass584.m25808B(this.f60395B).equals(anonymousClass3Xp.f42123C)) {
            if (this.f60395B.f60399D && this.f60395B.f60407L != null) {
                RegistrationFlowExtras registrationFlowExtras = this.f60395B.f60407L;
                registrationFlowExtras.f27666S = anonymousClass3Xp.f42123C;
                registrationFlowExtras.f27651D = anonymousClass3Xp.f42122B;
                AnonymousClass0IJ anonymousClass0IJ = this.f60395B;
                AnonymousClass58n.m25832B(anonymousClass0IJ, anonymousClass3Xp, anonymousClass0IJ.IS(), this.f60395B.f60407L);
                AnonymousClass3X4.F(this.f60395B.f60408M, this.f60395B.f60407L, this.f60395B.getActivity());
            }
            AnonymousClass0cQ.H(this, -2016232001, I);
            return;
        }
        AnonymousClass0Gn.C("PhoneConfirmationFragment.PhoneConfirmedSuccessfullyEventListener", AnonymousClass0IE.E("Unexpected phone number got confirmed. Expected: %s Actual: %s", new Object[]{AnonymousClass584.m25808B(this.f60395B), anonymousClass3Xp.f42123C}));
        AnonymousClass0cQ.H(this, 620349918, I);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -867711830);
        m25807A((AnonymousClass3Xp) anonymousClass0F6);
        AnonymousClass0cQ.H(this, -666533871, I);
    }
}
