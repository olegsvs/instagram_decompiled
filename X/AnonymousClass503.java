package X;

/* renamed from: X.503 */
public final class AnonymousClass503 extends AnonymousClass0nF {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass50A f59196B;

    public AnonymousClass503(AnonymousClass50A anonymousClass50A) {
        this.f59196B = anonymousClass50A;
    }

    /* renamed from: A */
    public final void m25559A(Exception exception) {
        AnonymousClass50A.m25564E(this.f59196B);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void m25560B(Object obj) {
        AnonymousClass5ZN anonymousClass5ZN = (AnonymousClass5ZN) obj;
        if (anonymousClass5ZN == null || !((Boolean) AnonymousClass0CC.f1446I.G()).booleanValue()) {
            AnonymousClass50A.m25564E(this.f59196B);
            return;
        }
        AnonymousClass0eT.E(this.f59196B.getActivity()).Y(false);
        AnonymousClass0IL anonymousClass0IL = this.f59196B;
        AnonymousClass562.m25721D(anonymousClass0IL.f59210H, anonymousClass5ZN, anonymousClass0IL, new AnonymousClass3TP(anonymousClass0IL.getActivity()), AnonymousClass565.Phone, new AnonymousClass5Z4(anonymousClass0IL));
    }

    public final void onStart() {
        AnonymousClass0eT.E(this.f59196B.getActivity()).Y(true);
    }
}
