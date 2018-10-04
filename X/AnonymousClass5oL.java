package X;

/* renamed from: X.5oL */
public final class AnonymousClass5oL implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5oM f69094B;
    /* renamed from: C */
    private AnonymousClass1Ee f69095C;
    /* renamed from: D */
    private AnonymousClass2MF f69096D;

    public AnonymousClass5oL(AnonymousClass5oM anonymousClass5oM, AnonymousClass2MF anonymousClass2MF, AnonymousClass1Ee anonymousClass1Ee) {
        this.f69094B = anonymousClass5oM;
        this.f69096D = anonymousClass2MF;
        this.f69095C = anonymousClass1Ee;
    }

    public final void run() {
        AnonymousClass1Ee anonymousClass1Ee = this.f69095C;
        if (anonymousClass1Ee != null) {
            anonymousClass1Ee.D(this.f69094B.f69097B.getActivity().D(), "feedbackDialog");
        }
        if (this.f69096D.f29526D) {
            AnonymousClass0Ci B = this.f69094B.f69097B.f69101E.B();
            B.x(false);
            AnonymousClass0Cg.f1704B.A(B);
            AnonymousClass0F4.f2058E.B(new AnonymousClass0l2());
            AnonymousClass0F4.f2058E.B(new AnonymousClass2Eb(B.getId(), this.f69094B.f69097B.f69098B.getText().toString()));
            this.f69094B.f69097B.getActivity().onBackPressed();
        }
    }
}
