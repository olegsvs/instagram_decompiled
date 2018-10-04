package X;

/* renamed from: X.58X */
public final class AnonymousClass58X extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass58c f60470B;
    /* renamed from: C */
    public final /* synthetic */ String f60471C;

    public AnonymousClass58X(AnonymousClass58c anonymousClass58c, String str) {
        this.f60470B = anonymousClass58c;
        this.f60471C = str;
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1633619300);
        this.f60470B.f60480E.B();
        AnonymousClass0cQ.H(this, 1210905103, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -333324900);
        this.f60470B.f60480E.C();
        AnonymousClass0cQ.H(this, 1711634685, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1405459160);
        AnonymousClass2MD anonymousClass2MD = (AnonymousClass2MD) obj;
        int I2 = AnonymousClass0cQ.I(this, -1539042800);
        if (anonymousClass2MD.f29520C) {
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f60470B.getActivity());
            anonymousClass0IZ.f2754D = AnonymousClass0Jr.f2946B.A().A(AnonymousClass1QC.UNKNOWN, AnonymousClass3Q8.NEW_USER, true).yQA(this.f60470B.f60482G).xQA(this.f60471C, AnonymousClass58c.m25824B(this.f60470B), this.f60470B.f60481F, this.f60470B.IS()).DD();
            anonymousClass0IZ.f2752B = AnonymousClass3Q6.f41057E;
            anonymousClass0IZ.B();
        } else {
            this.f60470B.AUA(anonymousClass2MD.f29519B, AnonymousClass22w.USERNAME);
        }
        AnonymousClass0cQ.H(this, 1442217359, I2);
        AnonymousClass0cQ.H(this, -1358882665, I);
    }
}
